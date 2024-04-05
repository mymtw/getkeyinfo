package p145io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber */
final class FlowableBufferBoundary$BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements C8056i<Object>, Disposable {
    private static final long serialVersionUID = -8498650778633225126L;
    public final long index;
    public final FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> parent;

    public FlowableBufferBoundary$BufferCloseSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> flowableBufferBoundary$BufferBoundarySubscriber, long j) {
        this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        this.index = j;
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
            this.parent.close(this, this.index);
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.boundaryError(this, th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(Object obj) {
        Subscription subscription = (Subscription) get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            lazySet(subscriptionHelper);
            subscription.cancel();
            this.parent.close(this, this.index);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
