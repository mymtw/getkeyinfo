package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.observers.C19249d;
import p248tp.C8061n;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed */
public final class ObservableThrottleFirstTimed<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final long f42768c = 5;

    /* renamed from: d */
    public final TimeUnit f42769d;

    /* renamed from: e */
    public final C8066r f42770e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed$DebounceTimedObserver */
    public static final class DebounceTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        public boolean done;
        public final Observer<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final TimeUnit unit;
        public Disposable upstream;
        public final C8066r.C8069c worker;

        public DebounceTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r.C8069c cVar) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext(t);
                Disposable disposable = (Disposable) get();
                if (disposable != null) {
                    disposable.dispose();
                }
                DisposableHelper.replace(this, this.worker.mo20653b(this, this.timeout, this.unit));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void run() {
            this.gate = false;
        }
    }

    public ObservableThrottleFirstTimed(C8061n nVar, C8066r rVar, TimeUnit timeUnit) {
        super(nVar);
        this.f42769d = timeUnit;
        this.f42770e = rVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new DebounceTimedObserver(new C19249d(observer), this.f42768c, this.f42769d, this.f42770e.mo20646b()));
    }
}
