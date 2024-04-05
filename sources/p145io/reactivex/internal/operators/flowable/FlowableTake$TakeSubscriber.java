package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber */
final class FlowableTake$TakeSubscriber<T> extends AtomicBoolean implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -5636543848937116287L;
    public boolean done;
    public final C20024c<? super T> downstream;
    public final long limit;
    public long remaining;
    public Subscription upstream;

    public FlowableTake$TakeSubscriber(C20024c<? super T> cVar, long j) {
        this.downstream = cVar;
        this.limit = j;
        this.remaining = j;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (!this.done) {
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            long j = this.remaining;
            long j2 = j - 1;
            this.remaining = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.downstream.onNext(t);
                if (z) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            if (this.limit == 0) {
                subscription.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
                return;
            }
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            if (get() || !compareAndSet(false, true) || j < this.limit) {
                this.upstream.request(j);
            } else {
                this.upstream.request(Long.MAX_VALUE);
            }
        }
    }
}
