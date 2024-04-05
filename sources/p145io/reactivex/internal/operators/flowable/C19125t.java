package p145io.reactivex.internal.operators.flowable;

import p145io.reactivex.subscribers.C19258a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.t */
public final class C19125t<T, B> extends C19258a<B> {

    /* renamed from: c */
    public final FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> f42695c;

    /* renamed from: d */
    public boolean f42696d;

    public C19125t(FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> flowableWindowBoundarySupplier$WindowBoundaryMainSubscriber) {
        this.f42695c = flowableWindowBoundarySupplier$WindowBoundaryMainSubscriber;
    }

    public final void onComplete() {
        if (!this.f42696d) {
            this.f42696d = true;
            this.f42695c.innerComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f42696d) {
            C18981a.m32123b(th);
            return;
        }
        this.f42696d = true;
        this.f42695c.innerError(th);
    }

    public final void onNext(B b) {
        if (!this.f42696d) {
            this.f42696d = true;
            dispose();
            this.f42695c.innerNext(this);
        }
    }
}
