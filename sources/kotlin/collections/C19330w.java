package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.w */
public abstract class C19330w implements Iterator<Float>, C19875a {
    /* renamed from: a */
    public abstract float mo71784a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(mo71784a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
