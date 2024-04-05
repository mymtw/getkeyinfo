package p734bq;

import p145io.reactivex.internal.subscribers.InnerQueuedSubscriber;

/* renamed from: bq.a */
public interface C18977a<T> {
    void drain();

    void innerComplete(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void innerNext(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
