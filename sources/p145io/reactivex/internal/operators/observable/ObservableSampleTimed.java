package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.observers.C19249d;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSampleTimed */
public final class ObservableSampleTimed<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final long f42757c = 2;

    /* renamed from: d */
    public final TimeUnit f42758d;

    /* renamed from: e */
    public final C8066r f42759e;

    /* renamed from: f */
    public final boolean f42760f;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedEmitLast */
    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip = new AtomicInteger(1);

        public SampleTimedEmitLast(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r rVar) {
            super(observer, j, timeUnit, rVar);
        }

        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedNoLast */
    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r rVar) {
            super(observer, j, timeUnit, rVar);
        }

        public void complete() {
            this.downstream.onComplete();
        }

        public void run() {
            emit();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver */
    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Observer<? super T> downstream;
        public final long period;
        public final C8066r scheduler;
        public final AtomicReference<Disposable> timer = new AtomicReference<>();
        public final TimeUnit unit;
        public Disposable upstream;

        public SampleTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r rVar) {
            this.downstream = observer;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = rVar;
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public abstract void complete();

        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        public void emit() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onComplete() {
            cancelTimer();
            complete();
        }

        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                C8066r rVar = this.scheduler;
                long j = this.period;
                DisposableHelper.replace(this.timer, rVar.mo20649e(this, j, j, this.unit));
            }
        }
    }

    public ObservableSampleTimed(PublishSubject publishSubject, TimeUnit timeUnit, C8066r rVar) {
        super(publishSubject);
        this.f42758d = timeUnit;
        this.f42759e = rVar;
        this.f42760f = false;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        C19249d dVar = new C19249d(observer);
        if (this.f42760f) {
            this.f42793b.subscribe(new SampleTimedEmitLast(dVar, this.f42757c, this.f42758d, this.f42759e));
        } else {
            this.f42793b.subscribe(new SampleTimedNoLast(dVar, this.f42757c, this.f42758d, this.f42759e));
        }
    }
}
