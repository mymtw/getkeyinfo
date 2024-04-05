package p145io.reactivex.internal.queue;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p503zp.C13972h;

/* renamed from: io.reactivex.internal.queue.a */
public final class C19213a<T> implements C13972h<T> {

    /* renamed from: j */
    public static final int f42952j = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: k */
    public static final Object f42953k = new Object();

    /* renamed from: b */
    public final AtomicLong f42954b;

    /* renamed from: c */
    public int f42955c;

    /* renamed from: d */
    public long f42956d;

    /* renamed from: e */
    public final int f42957e;

    /* renamed from: f */
    public AtomicReferenceArray<Object> f42958f;

    /* renamed from: g */
    public final int f42959g;

    /* renamed from: h */
    public AtomicReferenceArray<Object> f42960h;

    /* renamed from: i */
    public final AtomicLong f42961i = new AtomicLong();

    public C19213a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f42954b = atomicLong;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f42958f = atomicReferenceArray;
        this.f42957e = i2;
        this.f42955c = Math.min(numberOfLeadingZeros / 4, f42952j);
        this.f42960h = atomicReferenceArray;
        this.f42959g = i2;
        this.f42956d = (long) (i2 - 1);
        atomicLong.lazySet(0);
    }

    /* renamed from: a */
    public final boolean mo71258a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42958f;
        long j = this.f42954b.get();
        int i = this.f42957e;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, t2);
            atomicReferenceArray.lazySet(i2, t);
            this.f42954b.lazySet(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f42958f = atomicReferenceArray2;
        int i3 = ((int) j) & i;
        atomicReferenceArray2.lazySet(i3 + 1, t2);
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f42953k);
        this.f42954b.lazySet(j2);
        return true;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.f42954b.get() == this.f42961i.get();
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f42958f;
            long j = this.f42954b.get();
            int i = this.f42957e;
            int i2 = ((int) j) & i;
            if (j < this.f42956d) {
                atomicReferenceArray.lazySet(i2, t);
                this.f42954b.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.f42955c) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f42956d = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.f42954b.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.f42954b.lazySet(j3);
                return true;
            }
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f42958f = atomicReferenceArray2;
            this.f42956d = (((long) i) + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f42953k);
            this.f42954b.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42960h;
        long j = this.f42961i.get();
        int i = this.f42959g;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        if (t != f42953k) {
            return t;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, (Object) null);
        this.f42960h = atomicReferenceArray2;
        return atomicReferenceArray2.get(i2);
    }

    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42960h;
        long j = this.f42961i.get();
        int i = this.f42959g;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == f42953k;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.f42961i.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.f42960h = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                this.f42961i.lazySet(j + 1);
            }
            return t2;
        }
    }
}
