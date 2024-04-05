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
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p503zp.C13972h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver */
final class ObservableConcatMapSingle$ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_INACTIVE = 0;
    public static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
    public R item;
    public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;
    public final C13972h<T> queue;
    public volatile int state;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver */
    public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements C8073u<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        public final ObservableConcatMapSingle$ConcatMapSingleMainObserver<?, R> parent;

        public ConcatMapSingleObserver(ObservableConcatMapSingle$ConcatMapSingleMainObserver<?, R> observableConcatMapSingle$ConcatMapSingleMainObserver) {
            this.parent = observableConcatMapSingle$ConcatMapSingleMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public ObservableConcatMapSingle$ConcatMapSingleMainObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8075w<? extends R>> gVar, int i, ErrorMode errorMode2) {
        this.downstream = observer;
        this.mapper = gVar;
        this.errorMode = errorMode2;
        this.queue = new C19213a(i);
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
            this.item = null;
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Observer<? super R> observer = this.downstream;
            ErrorMode errorMode2 = this.errorMode;
            C13972h<T> hVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int i = 1;
            while (true) {
                if (this.cancelled) {
                    hVar.clear();
                    this.item = null;
                } else {
                    int i2 = this.state;
                    if (atomicThrowable.get() == null || !(errorMode2 == ErrorMode.IMMEDIATE || (errorMode2 == ErrorMode.BOUNDARY && i2 == 0))) {
                        boolean z = false;
                        if (i2 == 0) {
                            boolean z2 = this.done;
                            T poll = hVar.poll();
                            if (poll == null) {
                                z = true;
                            }
                            if (z2 && z) {
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    observer.onComplete();
                                    return;
                                } else {
                                    observer.onError(terminate);
                                    return;
                                }
                            } else if (!z) {
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    C12965a.m20650b(apply, "The mapper returned a null SingleSource");
                                    C8075w wVar = (C8075w) apply;
                                    this.state = 1;
                                    wVar.mo20655a(this.inner);
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    this.upstream.dispose();
                                    hVar.clear();
                                    atomicThrowable.addThrowable(th);
                                    observer.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.item;
                            this.item = null;
                            observer.onNext(r);
                            this.state = 0;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            hVar.clear();
            this.item = null;
            observer.onError(atomicThrowable.terminate());
        }
    }

    public void innerError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerSuccess(R r) {
        this.item = r;
        this.state = 2;
        drain();
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
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

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
