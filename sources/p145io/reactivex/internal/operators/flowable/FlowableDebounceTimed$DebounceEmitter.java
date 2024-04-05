package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter */
final class FlowableDebounceTimed$DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
    private static final long serialVersionUID = 6812032969491025141L;
    public final long idx;
    public final AtomicBoolean once = new AtomicBoolean();
    public final FlowableDebounceTimed$DebounceTimedSubscriber<T> parent;
    public final T value;

    public FlowableDebounceTimed$DebounceEmitter(T t, long j, FlowableDebounceTimed$DebounceTimedSubscriber<T> flowableDebounceTimed$DebounceTimedSubscriber) {
        this.value = t;
        this.idx = j;
        this.parent = flowableDebounceTimed$DebounceTimedSubscriber;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public void emit() {
        if (this.once.compareAndSet(false, true)) {
            this.parent.emit(this.idx, this.value, this);
        }
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void run() {
        emit();
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }
}
