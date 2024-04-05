package p699vn;

import java.util.Arrays;

/* renamed from: vn.b */
public final class C18667b implements Cloneable {

    /* renamed from: b */
    public final int f41278b;

    /* renamed from: c */
    public final int f41279c;

    /* renamed from: d */
    public final int f41280d;

    /* renamed from: e */
    public final int[] f41281e;

    public C18667b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f41278b = i;
        this.f41279c = i2;
        int i3 = (i + 31) / 32;
        this.f41280d = i3;
        this.f41281e = new int[(i3 * i2)];
    }

    /* renamed from: a */
    public final boolean mo70174a(int i, int i2) {
        return ((this.f41281e[(i / 32) + (i2 * this.f41280d)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public final void mo70175b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f41280d);
        int[] iArr = this.f41281e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public final void mo70176c(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f41279c || i5 > this.f41278b) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f41280d * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f41281e;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C18667b(this.f41278b, this.f41279c, (int[]) this.f41281e.clone(), this.f41280d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18667b)) {
            return false;
        }
        C18667b bVar = (C18667b) obj;
        return this.f41278b == bVar.f41278b && this.f41279c == bVar.f41279c && this.f41280d == bVar.f41280d && Arrays.equals(this.f41281e, bVar.f41281e);
    }

    public final int hashCode() {
        int i = this.f41278b;
        return Arrays.hashCode(this.f41281e) + (((((((i * 31) + i) * 31) + this.f41279c) * 31) + this.f41280d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f41278b + 1) * this.f41279c);
        for (int i = 0; i < this.f41279c; i++) {
            for (int i2 = 0; i2 < this.f41278b; i2++) {
                sb.append(mo70174a(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public C18667b(int i, int i2, int[] iArr, int i3) {
        this.f41278b = i;
        this.f41279c = i2;
        this.f41280d = i3;
        this.f41281e = iArr;
    }
}
