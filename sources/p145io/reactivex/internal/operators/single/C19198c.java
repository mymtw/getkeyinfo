package p145io.reactivex.internal.operators.single;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.c */
public final class C19198c<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42921b;

    /* renamed from: c */
    public final Consumer<? super Throwable> f42922c;

    /* renamed from: io.reactivex.internal.operators.single.c$a */
    public final class C19199a implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super T> f42923b;

        public C19199a(C8073u<? super T> uVar) {
            this.f42923b = uVar;
        }

        public final void onError(Throwable th) {
            try {
                C19198c.this.f42922c.accept(th);
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                th = new CompositeException(th, th2);
            }
            this.f42923b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42923b.onSubscribe(disposable);
        }

        public final void onSuccess(T t) {
            this.f42923b.onSuccess(t);
        }
    }

    public C19198c(C8075w<T> wVar, Consumer<? super Throwable> consumer) {
        this.f42921b = wVar;
        this.f42922c = consumer;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42921b.mo20655a(new C19199a(uVar));
    }
}
