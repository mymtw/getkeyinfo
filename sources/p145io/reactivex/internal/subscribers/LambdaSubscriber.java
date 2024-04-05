package p145io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.subscribers.LambdaSubscriber */
public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T>, Subscription, Disposable {
    private static final long serialVersionUID = -7251123623727029452L;
    public final C8333a onComplete;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onNext;
    public final Consumer<? super Subscription> onSubscribe;

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C8333a aVar, Consumer<? super Subscription> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = aVar;
        this.onSubscribe = consumer3;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.f28541e;
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                C18981a.m32123b(new CompositeException(th, th2));
            }
        } else {
            C18981a.m32123b(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                ((Subscription) get()).cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    public void request(long j) {
        ((Subscription) get()).request(j);
    }
}
