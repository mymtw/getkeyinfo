package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;
import p753kq.C19864s;

final class MovableContentKt$movableContentOf$movableContent$3 extends Lambda implements C19862q<Pair<? extends Pair<Object, Object>, Object>, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19864s<Object, Object, Object, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$3(C19864s<Object, Object, Object, ? super C1302d, ? super Integer, C19394m> sVar) {
        super(3);
        this.$content = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Pair<? extends Pair<Object, Object>, Object>) (Pair) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Pair<? extends Pair<Object, Object>, Object> pair, C1302d dVar, int i) {
        C19383o.m32797g(pair, "it");
        this.$content.invoke(((Pair) pair.getFirst()).getFirst(), ((Pair) pair.getFirst()).getSecond(), pair.getSecond(), dVar, 0);
    }
}
