package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.o7 */
public final class C14758o7 {

    /* renamed from: f */
    public static final C14758o7 f33020f = new C14758o7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f33021a;

    /* renamed from: b */
    public int[] f33022b;

    /* renamed from: c */
    public Object[] f33023c;

    /* renamed from: d */
    public int f33024d;

    /* renamed from: e */
    public boolean f33025e;

    public C14758o7() {
        this(0, new int[8], new Object[8], true);
    }

    public C14758o7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f33024d = -1;
        this.f33021a = i;
        this.f33022b = iArr;
        this.f33023c = objArr;
        this.f33025e = z;
    }

    /* renamed from: b */
    public static C14758o7 m23822b() {
        return new C14758o7(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo50761a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f33024d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f33021a; i6++) {
            int i7 = this.f33022b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f33023c[i6]).longValue();
                    i3 = C14613d5.m23437a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C14613d5.m23437a(i8 << 3);
                    int zzd = ((zzix) this.f33023c[i6]).zzd();
                    i5 = C14613d5.m23437a(zzd) + zzd + a + i5;
                } else if (i9 == 3) {
                    int u = C14613d5.m23442u(i8);
                    i2 = u + u;
                    i = ((C14758o7) this.f33023c[i6]).mo50761a();
                } else if (i9 == 5) {
                    ((Integer) this.f33023c[i6]).intValue();
                    i3 = C14613d5.m23437a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkh.zza());
                }
                i5 = i3 + i5;
            } else {
                long longValue = ((Long) this.f33023c[i6]).longValue();
                i2 = C14613d5.m23437a(i8 << 3);
                i = C14613d5.m23438b(longValue);
            }
            i5 = i + i2 + i5;
        }
        this.f33024d = i5;
        return i5;
    }

    /* renamed from: c */
    public final void mo50762c(int i, Object obj) {
        if (this.f33025e) {
            int i2 = this.f33021a;
            int[] iArr = this.f33022b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f33022b = Arrays.copyOf(iArr, i3);
                this.f33023c = Arrays.copyOf(this.f33023c, i3);
            }
            int[] iArr2 = this.f33022b;
            int i4 = this.f33021a;
            iArr2[i4] = i;
            this.f33023c[i4] = obj;
            this.f33021a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo50763d(C14626e5 e5Var) throws IOException {
        if (this.f33021a != 0) {
            for (int i = 0; i < this.f33021a; i++) {
                int i2 = this.f33022b[i];
                Object obj = this.f33023c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    e5Var.mo50471n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    e5Var.mo50467j(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    e5Var.mo50463f(i3, (zzix) obj);
                } else if (i4 == 3) {
                    e5Var.f32825a.mo50417m(i3, 3);
                    ((C14758o7) obj).mo50763d(e5Var);
                    e5Var.f32825a.mo50417m(i3, 4);
                } else if (i4 == 5) {
                    e5Var.mo50466i(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkh.zza());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14758o7)) {
            return false;
        }
        C14758o7 o7Var = (C14758o7) obj;
        int i = this.f33021a;
        if (i == o7Var.f33021a) {
            int[] iArr = this.f33022b;
            int[] iArr2 = o7Var.f33022b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f33023c;
                    Object[] objArr2 = o7Var.f33023c;
                    int i3 = this.f33021a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f33021a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f33022b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f33023c;
        int i7 = this.f33021a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
