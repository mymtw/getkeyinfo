package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeOnMaybeObserver */
final class MaybeSubscribeOn$SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 8571289934935992137L;
    public final C8058k<? super T> downstream;
    public final SequentialDisposable task = new SequentialDisposable();

    public MaybeSubscribeOn$SubscribeOnMaybeObserver(C8058k<? super T> kVar) {
        this.downstream = kVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        this.task.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
