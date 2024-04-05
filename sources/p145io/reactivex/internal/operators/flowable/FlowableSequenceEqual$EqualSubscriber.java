package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber */
final class FlowableSequenceEqual$EqualSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T> {
    private static final long serialVersionUID = 4804128302091633067L;
    public volatile boolean done;
    public final int limit;
    public final C19117m parent;
    public final int prefetch;
    public long produced;
    public volatile C13973i<T> queue;
    public int sourceMode;

    public FlowableSequenceEqual$EqualSubscriber(C19117m mVar, int i) {
        this.parent = mVar;
        this.limit = i - (i >> 2);
        this.prefetch = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void clear() {
        C13973i<T> iVar = this.queue;
        if (iVar != null) {
            iVar.clear();
        }
    }

    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    public void onNext(T t) {
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            this.parent.drain();
        } else {
            onError(new MissingBackpressureException());
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    subscription.request((long) this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            subscription.request((long) this.prefetch);
        }
    }

    public void request() {
        if (this.sourceMode != 1) {
            long j = this.produced + 1;
            if (j >= ((long) this.limit)) {
                this.produced = 0;
                ((Subscription) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }
}
