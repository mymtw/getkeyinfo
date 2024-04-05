package p145io.reactivex.internal.operators.flowable;

import p145io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8060m;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableMaterialize$MaterializeSubscriber */
final class FlowableMaterialize$MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, C8060m<T>> {
    private static final long serialVersionUID = -3740826063558713822L;

    public FlowableMaterialize$MaterializeSubscriber(C20024c<? super C8060m<T>> cVar) {
        super(cVar);
    }

    public void onComplete() {
        complete(C8060m.f17573b);
    }

    public void onError(Throwable th) {
        if (th != null) {
            complete(new C8060m(NotificationLite.error(th)));
            return;
        }
        throw new NullPointerException("error is null");
    }

    public void onNext(T t) {
        this.produced++;
        C20024c<? super R> cVar = this.downstream;
        if (t != null) {
            cVar.onNext(new C8060m(t));
            return;
        }
        throw new NullPointerException("value is null");
    }

    public void onDrop(C8060m<T> mVar) {
        if (NotificationLite.isError(mVar.f17574a)) {
            Object obj = mVar.f17574a;
            C18981a.m32123b(NotificationLite.isError(obj) ? NotificationLite.getError(obj) : null);
        }
    }
}
