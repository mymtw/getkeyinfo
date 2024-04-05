package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8073u;
import p248tp.C8075w;
import p313aq.C8541f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleDelayWithPublisher$OtherSubscriber */
final class SingleDelayWithPublisher$OtherSubscriber<T, U> extends AtomicReference<Disposable> implements C8056i<U>, Disposable {
    private static final long serialVersionUID = -8565274649390031272L;
    public boolean done;
    public final C8073u<? super T> downstream;
    public final C8075w<T> source;
    public Subscription upstream;

    public SingleDelayWithPublisher$OtherSubscriber(C8073u<? super T> uVar, C8075w<T> wVar) {
        this.downstream = uVar;
        this.source = wVar;
    }

    public void dispose() {
        this.upstream.cancel();
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.source.mo20655a(new C8541f(this.downstream, this));
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
    }

    public void onNext(U u) {
        this.upstream.cancel();
        onComplete();
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
