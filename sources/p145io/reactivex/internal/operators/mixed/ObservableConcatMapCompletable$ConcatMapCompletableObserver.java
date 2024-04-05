package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ErrorMode;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8050c;
import p248tp.C8052e;
import p287xp.C8339g;
import p503zp.C13968d;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver */
final class ObservableConcatMapCompletable$ConcatMapCompletableObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = 3610901111000061034L;
    public volatile boolean active;
    public volatile boolean disposed;
    public volatile boolean done;
    public final C8050c downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
    public final C8339g<? super T, ? extends C8052e> mapper;
    public final int prefetch;
    public C13973i<T> queue;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver */
    public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = 5638352172918776687L;
        public final ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> observableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = observableConcatMapCompletable$ConcatMapCompletableObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.parent.innerComplete();
        }

        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public ObservableConcatMapCompletable$ConcatMapCompletableObserver(C8050c cVar, C8339g<? super T, ? extends C8052e> gVar, ErrorMode errorMode2, int i) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.errorMode = errorMode2;
        this.prefetch = i;
    }

    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        boolean z;
        if (getAndIncrement() == 0) {
            AtomicThrowable atomicThrowable = this.errors;
            ErrorMode errorMode2 = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (errorMode2 != ErrorMode.BOUNDARY || atomicThrowable.get() == null) {
                        boolean z2 = this.done;
                        C8052e eVar = null;
                        try {
                            T poll = this.queue.poll();
                            if (poll != null) {
                                Object apply = this.mapper.apply(poll);
                                C12965a.m20650b(apply, "The mapper returned a null CompletableSource");
                                eVar = (C8052e) apply;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z2 && z) {
                                this.disposed = true;
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate != null) {
                                    this.downstream.onError(terminate);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            } else if (!z) {
                                this.active = true;
                                eVar.mo20607a(this.inner);
                            }
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            this.disposed = true;
                            this.queue.clear();
                            this.upstream.dispose();
                            atomicThrowable.addThrowable(th);
                            this.downstream.onError(atomicThrowable.terminate());
                            return;
                        }
                    } else {
                        this.disposed = true;
                        this.queue.clear();
                        this.downstream.onError(atomicThrowable.terminate());
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

    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.disposed = true;
            this.upstream.dispose();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.f43031a) {
                this.downstream.onError(terminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        } else {
            this.active = false;
            drain();
        }
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.disposed = true;
            this.inner.dispose();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.f43031a) {
                this.downstream.onError(terminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        } else {
            this.done = true;
            drain();
        }
    }

    public void onNext(T t) {
        if (t != null) {
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
                    this.queue = dVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.queue = dVar;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new C19213a(this.prefetch);
            this.downstream.onSubscribe(this);
        }
    }
}
