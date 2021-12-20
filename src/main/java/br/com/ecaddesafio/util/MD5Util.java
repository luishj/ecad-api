package br.com.ecaddesafio.util;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MD5Util {
    public static final String SECRET_KEY = "Sysmo$#_clpfcc";

    private MD5Util() {
        // Garante que a classe não seja instanciada.
    }

    /**
     * Monta um MD5 com os parametros informados
     * 
     * @param parametros
     * @return Valor no formato MD5.
     */
    public static String converterStringParaMd5(String... parametros) {
        String valor = "";

        for (String string : parametros) {
            valor += "#" + string;
        }

        return converterStringParaMd5(valor);
    }

    public static String converterCamposParaMd5(Object... parametros) {
        String valor = "";

        for (Object string : parametros) {
            valor += "#" + (string == null ? "" : string.toString());
        }

        return converterStringParaMd5(valor);
    }

    public static String converterStringParaMd5(String valor) {
        return convertToHashMd5(valor);
    }

    public static String converterStringParaMd5(String valor, Boolean utilizarSecretKey) {
        return convertToHashMd5(SECRET_KEY.concat(valor));
    }

    private static String convertToHashMd5(String valor) {

        if (valor.isEmpty()) {
            return null;
        }

        Logger logger = LoggerFactory.getLogger(MD5Util.class);

        String retornoMD5 = null;

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            BigInteger hash = new BigInteger(1, md.digest(valor.getBytes("UTF-8")));

            retornoMD5 = String.format("%1$032x", hash);

        } catch (Exception e) {
            logger.error("Não foi possível converter o valor em formato MD5: " + e.getMessage());
        }
        return retornoMD5;
    }

}
