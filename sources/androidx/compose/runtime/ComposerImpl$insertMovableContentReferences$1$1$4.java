package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import androidx.compose.runtime.C1306d1;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class ComposerImpl$insertMovableContentReferences$1$1$4 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1332i0 $from;
    public final /* synthetic */ C1332i0 $to;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$4(ComposerImpl composerImpl, C1332i0 i0Var, C1332i0 i0Var2) {
        super(3);
        this.this$0 = composerImpl;
        this.$from = i0Var;
        this.$to = i0Var2;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "<anonymous parameter 2>");
        C1328h0 l = this.this$0.f2716b.mo5488l(this.$from);
        if (l != null) {
            C1301c1 c1Var = l.f2890a;
            C19383o.m32797g(c1Var, "table");
            ComposerKt.m2529f(d1Var.f2844m <= 0 && d1Var.mo5680o(d1Var.f2849r + 1) == 1);
            int i = d1Var.f2849r;
            int i2 = d1Var.f2839h;
            int i3 = d1Var.f2840i;
            d1Var.mo5666a(1);
            d1Var.mo5661J();
            d1Var.mo5670e();
            C1306d1 p = c1Var.mo5649p();
            try {
                List a = C1306d1.C1307a.m2683a(p, 1, d1Var, false, true);
                p.mo5671f();
                d1Var.mo5675j();
                d1Var.mo5674i();
                d1Var.f2849r = i;
                d1Var.f2839h = i2;
                d1Var.f2840i = i3;
                if (!a.isEmpty()) {
                    C1330i iVar = (C1330i) this.$to.f2917c;
                    int size = a.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C1296b bVar = (C1296b) a.get(i4);
                        C19383o.m32797g(bVar, "anchor");
                        Object H = d1Var.mo5659H(d1Var.mo5668c(bVar), 0);
                        C1418v0 v0Var = H instanceof C1418v0 ? (C1418v0) H : null;
                        if (v0Var != null) {
                            C19383o.m32797g(iVar, "composition");
                            v0Var.f3079b = iVar;
                        }
                    }
                }
            } catch (Throwable th) {
                p.mo5671f();
                throw th;
            }
        } else {
            ComposerKt.m2526c("Could not resolve state for movable content");
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
