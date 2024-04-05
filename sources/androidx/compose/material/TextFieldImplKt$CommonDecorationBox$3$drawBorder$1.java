package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p288y.C8347f;
import p753kq.C19846a;
import p753kq.C19861p;

public final class TextFieldImplKt$CommonDecorationBox$3$drawBorder$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $border;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C1338j0<C8347f> $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$drawBorder$1(C1338j0<C8347f> j0Var, C0759v vVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$labelSize = j0Var;
        this.$contentPadding = vVar;
        this.$border = pVar;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d S = C1993m.m4358S(C1436d.C1437a.f3125b, "border");
            long j = this.$labelSize.getValue().f18316a;
            C0759v vVar = this.$contentPadding;
            float f = OutlinedTextFieldKt.f2243a;
            C19383o.m32797g(S, "$this$outlineCutout");
            C19383o.m32797g(vVar, "paddingValues");
            C1436d c = DrawModifierKt.m3072c(S, new OutlinedTextFieldKt$outlineCutout$1(j, vVar));
            C19861p<C1302d, Integer, C19394m> pVar = this.$border;
            int i2 = this.$$dirty1;
            dVar.mo5465u(733328855);
            C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, true, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(c);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, c2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -2137368960);
                dVar.mo5465u(1029492925);
                if (pVar != null) {
                    pVar.invoke(dVar, Integer.valueOf((i2 >> 12) & 14));
                }
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
