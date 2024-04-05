package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.s7 */
public final class C14809s7 extends AbstractList<String> implements RandomAccess, C14614d6 {

    /* renamed from: b */
    public final C14614d6 f33082b;

    public C14809s7(C14614d6 d6Var) {
        this.f33082b = d6Var;
    }

    /* renamed from: Q */
    public final void mo50423Q(zzix zzix) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C14601c6) this.f33082b).get(i);
    }

    public final Iterator<String> iterator() {
        return new C14797r7(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C14784q7(this, i);
    }

    public final int size() {
        return this.f33082b.size();
    }

    /* renamed from: x */
    public final Object mo50432x(int i) {
        return this.f33082b.mo50432x(i);
    }

    public final C14614d6 zze() {
        return this;
    }

    public final List<?> zzh() {
        return this.f33082b.zzh();
    }
}
