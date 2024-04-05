package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p753kq.C19864s;

final class MovableContentKt$movableContentOf$4 extends Lambda implements C19864s<Object, Object, Object, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<Pair<Pair<Object, Object>, Object>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$4(C1325g0<Pair<Pair<Object, Object>, Object>> g0Var) {
        super(5);
        this.$movableContent = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(obj, obj2, obj3, (C1302d) obj4, ((Number) obj5).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Object obj, Object obj2, Object obj3, C1302d dVar, int i) {
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
        if ((i2 & 5851) != 1170 || !dVar.mo5442i()) {
            dVar.mo5458q(this.$movableContent, new Pair(new Pair(obj, obj2), obj3));
        } else {
            dVar.mo5396C();
        }
    }
}
