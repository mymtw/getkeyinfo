package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C14698k implements Iterator<C14763p> {

    /* renamed from: b */
    public final /* synthetic */ Iterator f32900b;

    public C14698k(Iterator it) {
        this.f32900b = it;
    }

    public final boolean hasNext() {
        return this.f32900b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C14813t((String) this.f32900b.next());
    }
}
