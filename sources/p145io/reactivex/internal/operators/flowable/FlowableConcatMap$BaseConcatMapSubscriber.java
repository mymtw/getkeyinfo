package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p287xp.C8339g;
import p503zp.C13970f;
import p503zp.C13973i;
import p762or.C20023b;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber */
abstract class FlowableConcatMap$BaseConcatMapSubscriber<T, R> extends AtomicInteger implements C8056i<T>, C19106c<R>, Subscription {
    private static final long serialVersionUID = -3511336836796789179L;
    public volatile boolean active;
    public volatile boolean cancelled;
    public int consumed;
    public volatile boolean done;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final FlowableConcatMap$ConcatMapInner<R> inner = new FlowableConcatMap$ConcatMapInner<>(this);
    public final int limit;
    public final C8339g<? super T, ? extends C20023b<? extends R>> mapper;
    public final int prefetch;
    public C13973i<T> queue;
    public int sourceMode;
    public Subscription upstream;

    public FlowableConcatMap$BaseConcatMapSubscriber(C8339g<? super T, ? extends C20023b<? extends R>> gVar, int i) {
        this.mapper = gVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public abstract /* synthetic */ void cancel();

    public abstract void drain();

    public final void innerComplete() {
        this.active = false;
        drain();
    }

    public abstract /* synthetic */ void innerError(Throwable th);

    public abstract /* synthetic */ void innerNext(T t);

    public final void onComplete() {
        this.done = true;
        drain();
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public final void onNext(T t) {
        if (this.sourceMode == 2 || this.queue.offer(t)) {
            drain();
            return;
        }
        this.upstream.cancel();
        onError(new IllegalStateException("Queue full?!"));
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    subscribeActual();
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    subscribeActual();
                    subscription.request((long) this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            subscribeActual();
            subscription.request((long) this.prefetch);
        }
    }

    public abstract /* synthetic */ void request(long j);

    public abstract void subscribeActual();
}
