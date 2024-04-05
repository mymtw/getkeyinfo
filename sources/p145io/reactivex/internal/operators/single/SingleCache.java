package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8071s;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.single.SingleCache */
public final class SingleCache<T> extends C8071s<T> implements C8073u<T> {

    /* renamed from: io.reactivex.internal.operators.single.SingleCache$CacheDisposable */
    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        public final C8073u<? super T> downstream;
        public final SingleCache<T> parent;

        public CacheDisposable(C8073u<? super T> uVar, SingleCache<T> singleCache) {
            this.downstream = uVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }
}
