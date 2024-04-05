package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.runtime.C1302d;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $bottomBarHeight;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1696m0 $this_SubcomposeLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(C1696m0 m0Var, int i, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, int i2) {
        super(2);
        this.$this_SubcomposeLayout = m0Var;
        this.$bottomBarHeight = i;
        this.$content = qVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$content.invoke(C15588c1.m25322e(0.0f, 0.0f, this.$this_SubcomposeLayout.mo3797p(this.$bottomBarHeight), 7), dVar, Integer.valueOf((this.$$dirty >> 6) & 112));
            return;
        }
        dVar.mo5396C();
    }
}
