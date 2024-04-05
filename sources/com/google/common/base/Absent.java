package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class Absent<T> extends Optional<T> {
    public static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    public Set<T> asSet() {
        return Collections.emptySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public T mo55649or(C15804s<? extends T> sVar) {
        T t = sVar.get();
        C15794l.m25617k(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }

    @NullableDecl
    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> Optional<V> transform(C15784e<? super T, V> eVar) {
        eVar.getClass();
        return Optional.absent();
    }

    /* renamed from: or */
    public Optional<T> mo55648or(Optional<? extends T> optional) {
        optional.getClass();
        return optional;
    }

    /* renamed from: or */
    public T mo55650or(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
