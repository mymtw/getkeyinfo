package p145io.reactivex.internal.operators.single;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.e */
public final class C19202e<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42930b;

    /* renamed from: c */
    public final Consumer<? super T> f42931c;

    /* renamed from: io.reactivex.internal.operators.single.e$a */
    public final class C19203a implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super T> f42932b;

        public C19203a(C8073u<? super T> uVar) {
            this.f42932b = uVar;
        }

        public final void onError(Throwable th) {
            this.f42932b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42932b.onSubscribe(disposable);
        }

        public final void onSuccess(T t) {
            try {
                C19202e.this.f42931c.accept(t);
                this.f42932b.onSuccess(t);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.f42932b.onError(th);
            }
        }
    }

    public C19202e(C8075w<T> wVar, Consumer<? super T> consumer) {
        this.f42930b = wVar;
        this.f42931c = consumer;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42930b.mo20655a(new C19203a(uVar));
    }
}
