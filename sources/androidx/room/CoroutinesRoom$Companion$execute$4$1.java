package androidx.room;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19699g1;
import p753kq.C19857l;

final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ C19699g1 $job;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, C19699g1 g1Var) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = g1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$cancellationSignal.cancel();
        this.$job.mo72134a((CancellationException) null);
    }
}
