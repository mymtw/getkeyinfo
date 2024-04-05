package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRepeat$RepeatObserver */
final class ObservableRepeat$RepeatObserver<T> extends AtomicInteger implements Observer<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final Observer<? super T> downstream;
    public long remaining;

    /* renamed from: sd */
    public final SequentialDisposable f42755sd;
    public final C8065q<? extends T> source;

    public ObservableRepeat$RepeatObserver(Observer<? super T> observer, long j, SequentialDisposable sequentialDisposable, C8065q<? extends T> qVar) {
        this.downstream = observer;
        this.f42755sd = sequentialDisposable;
        this.source = qVar;
        this.remaining = j;
    }

    public void onComplete() {
        long j = this.remaining;
        if (j != Long.MAX_VALUE) {
            this.remaining = j - 1;
        }
        if (j != 0) {
            subscribeNext();
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        this.f42755sd.replace(disposable);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.f42755sd.isDisposed()) {
                this.source.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
