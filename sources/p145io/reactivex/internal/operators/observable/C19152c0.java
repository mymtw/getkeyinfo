package p145io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.c0 */
public final class C19152c0<T, U extends Collection<? super T>> extends C19145a<T, U> {

    /* renamed from: c */
    public final Callable<U> f42804c;

    /* renamed from: io.reactivex.internal.operators.observable.c0$a */
    public static final class C19153a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super U> f42805b;

        /* renamed from: c */
        public Disposable f42806c;

        /* renamed from: d */
        public U f42807d;

        public C19153a(Observer<? super U> observer, U u) {
            this.f42805b = observer;
            this.f42807d = u;
        }

        public final void dispose() {
            this.f42806c.dispose();
        }

        public final boolean isDisposed() {
            return this.f42806c.isDisposed();
        }

        public final void onComplete() {
            U u = this.f42807d;
            this.f42807d = null;
            this.f42805b.onNext(u);
            this.f42805b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42807d = null;
            this.f42805b.onError(th);
        }

        public final void onNext(T t) {
            this.f42807d.add(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42806c, disposable)) {
                this.f42806c = disposable;
                this.f42805b.onSubscribe(this);
            }
        }
    }

    public C19152c0(C8065q qVar, Functions.C12957b bVar) {
        super(qVar);
        this.f42804c = bVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super U> observer) {
        try {
            U call = this.f42804c.call();
            C12965a.m20650b(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f42793b.subscribe(new C19153a(observer, (Collection) call));
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            EmptyDisposable.error(th, (Observer<?>) observer);
        }
    }
}
