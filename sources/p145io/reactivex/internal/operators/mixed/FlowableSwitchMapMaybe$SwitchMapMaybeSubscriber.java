package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p248tp.C8058k;
import p248tp.C8059l;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber */
final class FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription {
    public static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>((FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber) null);
    private static final long serialVersionUID = -5402190102429853762L;
    public volatile boolean cancelled;
    public final boolean delayErrors;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public long emitted;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
    public final C8339g<? super T, ? extends C8059l<? extends R>> mapper;
    public final AtomicLong requested = new AtomicLong();
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver */
    public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements C8058k<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        public volatile R item;
        public final FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<?, R> parent;

        public SwitchMapMaybeObserver(FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<?, R> flowableSwitchMapMaybe$SwitchMapMaybeSubscriber) {
            this.parent = flowableSwitchMapMaybe$SwitchMapMaybeSubscriber;
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

    public FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C8059l<? extends R>> gVar, boolean z) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.delayErrors = z;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
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

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[LOOP:1: B:29:0x0059->B:32:0x0064, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
            r12 = this;
            int r0 = r12.getAndIncrement()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            or.c<? super R> r0 = r12.downstream
            io.reactivex.internal.util.AtomicThrowable r1 = r12.errors
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> r2 = r12.inner
            java.util.concurrent.atomic.AtomicLong r3 = r12.requested
            long r4 = r12.emitted
            r6 = 1
            r7 = r6
        L_0x0013:
            boolean r8 = r12.cancelled
            if (r8 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.Object r8 = r1.get()
            if (r8 == 0) goto L_0x002a
            boolean r8 = r12.delayErrors
            if (r8 != 0) goto L_0x002a
            java.lang.Throwable r1 = r1.terminate()
            r0.onError(r1)
            return
        L_0x002a:
            boolean r8 = r12.done
            java.lang.Object r9 = r2.get()
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver r9 = (p145io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber.SwitchMapMaybeObserver) r9
            if (r9 != 0) goto L_0x0036
            r10 = r6
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r8 == 0) goto L_0x0049
            if (r10 == 0) goto L_0x0049
            java.lang.Throwable r1 = r1.terminate()
            if (r1 == 0) goto L_0x0045
            r0.onError(r1)
            goto L_0x0048
        L_0x0045:
            r0.onComplete()
        L_0x0048:
            return
        L_0x0049:
            if (r10 != 0) goto L_0x006f
            R r8 = r9.item
            if (r8 == 0) goto L_0x006f
            long r10 = r3.get()
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0058
            goto L_0x006f
        L_0x0058:
            r8 = 0
        L_0x0059:
            boolean r10 = r2.compareAndSet(r9, r8)
            if (r10 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            java.lang.Object r10 = r2.get()
            if (r10 == r9) goto L_0x0059
        L_0x0066:
            R r8 = r9.item
            r0.onNext(r8)
            r8 = 1
            long r4 = r4 + r8
            goto L_0x0013
        L_0x006f:
            r12.emitted = r4
            int r7 = -r7
            int r7 = r12.addAndGet(r7)
            if (r7 != 0) goto L_0x0013
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber.drain():void");
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
            this.upstream.cancel();
            disposeInner();
        }
        drain();
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
            this.upstream.cancel();
            this.inner.getAndSet(INNER_DISPOSED);
            onError(th);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
        drain();
    }
}
