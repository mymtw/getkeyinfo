package p145io.reactivex.internal.operators.completable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.observable.C19179q;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.completable.d */
public final class C19090d<T> extends C8048a {

    /* renamed from: b */
    public final C8065q<T> f42610b;

    /* renamed from: io.reactivex.internal.operators.completable.d$a */
    public static final class C19091a<T> implements Observer<T> {

        /* renamed from: b */
        public final C8050c f42611b;

        public C19091a(C8050c cVar) {
            this.f42611b = cVar;
        }

        public final void onComplete() {
            this.f42611b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42611b.onError(th);
        }

        public final void onNext(T t) {
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42611b.onSubscribe(disposable);
        }
    }

    public C19090d(C19179q qVar) {
        this.f42610b = qVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42610b.subscribe(new C19091a(cVar));
    }
}
