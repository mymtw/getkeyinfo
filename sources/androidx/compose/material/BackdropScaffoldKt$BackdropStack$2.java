package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

final class BackdropScaffoldKt$BackdropStack$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $backLayer;
    public final /* synthetic */ C19857l<C7280a, C7280a> $calculateBackLayerConstraints;
    public final /* synthetic */ C19863r<C7280a, Float, C1302d, Integer, C19394m> $frontLayer;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19857l<? super C7280a, C7280a> lVar, C19863r<? super C7280a, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1171c.m2301b(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, dVar, this.$$changed | 1);
    }
}
