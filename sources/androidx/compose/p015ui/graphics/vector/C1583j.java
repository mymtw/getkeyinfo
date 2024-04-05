package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.C1545s;
import kotlin.collections.EmptyList;

/* renamed from: androidx.compose.ui.graphics.vector.j */
public final class C1583j {

    /* renamed from: a */
    public static final EmptyList f3538a = EmptyList.INSTANCE;

    static {
        int i = C1545s.f3365j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d0, code lost:
        if (r17 == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x00fc A[EDGE_INSN: B:111:0x00fc->B:71:0x00fc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f7 A[LOOP:4: B:43:0x00b3->B:70:0x00f7, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<androidx.compose.p015ui.graphics.vector.C1556d> m3418a(java.lang.String r20) {
        /*
            r0 = r20
            if (r0 != 0) goto L_0x0008
            kotlin.collections.EmptyList r0 = f3538a
            goto L_0x015d
        L_0x0008:
            androidx.compose.ui.graphics.vector.e r1 = new androidx.compose.ui.graphics.vector.e
            r1.<init>()
            java.util.ArrayList r2 = r1.f3519a
            r2.clear()
            r2 = 0
            r3 = 1
            r5 = r2
            r4 = r3
        L_0x0016:
            int r6 = r20.length()
            if (r4 >= r6) goto L_0x0148
        L_0x001c:
            int r6 = r20.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0040
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x0038
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x003d
        L_0x0038:
            if (r6 == r8) goto L_0x003d
            if (r6 == r7) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0040:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            int r9 = r5.length()
            int r9 = r9 - r3
            r10 = r2
            r11 = r10
        L_0x0050:
            r12 = 32
            if (r10 > r9) goto L_0x0075
            if (r11 != 0) goto L_0x0058
            r13 = r10
            goto L_0x0059
        L_0x0058:
            r13 = r9
        L_0x0059:
            char r13 = r5.charAt(r13)
            int r13 = kotlin.jvm.internal.C19383o.m32799i(r13, r12)
            if (r13 > 0) goto L_0x0065
            r13 = r3
            goto L_0x0066
        L_0x0065:
            r13 = r2
        L_0x0066:
            if (r11 != 0) goto L_0x006f
            if (r13 != 0) goto L_0x006c
            r11 = r3
            goto L_0x0050
        L_0x006c:
            int r10 = r10 + 1
            goto L_0x0050
        L_0x006f:
            if (r13 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0075:
            int r9 = r9 + 1
            java.lang.CharSequence r5 = r5.subSequence(r10, r9)
            java.lang.String r5 = r5.toString()
            int r9 = r5.length()
            if (r9 <= 0) goto L_0x0087
            r9 = r3
            goto L_0x0088
        L_0x0087:
            r9 = r2
        L_0x0088:
            if (r9 == 0) goto L_0x0141
            char r9 = r5.charAt(r2)
            r10 = 122(0x7a, float:1.71E-43)
            if (r9 == r10) goto L_0x0138
            char r9 = r5.charAt(r2)
            r10 = 90
            if (r9 != r10) goto L_0x009c
            goto L_0x0138
        L_0x009c:
            int r9 = r5.length()
            float[] r10 = new float[r9]
            int r11 = r5.length()
            r14 = r2
            r13 = r3
        L_0x00a8:
            if (r13 >= r11) goto L_0x0118
            r16 = r2
            r17 = r16
            r18 = r17
            r19 = r18
            r15 = r13
        L_0x00b3:
            int r3 = r5.length()
            if (r15 >= r3) goto L_0x00fc
            char r3 = r5.charAt(r15)
            if (r3 != r12) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            r12 = 44
            if (r3 != r12) goto L_0x00c6
        L_0x00c4:
            r12 = 1
            goto L_0x00c7
        L_0x00c6:
            r12 = r2
        L_0x00c7:
            if (r12 == 0) goto L_0x00ca
            goto L_0x00e0
        L_0x00ca:
            r12 = 45
            if (r3 != r12) goto L_0x00d3
            if (r15 == r13) goto L_0x00f2
            if (r17 != 0) goto L_0x00f2
            goto L_0x00de
        L_0x00d3:
            r12 = 46
            if (r3 != r12) goto L_0x00e5
            if (r16 != 0) goto L_0x00de
            r17 = r2
            r16 = 1
            goto L_0x00f4
        L_0x00de:
            r18 = 1
        L_0x00e0:
            r17 = r2
            r19 = 1
            goto L_0x00f4
        L_0x00e5:
            if (r3 != r8) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            if (r3 != r7) goto L_0x00ec
        L_0x00ea:
            r3 = 1
            goto L_0x00ed
        L_0x00ec:
            r3 = r2
        L_0x00ed:
            if (r3 == 0) goto L_0x00f2
            r17 = 1
            goto L_0x00f4
        L_0x00f2:
            r17 = r2
        L_0x00f4:
            if (r19 == 0) goto L_0x00f7
            goto L_0x00fc
        L_0x00f7:
            int r15 = r15 + 1
            r12 = 32
            goto L_0x00b3
        L_0x00fc:
            if (r13 >= r15) goto L_0x010e
            int r3 = r14 + 1
            java.lang.String r12 = r5.substring(r13, r15)
            kotlin.jvm.internal.C19383o.m32796f(r12, r6)
            float r12 = java.lang.Float.parseFloat(r12)
            r10[r14] = r12
            r14 = r3
        L_0x010e:
            if (r18 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            int r15 = r15 + 1
        L_0x0113:
            r13 = r15
            r3 = 1
            r12 = 32
            goto L_0x00a8
        L_0x0118:
            if (r14 < 0) goto L_0x0132
            if (r9 < 0) goto L_0x012c
            int r14 = r14 + 0
            int r9 = r9 + 0
            int r3 = java.lang.Math.min(r14, r9)
            float[] r6 = new float[r14]
            int r3 = r3 + r2
            int r3 = r3 - r2
            java.lang.System.arraycopy(r10, r2, r6, r2, r3)
            goto L_0x013a
        L_0x012c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L_0x0132:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0138:
            float[] r6 = new float[r2]
        L_0x013a:
            char r3 = r5.charAt(r2)
            r1.mo6504a(r3, r6)
        L_0x0141:
            int r3 = r4 + 1
            r5 = r4
            r4 = r3
            r3 = 1
            goto L_0x0016
        L_0x0148:
            int r4 = r4 - r5
            r3 = 1
            if (r4 != r3) goto L_0x015b
            int r3 = r20.length()
            if (r5 >= r3) goto L_0x015b
            char r0 = r0.charAt(r5)
            float[] r2 = new float[r2]
            r1.mo6504a(r0, r2)
        L_0x015b:
            java.util.ArrayList r0 = r1.f3519a
        L_0x015d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.C1583j.m3418a(java.lang.String):java.util.List");
    }
}
