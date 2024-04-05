package p145io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber */
final class FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -8466418554264089604L;
    public final C8339g<? super Open, ? extends C20023b<? extends Close>> bufferClose;
    public final C20023b<? extends Open> bufferOpen;
    public final Callable<C> bufferSupplier;
    public Map<Long, C> buffers = new LinkedHashMap();
    public volatile boolean cancelled;
    public volatile boolean done;
    public final C20024c<? super C> downstream;
    public long emitted;
    public final AtomicThrowable errors = new AtomicThrowable();
    public long index;
    public final C19213a<C> queue = new C19213a<>(C8054g.f17572b);
    public final AtomicLong requested = new AtomicLong();
    public final C7091a subscribers = new C7091a();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber$BufferOpenSubscriber */
    public static final class BufferOpenSubscriber<Open> extends AtomicReference<Subscription> implements C8056i<Open>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        public final FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> parent;

        public BufferOpenSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> flowableBufferBoundary$BufferBoundarySubscriber) {
            this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        public void onComplete() {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.openComplete(this);
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.boundaryError(this, th);
        }

        public void onNext(Open open) {
            this.parent.open(open);
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary$BufferBoundarySubscriber(C20024c<? super C> cVar, C20023b<? extends Open> bVar, C8339g<? super Open, ? extends C20023b<? extends Close>> gVar, Callable<C> callable) {
        this.downstream = cVar;
        this.bufferSupplier = callable;
        this.bufferOpen = bVar;
        this.bufferClose = gVar;
    }

    public void boundaryError(Disposable disposable, Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        this.subscribers.mo19404c(disposable);
        onError(th);
    }

    public void cancel() {
        if (SubscriptionHelper.cancel(this.upstream)) {
            this.cancelled = true;
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            if (getAndIncrement() != 0) {
                this.queue.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r4 == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3.done = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        drain();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close(p145io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber<T, C> r4, long r5) {
        /*
            r3 = this;
            io.reactivex.disposables.a r0 = r3.subscribers
            r0.mo19404c(r4)
            io.reactivex.disposables.a r4 = r3.subscribers
            int r4 = r4.mo19406f()
            r0 = 1
            if (r4 != 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.upstream
            p145io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
            r4 = r0
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            monitor-enter(r3)
            java.util.Map<java.lang.Long, C> r1 = r3.buffers     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x001d:
            io.reactivex.internal.queue.a<C> r2 = r3.queue     // Catch:{ all -> 0x0033 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0033 }
            java.lang.Object r5 = r1.remove(r5)     // Catch:{ all -> 0x0033 }
            r2.offer(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002f
            r3.done = r0
        L_0x002f:
            r3.drain()
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber.close(io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber, long):void");
    }

    public void drain() {
        int i;
        if (getAndIncrement() == 0) {
            long j = this.emitted;
            C20024c<? super C> cVar = this.downstream;
            C19213a<C> aVar = this.queue;
            int i2 = 1;
            do {
                long j2 = this.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (this.cancelled) {
                        aVar.clear();
                        return;
                    } else {
                        boolean z = this.done;
                        if (!z || this.errors.get() == null) {
                            Collection collection = (Collection) aVar.poll();
                            boolean z2 = collection == null;
                            if (z && z2) {
                                cVar.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                cVar.onNext(collection);
                                j++;
                            }
                        } else {
                            aVar.clear();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    }
                }
                if (i == 0) {
                    if (this.cancelled) {
                        aVar.clear();
                        return;
                    } else if (this.done) {
                        if (this.errors.get() != null) {
                            aVar.clear();
                            cVar.onError(this.errors.terminate());
                            return;
                        } else if (aVar.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public void onComplete() {
        this.subscribers.dispose();
        synchronized (this) {
            Map<Long, C> map = this.buffers;
            if (map != null) {
                for (C offer : map.values()) {
                    this.queue.offer(offer);
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        synchronized (this) {
            Map<Long, C> map = this.buffers;
            if (map != null) {
                for (C add : map.values()) {
                    add.add(t);
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
            this.subscribers.mo19403b(bufferOpenSubscriber);
            this.bufferOpen.subscribe(bufferOpenSubscriber);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void open(Open open) {
        try {
            C call = this.bufferSupplier.call();
            C12965a.m20650b(call, "The bufferSupplier returned a null Collection");
            Collection collection = (Collection) call;
            Object apply = this.bufferClose.apply(open);
            C12965a.m20650b(apply, "The bufferClose returned a null Publisher");
            C20023b bVar = (C20023b) apply;
            long j = this.index;
            this.index = 1 + j;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    map.put(Long.valueOf(j), collection);
                    FlowableBufferBoundary$BufferCloseSubscriber flowableBufferBoundary$BufferCloseSubscriber = new FlowableBufferBoundary$BufferCloseSubscriber(this, j);
                    this.subscribers.mo19403b(flowableBufferBoundary$BufferCloseSubscriber);
                    bVar.subscribe(flowableBufferBoundary$BufferCloseSubscriber);
                }
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            SubscriptionHelper.cancel(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
        this.subscribers.mo19404c(bufferOpenSubscriber);
        if (this.subscribers.mo19406f() == 0) {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
        drain();
    }
}
