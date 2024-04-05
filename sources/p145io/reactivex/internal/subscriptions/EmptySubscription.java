package p145io.reactivex.internal.subscriptions;

import p503zp.C13970f;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.subscriptions.EmptySubscription */
public enum EmptySubscription implements C13970f<Object> {
    INSTANCE;

    public static void complete(C20024c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, C20024c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
