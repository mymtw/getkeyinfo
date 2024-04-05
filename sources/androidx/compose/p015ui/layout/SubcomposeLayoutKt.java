package androidx.compose.p015ui.layout;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt */
public final class SubcomposeLayoutKt {
    /* renamed from: a */
    public static final void m3531a(C1436d dVar, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w> pVar, C1302d dVar2, int i, int i2) {
        int i3;
        C19383o.m32797g(pVar, "measurePolicy");
        ComposerImpl h = dVar2.mo5440h(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.mo5442i()) {
            if (i4 != 0) {
                dVar = C1436d.C1437a.f3125b;
            }
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            if (c0 == C1302d.C1303a.f2828a) {
                c0 = new SubcomposeLayoutState();
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            int i5 = i3 << 3;
            m3532b((SubcomposeLayoutState) c0, dVar, pVar, h, (i5 & 112) | 8 | (i5 & 896), 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SubcomposeLayoutKt$SubcomposeLayout$2(dVar, pVar, i, i2);
        }
    }

    /* renamed from: b */
    public static final void m3532b(SubcomposeLayoutState subcomposeLayoutState, C1436d dVar, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w> pVar, C1302d dVar2, int i, int i2) {
        C19383o.m32797g(subcomposeLayoutState, "state");
        C19383o.m32797g(pVar, "measurePolicy");
        ComposerImpl h = dVar2.mo5440h(-511989831);
        if ((i2 & 2) != 0) {
            dVar = C1436d.C1437a.f3125b;
        }
        C1436d dVar3 = dVar;
        C1324g m0 = C0005b.m50m0(h);
        C1436d c = ComposedModifierKt.m3051c(h, dVar3);
        C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        C19846a<LayoutNode> aVar = LayoutNode.f3793W;
        h.mo5465u(1886828752);
        if (h.f2715a instanceof C1299c) {
            h.mo5470w0();
            if (h.f2702K) {
                h.mo5450m(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(aVar));
            } else {
                h.mo5452n();
            }
            Updater.m2571b(h, subcomposeLayoutState, subcomposeLayoutState.f3704c);
            Updater.m2571b(h, m0, subcomposeLayoutState.f3705d);
            ComposeUiNode.f3776c0.getClass();
            Updater.m2571b(h, c, ComposeUiNode.Companion.f3779c);
            Updater.m2571b(h, pVar, subcomposeLayoutState.f3706e);
            Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            Updater.m2571b(h, j1Var, ComposeUiNode.Companion.f3783g);
            h.mo5418R(true);
            h.mo5418R(false);
            h.mo5465u(-607848778);
            if (!h.mo5442i()) {
                C1415u.m3033g(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), h);
            }
            h.mo5418R(false);
            C1338j0 E0 = C0761x.m1664E0(subcomposeLayoutState, h);
            C19394m mVar = C19394m.f43287a;
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(E0);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new SubcomposeLayoutKt$SubcomposeLayout$5$1(E0);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1415u.m3028b(mVar, (C19857l) c0, h);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, dVar3, pVar, i, i2);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }
}
