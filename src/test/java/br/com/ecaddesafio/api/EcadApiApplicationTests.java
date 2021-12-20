package br.com.ecaddesafio.api;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ecaddesafio.constants.MensagemService;
import br.com.ecaddesafio.dto.ArquivoBancarioDTO;
import br.com.ecaddesafio.enumerator.ArquivoBancarioEnum;
import br.com.ecaddesafio.exception.BusinessServiceException;
import br.com.ecaddesafio.exception.MensagemResources;
import br.com.ecaddesafio.exception.Resource;
import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.repository.ArquivoBancarioRepository;
import br.com.ecaddesafio.service.impl.ArquivosBancariosServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class EcadApiApplicationTests {

	@InjectMocks
	@Spy
	private ArquivosBancariosServiceImpl arquivosBancariosService;

	@Mock
	private ArquivoBancarioRepository arquivoBancarioRepository;
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Spy
	private ModelMapper modelMapper;

	@Test
	public void listarArquivosBancarioPesquisaVaziaSucesso() throws ParseException {

		when(arquivoBancarioRepository.buscarListaArquivoBancario("", 0L, "", ""))
				.thenReturn(this.cargaArquivoBancario());
		List<ArquivoBancarioDTO> retornoListar = arquivosBancariosService.listar("", 0L, "", "");
		assertTrue(retornoListar != null);
		assertTrue(retornoListar.size() > 0);

	}

	@Test
	public void listarArquivosBancarioPesquisaNomeSucesso() throws ParseException {

		when(arquivoBancarioRepository.buscarListaArquivoBancario("arquivoBancario1", 0L, "", ""))
				.thenReturn(this.cargaArquivoBancario());
		List<ArquivoBancarioDTO> retornoListar = arquivosBancariosService.listar("arquivoBancario1", 0L, "", "");
		assertTrue(retornoListar != null);
		assertTrue(retornoListar.size() > 0);
	}

	@Test
	public void listarArquivosBancarioPesquisaTipoSucesso() throws ParseException {
		when(arquivoBancarioRepository.buscarListaArquivoBancario("", 1L, "", ""))
				.thenReturn(this.cargaArquivoBancario());
		List<ArquivoBancarioDTO> retornoListar = arquivosBancariosService.listar("", 1L, "", "");
		assertTrue(retornoListar != null);
		assertTrue(retornoListar.size() > 0);

	}

	@Test
	public void listarArquivosBancarioPesquisaDataSucesso() throws ParseException {

		when(arquivoBancarioRepository.buscarListaArquivoBancario("", 0L, "2021-12-18", "2021-12-22"))
				.thenReturn(this.cargaArquivoBancario());
		List<ArquivoBancarioDTO> retornoListar = arquivosBancariosService.listar("", 0L, "2021-12-18", "2021-12-22");
		assertTrue(retornoListar != null);
		assertTrue(retornoListar.size() > 0);

	}

	@Test
	public void listarArquivosBancarioPesquisaDataInvalida() throws ParseException {

		expectedException.expectMessage(Resource.getMensagem(MensagemService.DATA_FIM_INVALIDA,null));
		expectedException.expect(BusinessServiceException.class);
		List<ArquivoBancarioDTO> retornoListar = arquivosBancariosService.listar("", 0L, "2021-12-18", "2021-12-17");


	}

	public List<ArquivoBancario> cargaArquivoBancario() {
		List<ArquivoBancario> carga = new ArrayList<>();

		ArquivoBancario arquivoBancario01 = new ArquivoBancario();
		arquivoBancario01.setNome("arquivoBancario01");
		arquivoBancario01.setQuantidadeLinha(465L);
		arquivoBancario01.setTipo(ArquivoBancarioEnum.REMESSA.toLong());
		arquivoBancario01.setValor(new BigDecimal("325.25"));
		arquivoBancario01.setData(new Date());

		carga.add(arquivoBancario01);

		ArquivoBancario arquivoBancario02 = new ArquivoBancario();
		arquivoBancario02.setNome("arquivoBancario02");
		arquivoBancario02.setQuantidadeLinha(665L);
		arquivoBancario02.setTipo(ArquivoBancarioEnum.RETORNO.toLong());
		arquivoBancario02.setValor(new BigDecimal("625.25"));
		arquivoBancario02.setData(new Date());

		carga.add(arquivoBancario02);
		return carga;
	}

}
