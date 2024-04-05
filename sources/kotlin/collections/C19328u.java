package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.u */
public abstract class C19328u implements Iterator<Double>, C19875a {
    public final /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
