package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableThrottleLatest$ThrottleLatestObserver */
final class ObservableThrottleLatest$ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final Observer<? super T> downstream;
    public final boolean emitLast;
    public Throwable error;
    public final AtomicReference<T> latest = new AtomicReference<>();
    public final long timeout;
    public volatile boolean timerFired;
    public boolean timerRunning;
    public final TimeUnit unit;
    public Disposable upstream;
    public final C8066r.C8069c worker;

    public ObservableThrottleLatest$ThrottleLatestObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r.C8069c cVar, boolean z) {
        this.downstream = observer;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = cVar;
        this.emitLast = z;
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.latest.lazySet((Object) null);
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            AtomicReference<T> atomicReference = this.latest;
            Observer<? super T> observer = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (!z || this.error == null) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        T andSet = atomicReference.getAndSet((Object) null);
                        if (!z2 && this.emitLast) {
                            observer.onNext(andSet);
                        }
                        observer.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        observer.onNext(atomicReference.getAndSet((Object) null));
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.mo20653b(this, this.timeout, this.unit);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    atomicReference.lazySet((Object) null);
                    observer.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
            atomicReference.lazySet((Object) null);
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
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        this.latest.set(t);
        drain();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void run() {
        this.timerFired = true;
        drain();
    }
}
