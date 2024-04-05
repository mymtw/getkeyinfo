package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8061n;

/* renamed from: io.reactivex.internal.operators.observable.m */
public final class C19172m<T> extends C19145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    public static final class C19173a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f42852b;

        /* renamed from: c */
        public Disposable f42853c;

        public C19173a(Observer<? super T> observer) {
            this.f42852b = observer;
        }

        public final void dispose() {
            this.f42853c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42853c.isDisposed();
        }

        public final void onComplete() {
            this.f42852b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42852b.onError(th);
        }

        public final void onNext(T t) {
            this.f42852b.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42853c, disposable)) {
                this.f42853c = disposable;
                this.f42852b.onSubscribe(this);
            }
        }
    }

    public C19172m(C8061n nVar) {
        super(nVar);
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19173a(observer));
    }
}
