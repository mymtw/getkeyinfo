package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservablePublishSelector$TargetObserver */
final class ObservablePublishSelector$TargetObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, Disposable {
    private static final long serialVersionUID = 854110278590336484L;
    public final Observer<? super R> downstream;
    public Disposable upstream;

    public ObservablePublishSelector$TargetObserver(Observer<? super R> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        this.upstream.dispose();
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
