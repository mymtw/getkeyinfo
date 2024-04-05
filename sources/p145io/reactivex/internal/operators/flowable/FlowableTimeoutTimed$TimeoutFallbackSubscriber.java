package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutFallbackSubscriber */
final class FlowableTimeoutTimed$TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements C8056i<T>, C19122q {
    private static final long serialVersionUID = 3764492702657003550L;
    public long consumed;
    public final C20024c<? super T> downstream;
    public C20023b<? extends T> fallback;
    public final AtomicLong index = new AtomicLong();
    public final SequentialDisposable task = new SequentialDisposable();
    public final long timeout;
    public final TimeUnit unit;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();
    public final C8066r.C8069c worker;

    public FlowableTimeoutTimed$TimeoutFallbackSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar2, C20023b<? extends T> bVar) {
        super(true);
        this.downstream = cVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar2;
        this.fallback = bVar;
    }

    public void cancel() {
        super.cancel();
        this.worker.dispose();
    }

    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.worker.dispose();
        }
    }

    public void onError(Throwable th) {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = this.index.get();
        if (j != Long.MAX_VALUE) {
            long j2 = j + 1;
            if (this.index.compareAndSet(j, j2)) {
                ((Disposable) this.task.get()).dispose();
                this.consumed++;
                this.downstream.onNext(t);
                startTimeout(j2);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            setSubscription(subscription);
        }
    }

    public void onTimeout(long j) {
        if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            long j2 = this.consumed;
            if (j2 != 0) {
                produced(j2);
            }
            C20023b<? extends T> bVar = this.fallback;
            this.fallback = null;
            bVar.subscribe(new C19121p(this.downstream, this));
            this.worker.dispose();
        }
    }

    public void startTimeout(long j) {
        this.task.replace(this.worker.mo20653b(new C19123r(j, this), this.timeout, this.unit));
    }
}
