package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class MovableContentKt$movableContentOf$movableContent$1 extends Lambda implements C19862q<C19394m, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        super(3);
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C19394m) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar, C1302d dVar, int i) {
        C19383o.m32797g(mVar, "it");
        if ((i & 81) != 16 || !dVar.mo5442i()) {
            this.$content.invoke(dVar, 0);
        } else {
            dVar.mo5396C();
        }
    }
}
