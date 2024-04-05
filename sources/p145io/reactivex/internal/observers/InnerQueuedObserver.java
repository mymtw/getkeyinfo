package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p313aq.C8540e;
import p503zp.C13968d;
import p503zp.C13973i;

/* renamed from: io.reactivex.internal.observers.InnerQueuedObserver */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final C8540e<T> parent;
    public final int prefetch;
    public C13973i<T> queue;

    public InnerQueuedObserver(C8540e<T> eVar, int i) {
        this.parent = eVar;
        this.prefetch = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public boolean isDone() {
        return this.done;
    }

    public void onComplete() {
        this.parent.innerComplete(this);
    }

    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof C13968d) {
                C13968d dVar = (C13968d) disposable;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    return;
                }
            }
            int i = -this.prefetch;
            this.queue = i < 0 ? new C19213a<>(-i) : new SpscArrayQueue<>(i);
        }
    }

    public C13973i<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
