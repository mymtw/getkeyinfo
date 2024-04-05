package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber */
abstract class FlowableSamplePublisher$SamplePublisherSubscriber<T> extends AtomicReference<T> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -3517602651313910099L;
    public final C20024c<? super T> downstream;
    public final AtomicReference<Subscription> other = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();
    public final C20023b<?> sampler;
    public Subscription upstream;

    public FlowableSamplePublisher$SamplePublisherSubscriber(C20024c<? super T> cVar, C20023b<?> bVar) {
        this.downstream = cVar;
        this.sampler = bVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.other);
        this.upstream.cancel();
    }

    public void complete() {
        this.upstream.cancel();
        completion();
    }

    public abstract void completion();

    public void emit() {
        Object andSet = getAndSet((Object) null);
        if (andSet == null) {
            return;
        }
        if (this.requested.get() != 0) {
            this.downstream.onNext(andSet);
            C19382n.m32774u0(this.requested, 1);
            return;
        }
        cancel();
        this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
    }

    public void error(Throwable th) {
        this.upstream.cancel();
        this.downstream.onError(th);
    }

    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        completion();
    }

    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        lazySet(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            if (this.other.get() == null) {
                this.sampler.subscribe(new C19115k(this));
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
        }
    }

    public abstract void run();

    public void setOther(Subscription subscription) {
        SubscriptionHelper.setOnce(this.other, subscription, Long.MAX_VALUE);
    }
}
