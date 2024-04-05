package p145io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p503zp.C13970f;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.subscriptions.ScalarSubscription */
public final class ScalarSubscription<T> extends AtomicInteger implements C13970f<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final C20024c<? super T> subscriber;
    public final T value;

    public ScalarSubscription(C20024c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            C20024c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
