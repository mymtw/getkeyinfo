package p699vn;

import java.util.Arrays;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: vn.a */
public final class C18666a implements Cloneable {

    /* renamed from: b */
    public int[] f41276b;

    /* renamed from: c */
    public int f41277c;

    public C18666a() {
        this.f41277c = 0;
        this.f41276b = new int[1];
    }

    /* renamed from: a */
    public final void mo70166a(boolean z) {
        mo70168c(this.f41277c + 1);
        if (z) {
            int[] iArr = this.f41276b;
            int i = this.f41277c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f41277c++;
    }

    /* renamed from: b */
    public final void mo70167b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        mo70168c(this.f41277c + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo70166a(z);
            i2--;
        }
    }

    /* renamed from: c */
    public final void mo70168c(int i) {
        int[] iArr = this.f41276b;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f41276b = iArr2;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C18666a(this.f41277c, (int[]) this.f41276b.clone());
    }

    /* renamed from: d */
    public final boolean mo70170d(int i) {
        return ((1 << (i & 31)) & this.f41276b[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18666a)) {
            return false;
        }
        C18666a aVar = (C18666a) obj;
        return this.f41277c == aVar.f41277c && Arrays.equals(this.f41276b, aVar.f41276b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41276b) + (this.f41277c * 31);
    }

    public final String toString() {
        int i = this.f41277c;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f41277c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo70170d(i2) ? 'X' : ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
        return sb.toString();
    }

    public C18666a(int i, int[] iArr) {
        this.f41276b = iArr;
        this.f41277c = i;
    }
}
