package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
public abstract class C14587b5 implements Iterator {
    public final Object next() {
        C14574a5 a5Var = (C14574a5) this;
        int i = a5Var.f32737b;
        if (i < a5Var.f32738c) {
            a5Var.f32737b = i + 1;
            return Byte.valueOf(a5Var.f32739d.zzb(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
