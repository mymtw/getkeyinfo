package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.f */
public final class C19353f implements Iterator<C19352e>, C19875a {

    /* renamed from: b */
    public final byte[] f43200b;

    /* renamed from: c */
    public int f43201c;

    public C19353f(byte[] bArr) {
        C19383o.m32797g(bArr, "array");
        this.f43200b = bArr;
    }

    public final boolean hasNext() {
        return this.f43201c < this.f43200b.length;
    }

    public final Object next() {
        int i = this.f43201c;
        byte[] bArr = this.f43200b;
        if (i < bArr.length) {
            this.f43201c = i + 1;
            return new C19352e(bArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.f43201c));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
