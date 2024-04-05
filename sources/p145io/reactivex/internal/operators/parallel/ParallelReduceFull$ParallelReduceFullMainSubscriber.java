package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p287xp.C8335c;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber */
final class ParallelReduceFull$ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
    private static final long serialVersionUID = -5370107872170712765L;
    public final AtomicReference<ParallelReduceFull$SlotPair<T>> current = new AtomicReference<>();
    public final AtomicReference<Throwable> error = new AtomicReference<>();
    public final C8335c<T, T, T> reducer;
    public final AtomicInteger remaining = new AtomicInteger();
    public final ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] subscribers;

    public ParallelReduceFull$ParallelReduceFullMainSubscriber(C20024c<? super T> cVar, int i, C8335c<T, T, T> cVar2) {
        super(cVar);
        ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] parallelReduceFull$ParallelReduceFullInnerSubscriberArr = new ParallelReduceFull$ParallelReduceFullInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            parallelReduceFull$ParallelReduceFullInnerSubscriberArr[i2] = new ParallelReduceFull$ParallelReduceFullInnerSubscriber<>(this, cVar2);
        }
        this.subscribers = parallelReduceFull$ParallelReduceFullInnerSubscriberArr;
        this.reducer = cVar2;
        this.remaining.lazySet(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[LOOP:2: B:14:0x002d->B:17:0x0038, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[LOOP:3: B:24:0x004a->B:27:0x0055, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p145io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T> addValue(T r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r0 = (p145io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair) r0
            r1 = 0
            if (r0 != 0) goto L_0x0025
            io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r2 = new io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r3 = r4.current
        L_0x0012:
            boolean r0 = r3.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x0021
        L_0x001a:
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0012
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            int r2 = r0.tryAcquireSlot()
            if (r2 >= 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r3 = r4.current
        L_0x002d:
            boolean r2 = r3.compareAndSet(r0, r1)
            if (r2 == 0) goto L_0x0034
            goto L_0x0000
        L_0x0034:
            java.lang.Object r2 = r3.get()
            if (r2 == r0) goto L_0x002d
            goto L_0x0000
        L_0x003b:
            if (r2 != 0) goto L_0x0040
            r0.first = r5
            goto L_0x0042
        L_0x0040:
            r0.second = r5
        L_0x0042:
            boolean r5 = r0.releaseSlot()
            if (r5 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r5 = r4.current
        L_0x004a:
            boolean r2 = r5.compareAndSet(r0, r1)
            if (r2 == 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            java.lang.Object r2 = r5.get()
            if (r2 == r0) goto L_0x004a
        L_0x0057:
            return r0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber.addValue(java.lang.Object):io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair");
    }

    public void cancel() {
        for (ParallelReduceFull$ParallelReduceFullInnerSubscriber<T> cancel : this.subscribers) {
            cancel.cancel();
        }
    }

    public void innerComplete(T t) {
        if (t != null) {
            while (true) {
                ParallelReduceFull$SlotPair addValue = addValue(t);
                if (addValue == null) {
                    break;
                }
                try {
                    t = this.reducer.apply(addValue.first, addValue.second);
                    C12965a.m20650b(t, "The reducer returned a null value");
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    innerError(th);
                    return;
                }
            }
        }
        if (this.remaining.decrementAndGet() == 0) {
            ParallelReduceFull$SlotPair parallelReduceFull$SlotPair = this.current.get();
            this.current.lazySet((Object) null);
            if (parallelReduceFull$SlotPair != null) {
                complete(parallelReduceFull$SlotPair.first);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public void innerError(Throwable th) {
        boolean z;
        AtomicReference<Throwable> atomicReference = this.error;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, th)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            cancel();
            this.downstream.onError(th);
        } else if (th != this.error.get()) {
            C18981a.m32123b(th);
        }
    }
}
