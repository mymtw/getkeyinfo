package p145io.reactivex.internal.operators.single;

import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9259d;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleDoFinally */
public final class SingleDoFinally<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42894b;

    /* renamed from: c */
    public final C8333a f42895c;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoFinally$DoFinallyObserver */
    public static final class DoFinallyObserver<T> extends AtomicInteger implements C8073u<T>, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        public final C8073u<? super T> downstream;
        public final C8333a onFinally;
        public Disposable upstream;

        public DoFinallyObserver(C8073u<? super T> uVar, C8333a aVar) {
            this.downstream = uVar;
            this.onFinally = aVar;
        }

        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            runFinally();
        }

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    C18981a.m32123b(th);
                }
            }
        }
    }

    public SingleDoFinally(SingleObserveOn singleObserveOn, C9259d dVar) {
        this.f42894b = singleObserveOn;
        this.f42895c = dVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42894b.mo20655a(new DoFinallyObserver(uVar, this.f42895c));
    }
}
