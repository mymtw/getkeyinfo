package p513bj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bj.e */
public final class C14053e<E> implements Iterable<E> {

    /* renamed from: b */
    public final Object f30927b = new Object();

    /* renamed from: c */
    public final HashMap f30928c = new HashMap();

    /* renamed from: d */
    public Set<E> f30929d = Collections.emptySet();

    /* renamed from: e */
    public List<E> f30930e = Collections.emptyList();

    public final int count(E e) {
        int intValue;
        synchronized (this.f30927b) {
            intValue = this.f30928c.containsKey(e) ? ((Integer) this.f30928c.get(e)).intValue() : 0;
        }
        return intValue;
    }

    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f30927b) {
            it = this.f30930e.iterator();
        }
        return it;
    }
}
