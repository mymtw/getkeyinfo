package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable$ConcatWithSubscriber */
final class FlowableConcatWithCompletable$ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements C8056i<T>, C8050c, Subscription {
    private static final long serialVersionUID = -7346385463600070225L;
    public final C20024c<? super T> downstream;
    public boolean inCompletable;
    public C8052e other;
    public Subscription upstream;

    public FlowableConcatWithCompletable$ConcatWithSubscriber(C20024c<? super T> cVar, C8052e eVar) {
        this.downstream = cVar;
        this.other = eVar;
    }

    public void cancel() {
        this.upstream.cancel();
        DisposableHelper.dispose(this);
    }

    public void onComplete() {
        if (this.inCompletable) {
            this.downstream.onComplete();
            return;
        }
        this.inCompletable = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        C8052e eVar = this.other;
        this.other = null;
        eVar.mo20607a(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.upstream.request(j);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
