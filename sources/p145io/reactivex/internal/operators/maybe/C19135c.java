package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.maybe.c */
public final class C19135c<R> implements C8073u<R> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f42720b;

    /* renamed from: c */
    public final C8058k<? super R> f42721c;

    public C19135c(C8058k kVar, AtomicReference atomicReference) {
        this.f42720b = atomicReference;
        this.f42721c = kVar;
    }

    public final void onError(Throwable th) {
        this.f42721c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f42720b, disposable);
    }

    public final void onSuccess(R r) {
        this.f42721c.onSuccess(r);
    }
}
