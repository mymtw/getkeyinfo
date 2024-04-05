package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.queue.C19213a;

/* renamed from: io.reactivex.internal.operators.observable.w */
public final class C19186w<T> implements Observer<T> {

    /* renamed from: b */
    public final ObservableSequenceEqual$EqualCoordinator<T> f42866b;

    /* renamed from: c */
    public final C19213a<T> f42867c;

    /* renamed from: d */
    public final int f42868d;

    /* renamed from: e */
    public volatile boolean f42869e;

    /* renamed from: f */
    public Throwable f42870f;

    public C19186w(ObservableSequenceEqual$EqualCoordinator<T> observableSequenceEqual$EqualCoordinator, int i, int i2) {
        this.f42866b = observableSequenceEqual$EqualCoordinator;
        this.f42868d = i;
        this.f42867c = new C19213a<>(i2);
    }

    public final void onComplete() {
        this.f42869e = true;
        this.f42866b.drain();
    }

    public final void onError(Throwable th) {
        this.f42870f = th;
        this.f42869e = true;
        this.f42866b.drain();
    }

    public final void onNext(T t) {
        this.f42867c.offer(t);
        this.f42866b.drain();
    }

    public final void onSubscribe(Disposable disposable) {
        this.f42866b.setDisposable(disposable, this.f42868d);
    }
}
