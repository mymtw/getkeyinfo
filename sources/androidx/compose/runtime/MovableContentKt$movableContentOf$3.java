package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p753kq.C19863r;

final class MovableContentKt$movableContentOf$3 extends Lambda implements C19863r<Object, Object, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<Pair<Object, Object>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$3(C1325g0<Pair<Object, Object>> g0Var) {
        super(4);
        this.$movableContent = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(obj, obj2, (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Object obj, Object obj2, C1302d dVar, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (dVar.mo5408I(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= dVar.mo5408I(obj2) ? 32 : 16;
        }
        if ((i2 & 731) != 146 || !dVar.mo5442i()) {
            dVar.mo5458q(this.$movableContent, new Pair(obj, obj2));
        } else {
            dVar.mo5396C();
        }
    }
}
