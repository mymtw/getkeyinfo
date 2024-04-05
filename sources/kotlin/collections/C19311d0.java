package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.d0 */
public abstract class C19311d0 implements Iterator<Short>, C19875a {
    /* renamed from: a */
    public abstract short mo71720a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(mo71720a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
