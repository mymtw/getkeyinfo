package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8058k;
import p248tp.C8059l;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe$ConcatWithSubscriber */
final class FlowableConcatWithMaybe$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements C8058k<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    public boolean inMaybe;
    public C8059l<? extends T> other;
    public final AtomicReference<Disposable> otherDisposable = new AtomicReference<>();

    public FlowableConcatWithMaybe$ConcatWithSubscriber(C20024c<? super T> cVar, C8059l<? extends T> lVar) {
        super(cVar);
        this.other = lVar;
    }

    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    public void onComplete() {
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        C8059l<? extends T> lVar = this.other;
        this.other = null;
        lVar.mo20624a(this);
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
