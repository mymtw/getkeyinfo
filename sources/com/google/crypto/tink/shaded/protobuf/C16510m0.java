package com.google.crypto.tink.shaded.protobuf;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.crypto.tink.shaded.protobuf.C16477e;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003a2.C0023f;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m0 */
public final class C16510m0<T> implements C16542x0<T> {

    /* renamed from: r */
    public static final int[] f36654r = new int[0];

    /* renamed from: s */
    public static final Unsafe f36655s = C16488g1.m26850p();

    /* renamed from: a */
    public final int[] f36656a;

    /* renamed from: b */
    public final Object[] f36657b;

    /* renamed from: c */
    public final int f36658c;

    /* renamed from: d */
    public final int f36659d;

    /* renamed from: e */
    public final C16503j0 f36660e;

    /* renamed from: f */
    public final boolean f36661f;

    /* renamed from: g */
    public final boolean f36662g;

    /* renamed from: h */
    public final boolean f36663h;

    /* renamed from: i */
    public final boolean f36664i;

    /* renamed from: j */
    public final int[] f36665j;

    /* renamed from: k */
    public final int f36666k;

    /* renamed from: l */
    public final int f36667l;

    /* renamed from: m */
    public final C16515o0 f36668m;

    /* renamed from: n */
    public final C16454a0 f36669n;

    /* renamed from: o */
    public final C16473c1<?, ?> f36670o;

    /* renamed from: p */
    public final C16514o<?> f36671p;

    /* renamed from: q */
    public final C16479e0 f36672q;

    public C16510m0(int[] iArr, Object[] objArr, int i, int i2, C16503j0 j0Var, boolean z, int[] iArr2, int i3, int i4, C16515o0 o0Var, C16454a0 a0Var, C16473c1 c1Var, C16514o oVar, C16479e0 e0Var) {
        this.f36656a = iArr;
        this.f36657b = objArr;
        this.f36658c = i;
        this.f36659d = i2;
        this.f36662g = j0Var instanceof GeneratedMessageLite;
        this.f36663h = z;
        this.f36661f = oVar != null && oVar.mo58929e(j0Var);
        this.f36664i = false;
        this.f36665j = iArr2;
        this.f36666k = i3;
        this.f36667l = i4;
        this.f36668m = o0Var;
        this.f36669n = a0Var;
        this.f36670o = c1Var;
        this.f36671p = oVar;
        this.f36660e = j0Var;
        this.f36672q = e0Var;
    }

    /* renamed from: A */
    public static long m27123A(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: B */
    public static int m27124B(long j, Object obj) {
        return ((Integer) C16488g1.m26849o(j, obj)).intValue();
    }

    /* renamed from: C */
    public static long m27125C(long j, Object obj) {
        return ((Long) C16488g1.m26849o(j, obj)).longValue();
    }

    /* renamed from: M */
    public static Field m27126M(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder l = C0023f.m111l("Field ", str, " for ");
            l.append(cls.getName());
            l.append(" not found. Known fields are ");
            l.append(Arrays.toString(declaredFields));
            throw new RuntimeException(l.toString());
        }
    }

    /* renamed from: Q */
    public static int m27127Q(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: U */
    public static void m27128U(int i, Object obj, C16505k kVar) throws IOException {
        if (obj instanceof String) {
            kVar.f36650a.mo58501L(i, (String) obj);
            return;
        }
        kVar.mo58859b(i, (ByteString) obj);
    }

    /* renamed from: o */
    public static C16476d1 m27129o(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C16476d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var != C16476d1.f36589f) {
            return d1Var;
        }
        C16476d1 d1Var2 = new C16476d1();
        generatedMessageLite.unknownFields = d1Var2;
        return d1Var2;
    }

    /* renamed from: t */
    public static List m27130t(long j, Object obj) {
        return (List) C16488g1.m26849o(j, obj);
    }

