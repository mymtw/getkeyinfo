package com.google.android.gms.internal.icing;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.icing.a2 */
public final class C14477a2 implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f32615b;

    public C14477a2(C14485c2 c2Var, int i) {
        this.f32615b = c2Var.f32620b.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f32615b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f32615b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f32615b.next();
    }

    public final int nextIndex() {
        return this.f32615b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f32615b.previous();
    }

    public final int previousIndex() {
        return this.f32615b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
