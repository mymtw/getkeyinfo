package p184n0;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

/* renamed from: n0.a */
public final class C7359a extends C7361b {

    /* renamed from: a */
    public final double[] f16385a;

    /* renamed from: b */
    public C7360a[] f16386b;

    /* renamed from: n0.a$a */
    public static class C7360a {

        /* renamed from: s */
        public static double[] f16387s = new double[91];

        /* renamed from: a */
        public double[] f16388a;

        /* renamed from: b */
        public double f16389b;

        /* renamed from: c */
        public double f16390c;

        /* renamed from: d */
        public double f16391d;

        /* renamed from: e */
        public double f16392e;

        /* renamed from: f */
        public double f16393f;

        /* renamed from: g */
        public double f16394g;

        /* renamed from: h */
        public double f16395h;

        /* renamed from: i */
        public double f16396i;

        /* renamed from: j */
        public double f16397j;

        /* renamed from: k */
        public double f16398k;

        /* renamed from: l */
        public double f16399l;

        /* renamed from: m */
        public double f16400m;

        /* renamed from: n */
        public double f16401n;

        /* renamed from: o */
        public double f16402o;

        /* renamed from: p */
        public double f16403p;

        /* renamed from: q */
        public boolean f16404q;

        /* renamed from: r */
        public boolean f16405r = false;

        public C7360a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            boolean z = false;
            int i3 = 1;
            this.f16404q = i2 == 1 ? true : z;
            this.f16390c = d7;
            this.f16391d = d8;
            this.f16396i = 1.0d / (d8 - d7);
            if (3 == i2) {
                this.f16405r = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (this.f16405r || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                this.f16405r = true;
                this.f16392e = d9;
                this.f16393f = d11;
                this.f16394g = d10;
                this.f16395h = d12;
                double hypot = Math.hypot(d14, d13);
                this.f16389b = hypot;
                this.f16401n = hypot * this.f16396i;
                double d15 = this.f16391d;
                double d16 = this.f16390c;
                this.f16399l = d13 / (d15 - d16);
                this.f16400m = d14 / (d15 - d16);
                return;
            }
            this.f16388a = new double[101];
            boolean z2 = this.f16404q;
            this.f16397j = ((double) (z2 ? -1 : i3)) * d13;
            this.f16398k = d14 * ((double) (z2 ? 1 : -1));
            this.f16399l = z2 ? d11 : d9;
            this.f16400m = z2 ? d10 : d12;
            double d17 = d10 - d12;
            int i4 = 0;
            double d18 = ShadowDrawableWrapper.COS_45;
            double d19 = ShadowDrawableWrapper.COS_45;
            double d20 = ShadowDrawableWrapper.COS_45;
            while (true) {
                double[] dArr = f16387s;
                if (i4 >= 91) {
                    break;
                }
                double[] dArr2 = dArr;
                double radians = Math.toRadians((((double) i4) * 90.0d) / ((double) 90));
                double sin = Math.sin(radians) * d13;
                double cos = Math.cos(radians) * d17;
                if (i4 > 0) {
                    d18 += Math.hypot(sin - d19, cos - d20);
                    dArr2[i4] = d18;
                }
                i4++;
                d20 = cos;
                d19 = sin;
            }
            this.f16389b = d18;
            int i5 = 0;
            while (true) {
                double[] dArr3 = f16387s;
                if (i5 >= 91) {
                    break;
                }
                dArr3[i5] = dArr3[i5] / d18;
                i5++;
            }
            int i6 = 0;
            while (true) {
                double[] dArr4 = this.f16388a;
                if (i6 < dArr4.length) {
                    double length = ((double) i6) / ((double) (dArr4.length - 1));
                    double[] dArr5 = f16387s;
                    int binarySearch = Arrays.binarySearch(dArr5, length);
                    if (binarySearch >= 0) {
                        this.f16388a[i6] = (double) (binarySearch / 90);
                    } else if (binarySearch == -1) {
                        this.f16388a[i6] = 0.0d;
                    } else {
                        int i7 = -binarySearch;
                        int i8 = i7 - 2;
                        double d21 = dArr5[i8];
                        this.f16388a[i6] = (((length - d21) / (dArr5[i7 - 1] - d21)) + ((double) i8)) / ((double) 90);
                    }
                    i6++;
                } else {
                    this.f16401n = this.f16389b * this.f16396i;
                    return;
                }
            }
        }

