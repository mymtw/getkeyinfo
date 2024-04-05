package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class DialogKt$DialogsPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ boolean $preOpenDialog;
    public final /* synthetic */ boolean $preShowConfirmButton;
    public final /* synthetic */ boolean $preShowDismissButton;
    public final /* synthetic */ boolean $preUseLongText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$DialogsPreview$1(boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.$preOpenDialog = z;
        this.$preShowConfirmButton = z2;
        this.$preShowDismissButton = z3;
        this.$preUseLongText = z4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r37, int r38) {
        /*
            r36 = this;
            r0 = r36
            r15 = r37
            r1 = r38 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0015
            boolean r1 = r37.mo5442i()
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r37.mo5396C()
            goto L_0x0370
        L_0x0015:
            androidx.compose.ui.d$a r14 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.ScrollState r1 = androidx.compose.foundation.ScrollKt.m1315a(r37)
            androidx.compose.ui.d r1 = androidx.compose.foundation.ScrollKt.m1317c(r14, r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1485e(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1487g(r1)
            androidx.compose.runtime.l1 r13 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r2 = r15.mo5410J(r13)
            com.etsy.collagecompose.j r2 = (com.etsy.collagecompose.C12159j) r2
            float r2 = r2.f27179g
            java.lang.Object r3 = r15.mo5410J(r13)
            com.etsy.collagecompose.j r3 = (com.etsy.collagecompose.C12159j) r3
            float r3 = r3.f27179g
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25281G0(r1, r3, r2)
            androidx.compose.foundation.layout.d$i r2 = androidx.compose.foundation.layout.C0718d.f1476a
            java.lang.Object r2 = r15.mo5410J(r13)
            com.etsy.collagecompose.j r2 = (com.etsy.collagecompose.C12159j) r2
            float r2 = r2.f27177e
            androidx.compose.foundation.layout.d$h r2 = androidx.compose.foundation.layout.C0718d.m1571g(r2)
            boolean r7 = r0.$preOpenDialog
            boolean r8 = r0.$preShowConfirmButton
            boolean r9 = r0.$preShowDismissButton
            boolean r10 = r0.$preUseLongText
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo5465u(r3)
            androidx.compose.ui.b$a r3 = androidx.compose.p015ui.C1428a.C1429a.f3116l
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.ColumnKt.m1461a(r2, r3, r15)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r15.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r15.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r5 = r15.mo5410J(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r6.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r11 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c r1 = r37.mo5446k()
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            r20 = 0
            if (r1 == 0) goto L_0x0371
            r37.mo5392A()
            boolean r1 = r37.mo5436f()
            if (r1 == 0) goto L_0x009f
            r15.mo5450m(r6)
            goto L_0x00a2
        L_0x009f:
            r37.mo5452n()
        L_0x00a2:
            r37.mo5394B()
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r15, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r15, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r15, r4, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = android.support.p013v4.media.C0073e.m204d(r15, r5, r1, r15)
            r1 = 0
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
            r2 = r11
            r4 = r37
            androidx.compose.animation.C0472h.m1246i(r1, r2, r3, r4, r5, r6)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo5465u(r1)
            java.lang.Object r2 = r37.mo5467v()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x00e0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r2, androidx.compose.runtime.C1351n1.f2948a)
            r15.mo5454o(r2)
        L_0x00e0:
            r37.mo5406H()
            r12 = r2
            androidx.compose.runtime.j0 r12 = (androidx.compose.runtime.C1338j0) r12
            r15.mo5465u(r1)
            java.lang.Object r2 = r37.mo5467v()
            if (r2 != r3) goto L_0x00fa
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r2, androidx.compose.runtime.C1351n1.f2948a)
            r15.mo5454o(r2)
        L_0x00fa:
            r37.mo5406H()
            r11 = r2
            androidx.compose.runtime.j0 r11 = (androidx.compose.runtime.C1338j0) r11
            r15.mo5465u(r1)
            java.lang.Object r2 = r37.mo5467v()
            if (r2 != r3) goto L_0x0114
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r2, androidx.compose.runtime.C1351n1.f2948a)
            r15.mo5454o(r2)
        L_0x0114:
            r37.mo5406H()
            r9 = r2
            androidx.compose.runtime.j0 r9 = (androidx.compose.runtime.C1338j0) r9
            r15.mo5465u(r1)
            java.lang.Object r1 = r37.mo5467v()
            if (r1 != r3) goto L_0x012e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = androidx.compose.foundation.layout.C0761x.m1751w0(r1, androidx.compose.runtime.C1351n1.f2948a)
            r15.mo5454o(r1)
        L_0x012e:
            r37.mo5406H()
            androidx.compose.runtime.j0 r1 = (androidx.compose.runtime.C1338j0) r1
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r16 = 0
            r10 = r16
            r8 = r16
            r21 = r9
            r9 = r16
            r16 = 0
            r22 = r11
            r11 = r16
            r23 = r12
            r12 = r16
            r24 = r13
            r13 = r16
            r16 = 0
            r25 = r14
            r14 = r16
            androidx.compose.runtime.l1 r2 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r2 = r15.mo5410J(r2)
            com.etsy.collagecompose.k r2 = (com.etsy.collagecompose.C12160k) r2
            androidx.compose.ui.text.s r2 = r2.f27195a
            r15 = r2
            r26 = 2
            r17 = 6
            r18 = 0
            r19 = 4094(0xffe, float:5.737E-42)
            java.lang.String r2 = "Dialogs"
            r27 = r1
            r1 = r2
            r16 = r37
            r2 = 0
            com.etsy.collagecompose.TextKt.m19958a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r13 = r37
            r1 = r24
            java.lang.Object r1 = r13.mo5410J(r1)
            com.etsy.collagecompose.j r1 = (com.etsy.collagecompose.C12159j) r1
            float r1 = r1.f27179g
            r2 = r25
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1488h(r2, r1)
            r14 = 0
            com.google.android.play.core.assetpacks.C15588c1.m25324f(r1, r13, r14)
            com.etsy.collagecompose.e$d r1 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            r15 = 4
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r12 = r23
            r2[r14] = r12
            r16 = 1
            r11 = r22
            r2[r16] = r11
            r10 = r21
            r2[r26] = r10
            r17 = 3
            r9 = r27
            r2[r17] = r9
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r13.mo5465u(r3)
            r3 = r14
            r4 = r3
        L_0x01ac:
            if (r3 >= r15) goto L_0x01b8
            r5 = r2[r3]
            boolean r5 = r13.mo5408I(r5)
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x01ac
        L_0x01b8:
            java.lang.Object r2 = r37.mo5467v()
            if (r4 != 0) goto L_0x01c2
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x01ca
        L_0x01c2:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$1$1 r2 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$1$1
            r2.<init>(r12, r11, r10, r9)
            r13.mo5454o(r2)
        L_0x01ca:
            r37.mo5406H()
            kq.a r2 = (p753kq.C19846a) r2
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r19 = 3078(0xc06, float:4.313E-42)
            r21 = 500(0x1f4, float:7.0E-43)
            java.lang.String r4 = "Show dialog with one button"
            r28 = r9
            r9 = r18
            r29 = r10
            r10 = r37
            r30 = r11
            r11 = r19
            r31 = r12
            r12 = r21
            com.etsy.collagecompose.ButtonKt.m19939a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.etsy.collagecompose.e$d r1 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r12 = r31
            r2[r14] = r12
            r11 = r30
            r2[r16] = r11
            r10 = r29
            r2[r26] = r10
            r9 = r28
            r2[r17] = r9
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r13.mo5465u(r3)
            r3 = r14
            r4 = r3
        L_0x020b:
            if (r3 >= r15) goto L_0x0217
            r5 = r2[r3]
            boolean r5 = r13.mo5408I(r5)
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x020b
        L_0x0217:
            java.lang.Object r2 = r37.mo5467v()
            if (r4 != 0) goto L_0x0221
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0229
        L_0x0221:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$2$1 r2 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$2$1
            r2.<init>(r12, r11, r10, r9)
            r13.mo5454o(r2)
        L_0x0229:
            r37.mo5406H()
            kq.a r2 = (p753kq.C19846a) r2
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r19 = 3078(0xc06, float:4.313E-42)
            r21 = 500(0x1f4, float:7.0E-43)
            java.lang.String r4 = "Show dialog with two buttons"
            r32 = r9
            r9 = r18
            r33 = r10
            r10 = r37
            r34 = r11
            r11 = r19
            r35 = r12
            r12 = r21
            com.etsy.collagecompose.ButtonKt.m19939a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.etsy.collagecompose.e$d r1 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r12 = r35
            r2[r14] = r12
            r11 = r34
            r2[r16] = r11
            r10 = r33
            r2[r26] = r10
            r9 = r32
            r2[r17] = r9
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r13.mo5465u(r3)
            r3 = r14
        L_0x0269:
            if (r14 >= r15) goto L_0x0275
            r4 = r2[r14]
            boolean r4 = r13.mo5408I(r4)
            r3 = r3 | r4
            int r14 = r14 + 1
            goto L_0x0269
        L_0x0275:
            java.lang.Object r2 = r37.mo5467v()
            if (r3 != 0) goto L_0x027f
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0287
        L_0x027f:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$3$1 r2 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$3$1
            r2.<init>(r12, r11, r10, r9)
            r13.mo5454o(r2)
        L_0x0287:
            r37.mo5406H()
            kq.a r2 = (p753kq.C19846a) r2
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r14 = 0
            r15 = 3078(0xc06, float:4.313E-42)
            r16 = 500(0x1f4, float:7.0E-43)
            java.lang.String r4 = "Show dialog with two buttons that wrap"
            r17 = r9
            r9 = r14
            r14 = r10
            r10 = r37
            r18 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            com.etsy.collagecompose.ButtonKt.m19939a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r15.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x036d
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.String r2 = "dialog"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.platform.TestTagKt.m3948a(r1, r2)
            java.lang.Object r1 = r17.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02ca
            java.lang.String r1 = "Confirm button with a lot of text"
            goto L_0x02d8
        L_0x02ca:
            java.lang.Object r1 = r18.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02da
            java.lang.String r1 = "Confirm"
        L_0x02d8:
            r5 = r1
            goto L_0x02dc
        L_0x02da:
            r5 = r20
        L_0x02dc:
            java.lang.Object r1 = r17.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02eb
            java.lang.String r1 = "Dismiss button with a lot of text"
            goto L_0x02f9
        L_0x02eb:
            java.lang.Object r1 = r14.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02fb
            java.lang.String r1 = "Dismiss"
        L_0x02f9:
            r7 = r1
            goto L_0x02fd
        L_0x02fb:
            r7 = r20
        L_0x02fd:
            r1 = 1157296644(0x44faf204, float:2007.563)
            r13.mo5465u(r1)
            boolean r3 = r13.mo5408I(r15)
            java.lang.Object r4 = r37.mo5467v()
            if (r3 != 0) goto L_0x0311
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r3) goto L_0x0319
        L_0x0311:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$4$1 r4 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$4$1
            r4.<init>(r15)
            r13.mo5454o(r4)
        L_0x0319:
            r37.mo5406H()
            r3 = r4
            kq.a r3 = (p753kq.C19846a) r3
            r13.mo5465u(r1)
            boolean r4 = r13.mo5408I(r15)
            java.lang.Object r6 = r37.mo5467v()
            if (r4 != 0) goto L_0x0330
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r4) goto L_0x0338
        L_0x0330:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$5$1 r6 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$5$1
            r6.<init>(r15)
            r13.mo5454o(r6)
        L_0x0338:
            r37.mo5406H()
            kq.a r6 = (p753kq.C19846a) r6
            r13.mo5465u(r1)
            boolean r1 = r13.mo5408I(r15)
            java.lang.Object r4 = r37.mo5467v()
            if (r1 != 0) goto L_0x034e
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r1) goto L_0x0356
        L_0x034e:
            com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$6$1 r4 = new com.etsy.collagecompose.DialogKt$DialogsPreview$1$1$6$1
            r4.<init>(r15)
            r13.mo5454o(r4)
        L_0x0356:
            r37.mo5406H()
            r8 = r4
            kq.a r8 = (p753kq.C19846a) r8
            r9 = 0
            r11 = 3504(0xdb0, float:4.91E-42)
            r12 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "Dialog Title"
            java.lang.String r10 = "Body text, like a description of the alert, goes here."
            r1 = r3
            r3 = r4
            r4 = r10
            r10 = r37
            com.etsy.collagecompose.DialogKt.m19950a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x036d:
            p010a9.C0048b.m166e(r37)
        L_0x0370:
            return
        L_0x0371:
            p001a0.C0005b.m45j0()
            throw r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.DialogKt$DialogsPreview$1.invoke(androidx.compose.runtime.d, int):void");
    }
}
