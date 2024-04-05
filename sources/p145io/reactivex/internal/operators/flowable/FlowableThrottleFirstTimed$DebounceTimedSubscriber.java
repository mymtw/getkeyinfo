package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed$DebounceTimedSubscriber */
final class FlowableThrottleFirstTimed$DebounceTimedSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = -9102637559663639004L;
    public boolean done;
    public final C20024c<? super T> downstream;
    public volatile boolean gate;
    public final long timeout;
    public final SequentialDisposable timer = new SequentialDisposable();
    public final TimeUnit unit;
    public Subscription upstream;
    public final C8066r.C8069c worker;

    public FlowableThrottleFirstTimed$DebounceTimedSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar2) {
        this.downstream = cVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar2;
    }

    public void cancel() {
        this.upstream.cancel();
        this.worker.dispose();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
        this.worker.dispose();
    }

    public void onNext(T t) {
        if (!this.done && !this.gate) {
            this.gate = true;
            if (get() != 0) {
                this.downstream.onNext(t);
                C19382n.m32774u0(this, 1);
                Disposable disposable = (Disposable) this.timer.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.timer.replace(this.worker.mo20653b(this, this.timeout, this.unit));
                return;
            }
            this.done = true;
            cancel();
            this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }
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
            C19382n.m32703D(this, j);
        }
    }

    public void run() {
        this.gate = false;
    }
}
