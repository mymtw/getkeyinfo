package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver */
final class SingleTakeUntil$TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -622603812305745221L;
    public final C8073u<? super T> downstream;
    public final SingleTakeUntil$TakeUntilOtherSubscriber other = new SingleTakeUntil$TakeUntilOtherSubscriber(this);

    public SingleTakeUntil$TakeUntilMainObserver(C8073u<? super T> uVar) {
        this.downstream = uVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        this.other.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onError(Throwable th) {
        this.other.dispose();
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable == disposableHelper || ((Disposable) getAndSet(disposableHelper)) == disposableHelper) {
            C18981a.m32123b(th);
        } else {
            this.downstream.onError(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        this.other.dispose();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (((Disposable) getAndSet(disposableHelper)) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherError(Throwable th) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable2 == disposableHelper || (disposable = (Disposable) getAndSet(disposableHelper)) == disposableHelper) {
            C18981a.m32123b(th);
            return;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        this.downstream.onError(th);
    }
}
