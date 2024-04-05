package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19862q;

final class ComposerImpl$insertMovableContentReferences$1$1$2$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;
    public final /* synthetic */ List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> $offsetChanges;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$2$2(Ref$IntRef ref$IntRef, List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list) {
        super(3);
        this.$effectiveNodeIndex = ref$IntRef;
        this.$offsetChanges = list;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "slots", y0Var, "rememberManager");
        int i = this.$effectiveNodeIndex.element;
        if (i > 0) {
            cVar = new C1344l0<>(cVar, i);
        }
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list = this.$offsetChanges;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).invoke(cVar, d1Var, y0Var);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
