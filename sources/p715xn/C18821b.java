package p715xn;

import java.util.Arrays;

/* renamed from: xn.b */
public final class C18821b {

    /* renamed from: a */
    public final CharSequence f41669a;

    /* renamed from: b */
    public final int f41670b;

    /* renamed from: c */
    public final int f41671c;

    /* renamed from: d */
    public final byte[] f41672d;

    public C18821b(int i, int i2, String str) {
        this.f41669a = str;
        this.f41671c = i;
        this.f41670b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f41672d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void mo70266a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f41670b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f41671c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        int i7 = 1;
        if ((this.f41669a.charAt(i3) & (1 << (8 - i4))) == 0) {
            i7 = 0;
        }
        this.f41672d[(i * this.f41671c) + i2] = (byte) i7;
    }

    /* renamed from: b */
    public final void mo70267b(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        mo70266a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        mo70266a(i4, i6, i3, 2);
        int i7 = i - 1;
        mo70266a(i7, i5, i3, 3);
        mo70266a(i7, i6, i3, 4);
        mo70266a(i7, i2, i3, 5);
        mo70266a(i, i5, i3, 6);
        mo70266a(i, i6, i3, 7);
        mo70266a(i, i2, i3, 8);
    }
}
