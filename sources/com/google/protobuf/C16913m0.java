package com.google.protobuf;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.protobuf.ByteString;
import com.google.protobuf.C16878d0;
import com.google.protobuf.C16881e;
import com.google.protobuf.C16935v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003a2.C0023f;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.m0 */
public final class C16913m0<T> implements C16947w0<T> {

    /* renamed from: q */
    public static final int[] f37250q = new int[0];

    /* renamed from: r */
    public static final Unsafe f37251r = C16889f1.m28158p();

    /* renamed from: a */
    public final int[] f37252a;

    /* renamed from: b */
    public final Object[] f37253b;

    /* renamed from: c */
    public final int f37254c;

    /* renamed from: d */
    public final int f37255d;

    /* renamed from: e */
    public final C16906j0 f37256e;

    /* renamed from: f */
    public final boolean f37257f;

    /* renamed from: g */
    public final boolean f37258g;

    /* renamed from: h */
    public final boolean f37259h;

    /* renamed from: i */
    public final int[] f37260i;

    /* renamed from: j */
    public final int f37261j;

    /* renamed from: k */
    public final int f37262k;

    /* renamed from: l */
    public final C16919o0 f37263l;

    /* renamed from: m */
    public final C16865a0 f37264m;

    /* renamed from: n */
    public final C16871b1<?, ?> f37265n;

    /* renamed from: o */
    public final C16918o<?> f37266o;

    /* renamed from: p */
    public final C16883e0 f37267p;

