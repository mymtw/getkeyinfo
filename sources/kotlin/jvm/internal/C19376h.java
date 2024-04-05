package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19333z;

/* renamed from: kotlin.jvm.internal.h */
public final class C19376h extends C19333z {

    /* renamed from: b */
    public final long[] f43244b;

    /* renamed from: c */
    public int f43245c;

    public C19376h(long[] jArr) {
        this.f43244b = jArr;
    }

    public final boolean hasNext() {
        return this.f43245c < this.f43244b.length;
    }

    public final long nextLong() {
        try {
            long[] jArr = this.f43244b;
            int i = this.f43245c;
            this.f43245c = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43245c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
