package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* renamed from: com.google.firebase.perf.util.c */
public final class C16627c<T> {

    /* renamed from: a */
    public final T f36857a;

    public C16627c() {
        this.f36857a = null;
    }

    /* renamed from: a */
    public final T mo59368a() {
        T t = this.f36857a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: b */
    public final boolean mo59369b() {
        return this.f36857a != null;
    }

    public C16627c(T t) {
        if (t != null) {
            this.f36857a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
