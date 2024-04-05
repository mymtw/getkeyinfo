package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveType extends TypeBase {
    private static final long serialVersionUID = 1;
    public JavaType _referencedType;

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, (JavaType) null, (JavaType[]) null, 0, (Object) null, (Object) null, false);
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return this;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public TypeBindings getBindings() {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getBindings() : super.getBindings();
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getErasedSignature(sb) : sb;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        JavaType javaType = this._referencedType;
        if (javaType != null) {
            return javaType.getErasedSignature(sb);
        }
        sb.append("?");
        return sb;
    }

    public JavaType getSelfReferencedType() {
        return this._referencedType;
    }

    public JavaType getSuperClass() {
        JavaType javaType = this._referencedType;
        return javaType != null ? javaType.getSuperClass() : super.getSuperClass();
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public void setReference(JavaType javaType) {
        if (this._referencedType == null) {
            this._referencedType = javaType;
            return;
        }
        StringBuilder h = C0072d.m201h("Trying to re-set self reference; old value = ");
        h.append(this._referencedType);
        h.append(", new = ");
        h.append(javaType);
        throw new IllegalStateException(h.toString());
    }

    public String toString() {
        StringBuilder g = C0069a.m176g(40, "[recursive type; ");
        JavaType javaType = this._referencedType;
        if (javaType == null) {
            g.append("UNRESOLVED");
        } else {
            g.append(javaType.getRawClass().getName());
        }
        return g.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        return this;
    }

    public JavaType withContentTypeHandler(Object obj) {
        return this;
    }

    public JavaType withContentValueHandler(Object obj) {
        return this;
    }

    public JavaType withStaticTyping() {
        return this;
    }

    public JavaType withTypeHandler(Object obj) {
        return this;
    }

    public JavaType withValueHandler(Object obj) {
        return this;
    }
}