    /* renamed from: com.google.protobuf.m0$a */
    public static /* synthetic */ class C16914a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37268a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37268a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f37268a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.C16914a.<clinit>():void");
        }
    }

    public C16913m0(int[] iArr, Object[] objArr, int i, int i2, C16906j0 j0Var, boolean z, int[] iArr2, int i3, int i4, C16919o0 o0Var, C16865a0 a0Var, C16871b1 b1Var, C16918o oVar, C16883e0 e0Var) {
        this.f37252a = iArr;
        this.f37253b = objArr;
        this.f37254c = i;
        this.f37255d = i2;
        boolean z2 = j0Var instanceof GeneratedMessageLite;
        this.f37258g = z;
        this.f37257f = oVar != null && oVar.mo60015e(j0Var);
        this.f37259h = false;
        this.f37260i = iArr2;
        this.f37261j = i3;
        this.f37262k = i4;
        this.f37263l = o0Var;
        this.f37264m = a0Var;
        this.f37265n = b1Var;
        this.f37266o = oVar;
        this.f37256e = j0Var;
        this.f37267p = e0Var;
    }

    /* renamed from: F */
    public static Field m28298F(Class<?> cls, String str) {
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

    /* renamed from: M */
    public static void m28299M(int i, Object obj, C16905j jVar) throws IOException {
        if (obj instanceof String) {
            jVar.f37242a.mo59724O(i, (String) obj);
            return;
        }
        jVar.mo59952b(i, (ByteString) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28300j(byte[] r1, int r2, int r3, com.google.protobuf.WireFormat$FieldType r4, java.lang.Class r5, com.google.protobuf.C16881e.C16882a r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.protobuf.C16913m0.C16914a.f37268a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x00a0;
                case 2: goto L_0x009b;
                case 3: goto L_0x008a;
                case 4: goto L_0x007d;
                case 5: goto L_0x007d;
                case 6: goto L_0x0072;
                case 7: goto L_0x0072;
                case 8: goto L_0x0063;
                case 9: goto L_0x0056;
                case 10: goto L_0x0056;
                case 11: goto L_0x0056;
                case 12: goto L_0x0049;
                case 13: goto L_0x0049;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.protobuf.C16881e.m28086E(r1, r2, r6)
            goto L_0x00b5
        L_0x0019:
            int r1 = com.google.protobuf.C16881e.m28091J(r1, r2, r6)
            long r2 = r6.f37202b
            long r2 = com.google.protobuf.C16900i.m28228b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f37203c = r2
            goto L_0x00b5
        L_0x002b:
            int r1 = com.google.protobuf.C16881e.m28089H(r1, r2, r6)
            int r2 = r6.f37201a
            int r2 = com.google.protobuf.C16900i.m28227a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f37203c = r2
            goto L_0x00b5
        L_0x003d:
            com.google.protobuf.t0 r4 = com.google.protobuf.C16932t0.f37292c
            com.google.protobuf.w0 r4 = r4.mo60039a(r5)
            int r1 = com.google.protobuf.C16881e.m28108o(r4, r1, r2, r3, r6)
            goto L_0x00b5
        L_0x0049:
            int r1 = com.google.protobuf.C16881e.m28091J(r1, r2, r6)
            long r2 = r6.f37202b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f37203c = r2
            goto L_0x00b5
        L_0x0056:
            int r1 = com.google.protobuf.C16881e.m28089H(r1, r2, r6)
            int r2 = r6.f37201a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f37203c = r2
            goto L_0x00b5
        L_0x0063:
            int r1 = com.google.protobuf.C16881e.m28100g(r2, r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f37203c = r1
            goto L_0x0087
        L_0x0072:
            long r3 = com.google.protobuf.C16881e.m28102i(r2, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f37203c = r1
            goto L_0x0098
        L_0x007d:
            int r1 = com.google.protobuf.C16881e.m28100g(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f37203c = r1
        L_0x0087:
            int r1 = r2 + 4
            goto L_0x00b5
        L_0x008a:
            long r3 = com.google.protobuf.C16881e.m28102i(r2, r1)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f37203c = r1
        L_0x0098:
            int r1 = r2 + 8
            goto L_0x00b5
        L_0x009b:
            int r1 = com.google.protobuf.C16881e.m28095b(r1, r2, r6)
            goto L_0x00b5
        L_0x00a0:
            int r1 = com.google.protobuf.C16881e.m28091J(r1, r2, r6)
            long r2 = r6.f37202b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            r2 = 1
            goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f37203c = r2
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.m28300j(byte[], int, int, com.google.protobuf.WireFormat$FieldType, java.lang.Class, com.google.protobuf.e$a):int");
    }

    /* renamed from: o */
    public static C16876c1 m28301o(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C16876c1 c1Var = generatedMessageLite.unknownFields;
        if (c1Var != C16876c1.f37186f) {
            return c1Var;
        }
        C16876c1 c1Var2 = new C16876c1();
        generatedMessageLite.unknownFields = c1Var2;
        return c1Var2;
    }

    /* renamed from: t */
    public static List m28302t(long j, Object obj) {
        return (List) C16889f1.m28157o(j, obj);
    }

    /* renamed from: w */
    public static C16913m0 m28303w(C16899h0 h0Var, C16919o0 o0Var, C16865a0 a0Var, C16871b1 b1Var, C16918o oVar, C16883e0 e0Var) {
        if (h0Var instanceof C16943v0) {
            return m28304x((C16943v0) h0Var, o0Var, a0Var, b1Var, oVar, e0Var);
        }
        C16868a1 a1Var = (C16868a1) h0Var;
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0376  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.C16913m0<T> m28304x(com.google.protobuf.C16943v0 r32, com.google.protobuf.C16919o0 r33, com.google.protobuf.C16865a0 r34, com.google.protobuf.C16871b1<?, ?> r35, com.google.protobuf.C16918o<?> r36, com.google.protobuf.C16883e0 r37) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r32.mo59833c()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r32.mo60058e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f37250q
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0167
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r31 = r14
            r14 = r12
            r12 = r31
        L_0x0167:
            sun.misc.Unsafe r15 = f37251r
            java.lang.Object[] r17 = r32.mo60057d()
            com.google.protobuf.j0 r18 = r32.mo59832b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r14 = r14 + r12
            r21 = r12
            r22 = r14
            r19 = 0
            r20 = 0
        L_0x0186:
            if (r4 >= r1) goto L_0x03cc
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ae
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r23
            r23 = 13
        L_0x0196:
            int r25 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r4 = r4 | r3
            int r23 = r23 + 13
            r3 = r25
            goto L_0x0196
        L_0x01a8:
            int r3 = r3 << r23
            r4 = r4 | r3
            r3 = r25
            goto L_0x01b0
        L_0x01ae:
            r3 = r23
        L_0x01b0:
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01dd
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r23
            r23 = 13
        L_0x01be:
            int r26 = r5 + 1
            char r5 = r0.charAt(r5)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d7
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r23
            r3 = r3 | r1
            int r23 = r23 + 13
            r5 = r26
            r1 = r27
            goto L_0x01be
        L_0x01d7:
            int r1 = r5 << r23
            r3 = r3 | r1
            r1 = r26
            goto L_0x01e1
        L_0x01dd:
            r27 = r1
            r1 = r23
        L_0x01e1:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r23 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ef
            int r14 = r20 + 1
            r13[r20] = r19
            r20 = r14
        L_0x01ef:
            r14 = 51
            if (r5 < r14) goto L_0x0293
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0225
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x0206:
            int r29 = r14 + 1
            char r14 = r0.charAt(r14)
            r30 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021f
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r26
            r1 = r1 | r12
            int r26 = r26 + 13
            r14 = r29
            r12 = r30
            goto L_0x0206
        L_0x021f:
            int r12 = r14 << r26
            r1 = r1 | r12
            r14 = r29
            goto L_0x0229
        L_0x0225:
            r30 = r12
            r14 = r26
        L_0x0229:
            int r12 = r5 + -51
            r26 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0249
            r14 = 17
            if (r12 != r14) goto L_0x0236
            goto L_0x0249
        L_0x0236:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r19 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0249:
            int r12 = r19 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0262
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x026a
        L_0x0262:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m28298F(r2, r12)
            r17[r1] = r12
        L_0x026a:
            r14 = r8
            r29 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027d
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0285
        L_0x027d:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m28298F(r2, r9)
            r17[r1] = r9
        L_0x0285:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r8
            r12 = r10
            r24 = 1
            r8 = r1
            r1 = 0
            goto L_0x038f
        L_0x0293:
            r14 = r8
            r29 = r9
            r30 = r12
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m28298F(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x030a
            r12 = 17
            if (r5 != r12) goto L_0x02ab
            goto L_0x030a
        L_0x02ab:
            r12 = 27
            if (r5 == r12) goto L_0x02fb
            r12 = 49
            if (r5 != r12) goto L_0x02b4
            goto L_0x02fb
        L_0x02b4:
            r12 = 12
            if (r5 == r12) goto L_0x02e7
            r12 = 30
            if (r5 == r12) goto L_0x02e7
            r12 = 44
            if (r5 != r12) goto L_0x02c1
            goto L_0x02e7
        L_0x02c1:
            r12 = 50
            if (r5 != r12) goto L_0x02f8
            int r12 = r21 + 1
            r13[r21] = r19
            int r21 = r19 / 3
            int r21 = r21 * 2
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r21] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e2
            int r21 = r21 + 1
            int r8 = r26 + 1
            r26 = r17[r26]
            r11[r21] = r26
            r21 = r12
            goto L_0x02f8
        L_0x02e2:
            r21 = r12
        L_0x02e4:
            r24 = 1
            goto L_0x031a
        L_0x02e7:
            if (r10 != 0) goto L_0x02f8
            int r12 = r19 / 3
            int r12 = r12 * 2
            r24 = 1
            int r12 = r12 + 1
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02e4
        L_0x02f8:
            r24 = 1
            goto L_0x0318
        L_0x02fb:
            int r12 = r19 / 3
            int r12 = r12 * 2
            r24 = 1
            int r12 = r12 + 1
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x031a
        L_0x030a:
            r24 = 1
            int r12 = r19 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r26 = r9.getType()
            r11[r12] = r26
        L_0x0318:
            r26 = r8
        L_0x031a:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x0328
            r9 = r24
            goto L_0x0329
        L_0x0328:
            r9 = 0
        L_0x0329:
            if (r9 == 0) goto L_0x0376
            r9 = 17
            if (r5 > r9) goto L_0x0376
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0354
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
        L_0x033e:
            int r28 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0350
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r25
            r1 = r1 | r9
            int r25 = r25 + 13
            r9 = r28
            goto L_0x033e
        L_0x0350:
            int r9 = r9 << r25
            r1 = r1 | r9
            goto L_0x0356
        L_0x0354:
            r28 = r9
        L_0x0356:
            int r9 = r6 * 2
            int r25 = r1 / 32
            int r25 = r25 + r9
            r9 = r17[r25]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0365
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x036d
        L_0x0365:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m28298F(r2, r9)
            r17[r25] = r9
        L_0x036d:
            r12 = r10
            long r9 = r15.objectFieldOffset(r9)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x037d
        L_0x0376:
            r12 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r1
            r1 = 0
        L_0x037d:
            r10 = 18
            if (r5 < r10) goto L_0x038b
            r10 = 49
            if (r5 > r10) goto L_0x038b
            int r10 = r22 + 1
            r13[r22] = r8
            r22 = r10
        L_0x038b:
            r16 = r26
            r26 = r28
        L_0x038f:
            int r10 = r19 + 1
            r7[r19] = r4
            int r4 = r10 + 1
            r19 = r0
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x039e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r0 = 0
        L_0x039f:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a6
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r3 = 0
        L_0x03a7:
            r0 = r0 | r3
            int r3 = r5 << 20
            r0 = r0 | r3
            r0 = r0 | r8
            r7[r10] = r0
            int r0 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r12
            r8 = r14
            r14 = r23
            r4 = r26
            r1 = r27
            r9 = r29
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            r31 = r19
            r19 = r0
            r0 = r31
            goto L_0x0186
        L_0x03cc:
            r29 = r9
            r30 = r12
            r23 = r14
            r14 = r8
            r12 = r10
            com.google.protobuf.m0 r0 = new com.google.protobuf.m0
            com.google.protobuf.j0 r9 = r32.mo59832b()
            r4 = r0
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r29
            r11 = r13
            r12 = r30
            r13 = r23
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.m28304x(com.google.protobuf.v0, com.google.protobuf.o0, com.google.protobuf.a0, com.google.protobuf.b1, com.google.protobuf.o, com.google.protobuf.e0):com.google.protobuf.m0");
    }

    /* renamed from: y */
    public static int m28305y(long j, Object obj) {
        return ((Integer) C16889f1.m28157o(j, obj)).intValue();
    }

    /* renamed from: z */
    public static long m28306z(long j, Object obj) {
        return ((Long) C16889f1.m28157o(j, obj)).longValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo59978A(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.protobuf.C16881e.C16882a r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f37251r
            java.lang.Object r12 = r7.mo60000m(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.protobuf.e0 r2 = r7.f37267p
            boolean r2 = r2.mo59883h(r1)
            if (r2 == 0) goto L_0x0021
            com.google.protobuf.e0 r2 = r7.f37267p
            com.google.protobuf.MapFieldLite r2 = r2.mo59881f()
            com.google.protobuf.e0 r3 = r7.f37267p
            r3.mo59876a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.protobuf.e0 r8 = r7.f37267p
            com.google.protobuf.d0$a r8 = r8.mo59877b(r12)
            com.google.protobuf.e0 r12 = r7.f37267p
            com.google.protobuf.MapFieldLite r12 = r12.mo59878c(r1)
            int r10 = com.google.protobuf.C16881e.m28089H(r9, r10, r15)
            int r13 = r15.f37201a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f37198b
            V r0 = r8.f37200d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.protobuf.C16881e.m28088G(r10, r9, r1, r15)
            int r10 = r15.f37201a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.protobuf.WireFormat$FieldType r1 = r8.f37199c
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x0087
            com.google.protobuf.WireFormat$FieldType r4 = r8.f37199c
            V r10 = r8.f37200d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m28300j(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f37203c
            goto L_0x003e
        L_0x0072:
            com.google.protobuf.WireFormat$FieldType r1 = r8.f37197a
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x0087
            com.google.protobuf.WireFormat$FieldType r4 = r8.f37197a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m28300j(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f37203c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.protobuf.C16881e.m28093L(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r8
        L_0x0097:
            com.google.protobuf.InvalidProtocolBufferException r8 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59978A(java.lang.Object, byte[], int, int, int, long, com.google.protobuf.e$a):int");
    }

    /* renamed from: B */
    public final int mo59979B(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C16881e.C16882a aVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C16881e.C16882a aVar2 = aVar;
        Unsafe unsafe = f37251r;
        long j3 = (long) (this.f37252a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C16881e.m28097d(i9, bArr2)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C16881e.m28104k(i9, bArr2)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int J = C16881e.m28091J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f37202b));
                    unsafe.putInt(t2, j3, i11);
                    return J;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int H = C16881e.m28089H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f37201a));
                    unsafe.putInt(t2, j3, i11);
                    return H;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C16881e.m28102i(i9, bArr2)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C16881e.m28100g(i9, bArr2)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int J2 = C16881e.m28091J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f37202b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return J2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int H2 = C16881e.m28089H(bArr2, i9, aVar2);
                    int i18 = aVar2.f37201a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m28000f(H2, H2 + i18, bArr2)) {
                        unsafe.putObject(t2, j2, new String(bArr2, H2, i18, C16935v.f37301a));
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
                    int o = C16881e.m28108o(mo60001n(i13), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f37203c);
                    } else {
                        unsafe.putObject(t2, j2, C16935v.m28395b(object, aVar2.f37203c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C16881e.m28095b(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f37203c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int H3 = C16881e.m28089H(bArr2, i9, aVar2);
                    int i19 = aVar2.f37201a;
                    C16935v.C16938c l = mo59999l(i13);
                    if (l == null || l.mo55639a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m28301o(t).mo59872b(i10, Long.valueOf((long) i19));
                    }
                    return H3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int H4 = C16881e.m28089H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C16900i.m28227a(aVar2.f37201a)));
                    unsafe.putInt(t2, j3, i11);
                    return H4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int J3 = C16881e.m28091J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C16900i.m28228b(aVar2.f37202b)));
                    unsafe.putInt(t2, j3, i11);
                    return J3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int m = C16881e.m28106m(mo60001n(i13), bArr, i, i2, (i10 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f37203c);
                    } else {
                        unsafe.putObject(t2, j2, C16935v.m28395b(object2, aVar2.f37203c));
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0309, code lost:
        r10 = r10 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x030b, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x030c, code lost:
        r2 = r32;
        r5 = r6;
        r4 = r11;
        r3 = r13;
        r13 = r33;
        r6 = r1;
        r11 = r8;
        r1 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0319, code lost:
        r17 = r32;
        r7 = r34;
        r2 = r4;
        r16 = r6;
        r25 = r9;
        r22 = r10;
        r8 = r11;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03cd, code lost:
        if (r0 != r15) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fd, code lost:
        if (r0 != r15) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041c, code lost:
        if (r0 != r15) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0438, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0263, code lost:
        r1 = r10 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02cb, code lost:
        r10 = r10 | r22;
        r0 = r7;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x046b  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo59980C(T r30, byte[] r31, int r32, int r33, int r34, com.google.protobuf.C16881e.C16882a r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f37251r
            r0 = r32
            r1 = r34
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0489
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.C16881e.m28088G(r0, r12, r4, r11)
            int r4 = r11.f37201a
            r27 = r4
            r4 = r0
            r0 = r27
        L_0x002a:
            int r8 = r0 >>> 3
            r7 = r0 & 7
            r10 = 3
            if (r8 <= r2) goto L_0x0042
            int r3 = r3 / r10
            int r2 = r15.f37254c
            if (r8 < r2) goto L_0x003f
            int r2 = r15.f37255d
            if (r8 > r2) goto L_0x003f
            int r2 = r15.mo59985I(r8, r3)
            goto L_0x0040
        L_0x003f:
            r2 = -1
        L_0x0040:
            r3 = 0
            goto L_0x0052
        L_0x0042:
            int r2 = r15.f37254c
            if (r8 < r2) goto L_0x0050
            int r2 = r15.f37255d
            if (r8 > r2) goto L_0x0050
            r3 = 0
            int r2 = r15.mo59985I(r8, r3)
            goto L_0x0052
        L_0x0050:
            r3 = 0
            r2 = -1
        L_0x0052:
            r10 = -1
            if (r2 != r10) goto L_0x0068
            r7 = r1
            r19 = r3
            r26 = r19
            r2 = r4
            r16 = r5
            r22 = r6
            r17 = r8
            r25 = r9
            r18 = r10
            r8 = r0
            goto L_0x043d
        L_0x0068:
            int[] r1 = r15.f37252a
            int r17 = r2 + 1
            r10 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r10 & r17
            int r3 = r17 >>> 20
            r17 = r0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10 & r16
            long r12 = (long) r0
            r0 = 17
            r20 = r10
            if (r3 > r0) goto L_0x032b
            int r0 = r2 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r10 = 1
            int r22 = r10 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x009f
            if (r5 == r1) goto L_0x0097
            long r10 = (long) r5
            r9.putInt(r14, r10, r6)
        L_0x0097:
            long r5 = (long) r0
            int r6 = r9.getInt(r14, r5)
            r10 = r6
            r6 = r0
            goto L_0x00a1
        L_0x009f:
            r10 = r6
            r6 = r5
        L_0x00a1:
            r0 = 5
            switch(r3) {
                case 0: goto L_0x02ec;
                case 1: goto L_0x02cf;
                case 2: goto L_0x02ac;
                case 3: goto L_0x02ac;
                case 4: goto L_0x028e;
                case 5: goto L_0x0267;
                case 6: goto L_0x0245;
                case 7: goto L_0x0216;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01af;
                case 10: goto L_0x0190;
                case 11: goto L_0x028e;
                case 12: goto L_0x0157;
                case 13: goto L_0x0245;
                case 14: goto L_0x0267;
                case 15: goto L_0x0135;
                case 16: goto L_0x0106;
                case 17: goto L_0x00b4;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            r12 = r31
            r13 = r2
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            goto L_0x0319
        L_0x00b4:
            r3 = 3
            if (r7 != r3) goto L_0x00f7
            int r0 = r8 << 3
            r5 = r0 | 4
            com.google.protobuf.w0 r0 = r15.mo60001n(r2)
            r11 = r17
            r17 = r1
            r1 = r31
            r7 = r2
            r2 = r4
            r19 = 0
            r3 = r33
            r4 = r5
            r5 = r35
            int r0 = com.google.protobuf.C16881e.m28106m(r0, r1, r2, r3, r4, r5)
            r1 = r10 & r22
            if (r1 != 0) goto L_0x00de
            r5 = r35
            java.lang.Object r1 = r5.f37203c
            r9.putObject(r14, r12, r1)
            goto L_0x00ed
        L_0x00de:
            r5 = r35
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r5.f37203c
            com.google.protobuf.GeneratedMessageLite r1 = com.google.protobuf.C16935v.m28395b(r1, r2)
            r9.putObject(r14, r12, r1)
        L_0x00ed:
            r1 = r10 | r22
            r12 = r31
            r13 = r7
            r32 = r8
            r8 = r5
            goto L_0x030c
        L_0x00f7:
            r11 = r17
            r19 = 0
            r17 = r1
            r12 = r31
            r13 = r2
            r32 = r8
            r8 = r35
            goto L_0x0319
        L_0x0106:
            r5 = r35
            r11 = r17
            r19 = 0
            r17 = r1
            if (r7 != 0) goto L_0x012d
            r0 = r12
            r12 = r31
            int r7 = com.google.protobuf.C16881e.m28091J(r12, r4, r5)
            long r3 = r5.f37202b
            long r20 = com.google.protobuf.C16900i.m28228b(r3)
            r3 = r0
            r0 = r9
            r1 = r30
            r13 = r2
            r2 = r3
            r32 = r8
            r8 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x02cb
        L_0x012d:
            r12 = r31
            r13 = r2
            r32 = r8
            r8 = r5
            goto L_0x0319
        L_0x0135:
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != 0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r8)
            int r1 = r8.f37201a
            int r1 = com.google.protobuf.C16900i.m28227a(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0309
        L_0x0157:
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != 0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r8)
            int r1 = r8.f37201a
            com.google.protobuf.v$c r4 = r15.mo59999l(r13)
            if (r4 == 0) goto L_0x018b
            boolean r4 = r4.mo55639a(r1)
            if (r4 == 0) goto L_0x017d
            goto L_0x018b
        L_0x017d:
            com.google.protobuf.c1 r2 = m28301o(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo59872b(r11, r1)
            goto L_0x030b
        L_0x018b:
            r9.putInt(r14, r2, r1)
            goto L_0x0309
        L_0x0190:
            r32 = r8
            r11 = r17
            r0 = 2
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28095b(r12, r4, r8)
            java.lang.Object r1 = r8.f37203c
            r9.putObject(r14, r2, r1)
            goto L_0x0309
        L_0x01af:
            r32 = r8
            r11 = r17
            r0 = 2
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x01e7
            com.google.protobuf.w0 r0 = r15.mo60001n(r13)
            r5 = r33
            int r0 = com.google.protobuf.C16881e.m28108o(r0, r12, r4, r5, r8)
            r1 = r10 & r22
            if (r1 != 0) goto L_0x01d8
            java.lang.Object r1 = r8.f37203c
            r9.putObject(r14, r2, r1)
            goto L_0x0263
        L_0x01d8:
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r8.f37203c
            com.google.protobuf.GeneratedMessageLite r1 = com.google.protobuf.C16935v.m28395b(r1, r4)
            r9.putObject(r14, r2, r1)
            goto L_0x0263
        L_0x01e7:
            r5 = r33
            goto L_0x0319
        L_0x01eb:
            r5 = r33
            r32 = r8
            r11 = r17
            r0 = 2
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x020c
            int r0 = com.google.protobuf.C16881e.m28083B(r12, r4, r8)
            goto L_0x0210
        L_0x020c:
            int r0 = com.google.protobuf.C16881e.m28086E(r12, r4, r8)
        L_0x0210:
            java.lang.Object r1 = r8.f37203c
            r9.putObject(r14, r2, r1)
            goto L_0x0263
        L_0x0216:
            r5 = r33
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != 0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28091J(r12, r4, r8)
            r4 = r0
            long r0 = r8.f37202b
            r20 = 0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x023a
            r0 = 1
            goto L_0x023c
        L_0x023a:
            r0 = r19
        L_0x023c:
            com.google.protobuf.C16889f1.m28159q(r14, r2, r0)
            r0 = r10 | r22
            r1 = r0
            r0 = r4
            goto L_0x030c
        L_0x0245:
            r5 = r33
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28100g(r4, r12)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0263:
            r1 = r10 | r22
            goto L_0x030c
        L_0x0267:
            r5 = r33
            r32 = r8
            r11 = r17
            r0 = 1
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            long r20 = com.google.protobuf.C16881e.m28102i(r4, r12)
            r0 = r9
            r1 = r30
            r7 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0309
        L_0x028e:
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != 0) goto L_0x0319
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r8)
            int r1 = r8.f37201a
            r9.putInt(r14, r2, r1)
            goto L_0x0309
        L_0x02ac:
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != 0) goto L_0x0319
            int r7 = com.google.protobuf.C16881e.m28091J(r12, r4, r8)
            long r4 = r8.f37202b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x02cb:
            r10 = r10 | r22
            r0 = r7
            goto L_0x030b
        L_0x02cf:
            r32 = r8
            r11 = r17
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            float r0 = com.google.protobuf.C16881e.m28104k(r4, r12)
            com.google.protobuf.C16889f1.m28164v(r14, r2, r0)
            int r0 = r4 + 4
            goto L_0x0309
        L_0x02ec:
            r32 = r8
            r11 = r17
            r0 = 1
            r19 = 0
            r8 = r35
            r17 = r1
            r27 = r12
            r12 = r31
            r13 = r2
            r2 = r27
            if (r7 != r0) goto L_0x0319
            double r0 = com.google.protobuf.C16881e.m28097d(r4, r12)
            com.google.protobuf.C16889f1.m28163u(r14, r2, r0)
            int r0 = r4 + 8
        L_0x0309:
            r10 = r10 | r22
        L_0x030b:
            r1 = r10
        L_0x030c:
            r2 = r32
            r5 = r6
            r4 = r11
            r3 = r13
            r13 = r33
            r6 = r1
            r11 = r8
            r1 = r34
            goto L_0x0017
        L_0x0319:
            r17 = r32
            r7 = r34
            r2 = r4
            r16 = r6
            r25 = r9
            r22 = r10
            r8 = r11
            r26 = r13
            r18 = -1
            goto L_0x043d
        L_0x032b:
            r32 = r8
            r8 = r11
            r11 = r17
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r19 = 0
            r27 = r12
            r12 = r31
            r13 = r2
            r1 = r27
            r0 = 27
            if (r3 != r0) goto L_0x0397
            r0 = 2
            if (r7 != r0) goto L_0x0386
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.protobuf.v$f r0 = (com.google.protobuf.C16935v.C16942f) r0
            boolean r3 = r0.mo59865h()
            if (r3 != 0) goto L_0x0361
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0358
            r3 = 10
            goto L_0x035a
        L_0x0358:
            int r3 = r3 * 2
        L_0x035a:
            com.google.protobuf.v$f r0 = r0.mo59843i(r3)
            r9.putObject(r14, r1, r0)
        L_0x0361:
            r7 = r0
            com.google.protobuf.w0 r0 = r15.mo60001n(r13)
            r1 = r11
            r2 = r31
            r3 = r4
            r4 = r33
            r16 = r5
            r5 = r7
            r22 = r6
            r6 = r35
            int r0 = com.google.protobuf.C16881e.m28109p(r0, r1, r2, r3, r4, r5, r6)
            r2 = r32
            r1 = r34
            r4 = r11
            r3 = r13
            r5 = r16
            r6 = r22
            r13 = r33
            r11 = r8
            goto L_0x0017
        L_0x0386:
            r16 = r5
            r22 = r6
            r17 = r32
            r15 = r4
            r25 = r9
            r20 = r11
            r26 = r13
            r18 = -1
            goto L_0x0400
        L_0x0397:
            r16 = r5
            r22 = r6
            r0 = 49
            if (r3 > r0) goto L_0x03d0
            r10 = r20
            long r5 = (long) r10
            r0 = r29
            r23 = r1
            r1 = r30
            r2 = r31
            r10 = r3
            r3 = r4
            r15 = r4
            r4 = r33
            r20 = r5
            r5 = r11
            r6 = r32
            r18 = -1
            r17 = r32
            r8 = r13
            r25 = r9
            r32 = r10
            r9 = r20
            r20 = r11
            r11 = r32
            r26 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.mo59982E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0438
            goto L_0x041e
        L_0x03d0:
            r17 = r32
            r23 = r1
            r32 = r3
            r15 = r4
            r25 = r9
            r26 = r13
            r10 = r20
            r18 = -1
            r20 = r11
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x0404
            r0 = 2
            if (r7 != r0) goto L_0x0400
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r26
            r6 = r23
            r8 = r35
            int r0 = r0.mo59978A(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0438
            goto L_0x041e
        L_0x0400:
            r7 = r34
            r2 = r15
            goto L_0x043b
        L_0x0404:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r17
            r8 = r10
            r10 = r23
            r12 = r26
            r13 = r35
            int r0 = r0.mo59979B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0438
        L_0x041e:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r34
            r11 = r35
            r5 = r16
            r2 = r17
            r4 = r20
        L_0x0430:
            r6 = r22
            r9 = r25
            r3 = r26
            goto L_0x0017
        L_0x0438:
            r7 = r34
            r2 = r0
        L_0x043b:
            r8 = r20
        L_0x043d:
            if (r8 != r7) goto L_0x044b
            if (r7 == 0) goto L_0x044b
            r9 = r29
            r0 = r2
            r1 = r7
            r4 = r8
            r5 = r16
            r6 = r22
            goto L_0x0490
        L_0x044b:
            r9 = r29
            boolean r0 = r9.f37257f
            r10 = r35
            if (r0 == 0) goto L_0x046b
            com.google.protobuf.n r0 = r10.f37204d
            com.google.protobuf.n r1 = com.google.protobuf.C16915n.m28337a()
            if (r0 == r1) goto L_0x046b
            com.google.protobuf.j0 r5 = r9.f37256e
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r6 = r35
            int r0 = com.google.protobuf.C16881e.m28099f(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x047a
        L_0x046b:
            com.google.protobuf.c1 r4 = m28301o(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.protobuf.C16881e.m28087F(r0, r1, r2, r3, r4, r5)
        L_0x047a:
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r7
            r4 = r8
            r15 = r9
            r11 = r10
            r5 = r16
            r2 = r17
            goto L_0x0430
        L_0x0489:
            r16 = r5
            r22 = r6
            r25 = r9
            r9 = r15
        L_0x0490:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x049e
            long r2 = (long) r5
            r5 = r30
            r7 = r25
            r7.putInt(r5, r2, r6)
            goto L_0x04a0
        L_0x049e:
            r5 = r30
        L_0x04a0:
            r2 = 0
            int r3 = r9.f37261j
        L_0x04a3:
            int r6 = r9.f37262k
            if (r3 >= r6) goto L_0x04b6
            int[] r6 = r9.f37260i
            r6 = r6[r3]
            com.google.protobuf.b1<?, ?> r7 = r9.f37265n
            java.lang.Object r2 = r9.mo59998k(r5, r6, r2, r7)
            com.google.protobuf.c1 r2 = (com.google.protobuf.C16876c1) r2
            int r3 = r3 + 1
            goto L_0x04a3
        L_0x04b6:
            if (r2 == 0) goto L_0x04bd
            com.google.protobuf.b1<?, ?> r3 = r9.f37265n
            r3.mo59857i(r5, r2)
        L_0x04bd:
            if (r1 != 0) goto L_0x04c9
            r2 = r33
            if (r0 != r2) goto L_0x04c4
            goto L_0x04cf
        L_0x04c4:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x04c9:
            r2 = r33
            if (r0 > r2) goto L_0x04d0
            if (r4 != r1) goto L_0x04d0
        L_0x04cf:
            return r0
        L_0x04d0:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59980C(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d6, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x030e, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x032d, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x032f, code lost:
        r2 = r17;
        r5 = r25;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r23 = r33;
        r7 = r35;
        r17 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
        r1 = r11 | r22;
        r2 = r6;
        r11 = r7;
        r9 = r10;
        r5 = r17;
        r8 = r24;
        r7 = -1;
        r10 = 0;
        r6 = r1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        r5 = r17;
        r17 = r6;
        r6 = r11 | r22;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0220, code lost:
        r0 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0222, code lost:
        r5 = r17;
        r17 = r6;
        r6 = r11 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x022a, code lost:
        r2 = r4;
        r28 = r10;
        r25 = r17;
        r18 = 0;
        r19 = -1;
        r10 = r6;
        r6 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59981D(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.protobuf.C16881e.C16882a r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f37251r
            r10 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = -1
            r0 = r33
            r1 = r7
            r5 = r8
            r2 = r10
            r6 = r2
        L_0x0017:
            if (r0 >= r13) goto L_0x0365
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.protobuf.C16881e.m28088G(r0, r12, r3, r11)
            int r3 = r11.f37201a
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
            int r1 = r15.f37254c
            if (r3 < r1) goto L_0x004e
            int r1 = r15.f37255d
            if (r3 > r1) goto L_0x004e
            int r1 = r15.mo59985I(r3, r2)
            goto L_0x004f
        L_0x0041:
            int r1 = r15.f37254c
            if (r3 < r1) goto L_0x004e
            int r1 = r15.f37255d
            if (r3 > r1) goto L_0x004e
            int r1 = r15.mo59985I(r3, r10)
            goto L_0x004f
        L_0x004e:
            r1 = r7
        L_0x004f:
            r2 = r1
            if (r2 != r7) goto L_0x005f
            r23 = r3
            r2 = r4
            r25 = r5
            r19 = r7
            r28 = r9
            r18 = r10
            goto L_0x033b
        L_0x005f:
            int[] r1 = r15.f37252a
            int r17 = r2 + 1
            r10 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r10 & r17
            int r7 = r17 >>> 20
            r33 = r3
            r3 = r10 & r8
            r17 = r9
            long r8 = (long) r3
            r3 = 17
            r21 = r10
            if (r7 > r3) goto L_0x0237
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r10 = 1
            int r22 = r10 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            if (r1 == r5) goto L_0x009d
            if (r5 == r3) goto L_0x0090
            long r10 = (long) r5
            r5 = r17
            r5.putInt(r14, r10, r6)
            goto L_0x0092
        L_0x0090:
            r5 = r17
        L_0x0092:
            if (r1 == r3) goto L_0x0099
            long r10 = (long) r1
            int r6 = r5.getInt(r14, r10)
        L_0x0099:
            r10 = r5
            r11 = r6
            r6 = r1
            goto L_0x00a1
        L_0x009d:
            r10 = r17
            r11 = r6
            r6 = r5
        L_0x00a1:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x020d;
                case 1: goto L_0x01f8;
                case 2: goto L_0x01d5;
                case 3: goto L_0x01d5;
                case 4: goto L_0x01c0;
                case 5: goto L_0x01a3;
                case 6: goto L_0x017f;
                case 7: goto L_0x0161;
                case 8: goto L_0x0140;
                case 9: goto L_0x0115;
                case 10: goto L_0x00fe;
                case 11: goto L_0x01c0;
                case 12: goto L_0x00e8;
                case 13: goto L_0x017f;
                case 14: goto L_0x01a3;
                case 15: goto L_0x00ce;
                case 16: goto L_0x00b0;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            goto L_0x022a
        L_0x00b0:
            if (r0 != 0) goto L_0x00a5
            r7 = r35
            int r16 = com.google.protobuf.C16881e.m28091J(r12, r4, r7)
            long r0 = r7.f37202b
            long r4 = com.google.protobuf.C16900i.m28228b(r0)
            r0 = r10
            r1 = r31
            r23 = r33
            r24 = r3
            r17 = r6
            r6 = r2
            r2 = r8
            r0.putLong(r1, r2, r4)
            goto L_0x01ed
        L_0x00ce:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != 0) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r7)
            int r1 = r7.f37201a
            int r1 = com.google.protobuf.C16900i.m28227a(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0222
        L_0x00e8:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != 0) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r7)
            int r1 = r7.f37201a
            r10.putInt(r14, r8, r1)
            goto L_0x0222
        L_0x00fe:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28095b(r12, r4, r7)
            java.lang.Object r1 = r7.f37203c
            r10.putObject(r14, r8, r1)
            goto L_0x0222
        L_0x0115:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x022a
            com.google.protobuf.w0 r0 = r15.mo60001n(r6)
            int r0 = com.google.protobuf.C16881e.m28108o(r0, r12, r4, r13, r7)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0136
            java.lang.Object r1 = r7.f37203c
            r10.putObject(r14, r8, r1)
            goto L_0x0193
        L_0x0136:
            java.lang.Object r2 = r7.f37203c
            com.google.protobuf.GeneratedMessageLite r1 = com.google.protobuf.C16935v.m28395b(r1, r2)
            r10.putObject(r14, r8, r1)
            goto L_0x0193
        L_0x0140:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r1 = 2
            r6 = r2
            if (r0 != r1) goto L_0x022a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0157
            int r0 = com.google.protobuf.C16881e.m28083B(r12, r4, r7)
            goto L_0x015b
        L_0x0157:
            int r0 = com.google.protobuf.C16881e.m28086E(r12, r4, r7)
        L_0x015b:
            java.lang.Object r1 = r7.f37203c
            r10.putObject(r14, r8, r1)
            goto L_0x0193
        L_0x0161:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != 0) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28091J(r12, r4, r7)
            long r1 = r7.f37202b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017a
            r1 = 1
            goto L_0x017b
        L_0x017a:
            r1 = 0
        L_0x017b:
            com.google.protobuf.C16889f1.m28159q(r14, r8, r1)
            goto L_0x0193
        L_0x017f:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != r1) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28100g(r4, r12)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0193:
            r1 = r11 | r22
            r2 = r6
            r11 = r7
            r9 = r10
            r5 = r17
            r8 = r24
            r7 = -1
            r10 = 0
            r6 = r1
            r1 = r23
            goto L_0x0017
        L_0x01a3:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r1 = 1
            r6 = r2
            if (r0 != r1) goto L_0x022a
            long r20 = com.google.protobuf.C16881e.m28102i(r4, r12)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r4 = r8
            goto L_0x0220
        L_0x01c0:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != 0) goto L_0x022a
            int r0 = com.google.protobuf.C16881e.m28089H(r12, r4, r7)
            int r1 = r7.f37201a
            r10.putInt(r14, r8, r1)
            goto L_0x0222
        L_0x01d5:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != 0) goto L_0x022a
            int r16 = com.google.protobuf.C16881e.m28091J(r12, r4, r7)
            long r4 = r7.f37202b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01ed:
            r0 = r11 | r22
            r5 = r17
            r17 = r6
            r6 = r0
            r0 = r16
            goto L_0x027d
        L_0x01f8:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r6 = r2
            if (r0 != r1) goto L_0x022a
            float r0 = com.google.protobuf.C16881e.m28104k(r4, r12)
            com.google.protobuf.C16889f1.m28164v(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0222
        L_0x020d:
            r23 = r33
            r7 = r35
            r24 = r3
            r17 = r6
            r1 = 1
            r6 = r2
            if (r0 != r1) goto L_0x022a
            double r0 = com.google.protobuf.C16881e.m28097d(r4, r12)
            com.google.protobuf.C16889f1.m28163u(r14, r8, r0)
        L_0x0220:
            int r0 = r4 + 8
        L_0x0222:
            r1 = r11 | r22
            r5 = r17
            r17 = r6
            r6 = r1
            goto L_0x027d
        L_0x022a:
            r2 = r4
            r28 = r10
            r25 = r17
            r18 = 0
            r19 = -1
            r10 = r6
            r6 = r11
            goto L_0x033b
        L_0x0237:
            r23 = r33
            r11 = r6
            r10 = r17
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r1 = 27
            if (r7 != r1) goto L_0x0299
            r1 = 2
            if (r0 != r1) goto L_0x028a
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.protobuf.v$f r0 = (com.google.protobuf.C16935v.C16942f) r0
            boolean r1 = r0.mo59865h()
            if (r1 != 0) goto L_0x0265
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025c
            r1 = 10
            goto L_0x025e
        L_0x025c:
            int r1 = r1 * 2
        L_0x025e:
            com.google.protobuf.v$f r0 = r0.mo59843i(r1)
            r10.putObject(r14, r8, r0)
        L_0x0265:
            r7 = r0
            com.google.protobuf.w0 r0 = r15.mo60001n(r6)
            r1 = r16
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r5
            r5 = r7
            r17 = r6
            r6 = r35
            int r0 = com.google.protobuf.C16881e.m28109p(r0, r1, r2, r3, r4, r5, r6)
            r5 = r8
            r6 = r11
        L_0x027d:
            r11 = r35
            r9 = r10
            r2 = r17
            r1 = r23
            r8 = r24
            r7 = -1
            r10 = 0
            goto L_0x0017
        L_0x028a:
            r17 = r6
            r15 = r4
            r25 = r5
            r28 = r10
            r29 = r11
            r18 = 0
            r19 = -1
            goto L_0x0311
        L_0x0299:
            r17 = r6
            r6 = r5
            r1 = 49
            if (r7 > r1) goto L_0x02dd
            r5 = r21
            long r2 = (long) r5
            r5 = r0
            r0 = r30
            r1 = r31
            r20 = r2
            r2 = r32
            r3 = r4
            r15 = r4
            r4 = r34
            r33 = r5
            r5 = r16
            r25 = r6
            r6 = r23
            r22 = r7
            r19 = -1
            r7 = r33
            r26 = r8
            r9 = r24
            r8 = r17
            r28 = r10
            r18 = 0
            r9 = r20
            r29 = r11
            r11 = r22
            r12 = r26
            r14 = r35
            int r0 = r0.mo59982E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02da
            goto L_0x032f
        L_0x02da:
            r4 = r0
            goto L_0x0336
        L_0x02dd:
            r33 = r0
            r15 = r4
            r25 = r6
            r22 = r7
            r26 = r8
            r28 = r10
            r29 = r11
            r5 = r21
            r18 = 0
            r19 = -1
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x0313
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0311
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r26
            r8 = r35
            int r0 = r0.mo59978A(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02da
            goto L_0x032f
        L_0x0311:
            r4 = r15
            goto L_0x0336
        L_0x0313:
            r7 = r33
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r8 = r5
            r5 = r16
            r6 = r23
            r10 = r26
            r12 = r17
            r13 = r35
            int r0 = r0.mo59979B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02da
        L_0x032f:
            r2 = r17
            r5 = r25
            r6 = r29
            goto L_0x034e
        L_0x0336:
            r2 = r4
            r10 = r17
            r6 = r29
        L_0x033b:
            com.google.protobuf.c1 r4 = m28301o(r31)
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.protobuf.C16881e.m28087F(r0, r1, r2, r3, r4, r5)
            r2 = r10
            r5 = r25
        L_0x034e:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r7 = r19
            r1 = r23
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0017
        L_0x0365:
            r29 = r6
            r1 = r8
            r28 = r9
            if (r5 == r1) goto L_0x0376
            long r1 = (long) r5
            r3 = r31
            r4 = r28
            r6 = r29
            r4.putInt(r3, r1, r6)
        L_0x0376:
            r1 = r34
            if (r0 != r1) goto L_0x037b
            return
        L_0x037b:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59981D(java.lang.Object, byte[], int, int, com.google.protobuf.e$a):void");
    }

    /* renamed from: E */
    public final int mo59982E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C16881e.C16882a aVar) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C16881e.C16882a aVar2 = aVar;
        Unsafe unsafe = f37251r;
        C16935v.C16942f fVar = (C16935v.C16942f) unsafe.getObject(t, j3);
        if (!fVar.mo59865h()) {
            int size = fVar.size();
            fVar = fVar.mo59843i(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, fVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C16881e.m28111r(bArr, i9, fVar, aVar2);
                }
                if (i10 == 1) {
                    return C16881e.m28098e(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C16881e.m28114u(bArr, i9, fVar, aVar2);
                }
                if (i10 == 5) {
                    return C16881e.m28105l(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C16881e.m28118y(bArr, i9, fVar, aVar2);
                }
                if (i10 == 0) {
                    return C16881e.m28092K(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C16881e.m28117x(bArr, i9, fVar, aVar2);
                }
                if (i10 == 0) {
                    return C16881e.m28090I(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C16881e.m28113t(bArr, i9, fVar, aVar2);
                }
                if (i10 == 1) {
                    return C16881e.m28103j(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C16881e.m28112s(bArr, i9, fVar, aVar2);
                }
                if (i10 == 5) {
                    return C16881e.m28101h(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C16881e.m28110q(bArr, i9, fVar, aVar2);
                }
                if (i10 == 0) {
                    return C16881e.m28094a(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? C16881e.m28084C(i3, bArr, i, i2, fVar, aVar) : C16881e.m28085D(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C16881e.m28109p(mo60001n(i11), i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C16881e.m28096c(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C16881e.m28117x(bArr, i9, fVar, aVar2);
                } else if (i10 == 0) {
                    i8 = C16881e.m28090I(i3, bArr, i, i2, fVar, aVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C16876c1 c1Var = generatedMessageLite.unknownFields;
                if (c1Var == C16876c1.f37186f) {
                    c1Var = null;
                }
                C16876c1 c1Var2 = (C16876c1) C16949x0.m28462z(i4, fVar, mo59999l(i11), c1Var, this.f37265n);
                if (c1Var2 != null) {
                    generatedMessageLite.unknownFields = c1Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C16881e.m28115v(bArr, i9, fVar, aVar2);
                }
                if (i10 == 0) {
                    return C16881e.m28119z(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C16881e.m28116w(bArr, i9, fVar, aVar2);
                }
                if (i10 == 0) {
                    return C16881e.m28082A(i3, bArr, i, i2, fVar, aVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C16881e.m28107n(mo60001n(i11), i3, bArr, i, i2, fVar, aVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: G */
    public final void mo59983G(int i, Object obj) {
        int i2 = this.f37252a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C16889f1.m28165w(obj, (1 << (i2 >>> 20)) | C16889f1.m28155m(j, obj), j);
        }
    }

    /* renamed from: H */
    public final void mo59984H(int i, int i2, Object obj) {
        C16889f1.m28165w(obj, i, (long) (this.f37252a[i2 + 2] & 1048575));
    }

    /* renamed from: I */
    public final int mo59985I(int i, int i2) {
        int length = (this.f37252a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f37252a[i4];
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

    /* renamed from: J */
    public final int mo59986J(int i) {
        return this.f37252a[i + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03a7, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0494, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02df  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59987K(java.lang.Object r18, com.google.protobuf.C16905j r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f37257f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.o<?> r3 = r0.f37266o
            com.google.protobuf.r r3 = r3.mo60013c(r1)
            boolean r5 = r3.mo60024h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo60027k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f37252a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f37251r
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002d:
            if (r10 >= r6) goto L_0x0498
            int r13 = r0.mo59986J(r10)
            int[] r14 = r0.f37252a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x0058
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0052
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0052:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0076
            com.google.protobuf.o<?> r9 = r0.f37266o
            r9.mo60011a(r5)
            if (r15 < 0) goto L_0x0076
            com.google.protobuf.o<?> r9 = r0.f37266o
            r9.mo60017g(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0074:
            r5 = 0
            goto L_0x0059
        L_0x0076:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x0399;
                case 19: goto L_0x038a;
                case 20: goto L_0x037b;
                case 21: goto L_0x036c;
                case 22: goto L_0x035d;
                case 23: goto L_0x034e;
                case 24: goto L_0x033f;
                case 25: goto L_0x0330;
                case 26: goto L_0x0321;
                case 27: goto L_0x030e;
                case 28: goto L_0x02ff;
                case 29: goto L_0x02ef;
                case 30: goto L_0x02df;
                case 31: goto L_0x02cf;
                case 32: goto L_0x02bf;
                case 33: goto L_0x02af;
                case 34: goto L_0x029f;
                case 35: goto L_0x028f;
                case 36: goto L_0x027f;
                case 37: goto L_0x026f;
                case 38: goto L_0x025f;
                case 39: goto L_0x024f;
                case 40: goto L_0x023f;
                case 41: goto L_0x022f;
                case 42: goto L_0x021f;
                case 43: goto L_0x020f;
                case 44: goto L_0x01ff;
                case 45: goto L_0x01ef;
                case 46: goto L_0x01df;
                case 47: goto L_0x01cf;
                case 48: goto L_0x01bf;
                case 49: goto L_0x01ac;
                case 50: goto L_0x01a3;
                case 51: goto L_0x018e;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r4 = 0
            goto L_0x0494
        L_0x0081:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.w0 r8 = r0.mo60001n(r10)
            r2.mo59958h(r15, r8, r4)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m28306z(r13, r1)
            r2.mo59966p(r15, r13)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59965o(r15, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m28306z(r13, r1)
            r2.mo59964n(r15, r13)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59963m(r15, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59954d(r15, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59967q(r15, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo59952b(r15, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.w0 r8 = r0.mo60001n(r10)
            r2.mo59961k(r15, r8, r4)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            m28299M(r15, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r13, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.mo59951a(r15, r4)
            goto L_0x007e
        L_0x012e:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59955e(r15, r4)
            goto L_0x007e
        L_0x013d:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m28306z(r13, r1)
            r2.mo59956f(r15, r13)
            goto L_0x007e
        L_0x014c:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m28305y(r13, r1)
            r2.mo59959i(r15, r4)
            goto L_0x007e
        L_0x015b:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m28306z(r13, r1)
            r2.mo59968r(r15, r13)
            goto L_0x007e
        L_0x016a:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m28306z(r13, r1)
            r2.mo59960j(r15, r13)
            goto L_0x007e
        L_0x0179:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r13, r1)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.mo59957g(r4, r15)
            goto L_0x007e
        L_0x018e:
            boolean r4 = r0.mo60006s(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r13, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r2.mo59953c(r15, r13)
            goto L_0x007e
        L_0x01a3:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.mo59988L(r2, r15, r4, r10)
            goto L_0x007e
        L_0x01ac:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.w0 r13 = r0.mo60001n(r10)
            com.google.protobuf.C16949x0.m28426L(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bf:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.protobuf.C16949x0.m28433S(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01cf:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28432R(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01df:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28431Q(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ef:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28430P(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ff:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28422H(r4, r8, r2, r15)
            goto L_0x007e
        L_0x020f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28435U(r4, r8, r2, r15)
            goto L_0x007e
        L_0x021f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28419E(r4, r8, r2, r15)
            goto L_0x007e
        L_0x022f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28423I(r4, r8, r2, r15)
            goto L_0x007e
        L_0x023f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28424J(r4, r8, r2, r15)
            goto L_0x007e
        L_0x024f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28427M(r4, r8, r2, r15)
            goto L_0x007e
        L_0x025f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28436V(r4, r8, r2, r15)
            goto L_0x007e
        L_0x026f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28428N(r4, r8, r2, r15)
            goto L_0x007e
        L_0x027f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28425K(r4, r8, r2, r15)
            goto L_0x007e
        L_0x028f:
            r15 = 1
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28421G(r4, r8, r2, r15)
            goto L_0x007e
        L_0x029f:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C16949x0.m28433S(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02af:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28432R(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28431Q(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02cf:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28430P(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02df:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28422H(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ef:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28435U(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ff:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28420F(r4, r8, r2)
            goto L_0x007e
        L_0x030e:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.w0 r13 = r0.mo60001n(r10)
            com.google.protobuf.C16949x0.m28429O(r4, r8, r2, r13)
            goto L_0x007e
        L_0x0321:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28434T(r4, r8, r2)
            goto L_0x007e
        L_0x0330:
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C16949x0.m28419E(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x033f:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28423I(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x034e:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28424J(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28427M(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28436V(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x037b:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28428N(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28425K(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x0399:
            r15 = 0
            int[] r4 = r0.f37252a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28421G(r4, r8, r2, r15)
        L_0x03a7:
            r4 = r15
            goto L_0x0494
        L_0x03aa:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.w0 r13 = r0.mo60001n(r10)
            r2.mo59958h(r15, r13, r8)
            goto L_0x0494
        L_0x03bb:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.mo59966p(r15, r13)
            goto L_0x0494
        L_0x03c8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59965o(r15, r8)
            goto L_0x0494
        L_0x03d5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.mo59964n(r15, r13)
            goto L_0x0494
        L_0x03e2:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59963m(r15, r8)
            goto L_0x0494
        L_0x03ef:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59954d(r15, r8)
            goto L_0x0494
        L_0x03fc:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59967q(r15, r8)
            goto L_0x0494
        L_0x0409:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r2.mo59952b(r15, r8)
            goto L_0x0494
        L_0x0418:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.w0 r13 = r0.mo60001n(r10)
            r2.mo59961k(r15, r13, r8)
            goto L_0x0494
        L_0x0429:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            m28299M(r15, r8, r2)
            goto L_0x0494
        L_0x0435:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            boolean r8 = com.google.protobuf.C16889f1.m28148f(r13, r1)
            r2.mo59951a(r15, r8)
            goto L_0x0494
        L_0x0441:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59955e(r15, r8)
            goto L_0x0494
        L_0x044d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.mo59956f(r15, r13)
            goto L_0x0494
        L_0x0459:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.mo59959i(r15, r8)
            goto L_0x0494
        L_0x0465:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.mo59968r(r15, r13)
            goto L_0x0494
        L_0x0471:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.mo59960j(r15, r13)
            goto L_0x0494
        L_0x047d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            float r8 = com.google.protobuf.C16889f1.m28154l(r13, r1)
            r2.mo59957g(r8, r15)
            goto L_0x0494
        L_0x0489:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            double r13 = com.google.protobuf.C16889f1.m28153k(r13, r1)
            r2.mo59953c(r15, r13)
        L_0x0494:
            int r10 = r10 + 3
            goto L_0x002d
        L_0x0498:
            if (r5 == 0) goto L_0x04af
            com.google.protobuf.o<?> r4 = r0.f37266o
            r4.mo60017g(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ad
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0498
        L_0x04ad:
            r5 = 0
            goto L_0x0498
        L_0x04af:
            com.google.protobuf.b1<?, ?> r3 = r0.f37265n
            com.google.protobuf.c1 r1 = r3.mo59851c(r1)
            r3.mo59860l(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59987K(java.lang.Object, com.google.protobuf.j):void");
    }

    /* renamed from: L */
    public final void mo59988L(C16905j jVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C16878d0.C16879a<?, ?> b = this.f37267p.mo59877b(mo60000m(i2));
            MapFieldLite d = this.f37267p.mo59879d(obj);
            jVar.f37242a.getClass();
            for (Map.Entry entry : d.entrySet()) {
                jVar.f37242a.mo59726Q(i, 2);
                jVar.f37242a.mo59728S(C16878d0.m28068a(b, entry.getKey(), entry.getValue()));
                C16878d0.m28069b(jVar.f37242a, b, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo59989a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f37252a.length; i += 3) {
            int J = mo59986J(i);
            long j = (long) (1048575 & J);
            int i2 = this.f37252a[i];
            switch ((J & 267386880) >>> 20) {
                case 0:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28163u(t, j, C16889f1.m28153k(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 1:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28164v(t, j, C16889f1.m28154l(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 2:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28166x(t, j, C16889f1.m28156n(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 3:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28166x(t, j, C16889f1.m28156n(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 4:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 5:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28166x(t, j, C16889f1.m28156n(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 6:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 7:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28159q(t, j, C16889f1.m28148f(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 8:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28167y(j, t, C16889f1.m28157o(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 9:
                    mo60007u(i, t, t2);
                    break;
                case 10:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28167y(j, t, C16889f1.m28157o(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 11:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 12:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 13:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 14:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28166x(t, j, C16889f1.m28156n(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 15:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28165w(t, C16889f1.m28155m(j, t2), j);
                        mo59983G(i, t);
                        break;
                    }
                case 16:
                    if (!mo60005r(i, t2)) {
                        break;
                    } else {
                        C16889f1.m28166x(t, j, C16889f1.m28156n(j, t2));
                        mo59983G(i, t);
                        break;
                    }
                case 17:
                    mo60007u(i, t, t2);
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
                    this.f37264m.mo59830b(j, t, t2);
                    break;
                case 50:
                    C16883e0 e0Var = this.f37267p;
                    Class<?> cls = C16949x0.f37313a;
                    C16889f1.m28167y(j, t, e0Var.mo59876a(C16889f1.m28157o(j, t), C16889f1.m28157o(j, t2)));
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
                    if (!mo60006s(i2, i, t2)) {
                        break;
                    } else {
                        C16889f1.m28167y(j, t, C16889f1.m28157o(j, t2));
                        mo59984H(i2, i, t);
                        break;
                    }
                case 60:
                    mo60008v(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo60006s(i2, i, t2)) {
                        break;
                    } else {
                        C16889f1.m28167y(j, t, C16889f1.m28157o(j, t2));
                        mo59984H(i2, i, t);
                        break;
                    }
                case 68:
                    mo60008v(i, t, t2);
                    break;
            }
        }
        C16871b1<?, ?> b1Var = this.f37265n;
        Class<?> cls2 = C16949x0.f37313a;
        b1Var.mo59858j(t, b1Var.mo59855g(b1Var.mo59851c(t), b1Var.mo59851c(t2)));
        if (this.f37257f) {
            C16949x0.m28416B(this.f37266o, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo59990b(T t) {
        int i;
        int i2 = this.f37261j;
        while (true) {
            i = this.f37262k;
            if (i2 >= i) {
                break;
            }
            long J = (long) (mo59986J(this.f37260i[i2]) & 1048575);
            Object o = C16889f1.m28157o(J, t);
            if (o != null) {
                C16889f1.m28167y(J, t, this.f37267p.mo59880e(o));
            }
            i2++;
        }
        int length = this.f37260i.length;
        while (i < length) {
            this.f37264m.mo59829a((long) this.f37260i[i], t);
            i++;
        }
        this.f37265n.mo59854f(t);
        if (this.f37257f) {
            this.f37266o.mo60016f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo59991c(T t) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        while (true) {
            boolean z = true;
            if (i >= this.f37261j) {
                return !this.f37257f || this.f37266o.mo60013c(t).mo60026i();
            }
            int i4 = this.f37260i[i];
            int i5 = this.f37252a[i4];
            int J = mo59986J(i4);
            int i6 = this.f37252a[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i3) {
                if (i7 != 1048575) {
                    i2 = f37251r.getInt(t, (long) i7);
                }
                i3 = i7;
            }
            if ((268435456 & J) != 0) {
                if (!(i3 == 1048575 ? mo60005r(i4, t) : (i2 & i8) != 0)) {
                    return false;
                }
            }
            int i9 = (267386880 & J) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (i3 == 1048575) {
                    z = mo60005r(i4, t);
                } else if ((i2 & i8) == 0) {
                    z = false;
                }
                if (z && !mo60001n(i4).mo59991c(C16889f1.m28157o((long) (J & 1048575), t))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (mo60006s(i5, i4, t) && !mo60001n(i4).mo59991c(C16889f1.m28157o((long) (J & 1048575), t))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            MapFieldLite d = this.f37267p.mo59879d(C16889f1.m28157o((long) (J & 1048575), t));
                            if (!d.isEmpty()) {
                                if (this.f37267p.mo59877b(mo60000m(i4)).f37199c.getJavaType() == WireFormat$JavaType.MESSAGE) {
                                    C16947w0<?> w0Var = null;
                                    Iterator it = d.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (w0Var == null) {
                                            w0Var = C16932t0.f37292c.mo60039a(next.getClass());
                                        }
                                        if (!w0Var.mo59991c(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C16889f1.m28157o((long) (J & 1048575), t);
                if (!list.isEmpty()) {
                    C16947w0 n = mo60001n(i4);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!n.mo59991c(list.get(i10))) {
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
            i++;
        }
    }

    /* renamed from: d */
    public final int mo59992d(T t) {
        return this.f37258g ? mo60004q(t) : mo60003p(t);
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
    public final int mo59993e(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f37252a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.mo59986J(r1)
            int[] r4 = r10.f37252a
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
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m28306z(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m28306z(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.protobuf.C16935v.f37301a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m28306z(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m28305y(r5, r11)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m28306z(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m28306z(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.mo60006s(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C16889f1.m28156n(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C16889f1.m28156n(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C16889f1.m28148f(r5, r11)
            java.nio.charset.Charset r4 = com.google.protobuf.C16935v.f37301a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C16889f1.m28156n(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C16889f1.m28155m(r5, r11)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C16889f1.m28156n(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C16889f1.m28156n(r5, r11)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C16889f1.m28154l(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C16889f1.m28153k(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C16935v.m28394a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            com.google.protobuf.b1<?, ?> r0 = r10.f37265n
            com.google.protobuf.c1 r0 = r0.mo59851c(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f37257f
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            com.google.protobuf.o<?> r1 = r10.f37266o
            com.google.protobuf.r r11 = r1.mo60013c(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59993e(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.protobuf.C16949x0.m28417C(com.google.protobuf.C16889f1.m28157o(r6, r10), com.google.protobuf.C16889f1.m28157o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.protobuf.C16949x0.m28417C(com.google.protobuf.C16889f1.m28157o(r6, r10), com.google.protobuf.C16889f1.m28157o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (com.google.protobuf.C16889f1.m28156n(r6, r10) == com.google.protobuf.C16889f1.m28156n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (com.google.protobuf.C16889f1.m28156n(r6, r10) == com.google.protobuf.C16889f1.m28156n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.protobuf.C16949x0.m28417C(com.google.protobuf.C16889f1.m28157o(r6, r10), com.google.protobuf.C16889f1.m28157o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.protobuf.C16949x0.m28417C(com.google.protobuf.C16889f1.m28157o(r6, r10), com.google.protobuf.C16889f1.m28157o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.protobuf.C16949x0.m28417C(com.google.protobuf.C16889f1.m28157o(r6, r10), com.google.protobuf.C16889f1.m28157o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (com.google.protobuf.C16889f1.m28148f(r6, r10) == com.google.protobuf.C16889f1.m28148f(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (com.google.protobuf.C16889f1.m28156n(r6, r10) == com.google.protobuf.C16889f1.m28156n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (com.google.protobuf.C16889f1.m28155m(r6, r10) == com.google.protobuf.C16889f1.m28155m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (com.google.protobuf.C16889f1.m28156n(r6, r10) == com.google.protobuf.C16889f1.m28156n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (com.google.protobuf.C16889f1.m28156n(r6, r10) == com.google.protobuf.C16889f1.m28156n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(com.google.protobuf.C16889f1.m28154l(r6, r10)) == java.lang.Float.floatToIntBits(com.google.protobuf.C16889f1.m28154l(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.C16889f1.m28153k(r6, r10)) == java.lang.Double.doubleToLongBits(com.google.protobuf.C16889f1.m28153k(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59994f(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f37252a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.mo59986J(r2)
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
            int[] r4 = r9.f37252a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.protobuf.C16889f1.m28155m(r4, r10)
            int r4 = com.google.protobuf.C16889f1.m28155m(r4, r11)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r4 = com.google.protobuf.C16949x0.m28417C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r3 = com.google.protobuf.C16949x0.m28417C(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r3 = com.google.protobuf.C16949x0.m28417C(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r4 = com.google.protobuf.C16949x0.m28417C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C16889f1.m28156n(r6, r10)
            long r6 = com.google.protobuf.C16889f1.m28156n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C16889f1.m28156n(r6, r10)
            long r6 = com.google.protobuf.C16889f1.m28156n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r4 = com.google.protobuf.C16949x0.m28417C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r4 = com.google.protobuf.C16949x0.m28417C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r6, r10)
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r6, r11)
            boolean r4 = com.google.protobuf.C16949x0.m28417C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = com.google.protobuf.C16889f1.m28148f(r6, r10)
            boolean r5 = com.google.protobuf.C16889f1.m28148f(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C16889f1.m28156n(r6, r10)
            long r6 = com.google.protobuf.C16889f1.m28156n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C16889f1.m28155m(r6, r10)
            int r5 = com.google.protobuf.C16889f1.m28155m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C16889f1.m28156n(r6, r10)
            long r6 = com.google.protobuf.C16889f1.m28156n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C16889f1.m28156n(r6, r10)
            long r6 = com.google.protobuf.C16889f1.m28156n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = com.google.protobuf.C16889f1.m28154l(r6, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.protobuf.C16889f1.m28154l(r6, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.mo59997i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = com.google.protobuf.C16889f1.m28153k(r6, r10)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.protobuf.C16889f1.m28153k(r6, r11)
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
            com.google.protobuf.b1<?, ?> r0 = r9.f37265n
            com.google.protobuf.c1 r0 = r0.mo59851c(r10)
            com.google.protobuf.b1<?, ?> r2 = r9.f37265n
            com.google.protobuf.c1 r2 = r2.mo59851c(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f37257f
            if (r0 == 0) goto L_0x01fa
            com.google.protobuf.o<?> r0 = r9.f37266o
            com.google.protobuf.r r10 = r0.mo60013c(r10)
            com.google.protobuf.o<?> r0 = r9.f37266o
            com.google.protobuf.r r11 = r0.mo60013c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59994f(java.lang.Object, java.lang.Object):boolean");
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
    public final void mo59995g(java.lang.Object r14, com.google.protobuf.C16905j r15) throws java.io.IOException {
        /*
            r13 = this;
            r15.getClass()
            com.google.protobuf.Writer$FieldOrder r0 = com.google.protobuf.Writer$FieldOrder.ASCENDING
            com.google.protobuf.Writer$FieldOrder r1 = com.google.protobuf.Writer$FieldOrder.DESCENDING
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 1
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            if (r0 != r1) goto L_0x0567
            com.google.protobuf.b1<?, ?> r0 = r13.f37265n
            com.google.protobuf.c1 r1 = r0.mo59851c(r14)
            r0.mo59860l(r1, r15)
            boolean r0 = r13.f37257f
            if (r0 == 0) goto L_0x0061
            com.google.protobuf.o<?> r0 = r13.f37266o
            com.google.protobuf.r r0 = r0.mo60013c(r14)
            boolean r1 = r0.mo60024h()
            if (r1 != 0) goto L_0x0061
            boolean r1 = r0.f37286c
            if (r1 == 0) goto L_0x0047
            com.google.protobuf.w$b r1 = new com.google.protobuf.w$b
            com.google.protobuf.z0<T, java.lang.Object> r0 = r0.f37284a
            com.google.protobuf.z0<K, V>$b r7 = r0.f37325h
            if (r7 != 0) goto L_0x003d
            com.google.protobuf.z0$b r7 = new com.google.protobuf.z0$b
            r7.<init>()
            r0.f37325h = r7
        L_0x003d:
            com.google.protobuf.z0<K, V>$b r0 = r0.f37325h
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x005a
        L_0x0047:
            com.google.protobuf.z0<T, java.lang.Object> r0 = r0.f37284a
            com.google.protobuf.z0<K, V>$b r1 = r0.f37325h
            if (r1 != 0) goto L_0x0054
            com.google.protobuf.z0$b r1 = new com.google.protobuf.z0$b
            r1.<init>()
            r0.f37325h = r1
        L_0x0054:
            com.google.protobuf.z0<K, V>$b r0 = r0.f37325h
            java.util.Iterator r1 = r0.iterator()
        L_0x005a:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0063
        L_0x0061:
            r0 = r6
            r1 = r0
        L_0x0063:
            int[] r7 = r13.f37252a
            int r7 = r7.length
        L_0x0066:
            int r7 = r7 + -3
            if (r7 < 0) goto L_0x0550
            int r8 = r13.mo59986J(r7)
            int[] r9 = r13.f37252a
            r9 = r9[r7]
        L_0x0072:
            if (r0 == 0) goto L_0x008f
            com.google.protobuf.o<?> r10 = r13.f37266o
            r10.mo60011a(r0)
            if (r9 >= 0) goto L_0x008f
            com.google.protobuf.o<?> r10 = r13.f37266o
            r10.mo60017g(r0)
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
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            r15.mo59958h(r9, r10, r8)
            goto L_0x0066
        L_0x00ab:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m28306z(r10, r14)
            r15.mo59966p(r9, r10)
            goto L_0x0066
        L_0x00bb:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59965o(r9, r8)
            goto L_0x0066
        L_0x00cb:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m28306z(r10, r14)
            r15.mo59964n(r9, r10)
            goto L_0x0066
        L_0x00db:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59963m(r9, r8)
            goto L_0x0066
        L_0x00ec:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59954d(r9, r8)
            goto L_0x0066
        L_0x00fd:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59967q(r9, r8)
            goto L_0x0066
        L_0x010e:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r15.mo59952b(r9, r8)
            goto L_0x0066
        L_0x0121:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            r15.mo59961k(r9, r10, r8)
            goto L_0x0066
        L_0x0136:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            m28299M(r9, r8, r15)
            goto L_0x0066
        L_0x0147:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r15.mo59951a(r9, r8)
            goto L_0x0066
        L_0x015e:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59955e(r9, r8)
            goto L_0x0066
        L_0x016f:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m28306z(r10, r14)
            r15.mo59956f(r9, r10)
            goto L_0x0066
        L_0x0180:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m28305y(r10, r14)
            r15.mo59959i(r9, r8)
            goto L_0x0066
        L_0x0191:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m28306z(r10, r14)
            r15.mo59968r(r9, r10)
            goto L_0x0066
        L_0x01a2:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m28306z(r10, r14)
            r15.mo59960j(r9, r10)
            goto L_0x0066
        L_0x01b3:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r15.mo59957g(r8, r9)
            goto L_0x0066
        L_0x01ca:
            boolean r10 = r13.mo60006s(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.lang.Double r8 = (java.lang.Double) r8
            double r10 = r8.doubleValue()
            r15.mo59953c(r9, r10)
            goto L_0x0066
        L_0x01e1:
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            r13.mo59988L(r15, r9, r8, r7)
            goto L_0x0066
        L_0x01ec:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            com.google.protobuf.C16949x0.m28426L(r9, r8, r15, r10)
            goto L_0x0066
        L_0x0201:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28433S(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0212:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28432R(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0223:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28431Q(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0234:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28430P(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0245:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28422H(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0256:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28435U(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0267:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28419E(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0278:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28423I(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0289:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28424J(r9, r8, r15, r4)
            goto L_0x0066
        L_0x029a:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28427M(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ab:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28436V(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02bc:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28428N(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02cd:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28425K(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02de:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28421G(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ef:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28433S(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0300:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28432R(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0311:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28431Q(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0322:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28430P(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0333:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28422H(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0344:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28435U(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0355:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28420F(r9, r8, r15)
            goto L_0x0066
        L_0x0366:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            com.google.protobuf.C16949x0.m28429O(r9, r8, r15, r10)
            goto L_0x0066
        L_0x037b:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28434T(r9, r8, r15)
            goto L_0x0066
        L_0x038c:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28419E(r9, r8, r15, r3)
            goto L_0x0066
        L_0x039d:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28423I(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03ae:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28424J(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03bf:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28427M(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03d0:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28436V(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03e1:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28428N(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03f2:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28425K(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0403:
            int[] r9 = r13.f37252a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C16949x0.m28421G(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0414:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            r15.mo59958h(r9, r10, r8)
            goto L_0x0066
        L_0x0429:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.protobuf.C16889f1.m28156n(r10, r14)
            r15.mo59966p(r9, r10)
            goto L_0x0066
        L_0x043a:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59965o(r9, r8)
            goto L_0x0066
        L_0x044b:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.protobuf.C16889f1.m28156n(r10, r14)
            r15.mo59964n(r9, r10)
            goto L_0x0066
        L_0x045c:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59963m(r9, r8)
            goto L_0x0066
        L_0x046d:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59954d(r9, r8)
            goto L_0x0066
        L_0x047e:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59967q(r9, r8)
            goto L_0x0066
        L_0x048f:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r15.mo59952b(r9, r8)
            goto L_0x0066
        L_0x04a2:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            com.google.protobuf.w0 r10 = r13.mo60001n(r7)
            r15.mo59961k(r9, r10, r8)
            goto L_0x0066
        L_0x04b7:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = com.google.protobuf.C16889f1.m28157o(r10, r14)
            m28299M(r9, r8, r15)
            goto L_0x0066
        L_0x04c8:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            boolean r8 = com.google.protobuf.C16889f1.m28148f(r10, r14)
            r15.mo59951a(r9, r8)
            goto L_0x0066
        L_0x04d9:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59955e(r9, r8)
            goto L_0x0066
        L_0x04ea:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.protobuf.C16889f1.m28156n(r10, r14)
            r15.mo59956f(r9, r10)
            goto L_0x0066
        L_0x04fb:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = com.google.protobuf.C16889f1.m28155m(r10, r14)
            r15.mo59959i(r9, r8)
            goto L_0x0066
        L_0x050c:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.protobuf.C16889f1.m28156n(r10, r14)
            r15.mo59968r(r9, r10)
            goto L_0x0066
        L_0x051d:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = com.google.protobuf.C16889f1.m28156n(r10, r14)
            r15.mo59960j(r9, r10)
            goto L_0x0066
        L_0x052e:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            float r8 = com.google.protobuf.C16889f1.m28154l(r10, r14)
            r15.mo59957g(r8, r9)
            goto L_0x0066
        L_0x053f:
            boolean r10 = r13.mo60005r(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            double r10 = com.google.protobuf.C16889f1.m28153k(r10, r14)
            r15.mo59953c(r9, r10)
            goto L_0x0066
        L_0x0550:
            if (r0 == 0) goto L_0x0a98
            com.google.protobuf.o<?> r14 = r13.f37266o
            r14.mo60017g(r0)
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
            boolean r0 = r13.f37258g
            if (r0 == 0) goto L_0x0a95
            boolean r0 = r13.f37257f
            if (r0 == 0) goto L_0x0586
            com.google.protobuf.o<?> r0 = r13.f37266o
            com.google.protobuf.r r0 = r0.mo60013c(r14)
            boolean r1 = r0.mo60024h()
            if (r1 != 0) goto L_0x0586
            java.util.Iterator r0 = r0.mo60027k()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0588
        L_0x0586:
            r0 = r6
            r1 = r0
        L_0x0588:
            int[] r7 = r13.f37252a
            int r7 = r7.length
            r8 = r3
        L_0x058c:
            if (r8 >= r7) goto L_0x0a75
            int r9 = r13.mo59986J(r8)
            int[] r10 = r13.f37252a
            r10 = r10[r8]
        L_0x0596:
            if (r1 == 0) goto L_0x05b3
            com.google.protobuf.o<?> r11 = r13.f37266o
            r11.mo60011a(r1)
            if (r10 < 0) goto L_0x05b3
            com.google.protobuf.o<?> r11 = r13.f37266o
            r11.mo60017g(r1)
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
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            r15.mo59958h(r10, r11, r9)
            goto L_0x0a71
        L_0x05d1:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m28306z(r11, r14)
            r15.mo59966p(r10, r11)
            goto L_0x0a71
        L_0x05e2:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59965o(r10, r9)
            goto L_0x0a71
        L_0x05f3:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m28306z(r11, r14)
            r15.mo59964n(r10, r11)
            goto L_0x0a71
        L_0x0604:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59963m(r10, r9)
            goto L_0x0a71
        L_0x0615:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59954d(r10, r9)
            goto L_0x0a71
        L_0x0626:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59967q(r10, r9)
            goto L_0x0a71
        L_0x0637:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.ByteString r9 = (com.google.protobuf.ByteString) r9
            r15.mo59952b(r10, r9)
            goto L_0x0a71
        L_0x064a:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            r15.mo59961k(r10, r11, r9)
            goto L_0x0a71
        L_0x065f:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            m28299M(r10, r9, r15)
            goto L_0x0a71
        L_0x0670:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15.mo59951a(r10, r9)
            goto L_0x0a71
        L_0x0687:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59955e(r10, r9)
            goto L_0x0a71
        L_0x0698:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m28306z(r11, r14)
            r15.mo59956f(r10, r11)
            goto L_0x0a71
        L_0x06a9:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m28305y(r11, r14)
            r15.mo59959i(r10, r9)
            goto L_0x0a71
        L_0x06ba:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m28306z(r11, r14)
            r15.mo59968r(r10, r11)
            goto L_0x0a71
        L_0x06cb:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m28306z(r11, r14)
            r15.mo59960j(r10, r11)
            goto L_0x0a71
        L_0x06dc:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r15.mo59957g(r9, r10)
            goto L_0x0a71
        L_0x06f3:
            boolean r11 = r13.mo60006s(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            r15.mo59953c(r10, r11)
            goto L_0x0a71
        L_0x070a:
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            r13.mo59988L(r15, r10, r9, r8)
            goto L_0x0a71
        L_0x0715:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            com.google.protobuf.C16949x0.m28426L(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x072a:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28433S(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x073b:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28432R(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x074c:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28431Q(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x075d:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28430P(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x076e:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28422H(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x077f:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28435U(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0790:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28419E(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07a1:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28423I(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07b2:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28424J(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07c3:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28427M(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07d4:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28436V(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07e5:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28428N(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07f6:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28425K(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0807:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28421G(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0818:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28433S(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x0829:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28432R(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x083a:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28431Q(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x084b:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28430P(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x085c:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28422H(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x086d:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28435U(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x087e:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28420F(r10, r9, r15)
            goto L_0x0a71
        L_0x088f:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            com.google.protobuf.C16949x0.m28429O(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x08a4:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28434T(r10, r9, r15)
            goto L_0x0a71
        L_0x08b5:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28419E(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08c6:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28423I(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08d7:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28424J(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08e8:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28427M(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08f9:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28436V(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x090a:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28428N(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x091b:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28425K(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x092c:
            int[] r10 = r13.f37252a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C16949x0.m28421G(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x093d:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            r15.mo59958h(r10, r11, r9)
            goto L_0x0a71
        L_0x0952:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.protobuf.C16889f1.m28156n(r11, r14)
            r15.mo59966p(r10, r11)
            goto L_0x0a71
        L_0x0963:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59965o(r10, r9)
            goto L_0x0a71
        L_0x0974:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.protobuf.C16889f1.m28156n(r11, r14)
            r15.mo59964n(r10, r11)
            goto L_0x0a71
        L_0x0985:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59963m(r10, r9)
            goto L_0x0a71
        L_0x0996:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59954d(r10, r9)
            goto L_0x0a71
        L_0x09a7:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59967q(r10, r9)
            goto L_0x0a71
        L_0x09b8:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.ByteString r9 = (com.google.protobuf.ByteString) r9
            r15.mo59952b(r10, r9)
            goto L_0x0a71
        L_0x09cb:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            com.google.protobuf.w0 r11 = r13.mo60001n(r8)
            r15.mo59961k(r10, r11, r9)
            goto L_0x0a71
        L_0x09e0:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = com.google.protobuf.C16889f1.m28157o(r11, r14)
            m28299M(r10, r9, r15)
            goto L_0x0a71
        L_0x09f1:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            boolean r9 = com.google.protobuf.C16889f1.m28148f(r11, r14)
            r15.mo59951a(r10, r9)
            goto L_0x0a71
        L_0x0a02:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59955e(r10, r9)
            goto L_0x0a71
        L_0x0a12:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.protobuf.C16889f1.m28156n(r11, r14)
            r15.mo59956f(r10, r11)
            goto L_0x0a71
        L_0x0a22:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = com.google.protobuf.C16889f1.m28155m(r11, r14)
            r15.mo59959i(r10, r9)
            goto L_0x0a71
        L_0x0a32:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.protobuf.C16889f1.m28156n(r11, r14)
            r15.mo59968r(r10, r11)
            goto L_0x0a71
        L_0x0a42:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = com.google.protobuf.C16889f1.m28156n(r11, r14)
            r15.mo59960j(r10, r11)
            goto L_0x0a71
        L_0x0a52:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            float r9 = com.google.protobuf.C16889f1.m28154l(r11, r14)
            r15.mo59957g(r9, r10)
            goto L_0x0a71
        L_0x0a62:
            boolean r11 = r13.mo60005r(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            double r11 = com.google.protobuf.C16889f1.m28153k(r11, r14)
            r15.mo59953c(r10, r11)
        L_0x0a71:
            int r8 = r8 + 3
            goto L_0x058c
        L_0x0a75:
            if (r1 == 0) goto L_0x0a8b
            com.google.protobuf.o<?> r2 = r13.f37266o
            r2.mo60017g(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a89
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a75
        L_0x0a89:
            r1 = r6
            goto L_0x0a75
        L_0x0a8b:
            com.google.protobuf.b1<?, ?> r0 = r13.f37265n
            com.google.protobuf.c1 r14 = r0.mo59851c(r14)
            r0.mo59860l(r14, r15)
            goto L_0x0a98
        L_0x0a95:
            r13.mo59987K(r14, r15)
        L_0x0a98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo59995g(java.lang.Object, com.google.protobuf.j):void");
    }

    /* renamed from: h */
    public final void mo59996h(T t, byte[] bArr, int i, int i2, C16881e.C16882a aVar) throws IOException {
        if (this.f37258g) {
            mo59981D(t, bArr, i, i2, aVar);
        } else {
            mo59980C(t, bArr, i, i2, 0, aVar);
        }
    }

    /* renamed from: i */
    public final boolean mo59997i(int i, Object obj, Object obj2) {
        return mo60005r(i, obj) == mo60005r(i, obj2);
    }

    /* renamed from: k */
    public final <UT, UB> UB mo59998k(Object obj, int i, UB ub, C16871b1<UT, UB> b1Var) {
        C16935v.C16938c l;
        int i2 = this.f37252a[i];
        Object o = C16889f1.m28157o((long) (mo59986J(i) & 1048575), obj);
        if (o == null || (l = mo59999l(i)) == null) {
            return ub;
        }
        MapFieldLite c = this.f37267p.mo59878c(o);
        C16878d0.C16879a<?, ?> b = this.f37267p.mo59877b(mo60000m(i));
        Iterator it = c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!l.mo55639a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = b1Var.mo59856h();
                }
                ByteString.C16817g newCodedBuilder = ByteString.newCodedBuilder(C16878d0.m28068a(b, entry.getKey(), entry.getValue()));
                try {
                    C16878d0.m28069b(newCodedBuilder.f37133a, b, entry.getKey(), entry.getValue());
                    if (newCodedBuilder.f37133a.mo59732V() == 0) {
                        b1Var.mo59849a(ub, i2, new ByteString.LiteralByteString(newCodedBuilder.f37134b));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: l */
    public final C16935v.C16938c mo59999l(int i) {
        return (C16935v.C16938c) this.f37253b[((i / 3) * 2) + 1];
    }

    /* renamed from: m */
    public final Object mo60000m(int i) {
        return this.f37253b[(i / 3) * 2];
    }

    /* renamed from: n */
    public final C16947w0 mo60001n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f37253b;
        C16947w0 w0Var = (C16947w0) objArr[i2];
        if (w0Var != null) {
            return w0Var;
        }
        C16947w0 a = C16932t0.f37292c.mo60039a((Class) objArr[i2 + 1]);
        this.f37253b[i2] = a;
        return a;
    }

    public final T newInstance() {
        return this.f37263l.mo60018a(this.f37256e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0338, code lost:
        r4 = android.support.p013v4.media.C0069a.m171b(r7, r6, r1, r4);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo60003p(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f37251r
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.f37252a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x0506
            int r6 = r14.mo59986J(r3)
            int[] r7 = r14.f37252a
            r8 = r7[r3]
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = r9 & r6
            int r9 = r9 >>> 20
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r12 = r7 >>> 20
            int r11 = r11 << r12
            if (r10 == r2) goto L_0x0054
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0054
        L_0x0036:
            boolean r7 = r14.f37259h
            if (r7 == 0) goto L_0x0052
            com.google.protobuf.FieldType r7 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r7 = r7.mo59737id()
            if (r9 < r7) goto L_0x0052
            com.google.protobuf.FieldType r7 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r7 = r7.mo59737id()
            if (r9 > r7) goto L_0x0052
            int[] r7 = r14.f37252a
            int r10 = r3 + 2
            r7 = r7[r10]
            r7 = r7 & r1
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            r11 = 0
        L_0x0054:
            r1 = r1 & r6
            long r12 = (long) r1
            switch(r9) {
                case 0: goto L_0x04f6;
                case 1: goto L_0x04ed;
                case 2: goto L_0x04e0;
                case 3: goto L_0x04d3;
                case 4: goto L_0x04c6;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04b4;
                case 7: goto L_0x04ab;
                case 8: goto L_0x0491;
                case 9: goto L_0x047f;
                case 10: goto L_0x046f;
                case 11: goto L_0x0461;
                case 12: goto L_0x0453;
                case 13: goto L_0x0449;
                case 14: goto L_0x043f;
                case 15: goto L_0x0431;
                case 16: goto L_0x0423;
                case 17: goto L_0x040f;
                case 18: goto L_0x0403;
                case 19: goto L_0x03f7;
                case 20: goto L_0x03eb;
                case 21: goto L_0x03df;
                case 22: goto L_0x03d3;
                case 23: goto L_0x03c7;
                case 24: goto L_0x03bb;
                case 25: goto L_0x03af;
                case 26: goto L_0x03a3;
                case 27: goto L_0x0393;
                case 28: goto L_0x0387;
                case 29: goto L_0x037b;
                case 30: goto L_0x036f;
                case 31: goto L_0x0363;
                case 32: goto L_0x0357;
                case 33: goto L_0x034b;
                case 34: goto L_0x033f;
                case 35: goto L_0x031c;
                case 36: goto L_0x02ff;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02c5;
                case 39: goto L_0x02a7;
                case 40: goto L_0x0289;
                case 41: goto L_0x026b;
                case 42: goto L_0x024d;
                case 43: goto L_0x022f;
                case 44: goto L_0x0211;
                case 45: goto L_0x01f3;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01b7;
                case 48: goto L_0x0199;
                case 49: goto L_0x0189;
                case 50: goto L_0x0179;
                case 51: goto L_0x016d;
                case 52: goto L_0x0161;
                case 53: goto L_0x0151;
                case 54: goto L_0x0141;
                case 55: goto L_0x0131;
                case 56: goto L_0x0125;
                case 57: goto L_0x0119;
                case 58: goto L_0x010d;
                case 59: goto L_0x00ef;
                case 60: goto L_0x00db;
                case 61: goto L_0x00c9;
                case 62: goto L_0x00b9;
                case 63: goto L_0x00a9;
                case 64: goto L_0x009d;
                case 65: goto L_0x0091;
                case 66: goto L_0x0081;
                case 67: goto L_0x0071;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x04ff
        L_0x005b:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.j0 r1 = (com.google.protobuf.C16906j0) r1
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.CodedOutputStream.m27885j(r8, r1, r6)
            goto L_0x04fe
        L_0x0071:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            long r6 = m28306z(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27893r(r8, r6)
            goto L_0x04fe
        L_0x0081:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = m28305y(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27892q(r8, r1)
            goto L_0x04fe
        L_0x0091:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27891p(r8)
            goto L_0x04fe
        L_0x009d:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27890o(r8)
            goto L_0x04fe
        L_0x00a9:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = m28305y(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27881f(r8, r1)
            goto L_0x04fe
        L_0x00b9:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = m28305y(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27897v(r8, r1)
            goto L_0x04fe
        L_0x00c9:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27879d(r8, r1)
            goto L_0x04fe
        L_0x00db:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.C16949x0.m28451o(r8, r6, r1)
            goto L_0x04fe
        L_0x00ef:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.protobuf.ByteString
            if (r6 == 0) goto L_0x0105
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27879d(r8, r1)
            goto L_0x04fe
        L_0x0105:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27894s(r8, r1)
            goto L_0x04fe
        L_0x010d:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27878c(r8)
            goto L_0x04fe
        L_0x0119:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27882g(r8)
            goto L_0x04fe
        L_0x0125:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27883h(r8)
            goto L_0x04fe
        L_0x0131:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = m28305y(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27886k(r8, r1)
            goto L_0x04fe
        L_0x0141:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            long r6 = m28306z(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27899x(r8, r6)
            goto L_0x04fe
        L_0x0151:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            long r6 = m28306z(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m27888m(r8, r6)
            goto L_0x04fe
        L_0x0161:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27884i(r8)
            goto L_0x04fe
        L_0x016d:
            boolean r1 = r14.mo60006s(r8, r3, r15)
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27880e(r8)
            goto L_0x04fe
        L_0x0179:
            com.google.protobuf.e0 r1 = r14.f37267p
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.lang.Object r7 = r14.mo60000m(r3)
            int r1 = r1.mo59882g(r8, r6, r7)
            goto L_0x04fe
        L_0x0189:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.C16949x0.m28446j(r8, r1, r6)
            goto L_0x04fe
        L_0x0199:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28456t(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x01ad
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01ad:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x01b7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28454r(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x01cb
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01cb:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x01d5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28445i(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x01e9
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01e9:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x01f3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28443g(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0207
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0207:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x0211:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28441e(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0225
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0225:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x022f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28459w(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0243
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0243:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x024d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28438b(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0261
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0261:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x026b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28443g(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x027f
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x027f:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28445i(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x029d
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x029d:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x02a7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28448l(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x02bb
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02bb:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x02c5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28461y(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x02d9
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02d9:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x02e2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28450n(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x02f6
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02f6:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x02ff:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28443g(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0313
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0313:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
            goto L_0x0338
        L_0x031c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28445i(r1)
            if (r1 <= 0) goto L_0x04ff
            boolean r6 = r14.f37259h
            if (r6 == 0) goto L_0x0330
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0330:
            int r6 = com.google.protobuf.CodedOutputStream.m27896u(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m27898w(r1)
        L_0x0338:
            int r1 = android.support.p013v4.media.C0069a.m171b(r7, r6, r1, r4)
            r4 = r1
            goto L_0x04ff
        L_0x033f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28455s(r8, r1)
            goto L_0x04fe
        L_0x034b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28453q(r8, r1)
            goto L_0x04fe
        L_0x0357:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28444h(r8, r1)
            goto L_0x04fe
        L_0x0363:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28442f(r8, r1)
            goto L_0x04fe
        L_0x036f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28440d(r8, r1)
            goto L_0x04fe
        L_0x037b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28458v(r8, r1)
            goto L_0x04fe
        L_0x0387:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28439c(r8, r1)
            goto L_0x04fe
        L_0x0393:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.C16949x0.m28452p(r8, r1, r6)
            goto L_0x04fe
        L_0x03a3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28457u(r8, r1)
            goto L_0x04fe
        L_0x03af:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28437a(r8, r1)
            goto L_0x04fe
        L_0x03bb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28442f(r8, r1)
            goto L_0x04fe
        L_0x03c7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28444h(r8, r1)
            goto L_0x04fe
        L_0x03d3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28447k(r8, r1)
            goto L_0x04fe
        L_0x03df:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28460x(r8, r1)
            goto L_0x04fe
        L_0x03eb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28449m(r8, r1)
            goto L_0x04fe
        L_0x03f7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28442f(r8, r1)
            goto L_0x04fe
        L_0x0403:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C16949x0.m28444h(r8, r1)
            goto L_0x04fe
        L_0x040f:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.j0 r1 = (com.google.protobuf.C16906j0) r1
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.CodedOutputStream.m27885j(r8, r1, r6)
            goto L_0x04fe
        L_0x0423:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27893r(r8, r6)
            goto L_0x04fe
        L_0x0431:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27892q(r8, r1)
            goto L_0x04fe
        L_0x043f:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27891p(r8)
            goto L_0x04fe
        L_0x0449:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27890o(r8)
            goto L_0x04fe
        L_0x0453:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27881f(r8, r1)
            goto L_0x04fe
        L_0x0461:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27897v(r8, r1)
            goto L_0x04fe
        L_0x046f:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27879d(r8, r1)
            goto L_0x04fe
        L_0x047f:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.w0 r6 = r14.mo60001n(r3)
            int r1 = com.google.protobuf.C16949x0.m28451o(r8, r6, r1)
            goto L_0x04fe
        L_0x0491:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.protobuf.ByteString
            if (r6 == 0) goto L_0x04a4
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27879d(r8, r1)
            goto L_0x04fe
        L_0x04a4:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.google.protobuf.CodedOutputStream.m27894s(r8, r1)
            goto L_0x04fe
        L_0x04ab:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27878c(r8)
            goto L_0x04fe
        L_0x04b4:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27882g(r8)
            goto L_0x04fe
        L_0x04bd:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27883h(r8)
            goto L_0x04fe
        L_0x04c6:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27886k(r8, r1)
            goto L_0x04fe
        L_0x04d3:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27899x(r8, r6)
            goto L_0x04fe
        L_0x04e0:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m27888m(r8, r6)
            goto L_0x04fe
        L_0x04ed:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27884i(r8)
            goto L_0x04fe
        L_0x04f6:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04ff
            int r1 = com.google.protobuf.CodedOutputStream.m27880e(r8)
        L_0x04fe:
            int r4 = r4 + r1
        L_0x04ff:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0506:
            com.google.protobuf.b1<?, ?> r0 = r14.f37265n
            com.google.protobuf.c1 r1 = r0.mo59851c(r15)
            int r0 = r0.mo59852d(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f37257f
            if (r1 == 0) goto L_0x0520
            com.google.protobuf.o<?> r1 = r14.f37266o
            com.google.protobuf.r r15 = r1.mo60013c(r15)
            int r15 = r15.mo60023g()
            int r0 = r0 + r15
        L_0x0520:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo60003p(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo60004q(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f37251r
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f37252a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e2
            int r4 = r11.mo59986J(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f37252a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            com.google.protobuf.FieldType r4 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r4 = r4.mo59737id()
            if (r5 < r4) goto L_0x0034
            com.google.protobuf.FieldType r4 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r4 = r4.mo59737id()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f37252a
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
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.j0 r4 = (com.google.protobuf.C16906j0) r4
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.CodedOutputStream.m27885j(r6, r4, r5)
            goto L_0x04dd
        L_0x0050:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m28306z(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27893r(r6, r4)
            goto L_0x04dd
        L_0x0060:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m28305y(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27892q(r6, r4)
            goto L_0x04dd
        L_0x0070:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27891p(r6)
            goto L_0x04dd
        L_0x007c:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27890o(r6)
            goto L_0x04dd
        L_0x0088:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m28305y(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27881f(r6, r4)
            goto L_0x04dd
        L_0x0098:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m28305y(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27897v(r6, r4)
            goto L_0x04dd
        L_0x00a8:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27879d(r6, r4)
            goto L_0x04dd
        L_0x00ba:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.C16949x0.m28451o(r6, r5, r4)
            goto L_0x04dd
        L_0x00ce:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            boolean r5 = r4 instanceof com.google.protobuf.ByteString
            if (r5 == 0) goto L_0x00e4
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27879d(r6, r4)
            goto L_0x04dd
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27894s(r6, r4)
            goto L_0x04dd
        L_0x00ec:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27878c(r6)
            goto L_0x04dd
        L_0x00f8:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27882g(r6)
            goto L_0x04dd
        L_0x0104:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27883h(r6)
            goto L_0x04dd
        L_0x0110:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m28305y(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27886k(r6, r4)
            goto L_0x04dd
        L_0x0120:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m28306z(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27899x(r6, r4)
            goto L_0x04dd
        L_0x0130:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m28306z(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27888m(r6, r4)
            goto L_0x04dd
        L_0x0140:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27884i(r6)
            goto L_0x04dd
        L_0x014c:
            boolean r4 = r11.mo60006s(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27880e(r6)
            goto L_0x04dd
        L_0x0158:
            com.google.protobuf.e0 r4 = r11.f37267p
            java.lang.Object r5 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            java.lang.Object r7 = r11.mo60000m(r2)
            int r4 = r4.mo59882g(r6, r5, r7)
            goto L_0x04dd
        L_0x0168:
            java.util.List r4 = m28302t(r8, r12)
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.C16949x0.m28446j(r6, r4, r5)
            goto L_0x04dd
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28456t(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28454r(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28445i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28443g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28441e(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28459w(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28438b(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28443g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28445i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28448l(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28461y(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28450n(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28443g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C16949x0.m28445i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f37259h
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = com.google.protobuf.CodedOutputStream.m27896u(r6)
            int r6 = com.google.protobuf.CodedOutputStream.m27898w(r5)
        L_0x0315:
            int r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3)
            goto L_0x04de
        L_0x031b:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28455s(r6, r4)
            goto L_0x04dd
        L_0x0325:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28453q(r6, r4)
            goto L_0x04dd
        L_0x032f:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28444h(r6, r4)
            goto L_0x04dd
        L_0x0339:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28442f(r6, r4)
            goto L_0x04dd
        L_0x0343:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28440d(r6, r4)
            goto L_0x04dd
        L_0x034d:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28458v(r6, r4)
            goto L_0x04dd
        L_0x0357:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28439c(r6, r4)
            goto L_0x04dd
        L_0x0361:
            java.util.List r4 = m28302t(r8, r12)
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.C16949x0.m28452p(r6, r4, r5)
            goto L_0x04dd
        L_0x036f:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28457u(r6, r4)
            goto L_0x04dd
        L_0x0379:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28437a(r6, r4)
            goto L_0x04dd
        L_0x0383:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28442f(r6, r4)
            goto L_0x04dd
        L_0x038d:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28444h(r6, r4)
            goto L_0x04dd
        L_0x0397:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28447k(r6, r4)
            goto L_0x04dd
        L_0x03a1:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28460x(r6, r4)
            goto L_0x04dd
        L_0x03ab:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28449m(r6, r4)
            goto L_0x04dd
        L_0x03b5:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28442f(r6, r4)
            goto L_0x04dd
        L_0x03bf:
            java.util.List r4 = m28302t(r8, r12)
            int r4 = com.google.protobuf.C16949x0.m28444h(r6, r4)
            goto L_0x04dd
        L_0x03c9:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.j0 r4 = (com.google.protobuf.C16906j0) r4
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.CodedOutputStream.m27885j(r6, r4, r5)
            goto L_0x04dd
        L_0x03df:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.protobuf.C16889f1.m28156n(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27893r(r6, r4)
            goto L_0x04dd
        L_0x03ef:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.C16889f1.m28155m(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27892q(r6, r4)
            goto L_0x04dd
        L_0x03ff:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27891p(r6)
            goto L_0x04dd
        L_0x040b:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27890o(r6)
            goto L_0x04dd
        L_0x0417:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.C16889f1.m28155m(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27881f(r6, r4)
            goto L_0x04dd
        L_0x0427:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.C16889f1.m28155m(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27897v(r6, r4)
            goto L_0x04dd
        L_0x0437:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27879d(r6, r4)
            goto L_0x04dd
        L_0x0449:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            com.google.protobuf.w0 r5 = r11.mo60001n(r2)
            int r4 = com.google.protobuf.C16949x0.m28451o(r6, r5, r4)
            goto L_0x04dd
        L_0x045d:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = com.google.protobuf.C16889f1.m28157o(r8, r12)
            boolean r5 = r4 instanceof com.google.protobuf.ByteString
            if (r5 == 0) goto L_0x0473
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27879d(r6, r4)
            goto L_0x04dd
        L_0x0473:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.protobuf.CodedOutputStream.m27894s(r6, r4)
            goto L_0x04dd
        L_0x047a:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27878c(r6)
            goto L_0x04dd
        L_0x0485:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27882g(r6)
            goto L_0x04dd
        L_0x0490:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27883h(r6)
            goto L_0x04dd
        L_0x049b:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.C16889f1.m28155m(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27886k(r6, r4)
            goto L_0x04dd
        L_0x04aa:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.protobuf.C16889f1.m28156n(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27899x(r6, r4)
            goto L_0x04dd
        L_0x04b9:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = com.google.protobuf.C16889f1.m28156n(r8, r12)
            int r4 = com.google.protobuf.CodedOutputStream.m27888m(r6, r4)
            goto L_0x04dd
        L_0x04c8:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27884i(r6)
            goto L_0x04dd
        L_0x04d3:
            boolean r4 = r11.mo60005r(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = com.google.protobuf.CodedOutputStream.m27880e(r6)
        L_0x04dd:
            int r3 = r3 + r4
        L_0x04de:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e2:
            com.google.protobuf.b1<?, ?> r0 = r11.f37265n
            com.google.protobuf.c1 r12 = r0.mo59851c(r12)
            int r12 = r0.mo59852d(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16913m0.mo60004q(java.lang.Object):int");
    }

    /* renamed from: r */
    public final boolean mo60005r(int i, Object obj) {
        boolean equals;
        int i2 = this.f37252a[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & C16889f1.m28155m(j, obj)) != 0;
        }
        int J = mo59986J(i);
        long j2 = (long) (J & 1048575);
        switch ((J & 267386880) >>> 20) {
            case 0:
                return C16889f1.m28153k(j2, obj) != ShadowDrawableWrapper.COS_45;
            case 1:
                return C16889f1.m28154l(j2, obj) != 0.0f;
            case 2:
                return C16889f1.m28156n(j2, obj) != 0;
            case 3:
                return C16889f1.m28156n(j2, obj) != 0;
            case 4:
                return C16889f1.m28155m(j2, obj) != 0;
            case 5:
                return C16889f1.m28156n(j2, obj) != 0;
            case 6:
                return C16889f1.m28155m(j2, obj) != 0;
            case 7:
                return C16889f1.m28148f(j2, obj);
            case 8:
                Object o = C16889f1.m28157o(j2, obj);
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
                return C16889f1.m28157o(j2, obj) != null;
            case 10:
                equals = ByteString.EMPTY.equals(C16889f1.m28157o(j2, obj));
                break;
            case 11:
                return C16889f1.m28155m(j2, obj) != 0;
            case 12:
                return C16889f1.m28155m(j2, obj) != 0;
            case 13:
                return C16889f1.m28155m(j2, obj) != 0;
            case 14:
                return C16889f1.m28156n(j2, obj) != 0;
            case 15:
                return C16889f1.m28155m(j2, obj) != 0;
            case 16:
                return C16889f1.m28156n(j2, obj) != 0;
            case 17:
                return C16889f1.m28157o(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    /* renamed from: s */
    public final boolean mo60006s(int i, int i2, Object obj) {
        return C16889f1.m28155m((long) (this.f37252a[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: u */
    public final void mo60007u(int i, Object obj, Object obj2) {
        long J = (long) (mo59986J(i) & 1048575);
        if (mo60005r(i, obj2)) {
            Object o = C16889f1.m28157o(J, obj);
            Object o2 = C16889f1.m28157o(J, obj2);
            if (o != null && o2 != null) {
                C16889f1.m28167y(J, obj, C16935v.m28395b(o, o2));
                mo59983G(i, obj);
            } else if (o2 != null) {
                C16889f1.m28167y(J, obj, o2);
                mo59983G(i, obj);
            }
        }
    }

    /* renamed from: v */
    public final void mo60008v(int i, Object obj, Object obj2) {
        int J = mo59986J(i);
        int i2 = this.f37252a[i];
        long j = (long) (J & 1048575);
        if (mo60006s(i2, i, obj2)) {
            Object obj3 = null;
            if (mo60006s(i2, i, obj)) {
                obj3 = C16889f1.m28157o(j, obj);
            }
            Object o = C16889f1.m28157o(j, obj2);
            if (obj3 != null && o != null) {
                C16889f1.m28167y(j, obj, C16935v.m28395b(obj3, o));
                mo59984H(i2, i, obj);
            } else if (o != null) {
                C16889f1.m28167y(j, obj, o);
                mo59984H(i2, i, obj);
            }
        }
    }
}
