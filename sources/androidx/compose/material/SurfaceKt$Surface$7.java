package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.C1244j;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SurfaceKt$Surface$7 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$7(C1436d dVar, C1530k0 k0Var, long j, float f, int i, C0556g gVar, float f2, boolean z, C0640j jVar, boolean z2, C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$shape = k0Var;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$dirty = i;
        this.$border = gVar;
        this.$elevation = f2;
        this.$selected = z;
        this.$interactionSource = jVar;
        this.$enabled = z2;
        this.$onClick = aVar;
        this.$content = pVar;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d a = TouchTargetKt.m2285a(this.$modifier);
            C1530k0 k0Var = this.$shape;
            C1436d dVar3 = a;
            C1530k0 k0Var2 = k0Var;
            C1436d a2 = SelectableKt.m1944a(SurfaceKt.m2237d(dVar3, k0Var2, SurfaceKt.m2238e(this.$color, (C1215n0) dVar2.mo5410J(ElevationOverlayKt.f2206a), this.$absoluteElevation, dVar, (this.$$dirty >> 15) & 14), this.$border, this.$elevation), this.$selected, this.$interactionSource, C1244j.m2369a(false, 0.0f, 0, dVar, 0, 7), this.$enabled, new C1900g(4), this.$onClick);
            C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            int i2 = this.$$dirty1;
            dVar2.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, true, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a3 = C1700o.m3617a(a2);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a3, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -2137368960);
                dVar2.mo5465u(23612267);
                pVar.invoke(dVar2, Integer.valueOf(i2 & 14));
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
