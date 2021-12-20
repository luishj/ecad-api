package br.com.ecaddesafio.util;

public final class StringUtil {

    public static final String STRING_VAZIA = "";

    public static boolean isNullOrEmpty(final String texto) {

        return IfNull.get(texto, STRING_VAZIA).equals(STRING_VAZIA);
    }

    public static boolean isNullOrEmpty(final String texto, final Boolean trim) {

        if (texto == null) {

            return true;
        }

        return IfNull.get(trim ? texto.trim() : texto, STRING_VAZIA).equals(STRING_VAZIA);
    }

}
