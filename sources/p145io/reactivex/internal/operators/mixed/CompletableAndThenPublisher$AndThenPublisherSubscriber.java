package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8050c;
import p248tp.C8056i;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.mixed.CompletableAndThenPublisher$AndThenPublisherSubscriber */
final class CompletableAndThenPublisher$AndThenPublisherSubscriber<R> extends AtomicReference<Subscription> implements C8056i<R>, C8050c, Subscription {
    private static final long serialVersionUID = -8948264376121066672L;
    public final C20024c<? super R> downstream;
    public C20023b<? extends R> other;
    public final AtomicLong requested = new AtomicLong();
    public Disposable upstream;

    public CompletableAndThenPublisher$AndThenPublisherSubscriber(C20024c<? super R> cVar, C20023b<? extends R> bVar) {
        this.downstream = cVar;
        this.other = bVar;
    }

    public void cancel() {
        this.upstream.dispose();
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        C20023b<? extends R> bVar = this.other;
        if (bVar == null) {
            this.downstream.onComplete();
            return;
        }
        this.other = null;
        bVar.subscribe(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this, this.requested, j);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this, this.requested, subscription);
    }
}
