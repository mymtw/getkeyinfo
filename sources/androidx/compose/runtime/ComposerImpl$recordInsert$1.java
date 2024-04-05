package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class ComposerImpl$recordInsert$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1296b $anchor;
    public final /* synthetic */ C1301c1 $insertTable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$1(C1301c1 c1Var, C1296b bVar) {
        super(3);
        this.$insertTable = c1Var;
        this.$anchor = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C19383o.m32797g(cVar, "<anonymous parameter 0>");
        C19383o.m32797g(d1Var, "slots");
        C19383o.m32797g(y0Var, "<anonymous parameter 2>");
        d1Var.mo5670e();
        C1301c1 c1Var = this.$insertTable;
        C1296b bVar = this.$anchor;
        bVar.getClass();
        C19383o.m32797g(c1Var, "slots");
        d1Var.mo5685t(c1Var, c1Var.mo5646l(bVar));
        d1Var.mo5675j();
    }
}
