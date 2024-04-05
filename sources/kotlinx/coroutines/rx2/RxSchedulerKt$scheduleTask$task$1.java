package kotlinx.coroutines.rx2;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p145io.reactivex.disposables.Disposable;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxSchedulerKt", mo70541f = "RxScheduler.kt", mo70542l = {126}, mo70543m = "scheduleTask$task")
final class RxSchedulerKt$scheduleTask$task$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public RxSchedulerKt$scheduleTask$task$1(C19340c<? super RxSchedulerKt$scheduleTask$task$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19790c.m33752b((Disposable) null, (CoroutineContext) null, (Runnable) null, this);
    }
}
