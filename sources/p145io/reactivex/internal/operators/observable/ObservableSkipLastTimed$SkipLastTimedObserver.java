package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSkipLastTimed$SkipLastTimedObserver */
final class ObservableSkipLastTimed$SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = -5677354903406201275L;
    public volatile boolean cancelled;
    public final boolean delayError;
    public volatile boolean done;
    public final Observer<? super T> downstream;
    public Throwable error;
    public final C19213a<Object> queue;
    public final C8066r scheduler;
    public final long time;
    public final TimeUnit unit;
    public Disposable upstream;

    public ObservableSkipLastTimed$SkipLastTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C8066r rVar, int i, boolean z) {
        this.downstream = observer;
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = rVar;
        this.queue = new C19213a<>(i);
        this.delayError = z;
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Observer<? super T> observer = this.downstream;
            C19213a<Object> aVar = this.queue;
            boolean z = this.delayError;
            TimeUnit timeUnit = this.unit;
            C8066r rVar = this.scheduler;
            long j = this.time;
            int i = 1;
            while (!this.cancelled) {
                boolean z2 = this.done;
                Long l = (Long) aVar.peek();
                boolean z3 = l == null;
                rVar.getClass();
                long a = C8066r.m16244a(timeUnit);
                if (!z3 && l.longValue() > a - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.error;
                        if (th != null) {
                            this.queue.clear();
                            observer.onError(th);
                            return;
                        } else if (z3) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z3) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    aVar.poll();
                    observer.onNext(aVar.poll());
                }
            }
            this.queue.clear();
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        C19213a<Object> aVar = this.queue;
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        aVar.mo71258a(Long.valueOf(C8066r.m16244a(timeUnit)), t);
        drain();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
