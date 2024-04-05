package kotlinx.coroutines.sync;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import p753kq.C19857l;

public final class MutexImpl$LockCont$tryResumeLockWaiter$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ MutexImpl this$0;
    public final /* synthetic */ MutexImpl.LockCont this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl mutexImpl, MutexImpl.LockCont lockCont) {
        super(1);
        this.this$0 = mutexImpl;
        this.this$1 = lockCont;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.this$0.mo72642d(this.this$1.f43801e);
    }
}
