package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8073u;
import p248tp.C8075w;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatWithSingle$ConcatWithSubscriber */
final class FlowableConcatWithSingle$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements C8073u<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    public C8075w<? extends T> other;
    public final AtomicReference<Disposable> otherDisposable = new AtomicReference<>();

    public FlowableConcatWithSingle$ConcatWithSubscriber(C20024c<? super T> cVar, C8075w<? extends T> wVar) {
        super(cVar);
        this.other = wVar;
    }

    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    public void onComplete() {
        this.upstream = SubscriptionHelper.CANCELLED;
        C8075w<? extends T> wVar = this.other;
        this.other = null;
        wVar.mo20655a(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.otherDisposable, disposable);
    }

    public void onSuccess(T t) {
        complete(t);
    }
}
