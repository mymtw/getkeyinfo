package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class ComposerImpl$recordInsert$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1296b $anchor;
    public final /* synthetic */ List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> $fixups;
    public final /* synthetic */ C1301c1 $insertTable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$2(C1301c1 c1Var, C1296b bVar, List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list) {
        super(3);
        this.$insertTable = c1Var;
        this.$anchor = bVar;
        this.$fixups = list;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "slots", y0Var, "rememberManager");
        C1301c1 c1Var = this.$insertTable;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list = this.$fixups;
        C1306d1 p = c1Var.mo5649p();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(cVar, p, y0Var);
            }
            C19394m mVar = C19394m.f43287a;
            p.mo5671f();
            d1Var.mo5670e();
            C1301c1 c1Var2 = this.$insertTable;
            C1296b bVar = this.$anchor;
            bVar.getClass();
            C19383o.m32797g(c1Var2, "slots");
            d1Var.mo5685t(c1Var2, c1Var2.mo5646l(bVar));
            d1Var.mo5675j();
        } catch (Throwable th) {
            p.mo5671f();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
