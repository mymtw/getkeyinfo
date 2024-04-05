package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.single.g */
public final class C19205g<R> implements C8058k<R> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f42935b;

    /* renamed from: c */
    public final C8058k<? super R> f42936c;

    public C19205g(C8058k kVar, AtomicReference atomicReference) {
        this.f42935b = atomicReference;
        this.f42936c = kVar;
    }

    public final void onComplete() {
        this.f42936c.onComplete();
    }

    public final void onError(Throwable th) {
        this.f42936c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f42935b, disposable);
    }

    public final void onSuccess(R r) {
        this.f42936c.onSuccess(r);
    }
}
