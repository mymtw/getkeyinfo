package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.o */
public final class C15046o implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f33718b;

    public C15046o(zzar zzar) {
        this.f33718b = zzar.zza.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f33718b.hasNext();
    }

    public final Object next() {
        return this.f33718b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
