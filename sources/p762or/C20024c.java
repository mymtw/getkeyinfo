package p762or;

import org.reactivestreams.Subscription;

/* renamed from: or.c */
public interface C20024c<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Subscription subscription);
}
