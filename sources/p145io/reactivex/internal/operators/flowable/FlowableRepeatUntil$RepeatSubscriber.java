package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p287xp.C8337e;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRepeatUntil$RepeatSubscriber */
final class FlowableRepeatUntil$RepeatSubscriber<T> extends AtomicInteger implements C8056i<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final C20024c<? super T> downstream;
    public long produced;

    /* renamed from: sa */
    public final SubscriptionArbiter f42651sa;
    public final C20023b<? extends T> source;
    public final C8337e stop;

    public FlowableRepeatUntil$RepeatSubscriber(C20024c<? super T> cVar, C8337e eVar, SubscriptionArbiter subscriptionArbiter, C20023b<? extends T> bVar) {
        this.downstream = cVar;
        this.f42651sa = subscriptionArbiter;
        this.source = bVar;
        this.stop = eVar;
    }

    public void onComplete() {
        try {
            if (this.stop.getAsBoolean()) {
                this.downstream.onComplete();
            } else {
                subscribeNext();
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        this.f42651sa.setSubscription(subscription);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.f42651sa.isCancelled()) {
                long j = this.produced;
                if (j != 0) {
                    this.produced = 0;
                    this.f42651sa.produced(j);
                }
                this.source.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
