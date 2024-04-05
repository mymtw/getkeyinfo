package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver */
final class ObservableUnsubscribeOn$UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
    private static final long serialVersionUID = 1015244841293359600L;
    public final Observer<? super T> downstream;
    public final C8066r scheduler;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$a */
    public final class C19143a implements Runnable {
        public C19143a() {
        }

        public final void run() {
            ObservableUnsubscribeOn$UnsubscribeObserver.this.upstream.dispose();
        }
    }

    public ObservableUnsubscribeOn$UnsubscribeObserver(Observer<? super T> observer, C8066r rVar) {
        this.downstream = observer;
        this.scheduler = rVar;
    }

    public void dispose() {
        if (compareAndSet(false, true)) {
            this.scheduler.mo20647c(new C19143a());
        }
    }

    public boolean isDisposed() {
        return get();
    }

    public void onComplete() {
        if (!get()) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (get()) {
            C18981a.m32123b(th);
        } else {
            this.downstream.onError(th);
        }
    }

    public void onNext(T t) {
        if (!get()) {
            this.downstream.onNext(t);
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
