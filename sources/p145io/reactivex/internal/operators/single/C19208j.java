package p145io.reactivex.internal.operators.single;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.j */
public final class C19208j<T, R> extends C8071s<R> {

    /* renamed from: b */
    public final C8075w<? extends T> f42939b;

    /* renamed from: c */
    public final C8339g<? super T, ? extends R> f42940c;

    /* renamed from: io.reactivex.internal.operators.single.j$a */
    public static final class C19209a<T, R> implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super R> f42941b;

        /* renamed from: c */
        public final C8339g<? super T, ? extends R> f42942c;

        public C19209a(C8073u<? super R> uVar, C8339g<? super T, ? extends R> gVar) {
            this.f42941b = uVar;
            this.f42942c = gVar;
        }

        public final void onError(Throwable th) {
            this.f42941b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42941b.onSubscribe(disposable);
        }

        public final void onSuccess(T t) {
            try {
                Object apply = this.f42942c.apply(t);
                C12965a.m20650b(apply, "The mapper function returned a null value.");
                this.f42941b.onSuccess(apply);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                onError(th);
            }
        }
    }

    public C19208j(C8075w<? extends T> wVar, C8339g<? super T, ? extends R> gVar) {
        this.f42939b = wVar;
        this.f42940c = gVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super R> uVar) {
        this.f42939b.mo20655a(new C19209a(uVar, this.f42940c));
    }
}
