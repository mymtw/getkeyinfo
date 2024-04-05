package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8065q;
import p287xp.C8339g;
import p503zp.C13968d;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver */
final class ObservableConcatMap$ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = -6951100001833242599L;
    public volatile boolean active;
    public final int bufferSize;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final C8339g<? super T, ? extends C8065q<? extends R>> mapper;
    public final DelayErrorInnerObserver<R> observer;
    public C13973i<T> queue;
    public int sourceMode;
    public final boolean tillTheEnd;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver */
    public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 2620149119579502636L;
        public final Observer<? super R> downstream;
        public final ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> parent;

        public DelayErrorInnerObserver(Observer<? super R> observer, ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver) {
            this.downstream = observer;
            this.parent = observableConcatMap$ConcatMapDelayErrorObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver = this.parent;
            observableConcatMap$ConcatMapDelayErrorObserver.active = false;
            observableConcatMap$ConcatMapDelayErrorObserver.drain();
        }

        public void onError(Throwable th) {
            ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver = this.parent;
            if (observableConcatMap$ConcatMapDelayErrorObserver.error.addThrowable(th)) {
                if (!observableConcatMap$ConcatMapDelayErrorObserver.tillTheEnd) {
                    observableConcatMap$ConcatMapDelayErrorObserver.upstream.dispose();
                }
                observableConcatMap$ConcatMapDelayErrorObserver.active = false;
                observableConcatMap$ConcatMapDelayErrorObserver.drain();
                return;
            }
            C18981a.m32123b(th);
        }

        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public ObservableConcatMap$ConcatMapDelayErrorObserver(Observer<? super R> observer2, C8339g<? super T, ? extends C8065q<? extends R>> gVar, int i, boolean z) {
        this.downstream = observer2;
        this.mapper = gVar;
        this.bufferSize = i;
        this.tillTheEnd = z;
        this.observer = new DelayErrorInnerObserver<>(observer2, this);
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.observer.dispose();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Observer<? super R> observer2 = this.downstream;
            C13973i<T> iVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        iVar.clear();
                        return;
                    } else if (this.tillTheEnd || ((Throwable) atomicThrowable.get()) == null) {
                        boolean z = this.done;
                        try {
                            T poll = iVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.cancelled = true;
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate != null) {
                                    observer2.onError(terminate);
                                    return;
                                } else {
                                    observer2.onComplete();
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
                                    C8065q qVar = (C8065q) apply;
                                    if (qVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) qVar).call();
                                            if (call != null && !this.cancelled) {
                                                observer2.onNext(call);
                                            }
                                        } catch (Throwable th) {
                                            C19421p.m32940h0(th);
                                            atomicThrowable.addThrowable(th);
                                        }
                                    } else {
                                        this.active = true;
                                        qVar.subscribe(this.observer);
                                    }
                                } catch (Throwable th2) {
                                    C19421p.m32940h0(th2);
                                    this.cancelled = true;
                                    this.upstream.dispose();
                                    iVar.clear();
                                    atomicThrowable.addThrowable(th2);
                                    observer2.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C19421p.m32940h0(th3);
                            this.cancelled = true;
                            this.upstream.dispose();
                            atomicThrowable.addThrowable(th3);
                            observer2.onError(atomicThrowable.terminate());
                            return;
                        }
                    } else {
                        iVar.clear();
                        this.cancelled = true;
                        observer2.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.error.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (this.sourceMode == 0) {
            this.queue.offer(t);
        }
        drain();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof C13968d) {
                C13968d dVar = (C13968d) disposable;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.sourceMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceMode = requestFusion;
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
