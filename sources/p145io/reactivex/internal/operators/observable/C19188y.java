package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8057j;
import p248tp.C8058k;
import p248tp.C8061n;
import p248tp.C8065q;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.y */
public final class C19188y<T> extends C8057j<T> {

    /* renamed from: b */
    public final C8065q<T> f42876b;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    public static final class C19189a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final C8058k<? super T> f42877b;

        /* renamed from: c */
        public Disposable f42878c;

        /* renamed from: d */
        public T f42879d;

        /* renamed from: e */
        public boolean f42880e;

        public C19189a(C8058k<? super T> kVar) {
            this.f42877b = kVar;
        }

        public final void dispose() {
            this.f42878c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42878c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f42880e) {
                this.f42880e = true;
                T t = this.f42879d;
                this.f42879d = null;
                if (t == null) {
                    this.f42877b.onComplete();
                } else {
                    this.f42877b.onSuccess(t);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f42880e) {
                C18981a.m32123b(th);
                return;
            }
            this.f42880e = true;
            this.f42877b.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f42880e) {
                if (this.f42879d != null) {
                    this.f42880e = true;
                    this.f42878c.dispose();
                    this.f42877b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f42879d = t;
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42878c, disposable)) {
                this.f42878c = disposable;
                this.f42877b.onSubscribe(this);
            }
        }
    }

    public C19188y(C8061n nVar) {
        this.f42876b = nVar;
    }

    /* renamed from: b */
    public final void mo20625b(C8058k<? super T> kVar) {
        this.f42876b.subscribe(new C19189a(kVar));
    }
}
