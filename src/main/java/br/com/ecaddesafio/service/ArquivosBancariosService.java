package br.com.ecaddesafio.service;

import java.text.ParseException;
import java.util.List;

import br.com.ecaddesafio.dto.ArquivoBancarioDTO;
import br.com.ecaddesafio.model.ArquivoBancario;

public interface ArquivosBancariosService {

	 public abstract  List<ArquivoBancarioDTO> listar(String pesquisaNome,Long pesquisaTipo,String pesquisaDataInicio, String pesquisaDataFim) throws ParseException;
	 
	 public abstract  ArquivoBancario salvar(ArquivoBancario arquivoBancario);	 
	 
	 public abstract   List<ArquivoBancario>  salvarListaArquivosBancarios(List<ArquivoBancario> arquivoBancario);

}
