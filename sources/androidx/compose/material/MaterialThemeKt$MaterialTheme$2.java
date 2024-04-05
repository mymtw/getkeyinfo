package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class MaterialThemeKt$MaterialTheme$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1259v $colors;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1225q1 $shapes;
    public final /* synthetic */ C1178d2 $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$2(C1259v vVar, C1178d2 d2Var, C1225q1 q1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$colors = vVar;
        this.$typography = d2Var;
        this.$shapes = q1Var;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        MaterialThemeKt.m2189a(this.$colors, this.$typography, this.$shapes, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
