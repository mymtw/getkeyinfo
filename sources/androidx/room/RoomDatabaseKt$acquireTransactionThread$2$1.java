package androidx.room;

import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19699g1;
import p753kq.C19857l;

final class RoomDatabaseKt$acquireTransactionThread$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19699g1 $controlJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$acquireTransactionThread$2$1(C19699g1 g1Var) {
        super(1);
        this.$controlJob = g1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$controlJob.mo72134a((CancellationException) null);
    }
}
