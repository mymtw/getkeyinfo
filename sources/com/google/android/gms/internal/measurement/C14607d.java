package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C14607d implements Iterator<C14763p> {

    /* renamed from: b */
    public final /* synthetic */ Iterator f32793b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f32794c;

    public C14607d(Iterator it, Iterator it2) {
        this.f32793b = it;
        this.f32794c = it2;
    }

    public final boolean hasNext() {
        if (this.f32793b.hasNext()) {
            return true;
        }
        return this.f32794c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f32793b.hasNext()) {
            return new C14813t(((Integer) this.f32793b.next()).toString());
        }
        if (this.f32794c.hasNext()) {
            return new C14813t((String) this.f32794c.next());
        }
        throw new NoSuchElementException();
    }
}
