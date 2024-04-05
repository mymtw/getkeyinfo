package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8066r;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.SingleObserveOn */
public final class SingleObserveOn<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<T> f42902b;

    /* renamed from: c */
    public final C8066r f42903c;

    /* renamed from: io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver */
    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        public final C8073u<? super T> downstream;
        public Throwable error;
        public final C8066r scheduler;
        public T value;

        public ObserveOnSingleObserver(C8073u<? super T> uVar, C8066r rVar) {
            this.downstream = uVar;
            this.scheduler = rVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.mo20647c(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.mo20647c(this));
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public SingleObserveOn(C8075w<T> wVar, C8066r rVar) {
        this.f42902b = wVar;
        this.f42903c = rVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        this.f42902b.mo20655a(new ObserveOnSingleObserver(uVar, this.f42903c));
    }
}
