package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p287xp.C8334b;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.observers.BiConsumerSingleObserver */
public final class BiConsumerSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = 4943102778943297569L;
    public final C8334b<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(C8334b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.mo20917a();
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            C18981a.m32123b(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.mo20917a();
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            C18981a.m32123b(th);
        }
    }
}
