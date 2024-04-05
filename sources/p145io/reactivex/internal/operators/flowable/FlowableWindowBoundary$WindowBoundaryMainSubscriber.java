package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.MpscLinkedQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.processors.UnicastProcessor;
import p248tp.C8054g;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber */
final class FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    public static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    public final C19124s<T, B> boundarySubscriber = new C19124s<>(this);
    public final int capacityHint;
    public volatile boolean done;
    public final C20024c<? super C8054g<T>> downstream;
    public long emitted;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicBoolean stopWindows = new AtomicBoolean();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();
    public UnicastProcessor<T> window;
    public final AtomicInteger windows = new AtomicInteger(1);

    public FlowableWindowBoundary$WindowBoundaryMainSubscriber(C20024c<? super C8054g<T>> cVar, int i) {
        this.downstream = cVar;
        this.capacityHint = i;
    }

    public void cancel() {
        if (this.stopWindows.compareAndSet(false, true)) {
            this.boundarySubscriber.dispose();
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C20024c<? super C8054g<T>> cVar = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            long j = this.emitted;
            int i = 1;
            while (this.windows.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.window;
                boolean z = this.done;
                if (!z || atomicThrowable.get() == null) {
                    Object poll = mpscLinkedQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable terminate = atomicThrowable.terminate();
                        if (terminate == null) {
                            if (unicastProcessor != null) {
                                this.window = null;
                                unicastProcessor.onComplete();
                            }
                            cVar.onComplete();
                            return;
                        }
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onError(terminate);
                        }
                        cVar.onError(terminate);
                        return;
                    } else if (z2) {
                        this.emitted = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll != NEXT_WINDOW) {
                        unicastProcessor.onNext(poll);
                    } else {
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            UnicastProcessor<T> f = UnicastProcessor.m32491f(this, this.capacityHint);
                            this.window = f;
                            this.windows.getAndIncrement();
                            if (j != this.requested.get()) {
                                j++;
                                cVar.onNext(f);
                            } else {
                                SubscriptionHelper.cancel(this.upstream);
                                this.boundarySubscriber.dispose();
                                atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                this.done = true;
                            }
                        }
                    }
                } else {
                    mpscLinkedQueue.clear();
                    Throwable terminate2 = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onError(terminate2);
                    }
                    cVar.onError(terminate2);
                    return;
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }
    }

    public void innerComplete() {
        SubscriptionHelper.cancel(this.upstream);
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerNext() {
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    public void onComplete() {
        this.boundarySubscriber.dispose();
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.boundarySubscriber.dispose();
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.upstream, subscription, Long.MAX_VALUE);
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
    }

    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }
}
