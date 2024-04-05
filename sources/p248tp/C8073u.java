package p248tp;

import p145io.reactivex.disposables.Disposable;

/* renamed from: tp.u */
public interface C8073u<T> {
    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
