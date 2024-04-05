package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.processors.C19250a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRepeatWhen$RepeatWhenSubscriber */
final class FlowableRepeatWhen$RepeatWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Object> {
    private static final long serialVersionUID = -2680129890138081029L;

    public FlowableRepeatWhen$RepeatWhenSubscriber(C20024c<? super T> cVar, C19250a<Object> aVar, Subscription subscription) {
        super(cVar, aVar, subscription);
    }

    public void onComplete() {
        again(0);
    }

    public void onError(Throwable th) {
        this.receiver.cancel();
        this.downstream.onError(th);
    }
}
