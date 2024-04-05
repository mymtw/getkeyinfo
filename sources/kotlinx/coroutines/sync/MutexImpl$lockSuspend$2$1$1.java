package kotlinx.coroutines.sync;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class MutexImpl$lockSuspend$2$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ MutexImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$lockSuspend$2$1$1(MutexImpl mutexImpl, Object obj) {
        super(1);
        this.this$0 = mutexImpl;
        this.$owner = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.this$0.mo72642d(this.$owner);
    }
}
