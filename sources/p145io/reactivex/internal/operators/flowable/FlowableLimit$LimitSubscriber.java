package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableLimit$LimitSubscriber */
final class FlowableLimit$LimitSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 2288246011222124525L;
    public final C20024c<? super T> downstream;
    public long remaining;
    public Subscription upstream;

    public FlowableLimit$LimitSubscriber(C20024c<? super T> cVar, long j) {
        this.downstream = cVar;
        this.remaining = j;
        lazySet(j);
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.remaining > 0) {
            this.remaining = 0;
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.remaining > 0) {
            this.remaining = 0;
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = this.remaining;
        if (j > 0) {
            long j2 = j - 1;
            this.remaining = j2;
            this.downstream.onNext(t);
            if (j2 == 0) {
                this.upstream.cancel();
                this.downstream.onComplete();
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (!SubscriptionHelper.validate(this.upstream, subscription)) {
            return;
        }
        if (this.remaining == 0) {
            subscription.cancel();
            EmptySubscription.complete(this.downstream);
            return;
        }
        this.upstream = subscription;
        this.downstream.onSubscribe(this);
    }

    public void request(long j) {
        long j2;
        long j3;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if (j2 != 0) {
                    j3 = j2 <= j ? j2 : j;
                } else {
                    return;
                }
            } while (!compareAndSet(j2, j2 - j3));
            this.upstream.request(j3);
        }
    }
}
