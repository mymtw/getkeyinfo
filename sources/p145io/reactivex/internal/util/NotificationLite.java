package p145io.reactivex.internal.util;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import org.reactivestreams.Subscription;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.util.NotificationLite */
public enum NotificationLite {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.NotificationLite$DisposableNotification */
    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final Disposable upstream;

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("NotificationLite.Disposable[");
            h.append(this.upstream);
            h.append("]");
            return h.toString();
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$ErrorNotification */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        public final Throwable f43032e;

        public ErrorNotification(Throwable th) {
            this.f43032e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return C12965a.m20649a(this.f43032e, ((ErrorNotification) obj).f43032e);
            }
            return false;
        }

        public int hashCode() {
            return this.f43032e.hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("NotificationLite.Error[");
            h.append(this.f43032e);
            h.append("]");
            return h.toString();
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$SubscriptionNotification */
    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final Subscription upstream;

        public SubscriptionNotification(Subscription subscription) {
            this.upstream = subscription;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("NotificationLite.Subscription[");
            h.append(this.upstream);
            h.append("]");
            return h.toString();
        }
    }

    public static <T> boolean accept(Object obj, C20024c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).f43032e);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C20024c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).f43032e);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            cVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f43032e;
    }

    public static Subscription getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f43032e);
            return true;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f43032e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        } else {
            observer.onNext(obj);
            return false;
        }
    }
}
