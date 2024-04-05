package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.q0 */
public final class C16212q0 extends C16170f2<Object> {

    /* renamed from: b */
    public boolean f36312b;

    /* renamed from: c */
    public final /* synthetic */ Object f36313c;

    public C16212q0(Object obj) {
        this.f36313c = obj;
    }

    public final boolean hasNext() {
        return !this.f36312b;
    }

    public final Object next() {
        if (!this.f36312b) {
            this.f36312b = true;
            return this.f36313c;
        }
        throw new NoSuchElementException();
    }
}
