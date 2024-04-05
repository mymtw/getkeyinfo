package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservableCache */
public final class ObservableCache<T> extends C19145a<T, T> implements Observer<T> {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCache$CacheDisposable */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        public volatile boolean disposed;
        public final Observer<? super T> downstream;
        public long index;
        public C19137a<T> node;
        public int offset;
        public final ObservableCache<T> parent;

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.downstream = observer;
            throw null;
        }

        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                throw null;
            }
        }

        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCache$a */
    public static final class C19137a<T> {
    }
}
