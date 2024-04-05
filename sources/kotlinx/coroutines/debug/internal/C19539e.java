package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: kotlinx.coroutines.debug.internal.e */
public final class C19539e<T> extends WeakReference<T> {

    /* renamed from: a */
    public final int f43485a;

    public C19539e(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.f43485a = t == null ? 0 : t.hashCode();
    }
}
