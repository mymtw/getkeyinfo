package androidx.compose.p015ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
public final class Rgb extends C1505c {

    /* renamed from: p */
    public static final C19857l<Double, Double> f3245p = Rgb$Companion$DoubleIdentity$1.INSTANCE;

    /* renamed from: d */
    public final C1512i f3246d;

    /* renamed from: e */
    public final float f3247e;

    /* renamed from: f */
    public final float f3248f;

    /* renamed from: g */
    public final C1511h f3249g;

    /* renamed from: h */
    public final float[] f3250h;

    /* renamed from: i */
    public final float[] f3251i;

    /* renamed from: j */
    public final float[] f3252j;

    /* renamed from: k */
    public final C19857l<Double, Double> f3253k;

    /* renamed from: l */
    public final C19857l<Double, Double> f3254l;

    /* renamed from: m */
    public final C19857l<Double, Double> f3255m;

    /* renamed from: n */
    public final C19857l<Double, Double> f3256n;

    /* renamed from: o */
    public final boolean f3257o;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$a */
    public static final class C1501a {
        /* renamed from: a */
        public static float m3213a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        /* renamed from: b */
        public static boolean m3214b(double d, C19857l lVar, C19857l lVar2) {
            return Math.abs(((Number) lVar.invoke(Double.valueOf(d))).doubleValue() - ((Number) lVar2.invoke(Double.valueOf(d))).doubleValue()) <= 0.001d;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r12, float[] r13, androidx.compose.p015ui.graphics.colorspace.C1512i r14, final androidx.compose.p015ui.graphics.colorspace.C1511h r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r9.f3283f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            if (r0 == 0) goto L_0x0021
            double r5 = r9.f3284g
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0021
            androidx.compose.ui.graphics.colorspace.Rgb$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r0.<init>(r15)
            goto L_0x0026
        L_0x0021:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r0.<init>(r15)
        L_0x0026:
            r5 = r0
            double r6 = r9.f3283f
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            r0 = r1
            goto L_0x0030
        L_0x002f:
            r0 = r4
        L_0x0030:
            if (r0 == 0) goto L_0x0042
            double r6 = r9.f3284g
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            if (r1 == 0) goto L_0x0042
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r0.<init>(r15)
            goto L_0x0047
        L_0x0042:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r0.<init>(r15)
        L_0x0047:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.i, androidx.compose.ui.graphics.colorspace.h, int):void");
    }

    /* renamed from: a */
    public final float[] mo6293a(float[] fArr) {
        C19383o.m32797g(fArr, "v");
        C19543e0.m33312e0(this.f3252j, fArr);
        fArr[0] = (float) this.f3254l.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f3254l.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f3254l.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        return fArr;
    }

    /* renamed from: b */
    public final float mo6294b(int i) {
        return this.f3248f;
    }

    /* renamed from: c */
    public final float mo6295c(int i) {
        return this.f3247e;
    }

    /* renamed from: d */
    public final boolean mo6296d() {
        return this.f3257o;
    }

