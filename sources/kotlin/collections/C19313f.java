package kotlin.collections;

import java.util.AbstractSet;
import p755lq.C19880e;

/* renamed from: kotlin.collections.f */
public abstract class C19313f<E> extends AbstractSet<E> implements C19880e {
    public abstract boolean add(E e);

    public abstract int getSize();

    public final /* bridge */ int size() {
        return getSize();
    }
}
