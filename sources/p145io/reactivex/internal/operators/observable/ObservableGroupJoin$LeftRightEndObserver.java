package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver */
final class ObservableGroupJoin$LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
    private static final long serialVersionUID = 1883890389173668373L;
    public final int index;
    public final boolean isLeft;
    public final C19171l parent;

    public ObservableGroupJoin$LeftRightEndObserver(C19171l lVar, boolean z, int i) {
        this.parent = lVar;
        this.isLeft = z;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.parent.innerClose(this.isLeft, this);
    }

    public void onError(Throwable th) {
        this.parent.innerCloseError(th);
    }

    public void onNext(Object obj) {
        if (DisposableHelper.dispose(this)) {
            this.parent.innerClose(this.isLeft, this);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
