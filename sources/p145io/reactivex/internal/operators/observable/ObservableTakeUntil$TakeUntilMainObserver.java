package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p514bk.C14088a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver */
final class ObservableTakeUntil$TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = 1418547743690811973L;
    public final Observer<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final ObservableTakeUntil$TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver$OtherObserver */
    public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -8693423678067375039L;

        public OtherObserver() {
        }

        public void onComplete() {
            ObservableTakeUntil$TakeUntilMainObserver.this.otherComplete();
        }

        public void onError(Throwable th) {
            ObservableTakeUntil$TakeUntilMainObserver.this.otherError(th);
        }

        public void onNext(U u) {
            DisposableHelper.dispose(this);
            ObservableTakeUntil$TakeUntilMainObserver.this.otherComplete();
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableTakeUntil$TakeUntilMainObserver(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.otherObserver);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        DisposableHelper.dispose(this.otherObserver);
        C14088a.m21789r(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21793v(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void otherComplete() {
        DisposableHelper.dispose(this.upstream);
        C14088a.m21789r(this.downstream, this, this.error);
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }
}
