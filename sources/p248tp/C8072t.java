package p248tp;

import p287xp.C8338f;

/* renamed from: tp.t */
public interface C8072t<T> {
    boolean isDisposed();

    void onSuccess(T t);

    void setCancellable(C8338f fVar);

    boolean tryOnError(Throwable th);
}
