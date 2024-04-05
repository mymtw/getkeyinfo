package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;

/* renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver */
public final class ObservableSwitchMapCompletable$SwitchMapCompletableObserver<T> implements Observer<T>, Disposable {

    /* renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver */
    public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = -8003404460084760287L;
        public final ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> parent;

        public SwitchMapInnerObserver(ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> observableSwitchMapCompletable$SwitchMapCompletableObserver) {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            throw null;
        }

        public void onError(Throwable th) {
            throw null;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }
}
