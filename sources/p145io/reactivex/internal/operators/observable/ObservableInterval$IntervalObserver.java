package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver */
final class ObservableInterval$IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
    private static final long serialVersionUID = 346773832286157679L;
    public long count;
    public final Observer<? super Long> downstream;

    public ObservableInterval$IntervalObserver(Observer<? super Long> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void run() {
        if (get() != DisposableHelper.DISPOSED) {
            Observer<? super Long> observer = this.downstream;
            long j = this.count;
            this.count = 1 + j;
            observer.onNext(Long.valueOf(j));
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
