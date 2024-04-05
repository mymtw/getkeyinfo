package p141i7;

import p003a2.C0015b;
import p223r5.C7770q;
import p267v7.C8212a;

/* renamed from: i7.a */
public final class C6996a extends C7770q {

    /* renamed from: b */
    public int f15537b;

    /* renamed from: c */
    public byte[] f15538c;

    public C6996a(int i, byte[] bArr) {
        super(true);
        int i2;
        int length = bArr.length;
        if (i == 0) {
            i2 = 1344;
        } else if (i == 1) {
            i2 = 2112;
        } else if (i == 2) {
            i2 = 2368;
        } else if (i == 3) {
            i2 = 5184;
        } else if (i == 4) {
            i2 = 12352;
        } else {
            throw new IllegalArgumentException(C0015b.m88g("unknown security category: ", i));
        }
        if (length == i2) {
            this.f15537b = i;
            this.f15538c = C8212a.m16504k(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
