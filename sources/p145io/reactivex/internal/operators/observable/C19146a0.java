package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.a0 */
public final class C19146a0<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final long f42794c = 1;

    /* renamed from: io.reactivex.internal.operators.observable.a0$a */
    public static final class C19147a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f42795b;

        /* renamed from: c */
        public long f42796c;

        /* renamed from: d */
        public Disposable f42797d;

        public C19147a(Observer<? super T> observer, long j) {
            this.f42795b = observer;
            this.f42796c = j;
        }

        public final void dispose() {
            this.f42797d.dispose();
        }

        public final boolean isDisposed() {
            return this.f42797d.isDisposed();
        }

        public final void onComplete() {
            this.f42795b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42795b.onError(th);
        }

        public final void onNext(T t) {
            long j = this.f42796c;
            if (j != 0) {
                this.f42796c = j - 1;
            } else {
                this.f42795b.onNext(t);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42797d, disposable)) {
                this.f42797d = disposable;
                this.f42795b.onSubscribe(this);
            }
        }
    }

    public C19146a0(C8065q qVar) {
        super(qVar);
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19147a(observer, this.f42794c));
    }
}
