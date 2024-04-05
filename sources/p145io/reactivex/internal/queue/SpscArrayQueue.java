package p145io.reactivex.internal.queue;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p503zp.C13972h;

/* renamed from: io.reactivex.internal.queue.SpscArrayQueue */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements C13972h<E> {

    /* renamed from: b */
    public static final Integer f42951b = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex = new AtomicLong();
    public final int lookAheadStep;
    public final int mask = (length() - 1);
    public final AtomicLong producerIndex = new AtomicLong();
    public long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.lookAheadStep = Math.min(i / 4, f42951b.intValue());
    }

    public int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    public int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public E lvElement(int i) {
        return get(i);
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.mask;
            long j = this.producerIndex.get();
            int calcElementOffset = calcElementOffset(j, i);
            if (j >= this.producerLookAhead) {
                long j2 = ((long) this.lookAheadStep) + j;
                if (lvElement(calcElementOffset(j2, i)) == null) {
                    this.producerLookAhead = j2;
                } else if (lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(calcElementOffset, e);
            soProducerIndex(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(calcElementOffset, (Object) null);
        return lvElement;
    }

    public void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    public void soElement(int i, E e) {
        lazySet(i, e);
    }

    public void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}
