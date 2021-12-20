package br.com.ecaddesafio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.repositoryCustom.ArquivoBancarioRepositoryCustom;


@Repository
public interface ArquivoBancarioRepository extends JpaRepository<ArquivoBancario, Long> ,ArquivoBancarioRepositoryCustom{

	

}
