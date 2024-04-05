package p145io.reactivex.internal.operators.flowable;

import p145io.reactivex.subscribers.C19258a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.s */
public final class C19124s<T, B> extends C19258a<B> {

    /* renamed from: c */
    public final FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> f42693c;

    /* renamed from: d */
    public boolean f42694d;

    public C19124s(FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> flowableWindowBoundary$WindowBoundaryMainSubscriber) {
        this.f42693c = flowableWindowBoundary$WindowBoundaryMainSubscriber;
    }

    public final void onComplete() {
        if (!this.f42694d) {
            this.f42694d = true;
            this.f42693c.innerComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f42694d) {
            C18981a.m32123b(th);
            return;
        }
        this.f42694d = true;
        this.f42693c.innerError(th);
    }

    public final void onNext(B b) {
        if (!this.f42694d) {
            this.f42693c.innerNext();
        }
    }
}
