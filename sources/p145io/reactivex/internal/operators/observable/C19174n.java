package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.n */
public final class C19174n<T> extends C19145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    public static final class C19175a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f42854b;

        /* renamed from: c */
        public Disposable f42855c;

        public C19175a(Observer<? super T> observer) {
            this.f42854b = observer;
        }

        public final void dispose() {
            this.f42855c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42855c.isDisposed();
        }

        public final void onComplete() {
            this.f42854b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42854b.onError(th);
        }

        public final void onNext(T t) {
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42855c = disposable;
            this.f42854b.onSubscribe(this);
        }
    }

    public C19174n(C8065q<T> qVar) {
        super(qVar);
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19175a(observer));
    }
}
