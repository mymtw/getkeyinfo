package p191n7;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.material.badge.BadgeDrawable;
import p003a2.C0023f;

/* renamed from: n7.e */
public final class C7490e {

    /* renamed from: a */
    public C7487b f16696a;

    /* renamed from: b */
    public int f16697b;

    /* renamed from: c */
    public int[] f16698c;

    public C7490e(C7487b bVar, int i) {
        this.f16696a = bVar;
        this.f16697b = i;
        int[] iArr = new int[(i + 1)];
        this.f16698c = iArr;
        iArr[i] = 1;
    }

    public C7490e(C7487b bVar, byte[] bArr) {
        this.f16696a = bVar;
        int i = 8;
        int i2 = 1;
        while (bVar.f16692a > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.f16698c = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f16698c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.f16698c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.f16696a.mo19831c(this.f16698c[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    mo19845g();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    /* renamed from: d */
    public static int m14424d(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* renamed from: a */
    public final int mo19839a(int i) {
        if (i < 0 || i > this.f16697b) {
            return 0;
        }
        return this.f16698c[i];
    }

    /* renamed from: b */
    public final int[] mo19840b(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            C7487b bVar = this.f16696a;
            int i = iArr3[length];
            int i2 = iArr[length];
            bVar.getClass();
            iArr3[length] = i ^ i2;
        }
        return iArr3;
    }

    /* renamed from: c */
    public final int[] mo19841c(int i, int[] iArr) {
        int d = m14424d(iArr);
        if (d == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[(d + 1)];
        while (d >= 0) {
            iArr3[d] = this.f16696a.mo19830b(iArr[d], i);
            d--;
        }
        return iArr3;
    }

    /* renamed from: e */
    public final byte[] mo19842e() {
        int i = 8;
        int i2 = 1;
        while (this.f16696a.f16692a > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f16698c.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16698c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f16698c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x003c
            boolean r1 = r8 instanceof p191n7.C7490e
            if (r1 != 0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            n7.e r8 = (p191n7.C7490e) r8
            n7.b r1 = r7.f16696a
            n7.b r2 = r8.f16696a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            int r1 = r7.f16697b
            int r2 = r8.f16697b
            if (r1 != r2) goto L_0x003c
            int[] r1 = r7.f16698c
            int[] r8 = r8.f16698c
            int r2 = m14424d(r1)
            int r3 = m14424d(r8)
            r4 = 1
            if (r2 == r3) goto L_0x002b
        L_0x0029:
            r8 = r0
            goto L_0x0039
        L_0x002b:
            r3 = r0
        L_0x002c:
            if (r3 > r2) goto L_0x0038
            r5 = r1[r3]
            r6 = r8[r3]
            if (r5 == r6) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0038:
            r8 = r4
        L_0x0039:
            if (r8 == 0) goto L_0x003c
            return r4
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n7.C7490e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C7490e mo19844f(int i) {
        if (this.f16696a.mo19831c(i)) {
            return new C7490e(this.f16696a, mo19841c(i, this.f16698c));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: g */
    public final void mo19845g() {
        int length = this.f16698c.length;
        do {
            this.f16697b = length - 1;
            length = this.f16697b;
            if (length < 0 || this.f16698c[length] != 0) {
            }
            this.f16697b = length - 1;
            length = this.f16697b;
            return;
        } while (this.f16698c[length] != 0);
    }

    public final int hashCode() {
        int i = this.f16696a.f16693b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f16698c;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        StringBuilder h = C0072d.m201h(" Polynomial over ");
        h.append(this.f16696a.toString());
        h.append(": \n");
        String sb2 = h.toString();
        for (int i = 0; i < this.f16698c.length; i++) {
            StringBuilder h2 = C0072d.m201h(sb2);
            C7487b bVar = this.f16696a;
            int i2 = this.f16698c[i];
            String str2 = "";
            for (int i3 = 0; i3 < bVar.f16692a; i3++) {
                if ((((byte) i2) & 1) == 0) {
                    sb = new StringBuilder();
                    str = "0";
                } else {
                    sb = new StringBuilder();
                    str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                }
                str2 = C0023f.m110k(sb, str, str2);
                i2 >>>= 1;
            }
            h2.append(str2);
            h2.append("Y^");
            h2.append(i);
            h2.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
            sb2 = h2.toString();
        }
        return C0326j.m864i(sb2, ";");
    }

    public C7490e(C7487b bVar, int[] iArr) {
        int[] iArr2;
        this.f16696a = bVar;
        int d = m14424d(iArr);
        if (d == -1) {
            iArr2 = new int[1];
        } else {
            int i = d + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.f16698c = iArr2;
        mo19845g();
    }

    public C7490e(C7490e eVar) {
        this.f16696a = eVar.f16696a;
        this.f16697b = eVar.f16697b;
        int[] iArr = eVar.f16698c;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f16698c = iArr2;
    }
}
