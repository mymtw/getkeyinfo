package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;
import p313aq.C8541f;

/* renamed from: io.reactivex.internal.operators.single.SingleDelayWithCompletable */
public final class SingleDelayWithCompletable<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42892b;

    /* renamed from: c */
    public final C8052e f42893c;

    /* renamed from: io.reactivex.internal.operators.single.SingleDelayWithCompletable$OtherObserver */
    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements C8050c, Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        public final C8073u<? super T> downstream;
        public final C8075w<T> source;

        public OtherObserver(C8073u<? super T> uVar, C8075w<T> wVar) {
            this.downstream = uVar;
            this.source = wVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            this.source.mo20655a(new C8541f(this.downstream, this));
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(C8071s sVar, C8052e eVar) {
        this.f42892b = sVar;
        this.f42893c = eVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42893c.mo20607a(new OtherObserver(uVar, this.f42892b));
    }
}
