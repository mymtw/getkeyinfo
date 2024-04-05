package p218q8;

import java.io.Serializable;
import java.util.Arrays;
import p003a2.C0023f;

/* renamed from: q8.a */
public final class C7728a {

    /* renamed from: a */
    public int f17139a;

    /* renamed from: b */
    public Serializable f17140b = new long[32];

    /* JADX WARNING: type inference failed for: r0v4, types: [long[], java.io.Serializable] */
    /* renamed from: a */
    public final void mo20204a(long j) {
        int i = this.f17139a;
        Serializable serializable = this.f17140b;
        if (i == ((long[]) serializable).length) {
            this.f17140b = Arrays.copyOf((long[]) serializable, i * 2);
        }
        int i2 = this.f17139a;
        this.f17139a = i2 + 1;
        ((long[]) this.f17140b)[i2] = j;
    }

    /* renamed from: b */
    public final long mo20205b(int i) {
        if (i >= 0 && i < this.f17139a) {
            return ((long[]) this.f17140b)[i];
        }
        throw new IndexOutOfBoundsException(C0023f.m107h(46, "Invalid index ", i, ", size is ", this.f17139a));
    }
}
