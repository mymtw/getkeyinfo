package p644ph;

import p513bj.C14075p;

/* renamed from: ph.w */
public final class C18370w {

    /* renamed from: a */
    public final byte[] f40339a;

    /* renamed from: b */
    public final int f40340b;

    /* renamed from: c */
    public int f40341c;

    /* renamed from: d */
    public int f40342d;

    public C18370w(byte[] bArr) {
        this.f40339a = bArr;
        this.f40340b = bArr.length;
    }

    /* renamed from: a */
    public final boolean mo69903a() {
        boolean z = (((this.f40339a[this.f40341c] & 255) >> this.f40342d) & 1) == 1;
        mo69905c(1);
        return z;
    }

    /* renamed from: b */
    public final int mo69904b(int i) {
        int i2 = this.f40341c;
        int min = Math.min(i, 8 - this.f40342d);
        int i3 = i2 + 1;
        int i4 = ((this.f40339a[i2] & 255) >> this.f40342d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f40339a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo69905c(i);
        return i5;
    }

    /* renamed from: c */
    public final void mo69905c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f40341c + i3;
        this.f40341c = i4;
        int i5 = (i - (i3 * 8)) + this.f40342d;
        this.f40342d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f40341c = i4 + 1;
            this.f40342d = i5 - 8;
        }
        int i6 = this.f40341c;
        if (i6 < 0 || (i6 >= (i2 = this.f40340b) && !(i6 == i2 && this.f40342d == 0))) {
            z = false;
        }
        C14075p.m21694f(z);
    }
}
