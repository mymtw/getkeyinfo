package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ float $placeholderAlphaProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(float f, C1166a2 a2Var, boolean z, int i, int i2, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        super(3);
        this.$placeholderAlphaProgress = f;
        this.$colors = a2Var;
        this.$enabled = z;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$placeholder = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1436d dVar, C1302d dVar2, int i) {
        int i2;
        C1436d dVar3 = dVar;
        C1302d dVar4 = dVar2;
        C19383o.m32797g(dVar, "modifier");
        if ((i & 14) == 0) {
            i2 = i | (dVar4.mo5408I(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar2.mo5442i()) {
            C1436d I = C0005b.m15I(dVar, this.$placeholderAlphaProgress);
            C1166a2 a2Var = this.$colors;
            boolean z = this.$enabled;
            int i3 = this.$$dirty;
            C19861p<C1302d, Integer, C19394m> pVar = this.$placeholder;
            dVar4.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar4);
            dVar4.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar4.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar4.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar4.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(I);
            if (dVar2.mo5446k() instanceof C1299c) {
                dVar2.mo5392A();
                if (dVar2.mo5436f()) {
                    dVar4.mo5450m(aVar);
                } else {
                    dVar2.mo5452n();
                }
                dVar2.mo5394B();
                Updater.m2571b(dVar4, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar4, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar4, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a, C0073e.m204d(dVar4, j1Var, ComposeUiNode.Companion.f3783g, dVar4), dVar2, 2058660585, -2137368960);
                dVar4.mo5465u(1188063364);
                TextFieldImplKt.m2268b(((C1545s) a2Var.mo5226e(z, dVar4).getValue()).f3366a, ((C1178d2) dVar4.mo5410J(TypographyKt.f2371a)).f2408g, (Float) null, pVar, dVar2, (i3 >> 6) & 7168, 4);
                dVar2.mo5406H();
                dVar2.mo5406H();
                dVar2.mo5406H();
                dVar2.mo5456p();
                dVar2.mo5406H();
                dVar2.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar2.mo5396C();
    }
}
