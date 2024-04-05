package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

public final class Recomposer$effectJob$1$1$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        Recomposer recomposer = this.this$0;
        Object obj = recomposer.f2775d;
        Throwable th2 = this.$throwable;
        synchronized (obj) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                if (!(!(th instanceof CancellationException))) {
                    th = null;
                }
                if (th != null) {
                    C17782b.m29886t(th2, th);
                }
            }
            recomposer.f2777f = th2;
            recomposer.f2788q.setValue(Recomposer.State.ShutDown);
            C19394m mVar = C19394m.f43287a;
        }
    }
}
