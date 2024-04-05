package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.l */
public final class C19393l implements Iterator<C19392k>, C19875a {

    /* renamed from: b */
    public final short[] f43285b;

    /* renamed from: c */
    public int f43286c;

    public C19393l(short[] sArr) {
        C19383o.m32797g(sArr, "array");
        this.f43285b = sArr;
    }

    public final boolean hasNext() {
        return this.f43286c < this.f43285b.length;
    }

    public final Object next() {
        int i = this.f43286c;
        short[] sArr = this.f43285b;
        if (i < sArr.length) {
            this.f43286c = i + 1;
            return new C19392k(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.f43286c));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
