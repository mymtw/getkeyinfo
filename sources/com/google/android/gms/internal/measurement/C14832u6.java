package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0069a;
import androidx.compose.animation.C0391c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p003a2.C0023f;
import p628nj.C18263b;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
public final class C14832u6<T> implements C14602c7<T> {

    /* renamed from: n */
    public static final int[] f33098n = new int[0];

    /* renamed from: o */
    public static final Unsafe f33099o = C14869x7.m24153k();

    /* renamed from: a */
    public final int[] f33100a;

    /* renamed from: b */
    public final Object[] f33101b;

    /* renamed from: c */
    public final int f33102c;

    /* renamed from: d */
    public final int f33103d;

    /* renamed from: e */
    public final C14796r6 f33104e;

    /* renamed from: f */
    public final boolean f33105f;

    /* renamed from: g */
    public final boolean f33106g;

    /* renamed from: h */
    public final int[] f33107h;

    /* renamed from: i */
    public final int f33108i;

    /* renamed from: j */
    public final int f33109j;

    /* renamed from: k */
    public final C14653g6 f33110k;

    /* renamed from: l */
    public final C14745n7<?, ?> f33111l;

    /* renamed from: m */
    public final C14678i5<?> f33112m;

    public C14832u6(int[] iArr, Object[] objArr, int i, int i2, C14796r6 r6Var, boolean z, int[] iArr2, int i3, int i4, C14653g6 g6Var, C14745n7 n7Var, C14678i5 i5Var, C14731m6 m6Var) {
        this.f33100a = iArr;
        this.f33101b = objArr;
        this.f33102c = i;
        this.f33103d = i2;
        this.f33106g = z;
        this.f33105f = i5Var != null && i5Var.mo50591c(r6Var);
        this.f33107h = iArr2;
        this.f33108i = i3;
        this.f33109j = i4;
        this.f33110k = g6Var;
        this.f33111l = n7Var;
        this.f33112m = i5Var;
        this.f33104e = r6Var;
    }

    /* renamed from: C */
    public static int m24009C(long j, Object obj) {
        return ((Integer) C14869x7.m24152j(j, obj)).intValue();
    }

    /* renamed from: j */
    public static long m24010j(long j, Object obj) {
        return ((Long) C14869x7.m24152j(j, obj)).longValue();
    }

