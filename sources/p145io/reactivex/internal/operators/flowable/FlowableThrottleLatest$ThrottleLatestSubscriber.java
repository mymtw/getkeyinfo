package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableThrottleLatest$ThrottleLatestSubscriber */
final class FlowableThrottleLatest$ThrottleLatestSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final C20024c<? super T> downstream;
    public final boolean emitLast;
    public long emitted;
    public Throwable error;
    public final AtomicReference<T> latest = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();
    public final long timeout;
    public volatile boolean timerFired;
    public boolean timerRunning;
    public final TimeUnit unit;
    public Subscription upstream;
    public final C8066r.C8069c worker;

    public FlowableThrottleLatest$ThrottleLatestSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar2, boolean z) {
        this.downstream = cVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar2;
        this.emitLast = z;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.latest.lazySet((Object) null);
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            AtomicReference<T> atomicReference = this.latest;
            AtomicLong atomicLong = this.requested;
            C20024c<? super T> cVar = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (!z || this.error == null) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2 || !this.emitLast) {
                            atomicReference.lazySet((Object) null);
                            cVar.onComplete();
                        } else {
                            T andSet = atomicReference.getAndSet((Object) null);
                            long j = this.emitted;
                            if (j != atomicLong.get()) {
                                this.emitted = j + 1;
                                cVar.onNext(andSet);
                                cVar.onComplete();
                            } else {
                                cVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                            }
                        }
                        this.worker.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        T andSet2 = atomicReference.getAndSet((Object) null);
                        long j2 = this.emitted;
                        if (j2 != atomicLong.get()) {
                            cVar.onNext(andSet2);
                            this.emitted = j2 + 1;
                            this.timerFired = false;
                            this.timerRunning = true;
                            this.worker.mo20653b(this, this.timeout, this.unit);
                        } else {
                            this.upstream.cancel();
                            cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                            this.worker.dispose();
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    atomicReference.lazySet((Object) null);
                    cVar.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
            atomicReference.lazySet((Object) null);
        }
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        this.latest.set(t);
        drain();
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
        }
    }

    public void run() {
        this.timerFired = true;
        drain();
    }
}
