package br.com.ecaddesafio.exception;

import java.util.HashMap;
import java.util.Map;

import br.com.ecaddesafio.util.IfNull;

public final class MapResourceUtil {

    private MapResourceUtil() {

    }

    public static Map<String, String> map(Object... objects) {

        Map<String, String> map = new HashMap<>();

        int estadoInicial = 0;

        for (Object objeto : objects) {

            map.put("{" + estadoInicial + "}", IfNull.get(objeto, "").toString());

            estadoInicial++;
        }

        return map;
    }

}
