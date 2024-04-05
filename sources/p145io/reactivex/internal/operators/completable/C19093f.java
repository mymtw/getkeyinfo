package p145io.reactivex.internal.operators.completable;

import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.completable.f */
public final class C19093f<T> extends C8048a {

    /* renamed from: b */
    public final C8075w<T> f42613b;

    /* renamed from: io.reactivex.internal.operators.completable.f$a */
    public static final class C19094a<T> implements C8073u<T> {

        /* renamed from: b */
        public final C8050c f42614b;

        public C19094a(C8050c cVar) {
            this.f42614b = cVar;
        }

        public final void onError(Throwable th) {
            this.f42614b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42614b.onSubscribe(disposable);
        }

        public final void onSuccess(T t) {
            this.f42614b.onComplete();
        }
    }

    public C19093f(C8071s sVar) {
        this.f42613b = sVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42613b.mo20655a(new C19094a(cVar));
    }
}
