package p145io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLast$TakeLastObserver */
final class ObservableTakeLast$TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
    private static final long serialVersionUID = 7240042530241604978L;
    public volatile boolean cancelled;
    public final int count;
    public final Observer<? super T> downstream;
    public Disposable upstream;

    public ObservableTakeLast$TakeLastObserver(Observer<? super T> observer, int i) {
        this.downstream = observer;
        this.count = i;
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.dispose();
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        Observer<? super T> observer = this.downstream;
        while (!this.cancelled) {
            Object poll = poll();
            if (poll != null) {
                observer.onNext(poll);
            } else if (!this.cancelled) {
                observer.onComplete();
                return;
            } else {
                return;
            }
        }
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.count == size()) {
            poll();
        }
        offer(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
