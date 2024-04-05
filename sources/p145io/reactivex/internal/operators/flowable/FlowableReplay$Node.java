package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableReplay$Node */
final class FlowableReplay$Node extends AtomicReference<FlowableReplay$Node> {
    private static final long serialVersionUID = 245354315435971818L;
    public final long index;
    public final Object value;

    public FlowableReplay$Node(Object obj, long j) {
        this.value = obj;
        this.index = j;
    }
}
