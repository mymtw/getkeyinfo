package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer */
final class FlowableTimeout$TimeoutConsumer extends AtomicReference<Subscription> implements C8056i<Object>, Disposable {
    private static final long serialVersionUID = 8708641127342403073L;
    public final long idx;
    public final C19120o parent;

    public FlowableTimeout$TimeoutConsumer(long j, C19120o oVar) {
        this.idx = j;
        this.parent = oVar;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.onTimeoutError(this.idx, th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(Object obj) {
        Subscription subscription = (Subscription) get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            subscription.cancel();
            lazySet(subscriptionHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
