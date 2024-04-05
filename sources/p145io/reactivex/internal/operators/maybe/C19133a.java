package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.a */
public final class C19133a<T> implements C8058k<T> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f42716b;

    /* renamed from: c */
    public final C8058k<? super T> f42717c;

    public C19133a(C8058k kVar, AtomicReference atomicReference) {
        this.f42716b = atomicReference;
        this.f42717c = kVar;
    }

    public final void onComplete() {
        this.f42717c.onComplete();
    }

    public final void onError(Throwable th) {
        this.f42717c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f42716b, disposable);
    }

    public final void onSuccess(T t) {
        this.f42717c.onSuccess(t);
    }
}
