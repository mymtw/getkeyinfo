package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class BackdropScaffoldKt$BackLayerTransition$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $appBar;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ BackdropValue $target;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackLayerTransition$2(BackdropValue backdropValue, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(2);
        this.$target = backdropValue;
        this.$appBar = pVar;
        this.$content = pVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1171c.m2300a(this.$target, this.$appBar, this.$content, dVar, this.$$changed | 1);
    }
}
