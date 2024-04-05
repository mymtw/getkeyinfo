package p145io.reactivex.internal.observers;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.DeferredScalarObserver */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {
    private static final long serialVersionUID = -266195175408988651L;
    public Disposable upstream;

    public DeferredScalarObserver(Observer<? super R> observer) {
        super(observer);
    }

    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    public void onComplete() {
        T t = this.value;
        if (t != null) {
            this.value = null;
            complete(t);
            return;
        }
        complete();
    }

    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    public abstract /* synthetic */ void onNext(T t);

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
