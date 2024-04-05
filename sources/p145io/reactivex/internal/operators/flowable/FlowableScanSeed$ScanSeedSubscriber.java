package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8335c;
import p503zp.C13972h;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableScanSeed$ScanSeedSubscriber */
final class FlowableScanSeed$ScanSeedSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -1776795561228106469L;
    public final C8335c<R, ? super T, R> accumulator;
    public volatile boolean cancelled;
    public int consumed;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public Throwable error;
    public final int limit;
    public final int prefetch;
    public final C13972h<R> queue;
    public final AtomicLong requested = new AtomicLong();
    public Subscription upstream;
    public R value;

    public FlowableScanSeed$ScanSeedSubscriber(C20024c<? super R> cVar, C8335c<R, ? super T, R> cVar2, R r, int i) {
        this.downstream = cVar;
        this.accumulator = cVar2;
        this.value = r;
        this.prefetch = i;
        this.limit = i - (i >> 2);
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
        this.queue = spscArrayQueue;
        spscArrayQueue.offer(r);
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        int i;
        Throwable th;
        if (getAndIncrement() == 0) {
            C20024c<? super R> cVar = this.downstream;
            C13972h<R> hVar = this.queue;
            int i2 = this.limit;
            int i3 = this.consumed;
            int i4 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (this.cancelled) {
                        hVar.clear();
                        return;
                    } else {
                        boolean z = this.done;
                        if (!z || (th = this.error) == null) {
                            R poll = hVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                cVar.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                cVar.onNext(poll);
                                j2++;
                                i3++;
                                if (i3 == i2) {
                                    this.upstream.request((long) i2);
                                    i3 = 0;
                                }
                            }
                        } else {
                            hVar.clear();
                            cVar.onError(th);
                            return;
                        }
                    }
                }
                if (i == 0 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        hVar.clear();
                        cVar.onError(th2);
                        return;
                    } else if (hVar.isEmpty()) {
                        cVar.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    C19382n.m32774u0(this.requested, j2);
                }
                this.consumed = i3;
                i4 = addAndGet(-i4);
            } while (i4 != 0);
        }
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                R apply = this.accumulator.apply(this.value, t);
                C12965a.m20650b(apply, "The accumulator returned a null value");
                this.value = apply;
                this.queue.offer(apply);
                drain();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.upstream.cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request((long) (this.prefetch - 1));
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
