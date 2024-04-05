package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.m */
public abstract class C19320m implements Iterator<Byte>, C19875a {
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
