package p145io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver */
final class ObservableBufferBoundary$BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
    private static final long serialVersionUID = -8498650778633225126L;
    public final long index;
    public final ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> parent;

    public ObservableBufferBoundary$BufferCloseObserver(ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> observableBufferBoundary$BufferBoundaryObserver, long j) {
        this.parent = observableBufferBoundary$BufferBoundaryObserver;
        this.index = j;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.close(this, this.index);
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.boundaryError(this, th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(Object obj) {
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            lazySet(disposableHelper);
            disposable.dispose();
            this.parent.close(this, this.index);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
