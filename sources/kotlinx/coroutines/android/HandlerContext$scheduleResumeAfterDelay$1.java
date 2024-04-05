package kotlinx.coroutines.android;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ C19470c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(C19470c cVar, Runnable runnable) {
        super(1);
        this.this$0 = cVar;
        this.$block = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.this$0.f43404c.removeCallbacks(this.$block);
    }
}
