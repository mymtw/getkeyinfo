package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    public JavaType _findConverterType(TypeFactory typeFactory) {
        JavaType findSuperType = typeFactory.constructType((Type) getClass()).findSuperType(Converter.class);
        if (findSuperType != null && findSuperType.containedTypeCount() >= 2) {
            return findSuperType;
        }
        StringBuilder h = C0072d.m201h("Cannot find OUT type parameter for Converter of type ");
        h.append(getClass().getName());
        throw new IllegalStateException(h.toString());
    }

    public abstract OUT convert(IN in);

    public JavaType getInputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(0);
    }

    public JavaType getOutputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(1);
    }
}
