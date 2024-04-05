package p145io.reactivex.internal.operators.flowable;

/* renamed from: io.reactivex.internal.operators.flowable.j */
public interface C19114j<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription);
}
