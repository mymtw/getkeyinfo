package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8065q;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSubscribeOn */
public final class ObservableSubscribeOn<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8066r f42765c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver */
    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final Observer<? super T> downstream;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();

        public SubscribeOnObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSubscribeOn$a */
    public final class C19139a implements Runnable {

        /* renamed from: b */
        public final SubscribeOnObserver<T> f42766b;

        public C19139a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f42766b = subscribeOnObserver;
        }

        public final void run() {
            ObservableSubscribeOn.this.f42793b.subscribe(this.f42766b);
        }
    }

    public ObservableSubscribeOn(C8065q<T> qVar, C8066r rVar) {
        super(qVar);
        this.f42765c = rVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.f42765c.mo20647c(new C19139a(subscribeOnObserver)));
    }
}
