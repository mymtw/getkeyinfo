package p191n7;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import kotlin.jvm.internal.C19388s;
import p267v7.C8212a;

/* renamed from: n7.d */
public final class C7489d {

    /* renamed from: a */
    public int[] f16695a;

    public C7489d(byte[] bArr) {
        int i;
        if (bArr.length > 4) {
            boolean z = false;
            int i2 = C19388s.m32865i(0, bArr);
            int i3 = i2 - 1;
            int i4 = C7488c.f16694a;
            if (i3 == 0) {
                i = 1;
            } else {
                i = 0;
                for (i3 = i3 < 0 ? -i3 : i3; i3 > 0; i3 >>>= 8) {
                    i++;
                }
            }
            if (bArr.length == (i2 * i) + 4) {
                this.f16695a = new int[i2];
                for (int i5 = 0; i5 < i2; i5++) {
                    int[] iArr = this.f16695a;
                    int i6 = (i5 * i) + 4;
                    int i7 = 0;
                    for (int i8 = i - 1; i8 >= 0; i8--) {
                        i7 |= (bArr[i6 + i8] & 255) << (i8 * 8);
                    }
                    iArr[i5] = i7;
                }
                int[] iArr2 = this.f16695a;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        int i10 = iArr2[i9];
                        if (i10 < 0 || i10 >= length || zArr[i10]) {
                            break;
                        }
                        zArr[i10] = true;
                        i9++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    /* renamed from: a */
    public final byte[] mo19835a() {
        int i;
        int length = this.f16695a.length;
        int i2 = length - 1;
        int i3 = C7488c.f16694a;
        if (i2 == 0) {
            i = 1;
        } else {
            if (i2 < 0) {
                i2 = -i2;
            }
            int i4 = 0;
            while (i2 > 0) {
                i4++;
                i2 >>>= 8;
            }
            i = i4;
        }
        byte[] bArr = new byte[((length * i) + 4)];
        C19388s.m32874n(length, 0, bArr);
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = this.f16695a[i5];
            int i7 = (i5 * i) + 4;
            for (int i8 = i - 1; i8 >= 0; i8--) {
                bArr[i7 + i8] = (byte) (i6 >>> (i8 * 8));
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7489d)) {
            return false;
        }
        int[] iArr = this.f16695a;
        int[] iArr2 = ((C7489d) obj).f16695a;
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    public final int hashCode() {
        return C8212a.m16496c(this.f16695a);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("[");
        h.append(this.f16695a[0]);
        String sb = h.toString();
        for (int i = 1; i < this.f16695a.length; i++) {
            StringBuilder k = C0073e.m211k(sb, ", ");
            k.append(this.f16695a[i]);
            sb = k.toString();
        }
        return C0326j.m864i(sb, "]");
    }
}