    /* renamed from: m */
    public static Field m24011m(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(C0069a.m171b(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            C0391c.m1061h(sb, "Field ", str, " for ", name);
            throw new RuntimeException(C0023f.m110k(sb, " not found. Known fields are ", arrays));
        }
    }

    /* renamed from: v */
    public static final void m24012v(int i, Object obj, C14626e5 e5Var) throws IOException {
        if (obj instanceof String) {
            e5Var.f32825a.mo50416l(i, (String) obj);
            return;
        }
        e5Var.mo50463f(i, (zzix) obj);
    }

    /* renamed from: x */
    public static C14758o7 m24013x(Object obj) {
        C14819t5 t5Var = (C14819t5) obj;
        C14758o7 o7Var = t5Var.zzc;
        if (o7Var != C14758o7.f33020f) {
            return o7Var;
        }
        C14758o7 b = C14758o7.m23822b();
        t5Var.zzc = b;
        return b;
    }

    /* renamed from: y */
    public static C14832u6 m24014y(C14757o6 o6Var, C14653g6 g6Var, C14745n7 n7Var, C14678i5 i5Var, C14731m6 m6Var) {
        if (o6Var instanceof C14589b7) {
            return m24015z((C14589b7) o6Var, g6Var, n7Var, i5Var, m6Var);
        }
        C14719l7 l7Var = (C14719l7) o6Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0370  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C14832u6 m24015z(com.google.android.gms.internal.measurement.C14589b7 r32, com.google.android.gms.internal.measurement.C14653g6 r33, com.google.android.gms.internal.measurement.C14745n7 r34, com.google.android.gms.internal.measurement.C14678i5 r35, com.google.android.gms.internal.measurement.C14731m6 r36) {
        /*
            int r0 = r32.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r32.mo50387a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f33098n
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r31 = r14
            r14 = r12
            r12 = r31
        L_0x0166:
            sun.misc.Unsafe r15 = f33099o
            java.lang.Object[] r17 = r32.mo50388b()
            com.google.android.gms.internal.measurement.r6 r18 = r32.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r14 = r14 + r12
            r21 = r12
            r22 = r14
            r19 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r3) goto L_0x03c2
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r23
            r23 = 13
        L_0x0194:
            int r25 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r4 = r4 | r2
            int r23 = r23 + 13
            r2 = r25
            goto L_0x0194
        L_0x01a6:
            int r2 = r2 << r23
            r4 = r4 | r2
            r2 = r25
            goto L_0x01ae
        L_0x01ac:
            r2 = r23
        L_0x01ae:
            int r23 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01db
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r23
            r23 = 13
        L_0x01bc:
            int r26 = r5 + 1
            char r5 = r0.charAt(r5)
            r27 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d5
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r2 = r2 | r3
            int r23 = r23 + 13
            r5 = r26
            r3 = r27
            goto L_0x01bc
        L_0x01d5:
            int r3 = r5 << r23
            r2 = r2 | r3
            r3 = r26
            goto L_0x01df
        L_0x01db:
            r27 = r3
            r3 = r23
        L_0x01df:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r23 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r19 + 1
            r13[r19] = r20
            r19 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0294
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0223
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x0204:
            int r29 = r14 + 1
            char r14 = r0.charAt(r14)
            r30 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r26
            r3 = r3 | r12
            int r26 = r26 + 13
            r14 = r29
            r12 = r30
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r26
            r3 = r3 | r12
            r14 = r29
            goto L_0x0227
        L_0x0223:
            r30 = r12
            r14 = r26
        L_0x0227:
            int r12 = r5 + -51
            r26 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r20 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r20 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m24011m(r1, r12)
            r17[r3] = r12
        L_0x0269:
            r14 = r8
            r29 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r3 = r3 + 1
            r9 = r17[r3]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0284
        L_0x027c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m24011m(r1, r9)
            r17[r3] = r9
        L_0x0284:
            r3 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r12 = r0
            r25 = r1
            r0 = r8
            r24 = 1
            r8 = r3
            r3 = 0
            goto L_0x038b
        L_0x0294:
            r14 = r8
            r29 = r9
            r30 = r12
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m24011m(r1, r9)
            r12 = 9
            if (r5 == r12) goto L_0x0309
            r12 = 17
            if (r5 != r12) goto L_0x02ac
            goto L_0x0309
        L_0x02ac:
            r12 = 27
            if (r5 == r12) goto L_0x02fb
            r12 = 49
            if (r5 != r12) goto L_0x02b5
            goto L_0x02fb
        L_0x02b5:
            r12 = 12
            if (r5 == r12) goto L_0x02e8
            r12 = 30
            if (r5 == r12) goto L_0x02e8
            r12 = 44
            if (r5 != r12) goto L_0x02c2
            goto L_0x02e8
        L_0x02c2:
            r12 = 50
            if (r5 != r12) goto L_0x02f8
            int r12 = r21 + 1
            r13[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 + r21
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r21] = r8
            r8 = r2 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e3
            int r8 = r26 + 1
            int r21 = r21 + 1
            r26 = r17[r26]
            r11[r21] = r26
            r21 = r12
            goto L_0x02f8
        L_0x02e3:
            r21 = r12
        L_0x02e5:
            r24 = 1
            goto L_0x0318
        L_0x02e8:
            if (r10 != 0) goto L_0x02f8
            int r12 = r20 / 3
            int r26 = r8 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02e5
        L_0x02f8:
            r24 = 1
            goto L_0x0316
        L_0x02fb:
            int r12 = r20 / 3
            int r26 = r8 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x0318
        L_0x0309:
            r24 = 1
            int r12 = r20 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r26 = r9.getType()
            r11[r12] = r26
        L_0x0316:
            r26 = r8
        L_0x0318:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x0370
            r9 = 17
            if (r5 > r9) goto L_0x0370
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r12) goto L_0x034c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
        L_0x0336:
            int r28 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0348
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r25
            r3 = r3 | r9
            int r25 = r25 + 13
            r9 = r28
            goto L_0x0336
        L_0x0348:
            int r9 = r9 << r25
            r3 = r3 | r9
            goto L_0x034e
        L_0x034c:
            r28 = r9
        L_0x034e:
            int r9 = r6 + r6
            int r25 = r3 / 32
            int r25 = r25 + r9
            r9 = r17[r25]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x035d
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0365
        L_0x035d:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m24011m(r1, r9)
            r17[r25] = r9
        L_0x0365:
            r12 = r0
            r25 = r1
            long r0 = r15.objectFieldOffset(r9)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x0379
        L_0x0370:
            r12 = r0
            r25 = r1
            r28 = r3
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0379:
            r1 = 18
            if (r5 < r1) goto L_0x0387
            r1 = 49
            if (r5 > r1) goto L_0x0387
            int r1 = r22 + 1
            r13[r22] = r8
            r22 = r1
        L_0x0387:
            r16 = r26
            r26 = r28
        L_0x038b:
            int r1 = r20 + 1
            r7[r20] = r4
            int r4 = r1 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0398
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0399
        L_0x0398:
            r9 = 0
        L_0x0399:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a0
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a1
        L_0x03a0:
            r2 = 0
        L_0x03a1:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r7[r1] = r2
            int r20 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r7[r4] = r0
            r0 = r12
            r8 = r14
            r14 = r23
            r1 = r25
            r4 = r26
            r3 = r27
            r9 = r29
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03c2:
            r29 = r9
            r30 = r12
            r23 = r14
            r14 = r8
            com.google.android.gms.internal.measurement.u6 r0 = new com.google.android.gms.internal.measurement.u6
            com.google.android.gms.internal.measurement.r6 r9 = r32.zza()
            r4 = r0
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r29
            r11 = r13
            r13 = r23
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.m24015z(com.google.android.gms.internal.measurement.b7, com.google.android.gms.internal.measurement.g6, com.google.android.gms.internal.measurement.n7, com.google.android.gms.internal.measurement.i5, com.google.android.gms.internal.measurement.m6):com.google.android.gms.internal.measurement.u6");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0304, code lost:
        r7 = (r7 + r6) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0306, code lost:
        r4 = r4 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0403, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04a6, code lost:
        r4 = android.support.p013v4.media.C0069a.m171b(r7, r1, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04c4, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04ef, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0516, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0522, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x052f, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0532, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        r7 = (r7 + r1) + r6;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50907A(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f33099o
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.f33100a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x0539
            int r6 = r14.mo50914i(r3)
            int[] r7 = r14.f33100a
            r8 = r7[r3]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r2) goto L_0x0037
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x0525;
                case 1: goto L_0x0518;
                case 2: goto L_0x0504;
                case 3: goto L_0x04f1;
                case 4: goto L_0x04dd;
                case 5: goto L_0x04d2;
                case 6: goto L_0x04c7;
                case 7: goto L_0x04ba;
                case 8: goto L_0x048a;
                case 9: goto L_0x0478;
                case 10: goto L_0x045f;
                case 11: goto L_0x044b;
                case 12: goto L_0x0437;
                case 13: goto L_0x042b;
                case 14: goto L_0x041f;
                case 15: goto L_0x0406;
                case 16: goto L_0x03ed;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03cd;
                case 19: goto L_0x03c1;
                case 20: goto L_0x03b5;
                case 21: goto L_0x03a9;
                case 22: goto L_0x039d;
                case 23: goto L_0x0391;
                case 24: goto L_0x0385;
                case 25: goto L_0x0379;
                case 26: goto L_0x036d;
                case 27: goto L_0x035d;
                case 28: goto L_0x0351;
                case 29: goto L_0x0345;
                case 30: goto L_0x0339;
                case 31: goto L_0x032d;
                case 32: goto L_0x0321;
                case 33: goto L_0x0315;
                case 34: goto L_0x0309;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0102;
                case 60: goto L_0x00ee;
                case 61: goto L_0x00d3;
                case 62: goto L_0x00bd;
                case 63: goto L_0x00a7;
                case 64: goto L_0x0099;
                case 65: goto L_0x008b;
                case 66: goto L_0x0070;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0532
        L_0x0040:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.r6 r1 = (com.google.android.gms.internal.measurement.C14796r6) r1
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23439r(r8, r1, r6)
            goto L_0x0531
        L_0x0056:
            boolean r6 = r14.mo50923t(r8, r3, r15)
            if (r6 == 0) goto L_0x0532
            long r6 = m24010j(r12, r15)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
            goto L_0x0403
        L_0x0070:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = m24009C(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04ef
        L_0x008b:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x052f
        L_0x0099:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0522
        L_0x00a7:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = m24009C(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r1)
            goto L_0x04ef
        L_0x00bd:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = m24009C(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04ef
        L_0x00d3:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0120
        L_0x00ee:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23469J(r8, r6, r1)
            goto L_0x0531
        L_0x0102:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzix
            if (r6 == 0) goto L_0x0124
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x0120:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0306
        L_0x0124:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23441t(r1)
            goto L_0x04ef
        L_0x0132:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04c4
        L_0x0140:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0522
        L_0x014e:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x052f
        L_0x015c:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = m24009C(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r1)
            goto L_0x04ef
        L_0x0172:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            long r6 = m24010j(r12, r15)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
            goto L_0x0516
        L_0x0188:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            long r6 = m24010j(r12, r15)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
            goto L_0x0516
        L_0x019e:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0522
        L_0x01ac:
            boolean r1 = r14.mo50923t(r8, r3, r15)
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x052f
        L_0x01ba:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.mo50916l(r3)
            com.google.android.gms.internal.measurement.C14731m6.m23738a(r1, r6)
            goto L_0x0532
        L_0x01c7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23464E(r8, r1, r6)
            goto L_0x0531
        L_0x01d7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23474O(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23472M(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23505z(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23477R(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23502w(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23466G(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23479T(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23468I(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r1)
            if (r1 <= 0) goto L_0x0532
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r8)
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x0304:
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0306:
            int r4 = r4 + r7
            goto L_0x0532
        L_0x0309:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23473N(r8, r1)
            goto L_0x0531
        L_0x0315:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23471L(r8, r1)
            goto L_0x0531
        L_0x0321:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r8, r1)
            goto L_0x0531
        L_0x032d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r8, r1)
            goto L_0x0531
        L_0x0339:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23504y(r8, r1)
            goto L_0x0531
        L_0x0345:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23476Q(r8, r1)
            goto L_0x0531
        L_0x0351:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23503x(r8, r1)
            goto L_0x0531
        L_0x035d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23470K(r8, r1, r6)
            goto L_0x0531
        L_0x036d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23475P(r8, r1)
            goto L_0x0531
        L_0x0379:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23499t(r8, r1)
            goto L_0x0531
        L_0x0385:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r8, r1)
            goto L_0x0531
        L_0x0391:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r8, r1)
            goto L_0x0531
        L_0x039d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23465F(r8, r1)
            goto L_0x0531
        L_0x03a9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23478S(r8, r1)
            goto L_0x0531
        L_0x03b5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23467H(r8, r1)
            goto L_0x0531
        L_0x03c1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r8, r1)
            goto L_0x0531
        L_0x03cd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r8, r1)
            goto L_0x0531
        L_0x03d9:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.r6 r1 = (com.google.android.gms.internal.measurement.C14796r6) r1
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23439r(r8, r1, r6)
            goto L_0x0531
        L_0x03ed:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0532
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
        L_0x0403:
            int r1 = r1 + r8
            goto L_0x0531
        L_0x0406:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04ef
        L_0x041f:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x052f
        L_0x042b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0522
        L_0x0437:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r1)
            goto L_0x04ef
        L_0x044b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04ef
        L_0x045f:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x04a6
        L_0x0478:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.c7 r6 = r14.mo50915k(r3)
            int r1 = com.google.android.gms.internal.measurement.C14615d7.m23469J(r8, r6, r1)
            goto L_0x0531
        L_0x048a:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzix
            if (r6 == 0) goto L_0x04ad
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x04a6:
            int r1 = android.support.p013v4.media.C0069a.m171b(r7, r1, r6, r4)
            r4 = r1
            goto L_0x0532
        L_0x04ad:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23441t(r1)
            goto L_0x04ef
        L_0x04ba:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x04c4:
            int r1 = r1 + r11
            goto L_0x0531
        L_0x04c7:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x0522
        L_0x04d2:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            goto L_0x052f
        L_0x04dd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r6)
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r1)
        L_0x04ef:
            int r1 = r1 + r6
            goto L_0x0531
        L_0x04f1:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
            goto L_0x0516
        L_0x0504:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
            int r6 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r6)
        L_0x0516:
            int r1 = r1 + r6
            goto L_0x0531
        L_0x0518:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x0522:
            int r1 = r1 + 4
            goto L_0x0531
        L_0x0525:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0532
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r1)
        L_0x052f:
            int r1 = r1 + 8
        L_0x0531:
            int r4 = r4 + r1
        L_0x0532:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0539:
            com.google.android.gms.internal.measurement.n7<?, ?> r0 = r14.f33111l
            com.google.android.gms.internal.measurement.o7 r1 = r0.mo50738c(r15)
            int r0 = r0.mo50736a(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f33105f
            if (r1 != 0) goto L_0x0549
            return r0
        L_0x0549:
            com.google.android.gms.internal.measurement.i5<?> r0 = r14.f33112m
            r0.mo50589a(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50907A(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fb, code lost:
        r5 = (r5 + r4) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04b0, code lost:
        r5 = (r5 + r3) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b2, code lost:
        r2 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04ce, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0500, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x052b, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0539, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0548, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054b, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50908B(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f33099o
            r1 = 0
            r2 = r1
        L_0x0004:
            int[] r3 = r10.f33100a
            int r3 = r3.length
            if (r1 >= r3) goto L_0x054f
            int r3 = r10.mo50914i(r1)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            int[] r5 = r10.f33100a
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r6 = (long) r3
            com.google.android.gms.internal.measurement.zzjp r3 = com.google.android.gms.internal.measurement.zzjp.DOUBLE_LIST_PACKED
            int r3 = r3.zza()
            if (r4 < r3) goto L_0x0030
            com.google.android.gms.internal.measurement.zzjp r3 = com.google.android.gms.internal.measurement.zzjp.SINT64_LIST_PACKED
            int r3 = r3.zza()
            if (r4 > r3) goto L_0x0030
            int[] r3 = r10.f33100a
            int r8 = r1 + 2
            r3 = r3[r8]
        L_0x0030:
            r3 = 63
            switch(r4) {
                case 0: goto L_0x053c;
                case 1: goto L_0x052d;
                case 2: goto L_0x0517;
                case 3: goto L_0x0502;
                case 4: goto L_0x04ec;
                case 5: goto L_0x04df;
                case 6: goto L_0x04d2;
                case 7: goto L_0x04c2;
                case 8: goto L_0x0492;
                case 9: goto L_0x047e;
                case 10: goto L_0x0463;
                case 11: goto L_0x044d;
                case 12: goto L_0x0437;
                case 13: goto L_0x0429;
                case 14: goto L_0x041b;
                case 15: goto L_0x0400;
                case 16: goto L_0x03e5;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c3;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ab;
                case 21: goto L_0x039f;
                case 22: goto L_0x0393;
                case 23: goto L_0x0387;
                case 24: goto L_0x037b;
                case 25: goto L_0x036f;
                case 26: goto L_0x0363;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e7;
                case 36: goto L_0x02d2;
                case 37: goto L_0x02bd;
                case 38: goto L_0x02a8;
                case 39: goto L_0x0293;
                case 40: goto L_0x027e;
                case 41: goto L_0x0268;
                case 42: goto L_0x0252;
                case 43: goto L_0x023c;
                case 44: goto L_0x0226;
                case 45: goto L_0x0210;
                case 46: goto L_0x01fa;
                case 47: goto L_0x01e4;
                case 48: goto L_0x01ce;
                case 49: goto L_0x01be;
                case 50: goto L_0x01b1;
                case 51: goto L_0x01a3;
                case 52: goto L_0x0195;
                case 53: goto L_0x017f;
                case 54: goto L_0x0169;
                case 55: goto L_0x0153;
                case 56: goto L_0x0145;
                case 57: goto L_0x0137;
                case 58: goto L_0x0129;
                case 59: goto L_0x00fb;
                case 60: goto L_0x00e7;
                case 61: goto L_0x00cb;
                case 62: goto L_0x00b5;
                case 63: goto L_0x009f;
                case 64: goto L_0x0091;
                case 65: goto L_0x0083;
                case 66: goto L_0x0068;
                case 67: goto L_0x004d;
                case 68: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x054b
        L_0x0037:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.r6 r3 = (com.google.android.gms.internal.measurement.C14796r6) r3
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23439r(r5, r3, r4)
            goto L_0x054a
        L_0x004d:
            boolean r4 = r10.mo50923t(r5, r1, r11)
            if (r4 == 0) goto L_0x054b
            long r6 = m24010j(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            long r8 = r6 + r6
            long r5 = r6 >> r3
            long r5 = r5 ^ r8
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r5)
            goto L_0x0500
        L_0x0068:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = m24009C(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r5 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r5
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0500
        L_0x0083:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0548
        L_0x0091:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0539
        L_0x009f:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = m24009C(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r3)
            goto L_0x0500
        L_0x00b5:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = m24009C(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0500
        L_0x00cb:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = r3.zzd()
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x04b0
        L_0x00e7:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23469J(r5, r4, r3)
            goto L_0x054a
        L_0x00fb:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzix
            if (r4 == 0) goto L_0x011b
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = r3.zzd()
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x04b0
        L_0x011b:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23441t(r3)
            goto L_0x0500
        L_0x0129:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x04ce
        L_0x0137:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0539
        L_0x0145:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0548
        L_0x0153:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = m24009C(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r3)
            goto L_0x0500
        L_0x0169:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            long r3 = m24010j(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r5)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r3)
            goto L_0x052b
        L_0x017f:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            long r3 = m24010j(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r5)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r3)
            goto L_0x052b
        L_0x0195:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0539
        L_0x01a3:
            boolean r3 = r10.mo50923t(r5, r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0548
        L_0x01b1:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.lang.Object r4 = r10.mo50916l(r1)
            com.google.android.gms.internal.measurement.C14731m6.m23738a(r3, r4)
            goto L_0x054b
        L_0x01be:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23464E(r5, r3, r4)
            goto L_0x054a
        L_0x01ce:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23474O(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x01e4:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23472M(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x01fa:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x0210:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x0226:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23505z(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x023c:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23477R(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x0252:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23502w(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x0268:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x027e:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x0293:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23466G(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x02a8:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23479T(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x02bd:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23468I(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x02d2:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23461B(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x02fb
        L_0x02e7:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23463D(r3)
            if (r3 <= 0) goto L_0x054b
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23442u(r5)
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
        L_0x02fb:
            int r5 = r5 + r4
            int r5 = r5 + r3
            goto L_0x04b2
        L_0x02ff:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23473N(r5, r3)
            goto L_0x054a
        L_0x030b:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23471L(r5, r3)
            goto L_0x054a
        L_0x0317:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r5, r3)
            goto L_0x054a
        L_0x0323:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r5, r3)
            goto L_0x054a
        L_0x032f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23504y(r5, r3)
            goto L_0x054a
        L_0x033b:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23476Q(r5, r3)
            goto L_0x054a
        L_0x0347:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23503x(r5, r3)
            goto L_0x054a
        L_0x0353:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23470K(r5, r3, r4)
            goto L_0x054a
        L_0x0363:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23475P(r5, r3)
            goto L_0x054a
        L_0x036f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23499t(r5, r3)
            goto L_0x054a
        L_0x037b:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r5, r3)
            goto L_0x054a
        L_0x0387:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r5, r3)
            goto L_0x054a
        L_0x0393:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23465F(r5, r3)
            goto L_0x054a
        L_0x039f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23478S(r5, r3)
            goto L_0x054a
        L_0x03ab:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23467H(r5, r3)
            goto L_0x054a
        L_0x03b7:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23460A(r5, r3)
            goto L_0x054a
        L_0x03c3:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23462C(r5, r3)
            goto L_0x054a
        L_0x03cf:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.r6 r3 = (com.google.android.gms.internal.measurement.C14796r6) r3
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23439r(r5, r3, r4)
            goto L_0x054a
        L_0x03e5:
            boolean r4 = r10.mo50922s(r1, r11)
            if (r4 == 0) goto L_0x054b
            long r6 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            long r8 = r6 + r6
            long r5 = r6 >> r3
            long r5 = r5 ^ r8
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r5)
            goto L_0x0500
        L_0x0400:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r5 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r5
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0500
        L_0x041b:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0548
        L_0x0429:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0539
        L_0x0437:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r3)
            goto L_0x0500
        L_0x044d:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0500
        L_0x0463:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = r3.zzd()
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x04b0
        L_0x047e:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            com.google.android.gms.internal.measurement.c7 r4 = r10.mo50915k(r1)
            int r3 = com.google.android.gms.internal.measurement.C14615d7.m23469J(r5, r4, r3)
            goto L_0x054a
        L_0x0492:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r6, r11)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzix
            if (r4 == 0) goto L_0x04b5
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = r3.zzd()
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
        L_0x04b0:
            int r5 = r5 + r3
            int r5 = r5 + r4
        L_0x04b2:
            int r2 = r2 + r5
            goto L_0x054b
        L_0x04b5:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23441t(r3)
            goto L_0x0500
        L_0x04c2:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
        L_0x04ce:
            int r3 = r3 + 1
            goto L_0x054a
        L_0x04d2:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0539
        L_0x04df:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
            goto L_0x0548
        L_0x04ec:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r4)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23440s(r3)
        L_0x0500:
            int r3 = r3 + r4
            goto L_0x054a
        L_0x0502:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r5)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r3)
            goto L_0x052b
        L_0x0517:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r5)
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23438b(r3)
        L_0x052b:
            int r3 = r3 + r5
            goto L_0x054a
        L_0x052d:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
        L_0x0539:
            int r3 = r3 + 4
            goto L_0x054a
        L_0x053c:
            boolean r3 = r10.mo50922s(r1, r11)
            if (r3 == 0) goto L_0x054b
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.measurement.C14613d5.m23437a(r3)
        L_0x0548:
            int r3 = r3 + 8
        L_0x054a:
            int r2 = r2 + r3
        L_0x054b:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x054f:
            com.google.android.gms.internal.measurement.n7<?, ?> r0 = r10.f33111l
            com.google.android.gms.internal.measurement.o7 r11 = r0.mo50738c(r11)
            int r11 = r0.mo50736a(r11)
            int r11 = r11 + r2
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50908B(java.lang.Object):int");
    }

    /* renamed from: D */
    public final void mo50909D(Object obj, int i, long j) throws IOException {
        Unsafe unsafe = f33099o;
        Object l = mo50916l(i);
        Object object = unsafe.getObject(obj, j);
        if (!((zzkw) object).zze()) {
            zzkw zzb = zzkw.zza().zzb();
            C14731m6.m23739b(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        C14718l6 l6Var = (C14718l6) l;
        throw null;
    }

    /* renamed from: E */
    public final int mo50910E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C14854w4 w4Var) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C14854w4 w4Var2 = w4Var;
        Unsafe unsafe = f33099o;
        long j3 = (long) (this.f33100a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C14866x4.m24142o(i9, bArr2))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C14866x4.m24130c(i9, bArr2))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int n = C14866x4.m24141n(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, Long.valueOf(w4Var2.f33146b));
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int k = C14866x4.m24138k(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, Integer.valueOf(w4Var2.f33145a));
                    unsafe.putInt(t2, j3, i11);
                    return k;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C14866x4.m24142o(i9, bArr2)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C14866x4.m24130c(i9, bArr2)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int n2 = C14866x4.m24141n(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(w4Var2.f33146b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return n2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int k2 = C14866x4.m24138k(bArr2, i9, w4Var2);
                    int i14 = w4Var2.f33145a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C14881y7.m24180d(k2, k2 + i14, bArr2)) {
                        unsafe.putObject(t2, j2, new String(bArr2, k2, i14, C14575a6.f32740a));
                        k2 += i14;
                    } else {
                        throw zzkh.zzc();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return k2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int e = C14866x4.m24132e(mo50915k(i13), bArr2, i9, i2, w4Var2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, w4Var2.f33147c);
                    } else {
                        unsafe.putObject(t2, j2, C14575a6.m23370b(object, w4Var2.f33147c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return e;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C14866x4.m24129b(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, w4Var2.f33147c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int k3 = C14866x4.m24138k(bArr2, i9, w4Var2);
                    int i15 = w4Var2.f33145a;
                    int i16 = i13 / 3;
                    C14855w5 w5Var = (C14855w5) this.f33101b[i16 + i16 + 1];
                    if (w5Var == null || w5Var.zza(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m24013x(t).mo50762c(i10, Long.valueOf((long) i15));
                    }
                    return k3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int k4 = C14866x4.m24138k(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C18263b.m30877x0(w4Var2.f33145a)));
                    unsafe.putInt(t2, j3, i11);
                    return k4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int n3 = C14866x4.m24141n(bArr2, i9, w4Var2);
                    unsafe.putObject(t2, j2, Long.valueOf(C18263b.m30881z0(w4Var2.f33146b)));
                    unsafe.putInt(t2, j3, i11);
                    return n3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int d = C14866x4.m24131d(mo50915k(i13), bArr, i, i2, (i10 & -8) | 4, w4Var);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, w4Var2.f33147c);
                    } else {
                        unsafe.putObject(t2, j2, C14575a6.m23370b(object2, w4Var2.f33147c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r23 = r34;
        r7 = r36;
        r19 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c7, code lost:
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fb, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        r7 = r6;
        r5 = r19;
        r6 = r11 | r22;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0221, code lost:
        r2 = r4;
        r28 = r10;
        r15 = r14;
        r25 = r19;
        r17 = -1;
        r18 = 0;
        r10 = r6;
        r6 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50911F(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.C14854w4 r36) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            sun.misc.Unsafe r9 = f33099o
            r10 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = -1
            r0 = r34
            r1 = r7
            r5 = r8
            r2 = r10
            r6 = r2
        L_0x0017:
            if (r0 >= r13) goto L_0x036c
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24139l(r0, r12, r3, r11)
            int r3 = r11.f33145a
            r4 = r0
            r16 = r3
            goto L_0x002c
        L_0x0029:
            r16 = r0
            r4 = r3
        L_0x002c:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0041
            int r2 = r2 / 3
            int r1 = r15.f33102c
            if (r3 < r1) goto L_0x004e
            int r1 = r15.f33103d
            if (r3 > r1) goto L_0x004e
            int r1 = r15.mo50913H(r3, r2)
            goto L_0x004f
        L_0x0041:
            int r1 = r15.f33102c
            if (r3 < r1) goto L_0x004e
            int r1 = r15.f33103d
            if (r3 > r1) goto L_0x004e
            int r1 = r15.mo50913H(r3, r10)
            goto L_0x004f
        L_0x004e:
            r1 = r7
        L_0x004f:
            r2 = r1
            if (r2 != r7) goto L_0x0060
            r23 = r3
            r2 = r4
            r25 = r5
            r17 = r7
            r28 = r9
            r18 = r10
            r15 = r14
            goto L_0x0343
        L_0x0060:
            int[] r1 = r15.f33100a
            int r17 = r2 + 1
            r10 = r1[r17]
            int r7 = r10 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r34 = r3
            r3 = r10 & r8
            r19 = r9
            long r8 = (long) r3
            r3 = 17
            r21 = r10
            if (r7 > r3) goto L_0x022f
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r10 = 1
            int r22 = r10 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            if (r1 == r5) goto L_0x009c
            if (r5 == r3) goto L_0x008f
            long r10 = (long) r5
            r5 = r19
            r5.putInt(r14, r10, r6)
            goto L_0x0091
        L_0x008f:
            r5 = r19
        L_0x0091:
            if (r1 == r3) goto L_0x0098
            long r10 = (long) r1
            int r6 = r5.getInt(r14, r10)
        L_0x0098:
            r10 = r5
            r11 = r6
            r6 = r1
            goto L_0x00a0
        L_0x009c:
            r10 = r19
            r11 = r6
            r6 = r5
        L_0x00a0:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x01e5;
                case 2: goto L_0x01ca;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01b3;
                case 5: goto L_0x0195;
                case 6: goto L_0x0181;
                case 7: goto L_0x0163;
                case 8: goto L_0x0141;
                case 9: goto L_0x0115;
                case 10: goto L_0x00fe;
                case 11: goto L_0x01b3;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0181;
                case 14: goto L_0x0195;
                case 15: goto L_0x00ce;
                case 16: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00c3
        L_0x00a5:
            if (r0 != 0) goto L_0x00c3
            r7 = r36
            int r16 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r12, r4, r7)
            long r0 = r7.f33146b
            long r4 = p628nj.C18263b.m30881z0(r0)
            r0 = r10
            r1 = r32
            r23 = r34
            r24 = r3
            r19 = r6
            r6 = r2
            r2 = r8
            r0.putLong(r1, r2, r4)
            goto L_0x01e2
        L_0x00c3:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            goto L_0x0221
        L_0x00ce:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != 0) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r12, r4, r7)
            int r1 = r7.f33145a
            int r1 = p628nj.C18263b.m30877x0(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01c7
        L_0x00e8:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != 0) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r12, r4, r7)
            int r1 = r7.f33145a
            r10.putInt(r14, r8, r1)
            goto L_0x01c7
        L_0x00fe:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24129b(r12, r4, r7)
            java.lang.Object r1 = r7.f33147c
            r10.putObject(r14, r8, r1)
            goto L_0x01c7
        L_0x0115:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x0221
            com.google.android.gms.internal.measurement.c7 r0 = r15.mo50915k(r6)
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24132e(r0, r12, r4, r13, r7)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0136
            java.lang.Object r1 = r7.f33147c
            r10.putObject(r14, r8, r1)
            goto L_0x01c7
        L_0x0136:
            java.lang.Object r2 = r7.f33147c
            com.google.android.gms.internal.measurement.t5 r1 = com.google.android.gms.internal.measurement.C14575a6.m23370b(r1, r2)
            r10.putObject(r14, r8, r1)
            goto L_0x01c7
        L_0x0141:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x0221
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0158
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24135h(r12, r4, r7)
            goto L_0x015c
        L_0x0158:
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24136i(r12, r4, r7)
        L_0x015c:
            java.lang.Object r1 = r7.f33147c
            r10.putObject(r14, r8, r1)
            goto L_0x01c7
        L_0x0163:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != 0) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r12, r4, r7)
            long r1 = r7.f33146b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017c
            r1 = 1
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            com.google.android.gms.internal.measurement.C14869x7.m24155m(r14, r8, r1)
            goto L_0x01c7
        L_0x0181:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != r1) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r4, r12)
            r10.putInt(r14, r8, r0)
            goto L_0x01fb
        L_0x0195:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r1 = 1
            r6 = r2
            if (r0 != r1) goto L_0x0221
            long r20 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r4, r12)
            r0 = r10
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r4 = r8 + 8
            goto L_0x0217
        L_0x01b3:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != 0) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r12, r4, r7)
            int r1 = r7.f33145a
            r10.putInt(r14, r8, r1)
        L_0x01c7:
            r16 = r0
            goto L_0x01e2
        L_0x01ca:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != 0) goto L_0x0221
            int r16 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r12, r4, r7)
            long r4 = r7.f33146b
            r0 = r10
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01e2:
            r0 = r11 | r22
            goto L_0x021a
        L_0x01e5:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r6 = r2
            if (r0 != r1) goto L_0x0221
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r4, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C14869x7.m24157o(r14, r8, r0)
        L_0x01fb:
            int r4 = r4 + 4
            goto L_0x0217
        L_0x01fe:
            r23 = r34
            r7 = r36
            r24 = r3
            r19 = r6
            r1 = 1
            r6 = r2
            if (r0 != r1) goto L_0x0221
            long r0 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r4, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C14869x7.m24156n(r14, r8, r0)
            int r4 = r4 + 8
        L_0x0217:
            r16 = r4
            goto L_0x01e2
        L_0x021a:
            r7 = r6
            r5 = r19
            r6 = r0
            r0 = r16
            goto L_0x0273
        L_0x0221:
            r2 = r4
            r28 = r10
            r15 = r14
            r25 = r19
            r17 = -1
            r18 = 0
            r10 = r6
            r6 = r11
            goto L_0x0343
        L_0x022f:
            r23 = r34
            r11 = r6
            r10 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r1 = 27
            if (r7 != r1) goto L_0x028e
            r1 = 2
            if (r0 != r1) goto L_0x027f
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.measurement.z5 r0 = (com.google.android.gms.internal.measurement.C14891z5) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x025c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0254
            r1 = 10
            goto L_0x0255
        L_0x0254:
            int r1 = r1 + r1
        L_0x0255:
            com.google.android.gms.internal.measurement.z5 r0 = r0.mo50356b(r1)
            r10.putObject(r14, r8, r0)
        L_0x025c:
            r7 = r0
            com.google.android.gms.internal.measurement.c7 r0 = r15.mo50915k(r6)
            r1 = r16
            r2 = r33
            r3 = r4
            r4 = r35
            r8 = r5
            r5 = r7
            r7 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24133f(r0, r1, r2, r3, r4, r5, r6)
            r5 = r8
            r6 = r11
        L_0x0273:
            r11 = r36
            r2 = r7
            r9 = r10
            r1 = r23
            r8 = r24
            r7 = -1
            r10 = 0
            goto L_0x0017
        L_0x027f:
            r15 = r4
            r25 = r5
            r21 = r6
            r28 = r10
            r29 = r11
            r17 = -1
            r18 = 0
            goto L_0x02fe
        L_0x028e:
            r30 = r6
            r6 = r5
            r5 = r30
            r1 = 49
            if (r7 > r1) goto L_0x02de
            r3 = r21
            long r2 = (long) r3
            r1 = r0
            r0 = r31
            r34 = r1
            r1 = r32
            r19 = r2
            r2 = r33
            r3 = r4
            r15 = r4
            r4 = r35
            r21 = r5
            r5 = r16
            r25 = r6
            r6 = r23
            r22 = r7
            r17 = -1
            r7 = r34
            r26 = r8
            r9 = r24
            r8 = r21
            r28 = r10
            r18 = 0
            r9 = r19
            r29 = r11
            r11 = r22
            r12 = r26
            r14 = r36
            int r0 = r0.mo50912G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02d7
            r15 = r32
            r19 = r21
            goto L_0x0336
        L_0x02d7:
            r15 = r32
            r4 = r0
            r19 = r21
            goto L_0x033e
        L_0x02de:
            r34 = r0
            r15 = r4
            r25 = r6
            r22 = r7
            r26 = r8
            r28 = r10
            r29 = r11
            r3 = r21
            r17 = -1
            r18 = 0
            r21 = r5
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x0311
            r7 = r34
            r0 = 2
            if (r7 == r0) goto L_0x0304
        L_0x02fe:
            r4 = r15
            r19 = r21
            r15 = r32
            goto L_0x033e
        L_0x0304:
            r14 = r31
            r15 = r32
            r13 = r21
            r10 = r26
            r14.mo50909D(r15, r13, r10)
            r0 = 0
            throw r0
        L_0x0311:
            r14 = r31
            r7 = r34
            r12 = r15
            r13 = r21
            r10 = r26
            r15 = r32
            r0 = r31
            r1 = r32
            r2 = r33
            r8 = r3
            r3 = r12
            r4 = r35
            r5 = r16
            r6 = r23
            r14 = r12
            r12 = r13
            r19 = r13
            r13 = r36
            int r0 = r0.mo50910E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x033d
        L_0x0336:
            r2 = r19
            r5 = r25
            r6 = r29
            goto L_0x0356
        L_0x033d:
            r4 = r0
        L_0x033e:
            r2 = r4
            r10 = r19
            r6 = r29
        L_0x0343:
            com.google.android.gms.internal.measurement.o7 r4 = m24013x(r32)
            r0 = r16
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24137j(r0, r1, r2, r3, r4, r5)
            r2 = r10
            r5 = r25
        L_0x0356:
            r12 = r33
            r13 = r35
            r11 = r36
            r14 = r15
            r7 = r17
            r10 = r18
            r1 = r23
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r31
            goto L_0x0017
        L_0x036c:
            r29 = r6
            r1 = r8
            r28 = r9
            r15 = r14
            if (r5 == r1) goto L_0x037c
            long r1 = (long) r5
            r3 = r28
            r6 = r29
            r3.putInt(r15, r1, r6)
        L_0x037c:
            r1 = r35
            if (r0 != r1) goto L_0x0381
            return
        L_0x0381:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50911F(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.w4):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0459 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d4  */
    /* renamed from: G */
    public final int mo50912G(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.C14854w4 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f33099o
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.z5 r12 = (com.google.android.gms.internal.measurement.C14891z5) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 + r13
        L_0x002c:
            com.google.android.gms.internal.measurement.z5 r12 = r12.mo50356b(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            r14 = 3
            r15 = 1
            switch(r27) {
                case 18: goto L_0x03e9;
                case 19: goto L_0x039b;
                case 20: goto L_0x0358;
                case 21: goto L_0x0358;
                case 22: goto L_0x033d;
                case 23: goto L_0x02fb;
                case 24: goto L_0x02b9;
                case 25: goto L_0x025f;
                case 26: goto L_0x01ac;
                case 27: goto L_0x0191;
                case 28: goto L_0x0137;
                case 29: goto L_0x033d;
                case 30: goto L_0x00fb;
                case 31: goto L_0x02b9;
                case 32: goto L_0x02fb;
                case 33: goto L_0x00ac;
                case 34: goto L_0x005d;
                case 35: goto L_0x03e9;
                case 36: goto L_0x039b;
                case 37: goto L_0x0358;
                case 38: goto L_0x0358;
                case 39: goto L_0x033d;
                case 40: goto L_0x02fb;
                case 41: goto L_0x02b9;
                case 42: goto L_0x025f;
                case 43: goto L_0x033d;
                case 44: goto L_0x00fb;
                case 45: goto L_0x02b9;
                case 46: goto L_0x02fb;
                case 47: goto L_0x00ac;
                case 48: goto L_0x005d;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r6 != r14) goto L_0x0458
            com.google.android.gms.internal.measurement.c7 r1 = r0.mo50915k(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24131d(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f33147c
            r12.add(r8)
            goto L_0x0436
        L_0x005d:
            if (r6 != r13) goto L_0x0081
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x0068:
            if (r1 >= r2) goto L_0x0078
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r1, r7)
            long r4 = r7.f33146b
            long r4 = p628nj.C18263b.m30881z0(r4)
            r12.mo50561c(r4)
            goto L_0x0068
        L_0x0078:
            if (r1 != r2) goto L_0x007c
            goto L_0x0459
        L_0x007c:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x0081:
            if (r6 != 0) goto L_0x0458
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r4, r7)
            long r8 = r7.f33146b
            long r8 = p628nj.C18263b.m30881z0(r8)
            r12.mo50561c(r8)
        L_0x0092:
            if (r1 >= r5) goto L_0x00ab
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x009d
            goto L_0x00ab
        L_0x009d:
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r4, r7)
            long r8 = r7.f33146b
            long r8 = p628nj.C18263b.m30881z0(r8)
            r12.mo50561c(r8)
            goto L_0x0092
        L_0x00ab:
            return r1
        L_0x00ac:
            if (r6 != r13) goto L_0x00d0
            com.google.android.gms.internal.measurement.u5 r12 = (com.google.android.gms.internal.measurement.C14831u5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x00b7:
            if (r1 >= r2) goto L_0x00c7
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r4 = r7.f33145a
            int r4 = p628nj.C18263b.m30877x0(r4)
            r12.mo50898c(r4)
            goto L_0x00b7
        L_0x00c7:
            if (r1 != r2) goto L_0x00cb
            goto L_0x0459
        L_0x00cb:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x00d0:
            if (r6 != 0) goto L_0x0458
            com.google.android.gms.internal.measurement.u5 r12 = (com.google.android.gms.internal.measurement.C14831u5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            int r4 = p628nj.C18263b.m30877x0(r4)
            r12.mo50898c(r4)
        L_0x00e1:
            if (r1 >= r5) goto L_0x00fa
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            int r4 = p628nj.C18263b.m30877x0(r4)
            r12.mo50898c(r4)
            goto L_0x00e1
        L_0x00fa:
            return r1
        L_0x00fb:
            if (r6 != r13) goto L_0x0102
            int r2 = com.google.android.gms.internal.measurement.C14866x4.m24134g(r3, r4, r12, r7)
            goto L_0x0113
        L_0x0102:
            if (r6 != 0) goto L_0x0458
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.C14866x4.m24140m(r2, r3, r4, r5, r6, r7)
        L_0x0113:
            com.google.android.gms.internal.measurement.t5 r1 = (com.google.android.gms.internal.measurement.C14819t5) r1
            com.google.android.gms.internal.measurement.o7 r3 = r1.zzc
            com.google.android.gms.internal.measurement.o7 r4 = com.google.android.gms.internal.measurement.C14758o7.f33020f
            if (r3 != r4) goto L_0x011c
            r3 = 0
        L_0x011c:
            int r4 = r8 / 3
            java.lang.Object[] r5 = r0.f33101b
            int r4 = r4 + r4
            int r4 = r4 + r15
            r4 = r5[r4]
            com.google.android.gms.internal.measurement.w5 r4 = (com.google.android.gms.internal.measurement.C14855w5) r4
            com.google.android.gms.internal.measurement.n7<?, ?> r5 = r0.f33111l
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14615d7.m23480a(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x0132
            goto L_0x0280
        L_0x0132:
            com.google.android.gms.internal.measurement.o7 r3 = (com.google.android.gms.internal.measurement.C14758o7) r3
            r1.zzc = r3
            return r2
        L_0x0137:
            if (r6 != r13) goto L_0x0458
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x018c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0187
            if (r4 != 0) goto L_0x014d
            com.google.android.gms.internal.measurement.zzix r4 = com.google.android.gms.internal.measurement.zzix.zzb
            r12.add(r4)
            goto L_0x0155
        L_0x014d:
            com.google.android.gms.internal.measurement.zzix r6 = com.google.android.gms.internal.measurement.zzix.zzl(r3, r1, r4)
            r12.add(r6)
        L_0x0154:
            int r1 = r1 + r4
        L_0x0155:
            if (r1 >= r5) goto L_0x0186
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x0160
            goto L_0x0186
        L_0x0160:
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x0181
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017c
            if (r4 != 0) goto L_0x0174
            com.google.android.gms.internal.measurement.zzix r4 = com.google.android.gms.internal.measurement.zzix.zzb
            r12.add(r4)
            goto L_0x0155
        L_0x0174:
            com.google.android.gms.internal.measurement.zzix r6 = com.google.android.gms.internal.measurement.zzix.zzl(r3, r1, r4)
            r12.add(r6)
            goto L_0x0154
        L_0x017c:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x0181:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x0186:
            return r1
        L_0x0187:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x018c:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x0191:
            if (r6 == r13) goto L_0x0195
            goto L_0x0458
        L_0x0195:
            com.google.android.gms.internal.measurement.c7 r1 = r0.mo50915k(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24133f(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x01ac:
            if (r6 != r13) goto L_0x0458
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01ff
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x01fa
            if (r4 != 0) goto L_0x01c7
            r12.add(r6)
            goto L_0x01d2
        L_0x01c7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01d1:
            int r1 = r1 + r4
        L_0x01d2:
            if (r1 >= r5) goto L_0x0459
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r8 = r7.f33145a
            if (r2 != r8) goto L_0x0459
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01ea
            r12.add(r6)
            goto L_0x01d2
        L_0x01ea:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01d1
        L_0x01f5:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x01fa:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x01ff:
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x025a
            if (r4 != 0) goto L_0x020d
            r12.add(r6)
            goto L_0x0220
        L_0x020d:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C14881y7.m24180d(r1, r8, r3)
            if (r9 == 0) goto L_0x0255
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021f:
            r1 = r8
        L_0x0220:
            if (r1 >= r5) goto L_0x0459
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r8 = r7.f33145a
            if (r2 != r8) goto L_0x0459
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            if (r4 < 0) goto L_0x0250
            if (r4 != 0) goto L_0x0238
            r12.add(r6)
            goto L_0x0220
        L_0x0238:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C14881y7.m24180d(r1, r8, r3)
            if (r9 == 0) goto L_0x024b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021f
        L_0x024b:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzc()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzc()
            throw r1
        L_0x025a:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzd()
            throw r1
        L_0x025f:
            r1 = 0
            if (r6 != r13) goto L_0x0288
            com.google.android.gms.internal.measurement.y4 r12 = (com.google.android.gms.internal.measurement.C14878y4) r12
            int r2 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r4 = r7.f33145a
            int r4 = r4 + r2
        L_0x026b:
            if (r2 >= r4) goto L_0x027e
            int r2 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r2, r7)
            long r5 = r7.f33146b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0279
            r5 = r15
            goto L_0x027a
        L_0x0279:
            r5 = r1
        L_0x027a:
            r12.mo50975c(r5)
            goto L_0x026b
        L_0x027e:
            if (r2 != r4) goto L_0x0283
        L_0x0280:
            r1 = r2
            goto L_0x0459
        L_0x0283:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x0288:
            if (r6 != 0) goto L_0x0458
            com.google.android.gms.internal.measurement.y4 r12 = (com.google.android.gms.internal.measurement.C14878y4) r12
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r4, r7)
            long r8 = r7.f33146b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0298
            r6 = r15
            goto L_0x0299
        L_0x0298:
            r6 = r1
        L_0x0299:
            r12.mo50975c(r6)
        L_0x029c:
            if (r4 >= r5) goto L_0x02b8
            int r6 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r8 = r7.f33145a
            if (r2 == r8) goto L_0x02a7
            goto L_0x02b8
        L_0x02a7:
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r6, r7)
            long r8 = r7.f33146b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02b3
            r6 = r15
            goto L_0x02b4
        L_0x02b3:
            r6 = r1
        L_0x02b4:
            r12.mo50975c(r6)
            goto L_0x029c
        L_0x02b8:
            return r4
        L_0x02b9:
            if (r6 != r13) goto L_0x02d9
            com.google.android.gms.internal.measurement.u5 r12 = (com.google.android.gms.internal.measurement.C14831u5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x02c4:
            if (r1 >= r2) goto L_0x02d0
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r1, r3)
            r12.mo50898c(r4)
            int r1 = r1 + 4
            goto L_0x02c4
        L_0x02d0:
            if (r1 != r2) goto L_0x02d4
            goto L_0x0459
        L_0x02d4:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x02d9:
            if (r6 != r9) goto L_0x0458
            com.google.android.gms.internal.measurement.u5 r12 = (com.google.android.gms.internal.measurement.C14831u5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r4, r3)
            r12.mo50898c(r1)
        L_0x02e4:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02fa
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x02f1
            goto L_0x02fa
        L_0x02f1:
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r1, r3)
            r12.mo50898c(r4)
            r4 = r1
            goto L_0x02e4
        L_0x02fa:
            return r4
        L_0x02fb:
            if (r6 != r13) goto L_0x031b
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x0306:
            if (r1 >= r2) goto L_0x0312
            long r4 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r1, r3)
            r12.mo50561c(r4)
            int r1 = r1 + 8
            goto L_0x0306
        L_0x0312:
            if (r1 != r2) goto L_0x0316
            goto L_0x0459
        L_0x0316:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x031b:
            if (r6 != r15) goto L_0x0458
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            long r8 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r4, r3)
            r12.mo50561c(r8)
        L_0x0326:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x033c
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x0333
            goto L_0x033c
        L_0x0333:
            long r8 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r1, r3)
            r12.mo50561c(r8)
            r4 = r1
            goto L_0x0326
        L_0x033c:
            return r4
        L_0x033d:
            if (r6 != r13) goto L_0x0345
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24134g(r3, r4, r12, r7)
            goto L_0x0459
        L_0x0345:
            if (r6 == 0) goto L_0x0349
            goto L_0x0458
        L_0x0349:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24140m(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0358:
            if (r6 != r13) goto L_0x0378
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x0363:
            if (r1 >= r2) goto L_0x036f
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r1, r7)
            long r4 = r7.f33146b
            r12.mo50561c(r4)
            goto L_0x0363
        L_0x036f:
            if (r1 != r2) goto L_0x0373
            goto L_0x0459
        L_0x0373:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x0378:
            if (r6 != 0) goto L_0x0458
            com.google.android.gms.internal.measurement.h6 r12 = (com.google.android.gms.internal.measurement.C14666h6) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r4, r7)
            long r8 = r7.f33146b
            r12.mo50561c(r8)
        L_0x0385:
            if (r1 >= r5) goto L_0x039a
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r1, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x0390
            goto L_0x039a
        L_0x0390:
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r3, r4, r7)
            long r8 = r7.f33146b
            r12.mo50561c(r8)
            goto L_0x0385
        L_0x039a:
            return r1
        L_0x039b:
            if (r6 != r13) goto L_0x03bf
            com.google.android.gms.internal.measurement.n5 r12 = (com.google.android.gms.internal.measurement.C14743n5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x03a6:
            if (r1 >= r2) goto L_0x03b6
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r1, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo50727c(r4)
            int r1 = r1 + 4
            goto L_0x03a6
        L_0x03b6:
            if (r1 != r2) goto L_0x03ba
            goto L_0x0459
        L_0x03ba:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x03bf:
            if (r6 != r9) goto L_0x0458
            com.google.android.gms.internal.measurement.n5 r12 = (com.google.android.gms.internal.measurement.C14743n5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r4, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo50727c(r1)
        L_0x03ce:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03e8
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x03db
            goto L_0x03e8
        L_0x03db:
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r1, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo50727c(r4)
            r4 = r1
            goto L_0x03ce
        L_0x03e8:
            return r4
        L_0x03e9:
            if (r6 != r13) goto L_0x040c
            com.google.android.gms.internal.measurement.f5 r12 = (com.google.android.gms.internal.measurement.C14639f5) r12
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r2 = r7.f33145a
            int r2 = r2 + r1
        L_0x03f4:
            if (r1 >= r2) goto L_0x0404
            long r4 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r1, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo50520c(r4)
            int r1 = r1 + 8
            goto L_0x03f4
        L_0x0404:
            if (r1 != r2) goto L_0x0407
            goto L_0x0459
        L_0x0407:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r1
        L_0x040c:
            if (r6 != r15) goto L_0x0458
            com.google.android.gms.internal.measurement.f5 r12 = (com.google.android.gms.internal.measurement.C14639f5) r12
            long r8 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r4, r3)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo50520c(r8)
        L_0x041b:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0435
            int r1 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r6 = r7.f33145a
            if (r2 == r6) goto L_0x0428
            goto L_0x0435
        L_0x0428:
            long r8 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r1, r3)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo50520c(r8)
            r4 = r1
            goto L_0x041b
        L_0x0435:
            return r4
        L_0x0436:
            if (r4 >= r5) goto L_0x0457
            int r8 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r3, r4, r7)
            int r9 = r7.f33145a
            if (r2 == r9) goto L_0x0441
            goto L_0x0457
        L_0x0441:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C14866x4.m24131d(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f33147c
            r12.add(r8)
            goto L_0x0436
        L_0x0457:
            return r4
        L_0x0458:
            r1 = r4
        L_0x0459:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50912G(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.w4):int");
    }

    /* renamed from: H */
    public final int mo50913H(int i, int i2) {
        int length = (this.f33100a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f33100a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo50435a(T t) {
        int i;
        int i2 = this.f33108i;
        while (true) {
            i = this.f33109j;
            if (i2 >= i) {
                break;
            }
            long i3 = (long) (mo50914i(this.f33107h[i2]) & 1048575);
            Object j = C14869x7.m24152j(i3, t);
            if (j != null) {
                ((zzkw) j).zzc();
                C14869x7.m24159q(i3, t, j);
            }
            i2++;
        }
        int length = this.f33107h.length;
        while (i < length) {
            this.f33110k.mo50475a((long) this.f33107h[i], t);
            i++;
        }
        this.f33111l.mo50742g(t);
        if (this.f33105f) {
            this.f33112m.mo50590b(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if (r3 != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d8, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (r3 != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f5, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f6, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0240, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0242, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50436b(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f33100a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0246
            int r3 = r10.mo50914i(r1)
            int[] r4 = r10.f33100a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0232;
                case 1: goto L_0x0227;
                case 2: goto L_0x021c;
                case 3: goto L_0x0211;
                case 4: goto L_0x020a;
                case 5: goto L_0x01ff;
                case 6: goto L_0x01f8;
                case 7: goto L_0x01ea;
                case 8: goto L_0x01dd;
                case 9: goto L_0x01ce;
                case 10: goto L_0x01c2;
                case 11: goto L_0x01ba;
                case 12: goto L_0x01b2;
                case 13: goto L_0x01aa;
                case 14: goto L_0x019e;
                case 15: goto L_0x0196;
                case 16: goto L_0x018a;
                case 17: goto L_0x017f;
                case 18: goto L_0x0173;
                case 19: goto L_0x0173;
                case 20: goto L_0x0173;
                case 21: goto L_0x0173;
                case 22: goto L_0x0173;
                case 23: goto L_0x0173;
                case 24: goto L_0x0173;
                case 25: goto L_0x0173;
                case 26: goto L_0x0173;
                case 27: goto L_0x0173;
                case 28: goto L_0x0173;
                case 29: goto L_0x0173;
                case 30: goto L_0x0173;
                case 31: goto L_0x0173;
                case 32: goto L_0x0173;
                case 33: goto L_0x0173;
                case 34: goto L_0x0173;
                case 35: goto L_0x0173;
                case 36: goto L_0x0173;
                case 37: goto L_0x0173;
                case 38: goto L_0x0173;
                case 39: goto L_0x0173;
                case 40: goto L_0x0173;
                case 41: goto L_0x0173;
                case 42: goto L_0x0173;
                case 43: goto L_0x0173;
                case 44: goto L_0x0173;
                case 45: goto L_0x0173;
                case 46: goto L_0x0173;
                case 47: goto L_0x0173;
                case 48: goto L_0x0173;
                case 49: goto L_0x0173;
                case 50: goto L_0x0167;
                case 51: goto L_0x014b;
                case 52: goto L_0x0133;
                case 53: goto L_0x0121;
                case 54: goto L_0x010f;
                case 55: goto L_0x0101;
                case 56: goto L_0x00ef;
                case 57: goto L_0x00e1;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00b5;
                case 60: goto L_0x00a3;
                case 61: goto L_0x0091;
                case 62: goto L_0x0083;
                case 63: goto L_0x0075;
                case 64: goto L_0x0067;
                case 65: goto L_0x0055;
                case 66: goto L_0x0047;
                case 67: goto L_0x0035;
                case 68: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0242
        L_0x0023:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0035:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m24010j(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0047:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x0055:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m24010j(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0067:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x0075:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x0083:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x0091:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00a3:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00b5:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00c9:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x00e1:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x00ef:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m24010j(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0101:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m24009C(r5, r11)
            goto L_0x0240
        L_0x010f:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m24010j(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0121:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m24010j(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0133:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x014b:
            boolean r3 = r10.mo50923t(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0167:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0173:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x017f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            if (r3 == 0) goto L_0x01d8
            int r7 = r3.hashCode()
            goto L_0x01d8
        L_0x018a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x019e:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x01aa:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x01b2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x01ba:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x01c2:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01ce:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            if (r3 == 0) goto L_0x01d8
            int r7 = r3.hashCode()
        L_0x01d8:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0242
        L_0x01dd:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01ea:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C14869x7.m24161s(r5, r11)
            java.nio.charset.Charset r4 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x01f5:
            r8 = r9
        L_0x01f6:
            r3 = r8
            goto L_0x0240
        L_0x01f8:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x01ff:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x020a:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C14869x7.m24149g(r5, r11)
            goto L_0x0240
        L_0x0211:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x021c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C14869x7.m24150h(r5, r11)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
            goto L_0x0240
        L_0x0227:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C14869x7.m24148f(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x0232:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C14869x7.m24147e(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C14575a6.m23369a(r3)
        L_0x0240:
            int r3 = r3 + r2
            r2 = r3
        L_0x0242:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0246:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.n7<?, ?> r0 = r10.f33111l
            com.google.android.gms.internal.measurement.o7 r0 = r0.mo50738c(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f33105f
            if (r1 != 0) goto L_0x0258
            return r0
        L_0x0258:
            com.google.android.gms.internal.measurement.i5<?> r0 = r10.f33112m
            r0.mo50589a(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50436b(java.lang.Object):int");
    }

    /* renamed from: c */
    public final void mo50437c(T t, byte[] bArr, int i, int i2, C14854w4 w4Var) throws IOException {
        if (this.f33106g) {
            mo50911F(t, bArr, i, i2, w4Var);
        } else {
            mo50925w(t, bArr, i, i2, 0, w4Var);
        }
    }

    /* renamed from: d */
    public final int mo50438d(T t) {
        return this.f33106g ? mo50908B(t) : mo50907A(t);
    }

    /* renamed from: e */
    public final void mo50439e(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f33100a.length; i += 3) {
            int i2 = mo50914i(i);
            long j = (long) (1048575 & i2);
            int i3 = this.f33100a[i];
            switch ((i2 >>> 20) & 255) {
                case 0:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24156n(t, j, C14869x7.m24147e(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 1:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24157o(t, j, C14869x7.m24148f(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 2:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.f33158c.mo50957o(t, j, C14869x7.m24150h(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 3:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.f33158c.mo50957o(t, j, C14869x7.m24150h(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 4:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 5:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.f33158c.mo50957o(t, j, C14869x7.m24150h(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 6:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 7:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24155m(t, j, C14869x7.m24161s(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 8:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24159q(j, t, C14869x7.m24152j(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 9:
                    mo50917n(i, t, t2);
                    break;
                case 10:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24159q(j, t, C14869x7.m24152j(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 11:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 12:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 13:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 14:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.f33158c.mo50957o(t, j, C14869x7.m24150h(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 15:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.m24158p(t, C14869x7.m24149g(j, t2), j);
                        mo50919p(i, t);
                        break;
                    }
                case 16:
                    if (!mo50922s(i, t2)) {
                        break;
                    } else {
                        C14869x7.f33158c.mo50957o(t, j, C14869x7.m24150h(j, t2));
                        mo50919p(i, t);
                        break;
                    }
                case 17:
                    mo50917n(i, t, t2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f33110k.mo50476b(j, t, t2);
                    break;
                case 50:
                    Class<?> cls = C14615d7.f32807a;
                    C14869x7.m24159q(j, t, C14731m6.m23739b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!mo50923t(i3, i, t2)) {
                        break;
                    } else {
                        C14869x7.m24159q(j, t, C14869x7.m24152j(j, t2));
                        mo50920q(i3, i, t);
                        break;
                    }
                case 60:
                    mo50918o(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo50923t(i3, i, t2)) {
                        break;
                    } else {
                        C14869x7.m24159q(j, t, C14869x7.m24152j(j, t2));
                        mo50920q(i3, i, t);
                        break;
                    }
                case 68:
                    mo50918o(i, t, t2);
                    break;
            }
        }
        C14745n7<?, ?> n7Var = this.f33111l;
        Class<?> cls2 = C14615d7.f32807a;
        n7Var.mo50743h(t, n7Var.mo50739d(n7Var.mo50738c(t), n7Var.mo50738c(t2)));
        if (this.f33105f) {
            this.f33112m.mo50589a(t2);
            throw null;
        }
    }

    /* renamed from: f */
    public final boolean mo50440f(T t, T t2) {
        boolean z;
        int length = this.f33100a.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = mo50914i(i);
            long j = (long) (i2 & 1048575);
            switch ((i2 >>> 20) & 255) {
                case 0:
                    if (mo50921r(i, t, t2) && Double.doubleToLongBits(C14869x7.m24147e(j, t)) == Double.doubleToLongBits(C14869x7.m24147e(j, t2))) {
                        continue;
                    }
                case 1:
                    if (mo50921r(i, t, t2) && Float.floatToIntBits(C14869x7.m24148f(j, t)) == Float.floatToIntBits(C14869x7.m24148f(j, t2))) {
                        continue;
                    }
                case 2:
                    if (mo50921r(i, t, t2) && C14869x7.m24150h(j, t) == C14869x7.m24150h(j, t2)) {
                        continue;
                    }
                case 3:
                    if (mo50921r(i, t, t2) && C14869x7.m24150h(j, t) == C14869x7.m24150h(j, t2)) {
                        continue;
                    }
                case 4:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 5:
                    if (mo50921r(i, t, t2) && C14869x7.m24150h(j, t) == C14869x7.m24150h(j, t2)) {
                        continue;
                    }
                case 6:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 7:
                    if (mo50921r(i, t, t2) && C14869x7.m24161s(j, t) == C14869x7.m24161s(j, t2)) {
                        continue;
                    }
                case 8:
                    if (mo50921r(i, t, t2) && C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2))) {
                        continue;
                    }
                case 9:
                    if (mo50921r(i, t, t2) && C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2))) {
                        continue;
                    }
                case 10:
                    if (mo50921r(i, t, t2) && C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2))) {
                        continue;
                    }
                case 11:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 12:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 13:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 14:
                    if (mo50921r(i, t, t2) && C14869x7.m24150h(j, t) == C14869x7.m24150h(j, t2)) {
                        continue;
                    }
                case 15:
                    if (mo50921r(i, t, t2) && C14869x7.m24149g(j, t) == C14869x7.m24149g(j, t2)) {
                        continue;
                    }
                case 16:
                    if (mo50921r(i, t, t2) && C14869x7.m24150h(j, t) == C14869x7.m24150h(j, t2)) {
                        continue;
                    }
                case 17:
                    if (mo50921r(i, t, t2) && C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2));
                    break;
                case 50:
                    z = C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = (long) (this.f33100a[i + 2] & 1048575);
                    if (C14869x7.m24149g(j2, t) == C14869x7.m24149g(j2, t2) && C14615d7.m23481b(C14869x7.m24152j(j, t), C14869x7.m24152j(j, t2))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f33111l.mo50738c(t).equals(this.f33111l.mo50738c(t2))) {
            return false;
        }
        if (!this.f33105f) {
            return true;
        }
        this.f33112m.mo50589a(t);
        this.f33112m.mo50589a(t2);
        throw null;
    }

    /* renamed from: g */
    public final void mo50441g(T t, C14626e5 e5Var) throws IOException {
        if (!this.f33106g) {
            mo50924u(t, e5Var);
        } else if (!this.f33105f) {
            int length = this.f33100a.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = mo50914i(i);
                int i3 = this.f33100a[i];
                switch ((i2 >>> 20) & 255) {
                    case 0:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50464g(i3, C14869x7.m24147e((long) (i2 & 1048575), t));
                            break;
                        }
                    case 1:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50468k(C14869x7.m24148f((long) (i2 & 1048575), t), i3);
                            break;
                        }
                    case 2:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50471n(i3, C14869x7.m24150h((long) (i2 & 1048575), t));
                            break;
                        }
                    case 3:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50461d(i3, C14869x7.m24150h((long) (i2 & 1048575), t));
                            break;
                        }
                    case 4:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50470m(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 5:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50467j(i3, C14869x7.m24150h((long) (i2 & 1048575), t));
                            break;
                        }
                    case 6:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50466i(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 7:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50462e(i3, C14869x7.m24161s((long) (i2 & 1048575), t));
                            break;
                        }
                    case 8:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            m24012v(i3, C14869x7.m24152j((long) (i2 & 1048575), t), e5Var);
                            break;
                        }
                    case 9:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50472o(i3, mo50915k(i), C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 10:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50463f(i3, (zzix) C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 11:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50460c(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 12:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50465h(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 13:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50473p(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 14:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50474q(i3, C14869x7.m24150h((long) (i2 & 1048575), t));
                            break;
                        }
                    case 15:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50458a(i3, C14869x7.m24149g((long) (i2 & 1048575), t));
                            break;
                        }
                    case 16:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50459b(i3, C14869x7.m24150h((long) (i2 & 1048575), t));
                            break;
                        }
                    case 17:
                        if (!mo50922s(i, t)) {
                            break;
                        } else {
                            e5Var.mo50469l(i3, mo50915k(i), C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 18:
                        C14615d7.m23484e(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 19:
                        C14615d7.m23488i(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 20:
                        C14615d7.m23491l(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 21:
                        C14615d7.m23500u(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 22:
                        C14615d7.m23490k(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 23:
                        C14615d7.m23487h(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 24:
                        C14615d7.m23486g(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 25:
                        C14615d7.m23482c(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 26:
                        C14615d7.m23497r(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var);
                        break;
                    case 27:
                        C14615d7.m23492m(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, mo50915k(i));
                        break;
                    case 28:
                        C14615d7.m23483d(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var);
                        break;
                    case 29:
                        C14615d7.m23498s(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 30:
                        C14615d7.m23485f(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 31:
                        C14615d7.m23493n(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 32:
                        C14615d7.m23494o(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 33:
                        C14615d7.m23495p(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 34:
                        C14615d7.m23496q(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, false);
                        break;
                    case 35:
                        C14615d7.m23484e(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 36:
                        C14615d7.m23488i(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 37:
                        C14615d7.m23491l(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 38:
                        C14615d7.m23500u(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 39:
                        C14615d7.m23490k(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 40:
                        C14615d7.m23487h(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 41:
                        C14615d7.m23486g(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 42:
                        C14615d7.m23482c(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 43:
                        C14615d7.m23498s(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 44:
                        C14615d7.m23485f(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 45:
                        C14615d7.m23493n(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 46:
                        C14615d7.m23494o(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 47:
                        C14615d7.m23495p(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 48:
                        C14615d7.m23496q(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, true);
                        break;
                    case 49:
                        C14615d7.m23489j(i3, (List) C14869x7.m24152j((long) (i2 & 1048575), t), e5Var, mo50915k(i));
                        break;
                    case 50:
                        if (C14869x7.m24152j((long) (i2 & 1048575), t) == null) {
                            break;
                        } else {
                            C14718l6 l6Var = (C14718l6) mo50916l(i);
                            throw null;
                        }
                    case 51:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50464g(i3, ((Double) C14869x7.m24152j((long) (i2 & 1048575), t)).doubleValue());
                            break;
                        }
                    case 52:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50468k(((Float) C14869x7.m24152j((long) (i2 & 1048575), t)).floatValue(), i3);
                            break;
                        }
                    case 53:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50471n(i3, m24010j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 54:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50461d(i3, m24010j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 55:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50470m(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 56:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50467j(i3, m24010j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 57:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50466i(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 58:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50462e(i3, ((Boolean) C14869x7.m24152j((long) (i2 & 1048575), t)).booleanValue());
                            break;
                        }
                    case 59:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            m24012v(i3, C14869x7.m24152j((long) (i2 & 1048575), t), e5Var);
                            break;
                        }
                    case 60:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50472o(i3, mo50915k(i), C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 61:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50463f(i3, (zzix) C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 62:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50460c(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 63:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50465h(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 64:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50473p(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 65:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50474q(i3, m24010j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 66:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50458a(i3, m24009C((long) (i2 & 1048575), t));
                            break;
                        }
                    case 67:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50459b(i3, m24010j((long) (i2 & 1048575), t));
                            break;
                        }
                    case 68:
                        if (!mo50923t(i3, i, t)) {
                            break;
                        } else {
                            e5Var.mo50469l(i3, mo50915k(i), C14869x7.m24152j((long) (i2 & 1048575), t));
                            break;
                        }
                }
            }
            C14745n7<?, ?> n7Var = this.f33111l;
            n7Var.mo50744i(n7Var.mo50738c(t), e5Var);
        } else {
            this.f33112m.mo50589a(t);
            throw null;
        }
    }

    /* renamed from: h */
    public final boolean mo50442h(T t) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        while (true) {
            boolean z = true;
            if (i < this.f33108i) {
                int i4 = this.f33107h[i];
                int i5 = this.f33100a[i4];
                int i6 = mo50914i(i4);
                int i7 = this.f33100a[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    if (i8 != 1048575) {
                        i2 = f33099o.getInt(t, (long) i8);
                    }
                    i3 = i8;
                }
                if ((268435456 & i6) != 0) {
                    if (!(i3 == 1048575 ? mo50922s(i4, t) : (i2 & i9) != 0)) {
                        return false;
                    }
                }
                int i10 = (i6 >>> 20) & 255;
                if (i10 == 9 || i10 == 17) {
                    if (i3 == 1048575) {
                        z = mo50922s(i4, t);
                    } else if ((i2 & i9) == 0) {
                        z = false;
                    }
                    if (z && !mo50915k(i4).mo50442h(C14869x7.m24152j((long) (i6 & 1048575), t))) {
                        return false;
                    }
                } else {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (mo50923t(i5, i4, t) && !mo50915k(i4).mo50442h(C14869x7.m24152j((long) (i6 & 1048575), t))) {
                                return false;
                            }
                        } else if (i10 != 49) {
                            if (i10 == 50 && !((zzkw) C14869x7.m24152j((long) (i6 & 1048575), t)).isEmpty()) {
                                C14718l6 l6Var = (C14718l6) mo50916l(i4);
                                throw null;
                            }
                        }
                    }
                    List list = (List) C14869x7.m24152j((long) (i6 & 1048575), t);
                    if (!list.isEmpty()) {
                        C14602c7 k = mo50915k(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!k.mo50442h(list.get(i11))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i++;
            } else if (!this.f33105f) {
                return true;
            } else {
                this.f33112m.mo50589a(t);
                throw null;
            }
        }
    }

    /* renamed from: i */
    public final int mo50914i(int i) {
        return this.f33100a[i + 1];
    }

    /* renamed from: k */
    public final C14602c7 mo50915k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f33101b;
        C14602c7 c7Var = (C14602c7) objArr[i3];
        if (c7Var != null) {
            return c7Var;
        }
        C14602c7 a = C14892z6.f33192c.mo51009a((Class) objArr[i3 + 1]);
        this.f33101b[i3] = a;
        return a;
    }

    /* renamed from: l */
    public final Object mo50916l(int i) {
        int i2 = i / 3;
        return this.f33101b[i2 + i2];
    }

    /* renamed from: n */
    public final void mo50917n(int i, Object obj, Object obj2) {
        long i2 = (long) (mo50914i(i) & 1048575);
        if (mo50922s(i, obj2)) {
            Object j = C14869x7.m24152j(i2, obj);
            Object j2 = C14869x7.m24152j(i2, obj2);
            if (j != null && j2 != null) {
                C14869x7.m24159q(i2, obj, C14575a6.m23370b(j, j2));
                mo50919p(i, obj);
            } else if (j2 != null) {
                C14869x7.m24159q(i2, obj, j2);
                mo50919p(i, obj);
            }
        }
    }

    /* renamed from: o */
    public final void mo50918o(int i, Object obj, Object obj2) {
        int i2 = mo50914i(i);
        int i3 = this.f33100a[i];
        long j = (long) (i2 & 1048575);
        if (mo50923t(i3, i, obj2)) {
            Object j2 = mo50923t(i3, i, obj) ? C14869x7.m24152j(j, obj) : null;
            Object j3 = C14869x7.m24152j(j, obj2);
            if (j2 != null && j3 != null) {
                C14869x7.m24159q(j, obj, C14575a6.m23370b(j2, j3));
                mo50920q(i3, i, obj);
            } else if (j3 != null) {
                C14869x7.m24159q(j, obj, j3);
                mo50920q(i3, i, obj);
            }
        }
    }

    /* renamed from: p */
    public final void mo50919p(int i, Object obj) {
        int i2 = this.f33100a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C14869x7.m24158p(obj, (1 << (i2 >>> 20)) | C14869x7.m24149g(j, obj), j);
        }
    }

    /* renamed from: q */
    public final void mo50920q(int i, int i2, Object obj) {
        C14869x7.m24158p(obj, i, (long) (this.f33100a[i2 + 2] & 1048575));
    }

    /* renamed from: r */
    public final boolean mo50921r(int i, Object obj, Object obj2) {
        return mo50922s(i, obj) == mo50922s(i, obj2);
    }

    /* renamed from: s */
    public final boolean mo50922s(int i, Object obj) {
        int i2 = this.f33100a[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return (C14869x7.m24149g(j, obj) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = mo50914i(i);
        long j2 = (long) (i3 & 1048575);
        switch ((i3 >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(C14869x7.m24147e(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(C14869x7.m24148f(j2, obj)) != 0;
            case 2:
                return C14869x7.m24150h(j2, obj) != 0;
            case 3:
                return C14869x7.m24150h(j2, obj) != 0;
            case 4:
                return C14869x7.m24149g(j2, obj) != 0;
            case 5:
                return C14869x7.m24150h(j2, obj) != 0;
            case 6:
                return C14869x7.m24149g(j2, obj) != 0;
            case 7:
                return C14869x7.m24161s(j2, obj);
            case 8:
                Object j3 = C14869x7.m24152j(j2, obj);
                if (j3 instanceof String) {
                    return !((String) j3).isEmpty();
                }
                if (j3 instanceof zzix) {
                    return !zzix.zzb.equals(j3);
                }
                throw new IllegalArgumentException();
            case 9:
                return C14869x7.m24152j(j2, obj) != null;
            case 10:
                return !zzix.zzb.equals(C14869x7.m24152j(j2, obj));
            case 11:
                return C14869x7.m24149g(j2, obj) != 0;
            case 12:
                return C14869x7.m24149g(j2, obj) != 0;
            case 13:
                return C14869x7.m24149g(j2, obj) != 0;
            case 14:
                return C14869x7.m24150h(j2, obj) != 0;
            case 15:
                return C14869x7.m24149g(j2, obj) != 0;
            case 16:
                return C14869x7.m24150h(j2, obj) != 0;
            case 17:
                return C14869x7.m24152j(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: t */
    public final boolean mo50923t(int i, int i2, Object obj) {
        return C14869x7.m24149g((long) (this.f33100a[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: u */
    public final void mo50924u(T t, C14626e5 e5Var) throws IOException {
        int i;
        T t2 = t;
        C14626e5 e5Var2 = e5Var;
        if (!this.f33105f) {
            int length = this.f33100a.length;
            Unsafe unsafe = f33099o;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = mo50914i(i4);
                int[] iArr = this.f33100a;
                int i7 = iArr[i4];
                int i8 = (i6 >>> 20) & 255;
                if (i8 <= 17) {
                    int i9 = iArr[i4 + 2];
                    int i10 = i9 & i2;
                    if (i10 != i3) {
                        i5 = unsafe.getInt(t2, (long) i10);
                        i3 = i10;
                    }
                    i = 1 << (i9 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (i6 & i2);
                switch (i8) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            e5Var2.mo50464g(i7, C14869x7.m24147e(j, t2));
                            continue;
                        }
                    case 1:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50468k(C14869x7.m24148f(j, t2), i7);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50471n(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50461d(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50470m(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50467j(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50466i(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50462e(i7, C14869x7.m24161s(j, t2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i5 & i) != 0) {
                            m24012v(i7, unsafe.getObject(t2, j), e5Var2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50472o(i7, mo50915k(i4), unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50463f(i7, (zzix) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50460c(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50465h(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50473p(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50474q(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50458a(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50459b(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i5 & i) != 0) {
                            e5Var2.mo50469l(i7, mo50915k(i4), unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C14615d7.m23484e(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 19:
                        C14615d7.m23488i(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 20:
                        C14615d7.m23491l(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 21:
                        C14615d7.m23500u(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 22:
                        C14615d7.m23490k(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 23:
                        C14615d7.m23487h(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 24:
                        C14615d7.m23486g(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 25:
                        C14615d7.m23482c(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        continue;
                    case 26:
                        C14615d7.m23497r(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2);
                        break;
                    case 27:
                        C14615d7.m23492m(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, mo50915k(i4));
                        break;
                    case 28:
                        C14615d7.m23483d(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2);
                        break;
                    case 29:
                        C14615d7.m23498s(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 30:
                        C14615d7.m23485f(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 31:
                        C14615d7.m23493n(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 32:
                        C14615d7.m23494o(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 33:
                        C14615d7.m23495p(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 34:
                        C14615d7.m23496q(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, false);
                        break;
                    case 35:
                        C14615d7.m23484e(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 36:
                        C14615d7.m23488i(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 37:
                        C14615d7.m23491l(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 38:
                        C14615d7.m23500u(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 39:
                        C14615d7.m23490k(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 40:
                        C14615d7.m23487h(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 41:
                        C14615d7.m23486g(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 42:
                        C14615d7.m23482c(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 43:
                        C14615d7.m23498s(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 44:
                        C14615d7.m23485f(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 45:
                        C14615d7.m23493n(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 46:
                        C14615d7.m23494o(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 47:
                        C14615d7.m23495p(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 48:
                        C14615d7.m23496q(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, true);
                        break;
                    case 49:
                        C14615d7.m23489j(this.f33100a[i4], (List) unsafe.getObject(t2, j), e5Var2, mo50915k(i4));
                        break;
                    case 50:
                        if (unsafe.getObject(t2, j) != null) {
                            C14718l6 l6Var = (C14718l6) mo50916l(i4);
                            throw null;
                        }
                        break;
                    case 51:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50464g(i7, ((Double) C14869x7.m24152j(j, t2)).doubleValue());
                            break;
                        }
                        break;
                    case 52:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50468k(((Float) C14869x7.m24152j(j, t2)).floatValue(), i7);
                            break;
                        }
                        break;
                    case 53:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50471n(i7, m24010j(j, t2));
                            break;
                        }
                        break;
                    case 54:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50461d(i7, m24010j(j, t2));
                            break;
                        }
                        break;
                    case 55:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50470m(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 56:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50467j(i7, m24010j(j, t2));
                            break;
                        }
                        break;
                    case 57:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50466i(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 58:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50462e(i7, ((Boolean) C14869x7.m24152j(j, t2)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        if (mo50923t(i7, i4, t2)) {
                            m24012v(i7, unsafe.getObject(t2, j), e5Var2);
                            break;
                        }
                        break;
                    case 60:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50472o(i7, mo50915k(i4), unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 61:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50463f(i7, (zzix) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50460c(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 63:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50465h(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 64:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50473p(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 65:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50474q(i7, m24010j(j, t2));
                            break;
                        }
                        break;
                    case 66:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50458a(i7, m24009C(j, t2));
                            break;
                        }
                        break;
                    case 67:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50459b(i7, m24010j(j, t2));
                            break;
                        }
                        break;
                    case 68:
                        if (mo50923t(i7, i4, t2)) {
                            e5Var2.mo50469l(i7, mo50915k(i4), unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            C14745n7<?, ?> n7Var = this.f33111l;
            n7Var.mo50744i(n7Var.mo50738c(t2), e5Var2);
            return;
        }
        this.f33112m.mo50589a(t2);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c2, code lost:
        r10 = r0;
        r0 = r12 | r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c6, code lost:
        r12 = r0;
        r4 = r1;
        r8 = r5;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02cc, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e7, code lost:
        r24 = r4;
        r20 = r7;
        r2 = r10;
        r29 = r11;
        r7 = r12;
        r14 = r15;
        r16 = r21;
        r10 = r6;
        r6 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023d, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023e, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0259, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027e, code lost:
        r0 = r12 | r26;
        r1 = r8;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a1, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a2, code lost:
        r4 = true;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50925w(T r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.measurement.C14854w4 r39) throws java.io.IOException {
        /*
            r33 = this;
            r15 = r33
            r14 = r34
            r12 = r37
            r13 = r39
            sun.misc.Unsafe r11 = f33099o
            r4 = r35
            r0 = r36
            r1 = r38
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r6) goto L_0x0493
            int r10 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24139l(r0, r4, r10, r13)
            int r10 = r13.f33145a
            r31 = r10
            r10 = r0
            r0 = r31
        L_0x002e:
            int r8 = r0 >>> 3
            r9 = r0 & 7
            r16 = r0
            r0 = 3
            if (r8 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.f33102c
            if (r8 < r2) goto L_0x0045
            int r2 = r15.f33103d
            if (r8 > r2) goto L_0x0045
            int r2 = r15.mo50913H(r8, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r3 = r2
            r2 = 0
            goto L_0x0059
        L_0x0049:
            int r2 = r15.f33102c
            if (r8 < r2) goto L_0x0057
            int r2 = r15.f33103d
            if (r8 > r2) goto L_0x0057
            r2 = 0
            int r3 = r15.mo50913H(r8, r2)
            goto L_0x0059
        L_0x0057:
            r2 = 0
            r3 = -1
        L_0x0059:
            r12 = -1
            if (r3 != r12) goto L_0x0071
            r6 = r1
            r19 = r2
            r20 = r19
            r18 = r5
            r2 = r10
            r29 = r11
            r28 = r12
            r14 = r15
            r10 = r16
            r24 = 1
            r16 = r8
            goto L_0x0429
        L_0x0071:
            int[] r1 = r15.f33100a
            int r19 = r3 + 1
            r12 = r1[r19]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r21 = r8
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r8
            r22 = r9
            long r8 = (long) r0
            r0 = 17
            r24 = r12
            if (r2 > r0) goto L_0x02f9
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r25 = 1
            int r26 = r25 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a9
            if (r5 == r1) goto L_0x00a1
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L_0x00a1:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto L_0x00ab
        L_0x00a9:
            r12 = r7
            r7 = r5
        L_0x00ab:
            r0 = 5
            switch(r2) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x0283;
                case 2: goto L_0x025c;
                case 3: goto L_0x025c;
                case 4: goto L_0x0241;
                case 5: goto L_0x0218;
                case 6: goto L_0x01ff;
                case 7: goto L_0x01db;
                case 8: goto L_0x01b5;
                case 9: goto L_0x0183;
                case 10: goto L_0x0168;
                case 11: goto L_0x0241;
                case 12: goto L_0x012d;
                case 13: goto L_0x01ff;
                case 14: goto L_0x0218;
                case 15: goto L_0x0111;
                case 16: goto L_0x00df;
                default: goto L_0x00af;
            }
        L_0x00af:
            r13 = r39
            r18 = r7
            r5 = r16
            r0 = 3
            r4 = 1
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x02cc
            com.google.android.gms.internal.measurement.c7 r0 = r15.mo50915k(r7)
            int r1 = r21 << 3
            r4 = r1 | 4
            r1 = r35
            r2 = r10
            r3 = r37
            r6 = r5
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24131d(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r26
            if (r1 != 0) goto L_0x02ce
            java.lang.Object r1 = r13.f33147c
            r11.putObject(r14, r8, r1)
            goto L_0x02db
        L_0x00df:
            if (r22 != 0) goto L_0x0104
            r13 = r39
            int r10 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r4, r10, r13)
            long r1 = r13.f33146b
            long r22 = p628nj.C18263b.m30881z0(r1)
            r5 = r16
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r34
            r18 = r7
            r19 = 0
            r7 = r3
            r2 = r8
            r8 = r4
            r9 = r5
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x027e
        L_0x0104:
            r13 = r39
            r18 = r7
            r9 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            goto L_0x023e
        L_0x0111:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            if (r22 != 0) goto L_0x023d
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r4, r10, r13)
            int r1 = r13.f33145a
            int r1 = p628nj.C18263b.m30877x0(r1)
            r11.putInt(r14, r8, r1)
            goto L_0x0259
        L_0x012d:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            if (r22 != 0) goto L_0x023d
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r4, r10, r13)
            int r1 = r13.f33145a
            int r3 = r7 / 3
            java.lang.Object[] r2 = r15.f33101b
            int r3 = r3 + r3
            r10 = 1
            int r3 = r3 + r10
            r2 = r2[r3]
            com.google.android.gms.internal.measurement.w5 r2 = (com.google.android.gms.internal.measurement.C14855w5) r2
            if (r2 == 0) goto L_0x0163
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x0154
            goto L_0x0163
        L_0x0154:
            com.google.android.gms.internal.measurement.o7 r2 = m24013x(r34)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r2.mo50762c(r5, r1)
            r8 = r5
            goto L_0x0342
        L_0x0163:
            r11.putInt(r14, r8, r1)
            goto L_0x0259
        L_0x0168:
            r13 = r39
            r18 = r7
            r5 = r16
            r0 = 2
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x023d
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24129b(r4, r10, r13)
            java.lang.Object r1 = r13.f33147c
            r11.putObject(r14, r8, r1)
            goto L_0x0259
        L_0x0183:
            r13 = r39
            r18 = r7
            r5 = r16
            r0 = 2
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x023d
            com.google.android.gms.internal.measurement.c7 r0 = r15.mo50915k(r7)
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24132e(r0, r4, r10, r6, r13)
            r1 = r12 & r26
            if (r1 != 0) goto L_0x01a6
            java.lang.Object r1 = r13.f33147c
            r11.putObject(r14, r8, r1)
            goto L_0x0259
        L_0x01a6:
            java.lang.Object r1 = r11.getObject(r14, r8)
            java.lang.Object r2 = r13.f33147c
            com.google.android.gms.internal.measurement.t5 r1 = com.google.android.gms.internal.measurement.C14575a6.m23370b(r1, r2)
            r11.putObject(r14, r8, r1)
            goto L_0x0259
        L_0x01b5:
            r13 = r39
            r18 = r7
            r5 = r16
            r0 = 2
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x023d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r24 & r0
            if (r0 != 0) goto L_0x01d0
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24135h(r4, r10, r13)
            goto L_0x01d4
        L_0x01d0:
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24136i(r4, r10, r13)
        L_0x01d4:
            java.lang.Object r1 = r13.f33147c
            r11.putObject(r14, r8, r1)
            goto L_0x0259
        L_0x01db:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != 0) goto L_0x023d
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r4, r10, r13)
            long r1 = r13.f33146b
            r22 = 0
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x01f8
            r10 = 1
            goto L_0x01fa
        L_0x01f8:
            r10 = r19
        L_0x01fa:
            com.google.android.gms.internal.measurement.C14869x7.m24155m(r14, r8, r10)
            goto L_0x0259
        L_0x01ff:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x023d
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r10, r4)
            r11.putInt(r14, r8, r0)
            int r0 = r10 + 4
            goto L_0x0259
        L_0x0218:
            r13 = r39
            r18 = r7
            r5 = r16
            r0 = 1
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != r0) goto L_0x023d
            long r22 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r10, r4)
            r0 = r11
            r1 = r34
            r2 = r8
            r8 = r4
            r9 = r5
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r8
            r5 = r9
            goto L_0x02c2
        L_0x023d:
            r9 = r5
        L_0x023e:
            r6 = r9
            goto L_0x02a2
        L_0x0241:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != 0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24138k(r4, r10, r13)
            int r1 = r13.f33145a
            r11.putInt(r14, r8, r1)
        L_0x0259:
            r1 = r4
            goto L_0x02c2
        L_0x025c:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r3 = r22
            if (r3 != 0) goto L_0x02a1
            int r10 = com.google.android.gms.internal.measurement.C14866x4.m24141n(r4, r10, r13)
            long r2 = r13.f33146b
            r0 = r11
            r1 = r34
            r22 = r2
            r2 = r8
            r8 = r4
            r9 = r5
            r4 = r22
            r0.putLong(r1, r2, r4)
        L_0x027e:
            r0 = r12 | r26
            r1 = r8
            r5 = r9
            goto L_0x02c6
        L_0x0283:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r1 = r4
            r3 = r22
            if (r3 != r0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24130c(r10, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C14869x7.m24157o(r14, r8, r0)
            int r0 = r10 + 4
            goto L_0x02c2
        L_0x02a1:
            r6 = r5
        L_0x02a2:
            r4 = 1
            goto L_0x02e7
        L_0x02a4:
            r13 = r39
            r18 = r7
            r5 = r16
            r19 = 0
            r16 = r1
            r7 = r3
            r1 = r4
            r3 = r22
            r4 = 1
            if (r3 != r4) goto L_0x02cc
            long r2 = com.google.android.gms.internal.measurement.C14866x4.m24142o(r10, r1)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            com.google.android.gms.internal.measurement.C14869x7.m24156n(r14, r8, r2)
            int r0 = r10 + 8
        L_0x02c2:
            r2 = r12 | r26
            r10 = r0
            r0 = r2
        L_0x02c6:
            r12 = r0
            r4 = r1
            r8 = r5
            r0 = r10
            goto L_0x0342
        L_0x02cc:
            r6 = r5
            goto L_0x02e7
        L_0x02ce:
            java.lang.Object r1 = r11.getObject(r14, r8)
            java.lang.Object r2 = r13.f33147c
            com.google.android.gms.internal.measurement.t5 r1 = com.google.android.gms.internal.measurement.C14575a6.m23370b(r1, r2)
            r11.putObject(r14, r8, r1)
        L_0x02db:
            r1 = r12 | r26
            r4 = r35
            r12 = r1
            r8 = r6
            r5 = r18
            r6 = r37
            goto L_0x0344
        L_0x02e7:
            r24 = r4
            r20 = r7
            r2 = r10
            r29 = r11
            r7 = r12
            r14 = r15
            r16 = r21
            r28 = -1
            r10 = r6
            r6 = r38
            goto L_0x0429
        L_0x02f9:
            r12 = r7
            r6 = r16
            r4 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r19 = 0
            r7 = r3
            r3 = r22
            r0 = 27
            if (r2 != r0) goto L_0x0363
            r0 = 2
            if (r3 != r0) goto L_0x0350
            java.lang.Object r0 = r11.getObject(r14, r8)
            com.google.android.gms.internal.measurement.z5 r0 = (com.google.android.gms.internal.measurement.C14891z5) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0329
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0321
            r1 = 10
            goto L_0x0322
        L_0x0321:
            int r1 = r1 + r1
        L_0x0322:
            com.google.android.gms.internal.measurement.z5 r0 = r0.mo50356b(r1)
            r11.putObject(r14, r8, r0)
        L_0x0329:
            r8 = r0
            com.google.android.gms.internal.measurement.c7 r0 = r15.mo50915k(r7)
            r1 = r6
            r2 = r35
            r3 = r10
            r4 = r37
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r39
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24133f(r0, r1, r2, r3, r4, r5, r6)
            r4 = r35
            r6 = r37
        L_0x0342:
            r5 = r18
        L_0x0344:
            r1 = r38
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r21
            r12 = r37
            goto L_0x0019
        L_0x0350:
            r18 = r5
            r24 = r4
            r26 = r6
            r30 = r7
            r15 = r10
            r29 = r11
            r27 = r12
            r16 = r21
            r28 = -1
            goto L_0x03d0
        L_0x0363:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L_0x03ae
            r5 = r24
            long r0 = (long) r5
            r22 = r0
            r0 = r33
            r1 = r34
            r5 = r2
            r2 = r35
            r36 = r3
            r3 = r10
            r24 = r4
            r4 = r37
            r25 = r5
            r5 = r6
            r26 = r6
            r6 = r21
            r27 = r12
            r12 = r7
            r7 = r36
            r28 = -1
            r31 = r8
            r9 = r21
            r20 = r31
            r8 = r12
            r16 = r9
            r15 = r10
            r9 = r22
            r29 = r11
            r11 = r25
            r30 = r12
            r12 = r20
            r14 = r39
            int r0 = r0.mo50912G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r33
            if (r0 == r15) goto L_0x03ac
            r20 = r30
            goto L_0x0407
        L_0x03ac:
            r10 = r0
            goto L_0x03d3
        L_0x03ae:
            r25 = r2
            r36 = r3
            r26 = r6
            r30 = r7
            r15 = r10
            r29 = r11
            r27 = r12
            r16 = r21
            r5 = r24
            r28 = -1
            r24 = r4
            r20 = r8
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x03e2
            r7 = r36
            r0 = 2
            if (r7 == r0) goto L_0x03d6
        L_0x03d0:
            r14 = r33
            r10 = r15
        L_0x03d3:
            r20 = r30
            goto L_0x0422
        L_0x03d6:
            r14 = r33
            r15 = r34
            r10 = r20
            r13 = r30
            r14.mo50909D(r15, r13, r10)
            throw r17
        L_0x03e2:
            r14 = r33
            r7 = r36
            r12 = r15
            r10 = r20
            r13 = r30
            r15 = r34
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r12
            r4 = r37
            r8 = r5
            r5 = r26
            r6 = r16
            r15 = r12
            r12 = r13
            r20 = r13
            r13 = r39
            int r0 = r0.mo50910E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0421
        L_0x0407:
            r4 = r35
            r6 = r37
            r12 = r6
            r1 = r38
            r13 = r39
            r15 = r14
            r2 = r16
            r5 = r18
            r3 = r20
            r16 = r26
            r7 = r27
            r11 = r29
            r14 = r34
            goto L_0x0019
        L_0x0421:
            r10 = r0
        L_0x0422:
            r6 = r38
            r2 = r10
            r10 = r26
            r7 = r27
        L_0x0429:
            if (r10 != r6) goto L_0x0435
            if (r6 == 0) goto L_0x0435
            r11 = r34
            r0 = r2
            r1 = r6
            r5 = r18
            goto L_0x049f
        L_0x0435:
            boolean r0 = r14.f33105f
            if (r0 == 0) goto L_0x046a
            r8 = r39
            com.google.android.gms.internal.measurement.h5 r0 = r8.f33148d
            com.google.android.gms.internal.measurement.h5 r1 = com.google.android.gms.internal.measurement.C14665h5.m23616a()
            if (r0 == r1) goto L_0x0467
            com.google.android.gms.internal.measurement.r6 r0 = r14.f33104e
            com.google.android.gms.internal.measurement.h5 r1 = r8.f33148d
            r9 = r16
            com.google.android.gms.internal.measurement.s5 r0 = r1.mo50559b(r0, r9)
            if (r0 != 0) goto L_0x0461
            com.google.android.gms.internal.measurement.o7 r4 = m24013x(r34)
            r0 = r10
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24137j(r0, r1, r2, r3, r4, r5)
            r11 = r34
            goto L_0x047f
        L_0x0461:
            r11 = r34
            r0 = r11
            com.google.android.gms.internal.measurement.r5 r0 = (com.google.android.gms.internal.measurement.C14795r5) r0
            throw r17
        L_0x0467:
            r11 = r34
            goto L_0x046e
        L_0x046a:
            r11 = r34
            r8 = r39
        L_0x046e:
            r9 = r16
            com.google.android.gms.internal.measurement.o7 r4 = m24013x(r34)
            r0 = r10
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.C14866x4.m24137j(r0, r1, r2, r3, r4, r5)
        L_0x047f:
            r4 = r35
            r12 = r37
            r1 = r6
            r13 = r8
            r2 = r9
            r16 = r10
            r15 = r14
            r5 = r18
            r3 = r20
            r6 = r12
            r14 = r11
            r11 = r29
            goto L_0x0019
        L_0x0493:
            r18 = r5
            r27 = r7
            r29 = r11
            r11 = r14
            r14 = r15
            r24 = 1
            r10 = r16
        L_0x049f:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x04aa
            long r3 = (long) r5
            r5 = r29
            r5.putInt(r11, r3, r7)
        L_0x04aa:
            int r3 = r14.f33108i
        L_0x04ac:
            int r4 = r14.f33109j
            if (r3 >= r4) goto L_0x04de
            int[] r4 = r14.f33107h
            r4 = r4[r3]
            int[] r5 = r14.f33100a
            r5 = r5[r4]
            int r5 = r14.mo50914i(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C14869x7.m24152j(r5, r11)
            if (r5 != 0) goto L_0x04c5
            goto L_0x04d2
        L_0x04c5:
            int r6 = r4 / 3
            java.lang.Object[] r7 = r14.f33101b
            int r6 = r6 + r6
            int r6 = r6 + 1
            r6 = r7[r6]
            com.google.android.gms.internal.measurement.w5 r6 = (com.google.android.gms.internal.measurement.C14855w5) r6
            if (r6 != 0) goto L_0x04d5
        L_0x04d2:
            int r3 = r3 + 1
            goto L_0x04ac
        L_0x04d5:
            com.google.android.gms.internal.measurement.zzkw r5 = (com.google.android.gms.internal.measurement.zzkw) r5
            java.lang.Object r0 = r14.mo50916l(r4)
            com.google.android.gms.internal.measurement.l6 r0 = (com.google.android.gms.internal.measurement.C14718l6) r0
            throw r17
        L_0x04de:
            if (r1 != 0) goto L_0x04ea
            r2 = r37
            if (r0 != r2) goto L_0x04e5
            goto L_0x04f0
        L_0x04e5:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.zze()
            throw r0
        L_0x04ea:
            r2 = r37
            if (r0 > r2) goto L_0x04f1
            if (r10 != r1) goto L_0x04f1
        L_0x04f0:
            return r0
        L_0x04f1:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14832u6.mo50925w(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.w4):int");
    }

    public final T zze() {
        return ((C14819t5) this.f33104e).mo50282q(4);
    }
}
