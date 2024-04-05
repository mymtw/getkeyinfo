package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19862q;

final class ComposerImpl$insertMovableContentReferences$1$1$3 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;
    public final /* synthetic */ List<Object> $nodesToInsert;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$3(Ref$IntRef ref$IntRef, List<? extends Object> list) {
        super(3);
        this.$effectiveNodeIndex = ref$IntRef;
        this.$nodesToInsert = list;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "<anonymous parameter 1>", y0Var, "<anonymous parameter 2>");
        int i = this.$effectiveNodeIndex.element;
        List<Object> list = this.$nodesToInsert;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            cVar.mo5643f(i3, obj);
            cVar.mo5641c(i3, obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
