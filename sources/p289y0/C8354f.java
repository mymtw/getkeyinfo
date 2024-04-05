package p289y0;

import android.graphics.Path;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: y0.f */
public final class C8354f {
    /* renamed from: a */
    public static boolean m16671a(C8355a[] aVarArr, C8355a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            C8355a aVar = aVarArr[i];
            char c = aVar.f18325a;
            C8355a aVar2 = aVarArr2[i];
            if (c != aVar2.f18325a || aVar.f18326b.length != aVar2.f18326b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m16672b(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i2 = i - 0;
                int min = Math.min(i2, length - 0);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p289y0.C8354f.C8355a[] m16673c(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r9 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r9 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r9 = r3 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r3] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r3 = r9
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r9 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = m16672b(r5, r3)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = p010a9.C0048b.m163a(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            y0.f$a r3 = new y0.f$a
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            y0.f$a r3 = new y0.f$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            y0.f$a[] r0 = new p289y0.C8354f.C8355a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            y0.f$a[] r0 = (p289y0.C8354f.C8355a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289y0.C8354f.m16673c(java.lang.String):y0.f$a[]");
    }

    /* renamed from: d */
    public static Path m16674d(String str) {
        Path path = new Path();
        C8355a[] c = m16673c(str);
        if (c == null) {
            return null;
        }
        try {
            C8355a.m16677b(c, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C0326j.m864i("Error in parsing ", str), e);
        }
    }

    /* renamed from: e */
    public static C8355a[] m16675e(C8355a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        C8355a[] aVarArr2 = new C8355a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new C8355a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* renamed from: y0.f$a */
    public static class C8355a {

        /* renamed from: a */
        public char f18325a;

        /* renamed from: b */
        public float[] f18326b;

        public C8355a(char c, float[] fArr) {
            this.f18325a = c;
            this.f18326b = fArr;
        }

        /* renamed from: a */
        public static void m16676a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            boolean z3 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            double d4 = (double) f2;
            double d5 = (d4 * sin) + (d3 * cos);
            double d6 = d3;
            double d7 = (double) f10;
            double d8 = d5 / d7;
            double d9 = radians;
            double d10 = (double) f6;
            double d11 = ((d4 * cos) + (((double) (-f8)) * sin)) / d10;
            double d12 = d4;
            double d13 = (double) f4;
            double d14 = ((d13 * sin) + (((double) f9) * cos)) / d7;
            double d15 = ((d13 * cos) + (((double) (-f9)) * sin)) / d10;
            double d16 = d8 - d14;
            double d17 = d11 - d15;
            double d18 = (d8 + d14) / 2.0d;
            double d19 = (d11 + d15) / 2.0d;
            double d20 = sin;
            double d21 = (d17 * d17) + (d16 * d16);
            if (d21 == ShadowDrawableWrapper.COS_45) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < ShadowDrawableWrapper.COS_45) {
                Log.w("PathParser", "Points are too far apart " + d21);
                float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                m16676a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d16 * sqrt2;
            double d24 = sqrt2 * d17;
            if (z == z3) {
                d2 = d18 - d24;
                d = d19 + d23;
            } else {
                d2 = d18 + d24;
                d = d19 - d23;
            }
            double atan2 = Math.atan2(d11 - d, d8 - d2);
            double atan22 = Math.atan2(d15 - d, d14 - d2) - atan2;
            int i = (atan22 > ShadowDrawableWrapper.COS_45 ? 1 : (atan22 == ShadowDrawableWrapper.COS_45 ? 0 : -1));
            if (z3 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d25 = d2 * d7;
            double d26 = d * d10;
            double d27 = (d25 * cos) - (d26 * d20);
            double d28 = (d26 * cos) + (d25 * d20);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d29 = -d7;
            double d30 = d29 * cos2;
            double d31 = d10 * sin2;
            double d32 = (d30 * sin3) - (d31 * cos3);
            double d33 = d29 * sin2;
            double d34 = d10 * cos2;
            double d35 = (cos3 * d34) + (sin3 * d33);
            double d36 = d34;
            double d37 = atan22 / ((double) ceil);
            int i2 = 0;
            while (i2 < ceil) {
                double d38 = atan2 + d37;
                double sin4 = Math.sin(d38);
                double cos4 = Math.cos(d38);
                double d39 = d37;
                double d40 = (((d7 * cos2) * cos4) + d27) - (d31 * sin4);
                double d41 = d36;
                double d42 = d27;
                double d43 = (d41 * sin4) + (d7 * sin2 * cos4) + d28;
                double d44 = (d30 * sin4) - (d31 * cos4);
                double d45 = (cos4 * d41) + (sin4 * d33);
                double d46 = d38 - atan2;
                double tan = Math.tan(d46 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                double d47 = d38;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d32 * sqrt3) + d6), (float) ((d35 * sqrt3) + d12), (float) (d40 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d40, (float) d43);
                i2++;
                atan2 = d47;
                d33 = d33;
                cos2 = cos2;
                ceil = ceil;
                d35 = d45;
                d7 = d7;
                d32 = d44;
                d6 = d40;
                d12 = d43;
                d27 = d42;
                d37 = d39;
                d36 = d41;
            }
        }

        /* renamed from: b */
        public static void m16677b(C8355a[] aVarArr, Path path) {
            int i;
            float f;
            float f2;
            int i2;
            int i3;
            float[] fArr;
            char c;
            int i4;
            float[] fArr2;
            char c2;
            int i5;
            float f3;
            float f4;
            float f5;
            float f6;
            int i6;
            float f7;
            float f8;
            int i7;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            C8355a[] aVarArr2 = aVarArr;
            Path path2 = path;
            int i8 = 6;
            float[] fArr3 = new float[6];
            char c3 = 'm';
            int i9 = 0;
            char c4 = 'm';
            int i10 = 0;
            while (i10 < aVarArr2.length) {
                C8355a aVar = aVarArr2[i10];
                char c5 = aVar.f18325a;
                float[] fArr4 = aVar.f18326b;
                float f26 = fArr3[i9];
                float f27 = fArr3[1];
                float f28 = fArr3[2];
                float f29 = fArr3[3];
                float f30 = fArr3[4];
                float f31 = fArr3[5];
                switch (c5) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = i8;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f30, f31);
                        f26 = f30;
                        f28 = f26;
                        f27 = f31;
                        f29 = f27;
                        break;
                }
                i = 2;
                float f32 = f30;
                float f33 = f31;
                float f34 = f26;
                float f35 = f27;
                int i11 = i9;
                while (i11 < fArr4.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 == 'H') {
                                i2 = i11;
                                fArr = fArr4;
                                c = c5;
                                i3 = i10;
                                int i12 = i2 + 0;
                                path2.lineTo(fArr[i12], f35);
                                f34 = fArr[i12];
                            } else if (c5 == 'Q') {
                                i6 = i11;
                                fArr = fArr4;
                                c = c5;
                                i3 = i10;
                                int i13 = i6 + 0;
                                int i14 = i6 + 1;
                                int i15 = i6 + 2;
                                int i16 = i6 + 3;
                                path2.quadTo(fArr[i13], fArr[i14], fArr[i15], fArr[i16]);
                                f6 = fArr[i13];
                                f5 = fArr[i14];
                                f34 = fArr[i15];
                                f35 = fArr[i16];
                            } else if (c5 == 'V') {
                                i2 = i11;
                                fArr = fArr4;
                                c = c5;
                                i3 = i10;
                                int i17 = i2 + 0;
                                path2.lineTo(f34, fArr[i17]);
                                f35 = fArr[i17];
                            } else if (c5 != 'a') {
                                if (c5 != 'c') {
                                    if (c5 == 'h') {
                                        i2 = i11;
                                        float f36 = f35;
                                        int i18 = i2 + 0;
                                        path2.rLineTo(fArr4[i18], 0.0f);
                                        f34 += fArr4[i18];
                                    } else if (c5 != 'q') {
                                        if (c5 != 'v') {
                                            if (c5 != 'L') {
                                                if (c5 == 'M') {
                                                    i2 = i11;
                                                    f17 = fArr4[i2 + 0];
                                                    f16 = fArr4[i2 + 1];
                                                    if (i2 > 0) {
                                                        path2.lineTo(f17, f16);
                                                    } else {
                                                        path2.moveTo(f17, f16);
                                                        f32 = f17;
                                                        f33 = f16;
                                                    }
                                                } else if (c5 == 'S') {
                                                    i7 = i11;
                                                    float f37 = f35;
                                                    float f38 = f34;
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f18 = (f37 * 2.0f) - f;
                                                        f19 = (f38 * 2.0f) - f2;
                                                    } else {
                                                        f19 = f38;
                                                        f18 = f37;
                                                    }
                                                    int i19 = i7 + 0;
                                                    int i20 = i7 + 1;
                                                    int i21 = i7 + 2;
                                                    int i22 = i7 + 3;
                                                    path.cubicTo(f19, f18, fArr4[i19], fArr4[i20], fArr4[i21], fArr4[i22]);
                                                    float f39 = fArr4[i19];
                                                    float f40 = fArr4[i20];
                                                    f8 = fArr4[i21];
                                                    f7 = fArr4[i22];
                                                    f2 = f39;
                                                    f = f40;
                                                    f34 = f8;
                                                    f35 = f7;
                                                } else if (c5 == 'T') {
                                                    i2 = i11;
                                                    float f41 = f35;
                                                    float f42 = f34;
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f20 = (f42 * 2.0f) - f2;
                                                        f21 = (f41 * 2.0f) - f;
                                                    } else {
                                                        f20 = f42;
                                                        f21 = f41;
                                                    }
                                                    int i23 = i2 + 0;
                                                    int i24 = i2 + 1;
                                                    path2.quadTo(f20, f21, fArr4[i23], fArr4[i24]);
                                                    f = f21;
                                                    f2 = f20;
                                                    fArr = fArr4;
                                                    c = c5;
                                                    i3 = i10;
                                                    f34 = fArr4[i23];
                                                    f35 = fArr4[i24];
                                                } else if (c5 == 'l') {
                                                    i2 = i11;
                                                    f14 = f35;
                                                    int i25 = i2 + 0;
                                                    int i26 = i2 + 1;
                                                    path2.rLineTo(fArr4[i25], fArr4[i26]);
                                                    f34 += fArr4[i25];
                                                    f15 = fArr4[i26];
                                                } else if (c5 == c3) {
                                                    i2 = i11;
                                                    float f43 = fArr4[i2 + 0];
                                                    f34 += f43;
                                                    float f44 = fArr4[i2 + 1];
                                                    f35 += f44;
                                                    if (i2 > 0) {
                                                        path2.rLineTo(f43, f44);
                                                    } else {
                                                        path2.rMoveTo(f43, f44);
                                                        f33 = f35;
                                                        f32 = f34;
                                                    }
                                                } else if (c5 != 's') {
                                                    if (c5 == 't') {
                                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                            f24 = f34 - f2;
                                                            f25 = f35 - f;
                                                        } else {
                                                            f25 = 0.0f;
                                                            f24 = 0.0f;
                                                        }
                                                        int i27 = i11 + 0;
                                                        int i28 = i11 + 1;
                                                        path2.rQuadTo(f24, f25, fArr4[i27], fArr4[i28]);
                                                        float f45 = f24 + f34;
                                                        float f46 = f25 + f35;
                                                        f34 += fArr4[i27];
                                                        f35 += fArr4[i28];
                                                        f = f46;
                                                        f2 = f45;
                                                    }
                                                    i2 = i11;
                                                } else {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f22 = f35 - f;
                                                        f23 = f34 - f2;
                                                    } else {
                                                        f23 = 0.0f;
                                                        f22 = 0.0f;
                                                    }
                                                    int i29 = i11 + 0;
                                                    int i30 = i11 + 1;
                                                    int i31 = i11 + 2;
                                                    int i32 = i11 + 3;
                                                    i7 = i11;
                                                    f9 = f35;
                                                    float f47 = f34;
                                                    path.rCubicTo(f23, f22, fArr4[i29], fArr4[i30], fArr4[i31], fArr4[i32]);
                                                    f12 = fArr4[i29] + f47;
                                                    f11 = fArr4[i30] + f9;
                                                    f10 = f47 + fArr4[i31];
                                                    f13 = fArr4[i32];
                                                }
                                                f34 = f32;
                                                f35 = f33;
                                            } else {
                                                i2 = i11;
                                                int i33 = i2 + 0;
                                                int i34 = i2 + 1;
                                                path2.lineTo(fArr4[i33], fArr4[i34]);
                                                f17 = fArr4[i33];
                                                f16 = fArr4[i34];
                                            }
                                            f34 = f17;
                                            f35 = f16;
                                        } else {
                                            i2 = i11;
                                            f14 = f35;
                                            float f48 = f34;
                                            int i35 = i2 + 0;
                                            path2.rLineTo(0.0f, fArr4[i35]);
                                            f15 = fArr4[i35];
                                        }
                                        f35 = f14 + f15;
                                    } else {
                                        i7 = i11;
                                        f9 = f35;
                                        float f49 = f34;
                                        int i36 = i7 + 0;
                                        int i37 = i7 + 1;
                                        int i38 = i7 + 2;
                                        int i39 = i7 + 3;
                                        path2.rQuadTo(fArr4[i36], fArr4[i37], fArr4[i38], fArr4[i39]);
                                        f12 = fArr4[i36] + f49;
                                        f11 = fArr4[i37] + f9;
                                        float f50 = f49 + fArr4[i38];
                                        float f51 = fArr4[i39];
                                        f10 = f50;
                                        f13 = f51;
                                    }
                                    fArr = fArr4;
                                    c = c5;
                                    i3 = i10;
                                } else {
                                    i7 = i11;
                                    f9 = f35;
                                    float f52 = f34;
                                    int i40 = i7 + 2;
                                    int i41 = i7 + 3;
                                    int i42 = i7 + 4;
                                    int i43 = i7 + 5;
                                    path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i40], fArr4[i41], fArr4[i42], fArr4[i43]);
                                    f12 = fArr4[i40] + f52;
                                    f11 = fArr4[i41] + f9;
                                    f10 = f52 + fArr4[i42];
                                    f13 = fArr4[i43];
                                }
                                f7 = f9 + f13;
                                f2 = f12;
                                f = f11;
                                f8 = f10;
                                f34 = f8;
                                f35 = f7;
                                fArr = fArr4;
                                c = c5;
                                i3 = i10;
                            } else {
                                i4 = i11;
                                float f53 = f35;
                                float f54 = f34;
                                int i44 = i4 + 5;
                                float f55 = fArr4[i44] + f54;
                                int i45 = i4 + 6;
                                float f56 = fArr4[i45] + f53;
                                float f57 = fArr4[i4 + 0];
                                float f58 = fArr4[i4 + 1];
                                float f59 = fArr4[i4 + 2];
                                boolean z = fArr4[i4 + 3] != 0.0f;
                                boolean z2 = fArr4[i4 + 4] != 0.0f;
                                fArr2 = fArr4;
                                float f60 = f59;
                                c2 = c5;
                                i5 = i10;
                                m16676a(path, f54, f53, f55, f56, f57, f58, f60, z, z2);
                                f3 = f54 + fArr2[i44];
                                f4 = f53 + fArr2[i45];
                            }
                            i11 = i2 + i;
                            c4 = c;
                            c5 = c4;
                            fArr4 = fArr;
                            i10 = i3;
                            c3 = 'm';
                            i9 = 0;
                            C8355a[] aVarArr3 = aVarArr;
                        } else {
                            i6 = i11;
                            fArr = fArr4;
                            c = c5;
                            i3 = i10;
                            int i46 = i6 + 2;
                            int i47 = i6 + 3;
                            int i48 = i6 + 4;
                            int i49 = i6 + 5;
                            path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i46], fArr[i47], fArr[i48], fArr[i49]);
                            float f61 = fArr[i48];
                            float f62 = fArr[i49];
                            f6 = fArr[i46];
                            f34 = f61;
                            f35 = f62;
                            f5 = fArr[i47];
                        }
                        f2 = f6;
                        f = f5;
                        i11 = i2 + i;
                        c4 = c;
                        c5 = c4;
                        fArr4 = fArr;
                        i10 = i3;
                        c3 = 'm';
                        i9 = 0;
                        C8355a[] aVarArr32 = aVarArr;
                    } else {
                        i4 = i11;
                        fArr2 = fArr4;
                        c2 = c5;
                        i5 = i10;
                        int i50 = i4 + 5;
                        int i51 = i4 + 6;
                        m16676a(path, f34, f35, fArr2[i50], fArr2[i51], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f3 = fArr2[i50];
                        f4 = fArr2[i51];
                    }
                    f = f35;
                    f2 = f34;
                    i11 = i2 + i;
                    c4 = c;
                    c5 = c4;
                    fArr4 = fArr;
                    i10 = i3;
                    c3 = 'm';
                    i9 = 0;
                    C8355a[] aVarArr322 = aVarArr;
                }
                int i52 = i10;
                fArr3[i9] = f34;
                fArr3[1] = f35;
                fArr3[2] = f2;
                fArr3[3] = f;
                fArr3[4] = f32;
                fArr3[5] = f33;
                i10 = i52 + 1;
                i8 = 6;
                c3 = 'm';
                c4 = aVarArr[i52].f18325a;
                aVarArr2 = aVarArr;
            }
        }

        public C8355a(C8355a aVar) {
            this.f18325a = aVar.f18325a;
            float[] fArr = aVar.f18326b;
            this.f18326b = C8354f.m16672b(fArr, fArr.length);
        }
    }
}
