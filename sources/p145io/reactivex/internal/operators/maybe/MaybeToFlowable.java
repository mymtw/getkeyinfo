package p145io.reactivex.internal.operators.maybe;

import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p248tp.C8054g;
import p248tp.C8058k;
import p248tp.C8059l;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToFlowable */
public final class MaybeToFlowable<T> extends C8054g<T> {

    /* renamed from: c */
    public final C8059l<T> f42714c;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeToFlowable$MaybeToFlowableSubscriber */
    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements C8058k<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        public Disposable upstream;

        public MaybeToFlowableSubscriber(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
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

    public MaybeToFlowable(C8059l<T> lVar) {
        this.f42714c = lVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42714c.mo20624a(new MaybeToFlowableSubscriber(cVar));
    }
}
