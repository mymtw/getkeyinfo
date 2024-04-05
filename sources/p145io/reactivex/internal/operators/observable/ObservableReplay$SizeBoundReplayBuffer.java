package p145io.reactivex.internal.operators.observable;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$SizeBoundReplayBuffer */
final class ObservableReplay$SizeBoundReplayBuffer<T> extends ObservableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = -5898283885385201806L;
    public final int limit;

    public ObservableReplay$SizeBoundReplayBuffer(int i) {
        this.limit = i;
    }

    public void truncate() {
        if (this.size > this.limit) {
            removeFirst();
        }
    }
}