    /* renamed from: y */
    public static C16510m0 m27131y(C16495h0 h0Var, C16515o0 o0Var, C16454a0 a0Var, C16473c1 c1Var, C16514o oVar, C16479e0 e0Var) {
        if (h0Var instanceof C16536v0) {
            return m27132z((C16536v0) h0Var, o0Var, a0Var, c1Var, oVar, e0Var);
        }
        C16468b1 b1Var = (C16468b1) h0Var;
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x039b  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.crypto.tink.shaded.protobuf.C16510m0<T> m27132z(com.google.crypto.tink.shaded.protobuf.C16536v0 r34, com.google.crypto.tink.shaded.protobuf.C16515o0 r35, com.google.crypto.tink.shaded.protobuf.C16454a0 r36, com.google.crypto.tink.shaded.protobuf.C16473c1<?, ?> r37, com.google.crypto.tink.shaded.protobuf.C16514o<?> r38, com.google.crypto.tink.shaded.protobuf.C16479e0 r39) {
        /*
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r34.mo58669c()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo58971e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r5) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0064
            int[] r8 = f36654r
            r12 = r2
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r7
            r11 = r8
            r7 = r15
            r8 = r7
            goto L_0x0174
        L_0x0064:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0083
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0070:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0080
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0070
        L_0x0080:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0083:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00a2
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008f:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x009f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008f
        L_0x009f:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a2:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00c1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ae:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00be
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ae
        L_0x00be:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00c1:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00e0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cd:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00dd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cd
        L_0x00dd:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00e0:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ff
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ec:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x00fc
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ec
        L_0x00fc:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00ff:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0120
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x010b:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x011c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x010b
        L_0x011c:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0120:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0143
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012c:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x013e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012c
        L_0x013e:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0143:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0168
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x0151:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x0163
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x0151
        L_0x0163:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0168:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r11
            r11 = r2
            r2 = r7
            r7 = r9
        L_0x0174:
            sun.misc.Unsafe r9 = f36655s
            java.lang.Object[] r18 = r34.mo58970d()
            com.google.crypto.tink.shaded.protobuf.j0 r19 = r34.mo58668b()
            java.lang.Class r6 = r19.getClass()
            int r3 = r12 * 3
            int[] r3 = new int[r3]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r13 = r13 + r15
            r22 = r13
            r23 = r15
            r5 = r16
            r20 = 0
            r21 = 0
        L_0x0195:
            if (r5 >= r1) goto L_0x03e4
            int r24 = r5 + 1
            char r5 = r0.charAt(r5)
            r25 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01c9
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r1 = r24
            r24 = 13
        L_0x01aa:
            int r26 = r1 + 1
            char r1 = r0.charAt(r1)
            r27 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r13) goto L_0x01c3
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r5 = r5 | r1
            int r24 = r24 + 13
            r1 = r26
            r13 = r27
            goto L_0x01aa
        L_0x01c3:
            int r1 = r1 << r24
            r5 = r5 | r1
            r1 = r26
            goto L_0x01cd
        L_0x01c9:
            r27 = r13
            r1 = r24
        L_0x01cd:
            int r13 = r1 + 1
            char r1 = r0.charAt(r1)
            r24 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r13) goto L_0x01ff
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r13 = r24
            r24 = 13
        L_0x01e0:
            int r26 = r13 + 1
            char r13 = r0.charAt(r13)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r15) goto L_0x01f9
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r1 = r1 | r13
            int r24 = r24 + 13
            r13 = r26
            r15 = r28
            goto L_0x01e0
        L_0x01f9:
            int r13 = r13 << r24
            r1 = r1 | r13
            r13 = r26
            goto L_0x0203
        L_0x01ff:
            r28 = r15
            r13 = r24
        L_0x0203:
            r15 = r1 & 255(0xff, float:3.57E-43)
            r24 = r10
            r10 = r1 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0211
            int r10 = r21 + 1
            r11[r21] = r20
            r21 = r10
        L_0x0211:
            r10 = 51
            if (r15 < r10) goto L_0x02ba
            int r10 = r13 + 1
            char r13 = r0.charAt(r13)
            r26 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r10) goto L_0x0249
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
            r33 = r26
            r26 = r13
            r13 = r33
        L_0x022c:
            int r32 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r10) goto L_0x0242
            r10 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r31
            r26 = r26 | r10
            int r31 = r31 + 13
            r13 = r32
            r10 = 55296(0xd800, float:7.7486E-41)
            goto L_0x022c
        L_0x0242:
            int r10 = r13 << r31
            r13 = r26 | r10
            r10 = r32
            goto L_0x024b
        L_0x0249:
            r10 = r26
        L_0x024b:
            r26 = r10
            int r10 = r15 + -51
            r31 = r8
            r8 = 9
            if (r10 == r8) goto L_0x026f
            r8 = 17
            if (r10 != r8) goto L_0x025a
            goto L_0x026f
        L_0x025a:
            r8 = 12
            if (r10 != r8) goto L_0x027c
            r8 = r4 & 1
            r10 = 1
            if (r8 != r10) goto L_0x027c
            int r8 = r20 / 3
            int r8 = r8 * 2
            int r8 = r8 + r10
            int r10 = r14 + 1
            r14 = r18[r14]
            r12[r8] = r14
            goto L_0x027b
        L_0x026f:
            int r8 = r20 / 3
            int r8 = r8 * 2
            r10 = 1
            int r8 = r8 + r10
            int r10 = r14 + 1
            r14 = r18[r14]
            r12[r8] = r14
        L_0x027b:
            r14 = r10
        L_0x027c:
            int r13 = r13 * 2
            r8 = r18[r13]
            boolean r10 = r8 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0287
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x028f
        L_0x0287:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m27126M(r6, r8)
            r18[r13] = r8
        L_0x028f:
            r10 = r7
            long r7 = r9.objectFieldOffset(r8)
            int r7 = (int) r7
            int r13 = r13 + 1
            r8 = r18[r13]
            r29 = r7
            boolean r7 = r8 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L_0x02a2
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x02aa
        L_0x02a2:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m27126M(r6, r8)
            r18[r13] = r8
        L_0x02aa:
            long r7 = r9.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r7
            r19 = r14
            r7 = r29
            r14 = 0
            r29 = r10
            r10 = r15
            goto L_0x03ae
        L_0x02ba:
            r10 = r7
            r31 = r8
            int r7 = r14 + 1
            r8 = r18[r14]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m27126M(r6, r8)
            r14 = 9
            if (r15 == r14) goto L_0x0334
            r14 = 17
            if (r15 != r14) goto L_0x02d1
            goto L_0x0334
        L_0x02d1:
            r14 = 27
            if (r15 == r14) goto L_0x0325
            r14 = 49
            if (r15 != r14) goto L_0x02da
            goto L_0x0325
        L_0x02da:
            r14 = 12
            if (r15 == r14) goto L_0x0312
            r14 = 30
            if (r15 == r14) goto L_0x0312
            r14 = 44
            if (r15 != r14) goto L_0x02e7
            goto L_0x0312
        L_0x02e7:
            r14 = 50
            if (r15 != r14) goto L_0x030e
            int r14 = r23 + 1
            r11[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 * 2
            int r29 = r7 + 1
            r7 = r18[r7]
            r12[r23] = r7
            r7 = r1 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x030a
            int r23 = r23 + 1
            int r7 = r29 + 1
            r29 = r18[r29]
            r12[r23] = r29
            r29 = r10
            r23 = r14
            goto L_0x0310
        L_0x030a:
            r23 = r14
            r7 = r29
        L_0x030e:
            r29 = r10
        L_0x0310:
            r10 = 1
            goto L_0x0342
        L_0x0312:
            r14 = r4 & 1
            r29 = r10
            r10 = 1
            if (r14 != r10) goto L_0x0342
            int r14 = r20 / 3
            int r14 = r14 * 2
            int r14 = r14 + r10
            int r19 = r7 + 1
            r7 = r18[r7]
            r12[r14] = r7
            goto L_0x0344
        L_0x0325:
            r29 = r10
            r10 = 1
            int r14 = r20 / 3
            int r14 = r14 * 2
            int r14 = r14 + r10
            int r19 = r7 + 1
            r7 = r18[r7]
            r12[r14] = r7
            goto L_0x0344
        L_0x0334:
            r29 = r10
            r10 = 1
            int r14 = r20 / 3
            int r14 = r14 * 2
            int r14 = r14 + r10
            java.lang.Class r19 = r8.getType()
            r12[r14] = r19
        L_0x0342:
            r19 = r7
        L_0x0344:
            long r7 = r9.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r4 & 1
            if (r8 != r10) goto L_0x039b
            r8 = 17
            if (r15 > r8) goto L_0x039b
            int r8 = r13 + 1
            char r13 = r0.charAt(r13)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x0376
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0360:
            int r30 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r14) goto L_0x0372
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r16
            r13 = r13 | r8
            int r16 = r16 + 13
            r8 = r30
            goto L_0x0360
        L_0x0372:
            int r8 = r8 << r16
            r13 = r13 | r8
            goto L_0x0378
        L_0x0376:
            r30 = r8
        L_0x0378:
            int r8 = r2 * 2
            int r16 = r13 / 32
            int r16 = r16 + r8
            r8 = r18[r16]
            boolean r10 = r8 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0387
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x038f
        L_0x0387:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m27126M(r6, r8)
            r18[r16] = r8
        L_0x038f:
            r10 = r15
            long r14 = r9.objectFieldOffset(r8)
            int r8 = (int) r14
            int r13 = r13 % 32
            r14 = r13
            r13 = r30
            goto L_0x039e
        L_0x039b:
            r10 = r15
            r8 = 0
            r14 = 0
        L_0x039e:
            r15 = 18
            if (r10 < r15) goto L_0x03ac
            r15 = 49
            if (r10 > r15) goto L_0x03ac
            int r15 = r22 + 1
            r11[r22] = r7
            r22 = r15
        L_0x03ac:
            r26 = r13
        L_0x03ae:
            int r13 = r20 + 1
            r3[r20] = r5
            int r5 = r13 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x03bb
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bc
        L_0x03bb:
            r15 = 0
        L_0x03bc:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c3
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c4
        L_0x03c3:
            r1 = 0
        L_0x03c4:
            r1 = r1 | r15
            int r10 = r10 << 20
            r1 = r1 | r10
            r1 = r1 | r7
            r3[r13] = r1
            int r20 = r5 + 1
            int r1 = r14 << 20
            r1 = r1 | r8
            r3[r5] = r1
            r14 = r19
            r10 = r24
            r1 = r25
            r5 = r26
            r13 = r27
            r15 = r28
            r7 = r29
            r8 = r31
            goto L_0x0195
        L_0x03e4:
            r29 = r7
            r31 = r8
            r24 = r10
            r27 = r13
            r28 = r15
            com.google.crypto.tink.shaded.protobuf.m0 r0 = new com.google.crypto.tink.shaded.protobuf.m0
            com.google.crypto.tink.shaded.protobuf.j0 r9 = r34.mo58668b()
            r4 = r0
            r5 = r3
            r6 = r12
            r12 = r28
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.m27132z(com.google.crypto.tink.shaded.protobuf.v0, com.google.crypto.tink.shaded.protobuf.o0, com.google.crypto.tink.shaded.protobuf.a0, com.google.crypto.tink.shaded.protobuf.c1, com.google.crypto.tink.shaded.protobuf.o, com.google.crypto.tink.shaded.protobuf.e0):com.google.crypto.tink.shaded.protobuf.m0");
    }

    /* renamed from: D */
    public final void mo58884D(Object obj, byte[] bArr, int i, int i2, int i3, long j, C16477e.C16478a aVar) throws IOException {
        Unsafe unsafe = f36655s;
        Object m = mo58911m(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f36672q.mo58710h(object)) {
            MapFieldLite f = this.f36672q.mo58708f();
            this.f36672q.mo58703a(f, object);
            unsafe.putObject(obj, j, f);
            object = f;
        }
        this.f36672q.mo58704b(m);
        this.f36672q.mo58705c(object);
        int H = C16477e.m26763H(bArr, i, aVar);
        int i4 = aVar.f36595a;
        if (i4 < 0 || i4 > i2 - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw null;
    }

    /* renamed from: E */
    public final int mo58885E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C16477e.C16478a aVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C16477e.C16478a aVar2 = aVar;
        Unsafe unsafe = f36655s;
        long j3 = (long) (this.f36656a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C16477e.m26771d(i9, bArr2)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C16477e.m26778k(i9, bArr2)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int J = C16477e.m26765J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f36596b));
                    unsafe.putInt(t2, j3, i11);
                    return J;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int H = C16477e.m26763H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f36595a));
                    unsafe.putInt(t2, j3, i11);
                    return H;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C16477e.m26776i(i9, bArr2)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C16477e.m26774g(i9, bArr2)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int J2 = C16477e.m26765J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f36596b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return J2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int H2 = C16477e.m26763H(bArr2, i9, aVar2);
                    int i18 = aVar2.f36595a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m26668f(H2, H2 + i18, bArr2)) {
                        unsafe.putObject(t2, j2, new String(bArr2, H2, i18, C16531v.f36704a));
                        H2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return H2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int o = C16477e.m26782o(mo58912n(i13), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f36597c);
                    } else {
                        unsafe.putObject(t2, j2, C16531v.m27234b(object, aVar2.f36597c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C16477e.m26769b(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f36597c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int H3 = C16477e.m26763H(bArr2, i9, aVar2);
                    int i19 = aVar2.f36595a;
                    C16531v.C16534c l = mo58910l(i13);
                    if (l == null || l.mo58426a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m27129o(t).mo58699b(i10, Long.valueOf((long) i19));
                    }
                    return H3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int H4 = C16477e.m26763H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C16497i.m26919b(aVar2.f36595a)));
                    unsafe.putInt(t2, j3, i11);
                    return H4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int J3 = C16477e.m26765J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C16497i.m26920c(aVar2.f36596b)));
                    unsafe.putInt(t2, j3, i11);
                    return J3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int m = C16477e.m26780m(mo58912n(i13), bArr, i, i2, (i10 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f36597c);
                    } else {
                        unsafe.putObject(t2, j2, C16531v.m27234b(object2, aVar2.f36597c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02fa, code lost:
        r7 = r7 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02fc, code lost:
        r1 = r34;
        r3 = r8;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0301, code lost:
        r1 = r34;
        r10 = r8;
        r26 = r9;
        r21 = r13;
        r19 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011d, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0250, code lost:
        r1 = r7 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0252, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027c, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02bc, code lost:
        r7 = r7 | r23;
        r0 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x042a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58886F(T r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f36655s
            r0 = r32
            r1 = r34
            r2 = -1
            r3 = 0
            r4 = 0
            r6 = -1
            r7 = 0
        L_0x0015:
            if (r0 >= r13) goto L_0x0476
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26762G(r0, r12, r4, r11)
            int r4 = r11.f36595a
            r27 = r4
            r4 = r0
            r0 = r27
        L_0x0028:
            int r8 = r0 >>> 3
            r10 = r0 & 7
            r5 = 3
            if (r8 <= r2) goto L_0x003d
            int r3 = r3 / r5
            int r2 = r15.f36658c
            if (r8 < r2) goto L_0x004c
            int r2 = r15.f36659d
            if (r8 > r2) goto L_0x004c
            int r2 = r15.mo58895P(r8, r3)
            goto L_0x004d
        L_0x003d:
            int r2 = r15.f36658c
            if (r8 < r2) goto L_0x004b
            int r2 = r15.f36659d
            if (r8 > r2) goto L_0x004b
            r3 = 0
            int r2 = r15.mo58895P(r8, r3)
            goto L_0x004d
        L_0x004b:
            r3 = 0
        L_0x004c:
            r2 = -1
        L_0x004d:
            r3 = -1
            if (r2 != r3) goto L_0x005b
            r21 = r0
            r19 = r8
            r26 = r9
            r10 = 0
            r17 = 0
            goto L_0x03cd
        L_0x005b:
            int[] r1 = r15.f36656a
            int r3 = r2 + 1
            r3 = r1[r3]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r3 & r18
            int r5 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r0
            r0 = r3 & r18
            long r12 = (long) r0
            r0 = 17
            r21 = r3
            if (r5 > r0) goto L_0x030c
            int r0 = r2 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r3 = 1
            int r23 = r3 << r1
            r0 = r0 & r18
            if (r0 == r6) goto L_0x0092
            r1 = -1
            r16 = r4
            if (r6 == r1) goto L_0x008b
            long r3 = (long) r6
            r9.putInt(r14, r3, r7)
        L_0x008b:
            long r3 = (long) r0
            int r7 = r9.getInt(r14, r3)
            r6 = r0
            goto L_0x0095
        L_0x0092:
            r16 = r4
            r1 = -1
        L_0x0095:
            r0 = 5
            switch(r5) {
                case 0: goto L_0x02dd;
                case 1: goto L_0x02c0;
                case 2: goto L_0x029d;
                case 3: goto L_0x029d;
                case 4: goto L_0x027f;
                case 5: goto L_0x0255;
                case 6: goto L_0x0232;
                case 7: goto L_0x0202;
                case 8: goto L_0x01d7;
                case 9: goto L_0x019b;
                case 10: goto L_0x017c;
                case 11: goto L_0x027f;
                case 12: goto L_0x0143;
                case 13: goto L_0x0232;
                case 14: goto L_0x0255;
                case 15: goto L_0x0121;
                case 16: goto L_0x00f5;
                case 17: goto L_0x00a8;
                default: goto L_0x0099;
            }
        L_0x0099:
            r12 = r31
            r19 = r1
            r4 = r16
            r13 = r20
            r17 = 0
            r20 = r8
            r8 = r2
            goto L_0x0301
        L_0x00a8:
            r3 = 3
            if (r10 != r3) goto L_0x00e8
            int r0 = r8 << 3
            r4 = r0 | 4
            com.google.crypto.tink.shaded.protobuf.x0 r0 = r15.mo58912n(r2)
            r10 = r20
            r19 = r1
            r1 = r31
            r5 = r2
            r2 = r16
            r17 = 0
            r3 = r33
            r20 = r8
            r8 = r5
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26780m(r0, r1, r2, r3, r4, r5)
            r1 = r7 & r23
            if (r1 != 0) goto L_0x00d3
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r12, r1)
            goto L_0x00e0
        L_0x00d3:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.f36597c
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r1, r2)
            r9.putObject(r14, r12, r1)
        L_0x00e0:
            r1 = r7 | r23
            r12 = r31
            r7 = r1
            r13 = r10
            goto L_0x02fc
        L_0x00e8:
            r19 = r1
            r10 = r20
            r17 = 0
            r20 = r8
            r8 = r2
            r12 = r31
            r13 = r10
            goto L_0x011d
        L_0x00f5:
            r19 = r1
            r4 = r20
            r17 = 0
            r20 = r8
            r8 = r2
            if (r10 != 0) goto L_0x011a
            r2 = r12
            r5 = r16
            r12 = r31
            int r10 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r5, r11)
            long r0 = r11.f36596b
            long r21 = com.google.crypto.tink.shaded.protobuf.C16497i.m26920c(r0)
            r0 = r9
            r1 = r30
            r13 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x02bc
        L_0x011a:
            r12 = r31
            r13 = r4
        L_0x011d:
            r4 = r16
            goto L_0x0301
        L_0x0121:
            r19 = r1
            r5 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != 0) goto L_0x027c
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r5, r11)
            int r1 = r11.f36595a
            int r1 = com.google.crypto.tink.shaded.protobuf.C16497i.m26919b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x02fa
        L_0x0143:
            r19 = r1
            r5 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != 0) goto L_0x027c
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r5, r11)
            int r1 = r11.f36595a
            com.google.crypto.tink.shaded.protobuf.v$c r4 = r15.mo58910l(r8)
            if (r4 == 0) goto L_0x0177
            boolean r4 = r4.mo58426a(r1)
            if (r4 == 0) goto L_0x0169
            goto L_0x0177
        L_0x0169:
            com.google.crypto.tink.shaded.protobuf.d1 r2 = m27129o(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo58699b(r13, r1)
            goto L_0x02fc
        L_0x0177:
            r9.putInt(r14, r2, r1)
            goto L_0x02fa
        L_0x017c:
            r19 = r1
            r5 = r16
            r0 = 2
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x027c
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26769b(r12, r5, r11)
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r2, r1)
            goto L_0x02fa
        L_0x019b:
            r19 = r1
            r5 = r16
            r0 = 2
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x01d3
            com.google.crypto.tink.shaded.protobuf.x0 r0 = r15.mo58912n(r8)
            r4 = r33
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26782o(r0, r12, r5, r4, r11)
            r1 = r7 & r23
            if (r1 != 0) goto L_0x01c4
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r2, r1)
            goto L_0x0250
        L_0x01c4:
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r5 = r11.f36597c
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0250
        L_0x01d3:
            r4 = r33
            goto L_0x027c
        L_0x01d7:
            r4 = r33
            r19 = r1
            r5 = r16
            r0 = 2
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x027c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01f8
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26757B(r12, r5, r11)
            goto L_0x01fc
        L_0x01f8:
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26760E(r12, r5, r11)
        L_0x01fc:
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r2, r1)
            goto L_0x0250
        L_0x0202:
            r4 = r33
            r19 = r1
            r5 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != 0) goto L_0x027c
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r5, r11)
            r32 = r0
            long r0 = r11.f36596b
            r21 = 0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0227
            r0 = 1
            goto L_0x0229
        L_0x0227:
            r0 = r17
        L_0x0229:
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26851q(r14, r2, r0)
            r0 = r7 | r23
            r1 = r0
            r0 = r32
            goto L_0x0252
        L_0x0232:
            r4 = r33
            r19 = r1
            r5 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x027c
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26774g(r5, r12)
            r9.putInt(r14, r2, r0)
            int r0 = r5 + 4
        L_0x0250:
            r1 = r7 | r23
        L_0x0252:
            r7 = r1
            goto L_0x02fc
        L_0x0255:
            r4 = r33
            r19 = r1
            r5 = r16
            r0 = 1
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x027c
            long r21 = com.google.crypto.tink.shaded.protobuf.C16477e.m26776i(r5, r12)
            r0 = r9
            r1 = r30
            r10 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            goto L_0x02fa
        L_0x027c:
            r4 = r5
            goto L_0x0301
        L_0x027f:
            r19 = r1
            r4 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != 0) goto L_0x0301
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r4, r11)
            int r1 = r11.f36595a
            r9.putInt(r14, r2, r1)
            goto L_0x02fa
        L_0x029d:
            r19 = r1
            r4 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != 0) goto L_0x0301
            int r10 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r4, r11)
            long r4 = r11.f36596b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x02bc:
            r7 = r7 | r23
            r0 = r10
            goto L_0x02fc
        L_0x02c0:
            r19 = r1
            r4 = r16
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x0301
            float r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26778k(r4, r12)
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26856v(r14, r2, r0)
            int r0 = r4 + 4
            goto L_0x02fa
        L_0x02dd:
            r19 = r1
            r4 = r16
            r0 = 1
            r17 = 0
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            if (r10 != r0) goto L_0x0301
            double r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26771d(r4, r12)
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26855u(r14, r2, r0)
            int r0 = r4 + 8
        L_0x02fa:
            r7 = r7 | r23
        L_0x02fc:
            r1 = r34
            r3 = r8
            r4 = r13
            goto L_0x0359
        L_0x0301:
            r1 = r34
            r10 = r8
            r26 = r9
            r21 = r13
            r19 = r20
            goto L_0x03cd
        L_0x030c:
            r17 = 0
            r19 = -1
            r27 = r12
            r12 = r31
            r13 = r20
            r20 = r8
            r8 = r2
            r2 = r27
            r0 = 27
            if (r5 != r0) goto L_0x036e
            r0 = 2
            if (r10 != r0) goto L_0x035f
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.crypto.tink.shaded.protobuf.v$d r0 = (com.google.crypto.tink.shaded.protobuf.C16531v.C16535d) r0
            boolean r1 = r0.mo58674h()
            if (r1 != 0) goto L_0x0340
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0337
            r1 = 10
            goto L_0x0339
        L_0x0337:
            int r1 = r1 * 2
        L_0x0339:
            com.google.crypto.tink.shaded.protobuf.v$d r0 = r0.mo58661i(r1)
            r9.putObject(r14, r2, r0)
        L_0x0340:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.x0 r0 = r15.mo58912n(r8)
            r1 = r13
            r2 = r31
            r3 = r4
            r4 = r33
            r16 = r6
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26783p(r0, r1, r2, r3, r4, r5, r6)
            r1 = r34
            r3 = r8
            r4 = r13
            r6 = r16
        L_0x0359:
            r2 = r20
            r13 = r33
            goto L_0x0015
        L_0x035f:
            r16 = r6
            r15 = r4
            r25 = r7
            r26 = r9
            r21 = r13
            r19 = r20
            r20 = r8
            goto L_0x03c4
        L_0x036e:
            r16 = r6
            r0 = 49
            if (r5 > r0) goto L_0x03aa
            r6 = r21
            long r0 = (long) r6
            r21 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r4
            r6 = r4
            r4 = r33
            r18 = r5
            r15 = 0
            r5 = r13
            r15 = r6
            r6 = r20
            r25 = r7
            r7 = r10
            r10 = r19
            r19 = r20
            r20 = r8
            r26 = r9
            r9 = r21
            r11 = r18
            r21 = r13
            r12 = r23
            r14 = r35
            int r4 = r0.mo58888H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r4 == r15) goto L_0x03c5
            r0 = r4
            goto L_0x0407
        L_0x03aa:
            r23 = r2
            r15 = r4
            r18 = r5
            r25 = r7
            r26 = r9
            r19 = r20
            r6 = r21
            r20 = r8
            r21 = r13
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x03eb
            r0 = 2
            if (r10 == r0) goto L_0x03d7
        L_0x03c4:
            r4 = r15
        L_0x03c5:
            r1 = r34
            r6 = r16
            r10 = r20
            r7 = r25
        L_0x03cd:
            r2 = r4
            r16 = r6
            r25 = r7
            r8 = r21
            r14 = 0
            r7 = r1
            goto L_0x0428
        L_0x03d7:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r23
            r8 = r35
            r0.mo58884D(r1, r2, r3, r4, r5, r6, r8)
            r14 = 0
            throw r14
        L_0x03eb:
            r14 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r8 = r6
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r19
            r7 = r10
            r10 = r23
            r12 = r20
            r13 = r35
            int r0 = r0.mo58885E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0421
        L_0x0407:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r34
            r11 = r35
            r6 = r16
            r2 = r19
            r3 = r20
            r4 = r21
        L_0x041b:
            r7 = r25
            r9 = r26
            goto L_0x0015
        L_0x0421:
            r7 = r34
            r2 = r0
            r10 = r20
            r8 = r21
        L_0x0428:
            if (r8 != r7) goto L_0x0438
            if (r7 == 0) goto L_0x0438
            r3 = -1
            r9 = r29
            r0 = r2
            r1 = r7
            r4 = r8
            r2 = r14
            r6 = r16
            r7 = r25
            goto L_0x047f
        L_0x0438:
            r9 = r29
            boolean r0 = r9.f36661f
            r11 = r35
            if (r0 == 0) goto L_0x0458
            com.google.crypto.tink.shaded.protobuf.n r0 = r11.f36598d
            com.google.crypto.tink.shaded.protobuf.n r1 = com.google.crypto.tink.shaded.protobuf.C16511n.m27170a()
            if (r0 == r1) goto L_0x0458
            com.google.crypto.tink.shaded.protobuf.j0 r5 = r9.f36660e
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26773f(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0467
        L_0x0458:
            com.google.crypto.tink.shaded.protobuf.d1 r4 = m27129o(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26761F(r0, r1, r2, r3, r4, r5)
        L_0x0467:
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r7
            r4 = r8
            r15 = r9
            r3 = r10
            r6 = r16
            r2 = r19
            goto L_0x041b
        L_0x0476:
            r16 = r6
            r25 = r7
            r26 = r9
            r9 = r15
            r2 = 0
            r3 = -1
        L_0x047f:
            if (r6 == r3) goto L_0x048a
            long r5 = (long) r6
            r3 = r30
            r8 = r26
            r8.putInt(r3, r5, r7)
            goto L_0x048c
        L_0x048a:
            r3 = r30
        L_0x048c:
            int r5 = r9.f36666k
        L_0x048e:
            int r6 = r9.f36667l
            if (r5 >= r6) goto L_0x049e
            int[] r6 = r9.f36665j
            r6 = r6[r5]
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r7 = r9.f36670o
            r9.mo58909k(r3, r6, r2, r7)
            int r5 = r5 + 1
            goto L_0x048e
        L_0x049e:
            if (r1 != 0) goto L_0x04aa
            r2 = r33
            if (r0 != r2) goto L_0x04a5
            goto L_0x04b0
        L_0x04a5:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x04aa:
            r2 = r33
            if (r0 > r2) goto L_0x04b1
            if (r4 != r1) goto L_0x04b1
        L_0x04b0:
            return r0
        L_0x04b1:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58886F(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0240, code lost:
        if (r0 != r15) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0245, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014d, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015b, code lost:
        r0 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0169, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        r19 = r6;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016f, code lost:
        r19 = r6;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f4, code lost:
        if (r0 != r15) goto L_0x0242;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58887G(java.lang.Object r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.C16477e.C16478a r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f36655s
            r10 = 0
            r8 = -1
            r0 = r30
            r1 = r8
            r2 = r10
        L_0x0012:
            if (r0 >= r13) goto L_0x026d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26762G(r0, r12, r3, r11)
            int r3 = r11.f36595a
            r7 = r0
            r16 = r3
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r7 = r3
        L_0x0027:
            int r6 = r16 >>> 3
            r5 = r16 & 7
            if (r6 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.f36658c
            if (r6 < r0) goto L_0x0049
            int r0 = r15.f36659d
            if (r6 > r0) goto L_0x0049
            int r0 = r15.mo58895P(r6, r2)
            goto L_0x004a
        L_0x003c:
            int r0 = r15.f36658c
            if (r6 < r0) goto L_0x0049
            int r0 = r15.f36659d
            if (r6 > r0) goto L_0x0049
            int r0 = r15.mo58895P(r6, r10)
            goto L_0x004a
        L_0x0049:
            r0 = r8
        L_0x004a:
            r4 = r0
            if (r4 != r8) goto L_0x0058
            r19 = r6
            r2 = r7
            r24 = r8
            r18 = r9
            r26 = r10
            goto L_0x0248
        L_0x0058:
            int[] r0 = r15.f36656a
            int r1 = r4 + 1
            r3 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r3
            int r2 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            long r0 = (long) r0
            r8 = 17
            r10 = 2
            if (r2 > r8) goto L_0x0173
            r8 = 1
            switch(r2) {
                case 0: goto L_0x015e;
                case 1: goto L_0x014f;
                case 2: goto L_0x013d;
                case 3: goto L_0x013d;
                case 4: goto L_0x012f;
                case 5: goto L_0x011f;
                case 6: goto L_0x0112;
                case 7: goto L_0x00fb;
                case 8: goto L_0x00e3;
                case 9: goto L_0x00c1;
                case 10: goto L_0x00b3;
                case 11: goto L_0x012f;
                case 12: goto L_0x00a0;
                case 13: goto L_0x0112;
                case 14: goto L_0x011f;
                case 15: goto L_0x008e;
                case 16: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x008b
        L_0x0072:
            if (r5 != 0) goto L_0x008b
            int r7 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r7, r11)
            long r2 = r11.f36596b
            long r19 = com.google.crypto.tink.shaded.protobuf.C16497i.m26920c(r2)
            r2 = r0
            r0 = r9
            r1 = r28
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r10 = r8
            goto L_0x014d
        L_0x008b:
            r8 = r4
            goto L_0x01b3
        L_0x008e:
            r2 = r0
            r8 = r4
            if (r5 != 0) goto L_0x00b0
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r7, r11)
            int r1 = r11.f36595a
            int r1 = com.google.crypto.tink.shaded.protobuf.C16497i.m26919b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x00ad
        L_0x00a0:
            r2 = r0
            r8 = r4
            if (r5 != 0) goto L_0x00b0
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r7, r11)
            int r1 = r11.f36595a
            r9.putInt(r14, r2, r1)
        L_0x00ad:
            r10 = r8
            goto L_0x016b
        L_0x00b0:
            r10 = r8
            goto L_0x016f
        L_0x00b3:
            r2 = r0
            r8 = r4
            if (r5 != r10) goto L_0x01b3
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26769b(r12, r7, r11)
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00c1:
            r2 = r0
            r8 = r4
            if (r5 != r10) goto L_0x01b3
            com.google.crypto.tink.shaded.protobuf.x0 r0 = r15.mo58912n(r8)
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26782o(r0, r12, r7, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d9
            java.lang.Object r1 = r11.f36597c
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00d9:
            java.lang.Object r4 = r11.f36597c
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r1, r4)
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00e3:
            r1 = r0
            r8 = r4
            if (r5 != r10) goto L_0x01b3
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f1
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26757B(r12, r7, r11)
            goto L_0x00f5
        L_0x00f1:
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26760E(r12, r7, r11)
        L_0x00f5:
            java.lang.Object r3 = r11.f36597c
            r9.putObject(r14, r1, r3)
            goto L_0x00ad
        L_0x00fb:
            r1 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r7, r11)
            long r3 = r11.f36596b
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r8 = 0
        L_0x010d:
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26851q(r14, r1, r8)
            goto L_0x016b
        L_0x0112:
            r1 = r0
            r10 = r4
            r0 = 5
            if (r5 != r0) goto L_0x016f
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26774g(r7, r12)
            r9.putInt(r14, r1, r0)
            goto L_0x015b
        L_0x011f:
            r1 = r0
            r10 = r4
            if (r5 != r8) goto L_0x016f
            long r4 = com.google.crypto.tink.shaded.protobuf.C16477e.m26776i(r7, r12)
            r0 = r9
            r2 = r1
            r1 = r28
            r0.putLong(r1, r2, r4)
            goto L_0x0169
        L_0x012f:
            r2 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26763H(r12, r7, r11)
            int r1 = r11.f36595a
            r9.putInt(r14, r2, r1)
            goto L_0x016b
        L_0x013d:
            r2 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r7 = com.google.crypto.tink.shaded.protobuf.C16477e.m26765J(r12, r7, r11)
            long r4 = r11.f36596b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x014d:
            r0 = r7
            goto L_0x016b
        L_0x014f:
            r2 = r0
            r10 = r4
            r0 = 5
            if (r5 != r0) goto L_0x016f
            float r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26778k(r7, r12)
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26856v(r14, r2, r0)
        L_0x015b:
            int r0 = r7 + 4
            goto L_0x016b
        L_0x015e:
            r2 = r0
            r10 = r4
            if (r5 != r8) goto L_0x016f
            double r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26771d(r7, r12)
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26855u(r14, r2, r0)
        L_0x0169:
            int r0 = r7 + 8
        L_0x016b:
            r19 = r6
            r8 = r10
            goto L_0x01ac
        L_0x016f:
            r19 = r6
            r8 = r10
            goto L_0x01b5
        L_0x0173:
            r8 = r4
            r4 = 27
            if (r2 != r4) goto L_0x01bf
            if (r5 != r10) goto L_0x01b3
            java.lang.Object r2 = r9.getObject(r14, r0)
            com.google.crypto.tink.shaded.protobuf.v$d r2 = (com.google.crypto.tink.shaded.protobuf.C16531v.C16535d) r2
            boolean r3 = r2.mo58674h()
            if (r3 != 0) goto L_0x0198
            int r3 = r2.size()
            if (r3 != 0) goto L_0x018f
            r3 = 10
            goto L_0x0191
        L_0x018f:
            int r3 = r3 * 2
        L_0x0191:
            com.google.crypto.tink.shaded.protobuf.v$d r2 = r2.mo58661i(r3)
            r9.putObject(r14, r0, r2)
        L_0x0198:
            r5 = r2
            com.google.crypto.tink.shaded.protobuf.x0 r0 = r15.mo58912n(r8)
            r1 = r16
            r2 = r29
            r3 = r7
            r4 = r31
            r19 = r6
            r6 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26783p(r0, r1, r2, r3, r4, r5, r6)
        L_0x01ac:
            r2 = r8
            r1 = r19
            r8 = -1
            r10 = 0
            goto L_0x0012
        L_0x01b3:
            r19 = r6
        L_0x01b5:
            r15 = r7
            r17 = r8
            r18 = r9
            r24 = -1
            r26 = 0
            goto L_0x0210
        L_0x01bf:
            r19 = r6
            r4 = 49
            if (r2 > r4) goto L_0x01f7
            long r3 = (long) r3
            r20 = r0
            r0 = r27
            r1 = r28
            r10 = r2
            r2 = r29
            r22 = r3
            r3 = r7
            r4 = r31
            r6 = r5
            r5 = r16
            r30 = r6
            r6 = r19
            r15 = r7
            r7 = r30
            r17 = r8
            r24 = -1
            r18 = r9
            r25 = r10
            r26 = 0
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.mo58888H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0245
            goto L_0x0242
        L_0x01f7:
            r20 = r0
            r25 = r2
            r30 = r5
            r15 = r7
            r17 = r8
            r18 = r9
            r24 = -1
            r26 = 0
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0226
            r7 = r30
            if (r7 == r10) goto L_0x0212
        L_0x0210:
            r2 = r15
            goto L_0x0246
        L_0x0212:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r20
            r8 = r32
            r0.mo58884D(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x0226:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r8 = r3
            r3 = r15
            r4 = r31
            r5 = r16
            r6 = r19
            r10 = r20
            r12 = r17
            r13 = r32
            int r0 = r0.mo58885E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0245
        L_0x0242:
            r2 = r17
            goto L_0x0259
        L_0x0245:
            r2 = r0
        L_0x0246:
            r10 = r17
        L_0x0248:
            com.google.crypto.tink.shaded.protobuf.d1 r4 = m27129o(r28)
            r0 = r16
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.crypto.tink.shaded.protobuf.C16477e.m26761F(r0, r1, r2, r3, r4, r5)
            r2 = r10
        L_0x0259:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r1 = r19
            r8 = r24
            r10 = r26
            goto L_0x0012
        L_0x026d:
            r1 = r13
            if (r0 != r1) goto L_0x0271
            return
        L_0x0271:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58887G(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):void");
    }

    /* renamed from: H */
    public final int mo58888H(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C16477e.C16478a aVar) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C16477e.C16478a aVar2 = aVar;
        Unsafe unsafe = f36655s;
        C16531v.C16535d dVar = (C16531v.C16535d) unsafe.getObject(t, j3);
        if (!dVar.mo58674h()) {
            int size = dVar.size();
            dVar = dVar.mo58661i(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, dVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C16477e.m26785r(bArr, i9, dVar, aVar2);
                }
                if (i10 == 1) {
                    return C16477e.m26772e(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C16477e.m26788u(bArr, i9, dVar, aVar2);
                }
                if (i10 == 5) {
                    return C16477e.m26779l(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C16477e.m26792y(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C16477e.m26766K(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C16477e.m26791x(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C16477e.m26764I(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C16477e.m26787t(bArr, i9, dVar, aVar2);
                }
                if (i10 == 1) {
                    return C16477e.m26777j(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C16477e.m26786s(bArr, i9, dVar, aVar2);
                }
                if (i10 == 5) {
                    return C16477e.m26775h(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C16477e.m26784q(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C16477e.m26768a(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? C16477e.m26758C(i3, bArr, i, i2, dVar, aVar) : C16477e.m26759D(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C16477e.m26783p(mo58912n(i11), i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C16477e.m26770c(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C16477e.m26791x(bArr, i9, dVar, aVar2);
                } else if (i10 == 0) {
                    i8 = C16477e.m26764I(i3, bArr, i, i2, dVar, aVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C16476d1 d1Var = generatedMessageLite.unknownFields;
                if (d1Var == C16476d1.f36589f) {
                    d1Var = null;
                }
                C16476d1 d1Var2 = (C16476d1) C16544y0.m27346z(i4, dVar, mo58910l(i11), d1Var, this.f36670o);
                if (d1Var2 != null) {
                    generatedMessageLite.unknownFields = d1Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C16477e.m26789v(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C16477e.m26793z(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C16477e.m26790w(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C16477e.m26756A(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C16477e.m26781n(mo58912n(i11), i3, bArr, i, i2, dVar, aVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: I */
    public final <E> void mo58889I(Object obj, long j, C16540w0 w0Var, C16542x0<E> x0Var, C16511n nVar) throws IOException {
        w0Var.mo58821M(this.f36669n.mo58609c(j, obj), x0Var, nVar);
    }

    /* renamed from: J */
    public final <E> void mo58890J(Object obj, int i, C16540w0 w0Var, C16542x0<E> x0Var, C16511n nVar) throws IOException {
        w0Var.mo58819K(this.f36669n.mo58609c((long) (i & 1048575), obj), x0Var, nVar);
    }

    /* renamed from: K */
    public final void mo58891K(Object obj, int i, C16540w0 w0Var) throws IOException {
        if ((536870912 & i) != 0) {
            C16488g1.m26859y((long) (i & 1048575), obj, w0Var.mo58816H());
        } else if (this.f36662g) {
            C16488g1.m26859y((long) (i & 1048575), obj, w0Var.mo58856y());
        } else {
            C16488g1.m26859y((long) (i & 1048575), obj, w0Var.mo58843n());
        }
    }

    /* renamed from: L */
    public final void mo58892L(Object obj, int i, C16540w0 w0Var) throws IOException {
        if ((536870912 & i) != 0) {
            w0Var.mo58842m(this.f36669n.mo58609c((long) (i & 1048575), obj));
        } else {
            w0Var.mo58809A(this.f36669n.mo58609c((long) (i & 1048575), obj));
        }
    }

    /* renamed from: N */
    public final void mo58893N(int i, Object obj) {
        if (!this.f36663h) {
            int i2 = this.f36656a[i + 2];
            long j = (long) (i2 & 1048575);
            C16488g1.m26857w(obj, C16488g1.m26847m(j, obj) | (1 << (i2 >>> 20)), j);
        }
    }

    /* renamed from: O */
    public final void mo58894O(int i, int i2, Object obj) {
        C16488g1.m26857w(obj, i, (long) (this.f36656a[i2 + 2] & 1048575));
    }

    /* renamed from: P */
    public final int mo58895P(int i, int i2) {
        int length = (this.f36656a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f36656a[i4];
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

    /* renamed from: R */
    public final int mo58896R(int i) {
        return this.f36656a[i + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c4  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58897S(java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.C16505k r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f36661f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.o<?> r3 = r0.f36671p
            com.google.crypto.tink.shaded.protobuf.r r3 = r3.mo58927c(r1)
            boolean r5 = r3.mo58941h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo58944k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f36656a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f36655s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x04a3
            int r12 = r0.mo58896R(r10)
            int[] r13 = r0.f36656a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f36663h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007b
            com.google.crypto.tink.shaded.protobuf.o<?> r9 = r0.f36671p
            r9.mo58925a(r5)
            if (r14 < 0) goto L_0x007b
            com.google.crypto.tink.shaded.protobuf.o<?> r9 = r0.f36671p
            r9.mo58934j(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x0079:
            r5 = 0
            goto L_0x005e
        L_0x007b:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0494;
                case 1: goto L_0x0488;
                case 2: goto L_0x047c;
                case 3: goto L_0x0470;
                case 4: goto L_0x0464;
                case 5: goto L_0x0458;
                case 6: goto L_0x044c;
                case 7: goto L_0x0440;
                case 8: goto L_0x0434;
                case 9: goto L_0x0423;
                case 10: goto L_0x0414;
                case 11: goto L_0x0407;
                case 12: goto L_0x03fa;
                case 13: goto L_0x03ed;
                case 14: goto L_0x03e0;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03c6;
                case 17: goto L_0x03b5;
                case 18: goto L_0x03a5;
                case 19: goto L_0x0395;
                case 20: goto L_0x0385;
                case 21: goto L_0x0375;
                case 22: goto L_0x0365;
                case 23: goto L_0x0355;
                case 24: goto L_0x0345;
                case 25: goto L_0x0335;
                case 26: goto L_0x0326;
                case 27: goto L_0x0313;
                case 28: goto L_0x0304;
                case 29: goto L_0x02f4;
                case 30: goto L_0x02e4;
                case 31: goto L_0x02d4;
                case 32: goto L_0x02c4;
                case 33: goto L_0x02b4;
                case 34: goto L_0x02a4;
                case 35: goto L_0x0294;
                case 36: goto L_0x0284;
                case 37: goto L_0x0274;
                case 38: goto L_0x0264;
                case 39: goto L_0x0254;
                case 40: goto L_0x0244;
                case 41: goto L_0x0234;
                case 42: goto L_0x0224;
                case 43: goto L_0x0214;
                case 44: goto L_0x0204;
                case 45: goto L_0x01f4;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01d4;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a8;
                case 51: goto L_0x0193;
                case 52: goto L_0x017e;
                case 53: goto L_0x016f;
                case 54: goto L_0x0160;
                case 55: goto L_0x0151;
                case 56: goto L_0x0142;
                case 57: goto L_0x0133;
                case 58: goto L_0x011e;
                case 59: goto L_0x010f;
                case 60: goto L_0x00fc;
                case 61: goto L_0x00ec;
                case 62: goto L_0x00de;
                case 63: goto L_0x00d0;
                case 64: goto L_0x00c2;
                case 65: goto L_0x00b4;
                case 66: goto L_0x00a6;
                case 67: goto L_0x0098;
                case 68: goto L_0x0086;
                default: goto L_0x0083;
            }
        L_0x0083:
            r13 = 0
            goto L_0x049f
        L_0x0086:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.x0 r9 = r0.mo58912n(r12)
            r2.mo58865h(r14, r9, r4)
            goto L_0x0083
        L_0x0098:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m27125C(r9, r1)
            r2.mo58873p(r14, r9)
            goto L_0x0083
        L_0x00a6:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58872o(r14, r4)
            goto L_0x0083
        L_0x00b4:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m27125C(r9, r1)
            r2.mo58871n(r14, r9)
            goto L_0x0083
        L_0x00c2:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58870m(r14, r4)
            goto L_0x0083
        L_0x00d0:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58861d(r14, r4)
            goto L_0x0083
        L_0x00de:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58874q(r14, r4)
            goto L_0x0083
        L_0x00ec:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.mo58859b(r14, r4)
            goto L_0x0083
        L_0x00fc:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.x0 r9 = r0.mo58912n(r12)
            r2.mo58868k(r14, r9, r4)
            goto L_0x0083
        L_0x010f:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            m27128U(r14, r4, r2)
            goto L_0x0083
        L_0x011e:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r9, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.mo58858a(r14, r4)
            goto L_0x0083
        L_0x0133:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58862e(r14, r4)
            goto L_0x0083
        L_0x0142:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m27125C(r9, r1)
            r2.mo58863f(r14, r9)
            goto L_0x0083
        L_0x0151:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m27124B(r9, r1)
            r2.mo58866i(r14, r4)
            goto L_0x0083
        L_0x0160:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m27125C(r9, r1)
            r2.mo58875r(r14, r9)
            goto L_0x0083
        L_0x016f:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m27125C(r9, r1)
            r2.mo58867j(r14, r9)
            goto L_0x0083
        L_0x017e:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r9, r1)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.mo58864g(r4, r14)
            goto L_0x0083
        L_0x0193:
            boolean r4 = r0.mo58917s(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r9, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r9 = r4.doubleValue()
            r2.mo58860c(r14, r9)
            goto L_0x0083
        L_0x01a8:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.mo58898T(r2, r14, r4, r12)
            goto L_0x0083
        L_0x01b1:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r0.mo58912n(r12)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27310L(r4, r9, r2, r10)
            goto L_0x0083
        L_0x01c4:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01d4:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01e4:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01f4:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0204:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0214:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0224:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0234:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0244:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0254:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0264:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0274:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0284:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0294:
            r13 = 1
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02a4:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02b4:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02c4:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02d4:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02e4:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02f4:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0304:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27304F(r4, r9, r2)
            goto L_0x0083
        L_0x0313:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r0.mo58912n(r12)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27313O(r4, r9, r2, r10)
            goto L_0x0083
        L_0x0326:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27318T(r4, r9, r2)
            goto L_0x0083
        L_0x0335:
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0345:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0355:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0365:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0375:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0385:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0395:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03a5:
            r13 = 0
            int[] r4 = r0.f36656a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.x0 r9 = r0.mo58912n(r12)
            r2.mo58865h(r14, r9, r4)
            goto L_0x049f
        L_0x03c6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo58873p(r14, r9)
            goto L_0x049f
        L_0x03d3:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58872o(r14, r4)
            goto L_0x049f
        L_0x03e0:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo58871n(r14, r9)
            goto L_0x049f
        L_0x03ed:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58870m(r14, r4)
            goto L_0x049f
        L_0x03fa:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58861d(r14, r4)
            goto L_0x049f
        L_0x0407:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58874q(r14, r4)
            goto L_0x049f
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.mo58859b(r14, r4)
            goto L_0x049f
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.crypto.tink.shaded.protobuf.x0 r9 = r0.mo58912n(r12)
            r2.mo58868k(r14, r9, r4)
            goto L_0x049f
        L_0x0434:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            m27128U(r14, r4, r2)
            goto L_0x049f
        L_0x0440:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r9, r1)
            r2.mo58858a(r14, r4)
            goto L_0x049f
        L_0x044c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58862e(r14, r4)
            goto L_0x049f
        L_0x0458:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo58863f(r14, r9)
            goto L_0x049f
        L_0x0464:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo58866i(r14, r4)
            goto L_0x049f
        L_0x0470:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo58875r(r14, r9)
            goto L_0x049f
        L_0x047c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo58867j(r14, r9)
            goto L_0x049f
        L_0x0488:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            float r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r9, r1)
            r2.mo58864g(r4, r14)
            goto L_0x049f
        L_0x0494:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            double r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r9, r1)
            r2.mo58860c(r14, r9)
        L_0x049f:
            int r10 = r12 + 3
            goto L_0x002b
        L_0x04a3:
            if (r5 == 0) goto L_0x04ba
            com.google.crypto.tink.shaded.protobuf.o<?> r4 = r0.f36671p
            r4.mo58934j(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b8
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x04a3
        L_0x04b8:
            r5 = 0
            goto L_0x04a3
        L_0x04ba:
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r3 = r0.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r3.mo58685g(r1)
            r3.mo58697s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58897S(java.lang.Object, com.google.crypto.tink.shaded.protobuf.k):void");
    }

    /* renamed from: T */
    public final void mo58898T(C16505k kVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f36672q.mo58704b(mo58911m(i2));
            MapFieldLite d = this.f36672q.mo58706d(obj);
            kVar.f36650a.getClass();
            Iterator it = d.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kVar.f36650a.mo58502M(i, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo58899a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f36656a.length; i += 3) {
            int R = mo58896R(i);
            long j = (long) (1048575 & R);
            int i2 = this.f36656a[i];
            switch ((R & 267386880) >>> 20) {
                case 0:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26855u(t, j, C16488g1.m26845k(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 1:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26856v(t, j, C16488g1.m26846l(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 2:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26858x(t, j, C16488g1.m26848n(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 3:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26858x(t, j, C16488g1.m26848n(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 4:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 5:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26858x(t, j, C16488g1.m26848n(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 6:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 7:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26851q(t, j, C16488g1.m26840f(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 8:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26859y(j, t, C16488g1.m26849o(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 9:
                    mo58920w(i, t, t2);
                    break;
                case 10:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26859y(j, t, C16488g1.m26849o(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 11:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 12:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 13:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 14:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26858x(t, j, C16488g1.m26848n(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 15:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26857w(t, C16488g1.m26847m(j, t2), j);
                        mo58893N(i, t);
                        break;
                    }
                case 16:
                    if (!mo58916r(i, t2)) {
                        break;
                    } else {
                        C16488g1.m26858x(t, j, C16488g1.m26848n(j, t2));
                        mo58893N(i, t);
                        break;
                    }
                case 17:
                    mo58920w(i, t, t2);
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
                    this.f36669n.mo58608b(j, t, t2);
                    break;
                case 50:
                    C16479e0 e0Var = this.f36672q;
                    Class<?> cls = C16544y0.f36715a;
                    C16488g1.m26859y(j, t, e0Var.mo58703a(C16488g1.m26849o(j, t), C16488g1.m26849o(j, t2)));
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
                    if (!mo58917s(i2, i, t2)) {
                        break;
                    } else {
                        C16488g1.m26859y(j, t, C16488g1.m26849o(j, t2));
                        mo58894O(i2, i, t);
                        break;
                    }
                case 60:
                    mo58921x(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo58917s(i2, i, t2)) {
                        break;
                    } else {
                        C16488g1.m26859y(j, t, C16488g1.m26849o(j, t2));
                        mo58894O(i2, i, t);
                        break;
                    }
                case 68:
                    mo58921x(i, t, t2);
                    break;
            }
        }
        C16473c1<?, ?> c1Var = this.f36670o;
        Class<?> cls2 = C16544y0.f36715a;
        c1Var.mo58693o(t, c1Var.mo58689k(c1Var.mo58685g(t), c1Var.mo58685g(t2)));
        if (this.f36661f) {
            C16544y0.m27300B(this.f36671p, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo58900b(T t) {
        int i;
        int i2 = this.f36666k;
        while (true) {
            i = this.f36667l;
            if (i2 >= i) {
                break;
            }
            long R = (long) (mo58896R(this.f36665j[i2]) & 1048575);
            Object o = C16488g1.m26849o(R, t);
            if (o != null) {
                C16488g1.m26859y(R, t, this.f36672q.mo58707e(o));
            }
            i2++;
        }
        int length = this.f36665j.length;
        while (i < length) {
            this.f36669n.mo58607a((long) this.f36665j[i], t);
            i++;
        }
        this.f36670o.mo58688j(t);
        if (this.f36661f) {
            this.f36671p.mo58930f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo58901c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f36666k) {
                return !this.f36661f || this.f36671p.mo58927c(t).mo58943i();
            }
            int i5 = this.f36665j[i3];
            int i6 = this.f36656a[i5];
            int R = mo58896R(i5);
            if (!this.f36663h) {
                int i7 = this.f36656a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f36655s.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & R) != 0) {
                if (!(this.f36663h ? mo58916r(i5, t) : (i4 & i) != 0)) {
                    return false;
                }
            }
            int i9 = (267386880 & R) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (this.f36663h) {
                    z = mo58916r(i5, t);
                } else if ((i4 & i) == 0) {
                    z = false;
                }
                if (z && !mo58912n(i5).mo58901c(C16488g1.m26849o((long) (R & 1048575), t))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (mo58917s(i6, i5, t) && !mo58912n(i5).mo58901c(C16488g1.m26849o((long) (R & 1048575), t))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 == 50 && !this.f36672q.mo58706d(C16488g1.m26849o((long) (R & 1048575), t)).isEmpty()) {
                            this.f36672q.mo58704b(mo58911m(i5));
                            throw null;
                        }
                    }
                }
                List list = (List) C16488g1.m26849o((long) (R & 1048575), t);
                if (!list.isEmpty()) {
                    C16542x0 n = mo58912n(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!n.mo58901c(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* renamed from: d */
    public final int mo58902d(T t) {
        return this.f36663h ? mo58915q(t) : mo58914p(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f7, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0241, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58903e(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f36656a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.mo58896R(r1)
            int[] r4 = r10.f36656a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0233;
                case 1: goto L_0x0228;
                case 2: goto L_0x021d;
                case 3: goto L_0x0212;
                case 4: goto L_0x020b;
                case 5: goto L_0x0200;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01de;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01bb;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01ab;
                case 14: goto L_0x019f;
                case 15: goto L_0x0197;
                case 16: goto L_0x018b;
                case 17: goto L_0x0180;
                case 18: goto L_0x0174;
                case 19: goto L_0x0174;
                case 20: goto L_0x0174;
                case 21: goto L_0x0174;
                case 22: goto L_0x0174;
                case 23: goto L_0x0174;
                case 24: goto L_0x0174;
                case 25: goto L_0x0174;
                case 26: goto L_0x0174;
                case 27: goto L_0x0174;
                case 28: goto L_0x0174;
                case 29: goto L_0x0174;
                case 30: goto L_0x0174;
                case 31: goto L_0x0174;
                case 32: goto L_0x0174;
                case 33: goto L_0x0174;
                case 34: goto L_0x0174;
                case 35: goto L_0x0174;
                case 36: goto L_0x0174;
                case 37: goto L_0x0174;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                case 40: goto L_0x0174;
                case 41: goto L_0x0174;
                case 42: goto L_0x0174;
                case 43: goto L_0x0174;
                case 44: goto L_0x0174;
                case 45: goto L_0x0174;
                case 46: goto L_0x0174;
                case 47: goto L_0x0174;
                case 48: goto L_0x0174;
                case 49: goto L_0x0174;
                case 50: goto L_0x0168;
                case 51: goto L_0x014c;
                case 52: goto L_0x0134;
                case 53: goto L_0x0122;
                case 54: goto L_0x0110;
                case 55: goto L_0x0102;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00ca;
                case 59: goto L_0x00b6;
                case 60: goto L_0x00a4;
                case 61: goto L_0x0092;
                case 62: goto L_0x0084;
                case 63: goto L_0x0076;
                case 64: goto L_0x0068;
                case 65: goto L_0x0056;
                case 66: goto L_0x0048;
                case 67: goto L_0x0036;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0243
        L_0x0024:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m27125C(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m27125C(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m27125C(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m27124B(r5, r11)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m27125C(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m27125C(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.mo58917s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r5, r11)
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C16531v.f36704a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r5, r11)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r5, r11)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.C16531v.m27233a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r10.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r0.mo58685g(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f36661f
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            com.google.crypto.tink.shaded.protobuf.o<?> r1 = r10.f36671p
            com.google.crypto.tink.shaded.protobuf.r r11 = r1.mo58927c(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58903e(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10), com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10), com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10), com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10), com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10), com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10) == com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r6, r10)) == java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r6, r10)) == java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58904f(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f36656a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.mo58896R(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014b;
                case 6: goto L_0x0139;
                case 7: goto L_0x0127;
                case 8: goto L_0x0111;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00af;
                case 14: goto L_0x009b;
                case 15: goto L_0x0089;
                case 16: goto L_0x0075;
                case 17: goto L_0x005f;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x0043;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01cb
        L_0x001c:
            int[] r4 = r9.f36656a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r4, r10)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r4, r11)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10)
            long r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10)
            long r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r10)
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r6, r11)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27301C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r6, r10)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10)
            long r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r10)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10)
            long r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r10)
            long r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r6, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r6, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.mo58908j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r6, r10)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r6, r11)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r3 = r1
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            return r1
        L_0x01ce:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d2:
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r9.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r0 = r0.mo58685g(r10)
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r2 = r9.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r2 = r2.mo58685g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f36661f
            if (r0 == 0) goto L_0x01fa
            com.google.crypto.tink.shaded.protobuf.o<?> r0 = r9.f36671p
            com.google.crypto.tink.shaded.protobuf.r r10 = r0.mo58927c(r10)
            com.google.crypto.tink.shaded.protobuf.o<?> r0 = r9.f36671p
            com.google.crypto.tink.shaded.protobuf.r r11 = r0.mo58927c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58904f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x072a  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x07f6  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08d7  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x090a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x091b  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x092c  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0952  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0974  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0985  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x09b8  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x09cb  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x09e0  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x09f1  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0a02  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0a12  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0a32  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0a42  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0a52  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a62  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a77  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0550 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0066 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0a71 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02cd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58905g(java.lang.Object r14, com.google.crypto.tink.shaded.protobuf.C16505k r15) throws java.io.IOException {
        /*
            r13 = this;
            r15.getClass()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder.ASCENDING
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder.DESCENDING
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 1
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            if (r0 != r1) goto L_0x0567
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r13.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r0.mo58685g(r14)
            r0.mo58697s(r1, r15)
            boolean r0 = r13.f36661f
            if (r0 == 0) goto L_0x0061
            com.google.crypto.tink.shaded.protobuf.o<?> r0 = r13.f36671p
            com.google.crypto.tink.shaded.protobuf.r r0 = r0.mo58927c(r14)
            boolean r1 = r0.mo58941h()
            if (r1 != 0) goto L_0x0061
            boolean r1 = r0.f36690c
            if (r1 == 0) goto L_0x0047
            com.google.crypto.tink.shaded.protobuf.w$b r1 = new com.google.crypto.tink.shaded.protobuf.w$b
            com.google.crypto.tink.shaded.protobuf.a1<T, java.lang.Object> r0 = r0.f36688a
            com.google.crypto.tink.shaded.protobuf.a1<K, V>$b r7 = r0.f36566h
            if (r7 != 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.a1$b r7 = new com.google.crypto.tink.shaded.protobuf.a1$b
            r7.<init>()
            r0.f36566h = r7
        L_0x003d:
            com.google.crypto.tink.shaded.protobuf.a1<K, V>$b r0 = r0.f36566h
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x005a
        L_0x0047:
            com.google.crypto.tink.shaded.protobuf.a1<T, java.lang.Object> r0 = r0.f36688a
            com.google.crypto.tink.shaded.protobuf.a1<K, V>$b r1 = r0.f36566h
            if (r1 != 0) goto L_0x0054
            com.google.crypto.tink.shaded.protobuf.a1$b r1 = new com.google.crypto.tink.shaded.protobuf.a1$b
            r1.<init>()
            r0.f36566h = r1
        L_0x0054:
            com.google.crypto.tink.shaded.protobuf.a1<K, V>$b r0 = r0.f36566h
            java.util.Iterator r1 = r0.iterator()
        L_0x005a:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0063
        L_0x0061:
            r0 = r6
            r1 = r0
        L_0x0063:
            int[] r7 = r13.f36656a
            int r7 = r7.length
        L_0x0066:
            int r7 = r7 + -3
            if (r7 < 0) goto L_0x0550
            int r8 = r13.mo58896R(r7)
            int[] r9 = r13.f36656a
            r9 = r9[r7]
        L_0x0072:
            if (r0 == 0) goto L_0x008f
            com.google.crypto.tink.shaded.protobuf.o<?> r10 = r13.f36671p
            r10.mo58925a(r0)
            if (r9 >= 0) goto L_0x008f
            com.google.crypto.tink.shaded.protobuf.o<?> r10 = r13.f36671p
            r10.mo58934j(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0072
        L_0x008d:
            r0 = r6
            goto L_0x0072
        L_0x008f:
            r10 = r8 & r5
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x053f;
                case 1: goto L_0x052e;
                case 2: goto L_0x051d;
                case 3: goto L_0x050c;
                case 4: goto L_0x04fb;
                case 5: goto L_0x04ea;
                case 6: goto L_0x04d9;
                case 7: goto L_0x04c8;
                case 8: goto L_0x04b7;
                case 9: goto L_0x04a2;
                case 10: goto L_0x048f;
                case 11: goto L_0x047e;
                case 12: goto L_0x046d;
                case 13: goto L_0x045c;
                case 14: goto L_0x044b;
                case 15: goto L_0x043a;
                case 16: goto L_0x0429;
                case 17: goto L_0x0414;
                case 18: goto L_0x0403;
                case 19: goto L_0x03f2;
                case 20: goto L_0x03e1;
                case 21: goto L_0x03d0;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03ae;
                case 24: goto L_0x039d;
                case 25: goto L_0x038c;
                case 26: goto L_0x037b;
                case 27: goto L_0x0366;
                case 28: goto L_0x0355;
                case 29: goto L_0x0344;
                case 30: goto L_0x0333;
                case 31: goto L_0x0322;
                case 32: goto L_0x0311;
                case 33: goto L_0x0300;
                case 34: goto L_0x02ef;
                case 35: goto L_0x02de;
                case 36: goto L_0x02cd;
                case 37: goto L_0x02bc;
                case 38: goto L_0x02ab;
                case 39: goto L_0x029a;
                case 40: goto L_0x0289;
                case 41: goto L_0x0278;
                case 42: goto L_0x0267;
                case 43: goto L_0x0256;
                case 44: goto L_0x0245;
                case 45: goto L_0x0234;
                case 46: goto L_0x0223;
                case 47: goto L_0x0212;
                case 48: goto L_0x0201;
                case 49: goto L_0x01ec;
                case 50: goto L_0x01e1;
                case 51: goto L_0x01ca;
                case 52: goto L_0x01b3;
                case 53: goto L_0x01a2;
                case 54: goto L_0x0191;
                case 55: goto L_0x0180;
                case 56: goto L_0x016f;
                case 57: goto L_0x015e;
                case 58: goto L_0x0147;
                case 59: goto L_0x0136;
                case 60: goto L_0x0121;
                case 61: goto L_0x010e;
                case 62: goto L_0x00fd;
                case 63: goto L_0x00ec;
                case 64: goto L_0x00db;
                case 65: goto L_0x00cb;
                case 66: goto L_0x00bb;
                case 67: goto L_0x00ab;
                case 68: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0066
        L_0x0097:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            r15.mo58865h(r9, r10, r8)
            goto L_0x0066
        L_0x00ab:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m27125C(r10, r14)
            r15.mo58873p(r9, r10)
            goto L_0x0066
        L_0x00bb:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58872o(r9, r8)
            goto L_0x0066
        L_0x00cb:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m27125C(r10, r14)
            r15.mo58871n(r9, r10)
            goto L_0x0066
        L_0x00db:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58870m(r9, r8)
            goto L_0x0066
        L_0x00ec:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58861d(r9, r8)
            goto L_0x0066
        L_0x00fd:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58874q(r9, r8)
            goto L_0x0066
        L_0x010e:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = (com.google.crypto.tink.shaded.protobuf.ByteString) r8
            r15.mo58859b(r9, r8)
            goto L_0x0066
        L_0x0121:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            r15.mo58868k(r9, r10, r8)
            goto L_0x0066
        L_0x0136:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            m27128U(r9, r8, r15)
            goto L_0x0066
        L_0x0147:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r15.mo58858a(r9, r8)
            goto L_0x0066
        L_0x015e:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58862e(r9, r8)
            goto L_0x0066
        L_0x016f:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m27125C(r10, r14)
            r15.mo58863f(r9, r10)
            goto L_0x0066
        L_0x0180:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m27124B(r10, r14)
            r15.mo58866i(r9, r8)
            goto L_0x0066
        L_0x0191:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m27125C(r10, r14)
            r15.mo58875r(r9, r10)
            goto L_0x0066
        L_0x01a2:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m27125C(r10, r14)
            r15.mo58867j(r9, r10)
            goto L_0x0066
        L_0x01b3:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r15.mo58864g(r8, r9)
            goto L_0x0066
        L_0x01ca:
            boolean r10 = r13.mo58917s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.lang.Double r8 = (java.lang.Double) r8
            double r10 = r8.doubleValue()
            r15.mo58860c(r9, r10)
            goto L_0x0066
        L_0x01e1:
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            r13.mo58898T(r15, r9, r8, r7)
            goto L_0x0066
        L_0x01ec:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27310L(r9, r8, r15, r10)
            goto L_0x0066
        L_0x0201:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0212:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0223:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0234:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0245:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0256:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0267:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0278:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0289:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r9, r8, r15, r4)
            goto L_0x0066
        L_0x029a:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ab:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02bc:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02cd:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02de:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ef:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0300:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0311:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0322:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0333:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0344:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0355:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27304F(r9, r8, r15)
            goto L_0x0066
        L_0x0366:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27313O(r9, r8, r15, r10)
            goto L_0x0066
        L_0x037b:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27318T(r9, r8, r15)
            goto L_0x0066
        L_0x038c:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r9, r8, r15, r3)
            goto L_0x0066
        L_0x039d:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03ae:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03bf:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03d0:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03e1:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03f2:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0403:
            int[] r9 = r13.f36656a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0414:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            r15.mo58865h(r9, r10, r8)
            goto L_0x0066
        L_0x0429:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r10, r14)
            r15.mo58873p(r9, r10)
            goto L_0x0066
        L_0x043a:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58872o(r9, r8)
            goto L_0x0066
        L_0x044b:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r10, r14)
            r15.mo58871n(r9, r10)
            goto L_0x0066
        L_0x045c:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58870m(r9, r8)
            goto L_0x0066
        L_0x046d:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58861d(r9, r8)
            goto L_0x0066
        L_0x047e:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58874q(r9, r8)
            goto L_0x0066
        L_0x048f:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.ByteString r8 = (com.google.crypto.tink.shaded.protobuf.ByteString) r8
            r15.mo58859b(r9, r8)
            goto L_0x0066
        L_0x04a2:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r10 = r13.mo58912n(r7)
            r15.mo58868k(r9, r10, r8)
            goto L_0x0066
        L_0x04b7:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r10, r14)
            m27128U(r9, r8, r15)
            goto L_0x0066
        L_0x04c8:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            boolean r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r10, r14)
            r15.mo58858a(r9, r8)
            goto L_0x0066
        L_0x04d9:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58862e(r9, r8)
            goto L_0x0066
        L_0x04ea:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r10, r14)
            r15.mo58863f(r9, r10)
            goto L_0x0066
        L_0x04fb:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r10, r14)
            r15.mo58866i(r9, r8)
            goto L_0x0066
        L_0x050c:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r10, r14)
            r15.mo58875r(r9, r10)
            goto L_0x0066
        L_0x051d:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r10, r14)
            r15.mo58867j(r9, r10)
            goto L_0x0066
        L_0x052e:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            float r8 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r10, r14)
            r15.mo58864g(r8, r9)
            goto L_0x0066
        L_0x053f:
            boolean r10 = r13.mo58916r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            double r10 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r10, r14)
            r15.mo58860c(r9, r10)
            goto L_0x0066
        L_0x0550:
            if (r0 == 0) goto L_0x0a98
            com.google.crypto.tink.shaded.protobuf.o<?> r14 = r13.f36671p
            r14.mo58934j(r0)
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x0565
            java.lang.Object r14 = r1.next()
            r0 = r14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0550
        L_0x0565:
            r0 = r6
            goto L_0x0550
        L_0x0567:
            boolean r0 = r13.f36663h
            if (r0 == 0) goto L_0x0a95
            boolean r0 = r13.f36661f
            if (r0 == 0) goto L_0x0586
            com.google.crypto.tink.shaded.protobuf.o<?> r0 = r13.f36671p
            com.google.crypto.tink.shaded.protobuf.r r0 = r0.mo58927c(r14)
            boolean r1 = r0.mo58941h()
            if (r1 != 0) goto L_0x0586
            java.util.Iterator r0 = r0.mo58944k()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0588
        L_0x0586:
            r0 = r6
            r1 = r0
        L_0x0588:
            int[] r7 = r13.f36656a
            int r7 = r7.length
            r8 = r3
        L_0x058c:
            if (r8 >= r7) goto L_0x0a75
            int r9 = r13.mo58896R(r8)
            int[] r10 = r13.f36656a
            r10 = r10[r8]
        L_0x0596:
            if (r1 == 0) goto L_0x05b3
            com.google.crypto.tink.shaded.protobuf.o<?> r11 = r13.f36671p
            r11.mo58925a(r1)
            if (r10 < 0) goto L_0x05b3
            com.google.crypto.tink.shaded.protobuf.o<?> r11 = r13.f36671p
            r11.mo58934j(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05b1
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0596
        L_0x05b1:
            r1 = r6
            goto L_0x0596
        L_0x05b3:
            r11 = r9 & r5
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a62;
                case 1: goto L_0x0a52;
                case 2: goto L_0x0a42;
                case 3: goto L_0x0a32;
                case 4: goto L_0x0a22;
                case 5: goto L_0x0a12;
                case 6: goto L_0x0a02;
                case 7: goto L_0x09f1;
                case 8: goto L_0x09e0;
                case 9: goto L_0x09cb;
                case 10: goto L_0x09b8;
                case 11: goto L_0x09a7;
                case 12: goto L_0x0996;
                case 13: goto L_0x0985;
                case 14: goto L_0x0974;
                case 15: goto L_0x0963;
                case 16: goto L_0x0952;
                case 17: goto L_0x093d;
                case 18: goto L_0x092c;
                case 19: goto L_0x091b;
                case 20: goto L_0x090a;
                case 21: goto L_0x08f9;
                case 22: goto L_0x08e8;
                case 23: goto L_0x08d7;
                case 24: goto L_0x08c6;
                case 25: goto L_0x08b5;
                case 26: goto L_0x08a4;
                case 27: goto L_0x088f;
                case 28: goto L_0x087e;
                case 29: goto L_0x086d;
                case 30: goto L_0x085c;
                case 31: goto L_0x084b;
                case 32: goto L_0x083a;
                case 33: goto L_0x0829;
                case 34: goto L_0x0818;
                case 35: goto L_0x0807;
                case 36: goto L_0x07f6;
                case 37: goto L_0x07e5;
                case 38: goto L_0x07d4;
                case 39: goto L_0x07c3;
                case 40: goto L_0x07b2;
                case 41: goto L_0x07a1;
                case 42: goto L_0x0790;
                case 43: goto L_0x077f;
                case 44: goto L_0x076e;
                case 45: goto L_0x075d;
                case 46: goto L_0x074c;
                case 47: goto L_0x073b;
                case 48: goto L_0x072a;
                case 49: goto L_0x0715;
                case 50: goto L_0x070a;
                case 51: goto L_0x06f3;
                case 52: goto L_0x06dc;
                case 53: goto L_0x06cb;
                case 54: goto L_0x06ba;
                case 55: goto L_0x06a9;
                case 56: goto L_0x0698;
                case 57: goto L_0x0687;
                case 58: goto L_0x0670;
                case 59: goto L_0x065f;
                case 60: goto L_0x064a;
                case 61: goto L_0x0637;
                case 62: goto L_0x0626;
                case 63: goto L_0x0615;
                case 64: goto L_0x0604;
                case 65: goto L_0x05f3;
                case 66: goto L_0x05e2;
                case 67: goto L_0x05d1;
                case 68: goto L_0x05bc;
                default: goto L_0x05ba;
            }
        L_0x05ba:
            goto L_0x0a71
        L_0x05bc:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            r15.mo58865h(r10, r11, r9)
            goto L_0x0a71
        L_0x05d1:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m27125C(r11, r14)
            r15.mo58873p(r10, r11)
            goto L_0x0a71
        L_0x05e2:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58872o(r10, r9)
            goto L_0x0a71
        L_0x05f3:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m27125C(r11, r14)
            r15.mo58871n(r10, r11)
            goto L_0x0a71
        L_0x0604:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58870m(r10, r9)
            goto L_0x0a71
        L_0x0615:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58861d(r10, r9)
            goto L_0x0a71
        L_0x0626:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58874q(r10, r9)
            goto L_0x0a71
        L_0x0637:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.ByteString r9 = (com.google.crypto.tink.shaded.protobuf.ByteString) r9
            r15.mo58859b(r10, r9)
            goto L_0x0a71
        L_0x064a:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            r15.mo58868k(r10, r11, r9)
            goto L_0x0a71
        L_0x065f:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            m27128U(r10, r9, r15)
            goto L_0x0a71
        L_0x0670:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15.mo58858a(r10, r9)
            goto L_0x0a71
        L_0x0687:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58862e(r10, r9)
            goto L_0x0a71
        L_0x0698:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m27125C(r11, r14)
            r15.mo58863f(r10, r11)
            goto L_0x0a71
        L_0x06a9:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m27124B(r11, r14)
            r15.mo58866i(r10, r9)
            goto L_0x0a71
        L_0x06ba:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m27125C(r11, r14)
            r15.mo58875r(r10, r11)
            goto L_0x0a71
        L_0x06cb:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m27125C(r11, r14)
            r15.mo58867j(r10, r11)
            goto L_0x0a71
        L_0x06dc:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r15.mo58864g(r9, r10)
            goto L_0x0a71
        L_0x06f3:
            boolean r11 = r13.mo58917s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            r15.mo58860c(r10, r11)
            goto L_0x0a71
        L_0x070a:
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            r13.mo58898T(r15, r10, r9, r8)
            goto L_0x0a71
        L_0x0715:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27310L(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x072a:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x073b:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x074c:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x075d:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x076e:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x077f:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0790:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07a1:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07b2:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07c3:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07d4:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07e5:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07f6:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0807:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0818:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27317S(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x0829:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27316R(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x083a:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27315Q(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x084b:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27314P(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x085c:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27306H(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x086d:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27319U(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x087e:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27304F(r10, r9, r15)
            goto L_0x0a71
        L_0x088f:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27313O(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x08a4:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27318T(r10, r9, r15)
            goto L_0x0a71
        L_0x08b5:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27303E(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08c6:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27307I(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08d7:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27308J(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08e8:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27311M(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08f9:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27320V(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x090a:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27312N(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x091b:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27309K(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x092c:
            int[] r10 = r13.f36656a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.crypto.tink.shaded.protobuf.C16544y0.m27305G(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x093d:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            r15.mo58865h(r10, r11, r9)
            goto L_0x0a71
        L_0x0952:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r11, r14)
            r15.mo58873p(r10, r11)
            goto L_0x0a71
        L_0x0963:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58872o(r10, r9)
            goto L_0x0a71
        L_0x0974:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r11, r14)
            r15.mo58871n(r10, r11)
            goto L_0x0a71
        L_0x0985:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58870m(r10, r9)
            goto L_0x0a71
        L_0x0996:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58861d(r10, r9)
            goto L_0x0a71
        L_0x09a7:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58874q(r10, r9)
            goto L_0x0a71
        L_0x09b8:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.ByteString r9 = (com.google.crypto.tink.shaded.protobuf.ByteString) r9
            r15.mo58859b(r10, r9)
            goto L_0x0a71
        L_0x09cb:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            com.google.crypto.tink.shaded.protobuf.x0 r11 = r13.mo58912n(r8)
            r15.mo58868k(r10, r11, r9)
            goto L_0x0a71
        L_0x09e0:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r11, r14)
            m27128U(r10, r9, r15)
            goto L_0x0a71
        L_0x09f1:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            boolean r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26840f(r11, r14)
            r15.mo58858a(r10, r9)
            goto L_0x0a71
        L_0x0a02:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58862e(r10, r9)
            goto L_0x0a71
        L_0x0a12:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r11, r14)
            r15.mo58863f(r10, r11)
            goto L_0x0a71
        L_0x0a22:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r11, r14)
            r15.mo58866i(r10, r9)
            goto L_0x0a71
        L_0x0a32:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r11, r14)
            r15.mo58875r(r10, r11)
            goto L_0x0a71
        L_0x0a42:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r11, r14)
            r15.mo58867j(r10, r11)
            goto L_0x0a71
        L_0x0a52:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            float r9 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26846l(r11, r14)
            r15.mo58864g(r9, r10)
            goto L_0x0a71
        L_0x0a62:
            boolean r11 = r13.mo58916r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            double r11 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26845k(r11, r14)
            r15.mo58860c(r10, r11)
        L_0x0a71:
            int r8 = r8 + 3
            goto L_0x058c
        L_0x0a75:
            if (r1 == 0) goto L_0x0a8b
            com.google.crypto.tink.shaded.protobuf.o<?> r2 = r13.f36671p
            r2.mo58934j(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a89
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a75
        L_0x0a89:
            r1 = r6
            goto L_0x0a75
        L_0x0a8b:
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r13.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r14 = r0.mo58685g(r14)
            r0.mo58697s(r14, r15)
            goto L_0x0a98
        L_0x0a95:
            r13.mo58897S(r14, r15)
        L_0x0a98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58905g(java.lang.Object, com.google.crypto.tink.shaded.protobuf.k):void");
    }

    /* renamed from: h */
    public final void mo58906h(T t, byte[] bArr, int i, int i2, C16477e.C16478a aVar) throws IOException {
        if (this.f36663h) {
            mo58887G(t, bArr, i, i2, aVar);
        } else {
            mo58886F(t, bArr, i, i2, 0, aVar);
        }
    }

    /* renamed from: i */
    public final void mo58907i(T t, C16540w0 w0Var, C16511n nVar) throws IOException {
        nVar.getClass();
        mo58918u(this.f36670o, this.f36671p, t, w0Var, nVar);
    }

    /* renamed from: j */
    public final boolean mo58908j(int i, Object obj, Object obj2) {
        return mo58916r(i, obj) == mo58916r(i, obj2);
    }

    /* renamed from: k */
    public final void mo58909k(Object obj, int i, Object obj2, C16473c1 c1Var) {
        C16531v.C16534c l;
        int i2 = this.f36656a[i];
        Object o = C16488g1.m26849o((long) (mo58896R(i) & 1048575), obj);
        if (o != null && (l = mo58910l(i)) != null) {
            MapFieldLite c = this.f36672q.mo58705c(o);
            this.f36672q.mo58704b(mo58911m(i));
            for (Map.Entry entry : c.entrySet()) {
                if (!l.mo58426a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        c1Var.mo58691m();
                    }
                    entry.getKey();
                    entry.getValue();
                    throw null;
                }
            }
        }
    }

    /* renamed from: l */
    public final C16531v.C16534c mo58910l(int i) {
        return (C16531v.C16534c) this.f36657b[((i / 3) * 2) + 1];
    }

    /* renamed from: m */
    public final Object mo58911m(int i) {
        return this.f36657b[(i / 3) * 2];
    }

    /* renamed from: n */
    public final C16542x0 mo58912n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f36657b;
        C16542x0 x0Var = (C16542x0) objArr[i2];
        if (x0Var != null) {
            return x0Var;
        }
        C16542x0 a = C16528t0.f36696c.mo58955a((Class) objArr[i2 + 1]);
        this.f36657b[i2] = a;
        return a;
    }

    public final T newInstance() {
        return this.f36668m.mo58935a(this.f36660e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0335, code lost:
        r3 = android.support.p013v4.media.C0069a.m171b(r7, r6, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04a6, code lost:
        r3 = r5 + r3;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58914p(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f36655s
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int[] r5 = r14.f36656a
            int r5 = r5.length
            if (r2 >= r5) goto L_0x0501
            int r5 = r14.mo58896R(r2)
            int[] r6 = r14.f36656a
            r7 = r6[r2]
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r5
            int r8 = r8 >>> 20
            r9 = 17
            r10 = 1
            r11 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 > r9) goto L_0x0033
            int r9 = r2 + 2
            r6 = r6[r9]
            r9 = r6 & r11
            int r12 = r6 >>> 20
            int r10 = r10 << r12
            if (r9 == r1) goto L_0x0051
            long r12 = (long) r9
            int r1 = r0.getInt(r15, r12)
            r4 = r1
            r1 = r9
            goto L_0x0051
        L_0x0033:
            boolean r6 = r14.f36664i
            if (r6 == 0) goto L_0x004f
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo58516id()
            if (r8 < r6) goto L_0x004f
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo58516id()
            if (r8 > r6) goto L_0x004f
            int[] r6 = r14.f36656a
            int r9 = r2 + 2
            r6 = r6[r9]
            r6 = r6 & r11
            goto L_0x0050
        L_0x004f:
            r6 = 0
        L_0x0050:
            r10 = 0
        L_0x0051:
            r5 = r5 & r11
            long r11 = (long) r5
            switch(r8) {
                case 0: goto L_0x04f4;
                case 1: goto L_0x04eb;
                case 2: goto L_0x04de;
                case 3: goto L_0x04d1;
                case 4: goto L_0x04c4;
                case 5: goto L_0x04bb;
                case 6: goto L_0x04b2;
                case 7: goto L_0x04a9;
                case 8: goto L_0x048d;
                case 9: goto L_0x047b;
                case 10: goto L_0x046b;
                case 11: goto L_0x045d;
                case 12: goto L_0x044f;
                case 13: goto L_0x0445;
                case 14: goto L_0x043b;
                case 15: goto L_0x042d;
                case 16: goto L_0x041f;
                case 17: goto L_0x040b;
                case 18: goto L_0x03ff;
                case 19: goto L_0x03f3;
                case 20: goto L_0x03e7;
                case 21: goto L_0x03db;
                case 22: goto L_0x03cf;
                case 23: goto L_0x03c3;
                case 24: goto L_0x03b7;
                case 25: goto L_0x03ab;
                case 26: goto L_0x039f;
                case 27: goto L_0x038f;
                case 28: goto L_0x0383;
                case 29: goto L_0x0377;
                case 30: goto L_0x036b;
                case 31: goto L_0x035f;
                case 32: goto L_0x0353;
                case 33: goto L_0x0347;
                case 34: goto L_0x033b;
                case 35: goto L_0x0319;
                case 36: goto L_0x02fc;
                case 37: goto L_0x02df;
                case 38: goto L_0x02c2;
                case 39: goto L_0x02a4;
                case 40: goto L_0x0286;
                case 41: goto L_0x0268;
                case 42: goto L_0x024a;
                case 43: goto L_0x022c;
                case 44: goto L_0x020e;
                case 45: goto L_0x01f0;
                case 46: goto L_0x01d2;
                case 47: goto L_0x01b4;
                case 48: goto L_0x0196;
                case 49: goto L_0x0186;
                case 50: goto L_0x0176;
                case 51: goto L_0x016a;
                case 52: goto L_0x015e;
                case 53: goto L_0x014e;
                case 54: goto L_0x013e;
                case 55: goto L_0x012e;
                case 56: goto L_0x0122;
                case 57: goto L_0x0116;
                case 58: goto L_0x010a;
                case 59: goto L_0x00ec;
                case 60: goto L_0x00d8;
                case 61: goto L_0x00c6;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a6;
                case 64: goto L_0x009a;
                case 65: goto L_0x008e;
                case 66: goto L_0x007e;
                case 67: goto L_0x006e;
                case 68: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x04fd
        L_0x0058:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.j0 r5 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r5
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26569j(r7, r5, r6)
            goto L_0x04fc
        L_0x006e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m27125C(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26577r(r7, r5)
            goto L_0x04fc
        L_0x007e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m27124B(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26576q(r7, r5)
            goto L_0x04fc
        L_0x008e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26575p(r7)
            goto L_0x04fc
        L_0x009a:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26574o(r7)
            goto L_0x04fc
        L_0x00a6:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m27124B(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26565f(r7, r5)
            goto L_0x04fc
        L_0x00b6:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m27124B(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26581v(r7, r5)
            goto L_0x04fc
        L_0x00c6:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r7, r5)
            goto L_0x04fc
        L_0x00d8:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27335o(r7, r6, r5)
            goto L_0x04fc
        L_0x00ec:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            boolean r6 = r5 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r6 == 0) goto L_0x0102
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r7, r5)
            goto L_0x04a6
        L_0x0102:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26578s(r7, r5)
            goto L_0x04a6
        L_0x010a:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26562c(r7)
            goto L_0x04fc
        L_0x0116:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26566g(r7)
            goto L_0x04fc
        L_0x0122:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26567h(r7)
            goto L_0x04fc
        L_0x012e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m27124B(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26570k(r7, r5)
            goto L_0x04fc
        L_0x013e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m27125C(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26583x(r7, r5)
            goto L_0x04fc
        L_0x014e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m27125C(r11, r15)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26572m(r7, r5)
            goto L_0x04fc
        L_0x015e:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26568i(r7)
            goto L_0x04fc
        L_0x016a:
            boolean r5 = r14.mo58917s(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26564e(r7)
            goto L_0x04fc
        L_0x0176:
            com.google.crypto.tink.shaded.protobuf.e0 r5 = r14.f36672q
            java.lang.Object r6 = r0.getObject(r15, r11)
            java.lang.Object r8 = r14.mo58911m(r2)
            int r5 = r5.mo58709g(r7, r6, r8)
            goto L_0x04fc
        L_0x0186:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27330j(r7, r5, r6)
            goto L_0x04fc
        L_0x0196:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27340t(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x01aa
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01aa:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x01b4:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27338r(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x01c8
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01c8:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x01d2:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x01e6
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01e6:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x01f0:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x0204
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0204:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x020e:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27325e(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x0222
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0222:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x022c:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27343w(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x0240
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0240:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x024a:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27322b(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x025e
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x025e:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x0268:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x027c
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x027c:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x0286:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x029a
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x029a:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x02a4:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27332l(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x02b8
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02b8:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x02c2:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27345y(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x02d6
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02d6:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x02df:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27334n(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x02f3
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02f3:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x02fc:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x0310
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0310:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0335
        L_0x0319:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f36664i
            if (r8 == 0) goto L_0x032d
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x032d:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r7)
            int r7 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
        L_0x0335:
            int r3 = android.support.p013v4.media.C0069a.m171b(r7, r6, r5, r3)
            goto L_0x04fd
        L_0x033b:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27339s(r7, r5)
            goto L_0x04fc
        L_0x0347:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27337q(r7, r5)
            goto L_0x04fc
        L_0x0353:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r7, r5)
            goto L_0x04fc
        L_0x035f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r7, r5)
            goto L_0x04fc
        L_0x036b:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27324d(r7, r5)
            goto L_0x04fc
        L_0x0377:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27342v(r7, r5)
            goto L_0x04fc
        L_0x0383:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27323c(r7, r5)
            goto L_0x04fc
        L_0x038f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27336p(r7, r5, r6)
            goto L_0x04fc
        L_0x039f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27341u(r7, r5)
            goto L_0x04fc
        L_0x03ab:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27321a(r7, r5)
            goto L_0x04fc
        L_0x03b7:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r7, r5)
            goto L_0x04fc
        L_0x03c3:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r7, r5)
            goto L_0x04fc
        L_0x03cf:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27331k(r7, r5)
            goto L_0x04fc
        L_0x03db:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27344x(r7, r5)
            goto L_0x04fc
        L_0x03e7:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27333m(r7, r5)
            goto L_0x04fc
        L_0x03f3:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r7, r5)
            goto L_0x04fc
        L_0x03ff:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r7, r5)
            goto L_0x04fc
        L_0x040b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.j0 r5 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r5
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26569j(r7, r5, r6)
            goto L_0x04fc
        L_0x041f:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26577r(r7, r5)
            goto L_0x04fc
        L_0x042d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26576q(r7, r5)
            goto L_0x04fc
        L_0x043b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26575p(r7)
            goto L_0x04fc
        L_0x0445:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26574o(r7)
            goto L_0x04fc
        L_0x044f:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26565f(r7, r5)
            goto L_0x04fc
        L_0x045d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26581v(r7, r5)
            goto L_0x04fc
        L_0x046b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r7, r5)
            goto L_0x04fc
        L_0x047b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r14.mo58912n(r2)
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27335o(r7, r6, r5)
            goto L_0x04fc
        L_0x048d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            boolean r6 = r5 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r6 == 0) goto L_0x04a0
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r7, r5)
            goto L_0x04a6
        L_0x04a0:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26578s(r7, r5)
        L_0x04a6:
            int r5 = r5 + r3
            r3 = r5
            goto L_0x04fd
        L_0x04a9:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26562c(r7)
            goto L_0x04fc
        L_0x04b2:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26566g(r7)
            goto L_0x04fc
        L_0x04bb:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26567h(r7)
            goto L_0x04fc
        L_0x04c4:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26570k(r7, r5)
            goto L_0x04fc
        L_0x04d1:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26583x(r7, r5)
            goto L_0x04fc
        L_0x04de:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26572m(r7, r5)
            goto L_0x04fc
        L_0x04eb:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26568i(r7)
            goto L_0x04fc
        L_0x04f4:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26564e(r7)
        L_0x04fc:
            int r3 = r3 + r5
        L_0x04fd:
            int r2 = r2 + 3
            goto L_0x0006
        L_0x0501:
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r14.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r0.mo58685g(r15)
            int r0 = r0.mo58686h(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f36661f
            if (r1 == 0) goto L_0x051b
            com.google.crypto.tink.shaded.protobuf.o<?> r1 = r14.f36671p
            com.google.crypto.tink.shaded.protobuf.r r15 = r1.mo58927c(r15)
            int r15 = r15.mo58940g()
            int r0 = r0 + r15
        L_0x051b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58914p(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58915q(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f36655s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f36656a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e2
            int r4 = r11.mo58896R(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f36656a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            com.google.crypto.tink.shaded.protobuf.FieldType r4 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r4 = r4.mo58516id()
            if (r5 < r4) goto L_0x0034
            com.google.crypto.tink.shaded.protobuf.FieldType r4 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r4 = r4.mo58516id()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f36656a
            int r10 = r2 + 2
            r4 = r4[r10]
            r4 = r4 & r7
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            switch(r5) {
                case 0: goto L_0x04d3;
                case 1: goto L_0x04c8;
                case 2: goto L_0x04b9;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049b;
                case 5: goto L_0x0490;
                case 6: goto L_0x0485;
                case 7: goto L_0x047a;
                case 8: goto L_0x045d;
                case 9: goto L_0x0449;
                case 10: goto L_0x0437;
                case 11: goto L_0x0427;
                case 12: goto L_0x0417;
                case 13: goto L_0x040b;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03df;
                case 17: goto L_0x03c9;
                case 18: goto L_0x03bf;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0397;
                case 23: goto L_0x038d;
                case 24: goto L_0x0383;
                case 25: goto L_0x0379;
                case 26: goto L_0x036f;
                case 27: goto L_0x0361;
                case 28: goto L_0x0357;
                case 29: goto L_0x034d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0339;
                case 32: goto L_0x032f;
                case 33: goto L_0x0325;
                case 34: goto L_0x031b;
                case 35: goto L_0x02f9;
                case 36: goto L_0x02dc;
                case 37: goto L_0x02bf;
                case 38: goto L_0x02a2;
                case 39: goto L_0x0284;
                case 40: goto L_0x0266;
                case 41: goto L_0x0248;
                case 42: goto L_0x022a;
                case 43: goto L_0x020c;
                case 44: goto L_0x01ee;
                case 45: goto L_0x01d0;
                case 46: goto L_0x01b2;
                case 47: goto L_0x0194;
                case 48: goto L_0x0176;
                case 49: goto L_0x0168;
                case 50: goto L_0x0158;
                case 51: goto L_0x014c;
                case 52: goto L_0x0140;
                case 53: goto L_0x0130;
                case 54: goto L_0x0120;
                case 55: goto L_0x0110;
                case 56: goto L_0x0104;
                case 57: goto L_0x00f8;
                case 58: goto L_0x00ec;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0098;
                case 63: goto L_0x0088;
                case 64: goto L_0x007c;
                case 65: goto L_0x0070;
                case 66: goto L_0x0060;
                case 67: goto L_0x0050;
                case 68: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x04de
        L_0x003a:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.j0 r4 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r4
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26569j(r6, r4, r5)
            goto L_0x04dd
        L_0x0050:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m27125C(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26577r(r6, r4)
            goto L_0x04dd
        L_0x0060:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m27124B(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26576q(r6, r4)
            goto L_0x04dd
        L_0x0070:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26575p(r6)
            goto L_0x04dd
        L_0x007c:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26574o(r6)
            goto L_0x04dd
        L_0x0088:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m27124B(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26565f(r6, r4)
            goto L_0x04dd
        L_0x0098:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m27124B(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26581v(r6, r4)
            goto L_0x04dd
        L_0x00a8:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r6, r4)
            goto L_0x04dd
        L_0x00ba:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27335o(r6, r5, r4)
            goto L_0x04dd
        L_0x00ce:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r5 == 0) goto L_0x00e4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r6, r4)
            goto L_0x04dd
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26578s(r6, r4)
            goto L_0x04dd
        L_0x00ec:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26562c(r6)
            goto L_0x04dd
        L_0x00f8:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26566g(r6)
            goto L_0x04dd
        L_0x0104:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26567h(r6)
            goto L_0x04dd
        L_0x0110:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m27124B(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26570k(r6, r4)
            goto L_0x04dd
        L_0x0120:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m27125C(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26583x(r6, r4)
            goto L_0x04dd
        L_0x0130:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m27125C(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26572m(r6, r4)
            goto L_0x04dd
        L_0x0140:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26568i(r6)
            goto L_0x04dd
        L_0x014c:
            boolean r4 = r11.mo58917s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26564e(r6)
            goto L_0x04dd
        L_0x0158:
            com.google.crypto.tink.shaded.protobuf.e0 r4 = r11.f36672q
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            java.lang.Object r7 = r11.mo58911m(r2)
            int r4 = r4.mo58709g(r6, r5, r7)
            goto L_0x04dd
        L_0x0168:
            java.util.List r4 = m27130t(r8, r12)
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27330j(r6, r4, r5)
            goto L_0x04dd
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27340t(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27338r(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27325e(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27343w(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27322b(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27332l(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27345y(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27334n(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27327g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27329i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f36664i
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26580u(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26582w(r5)
        L_0x0315:
            int r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3)
            goto L_0x04de
        L_0x031b:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27339s(r6, r4)
            goto L_0x04dd
        L_0x0325:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27337q(r6, r4)
            goto L_0x04dd
        L_0x032f:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r6, r4)
            goto L_0x04dd
        L_0x0339:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r6, r4)
            goto L_0x04dd
        L_0x0343:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27324d(r6, r4)
            goto L_0x04dd
        L_0x034d:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27342v(r6, r4)
            goto L_0x04dd
        L_0x0357:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27323c(r6, r4)
            goto L_0x04dd
        L_0x0361:
            java.util.List r4 = m27130t(r8, r12)
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27336p(r6, r4, r5)
            goto L_0x04dd
        L_0x036f:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27341u(r6, r4)
            goto L_0x04dd
        L_0x0379:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27321a(r6, r4)
            goto L_0x04dd
        L_0x0383:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r6, r4)
            goto L_0x04dd
        L_0x038d:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r6, r4)
            goto L_0x04dd
        L_0x0397:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27331k(r6, r4)
            goto L_0x04dd
        L_0x03a1:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27344x(r6, r4)
            goto L_0x04dd
        L_0x03ab:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27333m(r6, r4)
            goto L_0x04dd
        L_0x03b5:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27326f(r6, r4)
            goto L_0x04dd
        L_0x03bf:
            java.util.List r4 = m27130t(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27328h(r6, r4)
            goto L_0x04dd
        L_0x03c9:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.j0 r4 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r4
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26569j(r6, r4, r5)
            goto L_0x04dd
        L_0x03df:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26577r(r6, r4)
            goto L_0x04dd
        L_0x03ef:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26576q(r6, r4)
            goto L_0x04dd
        L_0x03ff:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26575p(r6)
            goto L_0x04dd
        L_0x040b:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26574o(r6)
            goto L_0x04dd
        L_0x0417:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26565f(r6, r4)
            goto L_0x04dd
        L_0x0427:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26581v(r6, r4)
            goto L_0x04dd
        L_0x0437:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r6, r4)
            goto L_0x04dd
        L_0x0449:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r11.mo58912n(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27335o(r6, r5, r4)
            goto L_0x04dd
        L_0x045d:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r8, r12)
            boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r5 == 0) goto L_0x0473
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26563d(r6, r4)
            goto L_0x04dd
        L_0x0473:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26578s(r6, r4)
            goto L_0x04dd
        L_0x047a:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26562c(r6)
            goto L_0x04dd
        L_0x0485:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26566g(r6)
            goto L_0x04dd
        L_0x0490:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26567h(r6)
            goto L_0x04dd
        L_0x049b:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26847m(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26570k(r6, r4)
            goto L_0x04dd
        L_0x04aa:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26583x(r6, r4)
            goto L_0x04dd
        L_0x04b9:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26848n(r8, r12)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26572m(r6, r4)
            goto L_0x04dd
        L_0x04c8:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26568i(r6)
            goto L_0x04dd
        L_0x04d3:
            boolean r4 = r11.mo58916r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m26564e(r6)
        L_0x04dd:
            int r3 = r3 + r4
        L_0x04de:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e2:
            com.google.crypto.tink.shaded.protobuf.c1<?, ?> r0 = r11.f36670o
            com.google.crypto.tink.shaded.protobuf.d1 r12 = r0.mo58685g(r12)
            int r12 = r0.mo58686h(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58915q(java.lang.Object):int");
    }

    /* renamed from: r */
    public final boolean mo58916r(int i, Object obj) {
        boolean equals;
        if (this.f36663h) {
            int R = mo58896R(i);
            long j = (long) (R & 1048575);
            switch ((R & 267386880) >>> 20) {
                case 0:
                    return C16488g1.m26845k(j, obj) != ShadowDrawableWrapper.COS_45;
                case 1:
                    return C16488g1.m26846l(j, obj) != 0.0f;
                case 2:
                    return C16488g1.m26848n(j, obj) != 0;
                case 3:
                    return C16488g1.m26848n(j, obj) != 0;
                case 4:
                    return C16488g1.m26847m(j, obj) != 0;
                case 5:
                    return C16488g1.m26848n(j, obj) != 0;
                case 6:
                    return C16488g1.m26847m(j, obj) != 0;
                case 7:
                    return C16488g1.m26840f(j, obj);
                case 8:
                    Object o = C16488g1.m26849o(j, obj);
                    if (o instanceof String) {
                        equals = ((String) o).isEmpty();
                        break;
                    } else if (o instanceof ByteString) {
                        equals = ByteString.EMPTY.equals(o);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return C16488g1.m26849o(j, obj) != null;
                case 10:
                    equals = ByteString.EMPTY.equals(C16488g1.m26849o(j, obj));
                    break;
                case 11:
                    return C16488g1.m26847m(j, obj) != 0;
                case 12:
                    return C16488g1.m26847m(j, obj) != 0;
                case 13:
                    return C16488g1.m26847m(j, obj) != 0;
                case 14:
                    return C16488g1.m26848n(j, obj) != 0;
                case 15:
                    return C16488g1.m26847m(j, obj) != 0;
                case 16:
                    return C16488g1.m26848n(j, obj) != 0;
                case 17:
                    return C16488g1.m26849o(j, obj) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int i2 = this.f36656a[i + 2];
        return (C16488g1.m26847m((long) (i2 & 1048575), obj) & (1 << (i2 >>> 20))) != 0;
    }

    /* renamed from: s */
    public final boolean mo58917s(int i, int i2, Object obj) {
        return C16488g1.m26847m((long) (this.f36656a[i2 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: u */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C16521r.C16523b<ET>> void mo58918u(com.google.crypto.tink.shaded.protobuf.C16473c1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.C16514o<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.C16540w0 r20, com.google.crypto.tink.shaded.protobuf.C16511n r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r0 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = 0
            r14 = r13
            r15 = r14
        L_0x000f:
            int r1 = r20.mo58857z()     // Catch:{ all -> 0x05e1 }
            int r2 = r8.f36658c     // Catch:{ all -> 0x05e1 }
            if (r1 < r2) goto L_0x0021
            int r2 = r8.f36659d     // Catch:{ all -> 0x05e1 }
            if (r1 > r2) goto L_0x0021
            r2 = 0
            int r2 = r8.mo58895P(r1, r2)     // Catch:{ all -> 0x05e1 }
            goto L_0x0022
        L_0x0021:
            r2 = -1
        L_0x0022:
            r3 = r2
            if (r3 >= 0) goto L_0x0081
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0040
            int r0 = r8.f36666k
        L_0x002c:
            int r1 = r8.f36667l
            if (r0 >= r1) goto L_0x003a
            int[] r1 = r8.f36665j
            r1 = r1[r0]
            r8.mo58909k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x002c
        L_0x003a:
            if (r14 == 0) goto L_0x003f
            r9.mo58692n(r10, r14)
        L_0x003f:
            return
        L_0x0040:
            boolean r2 = r8.f36661f     // Catch:{ all -> 0x05e1 }
            if (r2 != 0) goto L_0x0046
            r1 = r13
            goto L_0x004c
        L_0x0046:
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r8.f36660e     // Catch:{ all -> 0x05e1 }
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e r1 = r0.mo58926b(r12, r2, r1)     // Catch:{ all -> 0x05e1 }
        L_0x004c:
            if (r1 == 0) goto L_0x005a
            if (r15 != 0) goto L_0x0055
            com.google.crypto.tink.shaded.protobuf.r r2 = r18.mo58928d(r19)     // Catch:{ all -> 0x05e1 }
            r15 = r2
        L_0x0055:
            java.lang.Object r14 = r0.mo58931g(r1)     // Catch:{ all -> 0x05e1 }
            goto L_0x000f
        L_0x005a:
            r17.mo58694p()     // Catch:{ all -> 0x05e1 }
            if (r14 != 0) goto L_0x0064
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r9.mo58684f(r10)     // Catch:{ all -> 0x05e1 }
            r14 = r1
        L_0x0064:
            boolean r1 = r9.mo58690l(r14, r11)     // Catch:{ all -> 0x05e1 }
            if (r1 == 0) goto L_0x006b
            goto L_0x000f
        L_0x006b:
            int r0 = r8.f36666k
        L_0x006d:
            int r1 = r8.f36667l
            if (r0 >= r1) goto L_0x007b
            int[] r1 = r8.f36665j
            r1 = r1[r0]
            r8.mo58909k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x006d
        L_0x007b:
            if (r14 == 0) goto L_0x0080
            r9.mo58692n(r10, r14)
        L_0x0080:
            return
        L_0x0081:
            int r4 = r8.mo58896R(r3)     // Catch:{ all -> 0x05e1 }
            int r2 = m27127Q(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            switch(r2) {
                case 0: goto L_0x058e;
                case 1: goto L_0x057e;
                case 2: goto L_0x056e;
                case 3: goto L_0x055e;
                case 4: goto L_0x054e;
                case 5: goto L_0x053e;
                case 6: goto L_0x052e;
                case 7: goto L_0x051e;
                case 8: goto L_0x0516;
                case 9: goto L_0x04df;
                case 10: goto L_0x04cf;
                case 11: goto L_0x04bf;
                case 12: goto L_0x049c;
                case 13: goto L_0x048c;
                case 14: goto L_0x047c;
                case 15: goto L_0x046c;
                case 16: goto L_0x045c;
                case 17: goto L_0x0425;
                case 18: goto L_0x0416;
                case 19: goto L_0x0407;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03e9;
                case 22: goto L_0x03da;
                case 23: goto L_0x03cb;
                case 24: goto L_0x03bc;
                case 25: goto L_0x03ad;
                case 26: goto L_0x03a8;
                case 27: goto L_0x0396;
                case 28: goto L_0x0387;
                case 29: goto L_0x0378;
                case 30: goto L_0x0361;
                case 31: goto L_0x0352;
                case 32: goto L_0x0343;
                case 33: goto L_0x0334;
                case 34: goto L_0x0325;
                case 35: goto L_0x0316;
                case 36: goto L_0x0307;
                case 37: goto L_0x02f8;
                case 38: goto L_0x02e9;
                case 39: goto L_0x02da;
                case 40: goto L_0x02cb;
                case 41: goto L_0x02bc;
                case 42: goto L_0x02ad;
                case 43: goto L_0x029e;
                case 44: goto L_0x0287;
                case 45: goto L_0x0278;
                case 46: goto L_0x0269;
                case 47: goto L_0x025a;
                case 48: goto L_0x024b;
                case 49: goto L_0x0235;
                case 50: goto L_0x0224;
                case 51: goto L_0x0210;
                case 52: goto L_0x01fc;
                case 53: goto L_0x01e8;
                case 54: goto L_0x01d4;
                case 55: goto L_0x01c0;
                case 56: goto L_0x01ac;
                case 57: goto L_0x0198;
                case 58: goto L_0x0184;
                case 59: goto L_0x017c;
                case 60: goto L_0x0143;
                case 61: goto L_0x0133;
                case 62: goto L_0x011f;
                case 63: goto L_0x00f8;
                case 64: goto L_0x00e4;
                case 65: goto L_0x00d0;
                case 66: goto L_0x00bc;
                case 67: goto L_0x00a8;
                case 68: goto L_0x0094;
                default: goto L_0x008c;
            }     // Catch:{ InvalidWireTypeException -> 0x05bb }
        L_0x008c:
            if (r14 != 0) goto L_0x059f
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r17.mo58691m()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x059e
        L_0x0094:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r2 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r2 = r11.mo58818J(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x00a8:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r6 = r20.mo58855x()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x00bc:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r2 = r20.mo58840k()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x00d0:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r6 = r20.mo58833e()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x00e4:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r2 = r20.mo58812D()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x00f8:
            int r2 = r20.mo58839j()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.v$c r5 = r8.mo58910l(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r5 == 0) goto L_0x010f
            boolean r5 = r5.mo58426a(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r5 == 0) goto L_0x0109
            goto L_0x010f
        L_0x0109:
            java.lang.Object r14 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27302D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x010f:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x011f:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r2 = r20.mo58835g()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0133:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r20.mo58843n()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0143:
            boolean r2 = r8.mo58917s(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r2 == 0) goto L_0x0165
            long r5 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r5 = r11.mo58820L(r5, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x0177
        L_0x0165:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r2 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r2 = r11.mo58820L(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
        L_0x0177:
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x017c:
            r8.mo58891K(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0184:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            boolean r2 = r20.mo58832d()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0198:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r2 = r20.mo58851t()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x01ac:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r6 = r20.mo58829a()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x01c0:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r2 = r20.mo58844o()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x01d4:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r6 = r20.mo58847r()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x01e8:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r6 = r20.mo58815G()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x01fc:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0210:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58894O(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0224:
            java.lang.Object r4 = r8.mo58911m(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo58919v(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0235:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r6 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo58889I(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x024b:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58831c(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x025a:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58846q(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0269:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58852u(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0278:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58830b(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0287:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r2 = r2.mo58609c(r4, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58838i(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.v$c r3 = r8.mo58910l(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r14 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27346z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x029e:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58850s(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02ad:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58841l(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02bc:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58854w(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02cb:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58845p(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02da:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58853v(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02e9:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58834f(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x02f8:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58837h(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0307:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58810B(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0316:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58814F(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0325:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58831c(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0334:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58846q(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0343:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58852u(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0352:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58830b(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0361:
            com.google.crypto.tink.shaded.protobuf.a0 r2 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r2 = r2.mo58609c(r4, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58838i(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.v$c r3 = r8.mo58910l(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r14 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27346z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0378:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58850s(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0387:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58813E(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0396:
            com.google.crypto.tink.shaded.protobuf.x0 r5 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo58890J(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03a8:
            r8.mo58892L(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03ad:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58841l(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03bc:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58854w(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03cb:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58845p(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03da:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58853v(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03e9:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58834f(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x03f8:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58837h(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0407:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58810B(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0416:
            com.google.crypto.tink.shaded.protobuf.a0 r1 = r8.f36669n     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.util.List r1 = r1.mo58609c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r11.mo58814F(r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0425:
            boolean r1 = r8.mo58916r(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r1 == 0) goto L_0x0448
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r1, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r2 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r2 = r11.mo58818J(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r2, r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0448:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r4 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r4 = r11.mo58818J(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x045c:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = r20.mo58855x()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26858x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x046c:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r4 = r20.mo58840k()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x047c:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = r20.mo58833e()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26858x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x048c:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r4 = r20.mo58812D()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x049c:
            int r2 = r20.mo58839j()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.v$c r5 = r8.mo58910l(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r5 == 0) goto L_0x04b3
            boolean r5 = r5.mo58426a(r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r5 == 0) goto L_0x04ad
            goto L_0x04b3
        L_0x04ad:
            java.lang.Object r14 = com.google.crypto.tink.shaded.protobuf.C16544y0.m27302D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x04b3:
            long r4 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x04bf:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r4 = r20.mo58835g()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x04cf:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r20.mo58843n()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x04df:
            boolean r1 = r8.mo58916r(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r1 == 0) goto L_0x0502
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r1, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r2 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r2 = r11.mo58820L(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.C16531v.m27234b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r2 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r2, r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0502:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.x0 r4 = r8.mo58912n(r3)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            java.lang.Object r4 = r11.mo58820L(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x0516:
            r8.mo58891K(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x051e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            boolean r4 = r20.mo58832d()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26851q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x052e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r4 = r20.mo58851t()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x053e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = r20.mo58829a()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26858x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x054e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            int r4 = r20.mo58844o()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26857w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x055e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = r20.mo58847r()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26858x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x056e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            long r4 = r20.mo58815G()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26858x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x057e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26856v(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x058e:
            long r1 = m27123A(r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05bb }
            com.google.crypto.tink.shaded.protobuf.C16488g1.m26855u(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            r8.mo58893N(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            goto L_0x000f
        L_0x059e:
            r14 = r1
        L_0x059f:
            boolean r1 = r9.mo58690l(r14, r11)     // Catch:{ InvalidWireTypeException -> 0x05bb }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f36666k
        L_0x05a7:
            int r1 = r8.f36667l
            if (r0 >= r1) goto L_0x05b5
            int[] r1 = r8.f36665j
            r1 = r1[r0]
            r8.mo58909k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05a7
        L_0x05b5:
            if (r14 == 0) goto L_0x05ba
            r9.mo58692n(r10, r14)
        L_0x05ba:
            return
        L_0x05bb:
            r17.mo58694p()     // Catch:{ all -> 0x05e1 }
            if (r14 != 0) goto L_0x05c5
            com.google.crypto.tink.shaded.protobuf.d1 r1 = r9.mo58684f(r10)     // Catch:{ all -> 0x05e1 }
            r14 = r1
        L_0x05c5:
            boolean r1 = r9.mo58690l(r14, r11)     // Catch:{ all -> 0x05e1 }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f36666k
        L_0x05cd:
            int r1 = r8.f36667l
            if (r0 >= r1) goto L_0x05db
            int[] r1 = r8.f36665j
            r1 = r1[r0]
            r8.mo58909k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05cd
        L_0x05db:
            if (r14 == 0) goto L_0x05e0
            r9.mo58692n(r10, r14)
        L_0x05e0:
            return
        L_0x05e1:
            r0 = move-exception
            int r1 = r8.f36666k
        L_0x05e4:
            int r2 = r8.f36667l
            if (r1 >= r2) goto L_0x05f2
            int[] r2 = r8.f36665j
            r2 = r2[r1]
            r8.mo58909k(r10, r2, r14, r9)
            int r1 = r1 + 1
            goto L_0x05e4
        L_0x05f2:
            if (r14 == 0) goto L_0x05f7
            r9.mo58692n(r10, r14)
        L_0x05f7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16510m0.mo58918u(com.google.crypto.tink.shaded.protobuf.c1, com.google.crypto.tink.shaded.protobuf.o, java.lang.Object, com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.n):void");
    }

    /* renamed from: v */
    public final <K, V> void mo58919v(Object obj, int i, Object obj2, C16511n nVar, C16540w0 w0Var) throws IOException {
        long R = (long) (mo58896R(i) & 1048575);
        Object o = C16488g1.m26849o(R, obj);
        if (o == null) {
            o = this.f36672q.mo58708f();
            C16488g1.m26859y(R, obj, o);
        } else if (this.f36672q.mo58710h(o)) {
            MapFieldLite f = this.f36672q.mo58708f();
            this.f36672q.mo58703a(f, o);
            C16488g1.m26859y(R, obj, f);
            o = f;
        }
        this.f36672q.mo58705c(o);
        this.f36672q.mo58704b(obj2);
        w0Var.mo58817I();
    }

    /* renamed from: w */
    public final void mo58920w(int i, Object obj, Object obj2) {
        long R = (long) (mo58896R(i) & 1048575);
        if (mo58916r(i, obj2)) {
            Object o = C16488g1.m26849o(R, obj);
            Object o2 = C16488g1.m26849o(R, obj2);
            if (o != null && o2 != null) {
                C16488g1.m26859y(R, obj, C16531v.m27234b(o, o2));
                mo58893N(i, obj);
            } else if (o2 != null) {
                C16488g1.m26859y(R, obj, o2);
                mo58893N(i, obj);
            }
        }
    }

    /* renamed from: x */
    public final void mo58921x(int i, Object obj, Object obj2) {
        int R = mo58896R(i);
        int i2 = this.f36656a[i];
        long j = (long) (R & 1048575);
        if (mo58917s(i2, i, obj2)) {
            Object o = C16488g1.m26849o(j, obj);
            Object o2 = C16488g1.m26849o(j, obj2);
            if (o != null && o2 != null) {
                C16488g1.m26859y(j, obj, C16531v.m27234b(o, o2));
                mo58894O(i2, i, obj);
            } else if (o2 != null) {
                C16488g1.m26859y(j, obj, o2);
                mo58894O(i2, i, obj);
            }
        }
    }
}
