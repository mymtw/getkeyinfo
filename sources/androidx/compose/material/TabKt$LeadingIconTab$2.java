package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

final class TabKt$LeadingIconTab$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C0871p $ripple;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$2(C1436d dVar, boolean z, C0640j jVar, C0871p pVar, boolean z2, C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar3) {
        super(2);
        this.$modifier = dVar;
        this.$selected = z;
        this.$interactionSource = jVar;
        this.$ripple = pVar;
        this.$enabled = z2;
        this.$onClick = aVar;
        this.$icon = pVar2;
        this.$$dirty = i;
        this.$text = pVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d g = SizeKt.m1487g(C15588c1.m25283H0(SelectableKt.m1944a(SizeKt.m1488h(this.$modifier, TabKt.f2313a), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, new C1900g(4), this.$onClick), TabKt.f2315c, 0.0f, 2));
            C0718d.C0720b bVar = C0718d.f1480e;
            C1432b.C1434b bVar2 = C1428a.C1429a.f3114j;
            C19861p<C1302d, Integer, C19394m> pVar = this.$icon;
            int i2 = this.$$dirty;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$text;
            dVar2.mo5465u(693286680);
            C1711v a = RowKt.m1480a(bVar, bVar2, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar3 = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(g);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar3, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -678309503);
                dVar2.mo5465u(1002887383);
                pVar.invoke(dVar2, Integer.valueOf((i2 >> 9) & 14));
                float f = TabKt.f2319g;
                C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                C15588c1.m25324f(new SizeModifier(f, 0.0f, f, 0.0f, false, 10), dVar2, 6);
                TextKt.m2282a(C2023s.m4469a(((C1178d2) dVar2.mo5410J(TypographyKt.f2371a)).f2412k, 0, 0, (C1952g) null, new C2029d(3), 245759), pVar2, dVar2, (i2 >> 3) & 112);
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
