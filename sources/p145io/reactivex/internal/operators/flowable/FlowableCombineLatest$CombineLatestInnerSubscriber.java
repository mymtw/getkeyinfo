package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber */
final class FlowableCombineLatest$CombineLatestInnerSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T> {
    private static final long serialVersionUID = -8730235182291002949L;
    public final int index;
    public final int limit;
    public final FlowableCombineLatest$CombineLatestCoordinator<T, ?> parent;
    public final int prefetch;
    public int produced;

    public FlowableCombineLatest$CombineLatestInnerSubscriber(FlowableCombineLatest$CombineLatestCoordinator<T, ?> flowableCombineLatest$CombineLatestCoordinator, int i, int i2) {
        this.parent = flowableCombineLatest$CombineLatestCoordinator;
        this.index = i;
        this.prefetch = i2;
        this.limit = i2 - (i2 >> 2);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        this.parent.innerComplete(this.index);
    }

    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    public void onNext(T t) {
        this.parent.innerValue(this.index, t);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, (long) this.prefetch);
    }

    public void requestOne() {
        int i = this.produced + 1;
        if (i == this.limit) {
            this.produced = 0;
            ((Subscription) get()).request((long) i);
            return;
        }
        this.produced = i;
    }
}
