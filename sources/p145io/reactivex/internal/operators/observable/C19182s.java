package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.s */
public final class C19182s<T> implements Observer<T>, Disposable {
    public final void dispose() {
        throw null;
    }

    public final boolean isDisposed() {
        throw null;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable th) {
        throw null;
    }

    public final void onNext(T t) {
        throw null;
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce((AtomicReference<Disposable>) null, disposable);
    }
}
