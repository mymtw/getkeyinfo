package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class RxSchedulerKt$scheduleTask$task$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Runnable $decoratedBlock;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxSchedulerKt$scheduleTask$task$2(Runnable runnable) {
        super(0);
        this.$decoratedBlock = runnable;
    }

    public final void invoke() {
        this.$decoratedBlock.run();
    }
}
