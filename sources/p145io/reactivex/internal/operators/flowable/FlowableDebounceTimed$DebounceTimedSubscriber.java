package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber */
final class FlowableDebounceTimed$DebounceTimedSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -9102637559663639004L;
    public boolean done;
    public final C20024c<? super T> downstream;
    public volatile long index;
    public final long timeout;
    public Disposable timer;
    public final TimeUnit unit;
    public Subscription upstream;
    public final C8066r.C8069c worker;

    public FlowableDebounceTimed$DebounceTimedSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar2) {
        this.downstream = cVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar2;
    }

    public void cancel() {
        this.upstream.cancel();
        this.worker.dispose();
    }

    public void emit(long j, T t, FlowableDebounceTimed$DebounceEmitter<T> flowableDebounceTimed$DebounceEmitter) {
        if (j != this.index) {
            return;
        }
        if (get() != 0) {
            this.downstream.onNext(t);
            C19382n.m32774u0(this, 1);
            flowableDebounceTimed$DebounceEmitter.dispose();
            return;
        }
        cancel();
        this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = (FlowableDebounceTimed$DebounceEmitter) disposable;
            if (flowableDebounceTimed$DebounceEmitter != null) {
                flowableDebounceTimed$DebounceEmitter.emit();
            }
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
        Disposable disposable = this.timer;
        if (disposable != null) {
            disposable.dispose();
        }
        this.downstream.onError(th);
        this.worker.dispose();
    }

    public void onNext(T t) {
        if (!this.done) {
            long j = this.index + 1;
            this.index = j;
            Disposable disposable = this.timer;
            if (disposable != null) {
                disposable.dispose();
            }
            FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = new FlowableDebounceTimed$DebounceEmitter(t, j, this);
            this.timer = flowableDebounceTimed$DebounceEmitter;
            flowableDebounceTimed$DebounceEmitter.setResource(this.worker.mo20653b(flowableDebounceTimed$DebounceEmitter, this.timeout, this.unit));
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
}
