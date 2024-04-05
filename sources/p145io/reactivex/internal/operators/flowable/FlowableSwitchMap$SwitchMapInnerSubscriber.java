package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber */
final class FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements C8056i<R> {
    private static final long serialVersionUID = 3837284832786408377L;
    public final int bufferSize;
    public volatile boolean done;
    public int fusionMode;
    public final long index;
    public final FlowableSwitchMap$SwitchMapSubscriber<T, R> parent;
    public volatile C13973i<R> queue;

    public FlowableSwitchMap$SwitchMapInnerSubscriber(FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber, long j, int i) {
        this.parent = flowableSwitchMap$SwitchMapSubscriber;
        this.index = j;
        this.bufferSize = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index == flowableSwitchMap$SwitchMapSubscriber.unique) {
            this.done = true;
            flowableSwitchMap$SwitchMapSubscriber.drain();
        }
    }

    public void onError(Throwable th) {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index != flowableSwitchMap$SwitchMapSubscriber.unique || !flowableSwitchMap$SwitchMapSubscriber.error.addThrowable(th)) {
            C18981a.m32123b(th);
            return;
        }
        if (!flowableSwitchMap$SwitchMapSubscriber.delayErrors) {
            flowableSwitchMap$SwitchMapSubscriber.upstream.cancel();
            flowableSwitchMap$SwitchMapSubscriber.done = true;
        }
        this.done = true;
        flowableSwitchMap$SwitchMapSubscriber.drain();
    }

    public void onNext(R r) {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index != flowableSwitchMap$SwitchMapSubscriber.unique) {
            return;
        }
        if (this.fusionMode != 0 || this.queue.offer(r)) {
            flowableSwitchMap$SwitchMapSubscriber.drain();
        } else {
            onError(new MissingBackpressureException("Queue full?!"));
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    subscription.request((long) this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            subscription.request((long) this.bufferSize);
        }
    }

    public void request(long j) {
        if (this.fusionMode != 1) {
            ((Subscription) get()).request(j);
        }
    }
}
