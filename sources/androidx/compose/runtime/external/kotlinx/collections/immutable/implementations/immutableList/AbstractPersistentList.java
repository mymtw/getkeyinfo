package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C19289b;
import kotlin.jvm.internal.C19383o;
import p228s.C7788a;
import p228s.C7791c;

public abstract class AbstractPersistentList<E> extends C19289b<E> implements C7791c<E> {
    public C7791c<E> addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        PersistentVectorBuilder builder = builder();
        builder.addAll(collection);
        return builder.mo5726e();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
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

    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final C7791c<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? mo5762B(indexOf) : this;
    }

    public final C7791c<E> removeAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        return mo5769f0(new AbstractPersistentList$removeAll$1(collection));
    }

    public final List subList(int i, int i2) {
        return new C7788a.C7789a(this, i, i2);
    }
}
