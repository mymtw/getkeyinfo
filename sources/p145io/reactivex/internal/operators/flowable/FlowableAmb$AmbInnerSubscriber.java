package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber */
final class FlowableAmb$AmbInnerSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -1185974347409665484L;
    public final C20024c<? super T> downstream;
    public final int index;
    public final AtomicLong missedRequested = new AtomicLong();
    public final C19105b<T> parent;
    public boolean won;

    public FlowableAmb$AmbInnerSubscriber(C19105b<T> bVar, int i, C20024c<? super T> cVar) {
        this.index = i;
        this.downstream = cVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        if (this.won) {
            this.downstream.onComplete();
            return;
        }
        throw null;
    }

    public void onError(Throwable th) {
        if (this.won) {
            this.downstream.onError(th);
            return;
        }
        throw null;
    }

    public void onNext(T t) {
        if (this.won) {
            this.downstream.onNext(t);
            return;
        }
        throw null;
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this, this.missedRequested, subscription);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this, this.missedRequested, j);
    }
}
