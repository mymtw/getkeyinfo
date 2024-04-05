package p145io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8061n;
import p248tp.C8065q;
import p248tp.C8071s;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.z */
public final class C19190z<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8065q<? extends T> f42881b;

    /* renamed from: c */
    public final T f42882c = null;

    /* renamed from: io.reactivex.internal.operators.observable.z$a */
    public static final class C19191a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final C8073u<? super T> f42883b;

        /* renamed from: c */
        public final T f42884c;

        /* renamed from: d */
        public Disposable f42885d;

        /* renamed from: e */
        public T f42886e;

        /* renamed from: f */
        public boolean f42887f;

        public C19191a(C8073u<? super T> uVar, T t) {
            this.f42883b = uVar;
            this.f42884c = t;
        }

        public final void dispose() {
            this.f42885d.dispose();
        }

        public final boolean isDisposed() {
            return this.f42885d.isDisposed();
        }

        public final void onComplete() {
            if (!this.f42887f) {
                this.f42887f = true;
                T t = this.f42886e;
                this.f42886e = null;
                if (t == null) {
                    t = this.f42884c;
                }
                if (t != null) {
                    this.f42883b.onSuccess(t);
                } else {
                    this.f42883b.onError(new NoSuchElementException());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f42887f) {
                C18981a.m32123b(th);
                return;
            }
            this.f42887f = true;
            this.f42883b.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f42887f) {
                if (this.f42886e != null) {
                    this.f42887f = true;
                    this.f42885d.dispose();
                    this.f42883b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f42886e = t;
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42885d, disposable)) {
                this.f42885d = disposable;
                this.f42883b.onSubscribe(this);
            }
        }
    }

    public C19190z(C8061n nVar) {
        this.f42881b = nVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42881b.subscribe(new C19191a(uVar, this.f42882c));
    }
}
