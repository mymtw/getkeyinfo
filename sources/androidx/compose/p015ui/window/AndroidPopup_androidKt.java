package androidx.compose.p015ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt */
public final class AndroidPopup_androidKt {

    /* renamed from: a */
    public static final C1411t f4705a = CompositionLocalKt.m2531b(AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m4514a(androidx.compose.p015ui.window.C2092e r26, p753kq.C19846a<kotlin.C19394m> r27, androidx.compose.p015ui.window.C2093f r28, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r29, androidx.compose.runtime.C1302d r30, int r31, int r32) {
        /*
            r11 = r26
            r12 = r29
            r13 = r31
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r30
            androidx.compose.runtime.ComposerImpl r14 = r1.mo5440h(r0)
            r0 = r32 & 1
            if (r0 == 0) goto L_0x0020
            r0 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x002f
            boolean r0 = r14.mo5408I(r11)
            if (r0 == 0) goto L_0x002c
            r0 = 4
            goto L_0x002d
        L_0x002c:
            r0 = 2
        L_0x002d:
            r0 = r0 | r13
            goto L_0x0030
        L_0x002f:
            r0 = r13
        L_0x0030:
            r1 = r32 & 2
            if (r1 == 0) goto L_0x0037
            r0 = r0 | 48
            goto L_0x004a
        L_0x0037:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004a
            r2 = r27
            boolean r3 = r14.mo5408I(r2)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r0 = r0 | r3
            goto L_0x004c
        L_0x004a:
            r2 = r27
        L_0x004c:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0065
            r3 = r32 & 4
            if (r3 != 0) goto L_0x005f
            r3 = r28
            boolean r4 = r14.mo5408I(r3)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r3 = r28
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r4
            goto L_0x0067
        L_0x0065:
            r3 = r28
        L_0x0067:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x006e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007e
            boolean r4 = r14.mo5408I(r12)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r4
        L_0x007e:
            r0 = r0 & 5851(0x16db, float:8.199E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r0 != r4) goto L_0x0090
            boolean r0 = r14.mo5442i()
            if (r0 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r14.mo5396C()
            goto L_0x0200
        L_0x0090:
            r14.mo5466u0()
            r0 = r13 & 1
            r4 = 0
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r14.mo5425Y()
            if (r0 == 0) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            r14.mo5396C()
            goto L_0x00ba
        L_0x00a3:
            if (r1 == 0) goto L_0x00a6
            r2 = r4
        L_0x00a6:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x00ba
            androidx.compose.ui.window.f r0 = new androidx.compose.ui.window.f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 63
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r16 = r0
            r15 = r2
            goto L_0x00bd
        L_0x00ba:
            r15 = r2
            r16 = r3
        L_0x00bd:
            r14.mo5419S()
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3991f
            java.lang.Object r0 = r14.mo5410J(r0)
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            androidx.compose.runtime.l1 r10 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r0 = r14.mo5410J(r10)
            r6 = r0
            m0.b r6 = (p174m0.C7282b) r6
            androidx.compose.runtime.t r0 = f4705a
            java.lang.Object r0 = r14.mo5410J(r0)
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17
            androidx.compose.runtime.l1 r9 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r0 = r14.mo5410J(r9)
            r8 = r0
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p015ui.unit.LayoutDirection) r8
            androidx.compose.runtime.g r7 = p001a0.C0005b.m50m0(r14)
            androidx.compose.runtime.j0 r3 = androidx.compose.foundation.layout.C0761x.m1664E0(r12, r14)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r1 = androidx.compose.p015ui.window.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE
            r2 = 6
            java.lang.Object r0 = androidx.compose.runtime.saveable.C1366b.m2863a(r0, r4, r1, r14, r2)
            r4 = r0
            java.util.UUID r4 = (java.util.UUID) r4
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo5465u(r0)
            java.lang.Object r0 = r14.mo5431c0()
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x0152
            androidx.compose.ui.window.PopupLayout r2 = new androidx.compose.ui.window.PopupLayout
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            r18 = 0
            r19 = 128(0x80, float:1.794E-43)
            r20 = 0
            r0 = r2
            r1 = r15
            r21 = r2
            r2 = r16
            r22 = r3
            r3 = r17
            r23 = r4
            r4 = r5
            r5 = r6
            r6 = r26
            r24 = r7
            r7 = r23
            r27 = r8
            r8 = r18
            r25 = r9
            r9 = r19
            r12 = r10
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1302892335(0x4da88f2f, float:3.53494496E8)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r3 = r21
            r2 = r22
            r1.<init>(r3, r2)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30807B(r1, r0, r2)
            r1 = r24
            r3.setContent(r1, r0)
            r14.mo5407H0(r3)
            r0 = r3
            goto L_0x0157
        L_0x0152:
            r27 = r8
            r25 = r9
            r12 = r10
        L_0x0157:
            r4 = 0
            r14.mo5418R(r4)
            androidx.compose.ui.window.PopupLayout r0 = (androidx.compose.p015ui.window.PopupLayout) r0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            r5 = r1
            r6 = r0
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r27
            r5.<init>(r6, r7, r8, r9, r10)
            androidx.compose.runtime.C1415u.m3028b(r0, r1, r14)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            androidx.compose.runtime.C1415u.m3033g(r1, r14)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            r1.<init>(r0, r11)
            androidx.compose.runtime.C1415u.m3028b(r11, r1, r14)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5
            r2 = 0
            r1.<init>(r0, r2)
            androidx.compose.runtime.C1415u.m3031e(r0, r1, r14)
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            r2.<init>(r0)
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25270A0(r1, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            r3 = r27
            r2.<init>(r0, r3)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo5465u(r0)
            java.lang.Object r0 = r14.mo5410J(r12)
            m0.b r0 = (p174m0.C7282b) r0
            r3 = r25
            java.lang.Object r3 = r14.mo5410J(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p015ui.unit.LayoutDirection) r3
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r5 = r14.mo5410J(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r6.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r7 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r1 = r14.f2715a
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            if (r1 == 0) goto L_0x0218
            r14.mo5392A()
            boolean r1 = r14.f2702K
            if (r1 == 0) goto L_0x01d2
            r14.mo5450m(r6)
            goto L_0x01d5
        L_0x01d2:
            r14.mo5452n()
        L_0x01d5:
            r14.f2738x = r4
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r14, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r14, r0, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r14, r3, r0)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r14, r5, r0, r14)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = 2085825549(0x7c532c0d, float:4.3858724E36)
            r1 = r4
            r2 = r7
            r0 = r4
            r4 = r14
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            r1 = 1
            android.support.p013v4.media.session.C0087d.m238h(r14, r0, r0, r1, r0)
            r2 = r15
            r3 = r16
        L_0x0200:
            androidx.compose.runtime.v0 r7 = r14.mo5421U()
            if (r7 != 0) goto L_0x0207
            goto L_0x0217
        L_0x0207:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r26
            r4 = r29
            r5 = r31
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x0217:
            return
        L_0x0218:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.AndroidPopup_androidKt.m4514a(androidx.compose.ui.window.e, kq.a, androidx.compose.ui.window.f, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m4515b(androidx.compose.p015ui.C1428a r21, long r22, p753kq.C19846a<kotlin.C19394m> r24, androidx.compose.p015ui.window.C2093f r25, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r26, androidx.compose.runtime.C1302d r27, int r28, int r29) {
        /*
            r7 = r26
            r8 = r28
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r27
            androidx.compose.runtime.ComposerImpl r9 = r1.mo5440h(r0)
            r0 = r29 & 1
            if (r0 == 0) goto L_0x001c
            r1 = r8 | 6
            r2 = r1
            r1 = r21
            goto L_0x0030
        L_0x001c:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x002d
            r1 = r21
            boolean r2 = r9.mo5408I(r1)
            if (r2 == 0) goto L_0x002a
            r2 = 4
            goto L_0x002b
        L_0x002a:
            r2 = 2
        L_0x002b:
            r2 = r2 | r8
            goto L_0x0030
        L_0x002d:
            r1 = r21
            r2 = r8
        L_0x0030:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r8 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r22
            boolean r6 = r9.mo5434e(r4)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r2 = r2 | r6
            goto L_0x004c
        L_0x004a:
            r4 = r22
        L_0x004c:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r24
            boolean r11 = r9.mo5408I(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r24
        L_0x0068:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0081
            r11 = r29 & 8
            if (r11 != 0) goto L_0x007b
            r11 = r25
            boolean r12 = r9.mo5408I(r11)
            if (r12 == 0) goto L_0x007d
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r11 = r25
        L_0x007d:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r12
            goto L_0x0083
        L_0x0081:
            r11 = r25
        L_0x0083:
            r12 = r29 & 16
            if (r12 == 0) goto L_0x008a
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008a:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x009c
            boolean r12 = r9.mo5408I(r7)
            if (r12 == 0) goto L_0x0099
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r2 = r2 | r12
        L_0x009c:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r2
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r9.mo5442i()
            if (r12 != 0) goto L_0x00ab
            goto L_0x00b3
        L_0x00ab:
            r9.mo5396C()
            r2 = r4
            r4 = r10
            r5 = r11
            goto L_0x0147
        L_0x00b3:
            r9.mo5466u0()
            r12 = r8 & 1
            r13 = 0
            r14 = 0
            if (r12 == 0) goto L_0x00d1
            boolean r12 = r9.mo5425Y()
            if (r12 == 0) goto L_0x00c3
            goto L_0x00d1
        L_0x00c3:
            r9.mo5396C()
            r0 = r29 & 8
            if (r0 == 0) goto L_0x00cc
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00cc:
            r13 = r10
            r15 = r11
            r10 = r1
            r11 = r4
            goto L_0x0100
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            androidx.compose.ui.b r0 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            goto L_0x00d7
        L_0x00d6:
            r0 = r1
        L_0x00d7:
            if (r3 == 0) goto L_0x00de
            long r3 = kotlin.reflect.C19421p.m32949o(r14, r14)
            goto L_0x00df
        L_0x00de:
            r3 = r4
        L_0x00df:
            if (r6 == 0) goto L_0x00e2
            r10 = r13
        L_0x00e2:
            r1 = r29 & 8
            if (r1 == 0) goto L_0x00fc
            androidx.compose.ui.window.f r1 = new androidx.compose.ui.window.f
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 63
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            r11 = r3
            r13 = r10
            r10 = r0
            goto L_0x0100
        L_0x00fc:
            r13 = r10
            r15 = r11
            r10 = r0
            r11 = r3
        L_0x0100:
            r9.mo5419S()
            m0.g r0 = new m0.g
            r0.<init>(r11)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.mo5465u(r1)
            boolean r1 = r9.mo5408I(r10)
            boolean r0 = r9.mo5408I(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r9.mo5431c0()
            if (r0 != 0) goto L_0x0121
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r0) goto L_0x0129
        L_0x0121:
            androidx.compose.ui.window.a r1 = new androidx.compose.ui.window.a
            r1.<init>(r10, r11)
            r9.mo5407H0(r1)
        L_0x0129:
            r9.mo5418R(r14)
            r0 = r1
            androidx.compose.ui.window.a r0 = (androidx.compose.p015ui.window.C2088a) r0
            int r1 = r2 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r2 | r1
            r6 = 0
            r1 = r13
            r2 = r15
            r3 = r26
            r4 = r9
            m4514a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r15
        L_0x0147:
            androidx.compose.runtime.v0 r9 = r9.mo5421U()
            if (r9 != 0) goto L_0x014e
            goto L_0x015c
        L_0x014e:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r6 = r26
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.f3081d = r10
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.AndroidPopup_androidKt.m4515b(androidx.compose.ui.a, long, kq.a, androidx.compose.ui.window.f, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final boolean m4516c(View view) {
        C19383o.m32797g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
