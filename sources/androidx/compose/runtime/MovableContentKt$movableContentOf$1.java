package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class MovableContentKt$movableContentOf$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<C19394m> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$1(C1325g0<C19394m> g0Var) {
        super(2);
        this.$movableContent = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            dVar.mo5458q(this.$movableContent, C19394m.f43287a);
        } else {
            dVar.mo5396C();
        }
    }
}
