package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable */
final class ObservableReplay$InnerDisposable<T> extends AtomicInteger implements Disposable {
    private static final long serialVersionUID = 2728361546769921047L;
    public volatile boolean cancelled;
    public final Observer<? super T> child;
    public Object index;
    public final ObservableReplay$ReplayObserver<T> parent;

    public ObservableReplay$InnerDisposable(ObservableReplay$ReplayObserver<T> observableReplay$ReplayObserver, Observer<? super T> observer) {
        this.parent = observableReplay$ReplayObserver;
        this.child = observer;
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.parent.remove(this);
            this.index = null;
        }
    }

    public <U> U index() {
        return this.index;
    }

    public boolean isDisposed() {
        return this.cancelled;
    }
}
