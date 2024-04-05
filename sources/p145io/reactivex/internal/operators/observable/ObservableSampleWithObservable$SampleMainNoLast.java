package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainNoLast */
final class ObservableSampleWithObservable$SampleMainNoLast<T> extends ObservableSampleWithObservable$SampleMainObserver<T> {
    private static final long serialVersionUID = -3029755663834015785L;

    public ObservableSampleWithObservable$SampleMainNoLast(Observer<? super T> observer, C8065q<?> qVar) {
        super(observer, qVar);
    }

    public void completion() {
        this.downstream.onComplete();
    }

    public void run() {
        emit();
    }
}
