package p145io.reactivex.internal.operators.flowable;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableReplay$SizeBoundReplayBuffer */
final class FlowableReplay$SizeBoundReplayBuffer<T> extends FlowableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = -5898283885385201806L;
    public final int limit;

    public FlowableReplay$SizeBoundReplayBuffer(int i) {
        this.limit = i;
    }

    public void truncate() {
        if (this.size > this.limit) {
            removeFirst();
        }
    }
}
