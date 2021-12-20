package br.com.ecaddesafio.exception;

import java.util.ResourceBundle;
import java.util.logging.Logger;

public final class ManageProperties {

    private ManageProperties() {

    }

    public static String getPropertyUsuario(final String propertyName) {

        final ResourceBundle bundle = ResourceBundle.getBundle("mensagem");

        try {

            return bundle.getString(propertyName);

        } catch (Exception e) {

            Logger.getLogger(Resource.class.getName()).severe("Chave da propriedade: " + propertyName + " não esta configurada.");
        }

        return "";
    }

}
