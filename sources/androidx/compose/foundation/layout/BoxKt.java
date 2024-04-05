package androidx.compose.foundation.layout;

import android.support.p013v4.media.session.C0087d;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;

public final class BoxKt {

    /* renamed from: a */
    public static final BoxKt$boxMeasurePolicy$1 f1391a = new BoxKt$boxMeasurePolicy$1(C1428a.C1429a.f3105a, false);

    /* renamed from: b */
    public static final BoxKt$EmptyBoxMeasurePolicy$1 f1392b = BoxKt$EmptyBoxMeasurePolicy$1.f1393a;

    /* renamed from: a */
    public static final void m1455a(C1436d dVar, C1302d dVar2, int i) {
        int i2;
        C19383o.m32797g(dVar, "modifier");
        ComposerImpl h = dVar2.mo5440h(-211209833);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            BoxKt$EmptyBoxMeasurePolicy$1 boxKt$EmptyBoxMeasurePolicy$1 = f1392b;
            h.mo5465u(-1323940314);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(dVar);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, boxKt$EmptyBoxMeasurePolicy$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i3 >> 3) & 112));
                h.mo5465u(2058660585);
                h.mo5465u(1021196736);
                if (((i3 >> 9) & 14 & 11) == 2 && h.mo5442i()) {
                    h.mo5396C();
                }
                C0087d.m238h(h, false, false, true, false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BoxKt$Box$3(dVar, i);
        }
    }

    /* renamed from: b */
    public static final void m1456b(C1686i0.C1687a aVar, C1686i0 i0Var, C1710u uVar, LayoutDirection layoutDirection, int i, int i2, C1428a aVar2) {
        C1428a aVar3;
        Object f = uVar.mo6666f();
        C0731e eVar = f instanceof C0731e ? (C0731e) f : null;
        long a = ((eVar == null || (aVar3 = eVar.f1494c) == null) ? aVar2 : aVar3).mo6133a(C0761x.m1707a(i0Var.f3722b, i0Var.f3723c), C0761x.m1707a(i, i2), layoutDirection);
        C1686i0.C1687a.C1688a aVar4 = C1686i0.C1687a.f3726a;
        aVar.getClass();
        C1686i0.C1687a.m3582d(i0Var, a, 0.0f);
    }

    /* renamed from: c */
    public static final C1711v m1457c(C1428a aVar, boolean z, C1302d dVar) {
        C1711v vVar;
        C19383o.m32797g(aVar, ResponseConstants.ALIGNMENT);
        dVar.mo5465u(56522820);
        if (!C19383o.m32792b(aVar, C1428a.C1429a.f3105a) || z) {
            Boolean valueOf = Boolean.valueOf(z);
            dVar.mo5465u(511388516);
            boolean I = dVar.mo5408I(valueOf) | dVar.mo5408I(aVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new BoxKt$boxMeasurePolicy$1(aVar, z);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            vVar = (C1711v) v;
        } else {
            vVar = f1391a;
        }
        dVar.mo5406H();
        return vVar;
    }
}
