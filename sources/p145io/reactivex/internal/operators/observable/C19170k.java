package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p248tp.C8061n;

/* renamed from: io.reactivex.internal.operators.observable.k */
public final class C19170k<K, T> extends C8061n<Object> {

    /* renamed from: b */
    public final Object f42850b;

    /* renamed from: c */
    public final ObservableGroupBy$State<T, K> f42851c;

    public C19170k(K k, ObservableGroupBy$State<T, K> observableGroupBy$State) {
        this.f42850b = k;
        this.f42851c = observableGroupBy$State;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42851c.subscribe(observer);
    }
}
