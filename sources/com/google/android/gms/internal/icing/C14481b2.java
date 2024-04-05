package com.google.android.gms.internal.icing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.icing.b2 */
public final class C14481b2 implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f32619b;

    public C14481b2(C14485c2 c2Var) {
        this.f32619b = c2Var.f32620b.iterator();
    }

    public final boolean hasNext() {
        return this.f32619b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f32619b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
