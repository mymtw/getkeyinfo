package com.google.common.reflect;

import com.google.common.base.C15794l;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.common.reflect.c */
public abstract class C16330c<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C15794l.m25612f(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
