package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p287xp.C8336d;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate$RetryBiSubscriber */
final class FlowableRetryBiPredicate$RetryBiSubscriber<T> extends AtomicInteger implements C8056i<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final C20024c<? super T> downstream;
    public final C8336d<? super Integer, ? super Throwable> predicate;
    public long produced;
    public int retries;

    /* renamed from: sa */
    public final SubscriptionArbiter f42652sa;
    public final C20023b<? extends T> source;

    public FlowableRetryBiPredicate$RetryBiSubscriber(C20024c<? super T> cVar, C8336d<? super Integer, ? super Throwable> dVar, SubscriptionArbiter subscriptionArbiter, C20023b<? extends T> bVar) {
        this.downstream = cVar;
        this.f42652sa = subscriptionArbiter;
        this.source = bVar;
        this.predicate = dVar;
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        try {
            C8336d<? super Integer, ? super Throwable> dVar = this.predicate;
            int i = this.retries + 1;
            this.retries = i;
            Integer valueOf = Integer.valueOf(i);
            ((C12965a.C12966a) dVar).getClass();
            if (!C12965a.m20649a(valueOf, th)) {
                this.downstream.onError(th);
            } else {
                subscribeNext();
            }
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        this.f42652sa.setSubscription(subscription);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.f42652sa.isCancelled()) {
                long j = this.produced;
                if (j != 0) {
                    this.produced = 0;
                    this.f42652sa.produced(j);
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
