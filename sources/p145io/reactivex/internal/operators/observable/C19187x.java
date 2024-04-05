package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.queue.C19213a;

/* renamed from: io.reactivex.internal.operators.observable.x */
public final class C19187x<T> implements Observer<T> {

    /* renamed from: b */
    public final ObservableSequenceEqualSingle$EqualCoordinator<T> f42871b;

    /* renamed from: c */
    public final C19213a<T> f42872c;

    /* renamed from: d */
    public final int f42873d;

    /* renamed from: e */
    public volatile boolean f42874e;

    /* renamed from: f */
    public Throwable f42875f;

    public C19187x(ObservableSequenceEqualSingle$EqualCoordinator<T> observableSequenceEqualSingle$EqualCoordinator, int i, int i2) {
        this.f42871b = observableSequenceEqualSingle$EqualCoordinator;
        this.f42873d = i;
        this.f42872c = new C19213a<>(i2);
    }

    public final void onComplete() {
        this.f42874e = true;
        this.f42871b.drain();
    }

    public final void onError(Throwable th) {
        this.f42875f = th;
        this.f42874e = true;
        this.f42871b.drain();
    }

    public final void onNext(T t) {
        this.f42872c.offer(t);
        this.f42871b.drain();
    }

    public final void onSubscribe(Disposable disposable) {
        this.f42871b.setDisposable(disposable, this.f42873d);
    }
}
