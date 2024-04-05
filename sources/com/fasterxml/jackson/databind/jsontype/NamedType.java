package com.fasterxml.jackson.databind.jsontype;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import java.util.Objects;
import p003a2.C0023f;

public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class<?> _class;
    public final int _hashCode;
    public String _name;

    public NamedType(Class<?> cls) {
        this(cls, (String) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        return this._class == namedType._class && Objects.equals(this._name, namedType._name);
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[NamedType, class ");
        h.append(this._class.getName());
        h.append(", name: ");
        return C0023f.m110k(h, this._name == null ? "null" : C0023f.m110k(C0072d.m201h("'"), this._name, "'"), "]");
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }
}
