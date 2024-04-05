package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.observers.C19247b;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.f0 */
public final class C19161f0<T, B> extends C19247b<B> {

    /* renamed from: c */
    public final ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> f42829c;

    /* renamed from: d */
    public boolean f42830d;

    public C19161f0(ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> observableWindowBoundarySupplier$WindowBoundaryMainObserver) {
        this.f42829c = observableWindowBoundarySupplier$WindowBoundaryMainObserver;
    }

    public final void onComplete() {
        if (!this.f42830d) {
            this.f42830d = true;
            this.f42829c.innerComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f42830d) {
            C18981a.m32123b(th);
            return;
        }
        this.f42830d = true;
        this.f42829c.innerError(th);
    }

    public final void onNext(B b) {
        if (!this.f42830d) {
            this.f42830d = true;
            dispose();
            this.f42829c.innerNext(this);
        }
    }
}
