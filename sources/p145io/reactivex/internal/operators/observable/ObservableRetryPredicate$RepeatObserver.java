package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8065q;
import p287xp.C8340h;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRetryPredicate$RepeatObserver */
final class ObservableRetryPredicate$RepeatObserver<T> extends AtomicInteger implements Observer<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final Observer<? super T> downstream;
    public final C8340h<? super Throwable> predicate;
    public long remaining;
    public final C8065q<? extends T> source;
    public final SequentialDisposable upstream;

    public ObservableRetryPredicate$RepeatObserver(Observer<? super T> observer, long j, C8340h<? super Throwable> hVar, SequentialDisposable sequentialDisposable, C8065q<? extends T> qVar) {
        this.downstream = observer;
        this.upstream = sequentialDisposable;
        this.source = qVar;
        this.predicate = hVar;
        this.remaining = j;
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        long j = this.remaining;
        if (j != Long.MAX_VALUE) {
            this.remaining = j - 1;
        }
        if (j == 0) {
            this.downstream.onError(th);
            return;
        }
        try {
            if (!this.predicate.test(th)) {
                this.downstream.onError(th);
            } else {
                subscribeNext();
            }
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
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
            while (!this.upstream.isDisposed()) {
                this.source.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
