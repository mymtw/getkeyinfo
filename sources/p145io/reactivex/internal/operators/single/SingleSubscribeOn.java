package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8066r;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.SingleSubscribeOn */
public final class SingleSubscribeOn<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8075w<? extends T> f42904b;

    /* renamed from: c */
    public final C8066r f42905c;

    /* renamed from: io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver */
    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        public final C8073u<? super T> downstream;
        public final C8075w<? extends T> source;
        public final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(C8073u<? super T> uVar, C8075w<? extends T> wVar) {
            this.downstream = uVar;
            this.source = wVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public void run() {
            this.source.mo20655a(this);
        }
    }

    public SingleSubscribeOn(C8075w<? extends T> wVar, C8066r rVar) {
        this.f42904b = wVar;
        this.f42905c = rVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(uVar, this.f42904b);
        uVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f42905c.mo20647c(subscribeOnObserver));
    }
}
