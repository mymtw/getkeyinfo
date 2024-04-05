package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p755lq.C19875a;

/* renamed from: kotlin.jvm.internal.g */
public final class C19375g<T> implements Iterator<T>, C19875a {

    /* renamed from: b */
    public final T[] f43242b;

    /* renamed from: c */
    public int f43243c;

    public C19375g(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        this.f43242b = tArr;
    }

    public final boolean hasNext() {
        return this.f43243c < this.f43242b.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f43242b;
            int i = this.f43243c;
            this.f43243c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43243c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
