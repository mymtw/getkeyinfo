package com.etsy.collagecompose;

public final class BadgeKt {

    /* renamed from: com.etsy.collagecompose.BadgeKt$a */
    public /* synthetic */ class C12116a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27019a;

        static {
            int[] iArr = new int[BadgeStyle.values().length];
            iArr[BadgeStyle.Tertiary.ordinal()] = 1;
            iArr[BadgeStyle.TertiaryOutline.ordinal()] = 2;
            iArr[BadgeStyle.TertiaryAd.ordinal()] = 3;
            iArr[BadgeStyle.Secondary.ordinal()] = 4;
            iArr[BadgeStyle.Primary.ordinal()] = 5;
            iArr[BadgeStyle.PriceModifier.ordinal()] = 6;
            iArr[BadgeStyle.Urgent.ordinal()] = 7;
            iArr[BadgeStyle.SecondaryText.ordinal()] = 8;
            iArr[BadgeStyle.PrimaryText.ordinal()] = 9;
            iArr[BadgeStyle.PriceModifierText.ordinal()] = 10;
            iArr[BadgeStyle.UrgentText.ordinal()] = 11;
            f27019a = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19938a(java.lang.String r37, com.etsy.collagecompose.BadgeStyle r38, androidx.compose.p015ui.C1436d r39, java.lang.Integer r40, androidx.compose.runtime.C1302d r41, int r42, int r43) {
        /*
            r15 = r37
            r14 = r38
            r2 = r42
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = -932111410(0xffffffffc8711bce, float:-246895.22)
            r1 = r41
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r43 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r2 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r2 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r0.mo5408I(r15)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r2
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            r3 = r43 & 2
            if (r3 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0047
            boolean r3 = r0.mo5408I(r14)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r1 = r1 | r3
        L_0x0047:
            r3 = r43 & 4
            if (r3 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r4 = r2 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0061
            r4 = r39
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x005d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r5
            goto L_0x0063
        L_0x0061:
            r4 = r39
        L_0x0063:
            r5 = r43 & 8
            if (r5 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007d
            r6 = r40
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x0079
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r7
            goto L_0x007f
        L_0x007d:
            r6 = r40
        L_0x007f:
            r13 = r1
            r1 = r13 & 5851(0x16db, float:8.199E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r1 != r7) goto L_0x0095
            boolean r1 = r0.mo5442i()
            if (r1 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r0.mo5396C()
            r2 = r0
            r3 = r4
            r4 = r6
            goto L_0x04b7
        L_0x0095:
            if (r3 == 0) goto L_0x009a
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x009b
        L_0x009a:
            r1 = r4
        L_0x009b:
            if (r5 == 0) goto L_0x00a1
            r3 = 0
            r29 = r3
            goto L_0x00a3
        L_0x00a1:
            r29 = r6
        L_0x00a3:
            int[] r3 = com.etsy.collagecompose.BadgeKt.C12116a.f27019a
            int r4 = r38.ordinal()
            r4 = r3[r4]
            r5 = -2107788097(0xffffffff825db4bf, float:-1.6288387E-37)
            r6 = 0
            switch(r4) {
                case 1: goto L_0x00cc;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00b8;
                case 9: goto L_0x00b8;
                case 10: goto L_0x00b8;
                case 11: goto L_0x00b8;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r2 = r0
            r2.mo5465u(r5)
            goto L_0x04fd
        L_0x00b8:
            r4 = -2107785837(0xffffffff825dbd93, float:-1.6290921E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.k r4 = (com.etsy.collagecompose.C12160k) r4
            androidx.compose.ui.text.s r4 = r4.f27198d
            r0.mo5418R(r6)
            goto L_0x00df
        L_0x00cc:
            r4 = -2107786056(0xffffffff825dbcb8, float:-1.6290675E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.k r4 = (com.etsy.collagecompose.C12160k) r4
            androidx.compose.ui.text.s r4 = r4.f27200f
            r0.mo5418R(r6)
        L_0x00df:
            r30 = r4
            int r4 = r38.ordinal()
            r4 = r3[r4]
            switch(r4) {
                case 1: goto L_0x0154;
                case 2: goto L_0x0154;
                case 3: goto L_0x0154;
                case 4: goto L_0x0140;
                case 5: goto L_0x0154;
                case 6: goto L_0x0154;
                case 7: goto L_0x0154;
                case 8: goto L_0x012c;
                case 9: goto L_0x0118;
                case 10: goto L_0x0104;
                case 11: goto L_0x00f0;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            r2 = r0
            r2.mo5465u(r5)
            goto L_0x04f4
        L_0x00f0:
            r4 = -2107785002(0xffffffff825dc0d6, float:-1.6291857E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27115U
            r0.mo5418R(r6)
            goto L_0x0167
        L_0x0104:
            r4 = -2107785085(0xffffffff825dc083, float:-1.6291764E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27114T
            r0.mo5418R(r6)
            goto L_0x0167
        L_0x0118:
            r4 = -2107785169(0xffffffff825dc02f, float:-1.629167E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27112R
            r0.mo5418R(r6)
            goto L_0x0167
        L_0x012c:
            r4 = -2107785249(0xffffffff825dbfdf, float:-1.629158E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27113S
            r0.mo5418R(r6)
            goto L_0x0167
        L_0x0140:
            r4 = -2107785373(0xffffffff825dbf63, float:-1.6291441E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27106L
            r0.mo5418R(r6)
            goto L_0x0167
        L_0x0154:
            r4 = -2107785504(0xffffffff825dbee0, float:-1.6291294E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27104J
            r0.mo5418R(r6)
        L_0x0167:
            r11 = r7
            int r4 = r38.ordinal()
            r4 = r3[r4]
            switch(r4) {
                case 1: goto L_0x01fd;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01d5;
                case 4: goto L_0x01c1;
                case 5: goto L_0x01ad;
                case 6: goto L_0x0199;
                case 7: goto L_0x0184;
                case 8: goto L_0x0177;
                case 9: goto L_0x0177;
                case 10: goto L_0x0177;
                case 11: goto L_0x0177;
                default: goto L_0x0171;
            }
        L_0x0171:
            r2 = r0
            r2.mo5465u(r5)
            goto L_0x04eb
        L_0x0177:
            r4 = -2107784198(0xffffffff825dc3fa, float:-1.6292758E-37)
            r0.mo5465u(r4)
            r0.mo5418R(r6)
            long r7 = androidx.compose.p015ui.graphics.C1545s.f3363h
            goto L_0x0210
        L_0x0184:
            r4 = -2107784419(0xffffffff825dc31d, float:-1.629251E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27111Q
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x0199:
            r4 = -2107784496(0xffffffff825dc2d0, float:-1.6292424E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27110P
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x01ad:
            r4 = -2107784574(0xffffffff825dc282, float:-1.6292337E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27105K
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x01c1:
            r4 = -2107784648(0xffffffff825dc238, float:-1.6292254E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27107M
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x01d5:
            r4 = -2107784723(0xffffffff825dc1ed, float:-1.629217E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27108N
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x01e9:
            r4 = -2107784799(0xffffffff825dc1a1, float:-1.6292084E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27108N
            r0.mo5418R(r6)
            goto L_0x0210
        L_0x01fd:
            r4 = -2107784880(0xffffffff825dc150, float:-1.6291994E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r7 = r4.f27108N
            r0.mo5418R(r6)
        L_0x0210:
            int r4 = r38.ordinal()
            r4 = r3[r4]
            switch(r4) {
                case 1: goto L_0x0233;
                case 2: goto L_0x0233;
                case 3: goto L_0x0233;
                case 4: goto L_0x0233;
                case 5: goto L_0x0233;
                case 6: goto L_0x0233;
                case 7: goto L_0x0233;
                case 8: goto L_0x021f;
                case 9: goto L_0x021f;
                case 10: goto L_0x021f;
                case 11: goto L_0x021f;
                default: goto L_0x0219;
            }
        L_0x0219:
            r2 = r0
            r2.mo5465u(r5)
            goto L_0x04e2
        L_0x021f:
            r4 = -2107783688(0xffffffff825dc5f8, float:-1.629333E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.j r4 = (com.etsy.collagecompose.C12159j) r4
            float r4 = r4.f27174b
            r0.mo5418R(r6)
            goto L_0x0246
        L_0x0233:
            r4 = -2107783897(0xffffffff825dc527, float:-1.6293096E-37)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.j r4 = (com.etsy.collagecompose.C12159j) r4
            float r4 = r4.f27175c
            r0.mo5418R(r6)
        L_0x0246:
            int r9 = r38.ordinal()
            r3 = r3[r9]
            switch(r3) {
                case 1: goto L_0x027d;
                case 2: goto L_0x027d;
                case 3: goto L_0x0269;
                case 4: goto L_0x027d;
                case 5: goto L_0x027d;
                case 6: goto L_0x027d;
                case 7: goto L_0x027d;
                case 8: goto L_0x0255;
                case 9: goto L_0x0255;
                case 10: goto L_0x0255;
                case 11: goto L_0x0255;
                default: goto L_0x024f;
            }
        L_0x024f:
            r2 = r0
            r2.mo5465u(r5)
            goto L_0x04d9
        L_0x0255:
            r3 = -2107783129(0xffffffff825dc827, float:-1.6293957E-37)
            r0.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r3 = r0.mo5410J(r3)
            com.etsy.collagecompose.j r3 = (com.etsy.collagecompose.C12159j) r3
            float r3 = r3.f27174b
            r0.mo5418R(r6)
            goto L_0x0290
        L_0x0269:
            r3 = -2107783557(0xffffffff825dc67b, float:-1.6293477E-37)
            r0.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r3 = r0.mo5410J(r3)
            com.etsy.collagecompose.j r3 = (com.etsy.collagecompose.C12159j) r3
            float r3 = r3.f27176d
            r0.mo5418R(r6)
            goto L_0x0290
        L_0x027d:
            r3 = -2107783338(0xffffffff825dc756, float:-1.6293722E-37)
            r0.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r3 = r0.mo5410J(r3)
            com.etsy.collagecompose.j r3 = (com.etsy.collagecompose.C12159j) r3
            float r3 = r3.f27177e
            r0.mo5418R(r6)
        L_0x0290:
            r5 = -2107783043(0xffffffff825dc87d, float:-1.6294053E-37)
            r0.mo5465u(r5)
            if (r29 == 0) goto L_0x02b1
            androidx.compose.runtime.l1 r5 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r9 = r0.mo5410J(r5)
            com.etsy.collagecompose.j r9 = (com.etsy.collagecompose.C12159j) r9
            float r9 = r9.f27174b
            boolean r9 = p174m0.C7284d.m13983a(r3, r9)
            if (r9 != 0) goto L_0x02b1
            java.lang.Object r5 = r0.mo5410J(r5)
            com.etsy.collagecompose.j r5 = (com.etsy.collagecompose.C12159j) r5
            float r5 = r5.f27176d
            goto L_0x02b2
        L_0x02b1:
            r5 = r3
        L_0x02b2:
            r0.mo5418R(r6)
            r6 = -2107782745(0xffffffff825dc9a7, float:-1.6294387E-37)
            r0.mo5465u(r6)
            com.etsy.collagecompose.BadgeStyle r6 = com.etsy.collagecompose.BadgeStyle.TertiaryOutline
            if (r14 != r6) goto L_0x02e9
            androidx.compose.runtime.l1 r6 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r6 = r0.mo5410J(r6)
            com.etsy.collagecompose.j r6 = (com.etsy.collagecompose.C12159j) r6
            float r6 = r6.f27189q
            androidx.compose.runtime.l1 r9 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r9 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r9 = (com.etsy.collagecompose.C12158i) r9
            long r9 = r9.f27109O
            p.f r16 = p202p.C7645g.f16941a
            p.e r2 = new p.e
            r41 = r13
            r13 = 100
            float r13 = (float) r13
            r2.<init>(r13)
            p.f r13 = new p.f
            r13.<init>(r2, r2, r2, r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.C0555f.m1343b(r6, r9, r13)
            goto L_0x02ed
        L_0x02e9:
            r41 = r13
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x02ed:
            r6 = 0
            r0.mo5418R(r6)
            p.f r6 = p202p.C7645g.f16941a
            p.e r6 = new p.e
            r9 = 100
            float r9 = (float) r9
            r6.<init>(r9)
            p.f r9 = new p.f
            r9.<init>(r6, r6, r6, r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.C0761x.m1655A(r1, r7, r9)
            androidx.compose.ui.d r2 = r6.mo6148i0(r2)
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25285I0(r2, r5, r4, r3, r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1498r(r2)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo5465u(r3)
            androidx.compose.ui.b r3 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r4 = 0
            androidx.compose.ui.layout.v r3 = androidx.compose.foundation.layout.BoxKt.m1457c(r3, r4, r0)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r9 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r4 = r0.mo5410J(r9)
            m0.b r4 = (p174m0.C7282b) r4
            androidx.compose.runtime.l1 r10 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r5 = r0.mo5410J(r10)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p015ui.unit.LayoutDirection) r5
            androidx.compose.runtime.l1 r13 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r6 = r0.mo5410J(r13)
            androidx.compose.ui.platform.j1 r6 = (androidx.compose.p015ui.platform.C1843j1) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r7.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r8 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r7 = r0.f2715a
            boolean r7 = r7 instanceof androidx.compose.runtime.C1299c
            if (r7 == 0) goto L_0x04d4
            r0.mo5392A()
            boolean r7 = r0.f2702K
            if (r7 == 0) goto L_0x0357
            r0.mo5450m(r8)
            goto L_0x035a
        L_0x0357:
            r0.mo5452n()
        L_0x035a:
            r7 = 0
            r0.f2738x = r7
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r3, r7)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r4, r3)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r5, r4)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r6 = p504ai.C13983i.m21490i(r0, r6, r5, r0)
            r16 = 0
            r17 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r18 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r21 = r3
            r3 = r16
            r24 = r4
            r4 = r2
            r2 = r5
            r5 = r6
            r6 = r0
            r19 = r7
            r7 = r17
            r39 = r1
            r1 = r8
            r8 = r18
            androidx.appcompat.widget.C0326j.m868m(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.b$b r3 = androidx.compose.p015ui.C1428a.C1429a.f3114j
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo5465u(r4)
            androidx.compose.ui.d$a r31 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.layout.d$i r4 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.RowKt.m1480a(r4, r3, r0)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r3)
            java.lang.Object r3 = r0.mo5410J(r9)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r3 = r0.mo5410J(r10)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r3 = r0.mo5410J(r13)
            r26 = r3
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r4 = androidx.compose.p015ui.layout.C1700o.m3617a(r31)
            androidx.compose.runtime.c<?> r3 = r0.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            if (r3 == 0) goto L_0x04cf
            r0.mo5392A()
            boolean r3 = r0.f2702K
            if (r3 == 0) goto L_0x03d3
            r0.mo5450m(r1)
            goto L_0x03d6
        L_0x03d3:
            r0.mo5452n()
        L_0x03d6:
            r3 = 0
            r0.f2738x = r3
            r16 = r0
            r18 = r19
            r19 = r0
            r22 = r0
            r25 = r0
            r27 = r2
            r28 = r0
            androidx.compose.runtime.a1 r5 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r8 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r6 = r0
            androidx.appcompat.widget.C0326j.m868m(r3, r4, r5, r6, r7, r8)
            r1 = 303720337(0x121a6791, float:4.8721487E-28)
            r0.mo5465u(r1)
            if (r29 == 0) goto L_0x047a
            int r1 = r29.intValue()
            androidx.compose.ui.graphics.painter.Painter r3 = kotlin.jvm.internal.C19388s.m32878p0(r1, r0)
            r1 = 5
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r2 < r4) goto L_0x0413
            androidx.compose.ui.graphics.k r2 = androidx.compose.p015ui.graphics.C1529k.f3326a
            android.graphics.BlendModeColorFilter r1 = r2.mo6367a(r11, r1)
            goto L_0x0421
        L_0x0413:
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            int r4 = p628nj.C18263b.m30859o0(r11)
            android.graphics.PorterDuff$Mode r1 = androidx.compose.p015ui.graphics.C1489a.m3160b(r1)
            r2.<init>(r4, r1)
            r1 = r2
        L_0x0421:
            androidx.compose.ui.graphics.t r2 = new androidx.compose.ui.graphics.t
            r2.<init>(r1)
            r32 = 0
            r33 = 0
            androidx.compose.runtime.l1 r1 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r4 = r0.mo5410J(r1)
            com.etsy.collagecompose.j r4 = (com.etsy.collagecompose.C12159j) r4
            float r4 = r4.f27175c
            r35 = 0
            r36 = 11
            r34 = r4
            androidx.compose.ui.d r4 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r31, r32, r33, r34, r35, r36)
            java.lang.Object r5 = r0.mo5410J(r1)
            com.etsy.collagecompose.j r5 = (com.etsy.collagecompose.C12159j) r5
            r5.getClass()
            r5 = -557904075(0xffffffffdebf0f35, float:-6.8836404E18)
            r0.mo5465u(r5)
            java.lang.Object r5 = r0.mo5410J(r9)
            m0.b r5 = (p174m0.C7282b) r5
            java.lang.Object r1 = r0.mo5410J(r1)
            com.etsy.collagecompose.j r1 = (com.etsy.collagecompose.C12159j) r1
            long r6 = r1.f27185m
            float r1 = r5.mo3794e(r6)
            r13 = 0
            r0.mo5418R(r13)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.SizeKt.m1492l(r4, r1)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = 56
            r16 = 56
            r9 = r2
            r10 = r0
            r19 = r11
            r11 = r1
            r12 = r16
            androidx.compose.foundation.ImageKt.m1308a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x047d
        L_0x047a:
            r19 = r11
            r13 = 0
        L_0x047d:
            r0.mo5418R(r13)
            r1 = 0
            r21 = r39
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r41
            r16 = r2 & 14
            r17 = 0
            r18 = 4090(0xffa, float:5.731E-42)
            r2 = r0
            r0 = r37
            r39 = r2
            r2 = r19
            r14 = r30
            r15 = r39
            com.etsy.collagecompose.TextKt.m19958a(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 0
            r1 = 1
            r2 = r39
            android.support.p013v4.media.session.C0087d.m238h(r2, r0, r0, r1, r0)
            android.support.p013v4.media.session.C0087d.m238h(r2, r0, r0, r0, r1)
            r2.mo5418R(r0)
            r2.mo5418R(r0)
            r3 = r21
            r4 = r29
        L_0x04b7:
            androidx.compose.runtime.v0 r7 = r2.mo5421U()
            if (r7 != 0) goto L_0x04be
            goto L_0x04ce
        L_0x04be:
            com.etsy.collagecompose.BadgeKt$Badge$2 r8 = new com.etsy.collagecompose.BadgeKt$Badge$2
            r0 = r8
            r1 = r37
            r2 = r38
            r5 = r42
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x04ce:
            return
        L_0x04cf:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        L_0x04d4:
            r0 = 0
            p001a0.C0005b.m45j0()
            throw r0
        L_0x04d9:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04e2:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04eb:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04f4:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04fd:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.BadgeKt.m19938a(java.lang.String, com.etsy.collagecompose.BadgeStyle, androidx.compose.ui.d, java.lang.Integer, androidx.compose.runtime.d, int, int):void");
    }
}
