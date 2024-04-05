package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$State */
final class ObservableGroupBy$State<T, K> extends AtomicInteger implements Disposable, C8065q<T> {
    private static final long serialVersionUID = -3852313036005250360L;
    public final AtomicReference<Observer<? super T>> actual = new AtomicReference<>();
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public volatile boolean done;
    public Throwable error;
    public final K key;
    public final AtomicBoolean once = new AtomicBoolean();
    public final ObservableGroupBy$GroupByObserver<?, K, T> parent;
    public final C19213a<T> queue;

    public ObservableGroupBy$State(int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, K k, boolean z) {
        this.queue = new C19213a<>(i);
        this.parent = observableGroupBy$GroupByObserver;
        this.key = k;
        this.delayError = z;
    }

    public boolean checkTerminated(boolean z, boolean z2, Observer<? super T> observer, boolean z3) {
        if (this.cancelled.get()) {
            this.queue.clear();
            this.parent.cancel(this.key);
            this.actual.lazySet((Object) null);
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    this.actual.lazySet((Object) null);
                    observer.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.actual.lazySet((Object) null);
                    observer.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                Throwable th2 = this.error;
                this.actual.lazySet((Object) null);
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
    }

    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.actual.lazySet((Object) null);
            this.parent.cancel(this.key);
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C19213a<T> aVar = this.queue;
            boolean z = this.delayError;
            Observer observer = this.actual.get();
            int i = 1;
            while (true) {
                if (observer != null) {
                    while (true) {
                        boolean z2 = this.done;
                        T poll = aVar.poll();
                        boolean z3 = poll == null;
                        if (!checkTerminated(z2, z3, observer, z)) {
                            if (z3) {
                                break;
                            }
                            observer.onNext(poll);
                        } else {
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (observer == null) {
                        observer = this.actual.get();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.cancelled.get();
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    public void subscribe(Observer<? super T> observer) {
        if (this.once.compareAndSet(false, true)) {
            observer.onSubscribe(this);
            this.actual.lazySet(observer);
            if (this.cancelled.get()) {
                this.actual.lazySet((Object) null);
            } else {
                drain();
            }
        } else {
            EmptyDisposable.error((Throwable) new IllegalStateException("Only one Observer allowed!"), (Observer<?>) observer);
        }
    }
}
