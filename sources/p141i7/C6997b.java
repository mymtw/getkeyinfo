package p141i7;

import p003a2.C0015b;
import p223r5.C7770q;
import p267v7.C8212a;

/* renamed from: i7.b */
public final class C6997b extends C7770q {

    /* renamed from: b */
    public int f15539b;

    /* renamed from: c */
    public byte[] f15540c;

    public C6997b(int i, byte[] bArr) {
        super(false);
        int i2;
        int length = bArr.length;
        if (i == 0) {
            i2 = 1504;
        } else if (i == 1) {
            i2 = 2976;
        } else if (i == 2) {
            i2 = 3104;
        } else if (i == 3) {
            i2 = 14880;
        } else if (i == 4) {
            i2 = 39712;
        } else {
            throw new IllegalArgumentException(C0015b.m88g("unknown security category: ", i));
        }
        if (length == i2) {
            this.f15539b = i;
            this.f15540c = C8212a.m16504k(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
