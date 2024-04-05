package kotlin.collections;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: kotlin.collections.n */
public abstract class C19321n implements Iterator<Character>, C19875a {
    /* renamed from: a */
    public abstract char mo71769a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo71769a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
