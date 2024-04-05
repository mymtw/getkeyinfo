package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMap */
public final class SingleFlatMap<T, R> extends C8071s<R> {

    /* renamed from: b */
    public final C8075w<? extends T> f42896b;

    /* renamed from: c */
    public final C8339g<? super T, ? extends C8075w<? extends R>> f42897c;

    /* renamed from: io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback */
    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
        private static final long serialVersionUID = 3258103020495908596L;
        public final C8073u<? super R> downstream;
        public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;

        /* renamed from: io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback$a */
        public static final class C19193a<R> implements C8073u<R> {

            /* renamed from: b */
            public final AtomicReference<Disposable> f42898b;

            /* renamed from: c */
            public final C8073u<? super R> f42899c;

            public C19193a(C8073u uVar, AtomicReference atomicReference) {
                this.f42898b = atomicReference;
                this.f42899c = uVar;
            }

            public final void onError(Throwable th) {
                this.f42899c.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this.f42898b, disposable);
            }

            public final void onSuccess(R r) {
                this.f42899c.onSuccess(r);
            }
        }

        public SingleFlatMapCallback(C8073u<? super R> uVar, C8339g<? super T, ? extends C8075w<? extends R>> gVar) {
            this.downstream = uVar;
            this.mapper = gVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                C12965a.m20650b(apply, "The single returned by the mapper is null");
                C8075w wVar = (C8075w) apply;
                if (!isDisposed()) {
                    wVar.mo20655a(new C19193a(this.downstream, this));
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.downstream.onError(th);
            }
        }
    }

    public SingleFlatMap(C8075w<? extends T> wVar, C8339g<? super T, ? extends C8075w<? extends R>> gVar) {
        this.f42897c = gVar;
        this.f42896b = wVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super R> uVar) {
        this.f42896b.mo20655a(new SingleFlatMapCallback(uVar, this.f42897c));
    }
}
