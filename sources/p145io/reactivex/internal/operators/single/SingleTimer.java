package p145io.reactivex.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8066r;
import p248tp.C8071s;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.single.SingleTimer */
public final class SingleTimer extends C8071s<Long> {

    /* renamed from: b */
    public final long f42906b;

    /* renamed from: c */
    public final TimeUnit f42907c;

    /* renamed from: d */
    public final C8066r f42908d;

    /* renamed from: io.reactivex.internal.operators.single.SingleTimer$TimerDisposable */
    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        public final C8073u<? super Long> downstream;

        public TimerDisposable(C8073u<? super Long> uVar) {
            this.downstream = uVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void run() {
            this.downstream.onSuccess(0L);
        }

        public void setFuture(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public SingleTimer(long j, TimeUnit timeUnit, C8066r rVar) {
        this.f42906b = j;
        this.f42907c = timeUnit;
        this.f42908d = rVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super Long> uVar) {
        TimerDisposable timerDisposable = new TimerDisposable(uVar);
        uVar.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.f42908d.mo20648d(timerDisposable, this.f42906b, this.f42907c));
    }
}
