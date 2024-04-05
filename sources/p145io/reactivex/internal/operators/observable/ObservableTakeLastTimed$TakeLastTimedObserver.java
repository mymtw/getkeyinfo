package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver */
final class ObservableTakeLastTimed$TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
    private static final long serialVersionUID = -5677354903406201275L;
    public volatile boolean cancelled;
    public final long count;
    public final boolean delayError;
    public final Observer<? super T> downstream;
    public Throwable error;
    public final C19213a<Object> queue;
    public final C8066r scheduler;
    public final long time;
    public final TimeUnit unit;
    public Disposable upstream;

    public ObservableTakeLastTimed$TakeLastTimedObserver(Observer<? super T> observer, long j, long j2, TimeUnit timeUnit, C8066r rVar, int i, boolean z) {
        this.downstream = observer;
        this.count = j;
        this.time = j2;
        this.unit = timeUnit;
        this.scheduler = rVar;
        this.queue = new C19213a<>(i);
        this.delayError = z;
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        Throwable th;
        if (compareAndSet(false, true)) {
            Observer<? super T> observer = this.downstream;
            C19213a<Object> aVar = this.queue;
            boolean z = this.delayError;
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            long a = C8066r.m16244a(timeUnit) - this.time;
            while (!this.cancelled) {
                if (z || (th = this.error) == null) {
                    Object poll = aVar.poll();
                    if (poll == null) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    } else {
                        Object poll2 = aVar.poll();
                        if (((Long) poll).longValue() >= a) {
                            observer.onNext(poll2);
                        }
                    }
                } else {
                    aVar.clear();
                    observer.onError(th);
                    return;
                }
            }
            aVar.clear();
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        drain();
    }

    public void onNext(T t) {
        long j;
        long j2;
        C19213a<Object> aVar = this.queue;
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        long a = C8066r.m16244a(timeUnit);
        long j3 = this.time;
        long j4 = this.count;
        boolean z = j4 == Long.MAX_VALUE;
        aVar.mo71258a(Long.valueOf(a), t);
        while (!aVar.isEmpty()) {
            if (((Long) aVar.peek()).longValue() > a - j3) {
                if (!z) {
                    long j5 = aVar.f42961i.get();
                    while (true) {
                        j = aVar.f42954b.get();
                        j2 = aVar.f42961i.get();
                        if (j5 == j2) {
                            break;
                        }
                        j5 = j2;
                    }
                    if (((long) (((int) (j - j2)) >> 1)) <= j4) {
                        return;
                    }
                } else {
                    return;
                }
            }
            aVar.poll();
            aVar.poll();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
