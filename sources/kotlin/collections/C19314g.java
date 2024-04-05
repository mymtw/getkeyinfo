package kotlin.collections;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.g */
public abstract class C19314g<E> extends AbstractCollection<E> implements Set<E> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C19383o.m32797g(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
