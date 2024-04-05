package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.completable.CompletableObserveOn */
public final class CompletableObserveOn extends C8048a {

    /* renamed from: b */
    public final C8052e f42603b;

    /* renamed from: c */
    public final C8066r f42604c;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver */
    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements C8050c, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        public final C8050c downstream;
        public Throwable error;
        public final C8066r scheduler;

        public ObserveOnCompletableObserver(C8050c cVar, C8066r rVar) {
            this.downstream = cVar;
            this.scheduler = rVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.mo20647c(this));
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

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public CompletableObserveOn(C8052e eVar, C8066r rVar) {
        this.f42603b = eVar;
        this.f42604c = rVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42603b.mo20607a(new ObserveOnCompletableObserver(cVar, this.f42604c));
    }
}
