package com.google.common.base;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$SupplierFunction<T> implements C15784e<Object, T>, Serializable {
    private static final long serialVersionUID = 0;
    private final C15804s<T> supplier;

    public Functions$SupplierFunction() {
        throw null;
    }

    public Functions$SupplierFunction(C15804s sVar, C15785f fVar) {
        sVar.getClass();
        this.supplier = sVar;
    }

    public T apply(@NullableDecl Object obj) {
        return this.supplier.get();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Functions$SupplierFunction) {
            return this.supplier.equals(((Functions$SupplierFunction) obj).supplier);
        }
        return false;
    }

    public int hashCode() {
        return this.supplier.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Functions.forSupplier(");
        h.append(this.supplier);
        h.append(")");
        return h.toString();
    }
}
