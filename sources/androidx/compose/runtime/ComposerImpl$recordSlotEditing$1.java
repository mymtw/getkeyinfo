package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class ComposerImpl$recordSlotEditing$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1296b $anchor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordSlotEditing$1(C1296b bVar) {
        super(3);
        this.$anchor = bVar;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "<anonymous parameter 2>");
        C1296b bVar = this.$anchor;
        C19383o.m32797g(bVar, "anchor");
        d1Var.mo5676k(d1Var.mo5668c(bVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
