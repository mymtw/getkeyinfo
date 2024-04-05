package p145io.reactivex.parallel;

import p287xp.C8335c;

/* renamed from: io.reactivex.parallel.ParallelFailureHandling */
public enum ParallelFailureHandling implements C8335c<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    public ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
