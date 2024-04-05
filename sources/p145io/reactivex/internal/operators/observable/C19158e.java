package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p248tp.C8061n;
import p287xp.C8333a;
import p313aq.C8539d;

/* renamed from: io.reactivex.internal.operators.observable.e */
public final class C19158e<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final Consumer<? super Disposable> f42824c;

    /* renamed from: d */
    public final C8333a f42825d;

    public C19158e(C8061n<T> nVar, Consumer<? super Disposable> consumer, C8333a aVar) {
        super(nVar);
        this.f42824c = consumer;
        this.f42825d = aVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C8539d(observer, this.f42824c, this.f42825d));
    }
}
