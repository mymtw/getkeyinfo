package p030bo;

import java.lang.reflect.Array;

/* renamed from: bo.b */
public final class C14138b {

    /* renamed from: a */
    public final byte[][] f31149a;

    /* renamed from: b */
    public final int f31150b;

    /* renamed from: c */
    public final int f31151c;

    public C14138b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f31149a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f31150b = i;
        this.f31151c = i2;
    }

    /* renamed from: a */
    public final byte mo47034a(int i, int i2) {
        return this.f31149a[i2][i];
    }

    /* renamed from: b */
    public final void mo47035b(int i, int i2, int i3) {
        this.f31149a[i2][i] = (byte) i3;
    }

    /* renamed from: c */
    public final void mo47036c(int i, int i2, boolean z) {
        this.f31149a[i2][i] = z ? (byte) 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f31150b * 2 * this.f31151c) + 2);
        for (int i = 0; i < this.f31151c; i++) {
            byte[] bArr = this.f31149a[i];
            for (int i2 = 0; i2 < this.f31150b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
