package p145io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableBuffer$BufferSkipObserver */
final class ObservableBuffer$BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
    private static final long serialVersionUID = -8223395059921494546L;
    public final Callable<U> bufferSupplier;
    public final ArrayDeque<U> buffers = new ArrayDeque<>();
    public final int count;
    public final Observer<? super U> downstream;
    public long index;
    public final int skip;
    public Disposable upstream;

    public ObservableBuffer$BufferSkipObserver(Observer<? super U> observer, int i, int i2, Callable<U> callable) {
        this.downstream = observer;
        this.count = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }

    public void dispose() {
        this.upstream.dispose();
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onComplete() {
        while (!this.buffers.isEmpty()) {
            this.downstream.onNext(this.buffers.poll());
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.buffers.clear();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        long j = this.index;
        this.index = 1 + j;
        if (j % ((long) this.skip) == 0) {
            try {
                U call = this.bufferSupplier.call();
                C12965a.m20650b(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                this.buffers.offer((Collection) call);
            } catch (Throwable th) {
                this.buffers.clear();
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
        }
        Iterator<U> it = this.buffers.iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) it.next();
            collection.add(t);
            if (this.count <= collection.size()) {
                it.remove();
                this.downstream.onNext(collection);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
