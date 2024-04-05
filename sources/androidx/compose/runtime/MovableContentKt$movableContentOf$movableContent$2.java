package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;
import p753kq.C19863r;

final class MovableContentKt$movableContentOf$movableContent$2 extends Lambda implements C19862q<Pair<Object, Object>, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19863r<Object, Object, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$2(C19863r<Object, Object, ? super C1302d, ? super Integer, C19394m> rVar) {
        super(3);
        this.$content = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Pair<Object, Object>) (Pair) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(Pair<Object, Object> pair, C1302d dVar, int i) {
        C19383o.m32797g(pair, "it");
        if ((i & 14) == 0) {
            i |= dVar.mo5408I(pair) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            this.$content.invoke(pair.getFirst(), pair.getSecond(), dVar, 0);
        } else {
            dVar.mo5396C();
        }
    }
}
