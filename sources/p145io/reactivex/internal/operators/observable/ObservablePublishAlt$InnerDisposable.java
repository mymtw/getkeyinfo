package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservablePublishAlt$InnerDisposable */
final class ObservablePublishAlt$InnerDisposable<T> extends AtomicReference<ObservablePublishAlt$PublishConnection<T>> implements Disposable {
    private static final long serialVersionUID = 7463222674719692880L;
    public final Observer<? super T> downstream;

    public ObservablePublishAlt$InnerDisposable(Observer<? super T> observer, ObservablePublishAlt$PublishConnection<T> observablePublishAlt$PublishConnection) {
        this.downstream = observer;
        lazySet(observablePublishAlt$PublishConnection);
    }

    public void dispose() {
        ObservablePublishAlt$PublishConnection observablePublishAlt$PublishConnection = (ObservablePublishAlt$PublishConnection) getAndSet((Object) null);
        if (observablePublishAlt$PublishConnection != null) {
            observablePublishAlt$PublishConnection.remove(this);
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
