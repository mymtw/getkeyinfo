package p145io.reactivex.internal.subscriptions;

import android.support.p013v4.media.C0073e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.ProtocolViolationException;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionHelper */
public enum SubscriptionHelper implements Subscription {
    CANCELLED;

    public static boolean cancel(AtomicReference<Subscription> atomicReference) {
        Subscription andSet;
        Subscription subscription = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (subscription == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
        } else if (validate(j)) {
            C19382n.m32703D(atomicLong, j);
            Subscription subscription2 = atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (!setOnce(atomicReference, subscription)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        subscription.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        boolean z;
        do {
            Subscription subscription2 = atomicReference.get();
            z = false;
            if (subscription2 != CANCELLED) {
                while (true) {
                    if (!atomicReference.compareAndSet(subscription2, subscription)) {
                        if (atomicReference.get() != subscription2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (subscription != null) {
                    subscription.cancel();
                }
                return false;
            }
        } while (!z);
        return true;
    }

    public static void reportMoreProduced(long j) {
        C18981a.m32123b(new ProtocolViolationException(C0073e.m205e("More produced than requested: ", j)));
    }

    public static void reportSubscriptionSet() {
        C18981a.m32123b(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        Subscription subscription2;
        boolean z;
        do {
            subscription2 = atomicReference.get();
            z = false;
            if (subscription2 != CANCELLED) {
                while (true) {
                    if (!atomicReference.compareAndSet(subscription2, subscription)) {
                        if (atomicReference.get() != subscription2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (subscription != null) {
                    subscription.cancel();
                }
                return false;
            }
        } while (!z);
        if (subscription2 != null) {
            subscription2.cancel();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        boolean z;
        if (subscription != null) {
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, subscription)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            subscription.cancel();
            if (atomicReference.get() != CANCELLED) {
                reportSubscriptionSet();
            }
            return false;
        }
        throw new NullPointerException("s is null");
    }

    public static boolean validate(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            C18981a.m32123b(new NullPointerException("next is null"));
            return false;
        } else if (subscription == null) {
            return true;
        } else {
            subscription2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        C18981a.m32123b(new IllegalArgumentException(C0073e.m205e("n > 0 required but it was ", j)));
        return false;
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription, long j) {
        if (!setOnce(atomicReference, subscription)) {
            return false;
        }
        subscription.request(j);
        return true;
    }
}
