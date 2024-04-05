package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p753kq.C19846a;

public final class Recomposer$broadcastFrameClock$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public final void invoke() {
        C19747k<C19394m> z;
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.f2775d) {
            z = recomposer.mo5576z();
            if (((Recomposer.State) recomposer.f2788q.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                Throwable th = recomposer.f2777f;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (z != null) {
            z.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }
}
