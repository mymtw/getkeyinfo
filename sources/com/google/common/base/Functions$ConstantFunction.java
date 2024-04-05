package com.google.common.base;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$ConstantFunction<E> implements C15784e<Object, E>, Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    private final E value;

    public Functions$ConstantFunction(@NullableDecl E e) {
        this.value = e;
    }

    public E apply(@NullableDecl Object obj) {
        return this.value;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return C15791j.m25606a(this.value, ((Functions$ConstantFunction) obj).value);
        }
        return false;
    }

    public int hashCode() {
        E e = this.value;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public String toString() {
        return C0071c.m192d(C0072d.m201h("Functions.constant("), this.value, ")");
    }
}
