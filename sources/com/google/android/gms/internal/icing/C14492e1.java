package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0069a;
import androidx.compose.animation.C0391c;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p003a2.C0023f;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.icing.e1 */
public final class C14492e1<T> implements C14524m1<T> {

    /* renamed from: l */
    public static final int[] f32621l = new int[0];

    /* renamed from: m */
    public static final Unsafe f32622m = C14505h2.m23040n();

    /* renamed from: a */
    public final int[] f32623a;

    /* renamed from: b */
    public final Object[] f32624b;

    /* renamed from: c */
    public final C14480b1 f32625c;

    /* renamed from: d */
    public final boolean f32626d;

    /* renamed from: e */
    public final boolean f32627e;

    /* renamed from: f */
    public final int[] f32628f;

    /* renamed from: g */
    public final int f32629g;

    /* renamed from: h */
    public final int f32630h;

    /* renamed from: i */
    public final C14539q0 f32631i;

    /* renamed from: j */
    public final C14561x1<?, ?> f32632j;

    /* renamed from: k */
    public final C14553v<?> f32633k;

    public C14492e1(int[] iArr, Object[] objArr, C14480b1 b1Var, boolean z, int[] iArr2, int i, int i2, C14539q0 q0Var, C14561x1 x1Var, C14553v vVar, C14557w0 w0Var) {
        this.f32623a = iArr;
        this.f32624b = objArr;
        this.f32627e = z;
        this.f32626d = vVar != null && vVar.mo49945a(b1Var);
        this.f32628f = iArr2;
        this.f32629g = i;
        this.f32630h = i2;
        this.f32631i = q0Var;
        this.f32632j = x1Var;
        this.f32633k = vVar;
        this.f32625c = b1Var;
    }

    /* renamed from: m */
    public static final void m22957m(int i, Object obj, C14544s sVar) throws IOException {
        if (obj instanceof String) {
            sVar.f32694a.mo49869i(i, (String) obj);
            return;
        }
        sVar.mo49906l(i, (zzcf) obj);
    }

