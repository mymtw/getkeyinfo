package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: kotlinx.coroutines.internal.p */
public final class C19732p<T> {
    private volatile AtomicReferenceArray<T> array;

    public C19732p(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int mo72474a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T mo72475b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo72476c(int i, CoroutineScheduler.C19796b bVar) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, bVar);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, bVar);
        this.array = atomicReferenceArray2;
    }
}
