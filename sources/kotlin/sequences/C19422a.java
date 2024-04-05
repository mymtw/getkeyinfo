package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kotlin.sequences.a */
public final class C19422a<T> implements C19431g<T> {

    /* renamed from: a */
    public final AtomicReference<C19431g<T>> f43337a;

    public C19422a(C19431g<? extends T> gVar) {
        this.f43337a = new AtomicReference<>(gVar);
    }

    public final Iterator<T> iterator() {
        C19431g andSet = this.f43337a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
