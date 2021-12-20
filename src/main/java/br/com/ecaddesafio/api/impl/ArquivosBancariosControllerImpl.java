package br.com.ecaddesafio.api.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecaddesafio.api.ArquivosBancariosController;
import br.com.ecaddesafio.dto.ArquivoBancarioDTO;
import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.service.ArquivosBancariosService;

@RestController
public class ArquivosBancariosControllerImpl  implements ArquivosBancariosController{
    @Lazy
    @Autowired
    private ArquivosBancariosService arquivosBancariosService;

    @Override
	public List<ArquivoBancarioDTO> listar( String pesquisaNome,Long pesquisaTipo,String pesquisaDataInicio, String pesquisaDataFim) throws ParseException {
		return arquivosBancariosService.listar( pesquisaNome, pesquisaTipo, pesquisaDataInicio,  pesquisaDataFim);
	}

	@Override
	public ArquivoBancario salvar(ArquivoBancario arquivoBancario) {
		return arquivosBancariosService.salvar(arquivoBancario);
	}

	@Override
	public  List<ArquivoBancario>  salvarListaArquivosBancarios(List<ArquivoBancario> arquivoBancario) {
		return arquivosBancariosService.salvarListaArquivosBancarios(arquivoBancario);
	}

}
