package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19747k;
import p753kq.C19857l;

public final class Recomposer$effectJob$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public final void invoke(Throwable th) {
        C19747k<? super C19394m> kVar;
        C19747k<? super C19394m> kVar2;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.f2775d) {
            C19699g1 g1Var = recomposer.f2776e;
            kVar = null;
            if (g1Var != null) {
                recomposer.f2788q.setValue(Recomposer.State.ShuttingDown);
                if (!recomposer.f2787p) {
                    g1Var.mo72134a(cancellationException);
                } else {
                    kVar2 = recomposer.f2785n;
                    if (kVar2 != null) {
                        recomposer.f2785n = null;
                        g1Var.mo72401k(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                        kVar = kVar2;
                    }
                }
                kVar2 = null;
                recomposer.f2785n = null;
                g1Var.mo72401k(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                kVar = kVar2;
            } else {
                recomposer.f2777f = cancellationException;
                recomposer.f2788q.setValue(Recomposer.State.ShutDown);
                C19394m mVar = C19394m.f43287a;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
