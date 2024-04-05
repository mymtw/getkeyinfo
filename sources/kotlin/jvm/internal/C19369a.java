package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19319l;

/* renamed from: kotlin.jvm.internal.a */
public final class C19369a extends C19319l {

    /* renamed from: b */
    public final boolean[] f43230b;

    /* renamed from: c */
    public int f43231c;

    public C19369a(boolean[] zArr) {
        this.f43230b = zArr;
    }

    /* renamed from: a */
    public final boolean mo71763a() {
        try {
            boolean[] zArr = this.f43230b;
            int i = this.f43231c;
            this.f43231c = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43231c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f43231c < this.f43230b.length;
    }
}
