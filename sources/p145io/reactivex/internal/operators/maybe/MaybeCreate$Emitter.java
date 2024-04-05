package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.CancellableDisposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p287xp.C8338f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeCreate$Emitter */
final class MaybeCreate$Emitter<T> extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -2467358622224974244L;
    public final C8058k<? super T> downstream;

    public MaybeCreate$Emitter(C8058k<? super T> kVar) {
        this.downstream = kVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        Disposable disposable;
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper && (disposable = (Disposable) getAndSet(disposableHelper)) != disposableHelper) {
            try {
                this.downstream.onComplete();
            } finally {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        }
    }

    public void onError(Throwable th) {
        if (!tryOnError(th)) {
            C18981a.m32123b(th);
        }
    }

    public void onSuccess(T t) {
        Disposable disposable;
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj != disposableHelper && (disposable = (Disposable) getAndSet(disposableHelper)) != disposableHelper) {
            if (t == null) {
                try {
                    this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    throw th;
                }
            } else {
                this.downstream.onSuccess(t);
            }
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }

    public void setCancellable(C8338f fVar) {
        setDisposable(new CancellableDisposable(fVar));
    }

    public void setDisposable(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }

    public String toString() {
        return String.format("%s{%s}", new Object[]{MaybeCreate$Emitter.class.getSimpleName(), super.toString()});
    }

    public boolean tryOnError(Throwable th) {
        Disposable disposable;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj == disposableHelper || (disposable = (Disposable) getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        try {
            this.downstream.onError(th);
        } finally {
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }
}
