package p145io.reactivex.internal.operators.single;

import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8071s;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.single.i */
public final class C19207i<T> extends C8071s<T> {

    /* renamed from: b */
    public final T f42938b;

    public C19207i(T t) {
        this.f42938b = t;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        uVar.onSubscribe(EmptyDisposable.INSTANCE);
        uVar.onSuccess(this.f42938b);
    }
}
