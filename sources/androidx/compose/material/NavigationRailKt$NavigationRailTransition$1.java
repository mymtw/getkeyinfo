package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class NavigationRailKt$NavigationRailTransition$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C1342k1<Float> $animationProgress$delegate;
    public final /* synthetic */ C19862q<Float, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailTransition$1(C19862q<? super Float, ? super C1302d, ? super Integer, C19394m> qVar, int i, C1342k1<Float> k1Var) {
        super(2);
        this.$content = qVar;
        this.$$dirty = i;
        this.$animationProgress$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19862q<Float, C1302d, Integer, C19394m> qVar = this.$content;
            C1342k1<Float> k1Var = this.$animationProgress$delegate;
            C0433j0<Float> j0Var = NavigationRailKt.f2227a;
            qVar.invoke(Float.valueOf(k1Var.getValue().floatValue()), dVar, Integer.valueOf((this.$$dirty >> 6) & 112));
            return;
        }
        dVar.mo5396C();
    }
}
