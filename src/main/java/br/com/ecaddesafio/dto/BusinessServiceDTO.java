package br.com.ecaddesafio.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusinessServiceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;

    private String mensagem;
}