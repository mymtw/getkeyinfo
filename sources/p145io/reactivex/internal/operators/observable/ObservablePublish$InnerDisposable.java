package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable */
final class ObservablePublish$InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
    private static final long serialVersionUID = -1100270633763673112L;
    public final Observer<? super T> child;

    public ObservablePublish$InnerDisposable(Observer<? super T> observer) {
        this.child = observer;
    }

    public void dispose() {
        Object andSet = getAndSet(this);
        if (andSet != null && andSet != this) {
            C19182s sVar = (C19182s) andSet;
            throw null;
        }
    }

    public boolean isDisposed() {
        return get() == this;
    }

    public void setParent(C19182s<T> sVar) {
        if (!compareAndSet((Object) null, sVar)) {
            sVar.getClass();
            throw null;
        }
    }
}
