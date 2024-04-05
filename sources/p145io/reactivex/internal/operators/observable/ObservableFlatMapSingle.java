package p145io.reactivex.internal.operators.observable;

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
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapSingle */
public final class ObservableFlatMapSingle<T, R> extends C19145a<T, R> {

    /* renamed from: c */
    public final C8339g<? super T, ? extends C8075w<? extends R>> f42750c;

    /* renamed from: d */
    public final boolean f42751d = false;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver */
    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active = new AtomicInteger(1);
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final Observer<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;
        public final AtomicReference<C19213a<R>> queue = new AtomicReference<>();
        public final C7091a set = new C7091a();
        public Disposable upstream;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver */
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
                FlatMapSingleObserver.this.innerError(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onSuccess(R r) {
                FlatMapSingleObserver.this.innerSuccess(this, r);
            }
        }

        public FlatMapSingleObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8075w<? extends R>> gVar, boolean z) {
            this.downstream = observer;
            this.mapper = gVar;
            this.delayErrors = z;
        }

        public void clear() {
            C19213a aVar = this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            Observer<? super R> observer = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<C19213a<R>> atomicReference = this.queue;
            int i = 1;
            while (!this.cancelled) {
                if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C19213a aVar = atomicReference.get();
                    Object poll = aVar != null ? aVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            observer.onError(terminate);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        observer.onNext(poll);
                    }
                } else {
                    Throwable terminate2 = this.errors.terminate();
                    clear();
                    observer.onError(terminate2);
                    return;
                }
            }
            clear();
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

        public void innerError(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.mo19404c(innerObserver);
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.set.dispose();
                }
                this.active.decrementAndGet();
                drain();
                return;
            }
            C18981a.m32123b(th);
        }

        public void innerSuccess(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, R r) {
            this.set.mo19404c(innerObserver);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    this.downstream.onNext(r);
                    if (this.active.decrementAndGet() == 0) {
                        z = true;
                    }
                    C19213a aVar = this.queue.get();
                    if (!z || (aVar != null && !aVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        drainLoop();
                    }
                    Throwable terminate = this.errors.terminate();
                    if (terminate != null) {
                        this.downstream.onError(terminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
            }
            C19213a orCreateQueue = getOrCreateQueue();
            synchronized (orCreateQueue) {
                orCreateQueue.offer(r);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        public boolean isDisposed() {
            return this.cancelled;
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
                this.upstream.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapSingle(C8065q qVar, C8339g gVar) {
        super(qVar);
        this.f42750c = gVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super R> observer) {
        this.f42793b.subscribe(new FlatMapSingleObserver(observer, this.f42750c, this.f42751d));
    }
}