        /* renamed from: a */
        public final void mo19653a(double d) {
            double d2 = (this.f16404q ? this.f16391d - d : d - this.f16390c) * this.f16396i;
            double d3 = ShadowDrawableWrapper.COS_45;
            if (d2 > ShadowDrawableWrapper.COS_45) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f16388a;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.f16402o = Math.sin(d5);
            this.f16403p = Math.cos(d5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7359a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f16385a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            n0.a$a[] r2 = new p184n0.C7359a.C7360a[r2]
            r0.f16386b = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L_0x0014:
            n0.a$a[] r7 = r0.f16386b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x004d
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002d
            if (r8 == r3) goto L_0x002a
            if (r8 == r10) goto L_0x0028
            if (r8 == r9) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r5 != r3) goto L_0x002a
        L_0x0028:
            r5 = r10
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r5
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            n0.a$a r22 = new n0.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0014
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n0.C7359a.<init>(int[], double[], double[][]):void");
    }

    /* renamed from: b */
    public final double mo19647b(double d) {
        C7360a[] aVarArr = this.f16386b;
        int i = 0;
        double d2 = aVarArr[0].f16390c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].f16391d) {
            d = aVarArr[aVarArr.length - 1].f16391d;
        }
        while (true) {
            C7360a[] aVarArr2 = this.f16386b;
            if (i >= aVarArr2.length) {
                return Double.NaN;
            }
            C7360a aVar = aVarArr2[i];
            if (d > aVar.f16391d) {
                i++;
            } else if (aVar.f16405r) {
                double d3 = (d - aVar.f16390c) * aVar.f16396i;
                double d4 = aVar.f16392e;
                return ((aVar.f16393f - d4) * d3) + d4;
            } else {
                aVar.mo19653a(d);
                C7360a aVar2 = this.f16386b[i];
                return (aVar2.f16397j * aVar2.f16402o) + aVar2.f16399l;
            }
        }
    }

    /* renamed from: c */
    public final void mo19648c(double d, double[] dArr) {
        C7360a[] aVarArr = this.f16386b;
        double d2 = aVarArr[0].f16390c;
        if (d >= d2) {
            d2 = d;
        }
        if (d2 > aVarArr[aVarArr.length - 1].f16391d) {
            d2 = aVarArr[aVarArr.length - 1].f16391d;
        }
        int i = 0;
        while (true) {
            C7360a[] aVarArr2 = this.f16386b;
            if (i < aVarArr2.length) {
                C7360a aVar = aVarArr2[i];
                if (d2 > aVar.f16391d) {
                    i++;
                } else if (aVar.f16405r) {
                    double d3 = aVar.f16390c;
                    double d4 = aVar.f16396i;
                    double d5 = aVar.f16392e;
                    dArr[0] = ((aVar.f16393f - d5) * (d2 - d3) * d4) + d5;
                    double d6 = aVar.f16394g;
                    dArr[1] = ((aVar.f16395h - d6) * (d2 - d3) * d4) + d6;
                    return;
                } else {
                    aVar.mo19653a(d2);
                    C7360a aVar2 = this.f16386b[i];
                    dArr[0] = (aVar2.f16397j * aVar2.f16402o) + aVar2.f16399l;
                    dArr[1] = (aVar2.f16398k * aVar2.f16403p) + aVar2.f16400m;
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo19649d(double d, float[] fArr) {
        C7360a[] aVarArr = this.f16386b;
        double d2 = aVarArr[0].f16390c;
        if (d >= d2) {
            d2 = d > aVarArr[aVarArr.length - 1].f16391d ? aVarArr[aVarArr.length - 1].f16391d : d;
        }
        int i = 0;
        while (true) {
            C7360a[] aVarArr2 = this.f16386b;
            if (i < aVarArr2.length) {
                C7360a aVar = aVarArr2[i];
                if (d2 > aVar.f16391d) {
                    i++;
                } else if (aVar.f16405r) {
                    double d3 = aVar.f16390c;
                    double d4 = aVar.f16396i;
                    double d5 = aVar.f16392e;
                    fArr[0] = (float) (((aVar.f16393f - d5) * (d2 - d3) * d4) + d5);
                    double d6 = aVar.f16394g;
                    fArr[1] = (float) (((aVar.f16395h - d6) * (d2 - d3) * d4) + d6);
                    return;
                } else {
                    aVar.mo19653a(d2);
                    C7360a aVar2 = this.f16386b[i];
                    fArr[0] = (float) ((aVar2.f16397j * aVar2.f16402o) + aVar2.f16399l);
                    fArr[1] = (float) ((aVar2.f16398k * aVar2.f16403p) + aVar2.f16400m);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final double mo19650e(double d) {
        C7360a[] aVarArr = this.f16386b;
        int i = 0;
        double d2 = aVarArr[0].f16390c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].f16391d) {
            d = aVarArr[aVarArr.length - 1].f16391d;
        }
        while (true) {
            C7360a[] aVarArr2 = this.f16386b;
            if (i >= aVarArr2.length) {
                return Double.NaN;
            }
            C7360a aVar = aVarArr2[i];
            if (d > aVar.f16391d) {
                i++;
            } else if (aVar.f16405r) {
                return aVar.f16399l;
            } else {
                aVar.mo19653a(d);
                C7360a aVar2 = this.f16386b[i];
                double d3 = aVar2.f16397j * aVar2.f16403p;
                double hypot = aVar2.f16401n / Math.hypot(d3, (-aVar2.f16398k) * aVar2.f16402o);
                if (aVar2.f16404q) {
                    d3 = -d3;
                }
                return d3 * hypot;
            }
        }
    }

    /* renamed from: f */
    public final void mo19651f(double d, double[] dArr) {
        C7360a[] aVarArr = this.f16386b;
        double d2 = aVarArr[0].f16390c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].f16391d) {
            d = aVarArr[aVarArr.length - 1].f16391d;
        }
        int i = 0;
        while (true) {
            C7360a[] aVarArr2 = this.f16386b;
            if (i < aVarArr2.length) {
                C7360a aVar = aVarArr2[i];
                if (d > aVar.f16391d) {
                    i++;
                } else if (aVar.f16405r) {
                    dArr[0] = aVar.f16399l;
                    dArr[1] = aVar.f16400m;
                    return;
                } else {
                    aVar.mo19653a(d);
                    C7360a aVar2 = this.f16386b[i];
                    double d3 = aVar2.f16397j * aVar2.f16403p;
                    double hypot = aVar2.f16401n / Math.hypot(d3, (-aVar2.f16398k) * aVar2.f16402o);
                    if (aVar2.f16404q) {
                        d3 = -d3;
                    }
                    dArr[0] = d3 * hypot;
                    C7360a aVar3 = this.f16386b[i];
                    double d4 = aVar3.f16397j * aVar3.f16403p;
                    double d5 = (-aVar3.f16398k) * aVar3.f16402o;
                    double hypot2 = aVar3.f16401n / Math.hypot(d4, d5);
                    dArr[1] = aVar3.f16404q ? (-d5) * hypot2 : d5 * hypot2;
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final double[] mo19652g() {
        return this.f16385a;
    }
}
