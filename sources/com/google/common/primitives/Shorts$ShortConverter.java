package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

final class Shorts$ShortConverter extends Converter<String, Short> implements Serializable {
    public static final Shorts$ShortConverter INSTANCE = new Shorts$ShortConverter();
    private static final long serialVersionUID = 1;

    private Shorts$ShortConverter() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public String toString() {
        return "Shorts.stringConverter()";
    }

    public String doBackward(Short sh) {
        return sh.toString();
    }

    public Short doForward(String str) {
        return Short.decode(str);
    }
}
