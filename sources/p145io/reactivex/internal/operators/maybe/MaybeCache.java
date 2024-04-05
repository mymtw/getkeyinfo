package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8057j;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeCache */
public final class MaybeCache<T> extends C8057j<T> implements C8058k<T> {

    /* renamed from: b */
    public T f42704b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        public final C8058k<? super T> downstream;

        public CacheDisposable(C8058k<? super T> kVar, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = kVar;
        }

        public void dispose() {
            if (((MaybeCache) getAndSet((Object) null)) != null) {
                throw null;
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: b */
    public final void mo20625b(C8058k<? super T> kVar) {
        kVar.onSubscribe(new CacheDisposable(kVar, this));
        throw null;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable th) {
        throw null;
    }

    public final void onSubscribe(Disposable disposable) {
    }

    public final void onSuccess(T t) {
        this.f42704b = t;
        throw null;
    }
}
