package br.com.ecaddesafio.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ArquivoBancarioDTO {

	private Long id;

	private String nome;

	private Long tipo;

	private Long quantidadeLinha;

	private BigDecimal valor;
	private Date data;

}
