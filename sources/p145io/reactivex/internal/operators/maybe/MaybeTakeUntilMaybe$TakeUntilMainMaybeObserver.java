package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver */
final class MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = -2187421758664251153L;
    public final C8058k<? super T> downstream;
    public final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver */
    public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Disposable> implements C8058k<U> {
        private static final long serialVersionUID = -1266041316834525931L;
        public final MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver<?, U> parent;

        public TakeUntilOtherMaybeObserver(MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver<?, U> maybeTakeUntilMaybe$TakeUntilMainMaybeObserver) {
            this.parent = maybeTakeUntilMaybe$TakeUntilMainMaybeObserver;
        }

        public void onComplete() {
            this.parent.otherComplete();
        }

        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(Object obj) {
            this.parent.otherComplete();
        }
    }

    public MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver(C8058k<? super T> kVar) {
        this.downstream = kVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.other);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherComplete() {
        if (DisposableHelper.dispose(this)) {
            this.downstream.onComplete();
        }
    }

    public void otherError(Throwable th) {
        if (DisposableHelper.dispose(this)) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }
}
