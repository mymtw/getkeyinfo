package p691un;

/* renamed from: un.e */
public final class C18630e {

    /* renamed from: e */
    public static final C18630e f41137e = new C18630e(C18631f.f41142b, 0, 0, 0);

    /* renamed from: a */
    public final int f41138a;

    /* renamed from: b */
    public final C18631f f41139b;

    /* renamed from: c */
    public final int f41140c;

    /* renamed from: d */
    public final int f41141d;

    public C18630e(C18631f fVar, int i, int i2, int i3) {
        this.f41139b = fVar;
        this.f41138a = i;
        this.f41140c = i2;
        this.f41141d = i3;
    }

    /* renamed from: a */
    public final C18630e mo70139a(int i) {
        C18631f fVar = this.f41139b;
        int i2 = this.f41138a;
        int i3 = this.f41141d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C18628c.f41131c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            fVar.getClass();
            C18629d dVar = new C18629d(fVar, i5, i6);
            i3 += i6;
            i2 = 0;
            fVar = dVar;
        }
        int i7 = this.f41140c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        C18630e eVar = new C18630e(fVar, i2, i9, i3 + i8);
        return i9 == 2078 ? eVar.mo70140b(i + 1) : eVar;
    }

    /* renamed from: b */
    public final C18630e mo70140b(int i) {
        int i2 = this.f41140c;
        if (i2 == 0) {
            return this;
        }
        C18631f fVar = this.f41139b;
        fVar.getClass();
        return new C18630e(new C18626a(fVar, i - i2, i2), this.f41138a, 0, this.f41141d);
    }

    /* renamed from: c */
    public final boolean mo70141c(C18630e eVar) {
        int i;
        int i2 = this.f41141d + (C18628c.f41131c[this.f41138a][eVar.f41138a] >> 16);
        int i3 = eVar.f41140c;
        if (i3 > 0 && ((i = this.f41140c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= eVar.f41141d;
    }

    /* renamed from: d */
    public final C18630e mo70142d(int i, int i2) {
        int i3 = this.f41141d;
        C18631f fVar = this.f41139b;
        int i4 = this.f41138a;
        if (i != i4) {
            int i5 = C18628c.f41131c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            fVar.getClass();
            i3 += i7;
            fVar = new C18629d(fVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        fVar.getClass();
        return new C18630e(new C18629d(fVar, i2, i8), i, 0, i3 + i8);
    }

    /* renamed from: e */
    public final C18630e mo70143e(int i, int i2) {
        C18631f fVar = this.f41139b;
        int i3 = this.f41138a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = C18628c.f41133e[i3][i];
        fVar.getClass();
        return new C18630e(new C18629d(new C18629d(fVar, i5, i4), i2, 5), this.f41138a, 0, this.f41141d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C18628c.f41130b[this.f41138a], Integer.valueOf(this.f41141d), Integer.valueOf(this.f41140c)});
    }
}
