package p145io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p503zp.C13970f;

/* renamed from: io.reactivex.internal.subscriptions.BasicIntQueueSubscription */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements C13970f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ T poll() throws Exception;

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
