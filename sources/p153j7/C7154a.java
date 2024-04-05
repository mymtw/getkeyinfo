package p153j7;

import kotlin.jvm.internal.C19388s;
import p267v7.C8212a;

/* renamed from: j7.a */
public final class C7154a {

    /* renamed from: a */
    public int f15914a;

    /* renamed from: b */
    public int f15915b;

    /* renamed from: c */
    public int f15916c;

    /* renamed from: d */
    public short[][][] f15917d;

    /* renamed from: e */
    public short[][][] f15918e;

    /* renamed from: f */
    public short[][] f15919f;

    /* renamed from: g */
    public short[] f15920g;

    public C7154a(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b3 = b & 255;
        this.f15914a = b3;
        byte b4 = b2 & 255;
        this.f15915b = b4;
        this.f15916c = b4 - b3;
        this.f15917d = sArr;
        this.f15918e = sArr2;
        this.f15919f = sArr3;
        this.f15920g = sArr4;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != null && (obj instanceof C7154a)) {
            C7154a aVar = (C7154a) obj;
            if (this.f15914a == aVar.f15914a && this.f15915b == aVar.f15915b && this.f15916c == aVar.f15916c) {
                short[][][] sArr = this.f15917d;
                short[][][] sArr2 = aVar.f15917d;
                if (sArr.length != sArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int length = sArr.length - 1; length >= 0; length--) {
                        z &= C19388s.m32889v(sArr[length], sArr2[length]);
                    }
                }
                if (z) {
                    short[][][] sArr3 = this.f15918e;
                    short[][][] sArr4 = aVar.f15918e;
                    if (sArr3.length != sArr4.length) {
                        z2 = false;
                    } else {
                        z2 = true;
                        for (int length2 = sArr3.length - 1; length2 >= 0; length2--) {
                            z2 &= C19388s.m32889v(sArr3[length2], sArr4[length2]);
                        }
                    }
                    if (z2 && C19388s.m32889v(this.f15919f, aVar.f15919f) && C19388s.m32887u(this.f15920g, aVar.f15920g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f15914a * 37) + this.f15915b) * 37) + this.f15916c) * 37;
        short[][][] sArr = this.f15917d;
        int i2 = 0;
        for (int i3 = 0; i3 != sArr.length; i3++) {
            i2 = (i2 * 257) + C8212a.m16499f(sArr[i3]);
        }
        int i4 = (i2 + i) * 37;
        short[][][] sArr2 = this.f15918e;
        int i5 = 0;
        for (int i6 = 0; i6 != sArr2.length; i6++) {
            i5 = (i5 * 257) + C8212a.m16499f(sArr2[i6]);
        }
        return C8212a.m16498e(this.f15920g) + ((C8212a.m16499f(this.f15919f) + ((i5 + i4) * 37)) * 37);
    }
}
