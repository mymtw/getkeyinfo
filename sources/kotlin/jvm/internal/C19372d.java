package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19328u;

/* renamed from: kotlin.jvm.internal.d */
public final class C19372d extends C19328u {

    /* renamed from: b */
    public final double[] f43236b;

    /* renamed from: c */
    public int f43237c;

    public C19372d(double[] dArr) {
        this.f43236b = dArr;
    }

    public final boolean hasNext() {
        return this.f43237c < this.f43236b.length;
    }

    public final double nextDouble() {
        try {
            double[] dArr = this.f43236b;
            int i = this.f43237c;
            this.f43237c = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43237c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
