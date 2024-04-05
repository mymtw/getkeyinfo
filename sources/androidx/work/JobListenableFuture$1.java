package androidx.work;

import androidx.work.impl.utils.futures.C3419a;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class JobListenableFuture$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C3420j<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobListenableFuture$1(C3420j<Object> jVar) {
        super(1);
        this.this$0 = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            if (!this.this$0.f8023c.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th instanceof CancellationException) {
            this.this$0.f8023c.cancel(true);
        } else {
            C3419a<R> aVar = this.this$0.f8023c;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            aVar.mo12918j(th);
        }
    }
}
