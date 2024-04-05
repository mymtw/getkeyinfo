package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class MovableContentKt$movableContentWithReceiverOf$1 extends Lambda implements C19862q<Object, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<Object> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$1(C1325g0<Object> g0Var) {
        super(3);
        this.$movableContent = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Object obj, C1302d dVar, int i) {
        if ((i & 14) == 0) {
            i |= dVar.mo5408I(obj) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            dVar.mo5458q(this.$movableContent, obj);
        } else {
            dVar.mo5396C();
        }
    }
}
