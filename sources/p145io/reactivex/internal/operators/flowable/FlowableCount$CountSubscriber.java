package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCount$CountSubscriber */
final class FlowableCount$CountSubscriber extends DeferredScalarSubscription<Long> implements C8056i<Object> {
    private static final long serialVersionUID = 4973004223787171406L;
    public long count;
    public Subscription upstream;

    public FlowableCount$CountSubscriber(C20024c<? super Long> cVar) {
        super(cVar);
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        complete(Long.valueOf(this.count));
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(Object obj) {
        this.count++;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
