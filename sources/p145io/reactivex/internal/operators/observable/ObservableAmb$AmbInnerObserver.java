package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver */
final class ObservableAmb$AmbInnerObserver<T> extends AtomicReference<Disposable> implements Observer<T> {
    private static final long serialVersionUID = -1185974347409665484L;
    public final Observer<? super T> downstream;
    public final int index;
    public final C19148b<T> parent;
    public boolean won;

    public ObservableAmb$AmbInnerObserver(C19148b<T> bVar, int i, Observer<? super T> observer) {
        this.index = i;
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public void onComplete() {
        if (this.won) {
            this.downstream.onComplete();
            return;
        }
        throw null;
    }

    public void onError(Throwable th) {
        if (this.won) {
            this.downstream.onError(th);
            return;
        }
        throw null;
    }

    public void onNext(T t) {
        if (this.won) {
            this.downstream.onNext(t);
            return;
        }
        throw null;
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
