package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObserverResourceWrapper */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -8612022020200669122L;
    public final Observer<? super T> downstream;
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this.upstream, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
