package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.maybe.b */
public final class C19134b<R> implements C8073u<R> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f42718b;

    /* renamed from: c */
    public final C8073u<? super R> f42719c;

    public C19134b(C8073u uVar, AtomicReference atomicReference) {
        this.f42718b = atomicReference;
        this.f42719c = uVar;
    }

    public final void onError(Throwable th) {
        this.f42719c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f42718b, disposable);
    }

    public final void onSuccess(R r) {
        this.f42719c.onSuccess(r);
    }
}
