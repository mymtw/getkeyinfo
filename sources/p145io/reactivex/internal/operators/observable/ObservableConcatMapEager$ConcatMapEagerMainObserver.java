package p145io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.InnerQueuedObserver;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ErrorMode;
import p248tp.C8065q;
import p287xp.C8339g;
import p313aq.C8540e;
import p503zp.C13968d;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver */
final class ObservableConcatMapEager$ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, C8540e<R> {
    private static final long serialVersionUID = 8080567949447303262L;
    public int activeCount;
    public volatile boolean cancelled;
    public InnerQueuedObserver<R> current;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final ErrorMode errorMode;
    public final C8339g<? super T, ? extends C8065q<? extends R>> mapper;
    public final int maxConcurrency;
    public final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();
    public final int prefetch;
    public C13973i<T> queue;
    public int sourceMode;
    public Disposable upstream;

    public ObservableConcatMapEager$ConcatMapEagerMainObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8065q<? extends R>> gVar, int i, int i2, ErrorMode errorMode2) {
        this.downstream = observer;
        this.mapper = gVar;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode2;
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.dispose();
            drainAndDispose();
        }
    }

    public void disposeAll() {
        InnerQueuedObserver<R> innerQueuedObserver = this.current;
        if (innerQueuedObserver != null) {
            innerQueuedObserver.dispose();
        }
        while (true) {
            InnerQueuedObserver poll = this.observers.poll();
            if (poll != null) {
                poll.dispose();
            } else {
                return;
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C13973i<T> iVar = this.queue;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
            Observer<? super R> observer = this.downstream;
            ErrorMode errorMode2 = this.errorMode;
            int i = 1;
            while (true) {
                int i2 = this.activeCount;
                while (true) {
                    if (i2 == this.maxConcurrency) {
                        break;
                    } else if (this.cancelled) {
                        iVar.clear();
                        disposeAll();
                        return;
                    } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                        try {
                            T poll = iVar.poll();
                            if (poll == null) {
                                break;
                            }
                            Object apply = this.mapper.apply(poll);
                            C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
                            C8065q qVar = (C8065q) apply;
                            InnerQueuedObserver innerQueuedObserver = new InnerQueuedObserver(this, this.prefetch);
                            arrayDeque.offer(innerQueuedObserver);
                            qVar.subscribe(innerQueuedObserver);
                            i2++;
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            this.upstream.dispose();
                            iVar.clear();
                            disposeAll();
                            this.error.addThrowable(th);
                            observer.onError(this.error.terminate());
                            return;
                        }
                    } else {
                        iVar.clear();
                        disposeAll();
                        observer.onError(this.error.terminate());
                        return;
                    }
                }
                this.activeCount = i2;
                if (this.cancelled) {
                    iVar.clear();
                    disposeAll();
                    return;
                } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                    InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                    if (innerQueuedObserver2 == null) {
                        if (errorMode2 != ErrorMode.BOUNDARY || ((Throwable) this.error.get()) == null) {
                            boolean z = this.done;
                            InnerQueuedObserver<R> poll2 = arrayDeque.poll();
                            boolean z2 = poll2 == null;
                            if (!z || !z2) {
                                if (!z2) {
                                    this.current = poll2;
                                }
                                innerQueuedObserver2 = poll2;
                            } else if (((Throwable) this.error.get()) != null) {
                                iVar.clear();
                                disposeAll();
                                observer.onError(this.error.terminate());
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        } else {
                            iVar.clear();
                            disposeAll();
                            observer.onError(this.error.terminate());
                            return;
                        }
                    }
                    if (innerQueuedObserver2 != null) {
                        C13973i<R> queue2 = innerQueuedObserver2.queue();
                        while (!this.cancelled) {
                            boolean isDone = innerQueuedObserver2.isDone();
                            if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                                try {
                                    R poll3 = queue2.poll();
                                    boolean z3 = poll3 == null;
                                    if (isDone && z3) {
                                        this.current = null;
                                        this.activeCount--;
                                    } else if (!z3) {
                                        observer.onNext(poll3);
                                    }
                                } catch (Throwable th2) {
                                    C19421p.m32940h0(th2);
                                    this.error.addThrowable(th2);
                                    this.current = null;
                                    this.activeCount--;
                                }
                            } else {
                                iVar.clear();
                                disposeAll();
                                observer.onError(this.error.terminate());
                                return;
                            }
                        }
                        iVar.clear();
                        disposeAll();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    iVar.clear();
                    disposeAll();
                    observer.onError(this.error.terminate());
                    return;
                }
            }
        }
    }

    public void drainAndDispose() {
        if (getAndIncrement() == 0) {
            do {
                this.queue.clear();
                disposeAll();
            } while (decrementAndGet() != 0);
        }
    }

    public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
        innerQueuedObserver.setDone();
        drain();
    }

    public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
        if (this.error.addThrowable(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.upstream.dispose();
            }
            innerQueuedObserver.setDone();
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r) {
        innerQueuedObserver.queue().offer(r);
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
            this.queue = new C19213a(this.prefetch);
            this.downstream.onSubscribe(this);
        }
    }
}
