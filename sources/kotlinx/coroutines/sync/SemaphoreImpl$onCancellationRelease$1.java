package kotlinx.coroutines.sync;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SemaphoreImpl$onCancellationRelease$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19817e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemaphoreImpl$onCancellationRelease$1(C19817e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.this$0.release();
    }
}
