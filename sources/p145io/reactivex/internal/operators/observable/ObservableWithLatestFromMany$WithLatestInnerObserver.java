package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver */
final class ObservableWithLatestFromMany$WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {
    private static final long serialVersionUID = 3256684027868224024L;
    public boolean hasValue;
    public final int index;
    public final ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> parent;

    public ObservableWithLatestFromMany$WithLatestInnerObserver(ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> observableWithLatestFromMany$WithLatestFromObserver, int i) {
        this.parent = observableWithLatestFromMany$WithLatestFromObserver;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public void onComplete() {
        this.parent.innerComplete(this.index, this.hasValue);
    }

    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    public void onNext(Object obj) {
        if (!this.hasValue) {
            this.hasValue = true;
        }
        this.parent.innerNext(this.index, obj);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
