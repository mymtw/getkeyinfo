package p513bj;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15781b;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: bj.r */
public final class C14077r {

    /* renamed from: a */
    public byte[] f30986a;

    /* renamed from: b */
    public int f30987b;

    /* renamed from: c */
    public int f30988c;

    public C14077r() {
        this.f30986a = C14049b0.f30918f;
    }

    /* renamed from: A */
    public final void mo46909A(int i) {
        mo46935z(this.f30987b + i);
    }

    /* renamed from: a */
    public final void mo46910a(int i) {
        byte[] bArr = this.f30986a;
        if (i > bArr.length) {
            this.f30986a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: b */
    public final void mo46911b(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f30986a, this.f30987b, bArr, i, i2);
        this.f30987b += i2;
    }

    /* renamed from: c */
    public final int mo46912c() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f30987b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: d */
    public final String mo46913d() {
        int i = this.f30988c;
        int i2 = this.f30987b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f30988c) {
            byte b = this.f30986a[i2];
            int i3 = C14049b0.f30913a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f30987b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f30986a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f30987b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f30986a;
        int i5 = this.f30987b;
        String n = C14049b0.m21641n(i5, i2 - i5, bArr2);
        this.f30987b = i2;
        int i6 = this.f30988c;
        if (i2 == i6) {
            return n;
        }
        byte[] bArr3 = this.f30986a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f30987b = i7;
            if (i7 == i6) {
                return n;
            }
        }
        int i8 = this.f30987b;
        if (bArr3[i8] == 10) {
            this.f30987b = i8 + 1;
        }
        return n;
    }

    /* renamed from: e */
    public final int mo46914e() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f30987b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: f */
    public final short mo46915f() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        this.f30987b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: g */
    public final long mo46916g() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f30987b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: h */
    public final int mo46917h() {
        int e = mo46914e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException(C0072d.m200g(29, "Top bit not zero: ", e));
    }

    /* renamed from: i */
    public final int mo46918i() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        this.f30987b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: j */
    public final long mo46919j() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f30987b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: k */
    public final String mo46920k() {
        int i = this.f30988c;
        int i2 = this.f30987b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f30988c && this.f30986a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f30986a;
        int i3 = this.f30987b;
        String n = C14049b0.m21641n(i3, i2 - i3, bArr);
        this.f30987b = i2;
        if (i2 >= this.f30988c) {
            return n;
        }
        this.f30987b = i2 + 1;
        return n;
    }

    /* renamed from: l */
    public final String mo46921l(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f30987b;
        int i3 = (i2 + i) - 1;
        String n = C14049b0.m21641n(i2, (i3 >= this.f30988c || this.f30986a[i3] != 0) ? i : i - 1, this.f30986a);
        this.f30987b += i;
        return n;
    }

    /* renamed from: m */
    public final String mo46922m(int i) {
        return mo46923n(i, C15781b.f35562c);
    }

    /* renamed from: n */
    public final String mo46923n(int i, Charset charset) {
        String str = new String(this.f30986a, this.f30987b, i, charset);
        this.f30987b += i;
        return str;
    }

    /* renamed from: o */
    public final int mo46924o() {
        return (mo46925p() << 21) | (mo46925p() << 14) | (mo46925p() << 7) | mo46925p();
    }

    /* renamed from: p */
    public final int mo46925p() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        this.f30987b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: q */
    public final long mo46926q() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f30987b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: r */
    public final int mo46927r() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f30987b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: s */
    public final int mo46928s() {
        int c = mo46912c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException(C0072d.m200g(29, "Top bit not zero: ", c));
    }

    /* renamed from: t */
    public final long mo46929t() {
        long j = mo46919j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: u */
    public final int mo46930u() {
        byte[] bArr = this.f30986a;
        int i = this.f30987b;
        int i2 = i + 1;
        this.f30987b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: v */
    public final long mo46931v() {
        int i;
        int i2;
        long j = (long) this.f30986a[this.f30987b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f30986a[this.f30987b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f30987b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: w */
    public final void mo46932w(int i) {
        byte[] bArr = this.f30986a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo46933x(i, bArr);
    }

    /* renamed from: x */
    public final void mo46933x(int i, byte[] bArr) {
        this.f30986a = bArr;
        this.f30988c = i;
        this.f30987b = 0;
    }

    /* renamed from: y */
    public final void mo46934y(int i) {
        C14075p.m21691c(i >= 0 && i <= this.f30986a.length);
        this.f30988c = i;
    }

    /* renamed from: z */
    public final void mo46935z(int i) {
        C14075p.m21691c(i >= 0 && i <= this.f30988c);
        this.f30987b = i;
    }

    public C14077r(int i) {
        this.f30986a = new byte[i];
        this.f30988c = i;
    }

    public C14077r(byte[] bArr) {
        this.f30986a = bArr;
        this.f30988c = bArr.length;
    }

    public C14077r(int i, byte[] bArr) {
        this.f30986a = bArr;
        this.f30988c = i;
    }
}
