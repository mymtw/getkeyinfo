package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1492b0;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.vector.e */
public final class C1576e {

    /* renamed from: a */
    public final ArrayList f3519a = new ArrayList();

    /* renamed from: b */
    public final C1577a f3520b = new C1577a(0);

    /* renamed from: c */
    public final C1577a f3521c = new C1577a(0);

    /* renamed from: d */
    public final C1577a f3522d = new C1577a(0);

    /* renamed from: e */
    public final C1577a f3523e = new C1577a(0);

    /* renamed from: androidx.compose.ui.graphics.vector.e$a */
    public static final class C1577a {

        /* renamed from: a */
        public float f3524a;

        /* renamed from: b */
        public float f3525b;

        public C1577a() {
            this(0);
        }

        public C1577a(int i) {
            this.f3524a = 0.0f;
            this.f3525b = 0.0f;
        }

        /* renamed from: a */
        public final void mo6506a() {
            this.f3524a = 0.0f;
            this.f3525b = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1577a)) {
                return false;
            }
            C1577a aVar = (C1577a) obj;
            return C19383o.m32792b(Float.valueOf(this.f3524a), Float.valueOf(aVar.f3524a)) && C19383o.m32792b(Float.valueOf(this.f3525b), Float.valueOf(aVar.f3525b));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3525b) + (Float.hashCode(this.f3524a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PathPoint(x=");
            h.append(this.f3524a);
            h.append(", y=");
            return C0388a.m1048d(h, this.f3525b, ')');
        }
    }

    /* renamed from: b */
    public static void m3404b(C1492b0 b0Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d;
        double d11 = d3;
        double d12 = d5;
        boolean z3 = z2;
        double d13 = (d7 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = ((d2 * sin) + (d10 * cos)) / d12;
        double d15 = ((d2 * cos) + ((-d10) * sin)) / d6;
        double d16 = ((d4 * sin) + (d11 * cos)) / d12;
        double d17 = ((d4 * cos) + ((-d11) * sin)) / d6;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = (double) 2;
        double d21 = (d14 + d16) / d20;
        double d22 = (d15 + d17) / d20;
        double d23 = (d19 * d19) + (d18 * d18);
        if (!(d23 == ShadowDrawableWrapper.COS_45)) {
            double d24 = (1.0d / d23) - 0.25d;
            if (d24 < ShadowDrawableWrapper.COS_45) {
                double sqrt = (double) ((float) (Math.sqrt(d23) / 1.99999d));
                m3404b(b0Var, d, d2, d3, d4, d12 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d18 * sqrt2;
            double d26 = sqrt2 * d19;
            boolean z4 = z2;
            if (z == z4) {
                d9 = d21 - d26;
                d8 = d22 + d25;
            } else {
                d9 = d21 + d26;
                d8 = d22 - d25;
            }
            double atan2 = Math.atan2(d15 - d8, d14 - d9);
            double atan22 = Math.atan2(d17 - d8, d16 - d9) - atan2;
            int i = (atan22 > ShadowDrawableWrapper.COS_45 ? 1 : (atan22 == ShadowDrawableWrapper.COS_45 ? 0 : -1));
            if (z4 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d27 = d5;
            double d28 = d9 * d27;
            double d29 = d8 * d6;
            double d30 = (d28 * cos) - (d29 * sin);
            double d31 = (d29 * cos) + (d28 * sin);
            double d32 = (double) 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d32) / 3.141592653589793d));
            double cos2 = Math.cos(d13);
            double sin2 = Math.sin(d13);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d33 = atan2;
            double d34 = -d27;
            double d35 = d34 * cos2;
            double d36 = d6 * sin2;
            double d37 = (d35 * sin3) - (d36 * cos3);
            double d38 = d34 * sin2;
            double d39 = d6 * cos2;
            double d40 = (cos3 * d39) + (sin3 * d38);
            double d41 = d32;
            double d42 = atan22 / ((double) ceil);
            double d43 = d;
            double d44 = d2;
            double d45 = d40;
            double d46 = d37;
            int i2 = 0;
            double d47 = d33;
            while (i2 < ceil) {
                double d48 = d47 + d42;
                double sin4 = Math.sin(d48);
                double cos4 = Math.cos(d48);
                double d49 = d42;
                double d50 = (((d27 * cos2) * cos4) + d30) - (d36 * sin4);
                double d51 = sin2;
                double d52 = (d39 * sin4) + (d27 * sin2 * cos4) + d31;
                double d53 = (d35 * sin4) - (d36 * cos4);
                double d54 = (cos4 * d39) + (sin4 * d38);
                double d55 = d48 - d47;
                double tan = Math.tan(d55 / d20);
                double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d41) - ((double) 1)) * Math.sin(d55)) / ((double) 3);
                b0Var.mo6282h((float) ((d46 * sqrt3) + d43), (float) ((d45 * sqrt3) + d44), (float) (d50 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d50, (float) d52);
                i2++;
                ceil = ceil;
                d27 = d5;
                d38 = d38;
                d43 = d50;
                d44 = d52;
                d47 = d48;
                d45 = d54;
                d46 = d53;
                d20 = d20;
                d42 = d49;
                sin2 = d51;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [androidx.compose.ui.graphics.vector.d$m] */
    /* JADX WARNING: type inference failed for: r12v3, types: [androidx.compose.ui.graphics.vector.d$e] */
    /* JADX WARNING: type inference failed for: r12v6, types: [androidx.compose.ui.graphics.vector.d$m] */
    /* JADX WARNING: type inference failed for: r12v7, types: [androidx.compose.ui.graphics.vector.d$e] */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05d1, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x064c, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6504a(char r29, float[] r30) {
        /*
            r28 = this;
            r0 = r29
            r1 = r28
            r2 = r30
            java.util.ArrayList r3 = r1.f3519a
            r4 = 1
            r5 = 0
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 != r6) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            r6 = 90
            if (r0 != r6) goto L_0x0015
        L_0x0013:
            r6 = r4
            goto L_0x0016
        L_0x0015:
            r6 = r5
        L_0x0016:
            if (r6 == 0) goto L_0x0020
            androidx.compose.ui.graphics.vector.d$b r0 = androidx.compose.p015ui.graphics.vector.C1556d.C1558b.f3467c
            java.util.List r0 = p568fn.C17782b.m29864d0(r0)
            goto L_0x0651
        L_0x0020:
            r6 = 109(0x6d, float:1.53E-43)
            r7 = 2
            if (r0 != r6) goto L_0x006e
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x003d:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$n r9 = new androidx.compose.ui.graphics.vector.d$n
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0060
            if (r7 <= 0) goto L_0x0060
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x0067
        L_0x0060:
            if (r7 <= 0) goto L_0x0067
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x0067:
            r6.add(r9)
            goto L_0x003d
        L_0x006b:
            r0 = r6
            goto L_0x0651
        L_0x006e:
            r6 = 77
            if (r0 != r6) goto L_0x00b8
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x008a:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$f r9 = new androidx.compose.ui.graphics.vector.d$f
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            if (r7 <= 0) goto L_0x00a9
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x00b4
        L_0x00a9:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x00b4
            if (r7 <= 0) goto L_0x00b4
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x00b4:
            r6.add(r9)
            goto L_0x008a
        L_0x00b8:
            r6 = 108(0x6c, float:1.51E-43)
            if (r0 != r6) goto L_0x0106
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x00d4:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x00f7
            if (r7 <= 0) goto L_0x00f7
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x0102
        L_0x00f7:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0102
            if (r7 <= 0) goto L_0x0102
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x0102:
            r6.add(r9)
            goto L_0x00d4
        L_0x0106:
            r6 = 76
            if (r0 != r6) goto L_0x0154
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0122:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0145
            if (r7 <= 0) goto L_0x0145
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x0150
        L_0x0145:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0150
            if (r7 <= 0) goto L_0x0150
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x0150:
            r6.add(r9)
            goto L_0x0122
        L_0x0154:
            r6 = 104(0x68, float:1.46E-43)
            if (r0 != r6) goto L_0x01a4
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r4
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0170:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 1
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$l r9 = new androidx.compose.ui.graphics.vector.d$l
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0193
            if (r7 <= 0) goto L_0x0193
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r7 = r8[r4]
            r9.<init>(r10, r7)
            goto L_0x01a0
        L_0x0193:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x01a0
            if (r7 <= 0) goto L_0x01a0
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r7 = r8[r4]
            r9.<init>(r10, r7)
        L_0x01a0:
            r6.add(r9)
            goto L_0x0170
        L_0x01a4:
            r6 = 72
            if (r0 != r6) goto L_0x01f4
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r4
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x01c0:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 1
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$d r9 = new androidx.compose.ui.graphics.vector.d$d
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x01e3
            if (r7 <= 0) goto L_0x01e3
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r7 = r8[r4]
            r9.<init>(r10, r7)
            goto L_0x01f0
        L_0x01e3:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x01f0
            if (r7 <= 0) goto L_0x01f0
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r7 = r8[r4]
            r9.<init>(r10, r7)
        L_0x01f0:
            r6.add(r9)
            goto L_0x01c0
        L_0x01f4:
            r6 = 118(0x76, float:1.65E-43)
            if (r0 != r6) goto L_0x0244
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r4
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0210:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 1
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$r r9 = new androidx.compose.ui.graphics.vector.d$r
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0233
            if (r7 <= 0) goto L_0x0233
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r7 = r8[r4]
            r9.<init>(r10, r7)
            goto L_0x0240
        L_0x0233:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0240
            if (r7 <= 0) goto L_0x0240
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r7 = r8[r4]
            r9.<init>(r10, r7)
        L_0x0240:
            r6.add(r9)
            goto L_0x0210
        L_0x0244:
            r6 = 86
            if (r0 != r6) goto L_0x0294
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r4
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0260:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 1
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$s r9 = new androidx.compose.ui.graphics.vector.d$s
            r10 = r8[r5]
            r9.<init>(r10)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0283
            if (r7 <= 0) goto L_0x0283
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r7 = r8[r4]
            r9.<init>(r10, r7)
            goto L_0x0290
        L_0x0283:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0290
            if (r7 <= 0) goto L_0x0290
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r7 = r8[r4]
            r9.<init>(r10, r7)
        L_0x0290:
            r6.add(r9)
            goto L_0x0260
        L_0x0294:
            r6 = 99
            r8 = 6
            r9 = 5
            r10 = 4
            r11 = 3
            if (r0 != r6) goto L_0x02fb
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r8
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r8)
            pq.h r0 = r0.iterator()
        L_0x02b4:
            boolean r8 = r0.f44419d
            if (r8 == 0) goto L_0x006b
            int r8 = r0.nextInt()
            int r12 = r8 + 6
            float[] r12 = kotlin.collections.C19318k.m32607Y0(r2, r8, r12)
            androidx.compose.ui.graphics.vector.d$k r15 = new androidx.compose.ui.graphics.vector.d$k
            r14 = r12[r5]
            r13 = r12[r4]
            r16 = r12[r7]
            r17 = r12[r11]
            r18 = r12[r10]
            r19 = r12[r9]
            r12 = r13
            r13 = r15
            r29 = r14
            r9 = r15
            r15 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            boolean r13 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r13 == 0) goto L_0x02e7
            if (r8 <= 0) goto L_0x02e7
            androidx.compose.ui.graphics.vector.d$e r15 = new androidx.compose.ui.graphics.vector.d$e
            r13 = r29
            r15.<init>(r13, r12)
            goto L_0x02f6
        L_0x02e7:
            r13 = r29
            boolean r14 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r14 == 0) goto L_0x02f5
            if (r8 <= 0) goto L_0x02f5
            androidx.compose.ui.graphics.vector.d$m r15 = new androidx.compose.ui.graphics.vector.d$m
            r15.<init>(r13, r12)
            goto L_0x02f6
        L_0x02f5:
            r15 = r9
        L_0x02f6:
            r6.add(r15)
            r9 = 5
            goto L_0x02b4
        L_0x02fb:
            r6 = 67
            if (r0 != r6) goto L_0x036a
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r8
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r8)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r8)
            pq.h r0 = r0.iterator()
        L_0x0317:
            boolean r8 = r0.f44419d
            if (r8 == 0) goto L_0x006b
            int r8 = r0.nextInt()
            int r9 = r8 + 6
            float[] r9 = kotlin.collections.C19318k.m32607Y0(r2, r8, r9)
            androidx.compose.ui.graphics.vector.d$c r15 = new androidx.compose.ui.graphics.vector.d$c
            r14 = r9[r5]
            r13 = r9[r4]
            r16 = r9[r7]
            r17 = r9[r11]
            r18 = r9[r10]
            r12 = 5
            r9 = r9[r12]
            r12 = r15
            r29 = r13
            r13 = r14
            r11 = r14
            r14 = r29
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            boolean r9 = r7 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r9 == 0) goto L_0x0355
            if (r8 <= 0) goto L_0x0355
            androidx.compose.ui.graphics.vector.d$e r15 = new androidx.compose.ui.graphics.vector.d$e
            r9 = r29
            r15.<init>(r11, r9)
            goto L_0x0364
        L_0x0355:
            r9 = r29
            boolean r12 = r7 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r12 == 0) goto L_0x0363
            if (r8 <= 0) goto L_0x0363
            androidx.compose.ui.graphics.vector.d$m r15 = new androidx.compose.ui.graphics.vector.d$m
            r15.<init>(r11, r9)
            goto L_0x0364
        L_0x0363:
            r15 = r7
        L_0x0364:
            r6.add(r15)
            r7 = 2
            r11 = 3
            goto L_0x0317
        L_0x036a:
            r6 = 115(0x73, float:1.61E-43)
            if (r0 != r6) goto L_0x03be
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r10
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0386:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 4
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$p r9 = new androidx.compose.ui.graphics.vector.d$p
            r10 = r8[r5]
            r11 = r8[r4]
            r12 = 2
            r13 = r8[r12]
            r12 = 3
            r8 = r8[r12]
            r9.<init>(r10, r11, r13, r8)
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r8 == 0) goto L_0x03af
            if (r7 <= 0) goto L_0x03af
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r11)
            goto L_0x03ba
        L_0x03af:
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r8 == 0) goto L_0x03ba
            if (r7 <= 0) goto L_0x03ba
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r11)
        L_0x03ba:
            r6.add(r9)
            goto L_0x0386
        L_0x03be:
            r6 = 83
            if (r0 != r6) goto L_0x0412
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r10
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x03da:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 4
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$h r9 = new androidx.compose.ui.graphics.vector.d$h
            r10 = r8[r5]
            r11 = r8[r4]
            r12 = 2
            r13 = r8[r12]
            r12 = 3
            r8 = r8[r12]
            r9.<init>(r10, r11, r13, r8)
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r8 == 0) goto L_0x0403
            if (r7 <= 0) goto L_0x0403
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r11)
            goto L_0x040e
        L_0x0403:
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r8 == 0) goto L_0x040e
            if (r7 <= 0) goto L_0x040e
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r11)
        L_0x040e:
            r6.add(r9)
            goto L_0x03da
        L_0x0412:
            r6 = 113(0x71, float:1.58E-43)
            if (r0 != r6) goto L_0x0466
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r10
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x042e:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 4
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$o r9 = new androidx.compose.ui.graphics.vector.d$o
            r10 = r8[r5]
            r11 = r8[r4]
            r12 = 2
            r13 = r8[r12]
            r12 = 3
            r8 = r8[r12]
            r9.<init>(r10, r11, r13, r8)
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r8 == 0) goto L_0x0457
            if (r7 <= 0) goto L_0x0457
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r11)
            goto L_0x0462
        L_0x0457:
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r8 == 0) goto L_0x0462
            if (r7 <= 0) goto L_0x0462
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r11)
        L_0x0462:
            r6.add(r9)
            goto L_0x042e
        L_0x0466:
            r6 = 81
            if (r0 != r6) goto L_0x04ba
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r10
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r10)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0482:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 4
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$g r9 = new androidx.compose.ui.graphics.vector.d$g
            r10 = r8[r5]
            r11 = r8[r4]
            r12 = 2
            r13 = r8[r12]
            r12 = 3
            r8 = r8[r12]
            r9.<init>(r10, r11, r13, r8)
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r8 == 0) goto L_0x04ab
            if (r7 <= 0) goto L_0x04ab
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r11)
            goto L_0x04b6
        L_0x04ab:
            boolean r8 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r8 == 0) goto L_0x04b6
            if (r7 <= 0) goto L_0x04b6
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r11)
        L_0x04b6:
            r6.add(r9)
            goto L_0x0482
        L_0x04ba:
            r6 = 116(0x74, float:1.63E-43)
            if (r0 != r6) goto L_0x0509
            pq.i r0 = new pq.i
            int r6 = r2.length
            r7 = 2
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x04d7:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$q r9 = new androidx.compose.ui.graphics.vector.d$q
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x04fa
            if (r7 <= 0) goto L_0x04fa
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x0505
        L_0x04fa:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0505
            if (r7 <= 0) goto L_0x0505
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x0505:
            r6.add(r9)
            goto L_0x04d7
        L_0x0509:
            r6 = 84
            if (r0 != r6) goto L_0x0558
            pq.i r0 = new pq.i
            int r6 = r2.length
            r7 = 2
            int r6 = r6 - r7
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r7)
            pq.h r0 = r0.iterator()
        L_0x0526:
            boolean r7 = r0.f44419d
            if (r7 == 0) goto L_0x006b
            int r7 = r0.nextInt()
            int r8 = r7 + 2
            float[] r8 = kotlin.collections.C19318k.m32607Y0(r2, r7, r8)
            androidx.compose.ui.graphics.vector.d$i r9 = new androidx.compose.ui.graphics.vector.d$i
            r10 = r8[r5]
            r8 = r8[r4]
            r9.<init>(r10, r8)
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r11 == 0) goto L_0x0549
            if (r7 <= 0) goto L_0x0549
            androidx.compose.ui.graphics.vector.d$e r9 = new androidx.compose.ui.graphics.vector.d$e
            r9.<init>(r10, r8)
            goto L_0x0554
        L_0x0549:
            boolean r11 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r11 == 0) goto L_0x0554
            if (r7 <= 0) goto L_0x0554
            androidx.compose.ui.graphics.vector.d$m r9 = new androidx.compose.ui.graphics.vector.d$m
            r9.<init>(r10, r8)
        L_0x0554:
            r6.add(r9)
            goto L_0x0526
        L_0x0558:
            r6 = 97
            r7 = 0
            r9 = 7
            if (r0 != r6) goto L_0x05d5
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r9
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r9 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r9)
            pq.h r0 = r0.iterator()
        L_0x0576:
            boolean r9 = r0.f44419d
            if (r9 == 0) goto L_0x006b
            int r9 = r0.nextInt()
            int r11 = r9 + 7
            float[] r11 = kotlin.collections.C19318k.m32607Y0(r2, r9, r11)
            androidx.compose.ui.graphics.vector.d$j r12 = new androidx.compose.ui.graphics.vector.d$j
            r21 = r11[r5]
            r22 = r11[r4]
            r13 = 2
            r23 = r11[r13]
            r13 = 3
            r14 = r11[r13]
            int r13 = java.lang.Float.compare(r14, r7)
            if (r13 == 0) goto L_0x0599
            r24 = r4
            goto L_0x059b
        L_0x0599:
            r24 = r5
        L_0x059b:
            r13 = r11[r10]
            int r13 = java.lang.Float.compare(r13, r7)
            if (r13 == 0) goto L_0x05a6
            r25 = r4
            goto L_0x05a8
        L_0x05a6:
            r25 = r5
        L_0x05a8:
            r13 = 5
            r26 = r11[r13]
            r27 = r11[r8]
            r20 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            boolean r13 = r12 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r13 == 0) goto L_0x05c2
            if (r9 <= 0) goto L_0x05c2
            androidx.compose.ui.graphics.vector.d$e r12 = new androidx.compose.ui.graphics.vector.d$e
            r9 = r11[r5]
            r11 = r11[r4]
            r12.<init>(r9, r11)
            goto L_0x05d1
        L_0x05c2:
            boolean r13 = r12 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r13 == 0) goto L_0x05d1
            if (r9 <= 0) goto L_0x05d1
            androidx.compose.ui.graphics.vector.d$m r12 = new androidx.compose.ui.graphics.vector.d$m
            r9 = r11[r5]
            r11 = r11[r4]
            r12.<init>(r9, r11)
        L_0x05d1:
            r6.add(r12)
            goto L_0x0576
        L_0x05d5:
            r6 = 65
            if (r0 != r6) goto L_0x0655
            pq.i r0 = new pq.i
            int r6 = r2.length
            int r6 = r6 - r9
            r0.<init>(r5, r6)
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r9 = kotlin.collections.C19322o.m32624F0(r0)
            r6.<init>(r9)
            pq.h r0 = r0.iterator()
        L_0x05f1:
            boolean r9 = r0.f44419d
            if (r9 == 0) goto L_0x006b
            int r9 = r0.nextInt()
            int r11 = r9 + 7
            float[] r11 = kotlin.collections.C19318k.m32607Y0(r2, r9, r11)
            androidx.compose.ui.graphics.vector.d$a r12 = new androidx.compose.ui.graphics.vector.d$a
            r21 = r11[r5]
            r22 = r11[r4]
            r13 = 2
            r23 = r11[r13]
            r14 = 3
            r15 = r11[r14]
            int r15 = java.lang.Float.compare(r15, r7)
            if (r15 == 0) goto L_0x0614
            r24 = r4
            goto L_0x0616
        L_0x0614:
            r24 = r5
        L_0x0616:
            r15 = r11[r10]
            int r15 = java.lang.Float.compare(r15, r7)
            if (r15 == 0) goto L_0x0621
            r25 = r4
            goto L_0x0623
        L_0x0621:
            r25 = r5
        L_0x0623:
            r15 = 5
            r26 = r11[r15]
            r27 = r11[r8]
            r20 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            boolean r7 = r12 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r7 == 0) goto L_0x063d
            if (r9 <= 0) goto L_0x063d
            androidx.compose.ui.graphics.vector.d$e r12 = new androidx.compose.ui.graphics.vector.d$e
            r7 = r11[r5]
            r9 = r11[r4]
            r12.<init>(r7, r9)
            goto L_0x064c
        L_0x063d:
            boolean r7 = r12 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r7 == 0) goto L_0x064c
            if (r9 <= 0) goto L_0x064c
            androidx.compose.ui.graphics.vector.d$m r12 = new androidx.compose.ui.graphics.vector.d$m
            r7 = r11[r5]
            r9 = r11[r4]
            r12.<init>(r7, r9)
        L_0x064c:
            r6.add(r12)
            r7 = 0
            goto L_0x05f1
        L_0x0651:
            r3.addAll(r0)
            return
        L_0x0655:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown command for: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.C1576e.mo6504a(char, float[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.compose.ui.graphics.vector.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6505c(androidx.compose.p015ui.graphics.C1492b0 r25) {
        /*
            r24 = this;
            r0 = r24
            r14 = r25
            java.lang.String r1 = "target"
            kotlin.jvm.internal.C19383o.m32797g(r14, r1)
            r25.reset()
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3520b
            r1.mo6506a()
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3521c
            r1.mo6506a()
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3522d
            r1.mo6506a()
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3523e
            r1.mo6506a()
            java.util.ArrayList r15 = r0.f3519a
            int r12 = r15.size()
            r1 = 0
            r2 = 0
            r8 = r0
            r13 = r2
        L_0x002a:
            if (r13 >= r12) goto L_0x042d
            java.lang.Object r2 = r15.get(r13)
            r10 = r2
            androidx.compose.ui.graphics.vector.d r10 = (androidx.compose.p015ui.graphics.vector.C1556d) r10
            if (r1 != 0) goto L_0x0036
            r1 = r10
        L_0x0036:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1558b
            if (r2 == 0) goto L_0x005e
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3520b
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3522d
            float r3 = r2.f3524a
            r1.f3524a = r3
            float r3 = r2.f3525b
            r1.f3525b = r3
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            float r3 = r2.f3524a
            r1.f3524a = r3
            float r2 = r2.f3525b
            r1.f3525b = r2
            r25.close()
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3520b
            float r2 = r1.f3524a
            float r1 = r1.f3525b
            r14.mo6280g(r2, r1)
            goto L_0x036b
        L_0x005e:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1570n
            if (r2 == 0) goto L_0x0086
            r1 = r10
            androidx.compose.ui.graphics.vector.d$n r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1570n) r1
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            float r4 = r1.f3505c
            float r3 = r3 + r4
            r2.f3524a = r3
            float r3 = r2.f3525b
            float r1 = r1.f3506d
            float r3 = r3 + r1
            r2.f3525b = r3
            r14.mo6274b(r4, r1)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3522d
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            r1.f3524a = r3
            float r2 = r2.f3525b
            r1.f3525b = r2
            goto L_0x036b
        L_0x0086:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1562f
            if (r2 == 0) goto L_0x00a8
            r1 = r10
            androidx.compose.ui.graphics.vector.d$f r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1562f) r1
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r1.f3477c
            r2.f3524a = r3
            float r1 = r1.f3478d
            r2.f3525b = r1
            r14.mo6280g(r3, r1)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3522d
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            r1.f3524a = r3
            float r2 = r2.f3525b
            r1.f3525b = r2
            goto L_0x036b
        L_0x00a8:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1569m
            if (r2 == 0) goto L_0x00c8
            r1 = r10
            androidx.compose.ui.graphics.vector.d$m r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1569m) r1
            float r2 = r1.f3503c
            float r3 = r1.f3504d
            r14.mo6285l(r2, r3)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            float r4 = r1.f3503c
            float r3 = r3 + r4
            r2.f3524a = r3
            float r3 = r2.f3525b
            float r1 = r1.f3504d
            float r3 = r3 + r1
            r2.f3525b = r3
            goto L_0x036b
        L_0x00c8:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1561e
            if (r2 == 0) goto L_0x00e2
            r1 = r10
            androidx.compose.ui.graphics.vector.d$e r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1561e) r1
            float r2 = r1.f3475c
            float r3 = r1.f3476d
            r14.mo6286m(r2, r3)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r1.f3475c
            r2.f3524a = r3
            float r1 = r1.f3476d
            r2.f3525b = r1
            goto L_0x036b
        L_0x00e2:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1568l
            r3 = 0
            if (r2 == 0) goto L_0x00fa
            r1 = r10
            androidx.compose.ui.graphics.vector.d$l r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1568l) r1
            float r2 = r1.f3502c
            r14.mo6285l(r2, r3)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            float r1 = r1.f3502c
            float r3 = r3 + r1
            r2.f3524a = r3
            goto L_0x036b
        L_0x00fa:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1560d
            if (r2 == 0) goto L_0x0112
            r1 = r10
            androidx.compose.ui.graphics.vector.d$d r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1560d) r1
            float r2 = r1.f3474c
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r3 = r3.f3525b
            r14.mo6286m(r2, r3)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r1 = r1.f3474c
            r2.f3524a = r1
            goto L_0x036b
        L_0x0112:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1574r
            if (r2 == 0) goto L_0x0129
            r1 = r10
            androidx.compose.ui.graphics.vector.d$r r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1574r) r1
            float r2 = r1.f3517c
            r14.mo6285l(r3, r2)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3525b
            float r1 = r1.f3517c
            float r3 = r3 + r1
            r2.f3525b = r3
            goto L_0x036b
        L_0x0129:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1575s
            if (r2 == 0) goto L_0x0141
            r1 = r10
            androidx.compose.ui.graphics.vector.d$s r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1575s) r1
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r2 = r2.f3524a
            float r3 = r1.f3518c
            r14.mo6286m(r2, r3)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r1 = r1.f3518c
            r2.f3525b = r1
            goto L_0x036b
        L_0x0141:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1567k
            if (r2 == 0) goto L_0x017b
            r9 = r10
            androidx.compose.ui.graphics.vector.d$k r9 = (androidx.compose.p015ui.graphics.vector.C1556d.C1567k) r9
            float r2 = r9.f3496c
            float r3 = r9.f3497d
            float r4 = r9.f3498e
            float r5 = r9.f3499f
            float r6 = r9.f3500g
            float r7 = r9.f3501h
            r1 = r25
            r1.mo6275c(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            float r4 = r9.f3498e
            float r3 = r3 + r4
            r1.f3524a = r3
            float r3 = r2.f3525b
            float r4 = r9.f3499f
            float r3 = r3 + r4
            r1.f3525b = r3
            float r1 = r2.f3524a
            float r3 = r9.f3500g
            float r1 = r1 + r3
            r2.f3524a = r1
            float r1 = r2.f3525b
            float r3 = r9.f3501h
            float r1 = r1 + r3
            r2.f3525b = r1
            goto L_0x036b
        L_0x017b:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1559c
            if (r2 == 0) goto L_0x01a9
            r9 = r10
            androidx.compose.ui.graphics.vector.d$c r9 = (androidx.compose.p015ui.graphics.vector.C1556d.C1559c) r9
            float r2 = r9.f3468c
            float r3 = r9.f3469d
            float r4 = r9.f3470e
            float r5 = r9.f3471f
            float r6 = r9.f3472g
            float r7 = r9.f3473h
            r1 = r25
            r1.mo6282h(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            float r2 = r9.f3470e
            r1.f3524a = r2
            float r2 = r9.f3471f
            r1.f3525b = r2
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3520b
            float r2 = r9.f3472g
            r1.f3524a = r2
            float r2 = r9.f3473h
            r1.f3525b = r2
            goto L_0x036b
        L_0x01a9:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1572p
            if (r2 == 0) goto L_0x0206
            r9 = r10
            androidx.compose.ui.graphics.vector.d$p r9 = (androidx.compose.p015ui.graphics.vector.C1556d.C1572p) r9
            kotlin.jvm.internal.C19383o.m32794d(r1)
            boolean r1 = r1.f3458a
            if (r1 == 0) goto L_0x01cc
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            androidx.compose.ui.graphics.vector.e$a r4 = r8.f3521c
            float r5 = r4.f3524a
            float r3 = r3 - r5
            r1.f3524a = r3
            float r2 = r2.f3525b
            float r3 = r4.f3525b
            float r2 = r2 - r3
            r1.f3525b = r2
            goto L_0x01d1
        L_0x01cc:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            r1.mo6506a()
        L_0x01d1:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r2 = r1.f3524a
            float r3 = r1.f3525b
            float r4 = r9.f3511c
            float r5 = r9.f3512d
            float r6 = r9.f3513e
            float r7 = r9.f3514f
            r1 = r25
            r1.mo6275c(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            float r4 = r9.f3511c
            float r3 = r3 + r4
            r1.f3524a = r3
            float r3 = r2.f3525b
            float r4 = r9.f3512d
            float r3 = r3 + r4
            r1.f3525b = r3
            float r1 = r2.f3524a
            float r3 = r9.f3513e
            float r1 = r1 + r3
            r2.f3524a = r1
            float r1 = r2.f3525b
            float r3 = r9.f3514f
            float r1 = r1 + r3
            r2.f3525b = r1
            goto L_0x036b
        L_0x0206:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1564h
            r3 = 2
            if (r2 == 0) goto L_0x0262
            r9 = r10
            androidx.compose.ui.graphics.vector.d$h r9 = (androidx.compose.p015ui.graphics.vector.C1556d.C1564h) r9
            kotlin.jvm.internal.C19383o.m32794d(r1)
            boolean r1 = r1.f3458a
            if (r1 == 0) goto L_0x022d
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r2 = (float) r3
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            float r4 = r4 * r2
            androidx.compose.ui.graphics.vector.e$a r5 = r8.f3521c
            float r6 = r5.f3524a
            float r4 = r4 - r6
            r1.f3524a = r4
            float r3 = r3.f3525b
            float r2 = r2 * r3
            float r3 = r5.f3525b
            float r2 = r2 - r3
            r1.f3525b = r2
            goto L_0x0239
        L_0x022d:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r2.f3524a
            r1.f3524a = r3
            float r2 = r2.f3525b
            r1.f3525b = r2
        L_0x0239:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r2 = r1.f3524a
            float r3 = r1.f3525b
            float r4 = r9.f3483c
            float r5 = r9.f3484d
            float r6 = r9.f3485e
            float r7 = r9.f3486f
            r1 = r25
            r1.mo6282h(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            float r2 = r9.f3483c
            r1.f3524a = r2
            float r2 = r9.f3484d
            r1.f3525b = r2
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3520b
            float r2 = r9.f3485e
            r1.f3524a = r2
            float r2 = r9.f3486f
            r1.f3525b = r2
            goto L_0x036b
        L_0x0262:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1571o
            if (r2 == 0) goto L_0x0296
            r1 = r10
            androidx.compose.ui.graphics.vector.d$o r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1571o) r1
            float r2 = r1.f3507c
            float r3 = r1.f3508d
            float r4 = r1.f3509e
            float r5 = r1.f3510f
            r14.mo6279f(r2, r3, r4, r5)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3521c
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            float r5 = r1.f3507c
            float r4 = r4 + r5
            r2.f3524a = r4
            float r4 = r3.f3525b
            float r5 = r1.f3508d
            float r4 = r4 + r5
            r2.f3525b = r4
            float r2 = r3.f3524a
            float r4 = r1.f3509e
            float r2 = r2 + r4
            r3.f3524a = r2
            float r2 = r3.f3525b
            float r1 = r1.f3510f
            float r2 = r2 + r1
            r3.f3525b = r2
            goto L_0x036b
        L_0x0296:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1563g
            if (r2 == 0) goto L_0x02be
            r1 = r10
            androidx.compose.ui.graphics.vector.d$g r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1563g) r1
            float r2 = r1.f3479c
            float r3 = r1.f3480d
            float r4 = r1.f3481e
            float r5 = r1.f3482f
            r14.mo6278e(r2, r3, r4, r5)
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3521c
            float r3 = r1.f3479c
            r2.f3524a = r3
            float r3 = r1.f3480d
            r2.f3525b = r3
            androidx.compose.ui.graphics.vector.e$a r2 = r8.f3520b
            float r3 = r1.f3481e
            r2.f3524a = r3
            float r1 = r1.f3482f
            r2.f3525b = r1
            goto L_0x036b
        L_0x02be:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1573q
            if (r2 == 0) goto L_0x0316
            r2 = r10
            androidx.compose.ui.graphics.vector.d$q r2 = (androidx.compose.p015ui.graphics.vector.C1556d.C1573q) r2
            kotlin.jvm.internal.C19383o.m32794d(r1)
            boolean r1 = r1.f3459b
            if (r1 == 0) goto L_0x02e1
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            androidx.compose.ui.graphics.vector.e$a r5 = r8.f3521c
            float r6 = r5.f3524a
            float r4 = r4 - r6
            r1.f3524a = r4
            float r3 = r3.f3525b
            float r4 = r5.f3525b
            float r3 = r3 - r4
            r1.f3525b = r3
            goto L_0x02e6
        L_0x02e1:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            r1.mo6506a()
        L_0x02e6:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r3 = r1.f3524a
            float r1 = r1.f3525b
            float r4 = r2.f3515c
            float r5 = r2.f3516d
            r14.mo6279f(r3, r1, r4, r5)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            androidx.compose.ui.graphics.vector.e$a r5 = r8.f3523e
            float r6 = r5.f3524a
            float r4 = r4 + r6
            r1.f3524a = r4
            float r4 = r3.f3525b
            float r5 = r5.f3525b
            float r4 = r4 + r5
            r1.f3525b = r4
            float r1 = r3.f3524a
            float r4 = r2.f3515c
            float r1 = r1 + r4
            r3.f3524a = r1
            float r1 = r3.f3525b
            float r2 = r2.f3516d
            float r1 = r1 + r2
            r3.f3525b = r1
            goto L_0x036b
        L_0x0316:
            boolean r2 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1565i
            if (r2 == 0) goto L_0x0375
            r2 = r10
            androidx.compose.ui.graphics.vector.d$i r2 = (androidx.compose.p015ui.graphics.vector.C1556d.C1565i) r2
            kotlin.jvm.internal.C19383o.m32794d(r1)
            boolean r1 = r1.f3459b
            if (r1 == 0) goto L_0x033c
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r3 = (float) r3
            androidx.compose.ui.graphics.vector.e$a r4 = r8.f3520b
            float r5 = r4.f3524a
            float r5 = r5 * r3
            androidx.compose.ui.graphics.vector.e$a r6 = r8.f3521c
            float r7 = r6.f3524a
            float r5 = r5 - r7
            r1.f3524a = r5
            float r4 = r4.f3525b
            float r3 = r3 * r4
            float r4 = r6.f3525b
            float r3 = r3 - r4
            r1.f3525b = r3
            goto L_0x0348
        L_0x033c:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            r1.f3524a = r4
            float r3 = r3.f3525b
            r1.f3525b = r3
        L_0x0348:
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3523e
            float r3 = r1.f3524a
            float r1 = r1.f3525b
            float r4 = r2.f3487c
            float r5 = r2.f3488d
            r14.mo6278e(r3, r1, r4, r5)
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3521c
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3523e
            float r4 = r3.f3524a
            r1.f3524a = r4
            float r3 = r3.f3525b
            r1.f3525b = r3
            androidx.compose.ui.graphics.vector.e$a r1 = r8.f3520b
            float r3 = r2.f3487c
            r1.f3524a = r3
            float r2 = r2.f3488d
            r1.f3525b = r2
        L_0x036b:
            r18 = r10
            r21 = r12
            r22 = r13
            r23 = r15
            goto L_0x0421
        L_0x0375:
            boolean r1 = r10 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1566j
            if (r1 == 0) goto L_0x03d0
            r1 = r10
            androidx.compose.ui.graphics.vector.d$j r1 = (androidx.compose.p015ui.graphics.vector.C1556d.C1566j) r1
            float r2 = r1.f3494h
            androidx.compose.ui.graphics.vector.e$a r3 = r8.f3520b
            float r4 = r3.f3524a
            float r11 = r2 + r4
            float r2 = r1.f3495i
            float r5 = r3.f3525b
            float r8 = r2 + r5
            double r2 = (double) r4
            double r4 = (double) r5
            double r6 = (double) r11
            r16 = r10
            double r9 = (double) r8
            r18 = r8
            r8 = r9
            float r10 = r1.f3489c
            r17 = r11
            double r10 = (double) r10
            r19 = r16
            r20 = r17
            r16 = r12
            float r12 = r1.f3490d
            r17 = r13
            double r12 = (double) r12
            r21 = r16
            r22 = r17
            float r14 = r1.f3491e
            r16 = r15
            double r14 = (double) r14
            r23 = r16
            boolean r0 = r1.f3492f
            r16 = r0
            boolean r0 = r1.f3493g
            r17 = r0
            r1 = r25
            m3404b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r0 = r24
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3520b
            r2 = r20
            r1.f3524a = r2
            r3 = r18
            r1.f3525b = r3
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3521c
            r1.f3524a = r2
            r1.f3525b = r3
            r18 = r19
            goto L_0x041d
        L_0x03d0:
            r1 = r10
            r21 = r12
            r22 = r13
            r23 = r15
            boolean r2 = r1 instanceof androidx.compose.p015ui.graphics.vector.C1556d.C1557a
            if (r2 == 0) goto L_0x041f
            r14 = r1
            androidx.compose.ui.graphics.vector.d$a r14 = (androidx.compose.p015ui.graphics.vector.C1556d.C1557a) r14
            androidx.compose.ui.graphics.vector.e$a r4 = r8.f3520b
            float r2 = r4.f3524a
            double r2 = (double) r2
            float r4 = r4.f3525b
            double r4 = (double) r4
            float r6 = r14.f3465h
            double r6 = (double) r6
            float r8 = r14.f3466i
            double r8 = (double) r8
            float r10 = r14.f3460c
            double r10 = (double) r10
            float r12 = r14.f3461d
            double r12 = (double) r12
            float r15 = r14.f3462e
            r16 = r14
            double r14 = (double) r15
            r0 = r16
            r19 = r1
            boolean r1 = r0.f3463f
            r16 = r1
            boolean r1 = r0.f3464g
            r17 = r1
            r18 = r19
            r1 = r25
            m3404b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r10 = r0
            r0 = r24
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3520b
            float r2 = r10.f3465h
            r1.f3524a = r2
            float r3 = r10.f3466i
            r1.f3525b = r3
            androidx.compose.ui.graphics.vector.e$a r1 = r0.f3521c
            r1.f3524a = r2
            r1.f3525b = r3
        L_0x041d:
            r8 = r0
            goto L_0x0421
        L_0x041f:
            r18 = r1
        L_0x0421:
            int r13 = r22 + 1
            r14 = r25
            r1 = r18
            r12 = r21
            r15 = r23
            goto L_0x002a
        L_0x042d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.C1576e.mo6505c(androidx.compose.ui.graphics.b0):void");
    }
}
