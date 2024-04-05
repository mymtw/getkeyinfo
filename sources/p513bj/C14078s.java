package p513bj;

/* renamed from: bj.s */
public final class C14078s {

    /* renamed from: a */
    public byte[] f30989a;

    /* renamed from: b */
    public int f30990b;

    /* renamed from: c */
    public int f30991c;

    /* renamed from: d */
    public int f30992d = 0;

    public C14078s(byte[] bArr, int i, int i2) {
        this.f30989a = bArr;
        this.f30991c = i;
        this.f30990b = i2;
        mo46936a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f30990b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46936a() {
        /*
            r2 = this;
            int r0 = r2.f30991c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f30990b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f30992d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p513bj.C14075p.m21694f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14078s.mo46936a():void");
    }

    /* renamed from: b */
    public final boolean mo46937b(int i) {
        int i2 = this.f30991c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f30992d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f30990b) {
                int i6 = this.f30990b;
            } else if (mo46943h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f30990b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo46938c() {
        int i = this.f30991c;
        int i2 = this.f30992d;
        int i3 = 0;
        while (this.f30991c < this.f30990b && !mo46939d()) {
            i3++;
        }
        boolean z = this.f30991c == this.f30990b;
        this.f30991c = i;
        this.f30992d = i2;
        return !z && mo46937b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public final boolean mo46939d() {
        boolean z = (this.f30989a[this.f30991c] & (128 >> this.f30992d)) != 0;
        mo46944i();
        return z;
    }

    /* renamed from: e */
    public final int mo46940e(int i) {
        int i2;
        int i3;
        this.f30992d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f30992d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f30992d = i5;
            byte[] bArr = this.f30989a;
            int i6 = this.f30991c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo46943h(i6 + 1)) {
                i3 = 1;
            }
            this.f30991c = i6 + i3;
        }
        byte[] bArr2 = this.f30989a;
        int i7 = this.f30991c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f30992d = 0;
            if (!mo46943h(i7 + 1)) {
                i3 = 1;
            }
            this.f30991c = i7 + i3;
        }
        mo46936a();
        return i8;
    }

    /* renamed from: f */
    public final int mo46941f() {
        int i = 0;
        int i2 = 0;
        while (!mo46939d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo46940e(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    public final int mo46942g() {
        int f = mo46941f();
        return ((f + 1) / 2) * (f % 2 == 0 ? -1 : 1);
    }

    /* renamed from: h */
    public final boolean mo46943h(int i) {
        if (2 <= i && i < this.f30990b) {
            byte[] bArr = this.f30989a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: i */
    public final void mo46944i() {
        int i = 1;
        int i2 = this.f30992d + 1;
        this.f30992d = i2;
        if (i2 == 8) {
            this.f30992d = 0;
            int i3 = this.f30991c;
            if (mo46943h(i3 + 1)) {
                i = 2;
            }
            this.f30991c = i3 + i;
        }
        mo46936a();
    }

    /* renamed from: j */
    public final void mo46945j(int i) {
        int i2 = this.f30991c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f30991c = i4;
        int i5 = (i - (i3 * 8)) + this.f30992d;
        this.f30992d = i5;
        if (i5 > 7) {
            this.f30991c = i4 + 1;
            this.f30992d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f30991c) {
                mo46936a();
                return;
            } else if (mo46943h(i2)) {
                this.f30991c++;
                i2 += 2;
            }
        }
    }
}
