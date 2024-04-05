package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p248tp.C8061n;
import p503zp.C13971g;

/* renamed from: io.reactivex.internal.operators.observable.p */
public final class C19178p<T> extends C8061n<T> implements C13971g<T> {

    /* renamed from: b */
    public final T f42859b;

    public C19178p(T t) {
        this.f42859b = t;
    }

    public final T call() {
        return this.f42859b;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, this.f42859b);
        observer.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }
}
