package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeLastOne$TakeLastOneSubscriber */
final class FlowableTakeLastOne$TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements C8056i<T> {
    private static final long serialVersionUID = -5467847744262967226L;
    public Subscription upstream;

    public FlowableTakeLastOne$TakeLastOneSubscriber(C20024c<? super T> cVar) {
        super(cVar);
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        T t = this.value;
        if (t != null) {
            complete(t);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.value = t;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
