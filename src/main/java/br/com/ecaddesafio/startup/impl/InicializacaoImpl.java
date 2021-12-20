package br.com.ecaddesafio.startup.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import br.com.ecaddesafio.enumerator.ArquivoBancarioEnum;
import br.com.ecaddesafio.model.ArquivoBancario;
import br.com.ecaddesafio.service.ArquivosBancariosService;
import br.com.ecaddesafio.startup.Inicializacao;
import lombok.extern.slf4j.Slf4j;

@Component("inicializacao")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@EnableScheduling
@Configuration
@Slf4j
public class InicializacaoImpl implements Inicializacao {
	
	@Autowired
	@Lazy
	private ArquivosBancariosService arquivosBancariosService ;

	@PostConstruct
	void init() {
		arquivosBancariosService.salvarListaArquivosBancarios(this.cargaArquivoBancario());
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
