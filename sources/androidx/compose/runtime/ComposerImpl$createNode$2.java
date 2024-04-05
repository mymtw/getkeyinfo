package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

public final class ComposerImpl$createNode$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C19846a<T> $factory;
    public final /* synthetic */ C1296b $groupAnchor;
    public final /* synthetic */ int $insertIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$createNode$2(C19846a<? extends T> aVar, C1296b bVar, int i) {
        super(3);
        this.$factory = aVar;
        this.$groupAnchor = bVar;
        this.$insertIndex = i;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "slots", y0Var, "<anonymous parameter 2>");
        T invoke = this.$factory.invoke();
        C1296b bVar = this.$groupAnchor;
        C19383o.m32797g(bVar, "anchor");
        d1Var.mo5665N(d1Var.mo5668c(bVar), invoke);
        cVar.mo5641c(this.$insertIndex, invoke);
        cVar.mo5613g(invoke);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
