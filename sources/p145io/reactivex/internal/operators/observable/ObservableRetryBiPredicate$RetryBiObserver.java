package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8065q;
import p287xp.C8336d;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRetryBiPredicate$RetryBiObserver */
final class ObservableRetryBiPredicate$RetryBiObserver<T> extends AtomicInteger implements Observer<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final Observer<? super T> downstream;
    public final C8336d<? super Integer, ? super Throwable> predicate;
    public int retries;
    public final C8065q<? extends T> source;
    public final SequentialDisposable upstream;

    public ObservableRetryBiPredicate$RetryBiObserver(Observer<? super T> observer, C8336d<? super Integer, ? super Throwable> dVar, SequentialDisposable sequentialDisposable, C8065q<? extends T> qVar) {
        this.downstream = observer;
        this.upstream = sequentialDisposable;
        this.source = qVar;
        this.predicate = dVar;
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        try {
            C8336d<? super Integer, ? super Throwable> dVar = this.predicate;
            int i = this.retries + 1;
            this.retries = i;
            Integer valueOf = Integer.valueOf(i);
            ((C12965a.C12966a) dVar).getClass();
            if (!C12965a.m20649a(valueOf, th)) {
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
