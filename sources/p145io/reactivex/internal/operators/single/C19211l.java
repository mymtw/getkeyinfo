package p145io.reactivex.internal.operators.single;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.l */
public final class C19211l<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<? extends T> f42944b;

    /* renamed from: c */
    public final C8339g<? super Throwable, ? extends T> f42945c;

    /* renamed from: d */
    public final T f42946d = null;

    /* renamed from: io.reactivex.internal.operators.single.l$a */
    public final class C19212a implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super T> f42947b;

        public C19212a(C8073u<? super T> uVar) {
            this.f42947b = uVar;
        }

        public final void onError(Throwable th) {
            T t;
            C19211l lVar = C19211l.this;
            C8339g<? super Throwable, ? extends T> gVar = lVar.f42945c;
            if (gVar != null) {
                try {
                    t = gVar.apply(th);
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    this.f42947b.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = lVar.f42946d;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f42947b.onError(nullPointerException);
                return;
            }
            this.f42947b.onSuccess(t);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42947b.onSubscribe(disposable);
        }

        public final void onSuccess(T t) {
            this.f42947b.onSuccess(t);
        }
    }

    public C19211l(C8075w wVar, C8339g gVar) {
        this.f42944b = wVar;
        this.f42945c = gVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42944b.mo20655a(new C19212a(uVar));
    }
}
