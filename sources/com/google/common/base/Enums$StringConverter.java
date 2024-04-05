package com.google.common.base;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.io.Serializable;
import java.lang.Enum;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class Enums$StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<T> enumClass;

    public Enums$StringConverter(Class<T> cls) {
        cls.getClass();
        this.enumClass = cls;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Enums$StringConverter) {
            return this.enumClass.equals(((Enums$StringConverter) obj).enumClass);
        }
        return false;
    }

    public int hashCode() {
        return this.enumClass.hashCode();
    }

    public String toString() {
        return C0326j.m863h(this.enumClass, C0072d.m201h("Enums.stringConverter("), ".class)");
    }

    public String doBackward(T t) {
        return t.name();
    }

    public T doForward(String str) {
        return Enum.valueOf(this.enumClass, str);
    }
}
