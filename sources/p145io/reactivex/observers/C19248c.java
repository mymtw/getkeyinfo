package p145io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p568fn.C17782b;

/* renamed from: io.reactivex.observers.c */
public abstract class C19248c<T> implements C8073u<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f43041b = new AtomicReference<>();

    public final void dispose() {
        DisposableHelper.dispose(this.f43041b);
    }

    public final boolean isDisposed() {
        return this.f43041b.get() == DisposableHelper.DISPOSED;
    }

    public final void onSubscribe(Disposable disposable) {
        C17782b.m29874m0(this.f43041b, disposable, getClass());
    }
}
