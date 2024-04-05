package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.r */
public final class C14789r implements Iterator<C14763p> {

    /* renamed from: b */
    public int f33063b = 0;

    /* renamed from: c */
    public final /* synthetic */ C14813t f33064c;

    public C14789r(C14813t tVar) {
        this.f33064c = tVar;
    }

    public final boolean hasNext() {
        return this.f33063b < this.f33064c.f33085b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f33063b < this.f33064c.f33085b.length()) {
            int i = this.f33063b;
            this.f33063b = i + 1;
            return new C14813t(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
