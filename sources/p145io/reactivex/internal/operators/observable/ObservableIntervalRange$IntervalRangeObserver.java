package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver */
final class ObservableIntervalRange$IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
    private static final long serialVersionUID = 1891866368734007884L;
    public long count;
    public final Observer<? super Long> downstream;
    public final long end;

    public ObservableIntervalRange$IntervalRangeObserver(Observer<? super Long> observer, long j, long j2) {
        this.downstream = observer;
        this.count = j;
        this.end = j2;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void run() {
        if (!isDisposed()) {
            long j = this.count;
            this.downstream.onNext(Long.valueOf(j));
            if (j == this.end) {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
                return;
            }
            this.count = j + 1;
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
