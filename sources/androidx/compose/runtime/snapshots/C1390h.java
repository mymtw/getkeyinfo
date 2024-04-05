package androidx.compose.runtime.snapshots;

import kotlin.collections.C19318k;

/* renamed from: androidx.compose.runtime.snapshots.h */
public final class C1390h {

    /* renamed from: a */
    public int f3031a;

    /* renamed from: b */
    public int[] f3032b = new int[16];

    /* renamed from: c */
    public int[] f3033c = new int[16];

    /* renamed from: d */
    public int[] f3034d;

    /* renamed from: e */
    public int f3035e;

    public C1390h() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f3034d = iArr;
    }

    /* renamed from: a */
    public final int mo6004a(int i) {
        int i2 = this.f3031a + 1;
        int[] iArr = this.f3032b;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            C19318k.m32604V0(iArr, iArr2, 0, 14);
            C19318k.m32604V0(this.f3033c, iArr3, 0, 14);
            this.f3032b = iArr2;
            this.f3033c = iArr3;
        }
        int i4 = this.f3031a;
        this.f3031a = i4 + 1;
        int length2 = this.f3034d.length;
        if (this.f3035e >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            C19318k.m32604V0(this.f3034d, iArr4, 0, 14);
            this.f3034d = iArr4;
        }
        int i8 = this.f3035e;
        int[] iArr5 = this.f3034d;
        this.f3035e = iArr5[i8];
        int[] iArr6 = this.f3032b;
        iArr6[i4] = i;
        this.f3033c[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i10] <= i9) {
                break;
            }
            mo6005b(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    /* renamed from: b */
    public final void mo6005b(int i, int i2) {
        int[] iArr = this.f3032b;
        int[] iArr2 = this.f3033c;
        int[] iArr3 = this.f3034d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
