package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservablePublishAlt$PublishConnection */
final class ObservablePublishAlt$PublishConnection<T> extends AtomicReference<ObservablePublishAlt$InnerDisposable<T>[]> implements Observer<T>, Disposable {
    public static final ObservablePublishAlt$InnerDisposable[] EMPTY = new ObservablePublishAlt$InnerDisposable[0];
    public static final ObservablePublishAlt$InnerDisposable[] TERMINATED = new ObservablePublishAlt$InnerDisposable[0];
    private static final long serialVersionUID = -3251430252873581268L;
    public final AtomicBoolean connect = new AtomicBoolean();
    public final AtomicReference<ObservablePublishAlt$PublishConnection<T>> current;
    public Throwable error;
    public final AtomicReference<Disposable> upstream;

    public ObservablePublishAlt$PublishConnection(AtomicReference<ObservablePublishAlt$PublishConnection<T>> atomicReference) {
        this.current = atomicReference;
        this.upstream = new AtomicReference<>();
        lazySet(EMPTY);
    }

    public boolean add(ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable) {
        ObservablePublishAlt$InnerDisposable[] observablePublishAlt$InnerDisposableArr;
        ObservablePublishAlt$InnerDisposable[] observablePublishAlt$InnerDisposableArr2;
        do {
            observablePublishAlt$InnerDisposableArr = (ObservablePublishAlt$InnerDisposable[]) get();
            if (observablePublishAlt$InnerDisposableArr == TERMINATED) {
                return false;
            }
            int length = observablePublishAlt$InnerDisposableArr.length;
            observablePublishAlt$InnerDisposableArr2 = new ObservablePublishAlt$InnerDisposable[(length + 1)];
            System.arraycopy(observablePublishAlt$InnerDisposableArr, 0, observablePublishAlt$InnerDisposableArr2, 0, length);
            observablePublishAlt$InnerDisposableArr2[length] = observablePublishAlt$InnerDisposable;
        } while (!compareAndSet(observablePublishAlt$InnerDisposableArr, observablePublishAlt$InnerDisposableArr2));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0013, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r2 = this;
            io.reactivex.internal.operators.observable.ObservablePublishAlt$InnerDisposable[] r0 = TERMINATED
            r2.getAndSet(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublishAlt$PublishConnection<T>> r0 = r2.current
        L_0x0007:
            r1 = 0
            boolean r1 = r0.compareAndSet(r2, r1)
            if (r1 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            java.lang.Object r1 = r0.get()
            if (r1 == r2) goto L_0x0007
        L_0x0015:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.upstream
            p145io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservablePublishAlt$PublishConnection.dispose():void");
    }

    public boolean isDisposed() {
        return get() == TERMINATED;
    }

    public void onComplete() {
        this.upstream.lazySet(DisposableHelper.DISPOSED);
        for (ObservablePublishAlt$InnerDisposable observablePublishAlt$InnerDisposable : (ObservablePublishAlt$InnerDisposable[]) getAndSet(TERMINATED)) {
            observablePublishAlt$InnerDisposable.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.error = th;
        this.upstream.lazySet(DisposableHelper.DISPOSED);
        for (ObservablePublishAlt$InnerDisposable observablePublishAlt$InnerDisposable : (ObservablePublishAlt$InnerDisposable[]) getAndSet(TERMINATED)) {
            observablePublishAlt$InnerDisposable.downstream.onError(th);
        }
    }

    public void onNext(T t) {
        for (ObservablePublishAlt$InnerDisposable observablePublishAlt$InnerDisposable : (ObservablePublishAlt$InnerDisposable[]) get()) {
            observablePublishAlt$InnerDisposable.downstream.onNext(t);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void remove(ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable) {
        ObservablePublishAlt$InnerDisposable<T>[] observablePublishAlt$InnerDisposableArr;
        ObservablePublishAlt$InnerDisposable[] observablePublishAlt$InnerDisposableArr2;
        do {
            observablePublishAlt$InnerDisposableArr = (ObservablePublishAlt$InnerDisposable[]) get();
            int length = observablePublishAlt$InnerDisposableArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (observablePublishAlt$InnerDisposableArr[i2] == observablePublishAlt$InnerDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    observablePublishAlt$InnerDisposableArr2 = EMPTY;
                    if (length != 1) {
                        observablePublishAlt$InnerDisposableArr2 = new ObservablePublishAlt$InnerDisposable[(length - 1)];
                        System.arraycopy(observablePublishAlt$InnerDisposableArr, 0, observablePublishAlt$InnerDisposableArr2, 0, i);
                        System.arraycopy(observablePublishAlt$InnerDisposableArr, i + 1, observablePublishAlt$InnerDisposableArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(observablePublishAlt$InnerDisposableArr, observablePublishAlt$InnerDisposableArr2));
    }
}
