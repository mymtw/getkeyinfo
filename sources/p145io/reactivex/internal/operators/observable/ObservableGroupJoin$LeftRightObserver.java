package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver */
final class ObservableGroupJoin$LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
    private static final long serialVersionUID = 1883890389173668373L;
    public final boolean isLeft;
    public final C19171l parent;

    public ObservableGroupJoin$LeftRightObserver(C19171l lVar, boolean z) {
        this.parent = lVar;
        this.isLeft = z;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.parent.innerComplete(this);
    }

    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    public void onNext(Object obj) {
        this.parent.innerValue(this.isLeft, obj);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
