package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.q7 */
public final class C14784q7 implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f33060b;

    public C14784q7(C14809s7 s7Var, int i) {
        this.f33060b = s7Var.f33082b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f33060b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f33060b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f33060b.next();
    }

    public final int nextIndex() {
        return this.f33060b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f33060b.previous();
    }

    public final int previousIndex() {
        return this.f33060b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
