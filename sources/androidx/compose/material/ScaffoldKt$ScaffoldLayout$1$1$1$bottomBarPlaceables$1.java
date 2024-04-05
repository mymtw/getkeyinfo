package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $bottomBar;
    public final /* synthetic */ C1227r0 $fabPlacement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(C1227r0 r0Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$fabPlacement = r0Var;
        this.$bottomBar = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            CompositionLocalKt.m2530a(new C1412t0[]{ScaffoldKt.f2250a.mo5908b(this.$fabPlacement)}, this.$bottomBar, dVar, ((this.$$dirty >> 15) & 112) | 8);
            return;
        }
        dVar.mo5396C();
    }
}
