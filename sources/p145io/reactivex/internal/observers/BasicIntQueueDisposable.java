package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import p503zp.C13968d;

/* renamed from: io.reactivex.internal.observers.BasicIntQueueDisposable */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements C13968d<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public abstract /* synthetic */ T poll() throws Exception;

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
