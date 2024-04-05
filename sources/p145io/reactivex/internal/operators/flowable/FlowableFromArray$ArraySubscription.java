package p145io.reactivex.internal.operators.flowable;

import android.support.p013v4.media.C0069a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromArray$ArraySubscription */
final class FlowableFromArray$ArraySubscription<T> extends FlowableFromArray$BaseArraySubscription<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C20024c<? super T> downstream;

    public FlowableFromArray$ArraySubscription(C20024c<? super T> cVar, T[] tArr) {
        super(tArr);
        this.downstream = cVar;
    }

    public void fastPath() {
        T[] tArr = this.array;
        int length = tArr.length;
        C20024c<? super T> cVar = this.downstream;
        int i = this.index;
        while (i != length) {
            if (!this.cancelled) {
                T t = tArr[i];
                if (t == null) {
                    cVar.onError(new NullPointerException(C0069a.m175f("The element at index ", i, " is null")));
                    return;
                } else {
                    cVar.onNext(t);
                    i++;
                }
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            cVar.onComplete();
        }
    }

    public void slowPath(long j) {
        T[] tArr = this.array;
        int length = tArr.length;
        int i = this.index;
        C20024c<? super T> cVar = this.downstream;
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
                        cVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    T t = tArr[i];
                    if (t == null) {
                        cVar.onError(new NullPointerException(C0069a.m175f("The element at index ", i, " is null")));
                        return;
                    }
                    cVar.onNext(t);
                    j2++;
                    i++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
