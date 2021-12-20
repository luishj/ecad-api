package br.com.ecaddesafio.enumerator;


import java.util.HashMap;
import java.util.Map;

import br.com.ecaddesafio.util.LongUtil;

public enum ArquivoBancarioEnum {

	REMESSA(LongUtil.UM), RETORNO(LongUtil.DOIS);
	private static final Map<Long, ArquivoBancarioEnum> TYPES_BY_VALUE = new HashMap<Long, ArquivoBancarioEnum>();

    static {
        for (ArquivoBancarioEnum type : ArquivoBancarioEnum.values()) {
            TYPES_BY_VALUE.put(type.longValue, type);
        }
    }

    private final Long longValue;

    private ArquivoBancarioEnum(final Long s) {
        longValue = s;
    }

    public Long toLong() {
        return longValue;
    }

    public Boolean isEquals(Long s) {
        return longValue.longValue() == s;
    }

    @Override
    public String toString() {
        return longValue.toString();
    }

    public static ArquivoBancarioEnum forValue(Long value) {
        return TYPES_BY_VALUE.get(value);
    }
}
