package br.com.ecaddesafio.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LongUtil {

    public static final Long DOIS_NEGATIVO = -2L;
    public static final Long UM_NEGATIVO = -1L;
    public static final Long ZERO = 0L;
    public static final Long UM = 1L;
    public static final Long DOIS = 2L;
    public static final Long TRES = 3L;
    public static final Long QUATRO = 4L;
    public static final Long CINCO = 5L;
    public static final Long SEIS = 6L;
    public static final Long SETE = 7L;
    public static final Long OITO = 8L;
    public static final Long NOVE = 9L;
    public static final Long DEZ = 10L;
    public static final Long ONZE = 11L;
    public static final Long DOZE = 12L;
    public static final Long TREZE = 13L;
    public static final Long QUATORZE = 14L;
    public static final Long QUINZE = 15L;
    public static final Long DEZESSEIS = 16L;
    public static final Long DEZESSETE = 17L;
    public static final Long DEZOITO = 18L;
    public static final Long DEZENOVE = 19L;
    public static final Long VINTE = 20L;
    public static final Long VINTE_UM = 21L;
    public static final Long VINTE_DOIS = 22L;
    public static final Long VINTE_TRES = 23L;
    public static final Long VINTE_QUATRO = 24L;
    public static final Long VINTE_CINCO = 25L;
    public static final Long VINTE_SEIS = 26L;
    public static final Long VINTE_SETE = 27L;
    public static final Long VINTE_OITO = 28L;
    public static final Long VINTE_NOVE = 29L;
    public static final Long TRINTA = 30L;
    public static final Long TRINTA_UM = 31L;
    public static final Long TRINTA_DOIS = 32L;
    public static final Long TRINTA_TRES = 33L;
    public static final Long TRINTA_QUATRO = 34L;
    public static final Long TRINTA_CINCO = 35L;
    public static final Long TRINTA_SEIS = 36L;
    public static final Long TRINTA_SETE = 37L;
    public static final Long TRINTA_OITO = 38L;
    public static final Long TRINTA_NOVE = 39L;
    public static final Long QUARENTA = 40L;
    public static final Long QUARENTA_UM = 41L;
    public static final Long QUARENTA_DOIS = 42L;
    public static final Long QUARENTA_TRES = 43L;
    public static final Long QUARENTA_QUATRO = 44L;
    public static final Long QUARENTA_CINCO = 45L;
    public static final Long QUARENTA_SEIS = 46L;
    public static final Long QUARENTA_SETE = 47L;
    public static final Long QUARENTA_OITO = 48L;
    public static final Long QUARENTA_NOVE = 49L;
    public static final Long CINQUENTA = 50L;
    public static final Long CINQUENTA_UM = 51L;
    public static final Long CINQUENTA_DOIS = 52L;
    public static final Long CINQUENTA_TRES = 53L;
    public static final Long CINQUENTA_QUATRO = 54L;
    public static final Long CINQUENTA_CINCO = 55L;
    public static final Long CINQUENTA_SEIS = 56L;
    public static final Long CINQUENTA_SETE = 57L;
    public static final Long CINQUENTA_OITO = 58L;
    public static final Long CINQUENTA_NOVE = 59L;
    public static final Long SESSENTA = 60L;
    public static final Long SESSENTA_UM = 61L;
    public static final Long SESSENTA_DOIS = 62L;
    public static final Long SESSENTA_TRES = 63L;
    public static final Long SESSENTA_QUATRO = 64L;
    public static final Long SESSENTA_CINCO = 65L;
    public static final Long SESSENTA_SEIS = 66L;
    public static final Long SESSENTA_SETE = 67L;
    public static final Long SESSENTA_OITO = 68L;
    public static final Long SESSENTA_NOVE = 69L;
    public static final Long SETENTA = 70L;
    public static final Long SETENTA_UM = 71L;
    public static final Long SETENTA_DOIS = 72L;
    public static final Long SETENTA_TRES = 73L;
    public static final Long SETENTA_QUATRO = 74L;
    public static final Long SETENTA_CINCO = 75L;
    public static final Long SETENTA_SEIS = 76L;
    public static final Long SETENTA_SETE = 77L;
    public static final Long SETENTA_OITO = 78L;
    public static final Long SETENTA_NOVE = 79L;
    public static final Long OITENTA = 80L;
    public static final Long OITENTA_UM = 81L;
    public static final Long UM_SEGUNDO = 1000L;
    public static final Long CINCO_MINUTOS = 300000L;
    public static final Long CINCO_SEGUNDOS = 5000L;
    public static final Long DEZ_SEGUNDOS = 10000L;
    public static final Long UMA_HORA = 3600000L;
    public static final Long UM_MINUTO = 60000L;
    public static final Long OITENTA_NOVE = 89L;
    public static final Long NOVENTA = 90L;
    public static final Long NOVENTA_UM = 91L;
    public static final Long NOVENTA_DOIS = 92L;
    public static final Long NOVENTA_TRES = 93L;
    public static final Long NOVENTA_QUATRO = 94L;
    public static final Long NOVENTA_CINCO = 95L;
    public static final Long NOVENTA_OITO = 98L;
    public static final Long NOVENTA_NOVE = 99L;
    public static final Long CEM = 100L;
    public static final Long CENTO_UM = 101L;
    public static final Long CENTO_DOIS = 102L;
    public static final Long CENTO_OITO = 108L;
    public static final Long CENTO_VINTE = 120L;
    public static final Long CENTO_TRINTA = 130L;
    public static final Long CENTO_TRINTA_CINCO = 135L;
    public static final Long CENTO_CINQUENTA = 150L;
    public static final Long CENTO_SESSENTA = 160L;
    public static final Long NOVECENTOS_UM = 901L;
    public static final Long NOVECENTOS_NOVENTA_NOVE = 999L;
    public static final Long MIL = 1000L;
    public static final Long DUZENTOS = 200L;
    public static final Long DUZENTOS_QUATRO = 204L;
    public static final Long DUZENTOS_SEIS = 206L;
    public static final Long TREZENTOS = 300L;
    public static final Long TREZENTOS_SETENTA_SETE = 377L;
    public static final Long QUINHENTOS = 500L;
    public static final Long QUINHENTOS_OITENTA = 580L;
    public static final Long UM_MILHAO = 1000000L;
    public static final Long NOVE_MIL_E_SEISCENTOS = 9600L;
    public static final Long DEZ_MIL = 10000L;

    /*
     * select hashtext('SG')
     */
    public static final Long SEM_GRUPO = 1115886544L;
    public static final Long TRES_MIL = 3000L;
    public static final Long TRES_MIL_TREZENTOS = 3300L;

    private LongUtil() {
        // Garante que a classe não seja instanciada.
    }

    public static boolean isNullOrZero(Long valor) {
        return (valor == null || valor.equals(LongUtil.ZERO)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean isNull(Long valor) {
        return (valor == null) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean containsNull(Long... valores) {

        for (Long valor : valores) {

            if (isNull(valor)) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public static boolean isNullOrLessOrEqualsZero(Long valor) {
        return (valor == null || valor <= LongUtil.ZERO) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean igual(Long valorUm, Long valorDois) {

        if (valorUm == null && valorDois == null) {
            return Boolean.TRUE;
        }

        if (valorUm != null && valorDois != null) {
            return valorUm.equals(valorDois);
        }

        return Boolean.FALSE;
    }

    public static boolean igualZero(Long valorUm) {
        if (valorUm != null) {
            return valorUm.equals(ZERO);
        }

        return Boolean.FALSE;
    }

    public static boolean orEquals(Long valorComparar, Long... valores) {

        for (Long long1 : valores) {

            if (igual(valorComparar, long1)) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public static boolean isNumber(String parametrosProdutos) {
        if (StringUtil.isNullOrEmpty(parametrosProdutos)) {
            return Boolean.FALSE;
        }
        for (char c : parametrosProdutos.toCharArray()) {
            if (!Character.isDigit(c)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static List<Long> asLong(List<String> value) {
        try {
            List<Long> longs = new ArrayList<Long>();
            for (String strings : value) {
                longs.add(Long.valueOf(strings));
            }
            return longs;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public static Long getNumber(String stringNumber) {
        try {
            return Long.valueOf(stringNumber.replaceAll("[^0-9]", ""));
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean maior(Long valor1, Long valor2) {

        if (valor1 == null || valor2 == null) {
            return Boolean.FALSE;
        }

        return valor1 > valor2;
    }

    public static boolean maiorQueZero(Long value) {

        if (value == null) {
            return Boolean.FALSE;
        }

        return value > ZERO;
    }

    /**
     * Método verifica se um valor do tipo Long é menor em relação ao outro
     * valor.
     * 
     * @param valorBase
     * @param valor
     * @return Retorna um valor booleano.
     */
    public static boolean menor(Long valor1, Long valor2) {

        if (valor1 == null && valor2 == null) {
            return Boolean.TRUE;
        }
        if (valor1 == null || valor2 == null) {
            return Boolean.FALSE;
        }

        return valor1 < valor2;
    }

    /**
     * Método verifica se um Long está entre outros dois Longs.
     * 
     * @param valorBase
     *            é o número do meio.
     * @param valorInicial
     *            e valorFinal são os números das pontas.
     * @return Retorna um valor booleano.
     */
    public static boolean between(Long valorBase, Long valorInicial, Long valorFinal) {
        return maiorIgual(valorBase, valorInicial) && menorIgual(valorBase, valorFinal);
    }

    /**
     * Compara dois Longs verificando se um valor é maior ou igual o outro.
     * 
     * @param valorBase
     * @param valor
     * @return boolean
     */
    public static boolean maiorIgual(Long valorBase, Long valor) {
        if (valorBase == null && valor == null) {
            return Boolean.TRUE;
        }
        if (valorBase == null || valor == null) {
            return Boolean.FALSE;
        }

        return valorBase >= valor;
    }

    /**
     * Compara se o valor é maior ou igual a 0 (zero).
     * 
     * @param valor
     * @return boolean
     */
    public static boolean maiorOuIgualZero(Long valor) {

        if (valor == null) {
            return Boolean.FALSE;
        }

        return maiorIgual(valor, ZERO);
    }

    /**
     * Compara dois Longs verificando se um é menor ou igual o outro.
     * 
     * @param valorBase
     * @param valor
     * @return Retorna um boolean.
     */
    private static boolean menorIgual(Long valorBase, Long valor) {
        if (valorBase == null && valor == null) {
            return Boolean.TRUE;
        }
        if (valorBase == null || valor == null) {
            return Boolean.FALSE;
        }

        return valorBase <= valor;
    }

    /**
     * Realiza a soma de dois valores.
     * 
     * @param valor1
     * @param valor2
     * @return Retorna um Long somando os dois valores.
     */
    public static Long mais(Long valor1, Long valor2) {

        if (valor1 == null || valor2 == null) {

            String mensagem = "Não foi possível efetuar o método mais(Long valor1, Long valor2). Pois um dos valores passados é null. Usando valor padrão: {0}.";

            return ZERO;
        }

        return Long.sum(valor1, valor2);
    }

    public static Long menos(Long valor1, Long valor2) {

        if (valor1 == null || valor2 == null) {

            String mensagem = "Não foi possível efetuar o método menos(Long valor1, Long valor2). Pois um dos valores passados é null. Usando valor padrão: {0}.";

            return ZERO;
        }

        return valor1 - valor2;
    }

    public static Long divide(Long valor1, Long valor2) {

        if (isNullOrZero(valor1) || isNullOrZero(valor2)) {

            String mensagem = "Não foi possível efetuar o método divide(Long valor1, Long valor2). Pois um dos valores passados é null ou zero. Usando valor padrão: {0}.";

            return ZERO;
        }

        return Long.divideUnsigned(valor1, valor2);
    }

    public static Long multiplica(Long valor1, Long valor2) {

        if (valor1 == null || valor2 == null) {

            String mensagem = "Não foi possível efetuar o método multiplica(Long valor1, Long valor2). Pois um dos valores passados é null. Usando valor padrão: {0}.";

            return ZERO;
        }

        return valor1 * valor2;
    }

    /**
     * Tranforma uma String em um Long.
     * 
     * @param valor
     * @param padrao
     * @return Long, 0, ZERO
     * 
     */
    public static Long parseLong(String valor, Long padrao) {

        if (valor == null || padrao == null) {
            return ZERO;
        }

        try {
            return Long.parseLong(valor);
        } catch (NumberFormatException e) {

            return padrao;
        }
    }

    /**
     * Verifica se uma String é numérica.
     * 
     * @param descricao
     * @return boolean
     */
    public static boolean isNumeric(String descricao) {
        return descricao != null && descricao.matches("[0-9]*");
    }

}
