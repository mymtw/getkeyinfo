package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8065q;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver */
final class ObservableSwitchMap$SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
    public static final ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    public final AtomicReference<ObservableSwitchMap$SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
    public final int bufferSize;
    public volatile boolean cancelled;
    public final boolean delayErrors;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final AtomicThrowable errors;
    public final C8339g<? super T, ? extends C8065q<? extends R>> mapper;
    public volatile long unique;
    public Disposable upstream;

    static {
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver = new ObservableSwitchMap$SwitchMapInnerObserver<>((ObservableSwitchMap$SwitchMapObserver) null, -1, 1);
        CANCELLED = observableSwitchMap$SwitchMapInnerObserver;
        observableSwitchMap$SwitchMapInnerObserver.cancel();
    }

    public ObservableSwitchMap$SwitchMapObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8065q<? extends R>> gVar, int i, boolean z) {
        this.downstream = observer;
        this.mapper = gVar;
        this.bufferSize = i;
        this.delayErrors = z;
        this.errors = new AtomicThrowable();
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }
    }

    public void disposeInner() {
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> andSet;
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver = this.active.get();
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver2 = CANCELLED;
        if (observableSwitchMap$SwitchMapInnerObserver != observableSwitchMap$SwitchMapInnerObserver2 && (andSet = this.active.getAndSet(observableSwitchMap$SwitchMapInnerObserver2)) != observableSwitchMap$SwitchMapInnerObserver2 && andSet != null) {
            andSet.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x000f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b A[LOOP:1: B:35:0x006b->B:38:0x0076, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f A[LOOP:2: B:44:0x008f->B:47:0x009b, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4 A[LOOP:4: B:65:0x00d4->B:68:0x00df, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc A[LOOP:5: B:78:0x00fc->B:81:0x0107, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            io.reactivex.Observer<? super R> r0 = r13.downstream
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver<T, R>> r1 = r13.active
            boolean r2 = r13.delayErrors
            r3 = 1
            r4 = r3
        L_0x000f:
            boolean r5 = r13.cancelled
            if (r5 == 0) goto L_0x0014
            return
        L_0x0014:
            boolean r5 = r13.done
            r6 = 0
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r1.get()
            if (r5 != 0) goto L_0x0021
            r5 = r3
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r2 == 0) goto L_0x0038
            if (r5 == 0) goto L_0x0052
            io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
            java.lang.Object r1 = r1.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0034
            r0.onError(r1)
            goto L_0x0037
        L_0x0034:
            r0.onComplete()
        L_0x0037:
            return
        L_0x0038:
            io.reactivex.internal.util.AtomicThrowable r7 = r13.errors
            java.lang.Object r7 = r7.get()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x004c
            io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
            java.lang.Throwable r1 = r1.terminate()
            r0.onError(r1)
            return
        L_0x004c:
            if (r5 == 0) goto L_0x0052
            r0.onComplete()
            return
        L_0x0052:
            java.lang.Object r5 = r1.get()
            io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver r5 = (p145io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver) r5
            if (r5 == 0) goto L_0x0114
            zp.i<R> r7 = r5.queue
            if (r7 == 0) goto L_0x0114
            boolean r8 = r5.done
            r9 = 0
            if (r8 == 0) goto L_0x009f
            boolean r8 = r7.isEmpty()
            if (r2 == 0) goto L_0x0079
            if (r8 == 0) goto L_0x009f
        L_0x006b:
            boolean r6 = r1.compareAndSet(r5, r9)
            if (r6 == 0) goto L_0x0072
            goto L_0x000f
        L_0x0072:
            java.lang.Object r6 = r1.get()
            if (r6 == r5) goto L_0x006b
            goto L_0x000f
        L_0x0079:
            io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
            java.lang.Object r10 = r10.get()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L_0x008d
            io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
            java.lang.Throwable r1 = r1.terminate()
            r0.onError(r1)
            return
        L_0x008d:
            if (r8 == 0) goto L_0x009f
        L_0x008f:
            boolean r6 = r1.compareAndSet(r5, r9)
            if (r6 == 0) goto L_0x0097
            goto L_0x000f
        L_0x0097:
            java.lang.Object r6 = r1.get()
            if (r6 == r5) goto L_0x008f
            goto L_0x000f
        L_0x009f:
            r8 = r6
        L_0x00a0:
            boolean r10 = r13.cancelled
            if (r10 == 0) goto L_0x00a5
            return
        L_0x00a5:
            java.lang.Object r10 = r1.get()
            if (r5 == r10) goto L_0x00ae
        L_0x00ab:
            r8 = r3
            goto L_0x010c
        L_0x00ae:
            if (r2 != 0) goto L_0x00c4
            io.reactivex.internal.util.AtomicThrowable r10 = r13.errors
            java.lang.Object r10 = r10.get()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L_0x00c4
            io.reactivex.internal.util.AtomicThrowable r1 = r13.errors
            java.lang.Throwable r1 = r1.terminate()
            r0.onError(r1)
            return
        L_0x00c4:
            boolean r10 = r5.done
            java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00cb }
            goto L_0x00f3
        L_0x00cb:
            r8 = move-exception
            kotlin.reflect.C19421p.m32940h0(r8)
            io.reactivex.internal.util.AtomicThrowable r11 = r13.errors
            r11.addThrowable(r8)
        L_0x00d4:
            boolean r8 = r1.compareAndSet(r5, r9)
            if (r8 == 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.Object r8 = r1.get()
            if (r8 == r5) goto L_0x00d4
        L_0x00e1:
            if (r2 != 0) goto L_0x00ee
            r13.disposeInner()
            io.reactivex.disposables.Disposable r8 = r13.upstream
            r8.dispose()
            r13.done = r3
            goto L_0x00f1
        L_0x00ee:
            r5.cancel()
        L_0x00f1:
            r8 = r3
            r11 = r9
        L_0x00f3:
            if (r11 != 0) goto L_0x00f7
            r12 = r3
            goto L_0x00f8
        L_0x00f7:
            r12 = r6
        L_0x00f8:
            if (r10 == 0) goto L_0x010a
            if (r12 == 0) goto L_0x010a
        L_0x00fc:
            boolean r6 = r1.compareAndSet(r5, r9)
            if (r6 == 0) goto L_0x0103
            goto L_0x0109
        L_0x0103:
            java.lang.Object r6 = r1.get()
            if (r6 == r5) goto L_0x00fc
        L_0x0109:
            goto L_0x00ab
        L_0x010a:
            if (r12 == 0) goto L_0x0110
        L_0x010c:
            if (r8 == 0) goto L_0x0114
            goto L_0x000f
        L_0x0110:
            r0.onNext(r11)
            goto L_0x00a0
        L_0x0114:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto L_0x000f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver.drain():void");
    }

    public void innerError(ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver, Throwable th) {
        if (observableSwitchMap$SwitchMapInnerObserver.index != this.unique || !this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.dispose();
            this.done = true;
        }
        observableSwitchMap$SwitchMapInnerObserver.done = true;
        drain();
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done || !this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
            return;
        }
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        boolean z;
        long j = this.unique + 1;
        this.unique = j;
        ObservableSwitchMap$SwitchMapInnerObserver observableSwitchMap$SwitchMapInnerObserver = this.active.get();
        if (observableSwitchMap$SwitchMapInnerObserver != null) {
            observableSwitchMap$SwitchMapInnerObserver.cancel();
        }
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The ObservableSource returned is null");
            C8065q qVar = (C8065q) apply;
            ObservableSwitchMap$SwitchMapInnerObserver observableSwitchMap$SwitchMapInnerObserver2 = new ObservableSwitchMap$SwitchMapInnerObserver(this, j, this.bufferSize);
            do {
                ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver3 = this.active.get();
                if (observableSwitchMap$SwitchMapInnerObserver3 != CANCELLED) {
                    AtomicReference<ObservableSwitchMap$SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                    while (true) {
                        if (!atomicReference.compareAndSet(observableSwitchMap$SwitchMapInnerObserver3, observableSwitchMap$SwitchMapInnerObserver2)) {
                            if (atomicReference.get() != observableSwitchMap$SwitchMapInnerObserver3) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } while (!z);
            qVar.subscribe(observableSwitchMap$SwitchMapInnerObserver2);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
