package p145io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.subjects.UnicastSubject;
import p248tp.C8061n;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWindow$WindowSkipObserver */
final class ObservableWindow$WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {
    private static final long serialVersionUID = 3366976432059579510L;
    public volatile boolean cancelled;
    public final int capacityHint;
    public final long count;
    public final Observer<? super C8061n<T>> downstream;
    public long firstEmission;
    public long index;
    public final long skip;
    public Disposable upstream;
    public final ArrayDeque<UnicastSubject<T>> windows;
    public final AtomicInteger wip = new AtomicInteger();

    public ObservableWindow$WindowSkipObserver(Observer<? super C8061n<T>> observer, long j, long j2, int i) {
        this.downstream = observer;
        this.count = j;
        this.skip = j2;
        this.capacityHint = i;
        this.windows = new ArrayDeque<>();
    }

    public void dispose() {
        this.cancelled = true;
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public void onComplete() {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll().onComplete();
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll().onError(th);
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        long j = this.index;
        long j2 = this.skip;
        if (j % j2 == 0 && !this.cancelled) {
            this.wip.getAndIncrement();
            UnicastSubject unicastSubject = new UnicastSubject(this.capacityHint, this);
            arrayDeque.offer(unicastSubject);
            this.downstream.onNext(unicastSubject);
        }
        long j3 = this.firstEmission + 1;
        Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
        while (it.hasNext()) {
            it.next().onNext(t);
        }
        if (j3 >= this.count) {
            arrayDeque.poll().onComplete();
            if (!arrayDeque.isEmpty() || !this.cancelled) {
                this.firstEmission = j3 - j2;
            } else {
                this.upstream.dispose();
                return;
            }
        } else {
            this.firstEmission = j3;
        }
        this.index = j + 1;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void run() {
        if (this.wip.decrementAndGet() == 0 && this.cancelled) {
            this.upstream.dispose();
        }
    }
}
