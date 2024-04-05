package androidx.compose.foundation.text.selection;

import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
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
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SimpleLayoutKt {
    /* renamed from: a */
    public static final void m2034a(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar2, int i, int i2) {
        int i3;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar2.mo5440h(-2105228848);
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
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = SimpleLayoutKt$SimpleLayout$1.f2082a;
            h.mo5465u(-1323940314);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(dVar);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, simpleLayoutKt$SimpleLayout$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i5 >> 3) & 112));
                h.mo5465u(2058660585);
                C0472h.m1247j((i5 >> 9) & 14, pVar, h, false, true, false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SimpleLayoutKt$SimpleLayout$2(dVar, pVar, i, i2);
        }
    }
}
