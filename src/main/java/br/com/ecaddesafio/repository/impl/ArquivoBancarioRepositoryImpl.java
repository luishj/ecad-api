package br.com.ecaddesafio.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.repositoryCustom.ArquivoBancarioRepositoryCustom;
import br.com.ecaddesafio.util.DateUtil;
import br.com.ecaddesafio.util.LongUtil;

@Repository
public class ArquivoBancarioRepositoryImpl implements ArquivoBancarioRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<ArquivoBancario> buscarListaArquivoBancario(String name, Long pesquisaTipo, String dataInicio,
			String dataFim) {
		StringBuilder sb = new StringBuilder();

		sb.append("SELECT * FROM ArquivoBancario u WHERE u.nome LIKE  :name ");

		if (!LongUtil.isNullOrZero(pesquisaTipo)) {
			sb.append("  and u.tipo =  " + pesquisaTipo);
		}
		if (DateUtil.isDate(dataInicio) && DateUtil.isDate(dataFim)) {
			sb.append("  and u.data between '" + dataInicio + "' and '" + dataFim +"'");

		}

		Query query = entityManager.createNativeQuery(sb.toString(),ArquivoBancario.class);
		query.setParameter("name", "%" + name + "%");
	
		return query.getResultList();
	};

}
