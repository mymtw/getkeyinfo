package p145io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8333a;
import p287xp.C8340h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.subscribers.ForEachWhileSubscriber */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T>, Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final C8333a onComplete;
    public final Consumer<? super Throwable> onError;
    public final C8340h<? super T> onNext;

    public ForEachWhileSubscriber(C8340h<? super T> hVar, Consumer<? super Throwable> consumer, C8333a aVar) {
        this.onNext = hVar;
        this.onError = consumer;
        this.onComplete = aVar;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            C18981a.m32123b(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.test(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
