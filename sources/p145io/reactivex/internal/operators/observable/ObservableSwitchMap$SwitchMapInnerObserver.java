package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p503zp.C13968d;
import p503zp.C13973i;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver */
final class ObservableSwitchMap$SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
    private static final long serialVersionUID = 3837284832786408377L;
    public final int bufferSize;
    public volatile boolean done;
    public final long index;
    public final ObservableSwitchMap$SwitchMapObserver<T, R> parent;
    public volatile C13973i<R> queue;

    public ObservableSwitchMap$SwitchMapInnerObserver(ObservableSwitchMap$SwitchMapObserver<T, R> observableSwitchMap$SwitchMapObserver, long j, int i) {
        this.parent = observableSwitchMap$SwitchMapObserver;
        this.index = j;
        this.bufferSize = i;
    }

    public void cancel() {
        DisposableHelper.dispose(this);
    }

    public void onComplete() {
        if (this.index == this.parent.unique) {
            this.done = true;
            this.parent.drain();
        }
    }

    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    public void onNext(R r) {
        if (this.index == this.parent.unique) {
            if (r != null) {
                this.queue.offer(r);
            }
            this.parent.drain();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            if (disposable instanceof C13968d) {
                C13968d dVar = (C13968d) disposable;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.queue = dVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                } else if (requestFusion == 2) {
                    this.queue = dVar;
                    return;
                }
            }
            this.queue = new C19213a(this.bufferSize);
        }
    }
}
