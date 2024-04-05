package p145io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p734bq.C18977a;

/* renamed from: io.reactivex.internal.subscribers.InnerQueuedSubscriber */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final C18977a<T> parent;
    public final int prefetch;
    public long produced;
    public volatile C13973i<T> queue;

    public InnerQueuedSubscriber(C18977a<T> aVar, int i) {
        this.parent = aVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    public void onComplete() {
        this.parent.innerComplete(this);
    }

    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            long j = Long.MAX_VALUE;
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    int i = this.prefetch;
                    if (i >= 0) {
                        j = (long) i;
                    }
                    subscription.request(j);
                    return;
                }
            }
            int i2 = this.prefetch;
            this.queue = i2 < 0 ? new C19213a<>(-i2) : new SpscArrayQueue<>(i2);
            int i3 = this.prefetch;
            if (i3 >= 0) {
                j = (long) i3;
            }
            subscription.request(j);
        }
    }

    public C13973i<T> queue() {
        return this.queue;
    }

    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((Subscription) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((Subscription) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }

    public void setDone() {
        this.done = true;
    }
}
