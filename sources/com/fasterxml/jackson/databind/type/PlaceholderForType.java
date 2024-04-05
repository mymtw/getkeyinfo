package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;

public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    public JavaType _actualType;
    public final int _ordinal;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), (JavaType[]) null, 1, (Object) null, (Object) null, false);
        this._ordinal = i;
    }

    private <T> T _unsupported() {
        StringBuilder h = C0072d.m201h("Operation should not be attempted on ");
        h.append(getClass().getName());
        throw new UnsupportedOperationException(h.toString());
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return (JavaType) _unsupported();
    }

    public JavaType actualType() {
        return this._actualType;
    }

    public String buildCanonicalName() {
        return toString();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('$');
        sb.append(this._ordinal + 1);
        return sb;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        return getErasedSignature(sb);
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) _unsupported();
    }

    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    public JavaType withContentType(JavaType javaType) {
        return (JavaType) _unsupported();
    }

    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    public JavaType withStaticTyping() {
        return (JavaType) _unsupported();
    }

    public JavaType withTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    public JavaType withValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }
}
