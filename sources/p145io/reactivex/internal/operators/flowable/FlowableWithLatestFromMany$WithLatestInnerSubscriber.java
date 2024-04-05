package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber */
final class FlowableWithLatestFromMany$WithLatestInnerSubscriber extends AtomicReference<Subscription> implements C8056i<Object> {
    private static final long serialVersionUID = 3256684027868224024L;
    public boolean hasValue;
    public final int index;
    public final FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> parent;

    public FlowableWithLatestFromMany$WithLatestInnerSubscriber(FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> flowableWithLatestFromMany$WithLatestFromSubscriber, int i) {
        this.parent = flowableWithLatestFromMany$WithLatestFromSubscriber;
        this.index = i;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        this.parent.innerComplete(this.index, this.hasValue);
    }

    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    public void onNext(Object obj) {
        if (!this.hasValue) {
            this.hasValue = true;
        }
        this.parent.innerNext(this.index, obj);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
