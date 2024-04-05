package p223r5;

import p267v7.C8212a;

/* renamed from: r5.b0 */
public final class C7749b0 {

    /* renamed from: a */
    public byte[] f17175a;

    /* renamed from: b */
    public int f17176b;

    public C7749b0(int i, byte[] bArr) {
        this.f17175a = C8212a.m16504k(bArr);
        this.f17176b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7749b0)) {
            return false;
        }
        C7749b0 b0Var = (C7749b0) obj;
        if (b0Var.f17176b != this.f17176b) {
            return false;
        }
        return C8212a.m16500g(this.f17175a, b0Var.f17175a);
    }

    public final int hashCode() {
        return this.f17176b ^ C8212a.m16495b(this.f17175a);
    }
}
