package p145io.reactivex.internal.operators.observable;

/* renamed from: io.reactivex.internal.operators.observable.l */
public interface C19171l {
    void innerClose(boolean z, ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver);

    void innerCloseError(Throwable th);

    void innerComplete(ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver);

    void innerError(Throwable th);

    void innerValue(boolean z, Object obj);
}
