package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber */
abstract class FlowableSampleTimed$SampleTimedSubscriber<T> extends AtomicReference<T> implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    public final C20024c<? super T> downstream;
    public final long period;
    public final AtomicLong requested = new AtomicLong();
    public final C8066r scheduler;
    public final SequentialDisposable timer = new SequentialDisposable();
    public final TimeUnit unit;
    public Subscription upstream;

    public FlowableSampleTimed$SampleTimedSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r rVar) {
        this.downstream = cVar;
        this.period = j;
        this.unit = timeUnit;
        this.scheduler = rVar;
    }

    public void cancel() {
        cancelTimer();
        this.upstream.cancel();
    }

    public void cancelTimer() {
        DisposableHelper.dispose(this.timer);
    }

    public abstract void complete();

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

    public void onComplete() {
        cancelTimer();
        complete();
    }

    public void onError(Throwable th) {
        cancelTimer();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        lazySet(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            SequentialDisposable sequentialDisposable = this.timer;
            C8066r rVar = this.scheduler;
            long j = this.period;
            sequentialDisposable.replace(rVar.mo20649e(this, j, j, this.unit));
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
        }
    }
}
