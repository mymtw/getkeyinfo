package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.h */
public final class C19355h implements Iterator<C19354g>, C19875a {

    /* renamed from: b */
    public final int[] f43203b;

    /* renamed from: c */
    public int f43204c;

    public C19355h(int[] iArr) {
        C19383o.m32797g(iArr, "array");
        this.f43203b = iArr;
    }

    public final boolean hasNext() {
        return this.f43204c < this.f43203b.length;
    }

    public final Object next() {
        int i = this.f43204c;
        int[] iArr = this.f43203b;
        if (i < iArr.length) {
            this.f43204c = i + 1;
            return new C19354g(iArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.f43204c));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
