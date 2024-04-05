package p145io.reactivex.internal.operators.single;

import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p402n9.C13090j;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.d */
public final class C19200d<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42925b;

    /* renamed from: c */
    public final Consumer<? super Disposable> f42926c;

    /* renamed from: io.reactivex.internal.operators.single.d$a */
    public static final class C19201a<T> implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super T> f42927b;

        /* renamed from: c */
        public final Consumer<? super Disposable> f42928c;

        /* renamed from: d */
        public boolean f42929d;

        public C19201a(C8073u<? super T> uVar, Consumer<? super Disposable> consumer) {
            this.f42927b = uVar;
            this.f42928c = consumer;
        }

        public final void onError(Throwable th) {
            if (this.f42929d) {
                C18981a.m32123b(th);
            } else {
                this.f42927b.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            try {
                this.f42928c.accept(disposable);
                this.f42927b.onSubscribe(disposable);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.f42929d = true;
                disposable.dispose();
                EmptyDisposable.error(th, (C8073u<?>) this.f42927b);
            }
        }

        public final void onSuccess(T t) {
            if (!this.f42929d) {
                this.f42927b.onSuccess(t);
            }
        }
    }

    public C19200d(SingleSubscribeOn singleSubscribeOn, C13090j jVar) {
        this.f42925b = singleSubscribeOn;
        this.f42926c = jVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42925b.mo20655a(new C19201a(uVar, this.f42926c));
    }
}
