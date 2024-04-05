package p145io.reactivex.internal.operators.flowable;

/* renamed from: io.reactivex.internal.operators.flowable.g */
public interface C19111g {
    void innerClose(boolean z, FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber);

    void innerCloseError(Throwable th);

    void innerComplete(FlowableGroupJoin$LeftRightSubscriber flowableGroupJoin$LeftRightSubscriber);

    void innerError(Throwable th);

    void innerValue(boolean z, Object obj);
}
