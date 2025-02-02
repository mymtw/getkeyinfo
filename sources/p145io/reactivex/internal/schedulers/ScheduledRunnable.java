package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p145io.reactivex.disposables.Disposable;
import p494yp.C13940a;

/* renamed from: io.reactivex.internal.schedulers.ScheduledRunnable */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {
    public static final Object ASYNC_DISPOSED = new Object();
    public static final Object DONE = new Object();
    public static final int FUTURE_INDEX = 1;
    public static final Object PARENT_DISPOSED = new Object();
    public static final int PARENT_INDEX = 0;
    public static final Object SYNC_DISPOSED = new Object();
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;

    public ScheduledRunnable(Runnable runnable, C13940a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r7 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r7.get(r0)
            java.lang.Object r2 = DONE
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r2 = SYNC_DISPOSED
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = ASYNC_DISPOSED
            if (r1 != r4) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r5 = 2
            java.lang.Object r5 = r7.get(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r5 == r6) goto L_0x0020
            r5 = r0
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            if (r5 == 0) goto L_0x0024
            r2 = r4
        L_0x0024:
            boolean r0 = r7.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L_0x0031:
            java.lang.Object r0 = r7.get(r3)
            java.lang.Object r1 = DONE
            if (r0 == r1) goto L_0x004b
            java.lang.Object r1 = PARENT_DISPOSED
            if (r0 == r1) goto L_0x004b
            if (r0 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            boolean r1 = r7.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            yp.a r0 = (p494yp.C13940a) r0
            r0.mo19404c(r7)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.schedulers.ScheduledRunnable.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        return obj == PARENT_DISPOSED || obj == DONE;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == PARENT_DISPOSED || !compareAndSet(0, obj3, DONE) || obj3 == null)) {
                ((C13940a) obj3).mo19404c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == SYNC_DISPOSED || obj2 == ASYNC_DISPOSED || compareAndSet(1, obj2, DONE)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, DONE));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == PARENT_DISPOSED || !compareAndSet(0, obj4, DONE) || obj4 == null)) {
            ((C13940a) obj4).mo19404c(this);
        }
        do {
            obj = get(1);
            if (obj == SYNC_DISPOSED || obj == ASYNC_DISPOSED || compareAndSet(1, obj, DONE)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, DONE));
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != DONE) {
                if (obj == SYNC_DISPOSED) {
                    future.cancel(false);
                    return;
                } else if (obj == ASYNC_DISPOSED) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
