package p248tp;

import p145io.reactivex.disposables.Disposable;

/* renamed from: tp.k */
public interface C8058k<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