    /* renamed from: e */
    public final float[] mo6297e(float[] fArr) {
        fArr[0] = (float) this.f3256n.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f3256n.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f3256n.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        C19543e0.m33312e0(this.f3251i, fArr);
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(Rgb.class), C19386q.m32807a(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f3247e, this.f3247e) != 0 || Float.compare(rgb.f3248f, this.f3248f) != 0 || !C19383o.m32792b(this.f3246d, rgb.f3246d) || !Arrays.equals(this.f3250h, rgb.f3250h)) {
            return false;
        }
        C1511h hVar = this.f3249g;
        if (hVar != null) {
            return C19383o.m32792b(hVar, rgb.f3249g);
        }
        if (rgb.f3249g == null) {
            return true;
        }
        if (!C19383o.m32792b(this.f3253k, rgb.f3253k)) {
            return false;
        }
        return C19383o.m32792b(this.f3255m, rgb.f3255m);
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f3250h) + ((this.f3246d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f3247e;
        boolean z = true;
        int i = 0;
        int floatToIntBits = (hashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f3248f;
        if (f2 != 0.0f) {
            z = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z ? Float.floatToIntBits(f2) : 0)) * 31;
        C1511h hVar = this.f3249g;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        int i2 = floatToIntBits2 + i;
        if (this.f3249g != null) {
            return i2;
        }
        return this.f3255m.hashCode() + ((this.f3253k.hashCode() + (i2 * 31)) * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r26, float[] r27, androidx.compose.p015ui.graphics.colorspace.C1512i r28, float[] r29, p753kq.C19857l<? super java.lang.Double, java.lang.Double> r30, p753kq.C19857l<? super java.lang.Double, java.lang.Double> r31, float r32, float r33, androidx.compose.p015ui.graphics.colorspace.C1511h r34, int r35) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r35
            java.lang.String r10 = "name"
            kotlin.jvm.internal.C19383o.m32797g(r1, r10)
            java.lang.String r10 = "primaries"
            kotlin.jvm.internal.C19383o.m32797g(r2, r10)
            java.lang.String r10 = "oetf"
            kotlin.jvm.internal.C19383o.m32797g(r5, r10)
            java.lang.String r10 = "eotf"
            kotlin.jvm.internal.C19383o.m32797g(r6, r10)
            long r10 = androidx.compose.p015ui.graphics.colorspace.C1504b.f3260a
            r0.<init>(r9, r10, r1)
            r0.f3246d = r3
            r0.f3247e = r7
            r0.f3248f = r8
            r1 = r34
            r0.f3249g = r1
            r0.f3253k = r5
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r1 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r1.<init>(r0)
            r0.f3254l = r1
            r0.f3255m = r6
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r1 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r1.<init>(r0)
            r0.f3256n = r1
            int r1 = r2.length
            r10 = 6
            r11 = 9
            if (r1 == r10) goto L_0x005b
            int r1 = r2.length
            if (r1 != r11) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x026c
            float[] r1 = new float[r10]
            int r10 = r2.length
            r12 = 3
            r13 = 2
            r14 = 1
            r16 = 4
            r15 = 0
            if (r10 != r11) goto L_0x00a9
            r10 = r2[r15]
            r17 = r2[r14]
            float r18 = r10 + r17
            r19 = r2[r13]
            float r18 = r18 + r19
            float r10 = r10 / r18
            r1[r15] = r10
            float r17 = r17 / r18
            r1[r14] = r17
            r10 = r2[r12]
            r17 = r2[r16]
            float r18 = r10 + r17
            r19 = 5
            r19 = r2[r19]
            float r18 = r18 + r19
            float r10 = r10 / r18
            r1[r13] = r10
            float r17 = r17 / r18
            r1[r12] = r17
            r10 = 6
            r10 = r2[r10]
            r17 = 7
            r18 = r2[r17]
            float r17 = r10 + r18
            r19 = 8
            r2 = r2[r19]
            float r17 = r17 + r2
            float r10 = r10 / r17
            r1[r16] = r10
            float r18 = r18 / r17
            r2 = 5
            r1[r2] = r18
            goto L_0x00ad
        L_0x00a9:
            r10 = 6
            java.lang.System.arraycopy(r2, r15, r1, r15, r10)
        L_0x00ad:
            r0.f3250h = r1
            if (r4 != 0) goto L_0x013e
            r4 = r1[r15]
            r10 = r1[r14]
            r13 = r1[r13]
            r12 = r1[r12]
            r15 = r1[r16]
            r17 = 5
            r17 = r1[r17]
            float r11 = r3.f3285a
            float r2 = r3.f3286b
            float r6 = (float) r14
            float r19 = r6 - r4
            float r19 = r19 / r10
            float r20 = r6 - r13
            float r20 = r20 / r12
            float r21 = r6 - r15
            float r21 = r21 / r17
            float r6 = r6 - r11
            float r6 = r6 / r2
            float r22 = r4 / r10
            float r23 = r13 / r12
            float r24 = r15 / r17
            float r11 = r11 / r2
            float r6 = r6 - r19
            float r23 = r23 - r22
            float r6 = r6 * r23
            float r11 = r11 - r22
            float r20 = r20 - r19
            float r2 = r11 * r20
            float r6 = r6 - r2
            float r21 = r21 - r19
            float r21 = r21 * r23
            float r24 = r24 - r22
            float r20 = r20 * r24
            float r21 = r21 - r20
            float r6 = r6 / r21
            float r24 = r24 * r6
            float r11 = r11 - r24
            float r11 = r11 / r23
            r2 = 1065353216(0x3f800000, float:1.0)
            float r19 = r2 - r11
            float r19 = r19 - r6
            float r20 = r19 / r10
            float r21 = r11 / r12
            float r22 = r6 / r17
            r2 = 9
            float[] r2 = new float[r2]
            float r18 = r20 * r4
            r23 = 0
            r2[r23] = r18
            r2[r14] = r19
            r18 = 1065353216(0x3f800000, float:1.0)
            float r4 = r18 - r4
            float r4 = r4 - r10
            float r4 = r4 * r20
            r10 = 2
            r2[r10] = r4
            float r4 = r21 * r13
            r10 = 3
            r2[r10] = r4
            r2[r16] = r11
            float r4 = r18 - r13
            float r4 = r4 - r12
            float r4 = r4 * r21
            r10 = 5
            r2[r10] = r4
            float r4 = r22 * r15
            r10 = 6
            r2[r10] = r4
            r4 = 7
            r2[r4] = r6
            float r4 = r18 - r15
            float r4 = r4 - r17
            float r4 = r4 * r22
            r6 = 8
            r2[r6] = r4
            r0.f3251i = r2
            goto L_0x0145
        L_0x013e:
            int r2 = r4.length
            r6 = 9
            if (r2 != r6) goto L_0x0258
            r0.f3251i = r4
        L_0x0145:
            float[] r2 = r0.f3251i
            float[] r2 = kotlinx.coroutines.C19543e0.m33305X(r2)
            r0.f3252j = r2
            float r2 = androidx.compose.p015ui.graphics.colorspace.Rgb.C1501a.m3213a(r1)
            float[] r4 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3224a
            float[] r4 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3225b
            float r4 = androidx.compose.p015ui.graphics.colorspace.Rgb.C1501a.m3213a(r4)
            float r2 = r2 / r4
            r4 = 1063675494(0x3f666666, float:0.9)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 0
            if (r2 <= 0) goto L_0x01dd
            float[] r2 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3224a
            r6 = 0
            r10 = r1[r6]
            r11 = r2[r6]
            float r10 = r10 - r11
            r12 = r1[r14]
            r13 = r2[r14]
            float r12 = r12 - r13
            r15 = 2
            r17 = r1[r15]
            r15 = r2[r15]
            float r17 = r17 - r15
            r18 = 3
            r19 = r1[r18]
            r18 = r2[r18]
            float r19 = r19 - r18
            r20 = r1[r16]
            r16 = r2[r16]
            float r20 = r20 - r16
            r21 = 5
            r22 = r1[r21]
            r2 = r2[r21]
            float r22 = r22 - r2
            float r21 = r11 - r16
            float r23 = r13 - r2
            float r23 = r23 * r10
            float r21 = r21 * r12
            float r23 = r23 - r21
            int r21 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r21 < 0) goto L_0x01de
            float r21 = r11 - r15
            float r23 = r13 - r18
            float r21 = r21 * r12
            float r23 = r23 * r10
            float r21 = r21 - r23
            int r10 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a9
            goto L_0x01de
        L_0x01a9:
            float r10 = r15 - r11
            float r12 = r18 - r13
            float r12 = r12 * r17
            float r10 = r10 * r19
            float r12 = r12 - r10
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x01de
            float r10 = r15 - r16
            float r12 = r18 - r2
            float r10 = r10 * r19
            float r12 = r12 * r17
            float r10 = r10 - r12
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c4
            goto L_0x01de
        L_0x01c4:
            float r10 = r16 - r15
            float r12 = r2 - r18
            float r12 = r12 * r20
            float r10 = r10 * r22
            float r12 = r12 - r10
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x01de
            float r16 = r16 - r11
            float r2 = r2 - r13
            float r16 = r16 * r22
            float r2 = r2 * r20
            float r16 = r16 - r2
            int r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            goto L_0x01de
        L_0x01dd:
            r6 = 0
        L_0x01de:
            if (r9 != 0) goto L_0x01e2
            goto L_0x0255
        L_0x01e2:
            float[] r2 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3224a
            if (r1 != r2) goto L_0x01e7
            goto L_0x020a
        L_0x01e7:
            r9 = 6
            r10 = r6
        L_0x01e9:
            if (r10 >= r9) goto L_0x020a
            r11 = r1[r10]
            r12 = r2[r10]
            int r11 = java.lang.Float.compare(r11, r12)
            if (r11 == 0) goto L_0x0207
            r11 = r1[r10]
            r12 = r2[r10]
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            r12 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0207
            r1 = r6
            goto L_0x020b
        L_0x0207:
            int r10 = r10 + 1
            goto L_0x01e9
        L_0x020a:
            r1 = r14
        L_0x020b:
            if (r1 != 0) goto L_0x020e
            goto L_0x024c
        L_0x020e:
            androidx.compose.ui.graphics.colorspace.i r1 = p568fn.C17782b.f38635f
            boolean r1 = kotlinx.coroutines.C19543e0.m33290F(r3, r1)
            if (r1 != 0) goto L_0x0217
            goto L_0x024c
        L_0x0217:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x021d
            r1 = r14
            goto L_0x021e
        L_0x021d:
            r1 = r6
        L_0x021e:
            if (r1 != 0) goto L_0x0221
            goto L_0x024c
        L_0x0221:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0229
            r1 = r14
            goto L_0x022a
        L_0x0229:
            r1 = r6
        L_0x022a:
            if (r1 != 0) goto L_0x022d
            goto L_0x024c
        L_0x022d:
            float[] r1 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3224a
            androidx.compose.ui.graphics.colorspace.Rgb r1 = androidx.compose.p015ui.graphics.colorspace.ColorSpaces.f3226c
            r2 = 0
        L_0x0233:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0255
            kq.l<java.lang.Double, java.lang.Double> r4 = r1.f3253k
            boolean r4 = androidx.compose.p015ui.graphics.colorspace.Rgb.C1501a.m3214b(r2, r5, r4)
            if (r4 != 0) goto L_0x0242
            goto L_0x024c
        L_0x0242:
            kq.l<java.lang.Double, java.lang.Double> r4 = r1.f3255m
            r7 = r31
            boolean r4 = androidx.compose.p015ui.graphics.colorspace.Rgb.C1501a.m3214b(r2, r7, r4)
            if (r4 != 0) goto L_0x024e
        L_0x024c:
            r14 = r6
            goto L_0x0255
        L_0x024e:
            r8 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r8
            goto L_0x0233
        L_0x0255:
            r0.f3257o = r14
            return
        L_0x0258:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Transform must have 9 entries! Has "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            int r3 = r4.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x026c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid range: min="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", max="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "; min must be strictly < max"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.i, float[], kq.l, kq.l, float, float, androidx.compose.ui.graphics.colorspace.h, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r18, float[] r19, androidx.compose.p015ui.graphics.colorspace.C1512i r20, double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = r3
            goto L_0x000d
        L_0x000c:
            r5 = r4
        L_0x000d:
            if (r5 == 0) goto L_0x0012
            kq.l<java.lang.Double, java.lang.Double> r5 = f3245p
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.graphics.colorspace.Rgb$5 r5 = new androidx.compose.ui.graphics.colorspace.Rgb$5
            r5.<init>(r1)
        L_0x0017:
            r11 = r5
            if (r0 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            if (r3 == 0) goto L_0x0021
            kq.l<java.lang.Double, java.lang.Double> r0 = f3245p
            goto L_0x0026
        L_0x0021:
            androidx.compose.ui.graphics.colorspace.Rgb$6 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$6
            r0.<init>(r1)
        L_0x0026:
            r12 = r0
            androidx.compose.ui.graphics.colorspace.h r15 = new androidx.compose.ui.graphics.colorspace.h
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r15
            r1 = r21
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.i, double, float, float, int):void");
    }
}
