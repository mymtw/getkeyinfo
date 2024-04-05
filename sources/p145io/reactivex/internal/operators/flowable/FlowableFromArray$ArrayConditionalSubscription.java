package p145io.reactivex.internal.operators.flowable;

import android.support.p013v4.media.C0069a;
import p503zp.C13965a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromArray$ArrayConditionalSubscription */
final class FlowableFromArray$ArrayConditionalSubscription<T> extends FlowableFromArray$BaseArraySubscription<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C13965a<? super T> downstream;

    public FlowableFromArray$ArrayConditionalSubscription(C13965a<? super T> aVar, T[] tArr) {
        super(tArr);
        this.downstream = aVar;
    }

    public void fastPath() {
        T[] tArr = this.array;
        int length = tArr.length;
        C13965a<? super T> aVar = this.downstream;
        int i = this.index;
        while (i != length) {
            if (!this.cancelled) {
                T t = tArr[i];
                if (t == null) {
                    aVar.onError(new NullPointerException(C0069a.m175f("The element at index ", i, " is null")));
                    return;
                } else {
                    aVar.tryOnNext(t);
                    i++;
                }
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            aVar.onComplete();
        }
    }

    public void slowPath(long j) {
        T[] tArr = this.array;
        int length = tArr.length;
        int i = this.index;
        C13965a<? super T> aVar = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i == length) {
                    if (i != length) {
                        j = get();
                        if (j2 == j) {
                            this.index = i;
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        aVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    T t = tArr[i];
                    if (t == null) {
                        aVar.onError(new NullPointerException(C0069a.m175f("The element at index ", i, " is null")));
                        return;
                    }
                    if (aVar.tryOnNext(t)) {
                        j2++;
                    }
                    i++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
