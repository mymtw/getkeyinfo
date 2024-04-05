package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeObserveOn$ObserveOnMaybeObserver */
final class MaybeObserveOn$ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    public final C8058k<? super T> downstream;
    public Throwable error;
    public final C8066r scheduler;
    public T value;

    public MaybeObserveOn$ObserveOnMaybeObserver(C8058k<? super T> kVar, C8066r rVar) {
        this.downstream = kVar;
        this.scheduler = rVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        DisposableHelper.replace(this, this.scheduler.mo20647c(this));
    }

    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.mo20647c(this));
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.value = t;
        DisposableHelper.replace(this, this.scheduler.mo20647c(this));
    }

    public void run() {
        Throwable th = this.error;
        if (th != null) {
            this.error = null;
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            this.value = null;
            this.downstream.onSuccess(t);
            return;
        }
        this.downstream.onComplete();
    }
}
