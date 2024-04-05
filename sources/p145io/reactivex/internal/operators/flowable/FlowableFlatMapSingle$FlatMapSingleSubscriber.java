package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8056i;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber */
final class FlowableFlatMapSingle$FlatMapSingleSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 8600231336733376951L;
    public final AtomicInteger active = new AtomicInteger(1);
    public volatile boolean cancelled;
    public final boolean delayErrors;
    public final C20024c<? super R> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;
    public final int maxConcurrency;
    public final AtomicReference<C19213a<R>> queue = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();
    public final C7091a set = new C7091a();
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber$InnerObserver */
    public final class InnerObserver extends AtomicReference<Disposable> implements C8073u<R>, Disposable {
        private static final long serialVersionUID = -502562646270949838L;

        public InnerObserver() {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onError(Throwable th) {
            FlowableFlatMapSingle$FlatMapSingleSubscriber.this.innerError(this, th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(R r) {
            FlowableFlatMapSingle$FlatMapSingleSubscriber.this.innerSuccess(this, r);
        }
    }

    public FlowableFlatMapSingle$FlatMapSingleSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C8075w<? extends R>> gVar, boolean z, int i) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.delayErrors = z;
        this.maxConcurrency = i;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.set.dispose();
    }

    public void clear() {
        C19213a aVar = this.queue.get();
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        int i;
        boolean z;
        C20024c<? super R> cVar = this.downstream;
        AtomicInteger atomicInteger = this.active;
        AtomicReference<C19213a<R>> atomicReference = this.queue;
        int i2 = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                z = false;
                if (i == 0) {
                    break;
                } else if (this.cancelled) {
                    clear();
                    return;
                } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z2 = atomicInteger.get() == 0;
                    C19213a aVar = atomicReference.get();
                    Object poll = aVar != null ? aVar.poll() : null;
                    boolean z3 = poll == null;
                    if (z2 && z3) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            cVar.onError(terminate);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    } else if (z3) {
                        break;
                    } else {
                        cVar.onNext(poll);
                        j2++;
                    }
                } else {
                    Throwable terminate2 = this.errors.terminate();
                    clear();
                    cVar.onError(terminate2);
                    return;
                }
            }
            if (i == 0) {
                if (this.cancelled) {
                    clear();
                    return;
                } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z4 = atomicInteger.get() == 0;
                    C19213a aVar2 = atomicReference.get();
                    if (aVar2 == null || aVar2.isEmpty()) {
                        z = true;
                    }
                    if (z4 && z) {
                        Throwable terminate3 = this.errors.terminate();
                        if (terminate3 != null) {
                            cVar.onError(terminate3);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                } else {
                    Throwable terminate4 = this.errors.terminate();
                    clear();
                    cVar.onError(terminate4);
                    return;
                }
            }
            if (j2 != 0) {
                C19382n.m32774u0(this.requested, j2);
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(j2);
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    public C19213a<R> getOrCreateQueue() {
        C19213a<R> aVar;
        boolean z;
        do {
            C19213a<R> aVar2 = this.queue.get();
            if (aVar2 == null) {
                aVar = new C19213a<>(C8054g.f17572b);
                AtomicReference<C19213a<R>> atomicReference = this.queue;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, aVar)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return aVar2;
            }
        } while (!z);
        return aVar;
    }

    public void innerError(FlowableFlatMapSingle$FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
        this.set.mo19404c(innerObserver);
        if (this.errors.addThrowable(th)) {
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1);
            }
            this.active.decrementAndGet();
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerSuccess(FlowableFlatMapSingle$FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, R r) {
        this.set.mo19404c(innerObserver);
        if (get() == 0) {
            boolean z = false;
            if (compareAndSet(0, 1)) {
                if (this.active.decrementAndGet() == 0) {
                    z = true;
                }
                if (this.requested.get() != 0) {
                    this.downstream.onNext(r);
                    C19213a aVar = this.queue.get();
                    if (!z || (aVar != null && !aVar.isEmpty())) {
                        C19382n.m32774u0(this.requested, 1);
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1);
                        }
                    } else {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            this.downstream.onError(terminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                } else {
                    C19213a orCreateQueue = getOrCreateQueue();
                    synchronized (orCreateQueue) {
                        orCreateQueue.offer(r);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
                drainLoop();
            }
        }
        C19213a orCreateQueue2 = getOrCreateQueue();
        synchronized (orCreateQueue2) {
            orCreateQueue2.offer(r);
        }
        this.active.decrementAndGet();
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public void onComplete() {
        this.active.decrementAndGet();
        drain();
    }

    public void onError(Throwable th) {
        this.active.decrementAndGet();
        if (this.errors.addThrowable(th)) {
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null SingleSource");
            C8075w wVar = (C8075w) apply;
            this.active.getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (!this.cancelled && this.set.mo19403b(innerObserver)) {
                wVar.mo20655a(innerObserver);
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            int i = this.maxConcurrency;
            if (i == Integer.MAX_VALUE) {
                subscription.request(Long.MAX_VALUE);
            } else {
                subscription.request((long) i);
            }
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
