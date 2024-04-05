package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber */
final class FlowableZip$ZipSubscriber<T, R> extends AtomicReference<Subscription> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -4627193790118206028L;
    public volatile boolean done;
    public final int limit;
    public final FlowableZip$ZipCoordinator<T, R> parent;
    public final int prefetch;
    public long produced;
    public C13973i<T> queue;
    public int sourceMode;

    public FlowableZip$ZipSubscriber(FlowableZip$ZipCoordinator<T, R> flowableZip$ZipCoordinator, int i) {
        this.parent = flowableZip$ZipCoordinator;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    public void onError(Throwable th) {
        this.parent.error(this, th);
    }

    public void onNext(T t) {
        if (this.sourceMode != 2) {
            this.queue.offer(t);
        }
        this.parent.drain();
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(7);
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

    public void request(long j) {
        if (this.sourceMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((Subscription) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }
}
