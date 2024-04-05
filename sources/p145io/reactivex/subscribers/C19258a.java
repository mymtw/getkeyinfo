package p145io.reactivex.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p568fn.C17782b;

/* renamed from: io.reactivex.subscribers.a */
public abstract class C19258a<T> implements C8056i<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Subscription> f43119b = new AtomicReference<>();

    public final void dispose() {
        SubscriptionHelper.cancel(this.f43119b);
    }

    public final boolean isDisposed() {
        return this.f43119b.get() == SubscriptionHelper.CANCELLED;
    }

    public final void onSubscribe(Subscription subscription) {
        boolean z;
        boolean z2;
        AtomicReference<Subscription> atomicReference = this.f43119b;
        Class<?> cls = getClass();
        if (subscription != null) {
            while (true) {
                z = false;
                if (!atomicReference.compareAndSet((Object) null, subscription)) {
                    if (atomicReference.get() != null) {
                        z2 = false;
                        break;
                    }
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                subscription.cancel();
                if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
                    C17782b.m29871k0(cls);
                }
            } else {
                z = true;
            }
            if (z) {
                this.f43119b.get().request(Long.MAX_VALUE);
                return;
            }
            return;
        }
        throw new NullPointerException("next is null");
    }
}
