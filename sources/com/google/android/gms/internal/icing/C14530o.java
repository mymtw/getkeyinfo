package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.icing.o */
public abstract class C14530o implements Iterator {
    public final Object next() {
        C14526n nVar = (C14526n) this;
        int i = nVar.f32670b;
        if (i < nVar.f32671c) {
            nVar.f32670b = i + 1;
            return Byte.valueOf(nVar.f32672d.zzb(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
