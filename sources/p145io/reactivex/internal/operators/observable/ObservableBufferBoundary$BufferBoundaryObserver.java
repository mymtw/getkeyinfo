package p145io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8065q;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver */
final class ObservableBufferBoundary$BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = -8466418554264089604L;
    public final C8339g<? super Open, ? extends C8065q<? extends Close>> bufferClose;
    public final C8065q<? extends Open> bufferOpen;
    public final Callable<C> bufferSupplier;
    public Map<Long, C> buffers = new LinkedHashMap();
    public volatile boolean cancelled;
    public volatile boolean done;
    public final Observer<? super C> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public long index;
    public final C7091a observers = new C7091a();
    public final C19213a<C> queue = new C19213a<>(C8054g.f17572b);
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver */
    public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        public final ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> parent;

        public BufferOpenObserver(ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> observableBufferBoundary$BufferBoundaryObserver) {
            this.parent = observableBufferBoundary$BufferBoundaryObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void onComplete() {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.openComplete(this);
        }

        public void onError(Throwable th) {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.boundaryError(this, th);
        }

        public void onNext(Open open) {
            this.parent.open(open);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableBufferBoundary$BufferBoundaryObserver(Observer<? super C> observer, C8065q<? extends Open> qVar, C8339g<? super Open, ? extends C8065q<? extends Close>> gVar, Callable<C> callable) {
        this.downstream = observer;
        this.bufferSupplier = callable;
        this.bufferOpen = qVar;
        this.bufferClose = gVar;
    }

    public void boundaryError(Disposable disposable, Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.observers.mo19404c(disposable);
        onError(th);
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
    public void close(p145io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver<T, C> r4, long r5) {
        /*
            r3 = this;
            io.reactivex.disposables.a r0 = r3.observers
            r0.mo19404c(r4)
            io.reactivex.disposables.a r4 = r3.observers
            int r4 = r4.mo19406f()
            r0 = 1
            if (r4 != 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r4 = r3.upstream
            p145io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver.close(io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver, long):void");
    }

    public void dispose() {
        if (DisposableHelper.dispose(this.upstream)) {
            this.cancelled = true;
            this.observers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            if (getAndIncrement() != 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Observer<? super C> observer = this.downstream;
            C19213a<C> aVar = this.queue;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (!z || this.errors.get() == null) {
                    Collection collection = (Collection) aVar.poll();
                    boolean z2 = collection == null;
                    if (z && z2) {
                        observer.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        observer.onNext(collection);
                    }
                } else {
                    aVar.clear();
                    observer.onError(this.errors.terminate());
                    return;
                }
            }
            aVar.clear();
        }
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        this.observers.dispose();
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
            this.observers.dispose();
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

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.upstream, disposable)) {
            BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
            this.observers.mo19403b(bufferOpenObserver);
            this.bufferOpen.subscribe(bufferOpenObserver);
        }
    }

    public void open(Open open) {
        try {
            C call = this.bufferSupplier.call();
            C12965a.m20650b(call, "The bufferSupplier returned a null Collection");
            Collection collection = (Collection) call;
            Object apply = this.bufferClose.apply(open);
            C12965a.m20650b(apply, "The bufferClose returned a null ObservableSource");
            C8065q qVar = (C8065q) apply;
            long j = this.index;
            this.index = 1 + j;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    map.put(Long.valueOf(j), collection);
                    ObservableBufferBoundary$BufferCloseObserver observableBufferBoundary$BufferCloseObserver = new ObservableBufferBoundary$BufferCloseObserver(this, j);
                    this.observers.mo19403b(observableBufferBoundary$BufferCloseObserver);
                    qVar.subscribe(observableBufferBoundary$BufferCloseObserver);
                }
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            DisposableHelper.dispose(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenObserver<Open> bufferOpenObserver) {
        this.observers.mo19404c(bufferOpenObserver);
        if (this.observers.mo19406f() == 0) {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }
    }
}
