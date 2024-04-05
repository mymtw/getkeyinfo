package p145io.reactivex.internal.operators.observable;

import java.util.Collection;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8061n;
import p248tp.C8065q;
import p248tp.C8071s;
import p248tp.C8073u;
import p503zp.C13967c;

/* renamed from: io.reactivex.internal.operators.observable.d0 */
public final class C19156d0<T, U extends Collection<? super T>> extends C8071s<U> implements C13967c<U> {

    /* renamed from: b */
    public final C8065q<T> f42819b;

    /* renamed from: c */
    public final Functions.C12957b f42820c = new Functions.C12957b();

    /* renamed from: io.reactivex.internal.operators.observable.d0$a */
    public static final class C19157a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final C8073u<? super U> f42821b;

        /* renamed from: c */
        public U f42822c;

        /* renamed from: d */
        public Disposable f42823d;

        public C19157a(C8073u<? super U> uVar, U u) {
            this.f42821b = uVar;
            this.f42822c = u;
        }

        public final void dispose() {
            this.f42823d.dispose();
        }

        public final boolean isDisposed() {
            return this.f42823d.isDisposed();
        }

        public final void onComplete() {
            U u = this.f42822c;
            this.f42822c = null;
            this.f42821b.onSuccess(u);
        }

        public final void onError(Throwable th) {
            this.f42822c = null;
            this.f42821b.onError(th);
        }

        public final void onNext(T t) {
            this.f42822c.add(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42823d, disposable)) {
                this.f42823d = disposable;
                this.f42821b.onSubscribe(this);
            }
        }
    }

    public C19156d0(C8065q qVar) {
        this.f42819b = qVar;
    }

    /* renamed from: b */
    public final C8061n<U> mo46784b() {
        return new C19152c0(this.f42819b, this.f42820c);
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super U> uVar) {
        try {
            this.f42819b.subscribe(new C19157a(uVar, (Collection) this.f42820c.call()));
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            EmptyDisposable.error(th, (C8073u<?>) uVar);
        }
    }
}
