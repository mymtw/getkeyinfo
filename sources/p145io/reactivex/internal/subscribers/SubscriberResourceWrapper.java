package p145io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.subscribers.SubscriberResourceWrapper */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements C8056i<T>, Disposable, Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    public final C20024c<? super T> downstream;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(C20024c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        dispose();
    }

    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
