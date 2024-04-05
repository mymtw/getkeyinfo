package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
public final class C14797r7 implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f33070b;

    public C14797r7(C14809s7 s7Var) {
        this.f33070b = s7Var.f33082b.iterator();
    }

    public final boolean hasNext() {
        return this.f33070b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f33070b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
