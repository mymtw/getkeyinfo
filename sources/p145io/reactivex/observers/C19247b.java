package p145io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p568fn.C17782b;

/* renamed from: io.reactivex.observers.b */
public abstract class C19247b<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f43040b = new AtomicReference<>();

    public final void dispose() {
        DisposableHelper.dispose(this.f43040b);
    }

    public final boolean isDisposed() {
        return this.f43040b.get() == DisposableHelper.DISPOSED;
    }

    public final void onSubscribe(Disposable disposable) {
        C17782b.m29874m0(this.f43040b, disposable, getClass());
    }
}
