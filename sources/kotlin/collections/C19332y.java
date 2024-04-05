package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.y */
public abstract class C19332y implements Iterator<Integer>, C19875a {
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
