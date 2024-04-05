package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer */
final class ObservableTimeout$TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
    private static final long serialVersionUID = 8708641127342403073L;
    public final long idx;
    public final C19149b0 parent;

    public ObservableTimeout$TimeoutConsumer(long j, C19149b0 b0Var) {
        this.idx = j;
        this.parent = b0Var;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.onTimeoutError(this.idx, th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(Object obj) {
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            disposable.dispose();
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
