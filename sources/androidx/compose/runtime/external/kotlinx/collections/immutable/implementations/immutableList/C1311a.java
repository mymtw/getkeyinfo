package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a */
public abstract class C1311a<E> implements ListIterator<E>, C19875a {

    /* renamed from: b */
    public int f2865b;

    /* renamed from: c */
    public int f2866c;

    public C1311a(int i, int i2) {
        this.f2865b = i;
        this.f2866c = i2;
    }

    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.f2865b < this.f2866c;
    }

    public final boolean hasPrevious() {
        return this.f2865b > 0;
    }

    public final int nextIndex() {
        return this.f2865b;
    }

    public final int previousIndex() {
        return this.f2865b - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
