package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
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

final class SurfaceKt$Surface$13 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0871p $indication;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ C1900g $role;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$13(C1436d dVar, C1530k0 k0Var, long j, float f, int i, C0556g gVar, float f2, C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar2, C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$shape = k0Var;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$dirty = i;
        this.$border = gVar;
        this.$elevation = f2;
        this.$interactionSource = jVar;
        this.$indication = pVar;
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = gVar2;
        this.$onClick = aVar;
        this.$content = pVar2;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d i0 = SurfaceKt.m2237d(TouchTargetKt.m2285a(this.$modifier), this.$shape, SurfaceKt.m2238e(this.$color, (C1215n0) dVar.mo5410J(ElevationOverlayKt.f2206a), this.$absoluteElevation, dVar, (this.$$dirty >> 9) & 14), this.$border, this.$elevation).mo6148i0(ClickableKt.m1296b(C1436d.C1437a.f3125b, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, this.$onClick));
            C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            int i2 = this.$$dirty1;
            dVar.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, true, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(i0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -2137368960);
                dVar.mo5465u(-1300719946);
                pVar.invoke(dVar, Integer.valueOf((i2 >> 6) & 14));
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
