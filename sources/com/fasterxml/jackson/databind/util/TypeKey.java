package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;

public class TypeKey {
    public Class<?> _class;
    public int _hashCode;
    public boolean _isTyped;
    public JavaType _type;

    public TypeKey() {
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        return cls != null ? typeKey._class == cls : this._type.equals(typeKey._type);
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public final void resetTyped(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._isTyped = true;
        this._hashCode = typedHash(cls);
    }

    public final void resetUntyped(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._isTyped = false;
        this._hashCode = untypedHash(cls);
    }

    public final String toString() {
        if (this._class != null) {
            StringBuilder h = C0072d.m201h("{class: ");
            h.append(this._class.getName());
            h.append(", typed? ");
            h.append(this._isTyped);
            h.append("}");
            return h.toString();
        }
        StringBuilder h2 = C0072d.m201h("{type: ");
        h2.append(this._type);
        h2.append(", typed? ");
        h2.append(this._isTyped);
        h2.append("}");
        return h2.toString();
    }

    public TypeKey(TypeKey typeKey) {
        this._hashCode = typeKey._hashCode;
        this._class = typeKey._class;
        this._type = typeKey._type;
        this._isTyped = typeKey._isTyped;
    }

    public static final int typedHash(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public static final int untypedHash(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public final void resetTyped(JavaType javaType) {
        this._type = javaType;
        this._class = null;
        this._isTyped = true;
        this._hashCode = typedHash(javaType);
    }

    public final void resetUntyped(JavaType javaType) {
        this._type = javaType;
        this._class = null;
        this._isTyped = false;
        this._hashCode = untypedHash(javaType);
    }

    public TypeKey(Class<?> cls, boolean z) {
        this._class = cls;
        this._type = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(cls) : untypedHash(cls);
    }

    public TypeKey(JavaType javaType, boolean z) {
        this._type = javaType;
        this._class = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(javaType) : untypedHash(javaType);
    }
}
