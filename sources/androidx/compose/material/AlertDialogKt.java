package androidx.compose.material;

import android.support.p013v4.media.session.C0087d;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19861p;

public final class AlertDialogKt {

    /* renamed from: a */
    public static final C1436d f2161a;

    /* renamed from: b */
    public static final C1436d f2162b;

    /* renamed from: c */
    public static final long f2163c = C0114h.m302g0(40);

    /* renamed from: d */
    public static final long f2164d = C0114h.m302g0(36);

    /* renamed from: e */
    public static final long f2165e = C0114h.m302g0(38);

    static {
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        float f = (float) 24;
        float f2 = f;
        float f3 = f;
        f2161a = C15588c1.m25287J0(aVar, f2, 0.0f, f3, 0.0f, 10);
        f2162b = C15588c1.m25287J0(aVar, f2, 0.0f, f3, (float) 28, 2);
    }

    /* renamed from: a */
    public static final void m2158a(C0739i iVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C1302d dVar, int i) {
        int i2;
        C1345l1 l1Var;
        C1345l1 l1Var2;
        C19846a<ComposeUiNode> aVar;
        C1345l1 l1Var3;
        C0739i iVar2 = iVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar3 = pVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar4 = pVar2;
        int i3 = i;
        C19383o.m32797g(iVar2, "<this>");
        ComposerImpl h = dVar.mo5440h(-555573207);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(iVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(pVar4) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            C1436d a = iVar.mo4124a();
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.f2166a;
            h.mo5465u(-1323940314);
            C1345l1 l1Var4 = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var4);
            C1345l1 l1Var5 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var5);
            C1345l1 l1Var6 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var6);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(a);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                boolean z = false;
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, alertDialogKt$AlertDialogBaselineLayout$2, pVar5);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar6);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar7);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar9 = pVar5;
                C19861p<ComposeUiNode, C7282b, C19394m> pVar10 = pVar6;
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar11 = pVar7;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar12 = pVar8;
                C0326j.m868m(0, a2, C13983i.m21490i(h, j1Var, pVar8, h), h, 2058660585, 1454034642);
                h.mo5465u(-1160646206);
                if (pVar3 == null) {
                    aVar = aVar2;
                    l1Var2 = l1Var6;
                    l1Var = l1Var5;
                    l1Var3 = l1Var4;
                } else {
                    C1436d b = iVar2.mo4125b(C1993m.m4358S(f2161a, "title"));
                    h.mo5465u(733328855);
                    C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
                    h.mo5465u(-1323940314);
                    C7282b bVar2 = (C7282b) h.mo5410J(l1Var4);
                    LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var5);
                    C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var6);
                    ComposableLambdaImpl a3 = C1700o.m3617a(b);
                    if (h.f2715a instanceof C1299c) {
                        h.mo5392A();
                        if (h.f2702K) {
                            h.mo5450m(aVar2);
                        } else {
                            h.mo5452n();
                        }
                        h.f2738x = false;
                        ComposerImpl composerImpl = h;
                        aVar = aVar2;
                        l1Var2 = l1Var6;
                        l1Var = l1Var5;
                        l1Var3 = l1Var4;
                        C0326j.m868m(0, a3, C0023f.m106g(h, c, pVar9, composerImpl, bVar2, pVar10, h, layoutDirection2, pVar11, h, j1Var2, pVar12, h), composerImpl, 2058660585, -2137368960);
                        h.mo5465u(472489145);
                        pVar3.invoke(h, 0);
                        h.mo5418R(false);
                        C0087d.m238h(h, false, false, true, false);
                        h.mo5418R(false);
                        C19394m mVar = C19394m.f43287a;
                        z = false;
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                }
                h.mo5418R(z);
                if (pVar4 != null) {
                    C1436d b2 = iVar2.mo4125b(C1993m.m4358S(f2162b, "text"));
                    h.mo5465u(733328855);
                    C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, z, h);
                    h.mo5465u(-1323940314);
                    C7282b bVar3 = (C7282b) h.mo5410J(l1Var3);
                    LayoutDirection layoutDirection3 = (LayoutDirection) h.mo5410J(l1Var);
                    C1843j1 j1Var3 = (C1843j1) h.mo5410J(l1Var2);
                    ComposableLambdaImpl a4 = C1700o.m3617a(b2);
                    if (h.f2715a instanceof C1299c) {
                        h.mo5392A();
                        if (h.f2702K) {
                            h.mo5450m(aVar);
                        } else {
                            h.mo5452n();
                        }
                        h.f2738x = false;
                        ComposerImpl composerImpl2 = h;
                        C0326j.m868m(0, a4, C0023f.m106g(h, c2, pVar9, composerImpl2, bVar3, pVar10, h, layoutDirection3, pVar11, h, j1Var3, pVar12, h), composerImpl2, 2058660585, -2137368960);
                        h.mo5465u(-272722206);
                        pVar4.invoke(h, 0);
                        h.mo5418R(false);
                        C0087d.m238h(h, false, false, true, false);
                        h.mo5418R(false);
                        C19394m mVar2 = C19394m.f43287a;
                        z = false;
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                }
                C0087d.m238h(h, z, z, true, z);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AlertDialogKt$AlertDialogBaselineLayout$3(iVar2, pVar3, pVar4, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ee  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2159b(p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r25, androidx.compose.p015ui.C1436d r26, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r27, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r28, androidx.compose.p015ui.graphics.C1530k0 r29, long r30, long r32, androidx.compose.runtime.C1302d r34, int r35, int r36) {
        /*
            r1 = r25
            r10 = r35
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            r2 = r34
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r36 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x0028
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0025
            r2 = 4
            goto L_0x0026
        L_0x0025:
            r2 = 2
        L_0x0026:
            r2 = r2 | r10
            goto L_0x0029
        L_0x0028:
            r2 = r10
        L_0x0029:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0030
            r2 = r2 | 48
            goto L_0x0043
        L_0x0030:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r26
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r2 = r2 | r5
            goto L_0x0045
        L_0x0043:
            r4 = r26
        L_0x0045:
            r5 = r36 & 4
            if (r5 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x005b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r7
            goto L_0x0061
        L_0x005f:
            r6 = r27
        L_0x0061:
            r7 = r36 & 8
            if (r7 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007b
            r8 = r28
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r9
            goto L_0x007d
        L_0x007b:
            r8 = r28
        L_0x007d:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0098
            r9 = r36 & 16
            if (r9 != 0) goto L_0x0092
            r9 = r29
            boolean r11 = r0.mo5408I(r9)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r9 = r29
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r2 = r2 | r11
            goto L_0x009a
        L_0x0098:
            r9 = r29
        L_0x009a:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x00b4
            r11 = r36 & 32
            if (r11 != 0) goto L_0x00ae
            r11 = r30
            boolean r13 = r0.mo5434e(r11)
            if (r13 == 0) goto L_0x00b0
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00ae:
            r11 = r30
        L_0x00b0:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r2 = r2 | r13
            goto L_0x00b6
        L_0x00b4:
            r11 = r30
        L_0x00b6:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00d0
            r13 = r36 & 64
            if (r13 != 0) goto L_0x00ca
            r13 = r32
            boolean r15 = r0.mo5434e(r13)
            if (r15 == 0) goto L_0x00cc
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00ca:
            r13 = r32
        L_0x00cc:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r2 = r2 | r15
            goto L_0x00d2
        L_0x00d0:
            r13 = r32
        L_0x00d2:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r2
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r4) goto L_0x00ee
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x00e2
            goto L_0x00ee
        L_0x00e2:
            r0.mo5396C()
            r2 = r26
            r3 = r6
            r4 = r8
            r5 = r9
            r6 = r11
            r8 = r13
            goto L_0x0199
        L_0x00ee:
            r0.mo5466u0()
            r4 = r10 & 1
            r15 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x0105
            goto L_0x011f
        L_0x0105:
            r0.mo5396C()
            r3 = r36 & 16
            if (r3 == 0) goto L_0x010e
            r2 = r2 & r17
        L_0x010e:
            r3 = r36 & 32
            if (r3 == 0) goto L_0x0114
            r2 = r2 & r16
        L_0x0114:
            r3 = r36 & 64
            if (r3 == 0) goto L_0x0119
            r2 = r2 & r15
        L_0x0119:
            r3 = r26
            r4 = r8
            r5 = r9
            r7 = r11
            goto L_0x0160
        L_0x011f:
            if (r3 == 0) goto L_0x0124
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0126
        L_0x0124:
            r3 = r26
        L_0x0126:
            r4 = 0
            if (r5 == 0) goto L_0x012a
            r6 = r4
        L_0x012a:
            if (r7 == 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r4 = r8
        L_0x012e:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x013f
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.material.q1 r5 = (androidx.compose.material.C1225q1) r5
            p.a r5 = r5.f2548b
            r2 = r2 & r17
            goto L_0x0140
        L_0x013f:
            r5 = r9
        L_0x0140:
            r7 = r36 & 32
            if (r7 == 0) goto L_0x0153
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.v r7 = (androidx.compose.material.C1259v) r7
            long r7 = r7.mo5363j()
            r2 = r2 & r16
            goto L_0x0154
        L_0x0153:
            r7 = r11
        L_0x0154:
            r9 = r36 & 64
            if (r9 == 0) goto L_0x0160
            long r11 = androidx.compose.material.ColorsKt.m2174b(r7, r0)
            r2 = r2 & r15
            r23 = r11
            goto L_0x0162
        L_0x0160:
            r23 = r13
        L_0x0162:
            r0.mo5419S()
            r17 = 0
            r18 = 0
            r9 = 629950291(0x258c4753, float:2.433446E-16)
            androidx.compose.material.AlertDialogKt$AlertDialogContent$1 r11 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            r11.<init>(r6, r4, r1, r2)
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = p628nj.C18263b.m30805A(r0, r9, r11)
            r9 = 1572864(0x180000, float:2.204052E-39)
            int r11 = r2 >> 3
            r11 = r11 & 14
            r9 = r9 | r11
            int r2 = r2 >> 9
            r11 = r2 & 112(0x70, float:1.57E-43)
            r9 = r9 | r11
            r11 = r2 & 896(0x380, float:1.256E-42)
            r9 = r9 | r11
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r21 = r9 | r2
            r22 = 48
            r11 = r3
            r12 = r5
            r13 = r7
            r15 = r23
            r20 = r0
            androidx.compose.material.SurfaceKt.m2234a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            r2 = r3
            r3 = r6
            r6 = r7
            r8 = r23
        L_0x0199:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x01a0
            goto L_0x01ae
        L_0x01a0:
            androidx.compose.material.AlertDialogKt$AlertDialogContent$2 r13 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$2
            r0 = r13
            r1 = r25
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            r12.f3081d = r13
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m2159b(kq.p, androidx.compose.ui.d, kq.p, kq.p, androidx.compose.ui.graphics.k0, long, long, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final void m2160c(float f, float f2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(73434452);
        if ((i & 14) == 0) {
            i2 = (h.mo5428b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5428b(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(pVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            AlertDialogKt$AlertDialogFlowRow$1 alertDialogKt$AlertDialogFlowRow$1 = new AlertDialogKt$AlertDialogFlowRow$1(f, f2);
            h.mo5465u(-1323940314);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, alertDialogKt$AlertDialogFlowRow$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i3 >> 3) & 112));
                h.mo5465u(2058660585);
                C0472h.m1247j((i3 >> 9) & 14, pVar, h, false, true, false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AlertDialogKt$AlertDialogFlowRow$2(f, f2, pVar, i);
        }
    }
}
