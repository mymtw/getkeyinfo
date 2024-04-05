package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver */
public final class FlowableSwitchMapCompletable$SwitchMapCompletableObserver<T> implements C8056i<T>, Disposable {

    /* renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver */
    public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = -8003404460084760287L;
        public final FlowableSwitchMapCompletable$SwitchMapCompletableObserver<?> parent;

        public SwitchMapInnerObserver(FlowableSwitchMapCompletable$SwitchMapCompletableObserver<?> flowableSwitchMapCompletable$SwitchMapCompletableObserver) {
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
