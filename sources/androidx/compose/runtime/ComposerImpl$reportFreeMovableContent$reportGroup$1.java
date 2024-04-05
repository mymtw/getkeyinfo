package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class ComposerImpl$reportFreeMovableContent$reportGroup$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1296b $anchor;
    public final /* synthetic */ C1332i0 $reference;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$reportFreeMovableContent$reportGroup$1(ComposerImpl composerImpl, C1332i0 i0Var, C1296b bVar) {
        super(3);
        this.this$0 = composerImpl;
        this.$reference = i0Var;
        this.$anchor = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C19383o.m32797g(cVar, "<anonymous parameter 0>");
        C19383o.m32797g(d1Var, "slots");
        C19383o.m32797g(y0Var, "<anonymous parameter 2>");
        C1301c1 c1Var = new C1301c1();
        C1296b bVar = this.$anchor;
        C1306d1 p = c1Var.mo5649p();
        try {
            p.mo5670e();
            d1Var.mo5689w(bVar, p);
            p.mo5675j();
            C19394m mVar = C19394m.f43287a;
            p.mo5671f();
            this.this$0.f2716b.mo5487k(this.$reference, new C1328h0(c1Var));
        } catch (Throwable th) {
            p.mo5671f();
            throw th;
        }
    }
}
