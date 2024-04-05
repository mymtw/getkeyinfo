package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

public final class ComposerImpl$recordSideEffect$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C19846a<C19394m> $effect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordSideEffect$1(C19846a<C19394m> aVar) {
        super(3);
        this.$effect = aVar;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "<anonymous parameter 1>", y0Var, "rememberManager");
        y0Var.mo5825c(this.$effect);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
