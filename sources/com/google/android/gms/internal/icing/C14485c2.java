package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.icing.c2 */
public final class C14485c2 extends AbstractList<String> implements RandomAccess, C14527n0 {

    /* renamed from: b */
    public final C14527n0 f32620b;

    public C14485c2(C14527n0 n0Var) {
        this.f32620b = n0Var;
    }

    /* renamed from: M */
    public final Object mo49747M(int i) {
        return this.f32620b.mo49747M(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C14523m0) this.f32620b).get(i);
    }

    public final Iterator<String> iterator() {
        return new C14481b2(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C14477a2(this, i);
    }

    public final int size() {
        return this.f32620b.size();
    }

    /* renamed from: u */
    public final void mo49752u(zzcf zzcf) {
        throw new UnsupportedOperationException();
    }

    public final List<?> zzh() {
        return this.f32620b.zzh();
    }

    public final C14527n0 zzi() {
        return this;
    }
}
