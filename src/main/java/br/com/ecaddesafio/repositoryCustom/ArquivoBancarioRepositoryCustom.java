package br.com.ecaddesafio.repositoryCustom;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ecaddesafio.model.ArquivoBancario;

@Repository
public interface ArquivoBancarioRepositoryCustom {

	public List<ArquivoBancario> buscarListaArquivoBancario(String name, Long pesquisaTipo, String dataInicio, String dataFim);

}
