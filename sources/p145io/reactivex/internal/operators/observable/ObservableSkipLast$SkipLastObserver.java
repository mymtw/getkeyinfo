package p145io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSkipLast$SkipLastObserver */
final class ObservableSkipLast$SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -3807491841935125653L;
    public final Observer<? super T> downstream;
    public final int skip;
    public Disposable upstream;

    public ObservableSkipLast$SkipLastObserver(Observer<? super T> observer, int i) {
        super(i);
        this.downstream = observer;
        this.skip = i;
    }

    public void dispose() {
        this.upstream.dispose();
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.skip == size()) {
            this.downstream.onNext(poll());
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
