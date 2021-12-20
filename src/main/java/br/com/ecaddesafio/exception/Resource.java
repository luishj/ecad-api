package br.com.ecaddesafio.exception;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.ecaddesafio.util.StringUtil;

public final class Resource {

    private static Logger logger = LoggerFactory.getLogger(Resource.class);

    public static String processarMensagem(String mensagem, Map<String, String> valoresSubst) {

        String mensagemClienteUsuario = mensagem;

        if (valoresSubst != null) {

            for (Map.Entry<String, String> entry : valoresSubst.entrySet()) {

                String valor = entry.getValue() == null ? "null" : entry.getValue();

                String key = entry.getKey().replace("{", StringUtil.STRING_VAZIA).replace("}", StringUtil.STRING_VAZIA)
                        .replace("[", StringUtil.STRING_VAZIA).replace("]", StringUtil.STRING_VAZIA);

                mensagemClienteUsuario = mensagemClienteUsuario.replaceAll("(\\[" + key + "\\])", "[" + key + "=" + valor + "]");

                mensagemClienteUsuario = mensagemClienteUsuario.replace("{" + key + "}", valor);
            }
        }

        return mensagemClienteUsuario;
    }

    public static String processarMensagem(String mensagem, String[] valoresSubst) {

        String mensagemClienteUsuario = StringUtil.STRING_VAZIA;

        if (mensagem != null) {
            mensagemClienteUsuario = mensagem;
        }

        if (valoresSubst != null) {

            for (int i = 0; i < valoresSubst.length; i++) {

                String valorMsg = StringUtil.STRING_VAZIA;

                if (valoresSubst[i] != null) {
                    valorMsg = valoresSubst[i];
                }

                mensagemClienteUsuario = mensagemClienteUsuario.replace("{" + i + "}", valorMsg);
            }
        }

        return mensagemClienteUsuario;
    }

    public static BusinessServiceException getBusinessServiceException(String propertyName) {

        String mensagem = ManageProperties.getPropertyUsuario(propertyName);

        logger.warn(propertyName + " - " + mensagem); 

        return new BusinessServiceException(propertyName, mensagem);
    }

    public static BusinessServiceException getBusinessServiceException(String propertyName, Map<String, String> valoresSubst) {

        String mensagem = getMensagem(ManageProperties.getPropertyUsuario(propertyName), valoresSubst);

        logger.warn(propertyName + " - " + mensagem);

        return new BusinessServiceException(propertyName, mensagem);
    }

    public static BusinessServiceException getBusinessServiceException(String propertyName, Map<String, String> valoresSubst, Throwable throwable) {

        String mensagem = getMensagem(ManageProperties.getPropertyUsuario(propertyName), valoresSubst);

        logger.warn(propertyName + " - " + mensagem + " Exception: " + throwable.getMessage());

        return new BusinessServiceException(propertyName, mensagem, throwable);
    }

    public static String getMensagem(String mensagem, Map<String, String> valoresSubst) {

        return processarMensagem(mensagem, valoresSubst);
    }



}
