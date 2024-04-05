package p145io.reactivex.internal.operators.observable;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import p010a9.C0048b;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8061n;
import p287xp.C8335c;
import p736cq.C18981a;
import p764pq.C20057i;

/* renamed from: io.reactivex.internal.operators.observable.g0 */
public final class C19163g0<T, U, V> extends C8061n<V> {

    /* renamed from: b */
    public final C8061n<? extends T> f42832b;

    /* renamed from: c */
    public final Iterable<U> f42833c;

    /* renamed from: d */
    public final C8335c<? super T, ? super U, ? extends V> f42834d;

    /* renamed from: io.reactivex.internal.operators.observable.g0$a */
    public static final class C19164a<T, U, V> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super V> f42835b;

        /* renamed from: c */
        public final Iterator<U> f42836c;

        /* renamed from: d */
        public final C8335c<? super T, ? super U, ? extends V> f42837d;

        /* renamed from: e */
        public Disposable f42838e;

        /* renamed from: f */
        public boolean f42839f;

        public C19164a(Observer<? super V> observer, Iterator<U> it, C8335c<? super T, ? super U, ? extends V> cVar) {
            this.f42835b = observer;
            this.f42836c = it;
            this.f42837d = cVar;
        }

        public final void dispose() {
            this.f42838e.dispose();
        }

        public final boolean isDisposed() {
            return this.f42838e.isDisposed();
        }

        public final void onComplete() {
            if (!this.f42839f) {
                this.f42839f = true;
                this.f42835b.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.f42839f) {
                C18981a.m32123b(th);
                return;
            }
            this.f42839f = true;
            this.f42835b.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f42839f) {
                try {
                    U next = this.f42836c.next();
                    C12965a.m20650b(next, "The iterator returned a null value");
                    try {
                        Object apply = this.f42837d.apply(t, next);
                        C12965a.m20650b(apply, "The zipper function returned a null value");
                        this.f42835b.onNext(apply);
                        try {
                            if (!this.f42836c.hasNext()) {
                                this.f42839f = true;
                                this.f42838e.dispose();
                                this.f42835b.onComplete();
                            }
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            this.f42839f = true;
                            this.f42838e.dispose();
                            this.f42835b.onError(th);
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        this.f42839f = true;
                        this.f42838e.dispose();
                        this.f42835b.onError(th2);
                    }
                } catch (Throwable th3) {
                    C19421p.m32940h0(th3);
                    this.f42839f = true;
                    this.f42838e.dispose();
                    this.f42835b.onError(th3);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42838e, disposable)) {
                this.f42838e = disposable;
                this.f42835b.onSubscribe(this);
            }
        }
    }

    public C19163g0(C8061n nVar, C20057i iVar, C0048b bVar) {
        this.f42832b = nVar;
        this.f42833c = iVar;
        this.f42834d = bVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super V> observer) {
        try {
            Iterator<U> it = this.f42833c.iterator();
            C12965a.m20650b(it, "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete((Observer<?>) observer);
                } else {
                    this.f42832b.subscribe(new C19164a(observer, it, this.f42834d));
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                EmptyDisposable.error(th, (Observer<?>) observer);
            }
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            EmptyDisposable.error(th2, (Observer<?>) observer);
        }
    }
}
