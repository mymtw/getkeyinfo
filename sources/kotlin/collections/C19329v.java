package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p755lq.C19875a;

/* renamed from: kotlin.collections.v */
public final class C19329v implements ListIterator, C19875a {

    /* renamed from: b */
    public static final C19329v f43189b = new C19329v();

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return 0;
    }

    public final Object previous() {
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
