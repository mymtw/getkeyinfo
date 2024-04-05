package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.u */
public final class C19184u<T> implements Observer<Object> {

    /* renamed from: b */
    public final ObservableSampleWithObservable$SampleMainObserver<T> f42863b;

    public C19184u(ObservableSampleWithObservable$SampleMainObserver<T> observableSampleWithObservable$SampleMainObserver) {
        this.f42863b = observableSampleWithObservable$SampleMainObserver;
    }

    public final void onComplete() {
        this.f42863b.complete();
    }

    public final void onError(Throwable th) {
        this.f42863b.error(th);
    }

    public final void onNext(Object obj) {
        this.f42863b.run();
    }

    public final void onSubscribe(Disposable disposable) {
        this.f42863b.setOther(disposable);
    }
}
