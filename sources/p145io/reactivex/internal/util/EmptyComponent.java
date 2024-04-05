package p145io.reactivex.internal.util;

import org.reactivestreams.Subscription;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8050c;
import p248tp.C8056i;
import p248tp.C8058k;
import p248tp.C8073u;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.util.EmptyComponent */
public enum EmptyComponent implements C8056i<Object>, Observer<Object>, C8058k<Object>, C8073u<Object>, C8050c, Subscription, Disposable {
    INSTANCE;

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> C20024c<T> asSubscriber() {
        return INSTANCE;
    }

    public void cancel() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        C18981a.m32123b(th);
    }

    public void onNext(Object obj) {
    }

    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    public void onSuccess(Object obj) {
    }

    public void request(long j) {
    }

    public void onSubscribe(Subscription subscription) {
        subscription.cancel();
    }
}
