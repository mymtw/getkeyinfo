package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8061n;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTimer */
public final class ObservableTimer extends C8061n<Long> {

    /* renamed from: b */
    public final C8066r f42779b;

    /* renamed from: c */
    public final long f42780c;

    /* renamed from: d */
    public final TimeUnit f42781d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimer$TimerObserver */
    public static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final Observer<? super Long> downstream;

        public TimerObserver(Observer<? super Long> observer) {
            this.downstream = observer;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, C8066r rVar) {
        this.f42780c = j;
        this.f42781d = timeUnit;
        this.f42779b = rVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super Long> observer) {
        TimerObserver timerObserver = new TimerObserver(observer);
        observer.onSubscribe(timerObserver);
        timerObserver.setResource(this.f42779b.mo20648d(timerObserver, this.f42780c, this.f42781d));
    }
}
