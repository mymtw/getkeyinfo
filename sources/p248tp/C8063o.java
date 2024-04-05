package p248tp;

import p145io.reactivex.disposables.Disposable;
import p287xp.C8338f;

/* renamed from: tp.o */
public interface C8063o<T> extends C8053f<T> {
    boolean isDisposed();

    void setCancellable(C8338f fVar);

    void setDisposable(Disposable disposable);

    boolean tryOnError(Throwable th);
}
