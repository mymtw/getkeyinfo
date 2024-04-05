package p145io.reactivex.internal.operators.single;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.observers.DeferredScalarDisposable;
import p248tp.C8061n;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.SingleToObservable */
public final class SingleToObservable<T> extends C8061n<T> {

    /* renamed from: b */
    public final C8075w<? extends T> f42910b;

    /* renamed from: io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver */
    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements C8073u<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        public Disposable upstream;

        public SingleToObservableObserver(Observer<? super T> observer) {
            super(observer);
        }

        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        public void onError(Throwable th) {
            error(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            complete(t);
        }
    }

    public SingleToObservable(C8075w<? extends T> wVar) {
        this.f42910b = wVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42910b.mo20655a(new SingleToObservableObserver(observer));
    }
}
