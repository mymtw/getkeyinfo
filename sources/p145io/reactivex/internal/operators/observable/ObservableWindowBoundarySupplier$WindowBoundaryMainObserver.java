package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.MpscLinkedQueue;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.subjects.UnicastSubject;
import p248tp.C8061n;
import p248tp.C8065q;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver */
final class ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
    public static final C19161f0<Object, Object> BOUNDARY_DISPOSED = new C19161f0<>((ObservableWindowBoundarySupplier$WindowBoundaryMainObserver) null);
    public static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    public final AtomicReference<C19161f0<T, B>> boundaryObserver = new AtomicReference<>();
    public final int capacityHint;
    public volatile boolean done;
    public final Observer<? super C8061n<T>> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final Callable<? extends C8065q<B>> other;
    public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    public final AtomicBoolean stopWindows = new AtomicBoolean();
    public Disposable upstream;
    public UnicastSubject<T> window;
    public final AtomicInteger windows = new AtomicInteger(1);

    public ObservableWindowBoundarySupplier$WindowBoundaryMainObserver(Observer<? super C8061n<T>> observer, int i, Callable<? extends C8065q<B>> callable) {
        this.downstream = observer;
        this.capacityHint = i;
        this.other = callable;
    }

    public void dispose() {
        if (this.stopWindows.compareAndSet(false, true)) {
            disposeBoundary();
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    public void disposeBoundary() {
        AtomicReference<C19161f0<T, B>> atomicReference = this.boundaryObserver;
        C19161f0<Object, Object> f0Var = BOUNDARY_DISPOSED;
        Disposable andSet = atomicReference.getAndSet(f0Var);
        if (andSet != null && andSet != f0Var) {
            andSet.dispose();
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
                    boolean z2 = false;
                    boolean z3 = poll == null;
                    if (z && z3) {
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
                    } else if (z3) {
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
                            try {
                                Object call = this.other.call();
                                C12965a.m20650b(call, "The other Callable returned a null ObservableSource");
                                C8065q qVar = (C8065q) call;
                                C19161f0 f0Var = new C19161f0(this);
                                AtomicReference<C19161f0<T, B>> atomicReference = this.boundaryObserver;
                                while (true) {
                                    if (!atomicReference.compareAndSet((Object) null, f0Var)) {
                                        if (atomicReference.get() != null) {
                                            break;
                                        }
                                    } else {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (z2) {
                                    qVar.subscribe(f0Var);
                                    observer.onNext(unicastSubject2);
                                }
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                atomicThrowable.addThrowable(th);
                                this.done = true;
                            }
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
        this.upstream.dispose();
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        this.upstream.dispose();
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void innerNext(p145io.reactivex.internal.operators.observable.C19161f0<T, B> r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.f0<T, B>> r0 = r2.boundaryObserver
        L_0x0002:
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1)
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r1 = r0.get()
            if (r1 == r3) goto L_0x0002
        L_0x0010:
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r3 = r2.queue
            java.lang.Object r0 = NEXT_WINDOW
            r3.offer(r0)
            r2.drain()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.innerNext(io.reactivex.internal.operators.observable.f0):void");
    }

    public boolean isDisposed() {
        return this.stopWindows.get();
    }

    public void onComplete() {
        disposeBoundary();
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        disposeBoundary();
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
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }
    }

    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }
}
