package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.completable.CompletableSubscribeOn */
public final class CompletableSubscribeOn extends C8048a {

    /* renamed from: b */
    public final C8052e f42605b;

    /* renamed from: c */
    public final C8066r f42606c;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableSubscribeOn$SubscribeOnObserver */
    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements C8050c, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        public final C8050c downstream;
        public final C8052e source;
        public final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(C8050c cVar, C8052e eVar) {
            this.downstream = cVar;
            this.source = eVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void run() {
            this.source.mo20607a(this);
        }
    }

    public CompletableSubscribeOn(C8052e eVar, C8066r rVar) {
        this.f42605b = eVar;
        this.f42606c = rVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(cVar, this.f42605b);
        cVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f42606c.mo20647c(subscribeOnObserver));
    }
}
