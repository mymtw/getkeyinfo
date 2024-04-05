package p145io.reactivex.internal.operators.flowable;

import p503zp.C13965a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRangeLong$RangeConditionalSubscription */
final class FlowableRangeLong$RangeConditionalSubscription extends FlowableRangeLong$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C13965a<? super Long> downstream;

    public FlowableRangeLong$RangeConditionalSubscription(C13965a<? super Long> aVar, long j, long j2) {
        super(j, j2);
        this.downstream = aVar;
    }

    public void fastPath() {
        long j = this.end;
        C13965a<? super Long> aVar = this.downstream;
        long j2 = this.index;
        while (j2 != j) {
            if (!this.cancelled) {
                aVar.tryOnNext(Long.valueOf(j2));
                j2++;
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            aVar.onComplete();
        }
    }

    public void slowPath(long j) {
        long j2 = this.end;
        long j3 = this.index;
        C13965a<? super Long> aVar = this.downstream;
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
                        aVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    if (aVar.tryOnNext(Long.valueOf(j3))) {
                        j4++;
                    }
                    j3++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
