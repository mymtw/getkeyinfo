package kotlin.collections;

import java.util.AbstractList;
import p755lq.C19877c;

/* renamed from: kotlin.collections.d */
public abstract class C19310d<E> extends AbstractList<E> implements C19877c {
    public abstract void add(int i, E e);

    public abstract int getSize();

    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return getSize();
    }
}
