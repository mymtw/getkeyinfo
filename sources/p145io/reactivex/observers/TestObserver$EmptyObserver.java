package p145io.reactivex.observers;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.observers.TestObserver$EmptyObserver */
enum TestObserver$EmptyObserver implements Observer<Object> {
    INSTANCE;

    public void onComplete() {
    }

    public void onError(Throwable th) {
    }

    public void onNext(Object obj) {
    }

    public void onSubscribe(Disposable disposable) {
    }
}
