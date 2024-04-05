package p145io.reactivex.internal.operators.observable;

/* renamed from: io.reactivex.internal.operators.observable.t */
public interface C19183t<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable);
}
