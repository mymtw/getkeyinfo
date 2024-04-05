package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSubscriber */
final class FlowableTimeout$TimeoutSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription, C19120o {
    private static final long serialVersionUID = 3764492702657003550L;
    public final C20024c<? super T> downstream;
    public final C8339g<? super T, ? extends C20023b<?>> itemTimeoutIndicator;
    public final AtomicLong requested = new AtomicLong();
    public final SequentialDisposable task = new SequentialDisposable();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public FlowableTimeout$TimeoutSubscriber(C20024c<? super T> cVar, C8339g<? super T, ? extends C20023b<?>> gVar) {
        this.downstream = cVar;
        this.itemTimeoutIndicator = gVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.task.dispose();
    }

    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                Disposable disposable = (Disposable) this.task.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.downstream.onNext(t);
                try {
                    Object apply = this.itemTimeoutIndicator.apply(t);
                    C12965a.m20650b(apply, "The itemTimeoutIndicator returned a null Publisher.");
                    C20023b bVar = (C20023b) apply;
                    FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(j2, this);
                    if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                        bVar.subscribe(flowableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.upstream.get().cancel();
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void onTimeout(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    public void onTimeoutError(long j, Throwable th) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public void startFirstTimeout(C20023b<?> bVar) {
        if (bVar != null) {
            FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(0, this);
            if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                bVar.subscribe(flowableTimeout$TimeoutConsumer);
            }
        }
    }
}
