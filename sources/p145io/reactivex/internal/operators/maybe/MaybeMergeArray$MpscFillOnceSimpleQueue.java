package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeMergeArray$MpscFillOnceSimpleQueue */
final class MaybeMergeArray$MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements C19136d<T> {
    private static final long serialVersionUID = -7969063454040569579L;
    public int consumerIndex;
    public final AtomicInteger producerIndex = new AtomicInteger();

    public MaybeMergeArray$MpscFillOnceSimpleQueue(int i) {
        super(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.maybe.MaybeMergeArray$MpscFillOnceSimpleQueue.clear():void");
    }

    public int consumerIndex() {
        return this.consumerIndex;
    }

    public void drop() {
        int i = this.consumerIndex;
        lazySet(i, (Object) null);
        this.consumerIndex = i + 1;
    }

    public boolean isEmpty() {
        return this.consumerIndex == producerIndex();
    }

    public boolean offer(T t) {
        if (t != null) {
            int andIncrement = this.producerIndex.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }
        throw new NullPointerException("value is null");
    }

    public T peek() {
        int i = this.consumerIndex;
        if (i == length()) {
            return null;
        }
        return get(i);
    }

    public T poll() {
        int i = this.consumerIndex;
        if (i == length()) {
            return null;
        }
        AtomicInteger atomicInteger = this.producerIndex;
        do {
            T t = get(i);
            if (t != null) {
                this.consumerIndex = i + 1;
                lazySet(i, (Object) null);
                return t;
            }
        } while (atomicInteger.get() != i);
        return null;
    }

    public int producerIndex() {
        return this.producerIndex.get();
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException();
    }
}
