package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$Node */
final class ObservableReplay$Node extends AtomicReference<ObservableReplay$Node> {
    private static final long serialVersionUID = 245354315435971818L;
    public final Object value;

    public ObservableReplay$Node(Object obj) {
        this.value = obj;
    }
}
