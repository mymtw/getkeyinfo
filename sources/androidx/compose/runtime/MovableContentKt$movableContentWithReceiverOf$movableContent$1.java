package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class MovableContentKt$movableContentWithReceiverOf$movableContent$1 extends Lambda implements C19862q<Object, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19862q<Object, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$1(C19862q<Object, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(3);
        this.$content = qVar;
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
            this.$content.invoke(obj, dVar, Integer.valueOf(i & 14));
        } else {
            dVar.mo5396C();
        }
    }
}
