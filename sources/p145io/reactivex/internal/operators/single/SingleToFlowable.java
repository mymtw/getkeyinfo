package p145io.reactivex.internal.operators.single;

import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p248tp.C8054g;
import p248tp.C8073u;
import p248tp.C8075w;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.single.SingleToFlowable */
public final class SingleToFlowable<T> extends C8054g<T> {

    /* renamed from: c */
    public final C8075w<? extends T> f42909c;

    /* renamed from: io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver */
    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements C8073u<T> {
        private static final long serialVersionUID = 187782011903685568L;
        public Disposable upstream;

        public SingleToFlowableObserver(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            complete(t);
        }
    }

    public SingleToFlowable(C8075w<? extends T> wVar) {
        this.f42909c = wVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42909c.mo20655a(new SingleToFlowableObserver(cVar));
    }
}
