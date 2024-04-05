package com.google.common.base;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public Present(T t) {
        this.reference = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public T get() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public T mo55650or(T t) {
        if (t != null) {
            return this.reference;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public T orNull() {
        return this.reference;
    }

    public String toString() {
        return C0071c.m192d(C0072d.m201h("Optional.of("), this.reference, ")");
    }

    public <V> Optional<V> transform(C15784e<? super T, V> eVar) {
        V apply = eVar.apply(this.reference);
        C15794l.m25617k(apply, "the Function passed to Optional.transform() must not return null.");
        return new Present(apply);
    }

    /* renamed from: or */
    public Optional<T> mo55648or(Optional<? extends T> optional) {
        optional.getClass();
        return this;
    }

    /* renamed from: or */
    public T mo55649or(C15804s<? extends T> sVar) {
        sVar.getClass();
        return this.reference;
    }
}
