package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.l */
public abstract class C19319l implements Iterator<Boolean>, C19875a {
    /* renamed from: a */
    public abstract boolean mo71763a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(mo71763a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
