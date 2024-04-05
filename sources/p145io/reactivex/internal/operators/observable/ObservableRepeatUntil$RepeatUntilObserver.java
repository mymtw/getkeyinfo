package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8065q;
import p287xp.C8337e;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRepeatUntil$RepeatUntilObserver */
final class ObservableRepeatUntil$RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final Observer<? super T> downstream;
    public final C8065q<? extends T> source;
    public final C8337e stop;
    public final SequentialDisposable upstream;

    public ObservableRepeatUntil$RepeatUntilObserver(Observer<? super T> observer, C8337e eVar, SequentialDisposable sequentialDisposable, C8065q<? extends T> qVar) {
        this.downstream = observer;
        this.upstream = sequentialDisposable;
        this.source = qVar;
        this.stop = eVar;
    }

    public void onComplete() {
        try {
            if (this.stop.getAsBoolean()) {
                this.downstream.onComplete();
            } else {
                subscribeNext();
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        this.upstream.replace(disposable);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int i = 1;
            do {
                this.source.subscribe(this);
                i = addAndGet(-i);
            } while (i != 0);
        }
    }
}
