package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.observers.C19247b;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.e0 */
public final class C19159e0<T, B> extends C19247b<B> {

    /* renamed from: c */
    public final ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> f42826c;

    /* renamed from: d */
    public boolean f42827d;

    public C19159e0(ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> observableWindowBoundary$WindowBoundaryMainObserver) {
        this.f42826c = observableWindowBoundary$WindowBoundaryMainObserver;
    }

    public final void onComplete() {
        if (!this.f42827d) {
            this.f42827d = true;
            this.f42826c.innerComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f42827d) {
            C18981a.m32123b(th);
            return;
        }
        this.f42827d = true;
        this.f42826c.innerError(th);
    }

    public final void onNext(B b) {
        if (!this.f42827d) {
            this.f42826c.innerNext();
        }
    }
}
