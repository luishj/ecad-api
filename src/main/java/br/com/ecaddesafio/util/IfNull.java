package br.com.ecaddesafio.util;

public final class IfNull {

    public static <T> T get(final T value, final T valorAlternativo) {

        if (value == null) {

            return valorAlternativo;
        }

        return value;
    }
}
