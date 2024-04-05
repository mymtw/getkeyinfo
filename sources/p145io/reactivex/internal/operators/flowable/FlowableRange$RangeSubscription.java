package p145io.reactivex.internal.operators.flowable;

import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRange$RangeSubscription */
final class FlowableRange$RangeSubscription extends FlowableRange$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C20024c<? super Integer> downstream;

    public FlowableRange$RangeSubscription(C20024c<? super Integer> cVar, int i, int i2) {
        super(i, i2);
        this.downstream = cVar;
    }

    public void fastPath() {
        int i = this.end;
        C20024c<? super Integer> cVar = this.downstream;
        int i2 = this.index;
        while (i2 != i) {
            if (!this.cancelled) {
                cVar.onNext(Integer.valueOf(i2));
                i2++;
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            cVar.onComplete();
        }
    }

    public void slowPath(long j) {
        int i = this.end;
        int i2 = this.index;
        C20024c<? super Integer> cVar = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i2 == i) {
                    if (i2 != i) {
                        j = get();
                        if (j2 == j) {
                            this.index = i2;
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        cVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    cVar.onNext(Integer.valueOf(i2));
                    j2++;
                    i2++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
