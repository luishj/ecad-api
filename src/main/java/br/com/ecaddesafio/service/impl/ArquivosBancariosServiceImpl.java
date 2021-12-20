package br.com.ecaddesafio.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.reflect.TypeToken;

import br.com.ecaddesafio.dto.ArquivoBancarioDTO;
import br.com.ecaddesafio.exception.MensagemResources;
import br.com.ecaddesafio.exception.Resource;
import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.repository.ArquivoBancarioRepository;
import br.com.ecaddesafio.service.ArquivosBancariosService;
import br.com.ecaddesafio.util.DateUtil;

@RestController
public class ArquivosBancariosServiceImpl implements ArquivosBancariosService {

	@Autowired
	@Lazy
	private ArquivoBancarioRepository arquivoBancarioRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ArquivoBancarioDTO> listar(String pesquisaNome, Long pesquisaTipo, String pesquisaDataInicio,
			String pesquisaDataFim) throws ParseException {
		Date dataInicio = null;
		Date dataFim = null;

		if (!pesquisaDataInicio.isEmpty() && !pesquisaDataFim.isEmpty()) {
			dataInicio = new SimpleDateFormat("yyyy-MM-dd").parse(pesquisaDataInicio);

			dataFim = new SimpleDateFormat("yyyy-MM-dd").parse(pesquisaDataFim);
			if (DateUtil.maiorOuIgual(dataInicio, dataFim)) {
				throw Resource.getBusinessServiceException(MensagemResources.DATA_FIM_INVALIDA);
			}

		}
		
		List<ArquivoBancario> arquivoBancarios =  arquivoBancarioRepository.buscarListaArquivoBancario(pesquisaNome, pesquisaTipo, pesquisaDataInicio, pesquisaDataFim);
		List<ArquivoBancarioDTO> retorno =	modelMapper.map(arquivoBancarios,  TypeToken.getParameterized(List.class, ArquivoBancario.class).getType());
		return retorno;
	}

	@Override
	public ArquivoBancario salvar(ArquivoBancario arquivoBancario) {

		return arquivoBancarioRepository.save(arquivoBancario);
	}

	@Override
	public List<ArquivoBancario> salvarListaArquivosBancarios(List<ArquivoBancario> arquivoBancario) {
		return arquivoBancarioRepository.saveAll(arquivoBancario);
	}

}
