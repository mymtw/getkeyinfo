package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.MpscLinkedQueue;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.subjects.UnicastSubject;
import p248tp.C8061n;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver */
final class ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
    public static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    public final C19159e0<T, B> boundaryObserver = new C19159e0<>(this);
    public final int capacityHint;
    public volatile boolean done;
    public final Observer<? super C8061n<T>> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    public final AtomicBoolean stopWindows = new AtomicBoolean();
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();
    public UnicastSubject<T> window;
    public final AtomicInteger windows = new AtomicInteger(1);

    public ObservableWindowBoundary$WindowBoundaryMainObserver(Observer<? super C8061n<T>> observer, int i) {
        this.downstream = observer;
        this.capacityHint = i;
    }

    public void dispose() {
        if (this.stopWindows.compareAndSet(false, true)) {
            this.boundaryObserver.dispose();
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Observer<? super C8061n<T>> observer = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int i = 1;
            while (this.windows.get() != 0) {
                UnicastSubject<T> unicastSubject = this.window;
                boolean z = this.done;
                if (!z || atomicThrowable.get() == null) {
                    Object poll = mpscLinkedQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable terminate = atomicThrowable.terminate();
                        if (terminate == null) {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            observer.onComplete();
                            return;
                        }
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(terminate);
                        }
                        observer.onError(terminate);
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll != NEXT_WINDOW) {
                        unicastSubject.onNext(poll);
                    } else {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        if (!this.stopWindows.get()) {
                            UnicastSubject<T> unicastSubject2 = new UnicastSubject<>(this.capacityHint, this);
                            this.window = unicastSubject2;
                            this.windows.getAndIncrement();
                            observer.onNext(unicastSubject2);
                        }
                    }
                } else {
                    mpscLinkedQueue.clear();
                    Throwable terminate2 = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(terminate2);
                    }
                    observer.onError(terminate2);
                    return;
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }
    }

    public void innerComplete() {
        DisposableHelper.dispose(this.upstream);
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerNext() {
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    public boolean isDisposed() {
        return this.stopWindows.get();
    }

    public void onComplete() {
        this.boundaryObserver.dispose();
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.boundaryObserver.dispose();
        if (this.errors.addThrowable(th)) {
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
        if (DisposableHelper.setOnce(this.upstream, disposable)) {
            innerNext();
        }
    }

    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            DisposableHelper.dispose(this.upstream);
        }
    }
}
