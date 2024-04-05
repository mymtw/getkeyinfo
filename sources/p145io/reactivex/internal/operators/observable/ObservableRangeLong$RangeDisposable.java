package p145io.reactivex.internal.operators.observable;

import p145io.reactivex.Observer;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRangeLong$RangeDisposable */
final class ObservableRangeLong$RangeDisposable extends BasicIntQueueDisposable<Long> {
    private static final long serialVersionUID = 396518478098735504L;
    public final Observer<? super Long> downstream;
    public final long end;
    public boolean fused;
    public long index;

    public ObservableRangeLong$RangeDisposable(Observer<? super Long> observer, long j, long j2) {
        this.downstream = observer;
        this.index = j;
        this.end = j2;
    }

    public void clear() {
        this.index = this.end;
        lazySet(1);
    }

    public void dispose() {
        set(1);
    }

    public boolean isDisposed() {
        return get() != 0;
    }

    public boolean isEmpty() {
        return this.index == this.end;
    }

    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.fused = true;
        return 1;
    }

    public void run() {
        if (!this.fused) {
            Observer<? super Long> observer = this.downstream;
            long j = this.end;
            for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                observer.onNext(Long.valueOf(j2));
            }
            if (get() == 0) {
                lazySet(1);
                observer.onComplete();
            }
        }
    }

    public Long poll() throws Exception {
        long j = this.index;
        if (j != this.end) {
            this.index = 1 + j;
            return Long.valueOf(j);
        }
        lazySet(1);
        return null;
    }
}
