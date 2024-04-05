package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

public abstract class AbstractCollection<E> implements Collection<E>, C19875a {
    /* renamed from: a */
    public abstract int mo5763a();

    public final boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object b : this) {
            if (C19383o.m32792b(b, e)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return mo5763a() == 0;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo5763a();
    }

    public Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final String toString() {
        return C19327t.m32644Z0(this, ", ", "[", "]", new AbstractCollection$toString$1(this), 24);
    }

    public <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }
}
