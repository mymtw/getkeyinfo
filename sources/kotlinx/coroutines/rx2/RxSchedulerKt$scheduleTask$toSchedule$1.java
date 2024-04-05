package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p145io.reactivex.disposables.Disposable;
import p753kq.C19857l;

final /* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends FunctionReferenceImpl implements C19857l {
    public final /* synthetic */ CoroutineContext $ctx;
    public final /* synthetic */ Runnable $decoratedBlock;
    public final /* synthetic */ Disposable $disposable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxSchedulerKt$scheduleTask$toSchedule$1(Disposable disposable, CoroutineContext coroutineContext, Runnable runnable) {
        super(1, C19383o.C19384a.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$disposable = disposable;
        this.$ctx = coroutineContext;
        this.$decoratedBlock = runnable;
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return C19790c.m33752b(this.$disposable, this.$ctx, this.$decoratedBlock, cVar);
    }
}
