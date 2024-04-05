package p145io.reactivex.internal.operators.flowable;

import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeSubscription */
final class FlowableRangeLong$RangeSubscription extends FlowableRangeLong$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C20024c<? super Long> downstream;

    public FlowableRangeLong$RangeSubscription(C20024c<? super Long> cVar, long j, long j2) {
        super(j, j2);
        this.downstream = cVar;
    }

    public void fastPath() {
        long j = this.end;
        C20024c<? super Long> cVar = this.downstream;
        long j2 = this.index;
        while (j2 != j) {
            if (!this.cancelled) {
                cVar.onNext(Long.valueOf(j2));
                j2++;
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            cVar.onComplete();
        }
    }

    public void slowPath(long j) {
        long j2 = this.end;
        long j3 = this.index;
        C20024c<? super Long> cVar = this.downstream;
        do {
            long j4 = 0;
            while (true) {
                if (j4 == j || j3 == j2) {
                    if (j3 != j2) {
                        j = get();
                        if (j4 == j) {
                            this.index = j3;
                            j = addAndGet(-j4);
                        }
                    } else if (!this.cancelled) {
                        cVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    cVar.onNext(Long.valueOf(j3));
                    j4++;
                    j3++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
