package p145io.reactivex.internal.operators.flowable;

import p503zp.C13965a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRange$RangeConditionalSubscription */
final class FlowableRange$RangeConditionalSubscription extends FlowableRange$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    public final C13965a<? super Integer> downstream;

    public FlowableRange$RangeConditionalSubscription(C13965a<? super Integer> aVar, int i, int i2) {
        super(i, i2);
        this.downstream = aVar;
    }

    public void fastPath() {
        int i = this.end;
        C13965a<? super Integer> aVar = this.downstream;
        int i2 = this.index;
        while (i2 != i) {
            if (!this.cancelled) {
                aVar.tryOnNext(Integer.valueOf(i2));
                i2++;
            } else {
                return;
            }
        }
        if (!this.cancelled) {
            aVar.onComplete();
        }
    }

    public void slowPath(long j) {
        int i = this.end;
        int i2 = this.index;
        C13965a<? super Integer> aVar = this.downstream;
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
                        aVar.onComplete();
                        return;
                    } else {
                        return;
                    }
                } else if (!this.cancelled) {
                    if (aVar.tryOnNext(Integer.valueOf(i2))) {
                        j2++;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
