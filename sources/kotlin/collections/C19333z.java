package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.z */
public abstract class C19333z implements Iterator<Long>, C19875a {
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
