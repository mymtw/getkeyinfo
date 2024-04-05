package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8061n;
import p248tp.C8065q;
import p503zp.C13967c;

/* renamed from: io.reactivex.internal.operators.observable.o */
public final class C19176o<T> extends C8048a implements C13967c<T> {

    /* renamed from: b */
    public final C8065q<T> f42856b;

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    public static final class C19177a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final C8050c f42857b;

        /* renamed from: c */
        public Disposable f42858c;

        public C19177a(C8050c cVar) {
            this.f42857b = cVar;
        }

        public final void dispose() {
            this.f42858c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42858c.isDisposed();
        }

        public final void onComplete() {
            this.f42857b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42857b.onError(th);
        }

        public final void onNext(T t) {
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42858c = disposable;
            this.f42857b.onSubscribe(this);
        }
    }

    public C19176o(C8061n nVar) {
        this.f42856b = nVar;
    }

    /* renamed from: b */
    public final C8061n<T> mo46784b() {
        return new C19174n(this.f42856b);
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42856b.subscribe(new C19177a(cVar));
    }
}
