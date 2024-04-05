package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8065q;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed */
public final class ObservableTimeoutTimed<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final long f42771c = 10;

    /* renamed from: d */
    public final TimeUnit f42772d;

    /* renamed from: e */
    public final C8066r f42773e;

    /* renamed from: f */
    public final C8065q<? extends T> f42774f;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutFallbackObserver */
    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, C19141b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Observer<? super T> downstream;
        public C8065q<? extends T> fallback;
        public final AtomicLong index = new AtomicLong();
        public final SequentialDisposable task = new SequentialDisposable();
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();
        public final C8066r.C8069c worker;

        public TimeoutFallbackObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r.C8069c cVar, C8065q<? extends T> qVar) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = qVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            C18981a.m32123b(th);
        }

        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                C8065q<? extends T> qVar = this.fallback;
                this.fallback = null;
                qVar.subscribe(new C19140a(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j) {
            this.task.replace(this.worker.mo20653b(new C19142c(j, this), this.timeout, this.unit));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutObserver */
    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, C19141b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Observer<? super T> downstream;
        public final SequentialDisposable task = new SequentialDisposable();
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();
        public final C8066r.C8069c worker;

        public TimeoutObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r.C8069c cVar) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            C18981a.m32123b(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.m32484c(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j) {
            this.task.replace(this.worker.mo20653b(new C19142c(j, this), this.timeout, this.unit));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$a */
    public static final class C19140a<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f42775b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f42776c;

        public C19140a(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.f42775b = observer;
            this.f42776c = atomicReference;
        }

        public final void onComplete() {
            this.f42775b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42775b.onError(th);
        }

        public final void onNext(T t) {
            this.f42775b.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f42776c, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$b */
    public interface C19141b {
        void onTimeout(long j);
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$c */
    public static final class C19142c implements Runnable {

        /* renamed from: b */
        public final C19141b f42777b;

        /* renamed from: c */
        public final long f42778c;

        public C19142c(long j, C19141b bVar) {
            this.f42778c = j;
            this.f42777b = bVar;
        }

        public final void run() {
            this.f42777b.onTimeout(this.f42778c);
        }
    }

    public ObservableTimeoutTimed(ObservableObserveOn observableObserveOn, TimeUnit timeUnit, C8066r rVar) {
        super(observableObserveOn);
        this.f42772d = timeUnit;
        this.f42773e = rVar;
        this.f42774f = null;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        if (this.f42774f == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(observer, this.f42771c, this.f42772d, this.f42773e.mo20646b());
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.startTimeout(0);
            this.f42793b.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(observer, this.f42771c, this.f42772d, this.f42773e.mo20646b(), this.f42774f);
        observer.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startTimeout(0);
        this.f42793b.subscribe(timeoutFallbackObserver);
    }
}
