package androidx.compose.foundation.layout;

public final class BoxWithConstraintsKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1460a(androidx.compose.p015ui.C1436d r12, androidx.compose.p015ui.C1428a r13, boolean r14, p753kq.C19862q<? super androidx.compose.foundation.layout.C0735g, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r15, androidx.compose.runtime.C1302d r16, int r17, int r18) {
        /*
            r4 = r15
            r5 = r17
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = 1781813501(0x6a3450fd, float:5.4497275E25)
            r1 = r16
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r18 & 1
            if (r1 == 0) goto L_0x001a
            r2 = r5 | 6
            r3 = r2
            r2 = r12
            goto L_0x002c
        L_0x001a:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x002a
            r2 = r12
            boolean r3 = r0.mo5408I(r12)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r5
            goto L_0x002c
        L_0x002a:
            r2 = r12
            r3 = r5
        L_0x002c:
            r6 = r18 & 2
            if (r6 == 0) goto L_0x0033
            r3 = r3 | 48
            goto L_0x0045
        L_0x0033:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r13
            boolean r8 = r0.mo5408I(r13)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r3 = r3 | r8
            goto L_0x0046
        L_0x0045:
            r7 = r13
        L_0x0046:
            r8 = r18 & 4
            if (r8 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004d:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r14
            boolean r10 = r0.mo5427a(r14)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r10
            goto L_0x0060
        L_0x005f:
            r9 = r14
        L_0x0060:
            r10 = r18 & 8
            if (r10 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0077
            boolean r10 = r0.mo5408I(r15)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r10
        L_0x0077:
            r10 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008b
            boolean r10 = r0.mo5442i()
            if (r10 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r0.mo5396C()
            r1 = r2
            r2 = r7
        L_0x0089:
            r3 = r9
            goto L_0x00cb
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0091
        L_0x0090:
            r1 = r2
        L_0x0091:
            if (r6 == 0) goto L_0x0096
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            goto L_0x0097
        L_0x0096:
            r2 = r7
        L_0x0097:
            r6 = 0
            if (r8 == 0) goto L_0x009b
            r9 = r6
        L_0x009b:
            androidx.compose.ui.layout.v r7 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r9, r0)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo5465u(r8)
            boolean r8 = r0.mo5408I(r15)
            boolean r10 = r0.mo5408I(r7)
            r8 = r8 | r10
            java.lang.Object r10 = r0.mo5431c0()
            if (r8 != 0) goto L_0x00b8
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r10 != r8) goto L_0x00c0
        L_0x00b8:
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1 r10 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
            r10.<init>(r7, r15, r3)
            r0.mo5407H0(r10)
        L_0x00c0:
            r0.mo5418R(r6)
            kq.p r10 = (p753kq.C19861p) r10
            r3 = r3 & 14
            androidx.compose.p015ui.layout.SubcomposeLayoutKt.m3531a(r1, r10, r0, r3, r6)
            goto L_0x0089
        L_0x00cb:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x00d2
            goto L_0x00df
        L_0x00d2:
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2 r8 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
            r0 = r8
            r4 = r15
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(androidx.compose.ui.d, androidx.compose.ui.a, boolean, kq.q, androidx.compose.runtime.d, int, int):void");
    }
}
