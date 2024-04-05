package com.etsy.collagecompose;

import androidx.compose.material.C1259v;
import androidx.compose.material.ColorsKt;

public final class ThemeKt {

    /* renamed from: a */
    public static final C1259v f27058a;

    /* renamed from: b */
    public static final C1259v f27059b;

    static {
        long j = ColorsKt.f27029b;
        long j2 = ColorsKt.f27031d;
        long j3 = j2;
        long j4 = j2;
        long j5 = j2;
        long j6 = j2;
        long j7 = ColorsKt.f27038k;
        long j8 = j7;
        f27058a = ColorsKt.m2176d(j, j, j2, j5, j6, j7, j2, j, j, j, j2, 8);
        long j9 = ColorsKt.f27028a;
        long j10 = j9;
        f27059b = new C1259v(j, j, j3, j4, j10, j9, j8, j2, j, j2, j2, j2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if ((r11 & 1) != 0) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19959a(boolean r7, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r8, androidx.compose.runtime.C1302d r9, int r10, int r11) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r0 = 1860974280(0x6eec36c8, float:3.6552344E28)
            androidx.compose.runtime.ComposerImpl r9 = r9.mo5440h(r0)
            r0 = r10 & 14
            r1 = 2
            if (r0 != 0) goto L_0x0020
            r0 = r11 & 1
            if (r0 != 0) goto L_0x001d
            boolean r0 = r9.mo5427a(r7)
            if (r0 == 0) goto L_0x001d
            r0 = 4
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            r0 = r0 | r10
            goto L_0x0021
        L_0x0020:
            r0 = r10
        L_0x0021:
            r2 = r11 & 2
            r3 = 32
            if (r2 == 0) goto L_0x002a
            r0 = r0 | 48
            goto L_0x0039
        L_0x002a:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0039
            boolean r2 = r9.mo5408I(r8)
            if (r2 == 0) goto L_0x0036
            r2 = r3
            goto L_0x0038
        L_0x0036:
            r2 = 16
        L_0x0038:
            r0 = r0 | r2
        L_0x0039:
            r2 = r0 & 91
            r4 = 18
            if (r2 != r4) goto L_0x004a
            boolean r2 = r9.mo5442i()
            if (r2 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            r9.mo5396C()
            goto L_0x00af
        L_0x004a:
            r9.mo5466u0()
            r2 = r10 & 1
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0062
            boolean r2 = r9.mo5425Y()
            if (r2 == 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            r9.mo5396C()
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0079
            goto L_0x0077
        L_0x0062:
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0079
            androidx.compose.runtime.t r7 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3986a
            java.lang.Object r7 = r9.mo5410J(r7)
            android.content.res.Configuration r7 = (android.content.res.Configuration) r7
            int r7 = r7.uiMode
            r7 = r7 & 48
            if (r7 != r3) goto L_0x0076
            r7 = r5
            goto L_0x0077
        L_0x0076:
            r7 = r4
        L_0x0077:
            r0 = r0 & -15
        L_0x0079:
            r9.mo5419S()
            if (r7 == 0) goto L_0x0081
            androidx.compose.material.v r2 = f27059b
            goto L_0x0083
        L_0x0081:
            androidx.compose.material.v r2 = f27058a
        L_0x0083:
            androidx.compose.runtime.t0[] r1 = new androidx.compose.runtime.C1412t0[r1]
            androidx.compose.runtime.l1 r3 = com.etsy.collagecompose.TypographyKt.f27060a
            com.etsy.collagecompose.k r6 = com.etsy.collagecompose.TypographyKt.f27061b
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r6)
            r1[r4] = r3
            androidx.compose.runtime.l1 r3 = com.etsy.collagecompose.ColorsKt.f27041n
            if (r7 == 0) goto L_0x0096
            com.etsy.collagecompose.i r4 = com.etsy.collagecompose.ColorsKt.f27040m
            goto L_0x0098
        L_0x0096:
            com.etsy.collagecompose.i r4 = com.etsy.collagecompose.ColorsKt.f27039l
        L_0x0098:
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r4)
            r1[r5] = r3
            r3 = -641668216(0xffffffffd9c0eb88, float:-6.7877706E15)
            com.etsy.collagecompose.ThemeKt$CollageTheme$1 r4 = new com.etsy.collagecompose.ThemeKt$CollageTheme$1
            r4.<init>(r2, r8, r0)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r9, r3, r4)
            r2 = 56
            androidx.compose.runtime.CompositionLocalKt.m2530a(r1, r0, r9, r2)
        L_0x00af:
            androidx.compose.runtime.v0 r9 = r9.mo5421U()
            if (r9 != 0) goto L_0x00b6
            goto L_0x00bd
        L_0x00b6:
            com.etsy.collagecompose.ThemeKt$CollageTheme$2 r0 = new com.etsy.collagecompose.ThemeKt$CollageTheme$2
            r0.<init>(r7, r8, r10, r11)
            r9.f3081d = r0
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.ThemeKt.m19959a(boolean, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