    /* renamed from: n */
    public static C14492e1 m22958n(C14566z0 z0Var, C14539q0 q0Var, C14561x1 x1Var, C14553v vVar, C14557w0 w0Var) {
        if (z0Var instanceof C14520l1) {
            return m22959o((C14520l1) z0Var, q0Var, x1Var, vVar, w0Var);
        }
        C14558w1 w1Var = (C14558w1) z0Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x034b  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.icing.C14492e1 m22959o(com.google.android.gms.internal.icing.C14520l1 r30, com.google.android.gms.internal.icing.C14539q0 r31, com.google.android.gms.internal.icing.C14561x1 r32, com.google.android.gms.internal.icing.C14553v r33, com.google.android.gms.internal.icing.C14557w0 r34) {
        /*
            int r0 = r30.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r8 = 1
            goto L_0x000b
        L_0x000a:
            r8 = r1
        L_0x000b:
            java.lang.String r0 = r30.mo49843a()
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
            r9 = 13
        L_0x0034:
            int r10 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r6 = r6 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r9
            r6 = r6 | r4
            r4 = r10
        L_0x0047:
            if (r6 != 0) goto L_0x0053
            int[] r6 = f32621l
            r9 = r1
            r10 = r9
            r12 = r10
            r14 = r12
            r11 = r6
            r6 = r14
            goto L_0x0142
        L_0x0053:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0072
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x005f:
            int r10 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x006f
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r9
            r4 = r4 | r6
            int r9 = r9 + 13
            r6 = r10
            goto L_0x005f
        L_0x006f:
            int r6 = r6 << r9
            r4 = r4 | r6
            r6 = r10
        L_0x0072:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0091
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007e:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r6 = r6 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x007e
        L_0x008e:
            int r9 = r9 << r10
            r6 = r6 | r9
            r9 = r11
        L_0x0091:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00a4
        L_0x0099:
            int r9 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00a3
            r10 = r9
            goto L_0x0099
        L_0x00a3:
            r10 = r9
        L_0x00a4:
            int r9 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00b7
        L_0x00ac:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b6
            r9 = r10
            goto L_0x00ac
        L_0x00b6:
            r9 = r10
        L_0x00b7:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00c3:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00c3
        L_0x00d3:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00d6:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00f5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00e2:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00e2
        L_0x00f2:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00f5:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x0114
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x0101:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x0101
        L_0x0111:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x0114:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0133
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0120:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0130
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0120
        L_0x0130:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0133:
            int r14 = r12 + r10
            int r14 = r14 + r11
            int[] r11 = new int[r14]
            int r14 = r4 + r4
            int r14 = r14 + r6
            r6 = r4
            r4 = r13
            r29 = r12
            r12 = r10
            r10 = r29
        L_0x0142:
            sun.misc.Unsafe r13 = f32622m
            java.lang.Object[] r15 = r30.mo49844b()
            com.google.android.gms.internal.icing.b1 r16 = r30.zzb()
            java.lang.Class r1 = r16.getClass()
            int r7 = r9 * 3
            int[] r7 = new int[r7]
            int r9 = r9 + r9
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r12 = r12 + r10
            r19 = r10
            r20 = r12
            r17 = 0
            r18 = 0
        L_0x0160:
            if (r4 >= r3) goto L_0x0397
            int r21 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0188
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r21
            r21 = 13
        L_0x0170:
            int r23 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x0182
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r21
            r4 = r4 | r2
            int r21 = r21 + 13
            r2 = r23
            goto L_0x0170
        L_0x0182:
            int r2 = r2 << r21
            r4 = r4 | r2
            r2 = r23
            goto L_0x018a
        L_0x0188:
            r2 = r21
        L_0x018a:
            int r21 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01b7
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r21
            r21 = 13
        L_0x0198:
            int r24 = r5 + 1
            char r5 = r0.charAt(r5)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01b1
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r21
            r2 = r2 | r3
            int r21 = r21 + 13
            r5 = r24
            r3 = r25
            goto L_0x0198
        L_0x01b1:
            int r3 = r5 << r21
            r2 = r2 | r3
            r3 = r24
            goto L_0x01bb
        L_0x01b7:
            r25 = r3
            r3 = r21
        L_0x01bb:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r21 = r12
            r12 = r2 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x01c9
            int r12 = r17 + 1
            r11[r17] = r18
            r17 = r12
        L_0x01c9:
            r12 = 51
            if (r5 < r12) goto L_0x0271
            int r12 = r3 + 1
            char r3 = r0.charAt(r3)
            r24 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r12) goto L_0x01ff
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r12 = r24
            r24 = 13
        L_0x01e0:
            int r27 = r12 + 1
            char r12 = r0.charAt(r12)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r10) goto L_0x01f9
            r10 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r3 = r3 | r10
            int r24 = r24 + 13
            r12 = r27
            r10 = r28
            goto L_0x01e0
        L_0x01f9:
            int r10 = r12 << r24
            r3 = r3 | r10
            r12 = r27
            goto L_0x0203
        L_0x01ff:
            r28 = r10
            r12 = r24
        L_0x0203:
            int r10 = r5 + -51
            r24 = r12
            r12 = 9
            if (r10 == r12) goto L_0x0224
            r12 = 17
            if (r10 != r12) goto L_0x0210
            goto L_0x0224
        L_0x0210:
            r12 = 12
            if (r10 != r12) goto L_0x0232
            if (r8 != 0) goto L_0x0232
            int r10 = r18 / 3
            int r12 = r14 + 1
            int r10 = r10 + r10
            r22 = 1
            int r10 = r10 + 1
            r14 = r15[r14]
            r9[r10] = r14
            goto L_0x0231
        L_0x0224:
            int r10 = r18 / 3
            int r12 = r14 + 1
            int r10 = r10 + r10
            r22 = 1
            int r10 = r10 + 1
            r14 = r15[r14]
            r9[r10] = r14
        L_0x0231:
            r14 = r12
        L_0x0232:
            int r3 = r3 + r3
            r10 = r15[r3]
            boolean r12 = r10 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x023c
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0244
        L_0x023c:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m22960p(r1, r10)
            r15[r3] = r10
        L_0x0244:
            r12 = r6
            r27 = r7
            long r6 = r13.objectFieldOffset(r10)
            int r6 = (int) r6
            int r3 = r3 + 1
            r7 = r15[r3]
            boolean r10 = r7 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0257
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x025f
        L_0x0257:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m22960p(r1, r7)
            r15[r3] = r7
        L_0x025f:
            r3 = r6
            long r6 = r13.objectFieldOffset(r7)
            int r6 = (int) r6
            r7 = r6
            r26 = r24
            r22 = 1
            r6 = r3
            r24 = r14
            r3 = 0
            r14 = r11
            goto L_0x0360
        L_0x0271:
            r12 = r6
            r27 = r7
            r28 = r10
            int r6 = r14 + 1
            r7 = r15[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m22960p(r1, r7)
            r10 = 49
            r14 = 9
            if (r5 == r14) goto L_0x02e6
            r14 = 17
            if (r5 != r14) goto L_0x028b
            goto L_0x02e6
        L_0x028b:
            r14 = 27
            if (r5 == r14) goto L_0x02d8
            if (r5 != r10) goto L_0x0292
            goto L_0x02d8
        L_0x0292:
            r14 = 12
            if (r5 == r14) goto L_0x02c5
            r14 = 30
            if (r5 == r14) goto L_0x02c5
            r14 = 44
            if (r5 != r14) goto L_0x029f
            goto L_0x02c5
        L_0x029f:
            r14 = 50
            if (r5 != r14) goto L_0x02d5
            int r14 = r19 + 1
            r11[r19] = r18
            int r19 = r18 / 3
            int r19 = r19 + r19
            int r24 = r6 + 1
            r6 = r15[r6]
            r9[r19] = r6
            r6 = r2 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02c0
            int r6 = r24 + 1
            int r19 = r19 + 1
            r24 = r15[r24]
            r9[r19] = r24
            r19 = r14
            goto L_0x02d5
        L_0x02c0:
            r19 = r14
        L_0x02c2:
            r22 = 1
            goto L_0x02f5
        L_0x02c5:
            if (r8 != 0) goto L_0x02d5
            int r14 = r18 / 3
            int r24 = r6 + 1
            int r14 = r14 + r14
            r22 = 1
            int r14 = r14 + 1
            r6 = r15[r6]
            r9[r14] = r6
            goto L_0x02c2
        L_0x02d5:
            r22 = 1
            goto L_0x02f3
        L_0x02d8:
            int r14 = r18 / 3
            int r24 = r6 + 1
            int r14 = r14 + r14
            r22 = 1
            int r14 = r14 + 1
            r6 = r15[r6]
            r9[r14] = r6
            goto L_0x02f5
        L_0x02e6:
            r22 = 1
            int r14 = r18 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r24 = r7.getType()
            r9[r14] = r24
        L_0x02f3:
            r24 = r6
        L_0x02f5:
            long r6 = r13.objectFieldOffset(r7)
            int r6 = (int) r6
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r14 = 4096(0x1000, float:5.74E-42)
            if (r7 != r14) goto L_0x034b
            r7 = 17
            if (r5 > r7) goto L_0x034b
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0329
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0313:
            int r26 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r14) goto L_0x0325
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r23
            r3 = r3 | r7
            int r23 = r23 + 13
            r7 = r26
            goto L_0x0313
        L_0x0325:
            int r7 = r7 << r23
            r3 = r3 | r7
            goto L_0x032b
        L_0x0329:
            r26 = r7
        L_0x032b:
            int r7 = r12 + r12
            int r23 = r3 / 32
            int r23 = r23 + r7
            r7 = r15[r23]
            boolean r14 = r7 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x033a
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0342
        L_0x033a:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m22960p(r1, r7)
            r15[r23] = r7
        L_0x0342:
            r14 = r11
            long r10 = r13.objectFieldOffset(r7)
            int r7 = (int) r10
            int r3 = r3 % 32
            goto L_0x0352
        L_0x034b:
            r14 = r11
            r26 = r3
            r3 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0352:
            r10 = 18
            if (r5 < r10) goto L_0x0360
            r10 = 49
            if (r5 > r10) goto L_0x0360
            int r10 = r20 + 1
            r14[r20] = r6
            r20 = r10
        L_0x0360:
            int r10 = r18 + 1
            r27[r18] = r4
            int r4 = r10 + 1
            r11 = r2 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x036d
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x036e
        L_0x036d:
            r11 = 0
        L_0x036e:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0375
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0376
        L_0x0375:
            r2 = 0
        L_0x0376:
            r2 = r2 | r11
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r6
            r27[r10] = r2
            int r18 = r4 + 1
            int r2 = r3 << 20
            r2 = r2 | r7
            r27[r4] = r2
            r6 = r12
            r11 = r14
            r12 = r21
            r14 = r24
            r3 = r25
            r4 = r26
            r7 = r27
            r10 = r28
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0160
        L_0x0397:
            r27 = r7
            r28 = r10
            r14 = r11
            r21 = r12
            com.google.android.gms.internal.icing.e1 r0 = new com.google.android.gms.internal.icing.e1
            com.google.android.gms.internal.icing.b1 r7 = r30.zzb()
            r4 = r0
            r5 = r27
            r6 = r9
            r9 = r14
            r11 = r21
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14492e1.m22959o(com.google.android.gms.internal.icing.l1, com.google.android.gms.internal.icing.q0, com.google.android.gms.internal.icing.x1, com.google.android.gms.internal.icing.v, com.google.android.gms.internal.icing.w0):com.google.android.gms.internal.icing.e1");
    }

    /* renamed from: p */
    public static Field m22960p(Class<?> cls, String str) {
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

    /* renamed from: w */
    public static int m22961w(long j, Object obj) {
        return ((Integer) C14505h2.m23038l(j, obj)).intValue();
    }

    /* renamed from: x */
    public static long m22962x(long j, Object obj) {
        return ((Long) C14505h2.m23038l(j, obj)).longValue();
    }

    /* renamed from: a */
    public final boolean mo49762a(T t) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        while (true) {
            boolean z = true;
            if (i < this.f32629g) {
                int i4 = this.f32628f[i];
                int i5 = this.f32623a[i4];
                int v = mo49779v(i4);
                int i6 = this.f32623a[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i3) {
                    if (i7 != 1048575) {
                        i2 = f32622m.getInt(t, (long) i7);
                    }
                    i3 = i7;
                }
                if ((268435456 & v) != 0) {
                    if (!(i3 == 1048575 ? mo49769h(i4, t) : (i2 & i8) != 0)) {
                        return false;
                    }
                }
                int i9 = (v >>> 20) & 255;
                if (i9 == 9 || i9 == 17) {
                    if (i3 == 1048575) {
                        z = mo49769h(i4, t);
                    } else if ((i2 & i8) == 0) {
                        z = false;
                    }
                    if (z && !mo49778u(i4).mo49762a(C14505h2.m23038l((long) (v & 1048575), t))) {
                        return false;
                    }
                } else {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (mo49771j(i5, i4, t) && !mo49778u(i4).mo49762a(C14505h2.m23038l((long) (v & 1048575), t))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 == 50 && !((zzdy) C14505h2.m23038l((long) (v & 1048575), t)).isEmpty()) {
                                int i10 = i4 / 3;
                                C14554v0 v0Var = (C14554v0) this.f32624b[i10 + i10];
                                throw null;
                            }
                        }
                    }
                    List list = (List) C14505h2.m23038l((long) (v & 1048575), t);
                    if (!list.isEmpty()) {
                        C14524m1 u = mo49778u(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!u.mo49762a(list.get(i11))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i++;
            } else if (!this.f32626d) {
                return true;
            } else {
                this.f32633k.mo49946b(t);
                throw null;
            }
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
    public final int mo49763b(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f32623a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0246
            int r3 = r10.mo49779v(r1)
            int[] r4 = r10.f32623a
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
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0035:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m22962x(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0047:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x0055:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m22962x(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0067:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x0075:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x0083:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x0091:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00a3:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00b5:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00c9:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.android.gms.internal.icing.C14515k0.f32655a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x00e1:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x00ef:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m22962x(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0101:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = m22961w(r5, r11)
            goto L_0x0240
        L_0x010f:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m22962x(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0121:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = m22962x(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0133:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x014b:
            boolean r3 = r10.mo49771j(r4, r1, r11)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0167:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0173:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x017f:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            if (r3 == 0) goto L_0x01d8
            int r7 = r3.hashCode()
            goto L_0x01d8
        L_0x018a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x019e:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x01aa:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x01b2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x01ba:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x01c2:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01ce:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            if (r3 == 0) goto L_0x01d8
            int r7 = r3.hashCode()
        L_0x01d8:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0242
        L_0x01dd:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01ea:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.icing.C14505h2.m23035i(r5, r11)
            java.nio.charset.Charset r4 = com.google.android.gms.internal.icing.C14515k0.f32655a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x01f5:
            r8 = r9
        L_0x01f6:
            r3 = r8
            goto L_0x0240
        L_0x01f8:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x01ff:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x020a:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r5, r11)
            goto L_0x0240
        L_0x0211:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x021c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r5, r11)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
            goto L_0x0240
        L_0x0227:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.icing.C14505h2.m23036j(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x0232:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.icing.C14505h2.m23037k(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.C14515k0.m23053a(r3)
        L_0x0240:
            int r3 = r3 + r2
            r2 = r3
        L_0x0242:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0246:
            int r2 = r2 * 53
            com.google.android.gms.internal.icing.x1<?, ?> r0 = r10.f32632j
            com.google.android.gms.internal.icing.y1 r0 = r0.mo49950b(r11)
            r0.getClass()
            r0 = 506991(0x7bc6f, float:7.10446E-40)
            int r0 = r0 + r2
            boolean r1 = r10.f32626d
            if (r1 != 0) goto L_0x025a
            return r0
        L_0x025a:
            com.google.android.gms.internal.icing.v<?> r0 = r10.f32633k
            r0.mo49946b(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14492e1.mo49763b(java.lang.Object):int");
    }

    /* renamed from: c */
    public final int mo49764c(T t) {
        return this.f32627e ? mo49777t(t) : mo49776s(t);
    }

    /* renamed from: d */
    public final void mo49765d(T t, C14544s sVar) throws IOException {
        if (!this.f32627e) {
            mo49773l(t, sVar);
        } else if (!this.f32626d) {
            int length = this.f32623a.length;
            for (int i = 0; i < length; i += 3) {
                int v = mo49779v(i);
                int i2 = this.f32623a[i];
                switch ((v >>> 20) & 255) {
                    case 0:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49899e(i2, C14505h2.m23037k((long) (v & 1048575), t));
                            break;
                        }
                    case 1:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49898d(C14505h2.m23036j((long) (v & 1048575), t), i2);
                            break;
                        }
                    case 2:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49896b(i2, C14505h2.m23034h((long) (v & 1048575), t));
                            break;
                        }
                    case 3:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49901g(i2, C14505h2.m23034h((long) (v & 1048575), t));
                            break;
                        }
                    case 4:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49902h(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 5:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49903i(i2, C14505h2.m23034h((long) (v & 1048575), t));
                            break;
                        }
                    case 6:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49904j(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 7:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49905k(i2, C14505h2.m23035i((long) (v & 1048575), t));
                            break;
                        }
                    case 8:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            m22957m(i2, C14505h2.m23038l((long) (v & 1048575), t), sVar);
                            break;
                        }
                    case 9:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49910p(i2, mo49778u(i), C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                    case 10:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49906l(i2, (zzcf) C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                    case 11:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49907m(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 12:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49900f(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 13:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49895a(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 14:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49897c(i2, C14505h2.m23034h((long) (v & 1048575), t));
                            break;
                        }
                    case 15:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49908n(i2, C14505h2.m23032f((long) (v & 1048575), t));
                            break;
                        }
                    case 16:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49909o(i2, C14505h2.m23034h((long) (v & 1048575), t));
                            break;
                        }
                    case 17:
                        if (!mo49769h(i, t)) {
                            break;
                        } else {
                            sVar.mo49911q(i2, mo49778u(i), C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                    case 18:
                        C14528n1.m23106b(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 19:
                        C14528n1.m23107c(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 20:
                        C14528n1.m23108d(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 21:
                        C14528n1.m23109e(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 22:
                        C14528n1.m23113i(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 23:
                        C14528n1.m23111g(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 24:
                        C14528n1.m23116l(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 25:
                        C14528n1.m23119o(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 26:
                        C14528n1.m23120p(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar);
                        break;
                    case 27:
                        C14528n1.m23122r(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, mo49778u(i));
                        break;
                    case 28:
                        C14528n1.m23121q(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar);
                        break;
                    case 29:
                        C14528n1.m23114j(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 30:
                        C14528n1.m23118n(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 31:
                        C14528n1.m23117m(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 32:
                        C14528n1.m23112h(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 33:
                        C14528n1.m23115k(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 34:
                        C14528n1.m23110f(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, false);
                        break;
                    case 35:
                        C14528n1.m23106b(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 36:
                        C14528n1.m23107c(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 37:
                        C14528n1.m23108d(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 38:
                        C14528n1.m23109e(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 39:
                        C14528n1.m23113i(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 40:
                        C14528n1.m23111g(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 41:
                        C14528n1.m23116l(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 42:
                        C14528n1.m23119o(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 43:
                        C14528n1.m23114j(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 44:
                        C14528n1.m23118n(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 45:
                        C14528n1.m23117m(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 46:
                        C14528n1.m23112h(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 47:
                        C14528n1.m23115k(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 48:
                        C14528n1.m23110f(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, true);
                        break;
                    case 49:
                        C14528n1.m23123s(i2, (List) C14505h2.m23038l((long) (v & 1048575), t), sVar, mo49778u(i));
                        break;
                    case 50:
                        if (C14505h2.m23038l((long) (v & 1048575), t) == null) {
                            break;
                        } else {
                            int i3 = i / 3;
                            C14554v0 v0Var = (C14554v0) this.f32624b[i3 + i3];
                            throw null;
                        }
                    case 51:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49899e(i2, ((Double) C14505h2.m23038l((long) (v & 1048575), t)).doubleValue());
                            break;
                        }
                    case 52:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49898d(((Float) C14505h2.m23038l((long) (v & 1048575), t)).floatValue(), i2);
                            break;
                        }
                    case 53:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49896b(i2, m22962x((long) (v & 1048575), t));
                            break;
                        }
                    case 54:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49901g(i2, m22962x((long) (v & 1048575), t));
                            break;
                        }
                    case 55:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49902h(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 56:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49903i(i2, m22962x((long) (v & 1048575), t));
                            break;
                        }
                    case 57:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49904j(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 58:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49905k(i2, ((Boolean) C14505h2.m23038l((long) (v & 1048575), t)).booleanValue());
                            break;
                        }
                    case 59:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            m22957m(i2, C14505h2.m23038l((long) (v & 1048575), t), sVar);
                            break;
                        }
                    case 60:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49910p(i2, mo49778u(i), C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                    case 61:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49906l(i2, (zzcf) C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                    case 62:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49907m(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 63:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49900f(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 64:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49895a(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 65:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49897c(i2, m22962x((long) (v & 1048575), t));
                            break;
                        }
                    case 66:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49908n(i2, m22961w((long) (v & 1048575), t));
                            break;
                        }
                    case 67:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49909o(i2, m22962x((long) (v & 1048575), t));
                            break;
                        }
                    case 68:
                        if (!mo49771j(i2, i, t)) {
                            break;
                        } else {
                            sVar.mo49911q(i2, mo49778u(i), C14505h2.m23038l((long) (v & 1048575), t));
                            break;
                        }
                }
            }
            C14561x1<?, ?> x1Var = this.f32632j;
            x1Var.mo49950b(t);
            x1Var.mo49955g();
        } else {
            this.f32633k.mo49946b(t);
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo49766e(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f32623a.length; i += 3) {
            int v = mo49779v(i);
            long j = (long) (1048575 & v);
            int i2 = this.f32623a[i];
            switch ((v >>> 20) & 255) {
                case 0:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49787g(t, j, C14505h2.m23037k(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 1:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49785e(t, j, C14505h2.m23036j(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 2:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49809n(t, j, C14505h2.m23034h(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 3:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49809n(t, j, C14505h2.m23034h(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 4:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 5:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49809n(t, j, C14505h2.m23034h(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 6:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 7:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49783c(t, j, C14505h2.m23035i(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 8:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23039m(j, t, C14505h2.m23038l(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 9:
                    mo49774q(i, t, t2);
                    break;
                case 10:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23039m(j, t, C14505h2.m23038l(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 11:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 12:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 13:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 14:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49809n(t, j, C14505h2.m23034h(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 15:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.m23033g(t, C14505h2.m23032f(j, t2), j);
                        mo49770i(i, t);
                        break;
                    }
                case 16:
                    if (!mo49769h(i, t2)) {
                        break;
                    } else {
                        C14505h2.f32644c.mo49809n(t, j, C14505h2.m23034h(j, t2));
                        mo49770i(i, t);
                        break;
                    }
                case 17:
                    mo49774q(i, t, t2);
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
                    this.f32631i.mo49857b(j, t, t2);
                    break;
                case 50:
                    Class<?> cls = C14528n1.f32673a;
                    zzdy zzdy = (zzdy) C14505h2.m23038l(j, t);
                    zzdy zzdy2 = (zzdy) C14505h2.m23038l(j, t2);
                    if (!zzdy2.isEmpty()) {
                        if (!zzdy.zzd()) {
                            zzdy = zzdy.zzb();
                        }
                        zzdy.zza(zzdy2);
                    }
                    C14505h2.m23039m(j, t, zzdy);
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
                    if (!mo49771j(i2, i, t2)) {
                        break;
                    } else {
                        C14505h2.m23039m(j, t, C14505h2.m23038l(j, t2));
                        mo49772k(i2, i, t);
                        break;
                    }
                case 60:
                    mo49775r(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo49771j(i2, i, t2)) {
                        break;
                    } else {
                        C14505h2.m23039m(j, t, C14505h2.m23038l(j, t2));
                        mo49772k(i2, i, t);
                        break;
                    }
                case 68:
                    mo49775r(i, t, t2);
                    break;
            }
        }
        C14561x1<?, ?> x1Var = this.f32632j;
        Class<?> cls2 = C14528n1.f32673a;
        x1Var.mo49949a(t, x1Var.mo49952d(x1Var.mo49950b(t), x1Var.mo49950b(t2)));
        if (this.f32626d) {
            this.f32633k.mo49946b(t2);
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo49767f(C14491e0 e0Var) {
        int i;
        int i2 = this.f32629g;
        while (true) {
            i = this.f32630h;
            if (i2 >= i) {
                break;
            }
            long v = (long) (mo49779v(this.f32628f[i2]) & 1048575);
            Object l = C14505h2.m23038l(v, e0Var);
            if (l != null) {
                ((zzdy) l).zzc();
                C14505h2.m23039m(v, e0Var, l);
            }
            i2++;
        }
        int length = this.f32628f.length;
        while (i < length) {
            this.f32631i.mo49856a((long) this.f32628f[i], e0Var);
            i++;
        }
        this.f32632j.mo49951c(e0Var);
        if (this.f32626d) {
            this.f32633k.mo49947c(e0Var);
        }
    }

    /* renamed from: g */
    public final boolean mo49768g(T t, T t2) {
        boolean z;
        int length = this.f32623a.length;
        for (int i = 0; i < length; i += 3) {
            int v = mo49779v(i);
            long j = (long) (v & 1048575);
            switch ((v >>> 20) & 255) {
                case 0:
                    if (mo49780y(i, t, t2) && Double.doubleToLongBits(C14505h2.m23037k(j, t)) == Double.doubleToLongBits(C14505h2.m23037k(j, t2))) {
                        continue;
                    }
                case 1:
                    if (mo49780y(i, t, t2) && Float.floatToIntBits(C14505h2.m23036j(j, t)) == Float.floatToIntBits(C14505h2.m23036j(j, t2))) {
                        continue;
                    }
                case 2:
                    if (mo49780y(i, t, t2) && C14505h2.m23034h(j, t) == C14505h2.m23034h(j, t2)) {
                        continue;
                    }
                case 3:
                    if (mo49780y(i, t, t2) && C14505h2.m23034h(j, t) == C14505h2.m23034h(j, t2)) {
                        continue;
                    }
                case 4:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 5:
                    if (mo49780y(i, t, t2) && C14505h2.m23034h(j, t) == C14505h2.m23034h(j, t2)) {
                        continue;
                    }
                case 6:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 7:
                    if (mo49780y(i, t, t2) && C14505h2.m23035i(j, t) == C14505h2.m23035i(j, t2)) {
                        continue;
                    }
                case 8:
                    if (mo49780y(i, t, t2) && C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2))) {
                        continue;
                    }
                case 9:
                    if (mo49780y(i, t, t2) && C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2))) {
                        continue;
                    }
                case 10:
                    if (mo49780y(i, t, t2) && C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2))) {
                        continue;
                    }
                case 11:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 12:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 13:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 14:
                    if (mo49780y(i, t, t2) && C14505h2.m23034h(j, t) == C14505h2.m23034h(j, t2)) {
                        continue;
                    }
                case 15:
                    if (mo49780y(i, t, t2) && C14505h2.m23032f(j, t) == C14505h2.m23032f(j, t2)) {
                        continue;
                    }
                case 16:
                    if (mo49780y(i, t, t2) && C14505h2.m23034h(j, t) == C14505h2.m23034h(j, t2)) {
                        continue;
                    }
                case 17:
                    if (mo49780y(i, t, t2) && C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2))) {
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
                    z = C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2));
                    break;
                case 50:
                    z = C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2));
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
                    long j2 = (long) (this.f32623a[i + 2] & 1048575);
                    if (C14505h2.m23032f(j2, t) == C14505h2.m23032f(j2, t2) && C14528n1.m23105a(C14505h2.m23038l(j, t), C14505h2.m23038l(j, t2))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f32632j.mo49950b(t).equals(this.f32632j.mo49950b(t2))) {
            return false;
        }
        if (!this.f32626d) {
            return true;
        }
        this.f32633k.mo49946b(t);
        this.f32633k.mo49946b(t2);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo49769h(int i, Object obj) {
        int i2 = this.f32623a[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return (C14505h2.m23032f(j, obj) & (1 << (i2 >>> 20))) != 0;
        }
        int v = mo49779v(i);
        long j2 = (long) (v & 1048575);
        switch ((v >>> 20) & 255) {
            case 0:
                return C14505h2.m23037k(j2, obj) != ShadowDrawableWrapper.COS_45;
            case 1:
                return C14505h2.m23036j(j2, obj) != 0.0f;
            case 2:
                return C14505h2.m23034h(j2, obj) != 0;
            case 3:
                return C14505h2.m23034h(j2, obj) != 0;
            case 4:
                return C14505h2.m23032f(j2, obj) != 0;
            case 5:
                return C14505h2.m23034h(j2, obj) != 0;
            case 6:
                return C14505h2.m23032f(j2, obj) != 0;
            case 7:
                return C14505h2.m23035i(j2, obj);
            case 8:
                Object l = C14505h2.m23038l(j2, obj);
                if (l instanceof String) {
                    return !((String) l).isEmpty();
                }
                if (l instanceof zzcf) {
                    return !zzcf.zzb.equals(l);
                }
                throw new IllegalArgumentException();
            case 9:
                return C14505h2.m23038l(j2, obj) != null;
            case 10:
                return !zzcf.zzb.equals(C14505h2.m23038l(j2, obj));
            case 11:
                return C14505h2.m23032f(j2, obj) != 0;
            case 12:
                return C14505h2.m23032f(j2, obj) != 0;
            case 13:
                return C14505h2.m23032f(j2, obj) != 0;
            case 14:
                return C14505h2.m23034h(j2, obj) != 0;
            case 15:
                return C14505h2.m23032f(j2, obj) != 0;
            case 16:
                return C14505h2.m23034h(j2, obj) != 0;
            case 17:
                return C14505h2.m23038l(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public final void mo49770i(int i, Object obj) {
        int i2 = this.f32623a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C14505h2.m23033g(obj, (1 << (i2 >>> 20)) | C14505h2.m23032f(j, obj), j);
        }
    }

    /* renamed from: j */
    public final boolean mo49771j(int i, int i2, Object obj) {
        return C14505h2.m23032f((long) (this.f32623a[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: k */
    public final void mo49772k(int i, int i2, Object obj) {
        C14505h2.m23033g(obj, i, (long) (this.f32623a[i2 + 2] & 1048575));
    }

    /* renamed from: l */
    public final void mo49773l(T t, C14544s sVar) throws IOException {
        int i;
        T t2 = t;
        C14544s sVar2 = sVar;
        if (!this.f32626d) {
            int length = this.f32623a.length;
            Unsafe unsafe = f32622m;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int v = mo49779v(i4);
                int[] iArr = this.f32623a;
                int i6 = iArr[i4];
                int i7 = (v >>> 20) & 255;
                if (i7 <= 17) {
                    int i8 = iArr[i4 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i3) {
                        i5 = unsafe.getInt(t2, (long) i9);
                        i3 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (v & i2);
                switch (i7) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            sVar2.mo49899e(i6, C14505h2.m23037k(j, t2));
                            continue;
                        }
                    case 1:
                        if ((i5 & i) != 0) {
                            sVar2.mo49898d(C14505h2.m23036j(j, t2), i6);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i5 & i) != 0) {
                            sVar2.mo49896b(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i5 & i) != 0) {
                            sVar2.mo49901g(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i5 & i) != 0) {
                            sVar2.mo49902h(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i5 & i) != 0) {
                            sVar2.mo49903i(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i5 & i) != 0) {
                            sVar2.mo49904j(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i5 & i) != 0) {
                            sVar2.mo49905k(i6, C14505h2.m23035i(j, t2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i5 & i) != 0) {
                            m22957m(i6, unsafe.getObject(t2, j), sVar2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i5 & i) != 0) {
                            sVar2.mo49910p(i6, mo49778u(i4), unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i5 & i) != 0) {
                            sVar2.mo49906l(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i5 & i) != 0) {
                            sVar2.mo49907m(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i5 & i) != 0) {
                            sVar2.mo49900f(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i5 & i) != 0) {
                            sVar2.mo49895a(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i5 & i) != 0) {
                            sVar2.mo49897c(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i5 & i) != 0) {
                            sVar2.mo49908n(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i5 & i) != 0) {
                            sVar2.mo49909o(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i5 & i) != 0) {
                            sVar2.mo49911q(i6, mo49778u(i4), unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C14528n1.m23106b(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 19:
                        C14528n1.m23107c(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 20:
                        C14528n1.m23108d(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 21:
                        C14528n1.m23109e(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 22:
                        C14528n1.m23113i(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 23:
                        C14528n1.m23111g(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 24:
                        C14528n1.m23116l(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 25:
                        C14528n1.m23119o(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        continue;
                    case 26:
                        C14528n1.m23120p(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2);
                        break;
                    case 27:
                        C14528n1.m23122r(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, mo49778u(i4));
                        break;
                    case 28:
                        C14528n1.m23121q(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2);
                        break;
                    case 29:
                        C14528n1.m23114j(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 30:
                        C14528n1.m23118n(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 31:
                        C14528n1.m23117m(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 32:
                        C14528n1.m23112h(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 33:
                        C14528n1.m23115k(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 34:
                        C14528n1.m23110f(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, false);
                        break;
                    case 35:
                        C14528n1.m23106b(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 36:
                        C14528n1.m23107c(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 37:
                        C14528n1.m23108d(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 38:
                        C14528n1.m23109e(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 39:
                        C14528n1.m23113i(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 40:
                        C14528n1.m23111g(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 41:
                        C14528n1.m23116l(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 42:
                        C14528n1.m23119o(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 43:
                        C14528n1.m23114j(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 44:
                        C14528n1.m23118n(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 45:
                        C14528n1.m23117m(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 46:
                        C14528n1.m23112h(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 47:
                        C14528n1.m23115k(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 48:
                        C14528n1.m23110f(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, true);
                        break;
                    case 49:
                        C14528n1.m23123s(this.f32623a[i4], (List) unsafe.getObject(t2, j), sVar2, mo49778u(i4));
                        break;
                    case 50:
                        if (unsafe.getObject(t2, j) != null) {
                            int i10 = i4 / 3;
                            C14554v0 v0Var = (C14554v0) this.f32624b[i10 + i10];
                            throw null;
                        }
                        break;
                    case 51:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49899e(i6, ((Double) C14505h2.m23038l(j, t2)).doubleValue());
                            break;
                        }
                        break;
                    case 52:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49898d(((Float) C14505h2.m23038l(j, t2)).floatValue(), i6);
                            break;
                        }
                        break;
                    case 53:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49896b(i6, m22962x(j, t2));
                            break;
                        }
                        break;
                    case 54:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49901g(i6, m22962x(j, t2));
                            break;
                        }
                        break;
                    case 55:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49902h(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 56:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49903i(i6, m22962x(j, t2));
                            break;
                        }
                        break;
                    case 57:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49904j(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 58:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49905k(i6, ((Boolean) C14505h2.m23038l(j, t2)).booleanValue());
                            break;
                        }
                        break;
                    case 59:
                        if (mo49771j(i6, i4, t2)) {
                            m22957m(i6, unsafe.getObject(t2, j), sVar2);
                            break;
                        }
                        break;
                    case 60:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49910p(i6, mo49778u(i4), unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 61:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49906l(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49907m(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 63:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49900f(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 64:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49895a(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 65:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49897c(i6, m22962x(j, t2));
                            break;
                        }
                        break;
                    case 66:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49908n(i6, m22961w(j, t2));
                            break;
                        }
                        break;
                    case 67:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49909o(i6, m22962x(j, t2));
                            break;
                        }
                        break;
                    case 68:
                        if (mo49771j(i6, i4, t2)) {
                            sVar2.mo49911q(i6, mo49778u(i4), unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            C14561x1<?, ?> x1Var = this.f32632j;
            x1Var.mo49950b(t2);
            x1Var.mo49955g();
            return;
        }
        this.f32633k.mo49946b(t2);
        throw null;
    }

    /* renamed from: q */
    public final void mo49774q(int i, Object obj, Object obj2) {
        long v = (long) (mo49779v(i) & 1048575);
        if (mo49769h(i, obj2)) {
            Object l = C14505h2.m23038l(v, obj);
            Object l2 = C14505h2.m23038l(v, obj2);
            if (l != null && l2 != null) {
                C14505h2.m23039m(v, obj, C14515k0.m23054b(l, l2));
                mo49770i(i, obj);
            } else if (l2 != null) {
                C14505h2.m23039m(v, obj, l2);
                mo49770i(i, obj);
            }
        }
    }

    /* renamed from: r */
    public final void mo49775r(int i, Object obj, Object obj2) {
        int v = mo49779v(i);
        int i2 = this.f32623a[i];
        long j = (long) (v & 1048575);
        if (mo49771j(i2, i, obj2)) {
            Object l = mo49771j(i2, i, obj) ? C14505h2.m23038l(j, obj) : null;
            Object l2 = C14505h2.m23038l(j, obj2);
            if (l != null && l2 != null) {
                C14505h2.m23039m(j, obj, C14515k0.m23054b(l, l2));
                mo49772k(i2, i, obj);
            } else if (l2 != null) {
                C14505h2.m23039m(j, obj, l2);
                mo49772k(i2, i, obj);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0307, code lost:
        r7 = (r7 + r6) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0309, code lost:
        r4 = r4 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0406, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04a9, code lost:
        r4 = android.support.p013v4.media.C0069a.m171b(r7, r1, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04c7, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04f2, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0519, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0525, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0532, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0535, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        r7 = (r7 + r1) + r6;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49776s(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f32622m
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.f32623a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x053c
            int r6 = r14.mo49779v(r3)
            int[] r7 = r14.f32623a
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
                case 0: goto L_0x0528;
                case 1: goto L_0x051b;
                case 2: goto L_0x0507;
                case 3: goto L_0x04f4;
                case 4: goto L_0x04e0;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04ca;
                case 7: goto L_0x04bd;
                case 8: goto L_0x048d;
                case 9: goto L_0x047b;
                case 10: goto L_0x0462;
                case 11: goto L_0x044e;
                case 12: goto L_0x043a;
                case 13: goto L_0x042e;
                case 14: goto L_0x0422;
                case 15: goto L_0x0409;
                case 16: goto L_0x03f0;
                case 17: goto L_0x03dc;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03c4;
                case 20: goto L_0x03b8;
                case 21: goto L_0x03ac;
                case 22: goto L_0x03a0;
                case 23: goto L_0x0394;
                case 24: goto L_0x0388;
                case 25: goto L_0x037c;
                case 26: goto L_0x0370;
                case 27: goto L_0x0360;
                case 28: goto L_0x0354;
                case 29: goto L_0x0348;
                case 30: goto L_0x033c;
                case 31: goto L_0x0330;
                case 32: goto L_0x0324;
                case 33: goto L_0x0318;
                case 34: goto L_0x030c;
                case 35: goto L_0x02f3;
                case 36: goto L_0x02de;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02b4;
                case 39: goto L_0x029f;
                case 40: goto L_0x028a;
                case 41: goto L_0x0274;
                case 42: goto L_0x025e;
                case 43: goto L_0x0248;
                case 44: goto L_0x0232;
                case 45: goto L_0x021c;
                case 46: goto L_0x0206;
                case 47: goto L_0x01f0;
                case 48: goto L_0x01da;
                case 49: goto L_0x01ca;
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
            goto L_0x0535
        L_0x0040:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.b1 r1 = (com.google.android.gms.internal.icing.C14480b1) r1
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23159a(r8, r1, r6)
            goto L_0x0534
        L_0x0056:
            boolean r6 = r14.mo49771j(r8, r3, r15)
            if (r6 == 0) goto L_0x0535
            long r6 = m22962x(r12, r15)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.C14541r.m23162s(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
            goto L_0x0406
        L_0x0070:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = m22961w(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04f2
        L_0x008b:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0532
        L_0x0099:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0525
        L_0x00a7:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = m22961w(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23161r(r1)
            goto L_0x04f2
        L_0x00bd:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = m22961w(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04f2
        L_0x00d3:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r1 = (com.google.android.gms.internal.icing.zzcf) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = r1.zzc()
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0120
        L_0x00ee:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23101P(r8, r6, r1)
            goto L_0x0534
        L_0x0102:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.icing.zzcf
            if (r6 == 0) goto L_0x0124
            com.google.android.gms.internal.icing.zzcf r1 = (com.google.android.gms.internal.icing.zzcf) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = r1.zzc()
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x0120:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0309
        L_0x0124:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23164u(r1)
            goto L_0x04f2
        L_0x0132:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04c7
        L_0x0140:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0525
        L_0x014e:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0532
        L_0x015c:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = m22961w(r12, r15)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23161r(r1)
            goto L_0x04f2
        L_0x0172:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            long r6 = m22962x(r12, r15)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            int r6 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
            goto L_0x0519
        L_0x0188:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            long r6 = m22962x(r12, r15)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            int r6 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
            goto L_0x0519
        L_0x019e:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0525
        L_0x01ac:
            boolean r1 = r14.mo49771j(r8, r3, r15)
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0532
        L_0x01ba:
            java.lang.Object r1 = r0.getObject(r15, r12)
            int r6 = r3 / 3
            java.lang.Object[] r7 = r14.f32624b
            int r6 = r6 + r6
            r6 = r7[r6]
            com.google.android.gms.internal.icing.C14557w0.m23221a(r1, r6)
            goto L_0x0535
        L_0x01ca:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23104S(r8, r1, r6)
            goto L_0x0534
        L_0x01da:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23129y(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x01f0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23092G(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x0206:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23096K(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x021c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23094I(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x0232:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23086A(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x0248:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23090E(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x025e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23098M(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x0274:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23094I(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x028a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23096K(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x029f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23088C(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x02b4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23127w(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x02c9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23125u(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x02de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23094I(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0307
        L_0x02f3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23096K(r1)
            if (r1 <= 0) goto L_0x0535
            int r6 = com.google.android.gms.internal.icing.C14541r.m23160q(r8)
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x0307:
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0309:
            int r4 = r4 + r7
            goto L_0x0535
        L_0x030c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23130z(r8, r1)
            goto L_0x0534
        L_0x0318:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23093H(r8, r1)
            goto L_0x0534
        L_0x0324:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23097L(r8, r1)
            goto L_0x0534
        L_0x0330:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23095J(r8, r1)
            goto L_0x0534
        L_0x033c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23087B(r8, r1)
            goto L_0x0534
        L_0x0348:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23091F(r8, r1)
            goto L_0x0534
        L_0x0354:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23103R(r8, r1)
            goto L_0x0534
        L_0x0360:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23102Q(r8, r1, r6)
            goto L_0x0534
        L_0x0370:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23100O(r8, r1)
            goto L_0x0534
        L_0x037c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23099N(r8, r1)
            goto L_0x0534
        L_0x0388:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23095J(r8, r1)
            goto L_0x0534
        L_0x0394:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23097L(r8, r1)
            goto L_0x0534
        L_0x03a0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23089D(r8, r1)
            goto L_0x0534
        L_0x03ac:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23128x(r8, r1)
            goto L_0x0534
        L_0x03b8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23126v(r8, r1)
            goto L_0x0534
        L_0x03c4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23095J(r8, r1)
            goto L_0x0534
        L_0x03d0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23097L(r8, r1)
            goto L_0x0534
        L_0x03dc:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.b1 r1 = (com.google.android.gms.internal.icing.C14480b1) r1
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23159a(r8, r1, r6)
            goto L_0x0534
        L_0x03f0:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0535
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.C14541r.m23162s(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
        L_0x0406:
            int r1 = r1 + r8
            goto L_0x0534
        L_0x0409:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04f2
        L_0x0422:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0532
        L_0x042e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0525
        L_0x043a:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23161r(r1)
            goto L_0x04f2
        L_0x044e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04f2
        L_0x0462:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r1 = (com.google.android.gms.internal.icing.zzcf) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = r1.zzc()
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x04a9
        L_0x047b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.m1 r6 = r14.mo49778u(r3)
            int r1 = com.google.android.gms.internal.icing.C14528n1.m23101P(r8, r6, r1)
            goto L_0x0534
        L_0x048d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.icing.zzcf
            if (r6 == 0) goto L_0x04b0
            com.google.android.gms.internal.icing.zzcf r1 = (com.google.android.gms.internal.icing.zzcf) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = r1.zzc()
            int r7 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x04a9:
            int r1 = android.support.p013v4.media.C0069a.m171b(r7, r1, r6, r4)
            r4 = r1
            goto L_0x0535
        L_0x04b0:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23164u(r1)
            goto L_0x04f2
        L_0x04bd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x04c7:
            int r1 = r1 + r11
            goto L_0x0534
        L_0x04ca:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0525
        L_0x04d5:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            goto L_0x0532
        L_0x04e0:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.icing.C14541r.m23162s(r6)
            int r1 = com.google.android.gms.internal.icing.C14541r.m23161r(r1)
        L_0x04f2:
            int r1 = r1 + r6
            goto L_0x0534
        L_0x04f4:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            int r6 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
            goto L_0x0519
        L_0x0507:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
            int r6 = com.google.android.gms.internal.icing.C14541r.m23163t(r6)
        L_0x0519:
            int r1 = r1 + r6
            goto L_0x0534
        L_0x051b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x0525:
            int r1 = r1 + 4
            goto L_0x0534
        L_0x0528:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0535
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.icing.C14541r.m23162s(r1)
        L_0x0532:
            int r1 = r1 + 8
        L_0x0534:
            int r4 = r4 + r1
        L_0x0535:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x053c:
            com.google.android.gms.internal.icing.x1<?, ?> r0 = r14.f32632j
            com.google.android.gms.internal.icing.y1 r1 = r0.mo49950b(r15)
            int r0 = r0.mo49954f(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f32626d
            if (r1 != 0) goto L_0x054c
            return r0
        L_0x054c:
            com.google.android.gms.internal.icing.v<?> r0 = r14.f32633k
            r0.mo49946b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14492e1.mo49776s(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fe, code lost:
        r5 = (r5 + r4) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04b3, code lost:
        r5 = (r5 + r3) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b5, code lost:
        r2 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04d1, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0503, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x052e, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x053c, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x054b, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054e, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo49777t(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f32622m
            r1 = 0
            r2 = r1
        L_0x0004:
            int[] r3 = r10.f32623a
            int r3 = r3.length
            if (r1 >= r3) goto L_0x0552
            int r3 = r10.mo49779v(r1)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            int[] r5 = r10.f32623a
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r6 = (long) r3
            com.google.android.gms.internal.icing.zzcv r3 = com.google.android.gms.internal.icing.zzcv.DOUBLE_LIST_PACKED
            int r3 = r3.zza()
            if (r4 < r3) goto L_0x0030
            com.google.android.gms.internal.icing.zzcv r3 = com.google.android.gms.internal.icing.zzcv.SINT64_LIST_PACKED
            int r3 = r3.zza()
            if (r4 > r3) goto L_0x0030
            int[] r3 = r10.f32623a
            int r8 = r1 + 2
            r3 = r3[r8]
        L_0x0030:
            r3 = 63
            switch(r4) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0505;
                case 4: goto L_0x04ef;
                case 5: goto L_0x04e2;
                case 6: goto L_0x04d5;
                case 7: goto L_0x04c5;
                case 8: goto L_0x0495;
                case 9: goto L_0x0481;
                case 10: goto L_0x0466;
                case 11: goto L_0x0450;
                case 12: goto L_0x043a;
                case 13: goto L_0x042c;
                case 14: goto L_0x041e;
                case 15: goto L_0x0403;
                case 16: goto L_0x03e8;
                case 17: goto L_0x03d2;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03ba;
                case 20: goto L_0x03ae;
                case 21: goto L_0x03a2;
                case 22: goto L_0x0396;
                case 23: goto L_0x038a;
                case 24: goto L_0x037e;
                case 25: goto L_0x0372;
                case 26: goto L_0x0366;
                case 27: goto L_0x0356;
                case 28: goto L_0x034a;
                case 29: goto L_0x033e;
                case 30: goto L_0x0332;
                case 31: goto L_0x0326;
                case 32: goto L_0x031a;
                case 33: goto L_0x030e;
                case 34: goto L_0x0302;
                case 35: goto L_0x02ea;
                case 36: goto L_0x02d5;
                case 37: goto L_0x02c0;
                case 38: goto L_0x02ab;
                case 39: goto L_0x0296;
                case 40: goto L_0x0281;
                case 41: goto L_0x026b;
                case 42: goto L_0x0255;
                case 43: goto L_0x023f;
                case 44: goto L_0x0229;
                case 45: goto L_0x0213;
                case 46: goto L_0x01fd;
                case 47: goto L_0x01e7;
                case 48: goto L_0x01d1;
                case 49: goto L_0x01c1;
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
            goto L_0x054e
        L_0x0037:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.b1 r3 = (com.google.android.gms.internal.icing.C14480b1) r3
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23159a(r5, r3, r4)
            goto L_0x054d
        L_0x004d:
            boolean r4 = r10.mo49771j(r5, r1, r11)
            if (r4 == 0) goto L_0x054e
            long r6 = m22962x(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            long r8 = r6 + r6
            long r5 = r6 >> r3
            long r5 = r5 ^ r8
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r5)
            goto L_0x0503
        L_0x0068:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = m22961w(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r5 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r5
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x0503
        L_0x0083:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x054b
        L_0x0091:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x053c
        L_0x009f:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = m22961w(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23161r(r3)
            goto L_0x0503
        L_0x00b5:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = m22961w(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x0503
        L_0x00cb:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.zzcf r3 = (com.google.android.gms.internal.icing.zzcf) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = r3.zzc()
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x04b3
        L_0x00e7:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23101P(r5, r4, r3)
            goto L_0x054d
        L_0x00fb:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            boolean r4 = r3 instanceof com.google.android.gms.internal.icing.zzcf
            if (r4 == 0) goto L_0x011b
            com.google.android.gms.internal.icing.zzcf r3 = (com.google.android.gms.internal.icing.zzcf) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = r3.zzc()
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x04b3
        L_0x011b:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23164u(r3)
            goto L_0x0503
        L_0x0129:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x04d1
        L_0x0137:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x053c
        L_0x0145:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x054b
        L_0x0153:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = m22961w(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23161r(r3)
            goto L_0x0503
        L_0x0169:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            long r3 = m22962x(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r5)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r3)
            goto L_0x052e
        L_0x017f:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            long r3 = m22962x(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r5)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r3)
            goto L_0x052e
        L_0x0195:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x053c
        L_0x01a3:
            boolean r3 = r10.mo49771j(r5, r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x054b
        L_0x01b1:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            int r4 = r1 / 3
            java.lang.Object[] r5 = r10.f32624b
            int r4 = r4 + r4
            r4 = r5[r4]
            com.google.android.gms.internal.icing.C14557w0.m23221a(r3, r4)
            goto L_0x054e
        L_0x01c1:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23104S(r5, r3, r4)
            goto L_0x054d
        L_0x01d1:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23129y(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x01e7:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23092G(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x01fd:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23096K(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x0213:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23094I(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x0229:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23086A(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x023f:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23090E(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x0255:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23098M(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x026b:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23094I(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x0281:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23096K(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x0296:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23088C(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x02ab:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23127w(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x02c0:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23125u(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x02d5:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23094I(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x02fe
        L_0x02ea:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23096K(r3)
            if (r3 <= 0) goto L_0x054e
            int r4 = com.google.android.gms.internal.icing.C14541r.m23160q(r5)
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
        L_0x02fe:
            int r5 = r5 + r4
            int r5 = r5 + r3
            goto L_0x04b5
        L_0x0302:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23130z(r5, r3)
            goto L_0x054d
        L_0x030e:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23093H(r5, r3)
            goto L_0x054d
        L_0x031a:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23097L(r5, r3)
            goto L_0x054d
        L_0x0326:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23095J(r5, r3)
            goto L_0x054d
        L_0x0332:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23087B(r5, r3)
            goto L_0x054d
        L_0x033e:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23091F(r5, r3)
            goto L_0x054d
        L_0x034a:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23103R(r5, r3)
            goto L_0x054d
        L_0x0356:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23102Q(r5, r3, r4)
            goto L_0x054d
        L_0x0366:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23100O(r5, r3)
            goto L_0x054d
        L_0x0372:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23099N(r5, r3)
            goto L_0x054d
        L_0x037e:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23095J(r5, r3)
            goto L_0x054d
        L_0x038a:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23097L(r5, r3)
            goto L_0x054d
        L_0x0396:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23089D(r5, r3)
            goto L_0x054d
        L_0x03a2:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23128x(r5, r3)
            goto L_0x054d
        L_0x03ae:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23126v(r5, r3)
            goto L_0x054d
        L_0x03ba:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23095J(r5, r3)
            goto L_0x054d
        L_0x03c6:
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23097L(r5, r3)
            goto L_0x054d
        L_0x03d2:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.b1 r3 = (com.google.android.gms.internal.icing.C14480b1) r3
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23159a(r5, r3, r4)
            goto L_0x054d
        L_0x03e8:
            boolean r4 = r10.mo49769h(r1, r11)
            if (r4 == 0) goto L_0x054e
            long r6 = com.google.android.gms.internal.icing.C14505h2.m23034h(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            long r8 = r6 + r6
            long r5 = r6 >> r3
            long r5 = r5 ^ r8
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r5)
            goto L_0x0503
        L_0x0403:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r5 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r5
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x0503
        L_0x041e:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x054b
        L_0x042c:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x053c
        L_0x043a:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23161r(r3)
            goto L_0x0503
        L_0x0450:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x0503
        L_0x0466:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.zzcf r3 = (com.google.android.gms.internal.icing.zzcf) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = r3.zzc()
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x04b3
        L_0x0481:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            com.google.android.gms.internal.icing.m1 r4 = r10.mo49778u(r1)
            int r3 = com.google.android.gms.internal.icing.C14528n1.m23101P(r5, r4, r3)
            goto L_0x054d
        L_0x0495:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            java.lang.Object r3 = com.google.android.gms.internal.icing.C14505h2.m23038l(r6, r11)
            boolean r4 = r3 instanceof com.google.android.gms.internal.icing.zzcf
            if (r4 == 0) goto L_0x04b8
            com.google.android.gms.internal.icing.zzcf r3 = (com.google.android.gms.internal.icing.zzcf) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = r3.zzc()
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
        L_0x04b3:
            int r5 = r5 + r3
            int r5 = r5 + r4
        L_0x04b5:
            int r2 = r2 + r5
            goto L_0x054e
        L_0x04b8:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23164u(r3)
            goto L_0x0503
        L_0x04c5:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
        L_0x04d1:
            int r3 = r3 + 1
            goto L_0x054d
        L_0x04d5:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x053c
        L_0x04e2:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
            goto L_0x054b
        L_0x04ef:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = com.google.android.gms.internal.icing.C14505h2.m23032f(r6, r11)
            int r4 = r5 << 3
            int r4 = com.google.android.gms.internal.icing.C14541r.m23162s(r4)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23161r(r3)
        L_0x0503:
            int r3 = r3 + r4
            goto L_0x054d
        L_0x0505:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r5)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r3)
            goto L_0x052e
        L_0x051a:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            long r3 = com.google.android.gms.internal.icing.C14505h2.m23034h(r6, r11)
            int r5 = r5 << 3
            int r5 = com.google.android.gms.internal.icing.C14541r.m23162s(r5)
            int r3 = com.google.android.gms.internal.icing.C14541r.m23163t(r3)
        L_0x052e:
            int r3 = r3 + r5
            goto L_0x054d
        L_0x0530:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
        L_0x053c:
            int r3 = r3 + 4
            goto L_0x054d
        L_0x053f:
            boolean r3 = r10.mo49769h(r1, r11)
            if (r3 == 0) goto L_0x054e
            int r3 = r5 << 3
            int r3 = com.google.android.gms.internal.icing.C14541r.m23162s(r3)
        L_0x054b:
            int r3 = r3 + 8
        L_0x054d:
            int r2 = r2 + r3
        L_0x054e:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x0552:
            com.google.android.gms.internal.icing.x1<?, ?> r0 = r10.f32632j
            com.google.android.gms.internal.icing.y1 r11 = r0.mo49950b(r11)
            int r11 = r0.mo49954f(r11)
            int r11 = r11 + r2
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14492e1.mo49777t(java.lang.Object):int");
    }

    /* renamed from: u */
    public final C14524m1 mo49778u(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f32624b;
        C14524m1 m1Var = (C14524m1) objArr[i3];
        if (m1Var != null) {
            return m1Var;
        }
        C14524m1 a = C14512j1.f32651c.mo49820a((Class) objArr[i3 + 1]);
        this.f32624b[i3] = a;
        return a;
    }

    /* renamed from: v */
    public final int mo49779v(int i) {
        return this.f32623a[i + 1];
    }

    /* renamed from: y */
    public final boolean mo49780y(int i, Object obj, Object obj2) {
        return mo49769h(i, obj) == mo49769h(i, obj2);
    }
}
