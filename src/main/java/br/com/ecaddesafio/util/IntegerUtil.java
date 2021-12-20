package br.com.ecaddesafio.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerUtil {

    private static Logger logger = LoggerFactory.getLogger(IntegerUtil.class);

    public static final Integer DOIS_NEGATIVO = -2;
    public static final Integer UM_NEGATIVO = -1;
    public static final Integer ZERO = 0;
    public static final Integer UM = 1;
    public static final Integer DOIS = 2;
    public static final Integer TRES = 3;
    public static final Integer QUATRO = 4;
    public static final Integer CINCO = 5;
    public static final Integer SEIS = 6;
    public static final Integer SETE = 7;
    public static final Integer OITO = 8;
    public static final Integer NOVE = 9;
    public static final Integer DEZ = 10;
    public static final Integer ONZE = 11;
    public static final Integer DOZE = 12;
    public static final Integer TREZE = 13;
    public static final Integer QUATORZE = 14;
    public static final Integer QUINZE = 15;
    public static final Integer DEZESSEIS = 16;
    public static final Integer DEZESSETE = 17;
    public static final Integer VINTE = 20;
    public static final Integer DEZOITO = 18;
    public static final Integer VINTE_DOIS = 22;
    public static final Integer VINTE_TRES = 23;
    public static final Integer VINTE_QUATRO = 24;
    public static final Integer VINTE_OITO = 28;
    public static final Integer VINTE_NOVE = 29;
    public static final Integer TRINTA = 30;
    public static final Integer TRINTA_UM = 31;
    public static final Integer TRINTA_DOIS = 32;
    public static final Integer TRINTA_QUATRO = 34;
    public static final Integer QUARENTA = 40;
    public static final Integer CINQUENTA_SEIS = 56;
    public static final Integer CINQUENTA_NOVE = 59;
    public static final Integer SESSENTA = 60;
    public static final Integer SESSENTA_QUATRO = 64;
    public static final Integer OITENTA = 80;
    public static final Integer CEM = 100;
    public static final Integer TREZENTOS = 300;
    public static final Integer QUINHENTOS = 500;
    public static final Integer MIL = 1000;
    public static final Integer MIL_E_VINTE_QUATRO = 1024;
    public static final Integer QUATRO_MIL_NOVENTA_SEIS = 4096;
    public static final Integer DUAS_CASAS = 2;
    public static final Integer NOVECENTOS_E_NOVENTA_E_NOVE = 999;
    public static final Integer CINCO_MIL = 5000;
    public static final Integer DEZ_MIL = 10000;
    public static final Integer CENTO_E_VINTE_MIL = 120000;
    public static final Integer SEISCENTOS = 600;
    public static final Integer SEISCENTOS_MIL = 600000;
    public static final Integer FIRST = ZERO;

    private IntegerUtil() {
        // Garante que a classe não seja instanciada.
    }

    public static boolean isNullOrZero(Integer valor) {
        return (valor == null || valor.equals(ZERO));
    }

    public static boolean isNullOrLessOrEqualsZero(Integer valor) {
        return (valor == null || valor <= ZERO);
    }

    public static boolean maiorIgual(Integer valorBase, Integer valor) {
        if (valorBase == null && valor == null) {
            return Boolean.TRUE;
        }
        if (valorBase == null || valor == null) {
            return Boolean.FALSE;
        }

        return valorBase >= valor;
    }

    public static boolean igual(Integer valorBase, Integer valor) {
        if (valorBase == null && valor == null) {
            return Boolean.TRUE;
        }
        if (valorBase == null || valor == null) {
            return Boolean.FALSE;
        }

        return valorBase.equals(valor);
    }

    public static Integer getNext(Integer value) {
        return value + UM;
    }

    public static Integer getPrior(Integer value) {
        return value - UM;
    }

    public static Boolean menorQue(Integer valor1, Integer valor2) {

        if ((valor1 == null) || (valor2 == null)) {
            return Boolean.FALSE;
        }

        return valor1.compareTo(valor2) < 0;
    }

    public static Boolean maiorQue(Integer valor1, Integer valor2) {

        if ((valor1 == null) || (valor2 == null)) {
            return Boolean.FALSE;
        }

        return valor1.compareTo(valor2) > 0;
    }

    public static Boolean maiorQueZero(Integer valor) {

        return maiorQue(valor, ZERO);
    }

    /**
     * Método retorna o maior valor.
     * 
     * @param valor1
     * @param valor2
     * @return Int
     **/

    public static Integer maior(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            return ZERO;
        }

        return valor1 > valor2 ? valor1 : valor2;
    }

    public static Integer menor(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            return ZERO;
        }

        return valor1 < valor2 ? valor1 : valor2;
    }

    public static Integer soma(Integer... valores) {

        return Arrays.stream(valores).mapToInt(Integer::intValue).sum();
    }

    public static Integer subtrai(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            return ZERO;
        }

        return valor1 - valor2;
    }

    public static Integer divide(Integer valor1, Integer valor2) {

        if (isNullOrZero(valor1) || isNullOrZero(valor2)) {
            return ZERO;
        }

        return valor1 / valor2;

    }

    public static Integer multiplica(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {

            return ZERO;
        }

        return valor1 * valor2;
    }

    public static Integer parseInt(String valor, Integer padrao) {

        if (padrao == null) {
            return ZERO;
        }

        if (isNullOrEmpty(valor)) {
            return padrao;
        }

        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            logger.info(String.format("Não foi possível efetuar o parseInt(). Usando valor padrão: %s. Exceção: %s", padrao, e));

            return padrao;
        }
    }

    private static boolean isNullOrEmpty(String valor) {
        // TODO Auto-generated method stub
        return false;
    }

    public static Integer parseInt(String valor) {

        return parseInt(valor, ZERO);
    }
}
