package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.subjects.UnicastSubject;
import p248tp.C8061n;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWindow$WindowExactObserver */
final class ObservableWindow$WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
    private static final long serialVersionUID = -7481782523886138128L;
    public volatile boolean cancelled;
    public final int capacityHint;
    public final long count;
    public final Observer<? super C8061n<T>> downstream;
    public long size;
    public Disposable upstream;
    public UnicastSubject<T> window;

    public ObservableWindow$WindowExactObserver(Observer<? super C8061n<T>> observer, long j, int i) {
        this.downstream = observer;
        this.count = j;
        this.capacityHint = i;
    }

    public void dispose() {
        this.cancelled = true;
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        UnicastSubject<T> unicastSubject = this.window;
        if (unicastSubject != null) {
            this.window = null;
            unicastSubject.onComplete();
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        UnicastSubject<T> unicastSubject = this.window;
        if (unicastSubject != null) {
            this.window = null;
            unicastSubject.onError(th);
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        UnicastSubject<T> unicastSubject = this.window;
        if (unicastSubject == null && !this.cancelled) {
            UnicastSubject<T> unicastSubject2 = new UnicastSubject<>(this.capacityHint, this);
            this.window = unicastSubject2;
            this.downstream.onNext(unicastSubject2);
            unicastSubject = unicastSubject2;
        }
        if (unicastSubject != null) {
            unicastSubject.onNext(t);
            long j = this.size + 1;
            this.size = j;
            if (j >= this.count) {
                this.size = 0;
                this.window = null;
                unicastSubject.onComplete();
                if (this.cancelled) {
                    this.upstream.dispose();
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void run() {
        if (this.cancelled) {
            this.upstream.dispose();
        }
    }
}
