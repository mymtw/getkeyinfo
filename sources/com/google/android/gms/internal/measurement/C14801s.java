package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C14801s implements Iterator<C14763p> {

    /* renamed from: b */
    public int f33076b = 0;

    /* renamed from: c */
    public final /* synthetic */ C14813t f33077c;

    public C14801s(C14813t tVar) {
        this.f33077c = tVar;
    }

    public final boolean hasNext() {
        return this.f33076b < this.f33077c.f33085b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f33076b < this.f33077c.f33085b.length()) {
            String str = this.f33077c.f33085b;
            int i = this.f33076b;
            this.f33076b = i + 1;
            return new C14813t(String.valueOf(str.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
