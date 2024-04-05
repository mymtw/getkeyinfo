package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimer */
public final class FlowableTimer extends C8054g<Long> {

    /* renamed from: c */
    public final C8066r f42667c;

    /* renamed from: d */
    public final long f42668d;

    /* renamed from: e */
    public final TimeUnit f42669e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTimer$TimerSubscriber */
    public static final class TimerSubscriber extends AtomicReference<Disposable> implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final C20024c<? super Long> downstream;
        public volatile boolean requested;

        public TimerSubscriber(C20024c<? super Long> cVar) {
            this.downstream = cVar;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, C8066r rVar) {
        this.f42668d = j;
        this.f42669e = timeUnit;
        this.f42667c = rVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super Long> cVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(cVar);
        cVar.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.f42667c.mo20648d(timerSubscriber, this.f42668d, this.f42669e));
    }
}
