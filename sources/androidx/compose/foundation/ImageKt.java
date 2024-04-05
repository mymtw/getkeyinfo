package androidx.compose.foundation;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ImageKt {
    /* renamed from: a */
    public static final void m1308a(Painter painter, String str, C1436d dVar, C1428a aVar, C1670c cVar, float f, C1546t tVar, C1302d dVar2, int i, int i2) {
        C1436d dVar3;
        String str2 = str;
        C19383o.m32797g(painter, "painter");
        ComposerImpl h = dVar2.mo5440h(1142754848);
        C1436d.C1437a aVar2 = (i2 & 4) != 0 ? C1436d.C1437a.f3125b : dVar;
        C1432b bVar = (i2 & 8) != 0 ? C1428a.C1429a.f3108d : aVar;
        C1670c.C1671a.C1672a aVar3 = (i2 & 16) != 0 ? C1670c.C1671a.f3712a : cVar;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        C1546t tVar2 = (i2 & 64) != 0 ? null : tVar;
        h.mo5465u(-816794123);
        if (str2 != null) {
            C1436d.C1437a aVar4 = C1436d.C1437a.f3125b;
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(str2);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new ImageKt$Image$semantics$1$1(str2);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            dVar3 = SemanticsModifierKt.m4174a(aVar4, false, (C19857l) c0);
        } else {
            dVar3 = C1436d.C1437a.f3125b;
        }
        h.mo5418R(false);
        C1436d t0 = C19382n.m32772t0(C19543e0.m33287C(aVar2.mo6148i0(dVar3)), painter, bVar, aVar3, f2, tVar2, 2);
        ImageKt$Image$2 imageKt$Image$2 = ImageKt$Image$2.f1270a;
        h.mo5465u(-1323940314);
        C7282b bVar2 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(t0);
        if (h.f2715a instanceof C1299c) {
            h.mo5392A();
            if (h.f2702K) {
                h.mo5450m(aVar5);
            } else {
                h.mo5452n();
            }
            h.f2738x = false;
            Updater.m2571b(h, imageKt$Image$2, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2077995625);
            h.mo5418R(false);
            h.mo5418R(false);
            h.mo5418R(true);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                ImageKt$Image$3 imageKt$Image$3 = r0;
                ImageKt$Image$3 imageKt$Image$32 = new ImageKt$Image$3(painter, str, aVar2, bVar, aVar3, f2, tVar2, i, i2);
                U.f3081d = imageKt$Image$3;
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }
}
