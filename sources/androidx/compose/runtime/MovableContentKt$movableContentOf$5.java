package androidx.compose.runtime;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p753kq.C19865t;

final class MovableContentKt$movableContentOf$5 extends Lambda implements C19865t<Object, Object, Object, Object, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<Pair<Pair<Object, Object>, Pair<Object, Object>>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$5(C1325g0<Pair<Pair<Object, Object>, Pair<Object, Object>>> g0Var) {
        super(6);
        this.$movableContent = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        invoke(obj, obj2, obj3, obj4, (C1302d) obj5, ((Number) obj6).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Object obj, Object obj2, Object obj3, Object obj4, C1302d dVar, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (dVar.mo5408I(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= dVar.mo5408I(obj2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= dVar.mo5408I(obj3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= dVar.mo5408I(obj4) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((46811 & i2) != 9362 || !dVar.mo5442i()) {
            dVar.mo5458q(this.$movableContent, new Pair(new Pair(obj, obj2), new Pair(obj3, obj4)));
        } else {
            dVar.mo5396C();
        }
    }
}
