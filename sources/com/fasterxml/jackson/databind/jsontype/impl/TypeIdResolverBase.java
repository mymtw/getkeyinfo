package com.fasterxml.jackson.databind.jsontype.impl;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

public abstract class TypeIdResolverBase implements TypeIdResolver {
    public final JavaType _baseType;
    public final TypeFactory _typeFactory;

    public TypeIdResolverBase() {
        this((JavaType) null, (TypeFactory) null);
    }

    public String getDescForKnownTypeIds() {
        return null;
    }

    public String idFromBaseType() {
        return idFromValueAndType((Object) null, this._baseType.getRawClass());
    }

    public void init(JavaType javaType) {
    }

    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        StringBuilder h = C0072d.m201h("Sub-class ");
        h.append(getClass().getName());
        h.append(" MUST implement `typeFromId(DatabindContext,String)");
        throw new IllegalStateException(h.toString());
    }

    public TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this._baseType = javaType;
        this._typeFactory = typeFactory;
    }
}
