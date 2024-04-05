package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.MpscLinkedQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.processors.UnicastProcessor;
import p248tp.C8054g;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber */
final class FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    public static final C19125t<Object, Object> BOUNDARY_DISPOSED = new C19125t<>((FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber) null);
    public static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    public final AtomicReference<C19125t<T, B>> boundarySubscriber = new AtomicReference<>();
    public final int capacityHint;
    public volatile boolean done;
    public final C20024c<? super C8054g<T>> downstream;
    public long emitted;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final Callable<? extends C20023b<B>> other;
    public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    public final AtomicLong requested;
    public final AtomicBoolean stopWindows = new AtomicBoolean();
    public Subscription upstream;
    public UnicastProcessor<T> window;
    public final AtomicInteger windows = new AtomicInteger(1);

    public FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber(C20024c<? super C8054g<T>> cVar, int i, Callable<? extends C20023b<B>> callable) {
        this.downstream = cVar;
        this.capacityHint = i;
        this.other = callable;
        this.requested = new AtomicLong();
    }

    public void cancel() {
        if (this.stopWindows.compareAndSet(false, true)) {
            disposeBoundary();
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public void disposeBoundary() {
        AtomicReference<C19125t<T, B>> atomicReference = this.boundarySubscriber;
        C19125t<Object, Object> tVar = BOUNDARY_DISPOSED;
        Disposable andSet = atomicReference.getAndSet(tVar);
        if (andSet != null && andSet != tVar) {
            andSet.dispose();
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
                    boolean z2 = false;
                    boolean z3 = poll == null;
                    if (z && z3) {
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
                    } else if (z3) {
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
                            if (j != this.requested.get()) {
                                UnicastProcessor<T> f = UnicastProcessor.m32491f(this, this.capacityHint);
                                this.window = f;
                                this.windows.getAndIncrement();
                                try {
                                    Object call = this.other.call();
                                    C12965a.m20650b(call, "The other Callable returned a null Publisher");
                                    C20023b bVar = (C20023b) call;
                                    C19125t tVar = new C19125t(this);
                                    AtomicReference<C19125t<T, B>> atomicReference = this.boundarySubscriber;
                                    while (true) {
                                        if (!atomicReference.compareAndSet((Object) null, tVar)) {
                                            if (atomicReference.get() != null) {
                                                break;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        bVar.subscribe(tVar);
                                        j++;
                                        cVar.onNext(f);
                                    }
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    atomicThrowable.addThrowable(th);
                                    this.done = true;
                                }
                            } else {
                                this.upstream.cancel();
                                disposeBoundary();
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
        this.upstream.cancel();
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        this.upstream.cancel();
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void innerNext(p145io.reactivex.internal.operators.flowable.C19125t<T, B> r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.t<T, B>> r0 = r2.boundarySubscriber
        L_0x0002:
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1)
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r1 = r0.get()
            if (r1 == r3) goto L_0x0002
        L_0x0010:
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r3 = r2.queue
            java.lang.Object r0 = NEXT_WINDOW
            r3.offer(r0)
            r2.drain()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber.innerNext(io.reactivex.internal.operators.flowable.t):void");
    }

    public void onComplete() {
        disposeBoundary();
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        disposeBoundary();
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
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            this.queue.offer(NEXT_WINDOW);
            drain();
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
    }

    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
