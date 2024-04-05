package kotlin.random;

import java.io.Serializable;

public final class XorWowRandom extends Random implements Serializable {
    @Deprecated
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v */
    private int f43289v;

    /* renamed from: w */
    private int f43290w;

    /* renamed from: x */
    private int f43291x;

    /* renamed from: y */
    private int f43292y;

    /* renamed from: z */
    private int f43293z;

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f43291x = i;
        this.f43292y = i2;
        this.f43293z = i3;
        this.f43290w = i4;
        this.f43289v = i5;
        this.addend = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                nextInt();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    public int nextBits(int i) {
        return ((-i) >> 31) & (nextInt() >>> (32 - i));
    }

    public int nextInt() {
        int i = this.f43291x;
        int i2 = i ^ (i >>> 2);
        this.f43291x = this.f43292y;
        this.f43292y = this.f43293z;
        this.f43293z = this.f43290w;
        int i3 = this.f43289v;
        this.f43290w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f43289v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XorWowRandom(int r8, int r9) {
        /*
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.XorWowRandom.<init>(int, int):void");
    }
}
