package androidx.compose.foundation.lazy.layout;

public final class LazyLayoutKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1863a(androidx.compose.foundation.lazy.layout.C0841d r13, androidx.compose.p015ui.C1436d r14, androidx.compose.foundation.lazy.layout.C0845h r15, p753kq.C19861p<? super androidx.compose.foundation.lazy.layout.C0843f, ? super p174m0.C7280a, ? extends androidx.compose.p015ui.layout.C1712w> r16, androidx.compose.runtime.C1302d r17, int r18, int r19) {
        /*
            r1 = r13
            r4 = r16
            r5 = r18
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "measurePolicy"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            r0 = 852831187(0x32d52bd3, float:2.4816392E-8)
            r2 = r17
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r19 & 1
            if (r2 == 0) goto L_0x001f
            r2 = r5 | 6
            goto L_0x002f
        L_0x001f:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x002e
            boolean r2 = r0.mo5408I(r13)
            if (r2 == 0) goto L_0x002b
            r2 = 4
            goto L_0x002c
        L_0x002b:
            r2 = 2
        L_0x002c:
            r2 = r2 | r5
            goto L_0x002f
        L_0x002e:
            r2 = r5
        L_0x002f:
            r3 = r19 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0048
        L_0x0036:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0048
            r6 = r14
            boolean r7 = r0.mo5408I(r14)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r2 = r2 | r7
            goto L_0x0049
        L_0x0048:
            r6 = r14
        L_0x0049:
            r7 = r19 & 4
            if (r7 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0050:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r15
            boolean r9 = r0.mo5408I(r15)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r9
            goto L_0x0063
        L_0x0062:
            r8 = r15
        L_0x0063:
            r9 = r19 & 8
            if (r9 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r0.mo5408I(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r9
        L_0x007a:
            r9 = r2 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008e
            boolean r9 = r0.mo5442i()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r0.mo5396C()
            r2 = r6
            r3 = r8
            goto L_0x0129
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0094
        L_0x0093:
            r3 = r6
        L_0x0094:
            if (r7 == 0) goto L_0x0099
            r6 = 0
            r12 = r6
            goto L_0x009a
        L_0x0099:
            r12 = r8
        L_0x009a:
            androidx.compose.runtime.j0 r6 = androidx.compose.foundation.layout.C0761x.m1664E0(r13, r0)
            androidx.compose.runtime.saveable.SaveableStateHolderImpl r7 = androidx.compose.runtime.saveable.C1368d.m2865a(r0)
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r8)
            java.lang.Object r9 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r10 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r9 != r10) goto L_0x00bd
            androidx.compose.foundation.lazy.layout.c r9 = new androidx.compose.foundation.lazy.layout.c
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1
            r11.<init>(r6)
            r9.<init>(r7, r11)
            r0.mo5407H0(r9)
        L_0x00bd:
            r6 = 0
            r0.mo5418R(r6)
            androidx.compose.foundation.lazy.layout.c r9 = (androidx.compose.foundation.lazy.layout.C0839c) r9
            r0.mo5465u(r8)
            java.lang.Object r7 = r0.mo5431c0()
            if (r7 != r10) goto L_0x00d9
            androidx.compose.ui.layout.SubcomposeLayoutState r7 = new androidx.compose.ui.layout.SubcomposeLayoutState
            androidx.compose.foundation.lazy.layout.e r8 = new androidx.compose.foundation.lazy.layout.e
            r8.<init>(r9)
            r7.<init>(r8)
            r0.mo5407H0(r7)
        L_0x00d9:
            r0.mo5418R(r6)
            androidx.compose.ui.layout.SubcomposeLayoutState r7 = (androidx.compose.p015ui.layout.SubcomposeLayoutState) r7
            r8 = 617316839(0x24cb81e7, float:8.825728E-17)
            r0.mo5465u(r8)
            if (r12 != 0) goto L_0x00e7
            goto L_0x00f4
        L_0x00e7:
            int r8 = r2 >> 6
            r8 = r8 & 14
            r8 = r8 | 64
            r8 = r8 | 512(0x200, float:7.175E-43)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt.m1864a(r12, r9, r7, r0, r8)
            kotlin.m r8 = kotlin.C19394m.f43287a
        L_0x00f4:
            r0.mo5418R(r6)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo5465u(r8)
            boolean r8 = r0.mo5408I(r9)
            boolean r11 = r0.mo5408I(r4)
            r8 = r8 | r11
            java.lang.Object r11 = r0.mo5431c0()
            if (r8 != 0) goto L_0x010e
            if (r11 != r10) goto L_0x0116
        L_0x010e:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
            r11.<init>(r9, r4)
            r0.mo5407H0(r11)
        L_0x0116:
            r0.mo5418R(r6)
            r8 = r11
            kq.p r8 = (p753kq.C19861p) r8
            r2 = r2 & 112(0x70, float:1.57E-43)
            r10 = r2 | 8
            r11 = 0
            r6 = r7
            r7 = r3
            r9 = r0
            androidx.compose.p015ui.layout.SubcomposeLayoutKt.m3532b(r6, r7, r8, r9, r10, r11)
            r2 = r3
            r3 = r12
        L_0x0129:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x0130
            goto L_0x013f
        L_0x0130:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
            r0 = r8
            r1 = r13
            r4 = r16
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt.m1863a(androidx.compose.foundation.lazy.layout.d, androidx.compose.ui.d, androidx.compose.foundation.lazy.layout.h, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
