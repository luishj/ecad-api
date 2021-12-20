package br.com.ecaddesafio.exception;

import br.com.ecaddesafio.dto.BusinessServiceDTO;
import lombok.Getter;

public final class BusinessServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    @Getter
    private final BusinessServiceDTO businessServiceDTO;

    public BusinessServiceException(String codigo, String mensagem) {

        super(mensagem);

        this.businessServiceDTO = new BusinessServiceDTO(codigo, mensagem);
    }

    public BusinessServiceException(String codigo, String mensagem, Throwable throwable) {

        super(mensagem, throwable);

        this.businessServiceDTO = new BusinessServiceDTO(codigo, mensagem);
    }

}
