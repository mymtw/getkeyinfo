package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.C1385f;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p753kq.C19861p;

public final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements C19861p<Set<? extends Object>, C1385f, C19394m> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (C1385f) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Set<? extends Object> set, C1385f fVar) {
        C19747k<C19394m> kVar;
        C19383o.m32797g(set, "changed");
        C19383o.m32797g(fVar, "<anonymous parameter 1>");
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.f2775d) {
            if (((Recomposer.State) recomposer.f2788q.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.f2779h.add(set);
                kVar = recomposer.mo5576z();
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }
}
