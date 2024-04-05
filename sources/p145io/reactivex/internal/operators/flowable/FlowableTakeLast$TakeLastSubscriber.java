package p145io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeLast$TakeLastSubscriber */
final class FlowableTakeLast$TakeLastSubscriber<T> extends ArrayDeque<T> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 7240042530241604978L;
    public volatile boolean cancelled;
    public final int count;
    public volatile boolean done;
    public final C20024c<? super T> downstream;
    public final AtomicLong requested = new AtomicLong();
    public Subscription upstream;
    public final AtomicInteger wip = new AtomicInteger();

    public FlowableTakeLast$TakeLastSubscriber(C20024c<? super T> cVar, int i) {
        this.downstream = cVar;
        this.count = i;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
    }

    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            C20024c<? super T> cVar = this.downstream;
            long j = this.requested.get();
            while (!this.cancelled) {
                if (this.done) {
                    long j2 = 0;
                    while (j2 != j) {
                        if (!this.cancelled) {
                            Object poll = poll();
                            if (poll == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onNext(poll);
                                j2++;
                            }
                        } else {
                            return;
                        }
                    }
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        j = this.requested.addAndGet(-j2);
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.count == size()) {
            poll();
        }
        offer(t);
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
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
