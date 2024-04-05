package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2571e;
import androidx.datastore.preferences.protobuf.C2573e0;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003a2.C0023f;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.n0 */
public final class C2609n0<T> implements C2642y0<T> {

    /* renamed from: r */
    public static final int[] f5922r = new int[0];

    /* renamed from: s */
    public static final Unsafe f5923s = C2586h1.m5837p();

    /* renamed from: a */
    public final int[] f5924a;

    /* renamed from: b */
    public final Object[] f5925b;

    /* renamed from: c */
    public final int f5926c;

    /* renamed from: d */
    public final int f5927d;

    /* renamed from: e */
    public final C2602k0 f5928e;

    /* renamed from: f */
    public final boolean f5929f;

    /* renamed from: g */
    public final boolean f5930g;

    /* renamed from: h */
    public final boolean f5931h;

    /* renamed from: i */
    public final boolean f5932i;

    /* renamed from: j */
    public final int[] f5933j;

    /* renamed from: k */
    public final int f5934k;

    /* renamed from: l */
    public final int f5935l;

    /* renamed from: m */
    public final C2615p0 f5936m;

    /* renamed from: n */
    public final C2551b0 f5937n;

    /* renamed from: o */
    public final C2570d1<?, ?> f5938o;

    /* renamed from: p */
    public final C2614p<?> f5939p;

    /* renamed from: q */
    public final C2577f0 f5940q;

