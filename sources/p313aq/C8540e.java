package p313aq;

import p145io.reactivex.internal.observers.InnerQueuedObserver;

/* renamed from: aq.e */
public interface C8540e<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
