package com.google.common.base;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$PredicateFunction<T> implements C15784e<T, Boolean>, Serializable {
    private static final long serialVersionUID = 0;
    private final C15795m<T> predicate;

    public Functions$PredicateFunction() {
        throw null;
    }

    public Functions$PredicateFunction(C15795m mVar, C15785f fVar) {
        mVar.getClass();
        this.predicate = mVar;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Functions$PredicateFunction) {
            return this.predicate.equals(((Functions$PredicateFunction) obj).predicate);
        }
        return false;
    }

    public int hashCode() {
        return this.predicate.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Functions.forPredicate(");
        h.append(this.predicate);
        h.append(")");
        return h.toString();
    }

    public Boolean apply(@NullableDecl T t) {
        return Boolean.valueOf(this.predicate.apply(t));
    }
}
