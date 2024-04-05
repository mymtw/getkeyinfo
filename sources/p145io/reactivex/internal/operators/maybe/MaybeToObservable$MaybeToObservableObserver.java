package p145io.reactivex.internal.operators.maybe;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.observers.DeferredScalarDisposable;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToObservableObserver */
final class MaybeToObservable$MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements C8058k<T> {
    private static final long serialVersionUID = 7603343402964826922L;
    public Disposable upstream;

    public MaybeToObservable$MaybeToObservableObserver(Observer<? super T> observer) {
        super(observer);
    }

    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    public void onComplete() {
        complete();
    }

    public void onError(Throwable th) {
        error(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        complete(t);
    }
}
