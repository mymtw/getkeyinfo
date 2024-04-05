package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.j */
public final class C19368j implements Iterator<C19356i>, C19875a {

    /* renamed from: b */
    public final long[] f43227b;

    /* renamed from: c */
    public int f43228c;

    public C19368j(long[] jArr) {
        C19383o.m32797g(jArr, "array");
        this.f43227b = jArr;
    }

    public final boolean hasNext() {
        return this.f43228c < this.f43227b.length;
    }

    public final Object next() {
        int i = this.f43228c;
        long[] jArr = this.f43227b;
        if (i < jArr.length) {
            this.f43228c = i + 1;
            return new C19356i(jArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.f43228c));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
