package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSubscriber */
final class FlowableTimeoutTimed$TimeoutSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription, C19122q {
    private static final long serialVersionUID = 3764492702657003550L;
    public final C20024c<? super T> downstream;
    public final AtomicLong requested = new AtomicLong();
    public final SequentialDisposable task = new SequentialDisposable();
    public final long timeout;
    public final TimeUnit unit;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();
    public final C8066r.C8069c worker;

    public FlowableTimeoutTimed$TimeoutSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar2) {
        this.downstream = cVar;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar2;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.worker.dispose();
    }

    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.worker.dispose();
        }
    }

    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((Disposable) this.task.get()).dispose();
                this.downstream.onNext(t);
                startTimeout(j2);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void onTimeout(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(new TimeoutException(ExceptionHelper.m32484c(this.timeout, this.unit)));
            this.worker.dispose();
        }
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public void startTimeout(long j) {
        this.task.replace(this.worker.mo20653b(new C19123r(j, this), this.timeout, this.unit));
    }
}