    /* renamed from: androidx.datastore.preferences.protobuf.n0$a */
    public static /* synthetic */ class C2610a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5941a;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5941a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f5941a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.C2610a.<clinit>():void");
        }
    }

    public C2609n0(int[] iArr, Object[] objArr, int i, int i2, C2602k0 k0Var, boolean z, int[] iArr2, int i3, int i4, C2615p0 p0Var, C2551b0 b0Var, C2570d1 d1Var, C2614p pVar, C2577f0 f0Var) {
        this.f5924a = iArr;
        this.f5925b = objArr;
        this.f5926c = i;
        this.f5927d = i2;
        this.f5930g = k0Var instanceof GeneratedMessageLite;
        this.f5931h = z;
        this.f5929f = pVar != null && pVar.mo9869e(k0Var);
        this.f5932i = false;
        this.f5933j = iArr2;
        this.f5934k = i3;
        this.f5935l = i4;
        this.f5936m = p0Var;
        this.f5937n = b0Var;
        this.f5938o = d1Var;
        this.f5939p = pVar;
        this.f5928e = k0Var;
        this.f5940q = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x039b  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> androidx.datastore.preferences.protobuf.C2609n0<T> m6164A(androidx.datastore.preferences.protobuf.C2636w0 r34, androidx.datastore.preferences.protobuf.C2615p0 r35, androidx.datastore.preferences.protobuf.C2551b0 r36, androidx.datastore.preferences.protobuf.C2570d1<?, ?> r37, androidx.datastore.preferences.protobuf.C2614p<?> r38, androidx.datastore.preferences.protobuf.C2577f0 r39) {
        /*
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r34.mo9619c()
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo9911e()
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
            int[] r8 = f5922r
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
            sun.misc.Unsafe r9 = f5923s
            java.lang.Object[] r18 = r34.mo9910d()
            androidx.datastore.preferences.protobuf.k0 r19 = r34.mo9618b()
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
            java.lang.reflect.Field r8 = m6168N(r6, r8)
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
            java.lang.reflect.Field r8 = m6168N(r6, r8)
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
            java.lang.reflect.Field r8 = m6168N(r6, r8)
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
            java.lang.reflect.Field r8 = m6168N(r6, r8)
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
            androidx.datastore.preferences.protobuf.n0 r0 = new androidx.datastore.preferences.protobuf.n0
            androidx.datastore.preferences.protobuf.k0 r9 = r34.mo9618b()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.m6164A(androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.f0):androidx.datastore.preferences.protobuf.n0");
    }

    /* renamed from: B */
    public static long m6165B(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: C */
    public static int m6166C(long j, Object obj) {
        return ((Integer) C2586h1.m5836o(j, obj)).intValue();
    }

    /* renamed from: D */
    public static long m6167D(long j, Object obj) {
        return ((Long) C2586h1.m5836o(j, obj)).longValue();
    }

    /* renamed from: N */
    public static Field m6168N(Class<?> cls, String str) {
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

    /* renamed from: R */
    public static int m6169R(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: V */
    public static void m6170V(int i, Object obj, C2601k kVar) throws IOException {
        if (obj instanceof String) {
            kVar.f5918a.mo9430P(i, (String) obj);
            return;
        }
        kVar.mo9799b(i, (ByteString) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6171k(byte[] r1, int r2, int r3, androidx.datastore.preferences.protobuf.WireFormat$FieldType r4, java.lang.Class r5, androidx.datastore.preferences.protobuf.C2571e.C2572a r6) throws java.io.IOException {
        /*
            int[] r0 = androidx.datastore.preferences.protobuf.C2609n0.C2610a.f5941a
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
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5740E(r1, r2, r6)
            goto L_0x00b5
        L_0x0019:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r1, r2, r6)
            long r2 = r6.f5850b
            long r2 = androidx.datastore.preferences.protobuf.C2592i.m5902c(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f5851c = r2
            goto L_0x00b5
        L_0x002b:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r1, r2, r6)
            int r2 = r6.f5849a
            int r2 = androidx.datastore.preferences.protobuf.C2592i.m5901b(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f5851c = r2
            goto L_0x00b5
        L_0x003d:
            androidx.datastore.preferences.protobuf.u0 r4 = androidx.datastore.preferences.protobuf.C2628u0.f5965c
            androidx.datastore.preferences.protobuf.y0 r4 = r4.mo9895a(r5)
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5762o(r4, r1, r2, r3, r6)
            goto L_0x00b5
        L_0x0049:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r1, r2, r6)
            long r2 = r6.f5850b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f5851c = r2
            goto L_0x00b5
        L_0x0056:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r1, r2, r6)
            int r2 = r6.f5849a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f5851c = r2
            goto L_0x00b5
        L_0x0063:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5754g(r2, r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f5851c = r1
            goto L_0x0087
        L_0x0072:
            long r3 = androidx.datastore.preferences.protobuf.C2571e.m5756i(r2, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f5851c = r1
            goto L_0x0098
        L_0x007d:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5754g(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f5851c = r1
        L_0x0087:
            int r1 = r2 + 4
            goto L_0x00b5
        L_0x008a:
            long r3 = androidx.datastore.preferences.protobuf.C2571e.m5756i(r2, r1)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f5851c = r1
        L_0x0098:
            int r1 = r2 + 8
            goto L_0x00b5
        L_0x009b:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5749b(r1, r2, r6)
            goto L_0x00b5
        L_0x00a0:
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r1, r2, r6)
            long r2 = r6.f5850b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            r2 = 1
            goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f5851c = r2
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.m6171k(byte[], int, int, androidx.datastore.preferences.protobuf.WireFormat$FieldType, java.lang.Class, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* renamed from: p */
    public static C2575e1 m6172p(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C2575e1 e1Var = generatedMessageLite.unknownFields;
        if (e1Var != C2575e1.f5860f) {
            return e1Var;
        }
        C2575e1 e1Var2 = new C2575e1();
        generatedMessageLite.unknownFields = e1Var2;
        return e1Var2;
    }

    /* renamed from: u */
    public static List m6173u(long j, Object obj) {
        return (List) C2586h1.m5836o(j, obj);
    }

    /* renamed from: z */
    public static C2609n0 m6174z(C2596i0 i0Var, C2615p0 p0Var, C2551b0 b0Var, C2570d1 d1Var, C2614p pVar, C2577f0 f0Var) {
        if (i0Var instanceof C2636w0) {
            return m6164A((C2636w0) i0Var, p0Var, b0Var, d1Var, pVar, f0Var);
        }
        C2565c1 c1Var = (C2565c1) i0Var;
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo9824E(T r8, byte[] r9, int r10, int r11, int r12, long r13, androidx.datastore.preferences.protobuf.C2571e.C2572a r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f5923s
            java.lang.Object r12 = r7.mo9851n(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f5940q
            boolean r2 = r2.mo9661h(r1)
            if (r2 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f5940q
            androidx.datastore.preferences.protobuf.MapFieldLite r2 = r2.mo9659f()
            androidx.datastore.preferences.protobuf.f0 r3 = r7.f5940q
            r3.mo9654a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            androidx.datastore.preferences.protobuf.f0 r8 = r7.f5940q
            androidx.datastore.preferences.protobuf.e0$a r8 = r8.mo9655b(r12)
            androidx.datastore.preferences.protobuf.f0 r12 = r7.f5940q
            androidx.datastore.preferences.protobuf.MapFieldLite r12 = r12.mo9656c(r1)
            int r10 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r9, r10, r15)
            int r13 = r15.f5849a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f5857b
            V r0 = r8.f5859d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = androidx.datastore.preferences.protobuf.C2571e.m5742G(r10, r9, r1, r15)
            int r10 = r15.f5849a
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
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = r8.f5858c
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x0087
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r8.f5858c
            V r10 = r8.f5859d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m6171k(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f5851c
            goto L_0x003e
        L_0x0072:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = r8.f5856a
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x0087
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r8.f5856a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m6171k(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f5851c
            goto L_0x003e
        L_0x0087:
            int r10 = androidx.datastore.preferences.protobuf.C2571e.m5747L(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r8
        L_0x0097:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9824E(java.lang.Object, byte[], int, int, int, long, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* renamed from: F */
    public final int mo9825F(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C2571e.C2572a aVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C2571e.C2572a aVar2 = aVar;
        Unsafe unsafe = f5923s;
        long j3 = (long) (this.f5924a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C2571e.m5751d(i9, bArr2)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C2571e.m5758k(i9, bArr2)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int J = C2571e.m5745J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f5850b));
                    unsafe.putInt(t2, j3, i11);
                    return J;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int H = C2571e.m5743H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f5849a));
                    unsafe.putInt(t2, j3, i11);
                    return H;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C2571e.m5756i(i9, bArr2)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C2571e.m5754g(i9, bArr2)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int J2 = C2571e.m5745J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f5850b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return J2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int H2 = C2571e.m5743H(bArr2, i9, aVar2);
                    int i18 = aVar2.f5849a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m5645f(H2, H2 + i18, bArr2)) {
                        unsafe.putObject(t2, j2, new String(bArr2, H2, i18, C2631w.f5973a));
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
                    int o = C2571e.m5762o(mo9853o(i13), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f5851c);
                    } else {
                        unsafe.putObject(t2, j2, C2631w.m6277b(object, aVar2.f5851c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C2571e.m5749b(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f5851c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int H3 = C2571e.m5743H(bArr2, i9, aVar2);
                    int i19 = aVar2.f5849a;
                    C2631w.C2634c m = mo9850m(i13);
                    if (m == null || m.mo9451a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m6172p(t).mo9642b(i10, Long.valueOf((long) i19));
                    }
                    return H3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int H4 = C2571e.m5743H(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C2592i.m5901b(aVar2.f5849a)));
                    unsafe.putInt(t2, j3, i11);
                    return H4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int J3 = C2571e.m5745J(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C2592i.m5902c(aVar2.f5850b)));
                    unsafe.putInt(t2, j3, i11);
                    return J3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int m2 = C2571e.m5760m(mo9853o(i13), bArr, i, i2, (i10 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f5851c);
                    } else {
                        unsafe.putObject(t2, j2, C2631w.m6277b(object2, aVar2.f5851c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return m2;
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b3, code lost:
        r4 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b6, code lost:
        r7 = r7 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b8, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b9, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ba, code lost:
        r1 = r32;
        r3 = r10;
        r4 = r13;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c2, code lost:
        r2 = r5;
        r22 = r6;
        r25 = r7;
        r26 = r9;
        r8 = r13;
        r16 = r17;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036a, code lost:
        if (r0 != r15) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0399, code lost:
        if (r0 != r15) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ba, code lost:
        if (r0 != r15) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03cb, code lost:
        r7 = r32;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021f, code lost:
        r1 = r7 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0244, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027d, code lost:
        r7 = r7 | r22;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029a, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9826G(T r28, byte[] r29, int r30, int r31, int r32, androidx.datastore.preferences.protobuf.C2571e.C2572a r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r33
            sun.misc.Unsafe r9 = f5923s
            r0 = r30
            r1 = r32
            r2 = -1
            r3 = 0
            r4 = 0
            r6 = -1
            r7 = 0
        L_0x0015:
            if (r0 >= r13) goto L_0x0420
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5742G(r0, r12, r4, r11)
            int r4 = r11.f5849a
            r5 = r4
            r4 = r0
            goto L_0x0027
        L_0x0026:
            r5 = r0
        L_0x0027:
            int r0 = r5 >>> 3
            r8 = r5 & 7
            r10 = 3
            if (r0 <= r2) goto L_0x003c
            int r3 = r3 / r10
            int r2 = r15.f5926c
            if (r0 < r2) goto L_0x004b
            int r2 = r15.f5927d
            if (r0 > r2) goto L_0x004b
            int r2 = r15.mo9835Q(r0, r3)
            goto L_0x004c
        L_0x003c:
            int r2 = r15.f5926c
            if (r0 < r2) goto L_0x004a
            int r2 = r15.f5927d
            if (r0 > r2) goto L_0x004a
            r3 = 0
            int r2 = r15.mo9835Q(r0, r3)
            goto L_0x004c
        L_0x004a:
            r3 = 0
        L_0x004b:
            r2 = -1
        L_0x004c:
            r3 = -1
            if (r2 != r3) goto L_0x005f
            r18 = r0
            r2 = r4
            r8 = r5
            r22 = r6
            r25 = r7
            r26 = r9
            r10 = 0
            r16 = 0
            r7 = r1
            goto L_0x03d2
        L_0x005f:
            int[] r1 = r15.f5924a
            int r3 = r2 + 1
            r3 = r1[r3]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r3 & r18
            int r10 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r3 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r3
            if (r10 > r5) goto L_0x02d0
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r3 = 1
            int r22 = r3 << r5
            r1 = r1 & r18
            if (r1 == r6) goto L_0x0093
            r5 = -1
            if (r6 == r5) goto L_0x008d
            long r5 = (long) r6
            r9.putInt(r14, r5, r7)
        L_0x008d:
            long r5 = (long) r1
            int r7 = r9.getInt(r14, r5)
            r6 = r1
        L_0x0093:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x029c;
                case 1: goto L_0x0282;
                case 2: goto L_0x0262;
                case 3: goto L_0x0262;
                case 4: goto L_0x0248;
                case 5: goto L_0x0223;
                case 6: goto L_0x0206;
                case 7: goto L_0x01e1;
                case 8: goto L_0x01bb;
                case 9: goto L_0x0184;
                case 10: goto L_0x016a;
                case 11: goto L_0x0248;
                case 12: goto L_0x0136;
                case 13: goto L_0x0206;
                case 14: goto L_0x0223;
                case 15: goto L_0x0119;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00a5;
                default: goto L_0x0097;
            }
        L_0x0097:
            r12 = r29
            r18 = r0
            r10 = r2
            r5 = r4
            r13 = r19
            r16 = -1
            r17 = 0
            goto L_0x02c2
        L_0x00a5:
            r5 = 3
            if (r8 != r5) goto L_0x00e4
            int r1 = r0 << 3
            r5 = r1 | 4
            androidx.datastore.preferences.protobuf.y0 r1 = r15.mo9853o(r2)
            r18 = r0
            r0 = r1
            r1 = r29
            r10 = r2
            r2 = r4
            r17 = 0
            r3 = r31
            r4 = r5
            r8 = r19
            r16 = -1
            r5 = r33
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5760m(r0, r1, r2, r3, r4, r5)
            r1 = r7 & r22
            if (r1 != 0) goto L_0x00d0
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r12, r1)
            goto L_0x00dd
        L_0x00d0:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.f5851c
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r1, r2)
            r9.putObject(r14, r12, r1)
        L_0x00dd:
            r7 = r7 | r22
            r12 = r29
            r13 = r8
            goto L_0x02b8
        L_0x00e4:
            r18 = r0
            r10 = r2
            r16 = -1
            r17 = 0
            r12 = r29
            r13 = r19
            goto L_0x0244
        L_0x00f1:
            r18 = r0
            r10 = r2
            r5 = r19
            r16 = -1
            r17 = 0
            if (r8 != 0) goto L_0x0114
            r2 = r12
            r12 = r29
            int r8 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r4, r11)
            long r0 = r11.f5850b
            long r19 = androidx.datastore.preferences.protobuf.C2592i.m5902c(r0)
            r0 = r9
            r1 = r28
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x027d
        L_0x0114:
            r12 = r29
            r13 = r5
            goto L_0x0244
        L_0x0119:
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != 0) goto L_0x0244
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r4, r11)
            int r1 = r11.f5849a
            int r1 = androidx.datastore.preferences.protobuf.C2592i.m5901b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x02b6
        L_0x0136:
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != 0) goto L_0x0244
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r4, r11)
            int r1 = r11.f5849a
            androidx.datastore.preferences.protobuf.w$c r4 = r15.mo9850m(r10)
            if (r4 == 0) goto L_0x0165
            boolean r4 = r4.mo9451a(r1)
            if (r4 == 0) goto L_0x0157
            goto L_0x0165
        L_0x0157:
            androidx.datastore.preferences.protobuf.e1 r2 = m6172p(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo9642b(r13, r1)
            goto L_0x02b8
        L_0x0165:
            r9.putInt(r14, r2, r1)
            goto L_0x02b6
        L_0x016a:
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r0 = 2
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r0) goto L_0x0244
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5749b(r12, r4, r11)
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r2, r1)
            goto L_0x02b6
        L_0x0184:
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r0 = 2
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r0) goto L_0x01b7
            androidx.datastore.preferences.protobuf.y0 r0 = r15.mo9853o(r10)
            r5 = r31
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5762o(r0, r12, r4, r5, r11)
            r1 = r7 & r22
            if (r1 != 0) goto L_0x01a8
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r2, r1)
            goto L_0x021f
        L_0x01a8:
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r11.f5851c
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r1, r4)
            r9.putObject(r14, r2, r1)
            goto L_0x021f
        L_0x01b7:
            r5 = r31
            goto L_0x0244
        L_0x01bb:
            r5 = r31
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r0 = 2
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r0) goto L_0x0244
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01d7
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5737B(r12, r4, r11)
            goto L_0x01db
        L_0x01d7:
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5740E(r12, r4, r11)
        L_0x01db:
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r2, r1)
            goto L_0x021f
        L_0x01e1:
            r5 = r31
            r18 = r0
            r10 = r2
            r0 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != 0) goto L_0x0244
            int r2 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r4, r11)
            long r3 = r11.f5850b
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01ff
            r3 = 1
            goto L_0x0201
        L_0x01ff:
            r3 = r17
        L_0x0201:
            androidx.datastore.preferences.protobuf.C2586h1.m5838q(r14, r0, r3)
            r0 = r2
            goto L_0x021f
        L_0x0206:
            r5 = r31
            r18 = r0
            r10 = r2
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r1) goto L_0x0244
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5754g(r4, r12)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x021f:
            r1 = r7 | r22
            goto L_0x02b9
        L_0x0223:
            r5 = r31
            r18 = r0
            r10 = r2
            r0 = r3
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r0) goto L_0x0244
            long r19 = androidx.datastore.preferences.protobuf.C2571e.m5756i(r4, r12)
            r0 = r9
            r1 = r28
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r5 = r8
            goto L_0x02b3
        L_0x0244:
            r8 = r4
            r5 = r8
            goto L_0x02c2
        L_0x0248:
            r18 = r0
            r10 = r2
            r5 = r4
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != 0) goto L_0x02c2
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r5, r11)
            int r1 = r11.f5849a
            r9.putInt(r14, r2, r1)
            goto L_0x02b6
        L_0x0262:
            r18 = r0
            r10 = r2
            r5 = r4
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != 0) goto L_0x02c2
            int r8 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r5, r11)
            long r4 = r11.f5850b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x027d:
            r0 = r7 | r22
            r7 = r0
            r0 = r8
            goto L_0x02ba
        L_0x0282:
            r18 = r0
            r10 = r2
            r5 = r4
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r1) goto L_0x02c2
            float r0 = androidx.datastore.preferences.protobuf.C2571e.m5758k(r5, r12)
            androidx.datastore.preferences.protobuf.C2586h1.m5843v(r14, r2, r0)
            int r4 = r5 + 4
        L_0x029a:
            r0 = r4
            goto L_0x02b6
        L_0x029c:
            r18 = r0
            r10 = r2
            r0 = r3
            r5 = r4
            r2 = r12
            r13 = r19
            r16 = -1
            r17 = 0
            r12 = r29
            if (r8 != r0) goto L_0x02c2
            double r0 = androidx.datastore.preferences.protobuf.C2571e.m5751d(r5, r12)
            androidx.datastore.preferences.protobuf.C2586h1.m5842u(r14, r2, r0)
        L_0x02b3:
            int r4 = r5 + 8
            goto L_0x029a
        L_0x02b6:
            r7 = r7 | r22
        L_0x02b8:
            r1 = r7
        L_0x02b9:
            r7 = r1
        L_0x02ba:
            r1 = r32
            r3 = r10
            r4 = r13
            r2 = r18
            goto L_0x0321
        L_0x02c2:
            r2 = r5
            r22 = r6
            r25 = r7
            r26 = r9
            r8 = r13
            r16 = r17
            r7 = r32
            goto L_0x03d2
        L_0x02d0:
            r18 = r0
            r5 = r4
            r16 = -1
            r17 = 0
            r4 = r2
            r2 = r12
            r13 = r19
            r12 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0334
            r0 = 2
            if (r8 != r0) goto L_0x0325
            java.lang.Object r0 = r9.getObject(r14, r2)
            androidx.datastore.preferences.protobuf.w$d r0 = (androidx.datastore.preferences.protobuf.C2631w.C2635d) r0
            boolean r1 = r0.mo9603h()
            if (r1 != 0) goto L_0x0302
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02f9
            r1 = 10
            goto L_0x02fb
        L_0x02f9:
            int r1 = r1 * 2
        L_0x02fb:
            androidx.datastore.preferences.protobuf.w$d r0 = r0.mo9612i(r1)
            r9.putObject(r14, r2, r0)
        L_0x0302:
            r8 = r0
            androidx.datastore.preferences.protobuf.y0 r0 = r15.mo9853o(r4)
            r1 = r13
            r2 = r29
            r3 = r5
            r19 = r4
            r4 = r31
            r5 = r8
            r22 = r6
            r6 = r33
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5763p(r0, r1, r2, r3, r4, r5, r6)
            r1 = r32
            r4 = r13
            r2 = r18
            r3 = r19
            r6 = r22
        L_0x0321:
            r13 = r31
            goto L_0x0015
        L_0x0325:
            r19 = r4
            r22 = r6
            r15 = r5
            r25 = r7
            r26 = r9
            r16 = r17
            r17 = r13
            goto L_0x039c
        L_0x0334:
            r19 = r4
            r22 = r6
            r0 = 49
            if (r10 > r0) goto L_0x036e
            r4 = r20
            long r0 = (long) r4
            r20 = r0
            r0 = r27
            r1 = r28
            r23 = r2
            r2 = r29
            r3 = r5
            r4 = r31
            r6 = r5
            r5 = r13
            r15 = r6
            r6 = r18
            r25 = r7
            r7 = r8
            r8 = r19
            r26 = r9
            r30 = r10
            r16 = r17
            r9 = r20
            r11 = r30
            r17 = r13
            r12 = r23
            r14 = r33
            int r0 = r0.mo9828I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03cb
            goto L_0x03bc
        L_0x036e:
            r23 = r2
            r15 = r5
            r25 = r7
            r26 = r9
            r30 = r10
            r16 = r17
            r4 = r20
            r17 = r13
            r0 = 50
            r9 = r30
            if (r9 != r0) goto L_0x03a0
            r0 = 2
            if (r8 != r0) goto L_0x039c
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r23
            r8 = r33
            int r0 = r0.mo9824E(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03cb
            goto L_0x03bc
        L_0x039c:
            r7 = r32
            r2 = r15
            goto L_0x03ce
        L_0x03a0:
            r0 = r27
            r1 = r28
            r2 = r29
            r10 = r4
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r18
            r7 = r8
            r8 = r10
            r10 = r23
            r12 = r19
            r13 = r33
            int r0 = r0.mo9825F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03cb
        L_0x03bc:
            r9 = r27
            r1 = r32
            r11 = r33
            r8 = r17
            r3 = r19
        L_0x03c6:
            r6 = r22
            r7 = r25
            goto L_0x0412
        L_0x03cb:
            r7 = r32
            r2 = r0
        L_0x03ce:
            r8 = r17
            r10 = r19
        L_0x03d2:
            if (r8 != r7) goto L_0x03e0
            if (r7 == 0) goto L_0x03e0
            r9 = r27
            r0 = r2
            r1 = r7
            r4 = r8
            r6 = r22
            r7 = r25
            goto L_0x0427
        L_0x03e0:
            r9 = r27
            boolean r0 = r9.f5929f
            r11 = r33
            if (r0 == 0) goto L_0x0400
            androidx.datastore.preferences.protobuf.o r0 = r11.f5852d
            androidx.datastore.preferences.protobuf.o r1 = androidx.datastore.preferences.protobuf.C2611o.m6212a()
            if (r0 == r1) goto L_0x0400
            androidx.datastore.preferences.protobuf.k0 r5 = r9.f5928e
            r0 = r8
            r1 = r29
            r3 = r31
            r4 = r28
            r6 = r33
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5753f(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x040f
        L_0x0400:
            androidx.datastore.preferences.protobuf.e1 r4 = m6172p(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5741F(r0, r1, r2, r3, r4, r5)
        L_0x040f:
            r1 = r7
            r3 = r10
            goto L_0x03c6
        L_0x0412:
            r14 = r28
            r12 = r29
            r13 = r31
            r4 = r8
            r15 = r9
            r2 = r18
            r9 = r26
            goto L_0x0015
        L_0x0420:
            r22 = r6
            r25 = r7
            r26 = r9
            r9 = r15
        L_0x0427:
            r2 = -1
            if (r6 == r2) goto L_0x0433
            long r2 = (long) r6
            r5 = r28
            r6 = r26
            r6.putInt(r5, r2, r7)
            goto L_0x0435
        L_0x0433:
            r5 = r28
        L_0x0435:
            r2 = 0
            int r3 = r9.f5934k
        L_0x0438:
            int r6 = r9.f5935l
            if (r3 >= r6) goto L_0x044b
            int[] r6 = r9.f5933j
            r6 = r6[r3]
            androidx.datastore.preferences.protobuf.d1<?, ?> r7 = r9.f5938o
            java.lang.Object r2 = r9.mo9849l(r5, r6, r2, r7)
            androidx.datastore.preferences.protobuf.e1 r2 = (androidx.datastore.preferences.protobuf.C2575e1) r2
            int r3 = r3 + 1
            goto L_0x0438
        L_0x044b:
            if (r2 == 0) goto L_0x0452
            androidx.datastore.preferences.protobuf.d1<?, ?> r3 = r9.f5938o
            r3.mo9635n(r5, r2)
        L_0x0452:
            if (r1 != 0) goto L_0x045e
            r2 = r31
            if (r0 != r2) goto L_0x0459
            goto L_0x0464
        L_0x0459:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x045e:
            r2 = r31
            if (r0 > r2) goto L_0x0465
            if (r4 != r1) goto L_0x0465
        L_0x0464:
            return r0
        L_0x0465:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9826G(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0224, code lost:
        if (r0 != r15) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        if (r0 != r15) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0248, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f5, code lost:
        if (r0 != r15) goto L_0x0245;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9827H(java.lang.Object r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.C2571e.C2572a r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f5923s
            r10 = 0
            r8 = -1
            r0 = r30
            r1 = r8
            r2 = r10
        L_0x0012:
            if (r0 >= r13) goto L_0x0270
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5742G(r0, r12, r3, r11)
            int r3 = r11.f5849a
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
            int r0 = r15.f5926c
            if (r6 < r0) goto L_0x0049
            int r0 = r15.f5927d
            if (r6 > r0) goto L_0x0049
            int r0 = r15.mo9835Q(r6, r2)
            goto L_0x004a
        L_0x003c:
            int r0 = r15.f5926c
            if (r6 < r0) goto L_0x0049
            int r0 = r15.f5927d
            if (r6 > r0) goto L_0x0049
            int r0 = r15.mo9835Q(r6, r10)
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
            goto L_0x024b
        L_0x0058:
            int[] r0 = r15.f5924a
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
            int r7 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r7, r11)
            long r2 = r11.f5850b
            long r19 = androidx.datastore.preferences.protobuf.C2592i.m5902c(r2)
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
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r7, r11)
            int r1 = r11.f5849a
            int r1 = androidx.datastore.preferences.protobuf.C2592i.m5901b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x00ad
        L_0x00a0:
            r2 = r0
            r8 = r4
            if (r5 != 0) goto L_0x00b0
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r7, r11)
            int r1 = r11.f5849a
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
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5749b(r12, r7, r11)
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00c1:
            r2 = r0
            r8 = r4
            if (r5 != r10) goto L_0x01b3
            androidx.datastore.preferences.protobuf.y0 r0 = r15.mo9853o(r8)
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5762o(r0, r12, r7, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d9
            java.lang.Object r1 = r11.f5851c
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00d9:
            java.lang.Object r4 = r11.f5851c
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r1, r4)
            r9.putObject(r14, r2, r1)
            goto L_0x00ad
        L_0x00e3:
            r1 = r0
            r8 = r4
            if (r5 != r10) goto L_0x01b3
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x00f1
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5737B(r12, r7, r11)
            goto L_0x00f5
        L_0x00f1:
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5740E(r12, r7, r11)
        L_0x00f5:
            java.lang.Object r3 = r11.f5851c
            r9.putObject(r14, r1, r3)
            goto L_0x00ad
        L_0x00fb:
            r1 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r7, r11)
            long r3 = r11.f5850b
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r8 = 0
        L_0x010d:
            androidx.datastore.preferences.protobuf.C2586h1.m5838q(r14, r1, r8)
            goto L_0x016b
        L_0x0112:
            r1 = r0
            r10 = r4
            r0 = 5
            if (r5 != r0) goto L_0x016f
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5754g(r7, r12)
            r9.putInt(r14, r1, r0)
            goto L_0x015b
        L_0x011f:
            r1 = r0
            r10 = r4
            if (r5 != r8) goto L_0x016f
            long r4 = androidx.datastore.preferences.protobuf.C2571e.m5756i(r7, r12)
            r0 = r9
            r2 = r1
            r1 = r28
            r0.putLong(r1, r2, r4)
            goto L_0x0169
        L_0x012f:
            r2 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5743H(r12, r7, r11)
            int r1 = r11.f5849a
            r9.putInt(r14, r2, r1)
            goto L_0x016b
        L_0x013d:
            r2 = r0
            r10 = r4
            if (r5 != 0) goto L_0x016f
            int r7 = androidx.datastore.preferences.protobuf.C2571e.m5745J(r12, r7, r11)
            long r4 = r11.f5850b
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
            float r0 = androidx.datastore.preferences.protobuf.C2571e.m5758k(r7, r12)
            androidx.datastore.preferences.protobuf.C2586h1.m5843v(r14, r2, r0)
        L_0x015b:
            int r0 = r7 + 4
            goto L_0x016b
        L_0x015e:
            r2 = r0
            r10 = r4
            if (r5 != r8) goto L_0x016f
            double r0 = androidx.datastore.preferences.protobuf.C2571e.m5751d(r7, r12)
            androidx.datastore.preferences.protobuf.C2586h1.m5842u(r14, r2, r0)
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
            if (r2 != r4) goto L_0x01c0
            if (r5 != r10) goto L_0x01b3
            java.lang.Object r2 = r9.getObject(r14, r0)
            androidx.datastore.preferences.protobuf.w$d r2 = (androidx.datastore.preferences.protobuf.C2631w.C2635d) r2
            boolean r3 = r2.mo9603h()
            if (r3 != 0) goto L_0x0198
            int r3 = r2.size()
            if (r3 != 0) goto L_0x018f
            r3 = 10
            goto L_0x0191
        L_0x018f:
            int r3 = r3 * 2
        L_0x0191:
            androidx.datastore.preferences.protobuf.w$d r2 = r2.mo9612i(r3)
            r9.putObject(r14, r0, r2)
        L_0x0198:
            r5 = r2
            androidx.datastore.preferences.protobuf.y0 r0 = r15.mo9853o(r8)
            r1 = r16
            r2 = r29
            r3 = r7
            r4 = r31
            r19 = r6
            r6 = r32
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5763p(r0, r1, r2, r3, r4, r5, r6)
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
            goto L_0x0227
        L_0x01c0:
            r19 = r6
            r4 = 49
            if (r2 > r4) goto L_0x01f8
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
            int r0 = r0.mo9828I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0248
            goto L_0x0245
        L_0x01f8:
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
            if (r9 != r0) goto L_0x0229
            r7 = r30
            if (r7 != r10) goto L_0x0227
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r20
            r8 = r32
            int r0 = r0.mo9824E(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0248
            goto L_0x0245
        L_0x0227:
            r2 = r15
            goto L_0x0249
        L_0x0229:
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
            int r0 = r0.mo9825F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0248
        L_0x0245:
            r2 = r17
            goto L_0x025c
        L_0x0248:
            r2 = r0
        L_0x0249:
            r10 = r17
        L_0x024b:
            androidx.datastore.preferences.protobuf.e1 r4 = m6172p(r28)
            r0 = r16
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = androidx.datastore.preferences.protobuf.C2571e.m5741F(r0, r1, r2, r3, r4, r5)
            r2 = r10
        L_0x025c:
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
        L_0x0270:
            r1 = r13
            if (r0 != r1) goto L_0x0274
            return
        L_0x0274:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9827H(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.e$a):void");
    }

    /* renamed from: I */
    public final int mo9828I(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C2571e.C2572a aVar) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C2571e.C2572a aVar2 = aVar;
        Unsafe unsafe = f5923s;
        C2631w.C2635d dVar = (C2631w.C2635d) unsafe.getObject(t, j3);
        if (!dVar.mo9603h()) {
            int size = dVar.size();
            dVar = dVar.mo9612i(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, dVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C2571e.m5765r(bArr, i9, dVar, aVar2);
                }
                if (i10 == 1) {
                    return C2571e.m5752e(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C2571e.m5768u(bArr, i9, dVar, aVar2);
                }
                if (i10 == 5) {
                    return C2571e.m5759l(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C2571e.m5772y(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C2571e.m5746K(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C2571e.m5771x(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C2571e.m5744I(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C2571e.m5767t(bArr, i9, dVar, aVar2);
                }
                if (i10 == 1) {
                    return C2571e.m5757j(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C2571e.m5766s(bArr, i9, dVar, aVar2);
                }
                if (i10 == 5) {
                    return C2571e.m5755h(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C2571e.m5764q(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C2571e.m5748a(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? C2571e.m5738C(i3, bArr, i, i2, dVar, aVar) : C2571e.m5739D(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C2571e.m5763p(mo9853o(i11), i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C2571e.m5750c(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C2571e.m5771x(bArr, i9, dVar, aVar2);
                } else if (i10 == 0) {
                    i8 = C2571e.m5744I(i3, bArr, i, i2, dVar, aVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C2575e1 e1Var = generatedMessageLite.unknownFields;
                if (e1Var == C2575e1.f5860f) {
                    e1Var = null;
                }
                C2575e1 e1Var2 = (C2575e1) C2644z0.m6389z(i4, dVar, mo9850m(i11), e1Var, this.f5938o);
                if (e1Var2 != null) {
                    generatedMessageLite.unknownFields = e1Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C2571e.m5769v(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C2571e.m5773z(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C2571e.m5770w(bArr, i9, dVar, aVar2);
                }
                if (i10 == 0) {
                    return C2571e.m5736A(i3, bArr, i, i2, dVar, aVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C2571e.m5761n(mo9853o(i11), i3, bArr, i, i2, dVar, aVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: J */
    public final <E> void mo9829J(Object obj, long j, C2640x0 x0Var, C2642y0<E> y0Var, C2611o oVar) throws IOException {
        x0Var.mo9760M(this.f5937n.mo9554c(j, obj), y0Var, oVar);
    }

    /* renamed from: K */
    public final <E> void mo9830K(Object obj, int i, C2640x0 x0Var, C2642y0<E> y0Var, C2611o oVar) throws IOException {
        x0Var.mo9757J(this.f5937n.mo9554c((long) (i & 1048575), obj), y0Var, oVar);
    }

    /* renamed from: L */
    public final void mo9831L(Object obj, int i, C2640x0 x0Var) throws IOException {
        if ((536870912 & i) != 0) {
            C2586h1.m5846y((long) (i & 1048575), obj, x0Var.mo9755H());
        } else if (this.f5930g) {
            C2586h1.m5846y((long) (i & 1048575), obj, x0Var.mo9796y());
        } else {
            C2586h1.m5846y((long) (i & 1048575), obj, x0Var.mo9783n());
        }
    }

    /* renamed from: M */
    public final void mo9832M(Object obj, int i, C2640x0 x0Var) throws IOException {
        if ((536870912 & i) != 0) {
            x0Var.mo9782m(this.f5937n.mo9554c((long) (i & 1048575), obj));
        } else {
            x0Var.mo9748A(this.f5937n.mo9554c((long) (i & 1048575), obj));
        }
    }

    /* renamed from: O */
    public final void mo9833O(int i, Object obj) {
        if (!this.f5931h) {
            int i2 = this.f5924a[i + 2];
            long j = (long) (i2 & 1048575);
            C2586h1.m5844w(obj, C2586h1.m5834m(j, obj) | (1 << (i2 >>> 20)), j);
        }
    }

    /* renamed from: P */
    public final void mo9834P(int i, int i2, Object obj) {
        C2586h1.m5844w(obj, i, (long) (this.f5924a[i2 + 2] & 1048575));
    }

    /* renamed from: Q */
    public final int mo9835Q(int i, int i2) {
        int length = (this.f5924a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f5924a[i4];
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

    /* renamed from: S */
    public final int mo9836S(int i) {
        return this.f5924a[i + 1];
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
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9837T(java.lang.Object r19, androidx.datastore.preferences.protobuf.C2601k r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f5929f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.p<?> r3 = r0.f5939p
            androidx.datastore.preferences.protobuf.s r3 = r3.mo9867c(r1)
            boolean r5 = r3.mo9881h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo9884k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f5924a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f5923s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x04a3
            int r12 = r0.mo9836S(r10)
            int[] r13 = r0.f5924a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f5931h
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
            androidx.datastore.preferences.protobuf.p<?> r9 = r0.f5939p
            r9.mo9865a(r5)
            if (r14 < 0) goto L_0x007b
            androidx.datastore.preferences.protobuf.p<?> r9 = r0.f5939p
            r9.mo9874j(r5)
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
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r9 = r0.mo9853o(r12)
            r2.mo9805h(r14, r9, r4)
            goto L_0x0083
        L_0x0098:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m6167D(r9, r1)
            r2.mo9813p(r14, r9)
            goto L_0x0083
        L_0x00a6:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9812o(r14, r4)
            goto L_0x0083
        L_0x00b4:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m6167D(r9, r1)
            r2.mo9811n(r14, r9)
            goto L_0x0083
        L_0x00c2:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9810m(r14, r4)
            goto L_0x0083
        L_0x00d0:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9801d(r14, r4)
            goto L_0x0083
        L_0x00de:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9814q(r14, r4)
            goto L_0x0083
        L_0x00ec:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.mo9799b(r14, r4)
            goto L_0x0083
        L_0x00fc:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r9 = r0.mo9853o(r12)
            r2.mo9808k(r14, r9, r4)
            goto L_0x0083
        L_0x010f:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            m6170V(r14, r4, r2)
            goto L_0x0083
        L_0x011e:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r9, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.mo9798a(r14, r4)
            goto L_0x0083
        L_0x0133:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9802e(r14, r4)
            goto L_0x0083
        L_0x0142:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m6167D(r9, r1)
            r2.mo9803f(r14, r9)
            goto L_0x0083
        L_0x0151:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            int r4 = m6166C(r9, r1)
            r2.mo9806i(r14, r4)
            goto L_0x0083
        L_0x0160:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m6167D(r9, r1)
            r2.mo9815r(r14, r9)
            goto L_0x0083
        L_0x016f:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            long r9 = m6167D(r9, r1)
            r2.mo9807j(r14, r9)
            goto L_0x0083
        L_0x017e:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r9, r1)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.mo9804g(r4, r14)
            goto L_0x0083
        L_0x0193:
            boolean r4 = r0.mo9857t(r14, r12, r1)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r9, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r9 = r4.doubleValue()
            r2.mo9800c(r14, r9)
            goto L_0x0083
        L_0x01a8:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.mo9838U(r2, r14, r4, r12)
            goto L_0x0083
        L_0x01b1:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.y0 r10 = r0.mo9853o(r12)
            androidx.datastore.preferences.protobuf.C2644z0.m6353L(r4, r9, r2, r10)
            goto L_0x0083
        L_0x01c4:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01d4:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01e4:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01f4:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0204:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0214:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0224:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0234:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0244:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0254:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0264:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0274:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0284:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0294:
            r13 = 1
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02a4:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02b4:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02c4:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02d4:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02e4:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02f4:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0304:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6347F(r4, r9, r2)
            goto L_0x0083
        L_0x0313:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.y0 r10 = r0.mo9853o(r12)
            androidx.datastore.preferences.protobuf.C2644z0.m6356O(r4, r9, r2, r10)
            goto L_0x0083
        L_0x0326:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6361T(r4, r9, r2)
            goto L_0x0083
        L_0x0335:
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0345:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0355:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0365:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0375:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0385:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0395:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03a5:
            r13 = 0
            int[] r4 = r0.f5924a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r9 = r0.mo9853o(r12)
            r2.mo9805h(r14, r9, r4)
            goto L_0x049f
        L_0x03c6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo9813p(r14, r9)
            goto L_0x049f
        L_0x03d3:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9812o(r14, r4)
            goto L_0x049f
        L_0x03e0:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo9811n(r14, r9)
            goto L_0x049f
        L_0x03ed:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9810m(r14, r4)
            goto L_0x049f
        L_0x03fa:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9801d(r14, r4)
            goto L_0x049f
        L_0x0407:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9814q(r14, r4)
            goto L_0x049f
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.mo9799b(r14, r4)
            goto L_0x049f
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r9 = r0.mo9853o(r12)
            r2.mo9808k(r14, r9, r4)
            goto L_0x049f
        L_0x0434:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            m6170V(r14, r4, r2)
            goto L_0x049f
        L_0x0440:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            boolean r4 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r9, r1)
            r2.mo9798a(r14, r4)
            goto L_0x049f
        L_0x044c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9802e(r14, r4)
            goto L_0x049f
        L_0x0458:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo9803f(r14, r9)
            goto L_0x049f
        L_0x0464:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.mo9806i(r14, r4)
            goto L_0x049f
        L_0x0470:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo9815r(r14, r9)
            goto L_0x049f
        L_0x047c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.mo9807j(r14, r9)
            goto L_0x049f
        L_0x0488:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            float r4 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r9, r1)
            r2.mo9804g(r4, r14)
            goto L_0x049f
        L_0x0494:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            double r9 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r9, r1)
            r2.mo9800c(r14, r9)
        L_0x049f:
            int r10 = r12 + 3
            goto L_0x002b
        L_0x04a3:
            if (r5 == 0) goto L_0x04ba
            androidx.datastore.preferences.protobuf.p<?> r4 = r0.f5939p
            r4.mo9874j(r5)
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
            androidx.datastore.preferences.protobuf.d1<?, ?> r3 = r0.f5938o
            androidx.datastore.preferences.protobuf.e1 r1 = r3.mo9628g(r1)
            r3.mo9640s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9837T(java.lang.Object, androidx.datastore.preferences.protobuf.k):void");
    }

    /* renamed from: U */
    public final void mo9838U(C2601k kVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C2573e0.C2574a<?, ?> b = this.f5940q.mo9655b(mo9851n(i2));
            MapFieldLite d = this.f5940q.mo9657d(obj);
            kVar.f5918a.getClass();
            for (Map.Entry entry : d.entrySet()) {
                kVar.f5918a.mo9432R(i, 2);
                kVar.f5918a.mo9434T(C2573e0.m5774a(b, entry.getKey(), entry.getValue()));
                C2573e0.m5775b(kVar.f5918a, b, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo9839a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f5924a.length; i += 3) {
            int S = mo9836S(i);
            long j = (long) (1048575 & S);
            int i2 = this.f5924a[i];
            switch ((S & 267386880) >>> 20) {
                case 0:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5842u(t, j, C2586h1.m5832k(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 1:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5843v(t, j, C2586h1.m5833l(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 2:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5845x(t, j, C2586h1.m5835n(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 3:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5845x(t, j, C2586h1.m5835n(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 4:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 5:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5845x(t, j, C2586h1.m5835n(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 6:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 7:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5838q(t, j, C2586h1.m5827f(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 8:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5846y(j, t, C2586h1.m5836o(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 9:
                    mo9860x(i, t, t2);
                    break;
                case 10:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5846y(j, t, C2586h1.m5836o(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 11:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 12:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 13:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 14:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5845x(t, j, C2586h1.m5835n(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 15:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5844w(t, C2586h1.m5834m(j, t2), j);
                        mo9833O(i, t);
                        break;
                    }
                case 16:
                    if (!mo9856s(i, t2)) {
                        break;
                    } else {
                        C2586h1.m5845x(t, j, C2586h1.m5835n(j, t2));
                        mo9833O(i, t);
                        break;
                    }
                case 17:
                    mo9860x(i, t, t2);
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
                    this.f5937n.mo9553b(j, t, t2);
                    break;
                case 50:
                    C2577f0 f0Var = this.f5940q;
                    Class<?> cls = C2644z0.f5984a;
                    C2586h1.m5846y(j, t, f0Var.mo9654a(C2586h1.m5836o(j, t), C2586h1.m5836o(j, t2)));
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
                    if (!mo9857t(i2, i, t2)) {
                        break;
                    } else {
                        C2586h1.m5846y(j, t, C2586h1.m5836o(j, t2));
                        mo9834P(i2, i, t);
                        break;
                    }
                case 60:
                    mo9861y(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo9857t(i2, i, t2)) {
                        break;
                    } else {
                        C2586h1.m5846y(j, t, C2586h1.m5836o(j, t2));
                        mo9834P(i2, i, t);
                        break;
                    }
                case 68:
                    mo9861y(i, t, t2);
                    break;
            }
        }
        if (!this.f5931h) {
            C2570d1<?, ?> d1Var = this.f5938o;
            Class<?> cls2 = C2644z0.f5984a;
            d1Var.mo9636o(t, d1Var.mo9632k(d1Var.mo9628g(t), d1Var.mo9628g(t2)));
            if (this.f5929f) {
                C2644z0.m6343B(this.f5939p, t, t2);
            }
        }
    }

    /* renamed from: b */
    public final void mo9840b(T t) {
        int i;
        int i2 = this.f5934k;
        while (true) {
            i = this.f5935l;
            if (i2 >= i) {
                break;
            }
            long S = (long) (mo9836S(this.f5933j[i2]) & 1048575);
            Object o = C2586h1.m5836o(S, t);
            if (o != null) {
                C2586h1.m5846y(S, t, this.f5940q.mo9658e(o));
            }
            i2++;
        }
        int length = this.f5933j.length;
        while (i < length) {
            this.f5937n.mo9552a((long) this.f5933j[i], t);
            i++;
        }
        this.f5938o.mo9631j(t);
        if (this.f5929f) {
            this.f5939p.mo9870f(t);
        }
    }

    /* renamed from: c */
    public final boolean mo9841c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f5934k) {
                return !this.f5929f || this.f5939p.mo9867c(t).mo9883i();
            }
            int i5 = this.f5933j[i3];
            int i6 = this.f5924a[i5];
            int S = mo9836S(i5);
            if (!this.f5931h) {
                int i7 = this.f5924a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f5923s.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & S) != 0) {
                if (!(this.f5931h ? mo9856s(i5, t) : (i4 & i) != 0)) {
                    return false;
                }
            }
            int i9 = (267386880 & S) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (this.f5931h) {
                    z = mo9856s(i5, t);
                } else if ((i4 & i) == 0) {
                    z = false;
                }
                if (z && !mo9853o(i5).mo9841c(C2586h1.m5836o((long) (S & 1048575), t))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (mo9857t(i6, i5, t) && !mo9853o(i5).mo9841c(C2586h1.m5836o((long) (S & 1048575), t))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            MapFieldLite d = this.f5940q.mo9657d(C2586h1.m5836o((long) (S & 1048575), t));
                            if (!d.isEmpty()) {
                                if (this.f5940q.mo9655b(mo9851n(i5)).f5858c.getJavaType() == WireFormat$JavaType.MESSAGE) {
                                    C2642y0<?> y0Var = null;
                                    Iterator it = d.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (y0Var == null) {
                                            y0Var = C2628u0.f5965c.mo9895a(next.getClass());
                                        }
                                        if (!y0Var.mo9841c(next)) {
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
                List list = (List) C2586h1.m5836o((long) (S & 1048575), t);
                if (!list.isEmpty()) {
                    C2642y0 o = mo9853o(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!o.mo9841c(list.get(i10))) {
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
    public final int mo9842d(T t) {
        return this.f5931h ? mo9855r(t) : mo9854q(t);
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
    public final int mo9843e(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f5924a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.mo9836S(r1)
            int[] r4 = r10.f5924a
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
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m6167D(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m6167D(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m6167D(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = m6166C(r5, r11)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m6167D(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = m6167D(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.mo9857t(r4, r1, r11)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r5, r11)
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r5, r11)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r5, r11)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C2631w.m6276a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r10.f5938o
            androidx.datastore.preferences.protobuf.e1 r0 = r0.mo9628g(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f5929f
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            androidx.datastore.preferences.protobuf.p<?> r1 = r10.f5939p
            androidx.datastore.preferences.protobuf.s r11 = r1.mo9867c(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9843e(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (androidx.datastore.preferences.protobuf.C2644z0.m6344C(androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10), androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (androidx.datastore.preferences.protobuf.C2644z0.m6344C(androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10), androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (androidx.datastore.preferences.protobuf.C2644z0.m6344C(androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10), androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (androidx.datastore.preferences.protobuf.C2644z0.m6344C(androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10), androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (androidx.datastore.preferences.protobuf.C2644z0.m6344C(androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10), androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5827f(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5827f(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10) == androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.C2586h1.m5833l(r6, r10)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.C2586h1.m5833l(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.C2586h1.m5832k(r6, r10)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.C2586h1.m5832k(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9844f(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f5924a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.mo9836S(r2)
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
            int[] r4 = r9.f5924a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r4, r10)
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r4, r11)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r4 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r3 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r3 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r4 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10)
            long r6 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10)
            long r6 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r4 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r4 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r10)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r6, r11)
            boolean r4 = androidx.datastore.preferences.protobuf.C2644z0.m6344C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r6, r10)
            boolean r5 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10)
            long r6 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r10)
            int r5 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10)
            long r6 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r10)
            long r6 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r6, r11)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r6, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r6, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.mo9848j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r6, r10)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r6, r11)
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
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r9.f5938o
            androidx.datastore.preferences.protobuf.e1 r0 = r0.mo9628g(r10)
            androidx.datastore.preferences.protobuf.d1<?, ?> r2 = r9.f5938o
            androidx.datastore.preferences.protobuf.e1 r2 = r2.mo9628g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f5929f
            if (r0 == 0) goto L_0x01fa
            androidx.datastore.preferences.protobuf.p<?> r0 = r9.f5939p
            androidx.datastore.preferences.protobuf.s r10 = r0.mo9867c(r10)
            androidx.datastore.preferences.protobuf.p<?> r0 = r9.f5939p
            androidx.datastore.preferences.protobuf.s r11 = r0.mo9867c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9844f(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: g */
    public final void mo9845g(T t, C2640x0 x0Var, C2611o oVar) throws IOException {
        oVar.getClass();
        mo9858v(this.f5938o, this.f5939p, t, x0Var, oVar);
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
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9846h(java.lang.Object r14, androidx.datastore.preferences.protobuf.C2601k r15) throws java.io.IOException {
        /*
            r13 = this;
            r15.getClass()
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r0 = androidx.datastore.preferences.protobuf.Writer$FieldOrder.ASCENDING
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = androidx.datastore.preferences.protobuf.Writer$FieldOrder.DESCENDING
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 1
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            if (r0 != r1) goto L_0x0567
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r13.f5938o
            androidx.datastore.preferences.protobuf.e1 r1 = r0.mo9628g(r14)
            r0.mo9640s(r1, r15)
            boolean r0 = r13.f5929f
            if (r0 == 0) goto L_0x0061
            androidx.datastore.preferences.protobuf.p<?> r0 = r13.f5939p
            androidx.datastore.preferences.protobuf.s r0 = r0.mo9867c(r14)
            boolean r1 = r0.mo9881h()
            if (r1 != 0) goto L_0x0061
            boolean r1 = r0.f5959c
            if (r1 == 0) goto L_0x0047
            androidx.datastore.preferences.protobuf.x$b r1 = new androidx.datastore.preferences.protobuf.x$b
            androidx.datastore.preferences.protobuf.b1<T, java.lang.Object> r0 = r0.f5957a
            androidx.datastore.preferences.protobuf.b1<K, V>$b r7 = r0.f5826h
            if (r7 != 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.b1$b r7 = new androidx.datastore.preferences.protobuf.b1$b
            r7.<init>()
            r0.f5826h = r7
        L_0x003d:
            androidx.datastore.preferences.protobuf.b1<K, V>$b r0 = r0.f5826h
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x005a
        L_0x0047:
            androidx.datastore.preferences.protobuf.b1<T, java.lang.Object> r0 = r0.f5957a
            androidx.datastore.preferences.protobuf.b1<K, V>$b r1 = r0.f5826h
            if (r1 != 0) goto L_0x0054
            androidx.datastore.preferences.protobuf.b1$b r1 = new androidx.datastore.preferences.protobuf.b1$b
            r1.<init>()
            r0.f5826h = r1
        L_0x0054:
            androidx.datastore.preferences.protobuf.b1<K, V>$b r0 = r0.f5826h
            java.util.Iterator r1 = r0.iterator()
        L_0x005a:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0063
        L_0x0061:
            r0 = r6
            r1 = r0
        L_0x0063:
            int[] r7 = r13.f5924a
            int r7 = r7.length
        L_0x0066:
            int r7 = r7 + -3
            if (r7 < 0) goto L_0x0550
            int r8 = r13.mo9836S(r7)
            int[] r9 = r13.f5924a
            r9 = r9[r7]
        L_0x0072:
            if (r0 == 0) goto L_0x008f
            androidx.datastore.preferences.protobuf.p<?> r10 = r13.f5939p
            r10.mo9865a(r0)
            if (r9 >= 0) goto L_0x008f
            androidx.datastore.preferences.protobuf.p<?> r10 = r13.f5939p
            r10.mo9874j(r0)
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
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            r15.mo9805h(r9, r10, r8)
            goto L_0x0066
        L_0x00ab:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m6167D(r10, r14)
            r15.mo9813p(r9, r10)
            goto L_0x0066
        L_0x00bb:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9812o(r9, r8)
            goto L_0x0066
        L_0x00cb:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m6167D(r10, r14)
            r15.mo9811n(r9, r10)
            goto L_0x0066
        L_0x00db:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9810m(r9, r8)
            goto L_0x0066
        L_0x00ec:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9801d(r9, r8)
            goto L_0x0066
        L_0x00fd:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9814q(r9, r8)
            goto L_0x0066
        L_0x010e:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.ByteString r8 = (androidx.datastore.preferences.protobuf.ByteString) r8
            r15.mo9799b(r9, r8)
            goto L_0x0066
        L_0x0121:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            r15.mo9808k(r9, r10, r8)
            goto L_0x0066
        L_0x0136:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            m6170V(r9, r8, r15)
            goto L_0x0066
        L_0x0147:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r15.mo9798a(r9, r8)
            goto L_0x0066
        L_0x015e:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9802e(r9, r8)
            goto L_0x0066
        L_0x016f:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m6167D(r10, r14)
            r15.mo9803f(r9, r10)
            goto L_0x0066
        L_0x0180:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = m6166C(r10, r14)
            r15.mo9806i(r9, r8)
            goto L_0x0066
        L_0x0191:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m6167D(r10, r14)
            r15.mo9815r(r9, r10)
            goto L_0x0066
        L_0x01a2:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = m6167D(r10, r14)
            r15.mo9807j(r9, r10)
            goto L_0x0066
        L_0x01b3:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r15.mo9804g(r8, r9)
            goto L_0x0066
        L_0x01ca:
            boolean r10 = r13.mo9857t(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.lang.Double r8 = (java.lang.Double) r8
            double r10 = r8.doubleValue()
            r15.mo9800c(r9, r10)
            goto L_0x0066
        L_0x01e1:
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            r13.mo9838U(r15, r9, r8, r7)
            goto L_0x0066
        L_0x01ec:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            androidx.datastore.preferences.protobuf.C2644z0.m6353L(r9, r8, r15, r10)
            goto L_0x0066
        L_0x0201:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0212:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0223:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0234:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0245:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0256:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0267:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0278:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0289:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r9, r8, r15, r4)
            goto L_0x0066
        L_0x029a:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ab:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02bc:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02cd:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02de:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ef:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0300:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0311:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0322:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0333:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0344:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0355:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6347F(r9, r8, r15)
            goto L_0x0066
        L_0x0366:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            androidx.datastore.preferences.protobuf.C2644z0.m6356O(r9, r8, r15, r10)
            goto L_0x0066
        L_0x037b:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6361T(r9, r8, r15)
            goto L_0x0066
        L_0x038c:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r9, r8, r15, r3)
            goto L_0x0066
        L_0x039d:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03ae:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03bf:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03d0:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03e1:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r9, r8, r15, r3)
            goto L_0x0066
        L_0x03f2:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0403:
            int[] r9 = r13.f5924a
            r9 = r9[r7]
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r9, r8, r15, r3)
            goto L_0x0066
        L_0x0414:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            r15.mo9805h(r9, r10, r8)
            goto L_0x0066
        L_0x0429:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r10, r14)
            r15.mo9813p(r9, r10)
            goto L_0x0066
        L_0x043a:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9812o(r9, r8)
            goto L_0x0066
        L_0x044b:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r10, r14)
            r15.mo9811n(r9, r10)
            goto L_0x0066
        L_0x045c:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9810m(r9, r8)
            goto L_0x0066
        L_0x046d:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9801d(r9, r8)
            goto L_0x0066
        L_0x047e:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9814q(r9, r8)
            goto L_0x0066
        L_0x048f:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.ByteString r8 = (androidx.datastore.preferences.protobuf.ByteString) r8
            r15.mo9799b(r9, r8)
            goto L_0x0066
        L_0x04a2:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            androidx.datastore.preferences.protobuf.y0 r10 = r13.mo9853o(r7)
            r15.mo9808k(r9, r10, r8)
            goto L_0x0066
        L_0x04b7:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r10, r14)
            m6170V(r9, r8, r15)
            goto L_0x0066
        L_0x04c8:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            boolean r8 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r10, r14)
            r15.mo9798a(r9, r8)
            goto L_0x0066
        L_0x04d9:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9802e(r9, r8)
            goto L_0x0066
        L_0x04ea:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r10, r14)
            r15.mo9803f(r9, r10)
            goto L_0x0066
        L_0x04fb:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            int r8 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r10, r14)
            r15.mo9806i(r9, r8)
            goto L_0x0066
        L_0x050c:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r10, r14)
            r15.mo9815r(r9, r10)
            goto L_0x0066
        L_0x051d:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            long r10 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r10, r14)
            r15.mo9807j(r9, r10)
            goto L_0x0066
        L_0x052e:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            float r8 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r10, r14)
            r15.mo9804g(r8, r9)
            goto L_0x0066
        L_0x053f:
            boolean r10 = r13.mo9856s(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r2
            long r10 = (long) r8
            double r10 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r10, r14)
            r15.mo9800c(r9, r10)
            goto L_0x0066
        L_0x0550:
            if (r0 == 0) goto L_0x0a98
            androidx.datastore.preferences.protobuf.p<?> r14 = r13.f5939p
            r14.mo9874j(r0)
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
            boolean r0 = r13.f5931h
            if (r0 == 0) goto L_0x0a95
            boolean r0 = r13.f5929f
            if (r0 == 0) goto L_0x0586
            androidx.datastore.preferences.protobuf.p<?> r0 = r13.f5939p
            androidx.datastore.preferences.protobuf.s r0 = r0.mo9867c(r14)
            boolean r1 = r0.mo9881h()
            if (r1 != 0) goto L_0x0586
            java.util.Iterator r0 = r0.mo9884k()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0588
        L_0x0586:
            r0 = r6
            r1 = r0
        L_0x0588:
            int[] r7 = r13.f5924a
            int r7 = r7.length
            r8 = r3
        L_0x058c:
            if (r8 >= r7) goto L_0x0a75
            int r9 = r13.mo9836S(r8)
            int[] r10 = r13.f5924a
            r10 = r10[r8]
        L_0x0596:
            if (r1 == 0) goto L_0x05b3
            androidx.datastore.preferences.protobuf.p<?> r11 = r13.f5939p
            r11.mo9865a(r1)
            if (r10 < 0) goto L_0x05b3
            androidx.datastore.preferences.protobuf.p<?> r11 = r13.f5939p
            r11.mo9874j(r1)
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
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            r15.mo9805h(r10, r11, r9)
            goto L_0x0a71
        L_0x05d1:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m6167D(r11, r14)
            r15.mo9813p(r10, r11)
            goto L_0x0a71
        L_0x05e2:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9812o(r10, r9)
            goto L_0x0a71
        L_0x05f3:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m6167D(r11, r14)
            r15.mo9811n(r10, r11)
            goto L_0x0a71
        L_0x0604:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9810m(r10, r9)
            goto L_0x0a71
        L_0x0615:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9801d(r10, r9)
            goto L_0x0a71
        L_0x0626:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9814q(r10, r9)
            goto L_0x0a71
        L_0x0637:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.ByteString r9 = (androidx.datastore.preferences.protobuf.ByteString) r9
            r15.mo9799b(r10, r9)
            goto L_0x0a71
        L_0x064a:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            r15.mo9808k(r10, r11, r9)
            goto L_0x0a71
        L_0x065f:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            m6170V(r10, r9, r15)
            goto L_0x0a71
        L_0x0670:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15.mo9798a(r10, r9)
            goto L_0x0a71
        L_0x0687:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9802e(r10, r9)
            goto L_0x0a71
        L_0x0698:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m6167D(r11, r14)
            r15.mo9803f(r10, r11)
            goto L_0x0a71
        L_0x06a9:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = m6166C(r11, r14)
            r15.mo9806i(r10, r9)
            goto L_0x0a71
        L_0x06ba:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m6167D(r11, r14)
            r15.mo9815r(r10, r11)
            goto L_0x0a71
        L_0x06cb:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = m6167D(r11, r14)
            r15.mo9807j(r10, r11)
            goto L_0x0a71
        L_0x06dc:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r15.mo9804g(r9, r10)
            goto L_0x0a71
        L_0x06f3:
            boolean r11 = r13.mo9857t(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            r15.mo9800c(r10, r11)
            goto L_0x0a71
        L_0x070a:
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            r13.mo9838U(r15, r10, r9, r8)
            goto L_0x0a71
        L_0x0715:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            androidx.datastore.preferences.protobuf.C2644z0.m6353L(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x072a:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x073b:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x074c:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x075d:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x076e:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x077f:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0790:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07a1:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07b2:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07c3:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07d4:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07e5:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07f6:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0807:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0818:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6360S(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x0829:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6359R(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x083a:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6358Q(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x084b:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6357P(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x085c:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6349H(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x086d:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6362U(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x087e:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6347F(r10, r9, r15)
            goto L_0x0a71
        L_0x088f:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            androidx.datastore.preferences.protobuf.C2644z0.m6356O(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x08a4:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6361T(r10, r9, r15)
            goto L_0x0a71
        L_0x08b5:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6346E(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08c6:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6350I(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08d7:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6351J(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08e8:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6354M(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x08f9:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6363V(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x090a:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6355N(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x091b:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6352K(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x092c:
            int[] r10 = r13.f5924a
            r10 = r10[r8]
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.C2644z0.m6348G(r10, r9, r15, r3)
            goto L_0x0a71
        L_0x093d:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            r15.mo9805h(r10, r11, r9)
            goto L_0x0a71
        L_0x0952:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r11, r14)
            r15.mo9813p(r10, r11)
            goto L_0x0a71
        L_0x0963:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9812o(r10, r9)
            goto L_0x0a71
        L_0x0974:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r11, r14)
            r15.mo9811n(r10, r11)
            goto L_0x0a71
        L_0x0985:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9810m(r10, r9)
            goto L_0x0a71
        L_0x0996:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9801d(r10, r9)
            goto L_0x0a71
        L_0x09a7:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9814q(r10, r9)
            goto L_0x0a71
        L_0x09b8:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.ByteString r9 = (androidx.datastore.preferences.protobuf.ByteString) r9
            r15.mo9799b(r10, r9)
            goto L_0x0a71
        L_0x09cb:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            androidx.datastore.preferences.protobuf.y0 r11 = r13.mo9853o(r8)
            r15.mo9808k(r10, r11, r9)
            goto L_0x0a71
        L_0x09e0:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r11, r14)
            m6170V(r10, r9, r15)
            goto L_0x0a71
        L_0x09f1:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            boolean r9 = androidx.datastore.preferences.protobuf.C2586h1.m5827f(r11, r14)
            r15.mo9798a(r10, r9)
            goto L_0x0a71
        L_0x0a02:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9802e(r10, r9)
            goto L_0x0a71
        L_0x0a12:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r11, r14)
            r15.mo9803f(r10, r11)
            goto L_0x0a71
        L_0x0a22:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            int r9 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r11, r14)
            r15.mo9806i(r10, r9)
            goto L_0x0a71
        L_0x0a32:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r11, r14)
            r15.mo9815r(r10, r11)
            goto L_0x0a71
        L_0x0a42:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            long r11 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r11, r14)
            r15.mo9807j(r10, r11)
            goto L_0x0a71
        L_0x0a52:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            float r9 = androidx.datastore.preferences.protobuf.C2586h1.m5833l(r11, r14)
            r15.mo9804g(r9, r10)
            goto L_0x0a71
        L_0x0a62:
            boolean r11 = r13.mo9856s(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r2
            long r11 = (long) r9
            double r11 = androidx.datastore.preferences.protobuf.C2586h1.m5832k(r11, r14)
            r15.mo9800c(r10, r11)
        L_0x0a71:
            int r8 = r8 + 3
            goto L_0x058c
        L_0x0a75:
            if (r1 == 0) goto L_0x0a8b
            androidx.datastore.preferences.protobuf.p<?> r2 = r13.f5939p
            r2.mo9874j(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a89
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a75
        L_0x0a89:
            r1 = r6
            goto L_0x0a75
        L_0x0a8b:
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r13.f5938o
            androidx.datastore.preferences.protobuf.e1 r14 = r0.mo9628g(r14)
            r0.mo9640s(r14, r15)
            goto L_0x0a98
        L_0x0a95:
            r13.mo9837T(r14, r15)
        L_0x0a98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9846h(java.lang.Object, androidx.datastore.preferences.protobuf.k):void");
    }

    /* renamed from: i */
    public final void mo9847i(T t, byte[] bArr, int i, int i2, C2571e.C2572a aVar) throws IOException {
        if (this.f5931h) {
            mo9827H(t, bArr, i, i2, aVar);
        } else {
            mo9826G(t, bArr, i, i2, 0, aVar);
        }
    }

    /* renamed from: j */
    public final boolean mo9848j(int i, Object obj, Object obj2) {
        return mo9856s(i, obj) == mo9856s(i, obj2);
    }

    /* renamed from: l */
    public final <UT, UB> UB mo9849l(Object obj, int i, UB ub, C2570d1<UT, UB> d1Var) {
        C2631w.C2634c m;
        int i2 = this.f5924a[i];
        Object o = C2586h1.m5836o((long) (mo9836S(i) & 1048575), obj);
        if (o == null || (m = mo9850m(i)) == null) {
            return ub;
        }
        MapFieldLite c = this.f5940q.mo9656c(o);
        C2573e0.C2574a<?, ?> b = this.f5940q.mo9655b(mo9851n(i));
        Iterator it = c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!m.mo9451a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = d1Var.mo9634m();
                }
                ByteString.C2510g newCodedBuilder = ByteString.newCodedBuilder(C2573e0.m5774a(b, entry.getKey(), entry.getValue()));
                try {
                    C2573e0.m5775b(newCodedBuilder.f5774a, b, entry.getKey(), entry.getValue());
                    if (newCodedBuilder.f5774a.mo9443W() == 0) {
                        d1Var.mo9625d(ub, i2, new ByteString.LiteralByteString(newCodedBuilder.f5775b));
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

    /* renamed from: m */
    public final C2631w.C2634c mo9850m(int i) {
        return (C2631w.C2634c) this.f5925b[((i / 3) * 2) + 1];
    }

    /* renamed from: n */
    public final Object mo9851n(int i) {
        return this.f5925b[(i / 3) * 2];
    }

    public final T newInstance() {
        return this.f5936m.mo9875a(this.f5928e);
    }

    /* renamed from: o */
    public final C2642y0 mo9853o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f5925b;
        C2642y0 y0Var = (C2642y0) objArr[i2];
        if (y0Var != null) {
            return y0Var;
        }
        C2642y0 a = C2628u0.f5965c.mo9895a((Class) objArr[i2 + 1]);
        this.f5925b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0335, code lost:
        r3 = android.support.p013v4.media.C0069a.m171b(r7, r6, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04a6, code lost:
        r3 = r5 + r3;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9854q(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f5923s
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int[] r5 = r14.f5924a
            int r5 = r5.length
            if (r2 >= r5) goto L_0x0501
            int r5 = r14.mo9836S(r2)
            int[] r6 = r14.f5924a
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
            boolean r6 = r14.f5932i
            if (r6 == 0) goto L_0x004f
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo9453id()
            if (r8 < r6) goto L_0x004f
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo9453id()
            if (r8 > r6) goto L_0x004f
            int[] r6 = r14.f5924a
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
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.k0 r5 = (androidx.datastore.preferences.protobuf.C2602k0) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5504j(r7, r5, r6)
            goto L_0x04fc
        L_0x006e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m6167D(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5512r(r7, r5)
            goto L_0x04fc
        L_0x007e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m6166C(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5511q(r7, r5)
            goto L_0x04fc
        L_0x008e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5510p(r7)
            goto L_0x04fc
        L_0x009a:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5509o(r7)
            goto L_0x04fc
        L_0x00a6:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m6166C(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5500f(r7, r5)
            goto L_0x04fc
        L_0x00b6:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m6166C(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5516v(r7, r5)
            goto L_0x04fc
        L_0x00c6:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.ByteString r5 = (androidx.datastore.preferences.protobuf.ByteString) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r7, r5)
            goto L_0x04fc
        L_0x00d8:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6378o(r7, r6, r5)
            goto L_0x04fc
        L_0x00ec:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            boolean r6 = r5 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r6 == 0) goto L_0x0102
            androidx.datastore.preferences.protobuf.ByteString r5 = (androidx.datastore.preferences.protobuf.ByteString) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r7, r5)
            goto L_0x04a6
        L_0x0102:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5513s(r7, r5)
            goto L_0x04a6
        L_0x010a:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5497c(r7)
            goto L_0x04fc
        L_0x0116:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5501g(r7)
            goto L_0x04fc
        L_0x0122:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5502h(r7)
            goto L_0x04fc
        L_0x012e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = m6166C(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5505k(r7, r5)
            goto L_0x04fc
        L_0x013e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m6167D(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5518x(r7, r5)
            goto L_0x04fc
        L_0x014e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            long r5 = m6167D(r11, r15)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5507m(r7, r5)
            goto L_0x04fc
        L_0x015e:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5503i(r7)
            goto L_0x04fc
        L_0x016a:
            boolean r5 = r14.mo9857t(r7, r2, r15)
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5499e(r7)
            goto L_0x04fc
        L_0x0176:
            androidx.datastore.preferences.protobuf.f0 r5 = r14.f5940q
            java.lang.Object r6 = r0.getObject(r15, r11)
            java.lang.Object r8 = r14.mo9851n(r2)
            int r5 = r5.mo9660g(r7, r6, r8)
            goto L_0x04fc
        L_0x0186:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6373j(r7, r5, r6)
            goto L_0x04fc
        L_0x0196:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6383t(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x01aa
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01aa:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x01b4:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6381r(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x01c8
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01c8:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x01d2:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x01e6
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01e6:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x01f0:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x0204
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0204:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x020e:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6368e(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x0222
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0222:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x022c:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6386w(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x0240
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0240:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x024a:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6365b(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x025e
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x025e:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x0268:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x027c
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x027c:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x0286:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x029a
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x029a:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x02a4:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6375l(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x02b8
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02b8:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x02c2:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6388y(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x02d6
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02d6:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x02df:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6377n(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x02f3
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02f3:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x02fc:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x0310
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0310:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0335
        L_0x0319:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04fd
            boolean r8 = r14.f5932i
            if (r8 == 0) goto L_0x032d
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x032d:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r7)
            int r7 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
        L_0x0335:
            int r3 = android.support.p013v4.media.C0069a.m171b(r7, r6, r5, r3)
            goto L_0x04fd
        L_0x033b:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6382s(r7, r5)
            goto L_0x04fc
        L_0x0347:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6380q(r7, r5)
            goto L_0x04fc
        L_0x0353:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r7, r5)
            goto L_0x04fc
        L_0x035f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r7, r5)
            goto L_0x04fc
        L_0x036b:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6367d(r7, r5)
            goto L_0x04fc
        L_0x0377:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6385v(r7, r5)
            goto L_0x04fc
        L_0x0383:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6366c(r7, r5)
            goto L_0x04fc
        L_0x038f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6379p(r7, r5, r6)
            goto L_0x04fc
        L_0x039f:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6384u(r7, r5)
            goto L_0x04fc
        L_0x03ab:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6364a(r7, r5)
            goto L_0x04fc
        L_0x03b7:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r7, r5)
            goto L_0x04fc
        L_0x03c3:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r7, r5)
            goto L_0x04fc
        L_0x03cf:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6374k(r7, r5)
            goto L_0x04fc
        L_0x03db:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6387x(r7, r5)
            goto L_0x04fc
        L_0x03e7:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6376m(r7, r5)
            goto L_0x04fc
        L_0x03f3:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r7, r5)
            goto L_0x04fc
        L_0x03ff:
            java.lang.Object r5 = r0.getObject(r15, r11)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r7, r5)
            goto L_0x04fc
        L_0x040b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.k0 r5 = (androidx.datastore.preferences.protobuf.C2602k0) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5504j(r7, r5, r6)
            goto L_0x04fc
        L_0x041f:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5512r(r7, r5)
            goto L_0x04fc
        L_0x042d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5511q(r7, r5)
            goto L_0x04fc
        L_0x043b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5510p(r7)
            goto L_0x04fc
        L_0x0445:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5509o(r7)
            goto L_0x04fc
        L_0x044f:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5500f(r7, r5)
            goto L_0x04fc
        L_0x045d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5516v(r7, r5)
            goto L_0x04fc
        L_0x046b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.ByteString r5 = (androidx.datastore.preferences.protobuf.ByteString) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r7, r5)
            goto L_0x04fc
        L_0x047b:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            androidx.datastore.preferences.protobuf.y0 r6 = r14.mo9853o(r2)
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6378o(r7, r6, r5)
            goto L_0x04fc
        L_0x048d:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r5 = r0.getObject(r15, r11)
            boolean r6 = r5 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r6 == 0) goto L_0x04a0
            androidx.datastore.preferences.protobuf.ByteString r5 = (androidx.datastore.preferences.protobuf.ByteString) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r7, r5)
            goto L_0x04a6
        L_0x04a0:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5513s(r7, r5)
        L_0x04a6:
            int r5 = r5 + r3
            r3 = r5
            goto L_0x04fd
        L_0x04a9:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5497c(r7)
            goto L_0x04fc
        L_0x04b2:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5501g(r7)
            goto L_0x04fc
        L_0x04bb:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5502h(r7)
            goto L_0x04fc
        L_0x04c4:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = r0.getInt(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5505k(r7, r5)
            goto L_0x04fc
        L_0x04d1:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5518x(r7, r5)
            goto L_0x04fc
        L_0x04de:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            long r5 = r0.getLong(r15, r11)
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5507m(r7, r5)
            goto L_0x04fc
        L_0x04eb:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5503i(r7)
            goto L_0x04fc
        L_0x04f4:
            r5 = r4 & r10
            if (r5 == 0) goto L_0x04fd
            int r5 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5499e(r7)
        L_0x04fc:
            int r3 = r3 + r5
        L_0x04fd:
            int r2 = r2 + 3
            goto L_0x0006
        L_0x0501:
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r14.f5938o
            androidx.datastore.preferences.protobuf.e1 r1 = r0.mo9628g(r15)
            int r0 = r0.mo9629h(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f5929f
            if (r1 == 0) goto L_0x051b
            androidx.datastore.preferences.protobuf.p<?> r1 = r14.f5939p
            androidx.datastore.preferences.protobuf.s r15 = r1.mo9867c(r15)
            int r15 = r15.mo9880g()
            int r0 = r0 + r15
        L_0x051b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9854q(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3);
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9855r(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f5923s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f5924a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e2
            int r4 = r11.mo9836S(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f5924a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            androidx.datastore.preferences.protobuf.FieldType r4 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r4 = r4.mo9453id()
            if (r5 < r4) goto L_0x0034
            androidx.datastore.preferences.protobuf.FieldType r4 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r4 = r4.mo9453id()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f5924a
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
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.k0 r4 = (androidx.datastore.preferences.protobuf.C2602k0) r4
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5504j(r6, r4, r5)
            goto L_0x04dd
        L_0x0050:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m6167D(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5512r(r6, r4)
            goto L_0x04dd
        L_0x0060:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m6166C(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5511q(r6, r4)
            goto L_0x04dd
        L_0x0070:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5510p(r6)
            goto L_0x04dd
        L_0x007c:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5509o(r6)
            goto L_0x04dd
        L_0x0088:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m6166C(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5500f(r6, r4)
            goto L_0x04dd
        L_0x0098:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m6166C(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5516v(r6, r4)
            goto L_0x04dd
        L_0x00a8:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r6, r4)
            goto L_0x04dd
        L_0x00ba:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6378o(r6, r5, r4)
            goto L_0x04dd
        L_0x00ce:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            boolean r5 = r4 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r5 == 0) goto L_0x00e4
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r6, r4)
            goto L_0x04dd
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5513s(r6, r4)
            goto L_0x04dd
        L_0x00ec:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5497c(r6)
            goto L_0x04dd
        L_0x00f8:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5501g(r6)
            goto L_0x04dd
        L_0x0104:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5502h(r6)
            goto L_0x04dd
        L_0x0110:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = m6166C(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5505k(r6, r4)
            goto L_0x04dd
        L_0x0120:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m6167D(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5518x(r6, r4)
            goto L_0x04dd
        L_0x0130:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = m6167D(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5507m(r6, r4)
            goto L_0x04dd
        L_0x0140:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5503i(r6)
            goto L_0x04dd
        L_0x014c:
            boolean r4 = r11.mo9857t(r6, r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5499e(r6)
            goto L_0x04dd
        L_0x0158:
            androidx.datastore.preferences.protobuf.f0 r4 = r11.f5940q
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            java.lang.Object r7 = r11.mo9851n(r2)
            int r4 = r4.mo9660g(r6, r5, r7)
            goto L_0x04dd
        L_0x0168:
            java.util.List r4 = m6173u(r8, r12)
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6373j(r6, r4, r5)
            goto L_0x04dd
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6383t(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6381r(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6368e(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6386w(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6365b(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6375l(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6388y(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6377n(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6370g(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.C2644z0.m6372i(r5)
            if (r5 <= 0) goto L_0x04de
            boolean r7 = r11.f5932i
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5515u(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5517w(r5)
        L_0x0315:
            int r3 = android.support.p013v4.media.C0069a.m171b(r6, r4, r5, r3)
            goto L_0x04de
        L_0x031b:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6382s(r6, r4)
            goto L_0x04dd
        L_0x0325:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6380q(r6, r4)
            goto L_0x04dd
        L_0x032f:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r6, r4)
            goto L_0x04dd
        L_0x0339:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r6, r4)
            goto L_0x04dd
        L_0x0343:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6367d(r6, r4)
            goto L_0x04dd
        L_0x034d:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6385v(r6, r4)
            goto L_0x04dd
        L_0x0357:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6366c(r6, r4)
            goto L_0x04dd
        L_0x0361:
            java.util.List r4 = m6173u(r8, r12)
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6379p(r6, r4, r5)
            goto L_0x04dd
        L_0x036f:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6384u(r6, r4)
            goto L_0x04dd
        L_0x0379:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6364a(r6, r4)
            goto L_0x04dd
        L_0x0383:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r6, r4)
            goto L_0x04dd
        L_0x038d:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r6, r4)
            goto L_0x04dd
        L_0x0397:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6374k(r6, r4)
            goto L_0x04dd
        L_0x03a1:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6387x(r6, r4)
            goto L_0x04dd
        L_0x03ab:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6376m(r6, r4)
            goto L_0x04dd
        L_0x03b5:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6369f(r6, r4)
            goto L_0x04dd
        L_0x03bf:
            java.util.List r4 = m6173u(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6371h(r6, r4)
            goto L_0x04dd
        L_0x03c9:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.k0 r4 = (androidx.datastore.preferences.protobuf.C2602k0) r4
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5504j(r6, r4, r5)
            goto L_0x04dd
        L_0x03df:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5512r(r6, r4)
            goto L_0x04dd
        L_0x03ef:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5511q(r6, r4)
            goto L_0x04dd
        L_0x03ff:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5510p(r6)
            goto L_0x04dd
        L_0x040b:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5509o(r6)
            goto L_0x04dd
        L_0x0417:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5500f(r6, r4)
            goto L_0x04dd
        L_0x0427:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5516v(r6, r4)
            goto L_0x04dd
        L_0x0437:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r6, r4)
            goto L_0x04dd
        L_0x0449:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            androidx.datastore.preferences.protobuf.y0 r5 = r11.mo9853o(r2)
            int r4 = androidx.datastore.preferences.protobuf.C2644z0.m6378o(r6, r5, r4)
            goto L_0x04dd
        L_0x045d:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r8, r12)
            boolean r5 = r4 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r5 == 0) goto L_0x0473
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5498d(r6, r4)
            goto L_0x04dd
        L_0x0473:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5513s(r6, r4)
            goto L_0x04dd
        L_0x047a:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5497c(r6)
            goto L_0x04dd
        L_0x0485:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5501g(r6)
            goto L_0x04dd
        L_0x0490:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5502h(r6)
            goto L_0x04dd
        L_0x049b:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.C2586h1.m5834m(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5505k(r6, r4)
            goto L_0x04dd
        L_0x04aa:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5518x(r6, r4)
            goto L_0x04dd
        L_0x04b9:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            long r4 = androidx.datastore.preferences.protobuf.C2586h1.m5835n(r8, r12)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5507m(r6, r4)
            goto L_0x04dd
        L_0x04c8:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5503i(r6)
            goto L_0x04dd
        L_0x04d3:
            boolean r4 = r11.mo9856s(r2, r12)
            if (r4 == 0) goto L_0x04de
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m5499e(r6)
        L_0x04dd:
            int r3 = r3 + r4
        L_0x04de:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e2:
            androidx.datastore.preferences.protobuf.d1<?, ?> r0 = r11.f5938o
            androidx.datastore.preferences.protobuf.e1 r12 = r0.mo9628g(r12)
            int r12 = r0.mo9629h(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9855r(java.lang.Object):int");
    }

    /* renamed from: s */
    public final boolean mo9856s(int i, Object obj) {
        boolean equals;
        if (this.f5931h) {
            int S = mo9836S(i);
            long j = (long) (S & 1048575);
            switch ((S & 267386880) >>> 20) {
                case 0:
                    return C2586h1.m5832k(j, obj) != ShadowDrawableWrapper.COS_45;
                case 1:
                    return C2586h1.m5833l(j, obj) != 0.0f;
                case 2:
                    return C2586h1.m5835n(j, obj) != 0;
                case 3:
                    return C2586h1.m5835n(j, obj) != 0;
                case 4:
                    return C2586h1.m5834m(j, obj) != 0;
                case 5:
                    return C2586h1.m5835n(j, obj) != 0;
                case 6:
                    return C2586h1.m5834m(j, obj) != 0;
                case 7:
                    return C2586h1.m5827f(j, obj);
                case 8:
                    Object o = C2586h1.m5836o(j, obj);
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
                    return C2586h1.m5836o(j, obj) != null;
                case 10:
                    equals = ByteString.EMPTY.equals(C2586h1.m5836o(j, obj));
                    break;
                case 11:
                    return C2586h1.m5834m(j, obj) != 0;
                case 12:
                    return C2586h1.m5834m(j, obj) != 0;
                case 13:
                    return C2586h1.m5834m(j, obj) != 0;
                case 14:
                    return C2586h1.m5835n(j, obj) != 0;
                case 15:
                    return C2586h1.m5834m(j, obj) != 0;
                case 16:
                    return C2586h1.m5835n(j, obj) != 0;
                case 17:
                    return C2586h1.m5836o(j, obj) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int i2 = this.f5924a[i + 2];
        return (C2586h1.m5834m((long) (i2 & 1048575), obj) & (1 << (i2 >>> 20))) != 0;
    }

    /* renamed from: t */
    public final boolean mo9857t(int i, int i2, Object obj) {
        return C2586h1.m5834m((long) (this.f5924a[i2 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: v */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.C2621s.C2623b<ET>> void mo9858v(androidx.datastore.preferences.protobuf.C2570d1<UT, UB> r17, androidx.datastore.preferences.protobuf.C2614p<ET> r18, T r19, androidx.datastore.preferences.protobuf.C2640x0 r20, androidx.datastore.preferences.protobuf.C2611o r21) throws java.io.IOException {
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
            int r1 = r20.mo9797z()     // Catch:{ all -> 0x05e5 }
            int r2 = r8.f5926c     // Catch:{ all -> 0x05e5 }
            if (r1 < r2) goto L_0x0021
            int r2 = r8.f5927d     // Catch:{ all -> 0x05e5 }
            if (r1 > r2) goto L_0x0021
            r2 = 0
            int r2 = r8.mo9835Q(r1, r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x0022
        L_0x0021:
            r2 = -1
        L_0x0022:
            r3 = r2
            if (r3 >= 0) goto L_0x0083
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0041
            int r0 = r8.f5934k
        L_0x002c:
            int r1 = r8.f5935l
            if (r0 >= r1) goto L_0x003b
            int[] r1 = r8.f5933j
            r1 = r1[r0]
            java.lang.Object r14 = r8.mo9849l(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x002c
        L_0x003b:
            if (r14 == 0) goto L_0x0040
            r9.mo9635n(r10, r14)
        L_0x0040:
            return
        L_0x0041:
            boolean r2 = r8.f5929f     // Catch:{ all -> 0x05e5 }
            if (r2 != 0) goto L_0x0047
            r1 = r13
            goto L_0x004d
        L_0x0047:
            androidx.datastore.preferences.protobuf.k0 r2 = r8.f5928e     // Catch:{ all -> 0x05e5 }
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$e r1 = r0.mo9866b(r12, r2, r1)     // Catch:{ all -> 0x05e5 }
        L_0x004d:
            if (r1 == 0) goto L_0x005b
            if (r15 != 0) goto L_0x0056
            androidx.datastore.preferences.protobuf.s r2 = r18.mo9868d(r19)     // Catch:{ all -> 0x05e5 }
            r15 = r2
        L_0x0056:
            java.lang.Object r14 = r0.mo9871g(r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x000f
        L_0x005b:
            r17.mo9637p()     // Catch:{ all -> 0x05e5 }
            if (r14 != 0) goto L_0x0065
            androidx.datastore.preferences.protobuf.e1 r1 = r9.mo9627f(r10)     // Catch:{ all -> 0x05e5 }
            r14 = r1
        L_0x0065:
            boolean r1 = r9.mo9633l(r14, r11)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x006c
            goto L_0x000f
        L_0x006c:
            int r0 = r8.f5934k
        L_0x006e:
            int r1 = r8.f5935l
            if (r0 >= r1) goto L_0x007d
            int[] r1 = r8.f5933j
            r1 = r1[r0]
            java.lang.Object r14 = r8.mo9849l(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x006e
        L_0x007d:
            if (r14 == 0) goto L_0x0082
            r9.mo9635n(r10, r14)
        L_0x0082:
            return
        L_0x0083:
            int r4 = r8.mo9836S(r3)     // Catch:{ all -> 0x05e5 }
            int r2 = m6169R(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            switch(r2) {
                case 0: goto L_0x0590;
                case 1: goto L_0x0580;
                case 2: goto L_0x0570;
                case 3: goto L_0x0560;
                case 4: goto L_0x0550;
                case 5: goto L_0x0540;
                case 6: goto L_0x0530;
                case 7: goto L_0x0520;
                case 8: goto L_0x0518;
                case 9: goto L_0x04e1;
                case 10: goto L_0x04d1;
                case 11: goto L_0x04c1;
                case 12: goto L_0x049e;
                case 13: goto L_0x048e;
                case 14: goto L_0x047e;
                case 15: goto L_0x046e;
                case 16: goto L_0x045e;
                case 17: goto L_0x0427;
                case 18: goto L_0x0418;
                case 19: goto L_0x0409;
                case 20: goto L_0x03fa;
                case 21: goto L_0x03eb;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03cd;
                case 24: goto L_0x03be;
                case 25: goto L_0x03af;
                case 26: goto L_0x03aa;
                case 27: goto L_0x0398;
                case 28: goto L_0x0389;
                case 29: goto L_0x037a;
                case 30: goto L_0x0363;
                case 31: goto L_0x0354;
                case 32: goto L_0x0345;
                case 33: goto L_0x0336;
                case 34: goto L_0x0327;
                case 35: goto L_0x0318;
                case 36: goto L_0x0309;
                case 37: goto L_0x02fa;
                case 38: goto L_0x02eb;
                case 39: goto L_0x02dc;
                case 40: goto L_0x02cd;
                case 41: goto L_0x02be;
                case 42: goto L_0x02af;
                case 43: goto L_0x02a0;
                case 44: goto L_0x0289;
                case 45: goto L_0x027a;
                case 46: goto L_0x026b;
                case 47: goto L_0x025c;
                case 48: goto L_0x024d;
                case 49: goto L_0x0237;
                case 50: goto L_0x0226;
                case 51: goto L_0x0212;
                case 52: goto L_0x01fe;
                case 53: goto L_0x01ea;
                case 54: goto L_0x01d6;
                case 55: goto L_0x01c2;
                case 56: goto L_0x01ae;
                case 57: goto L_0x019a;
                case 58: goto L_0x0186;
                case 59: goto L_0x017e;
                case 60: goto L_0x0145;
                case 61: goto L_0x0135;
                case 62: goto L_0x0121;
                case 63: goto L_0x00fa;
                case 64: goto L_0x00e6;
                case 65: goto L_0x00d2;
                case 66: goto L_0x00be;
                case 67: goto L_0x00aa;
                case 68: goto L_0x0096;
                default: goto L_0x008e;
            }     // Catch:{ InvalidWireTypeException -> 0x05be }
        L_0x008e:
            if (r14 != 0) goto L_0x05a1
            androidx.datastore.preferences.protobuf.e1 r1 = r17.mo9634m()     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x05a0
        L_0x0096:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r2 = r11.mo9758K(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x00aa:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r6 = r20.mo9795x()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x00be:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r2 = r20.mo9780k()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x00d2:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r6 = r20.mo9773e()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x00e6:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r2 = r20.mo9751D()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x00fa:
            int r2 = r20.mo9779j()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.w$c r5 = r8.mo9850m(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r5 == 0) goto L_0x0111
            boolean r5 = r5.mo9451a(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r5 == 0) goto L_0x010b
            goto L_0x0111
        L_0x010b:
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.C2644z0.m6345D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0111:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0121:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r2 = r20.mo9775g()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0135:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.ByteString r2 = r20.mo9783n()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0145:
            boolean r2 = r8.mo9857t(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r2 == 0) goto L_0x0167
            long r5 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r5 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r5 = r11.mo9756I(r5, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x0179
        L_0x0167:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r2 = r11.mo9756I(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
        L_0x0179:
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x017e:
            r8.mo9831L(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0186:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            boolean r2 = r20.mo9772d()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x019a:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r2 = r20.mo9791t()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x01ae:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r6 = r20.mo9769a()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x01c2:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r2 = r20.mo9784o()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x01d6:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r6 = r20.mo9787r()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x01ea:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r6 = r20.mo9754G()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x01fe:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0212:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r4, r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9834P(r1, r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0226:
            java.lang.Object r4 = r8.mo9851n(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo9859w(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0237:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r6 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo9829J(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x024d:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9771c(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x025c:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9786q(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x026b:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9792u(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x027a:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9770b(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0289:
            androidx.datastore.preferences.protobuf.b0 r2 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r2 = r2.mo9554c(r4, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9778i(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.w$c r3 = r8.mo9850m(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.C2644z0.m6389z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02a0:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9790s(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02af:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9781l(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02be:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9794w(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02cd:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9785p(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02dc:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9793v(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02eb:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9774f(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x02fa:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9777h(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0309:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9749B(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0318:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9753F(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0327:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9771c(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0336:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9786q(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0345:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9792u(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0354:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9770b(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0363:
            androidx.datastore.preferences.protobuf.b0 r2 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r2 = r2.mo9554c(r4, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9778i(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.w$c r3 = r8.mo9850m(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.C2644z0.m6389z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x037a:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9790s(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0389:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9752E(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0398:
            androidx.datastore.preferences.protobuf.y0 r5 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo9830K(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03aa:
            r8.mo9832M(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03af:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9781l(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03be:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9794w(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03cd:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9785p(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03dc:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9793v(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03eb:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9774f(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x03fa:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9777h(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0409:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9749B(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0418:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.f5937n     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.util.List r1 = r1.mo9554c(r2, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r11.mo9753F(r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0427:
            boolean r1 = r8.mo9856s(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r1 == 0) goto L_0x044a
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r1, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r2 = r11.mo9758K(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r2, r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x044a:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r4 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r4 = r11.mo9758K(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x045e:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = r20.mo9795x()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5845x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x046e:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r4 = r20.mo9780k()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x047e:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = r20.mo9773e()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5845x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x048e:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r4 = r20.mo9751D()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x049e:
            int r2 = r20.mo9779j()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.w$c r5 = r8.mo9850m(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r5 == 0) goto L_0x04b5
            boolean r5 = r5.mo9451a(r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r5 == 0) goto L_0x04af
            goto L_0x04b5
        L_0x04af:
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.C2644z0.m6345D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x04b5:
            long r4 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x04c1:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r4 = r20.mo9775g()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x04d1:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.ByteString r4 = r20.mo9783n()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x04e1:
            boolean r1 = r8.mo9856s(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r1 == 0) goto L_0x0504
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r1, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r2 = r11.mo9756I(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.C2631w.m6277b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r2 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r2, r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0504:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.y0 r4 = r8.mo9853o(r3)     // Catch:{ InvalidWireTypeException -> 0x05be }
            java.lang.Object r4 = r11.mo9756I(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5846y(r1, r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0518:
            r8.mo9831L(r10, r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0520:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            boolean r4 = r20.mo9772d()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5838q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0530:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r4 = r20.mo9791t()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0540:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = r20.mo9769a()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5845x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0550:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            int r4 = r20.mo9784o()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5844w(r10, r4, r1)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0560:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = r20.mo9787r()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5845x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0570:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            long r4 = r20.mo9754G()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5845x(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0580:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5843v(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x0590:
            long r1 = m6165B(r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05be }
            androidx.datastore.preferences.protobuf.C2586h1.m5842u(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05be }
            r8.mo9833O(r3, r10)     // Catch:{ InvalidWireTypeException -> 0x05be }
            goto L_0x000f
        L_0x05a0:
            r14 = r1
        L_0x05a1:
            boolean r1 = r9.mo9633l(r14, r11)     // Catch:{ InvalidWireTypeException -> 0x05be }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f5934k
        L_0x05a9:
            int r1 = r8.f5935l
            if (r0 >= r1) goto L_0x05b8
            int[] r1 = r8.f5933j
            r1 = r1[r0]
            java.lang.Object r14 = r8.mo9849l(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05a9
        L_0x05b8:
            if (r14 == 0) goto L_0x05bd
            r9.mo9635n(r10, r14)
        L_0x05bd:
            return
        L_0x05be:
            r17.mo9637p()     // Catch:{ all -> 0x05e5 }
            if (r14 != 0) goto L_0x05c8
            androidx.datastore.preferences.protobuf.e1 r1 = r9.mo9627f(r10)     // Catch:{ all -> 0x05e5 }
            r14 = r1
        L_0x05c8:
            boolean r1 = r9.mo9633l(r14, r11)     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f5934k
        L_0x05d0:
            int r1 = r8.f5935l
            if (r0 >= r1) goto L_0x05df
            int[] r1 = r8.f5933j
            r1 = r1[r0]
            java.lang.Object r14 = r8.mo9849l(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05d0
        L_0x05df:
            if (r14 == 0) goto L_0x05e4
            r9.mo9635n(r10, r14)
        L_0x05e4:
            return
        L_0x05e5:
            r0 = move-exception
            int r1 = r8.f5934k
        L_0x05e8:
            int r2 = r8.f5935l
            if (r1 >= r2) goto L_0x05f7
            int[] r2 = r8.f5933j
            r2 = r2[r1]
            java.lang.Object r14 = r8.mo9849l(r10, r2, r14, r9)
            int r1 = r1 + 1
            goto L_0x05e8
        L_0x05f7:
            if (r14 == 0) goto L_0x05fc
            r9.mo9635n(r10, r14)
        L_0x05fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2609n0.mo9858v(androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.x0, androidx.datastore.preferences.protobuf.o):void");
    }

    /* renamed from: w */
    public final <K, V> void mo9859w(Object obj, int i, Object obj2, C2611o oVar, C2640x0 x0Var) throws IOException {
        long S = (long) (mo9836S(i) & 1048575);
        Object o = C2586h1.m5836o(S, obj);
        if (o == null) {
            o = this.f5940q.mo9659f();
            C2586h1.m5846y(S, obj, o);
        } else if (this.f5940q.mo9661h(o)) {
            MapFieldLite f = this.f5940q.mo9659f();
            this.f5940q.mo9654a(f, o);
            C2586h1.m5846y(S, obj, f);
            o = f;
        }
        x0Var.mo9759L(this.f5940q.mo9656c(o), this.f5940q.mo9655b(obj2), oVar);
    }

    /* renamed from: x */
    public final void mo9860x(int i, Object obj, Object obj2) {
        long S = (long) (mo9836S(i) & 1048575);
        if (mo9856s(i, obj2)) {
            Object o = C2586h1.m5836o(S, obj);
            Object o2 = C2586h1.m5836o(S, obj2);
            if (o != null && o2 != null) {
                C2586h1.m5846y(S, obj, C2631w.m6277b(o, o2));
                mo9833O(i, obj);
            } else if (o2 != null) {
                C2586h1.m5846y(S, obj, o2);
                mo9833O(i, obj);
            }
        }
    }

    /* renamed from: y */
    public final void mo9861y(int i, Object obj, Object obj2) {
        int S = mo9836S(i);
        int i2 = this.f5924a[i];
        long j = (long) (S & 1048575);
        if (mo9857t(i2, i, obj2)) {
            Object o = C2586h1.m5836o(j, obj);
            Object o2 = C2586h1.m5836o(j, obj2);
            if (o != null && o2 != null) {
                C2586h1.m5846y(j, obj, C2631w.m6277b(o, o2));
                mo9834P(i2, i, obj);
            } else if (o2 != null) {
                C2586h1.m5846y(j, obj, o2);
                mo9834P(i2, i, obj);
            }
        }
    }
}
