package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.List;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.y0 */
public final class C1270y0 {
    /* renamed from: a */
    public static final void m2406a(List list, C1436d dVar, C19861p pVar, C1302d dVar2, int i, int i2) {
        ComposerImpl h = dVar2.mo5440h(1631148337);
        if ((i2 & 2) != 0) {
            dVar = C1436d.C1437a.f3125b;
        }
        C1436d dVar3 = dVar;
        ListItemKt$BaselinesOffsetColumn$1 listItemKt$BaselinesOffsetColumn$1 = new ListItemKt$BaselinesOffsetColumn$1(list);
        h.mo5465u(-1323940314);
        C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(dVar3);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
        if (h.f2715a instanceof C1299c) {
            h.mo5392A();
            if (h.f2702K) {
                h.mo5450m(aVar);
            } else {
                h.mo5452n();
            }
            h.f2738x = false;
            Updater.m2571b(h, listItemKt$BaselinesOffsetColumn$1, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i3 >> 3) & 112));
            h.mo5465u(2058660585);
            pVar.invoke(h, Integer.valueOf((i3 >> 9) & 14));
            h.mo5418R(false);
            h.mo5418R(true);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new ListItemKt$BaselinesOffsetColumn$2(list, dVar3, pVar, i, i2);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2407b(float r13, androidx.compose.p015ui.C1436d r14, p753kq.C19861p r15, androidx.compose.runtime.C1302d r16, int r17, int r18) {
        /*
            r1 = r13
            r4 = r17
            r0 = -1062692685(0xffffffffc0a898b3, float:-5.26864)
            r2 = r16
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r18 & 1
            if (r2 == 0) goto L_0x0013
            r2 = r4 | 6
            goto L_0x0023
        L_0x0013:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0022
            boolean r2 = r0.mo5428b(r13)
            if (r2 == 0) goto L_0x001f
            r2 = 4
            goto L_0x0020
        L_0x001f:
            r2 = 2
        L_0x0020:
            r2 = r2 | r4
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            r3 = r18 & 2
            if (r3 == 0) goto L_0x002a
            r2 = r2 | 48
            goto L_0x003c
        L_0x002a:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003c
            r5 = r14
            boolean r6 = r0.mo5408I(r14)
            if (r6 == 0) goto L_0x0038
            r6 = 32
            goto L_0x003a
        L_0x0038:
            r6 = 16
        L_0x003a:
            r2 = r2 | r6
            goto L_0x003d
        L_0x003c:
            r5 = r14
        L_0x003d:
            r6 = r18 & 4
            if (r6 == 0) goto L_0x0045
            r2 = r2 | 384(0x180, float:5.38E-43)
            r11 = r15
            goto L_0x0056
        L_0x0045:
            r6 = r4 & 896(0x380, float:1.256E-42)
            r11 = r15
            if (r6 != 0) goto L_0x0056
            boolean r6 = r0.mo5408I(r15)
            if (r6 == 0) goto L_0x0053
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r2 = r2 | r6
        L_0x0056:
            r6 = r2 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0069
            boolean r6 = r0.mo5442i()
            if (r6 != 0) goto L_0x0063
            goto L_0x0069
        L_0x0063:
            r0.mo5396C()
            r2 = r5
            goto L_0x00f4
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x006f
        L_0x006e:
            r3 = r5
        L_0x006f:
            androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1 r5 = new androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
            r5.<init>(r13)
            int r6 = r2 >> 6
            r6 = r6 & 14
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r6 = r0.mo5410J(r6)
            m0.b r6 = (p174m0.C7282b) r6
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p015ui.unit.LayoutDirection) r7
            androidx.compose.runtime.l1 r8 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.ui.platform.j1 r8 = (androidx.compose.p015ui.platform.C1843j1) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r9.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r9 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r10 = androidx.compose.p015ui.layout.C1700o.m3617a(r3)
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 6
            androidx.compose.runtime.c<?> r12 = r0.f2715a
            boolean r12 = r12 instanceof androidx.compose.runtime.C1299c
            if (r12 == 0) goto L_0x010a
            r0.mo5392A()
            boolean r12 = r0.f2702K
            if (r12 == 0) goto L_0x00bb
            r0.mo5450m(r9)
            goto L_0x00be
        L_0x00bb:
            r0.mo5452n()
        L_0x00be:
            r12 = 0
            r0.f2738x = r12
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r9 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r6, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r7, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r5 = p504ai.C13983i.m21490i(r0, r8, r5, r0)
            int r6 = r2 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.invoke(r5, r0, r6)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo5465u(r5)
            int r2 = r2 >> 9
            r5 = r2 & 14
            r9 = 1
            r6 = r15
            r7 = r0
            r8 = r12
            r10 = r12
            androidx.compose.animation.C0472h.m1247j(r5, r6, r7, r8, r9, r10)
            r2 = r3
        L_0x00f4:
            androidx.compose.runtime.v0 r6 = r0.mo5421U()
            if (r6 != 0) goto L_0x00fb
            goto L_0x0109
        L_0x00fb:
            androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2 r7 = new androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
            r0 = r7
            r1 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f3081d = r7
        L_0x0109:
            return
        L_0x010a:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C1270y0.m2407b(float, androidx.compose.ui.d, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final ComposableLambdaImpl m2408c(float f, C2023s sVar, C19861p pVar) {
        if (pVar == null) {
            return null;
        }
        return C18263b.m30807B(new ListItemKt$applyTextStyle$1(f, sVar, pVar), -830176860, true);
    }
}
