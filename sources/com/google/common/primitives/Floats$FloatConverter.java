package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

final class Floats$FloatConverter extends Converter<String, Float> implements Serializable {
    public static final Floats$FloatConverter INSTANCE = new Floats$FloatConverter();
    private static final long serialVersionUID = 1;

    private Floats$FloatConverter() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public String toString() {
        return "Floats.stringConverter()";
    }

    public String doBackward(Float f) {
        return f.toString();
    }

    public Float doForward(String str) {
        return Float.valueOf(str);
    }
}
