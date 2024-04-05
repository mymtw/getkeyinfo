package p145io.reactivex.internal.operators.single;

import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9259d;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.b */
public final class C19196b<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42916b;

    /* renamed from: c */
    public final C8333a f42917c;

    /* renamed from: io.reactivex.internal.operators.single.b$a */
    public static final class C19197a<T> implements C8073u<T>, Disposable {

        /* renamed from: b */
        public final C8073u<? super T> f42918b;

        /* renamed from: c */
        public final C8333a f42919c;

        /* renamed from: d */
        public Disposable f42920d;

        public C19197a(C8073u<? super T> uVar, C8333a aVar) {
            this.f42918b = uVar;
            this.f42919c = aVar;
        }

        public final void dispose() {
            this.f42920d.dispose();
        }

        public final boolean isDisposed() {
            return this.f42920d.isDisposed();
        }

        public final void onError(Throwable th) {
            this.f42918b.onError(th);
            try {
                this.f42919c.run();
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                C18981a.m32123b(th2);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42920d, disposable)) {
                this.f42920d = disposable;
                this.f42918b.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f42918b.onSuccess(t);
            try {
                this.f42919c.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public C19196b(C19200d dVar, C9259d dVar2) {
        this.f42916b = dVar;
        this.f42917c = dVar2;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42916b.mo20655a(new C19197a(uVar, this.f42917c));
    }
}
