package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8065q;
import p287xp.C8339g;
import p503zp.C13968d;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver */
final class ObservableConcatMap$SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = 8828587559905699186L;
    public volatile boolean active;
    public final int bufferSize;
    public volatile boolean disposed;
    public volatile boolean done;
    public final Observer<? super U> downstream;
    public int fusionMode;
    public final InnerObserver<U> inner;
    public final C8339g<? super T, ? extends C8065q<? extends U>> mapper;
    public C13973i<T> queue;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver */
    public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -7449079488798789337L;
        public final Observer<? super U> downstream;
        public final ObservableConcatMap$SourceObserver<?, ?> parent;

        public InnerObserver(Observer<? super U> observer, ObservableConcatMap$SourceObserver<?, ?> observableConcatMap$SourceObserver) {
            this.downstream = observer;
            this.parent = observableConcatMap$SourceObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.parent.innerComplete();
        }

        public void onError(Throwable th) {
            this.parent.dispose();
            this.downstream.onError(th);
        }

        public void onNext(U u) {
            this.downstream.onNext(u);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public ObservableConcatMap$SourceObserver(Observer<? super U> observer, C8339g<? super T, ? extends C8065q<? extends U>> gVar, int i) {
        this.downstream = observer;
        this.mapper = gVar;
        this.bufferSize = i;
        this.inner = new InnerObserver<>(observer, this);
    }

    public void dispose() {
        this.disposed = true;
        this.inner.dispose();
        this.upstream.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            while (!this.disposed) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        T poll = this.queue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            return;
                        } else if (!z2) {
                            try {
                                Object apply = this.mapper.apply(poll);
                                C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
                                C8065q qVar = (C8065q) apply;
                                this.active = true;
                                qVar.subscribe(this.inner);
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public boolean isDisposed() {
        return this.disposed;
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
        this.done = true;
        dispose();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            if (this.fusionMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof C13968d) {
                C13968d dVar = (C13968d) disposable;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new C19213a(this.bufferSize);
            this.downstream.onSubscribe(this);
        }
    }
}
