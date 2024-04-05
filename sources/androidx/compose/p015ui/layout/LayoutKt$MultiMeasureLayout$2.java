package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2 */
final class LayoutKt$MultiMeasureLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1711v $measurePolicy;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1711v vVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$content = pVar;
        this.$measurePolicy = vVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C1436d dVar2 = this.$modifier;
        C19861p<C1302d, Integer, C19394m> pVar = this.$content;
        C1711v vVar = this.$measurePolicy;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        C19383o.m32797g(vVar, "measurePolicy");
        ComposerImpl h = dVar.mo5440h(1949933075);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i4 & 2) != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i2 |= 384;
        } else if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(vVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            if (i5 != 0) {
                dVar2 = C1436d.C1437a.f3125b;
            }
            C1436d c = ComposedModifierKt.m3051c(h, dVar2);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            C19846a<LayoutNode> aVar = LayoutNode.f3793W;
            int i6 = ((i2 << 3) & 896) | 6;
            h.mo5465u(-692256719);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                ComposeUiNode.f3776c0.getClass();
                Updater.m2571b(h, c, ComposeUiNode.Companion.f3779c);
                Updater.m2571b(h, vVar, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                Updater.m2571b(h, j1Var, ComposeUiNode.Companion.f3783g);
                Updater.m2570a(h, LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
                h.mo5430c();
                pVar.invoke(h, Integer.valueOf((i6 >> 6) & 14));
                h.mo5418R(true);
                h.mo5418R(false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1436d dVar3 = dVar2;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LayoutKt$MultiMeasureLayout$2(dVar3, pVar, vVar, i3, i4);
        }
    }
}
