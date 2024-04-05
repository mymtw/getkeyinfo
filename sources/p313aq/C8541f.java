package p313aq;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;

/* renamed from: aq.f */
public final class C8541f<T> implements C8073u<T> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f18607b;

    /* renamed from: c */
    public final C8073u<? super T> f18608c;

    public C8541f(C8073u uVar, AtomicReference atomicReference) {
        this.f18607b = atomicReference;
        this.f18608c = uVar;
    }

    public final void onError(Throwable th) {
        this.f18608c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f18607b, disposable);
    }

    public final void onSuccess(T t) {
        this.f18608c.onSuccess(t);
    }
}
