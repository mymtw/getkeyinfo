package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8058k;
import p248tp.C8059l;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver */
final class ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
    public static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>((ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver) null);
    private static final long serialVersionUID = -5402190102429853762L;
    public volatile boolean cancelled;
    public final boolean delayErrors;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
    public final C8339g<? super T, ? extends C8059l<? extends R>> mapper;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver */
    public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements C8058k<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        public volatile R item;
        public final ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> parent;

        public SwitchMapMaybeObserver(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> observableSwitchMapMaybe$SwitchMapMaybeMainObserver) {
            this.parent = observableSwitchMapMaybe$SwitchMapMaybeMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.parent.innerComplete(this);
        }

        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(R r) {
            this.item = r;
            this.parent.drain();
        }
    }

    public ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8059l<? extends R>> gVar, boolean z) {
        this.downstream = observer;
        this.mapper = gVar;
        this.delayErrors = z;
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        disposeInner();
    }

    public void disposeInner() {
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
        SwitchMapMaybeObserver<Object> andSet = atomicReference.getAndSet(switchMapMaybeObserver);
        if (andSet != null && andSet != switchMapMaybeObserver) {
            andSet.dispose();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[LOOP:1: B:27:0x004d->B:30:0x0058, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
            r8 = this;
            int r0 = r8.getAndIncrement()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            io.reactivex.Observer<? super R> r0 = r8.downstream
            io.reactivex.internal.util.AtomicThrowable r1 = r8.errors
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver<R>> r2 = r8.inner
            r3 = 1
            r4 = r3
        L_0x000f:
            boolean r5 = r8.cancelled
            if (r5 == 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.Object r5 = r1.get()
            if (r5 == 0) goto L_0x0026
            boolean r5 = r8.delayErrors
            if (r5 != 0) goto L_0x0026
            java.lang.Throwable r1 = r1.terminate()
            r0.onError(r1)
            return
        L_0x0026:
            boolean r5 = r8.done
            java.lang.Object r6 = r2.get()
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver r6 = (p145io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver.SwitchMapMaybeObserver) r6
            if (r6 != 0) goto L_0x0032
            r7 = r3
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
            java.lang.Throwable r1 = r1.terminate()
            if (r1 == 0) goto L_0x0041
            r0.onError(r1)
            goto L_0x0044
        L_0x0041:
            r0.onComplete()
        L_0x0044:
            return
        L_0x0045:
            if (r7 != 0) goto L_0x0060
            R r5 = r6.item
            if (r5 != 0) goto L_0x004c
            goto L_0x0060
        L_0x004c:
            r5 = 0
        L_0x004d:
            boolean r7 = r2.compareAndSet(r6, r5)
            if (r7 == 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            java.lang.Object r7 = r2.get()
            if (r7 == r6) goto L_0x004d
        L_0x005a:
            R r5 = r6.item
            r0.onNext(r5)
            goto L_0x000f
        L_0x0060:
            int r4 = -r4
            int r4 = r8.addAndGet(r4)
            if (r4 != 0) goto L_0x000f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver.drain():void");
    }

    public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
        boolean z;
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        while (true) {
            if (!atomicReference.compareAndSet(switchMapMaybeObserver, (Object) null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            drain();
        }
    }

    public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
        boolean z;
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        while (true) {
            if (!atomicReference.compareAndSet(switchMapMaybeObserver, (Object) null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z || !this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.dispose();
            disposeInner();
        }
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
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        boolean z;
        SwitchMapMaybeObserver switchMapMaybeObserver = this.inner.get();
        if (switchMapMaybeObserver != null) {
            switchMapMaybeObserver.dispose();
        }
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null MaybeSource");
            C8059l lVar = (C8059l) apply;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = new SwitchMapMaybeObserver(this);
            do {
                SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = this.inner.get();
                if (switchMapMaybeObserver3 != INNER_DISPOSED) {
                    AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                    while (true) {
                        if (!atomicReference.compareAndSet(switchMapMaybeObserver3, switchMapMaybeObserver2)) {
                            if (atomicReference.get() != switchMapMaybeObserver3) {
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
            lVar.mo20624a(switchMapMaybeObserver2);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.upstream.dispose();
            this.inner.getAndSet(INNER_DISPOSED);
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
