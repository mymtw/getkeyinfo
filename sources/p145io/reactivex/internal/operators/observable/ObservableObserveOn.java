package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.schedulers.C19232h;
import p248tp.C8065q;
import p248tp.C8066r;
import p503zp.C13968d;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableObserveOn */
public final class ObservableObserveOn<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8066r f42752c;

    /* renamed from: d */
    public final boolean f42753d = false;

    /* renamed from: e */
    public final int f42754e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver */
    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final Observer<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public C13973i<T> queue;
        public int sourceMode;
        public Disposable upstream;
        public final C8066r.C8069c worker;

        public ObserveOnObserver(Observer<? super T> observer, C8066r.C8069c cVar, boolean z, int i) {
            this.downstream = observer;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        public boolean checkTerminated(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        observer.onError(th);
                    } else {
                        observer.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    observer.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    observer.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drainFused() {
            int i = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (this.delayError || !z || th == null) {
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
                        } else {
                            this.downstream.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
        }

        public void drainNormal() {
            C13973i<T> iVar = this.queue;
            Observer<? super T> observer = this.downstream;
            int i = 1;
            while (!checkTerminated(this.done, iVar.isEmpty(), observer)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2, observer)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                observer.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        iVar.clear();
                        observer.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                schedule();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                schedule();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof C13968d) {
                    C13968d dVar = (C13968d) disposable;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
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

        public T poll() throws Exception {
            return this.queue.poll();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.mo20652a(this);
            }
        }
    }

    public ObservableObserveOn(C8065q qVar, C8066r rVar, int i) {
        super(qVar);
        this.f42752c = rVar;
        this.f42754e = i;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        C8066r rVar = this.f42752c;
        if (rVar instanceof C19232h) {
            this.f42793b.subscribe(observer);
            return;
        }
        this.f42793b.subscribe(new ObserveOnObserver(observer, rVar.mo20646b(), this.f42753d, this.f42754e));
    }
}
