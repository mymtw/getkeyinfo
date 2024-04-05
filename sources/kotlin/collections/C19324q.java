package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import p568fn.C17782b;
import p753kq.C19857l;
import p755lq.C19875a;
import p755lq.C19876b;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: kotlin.collections.q */
public class C19324q extends C19323p {
    /* renamed from: J0 */
    public static final void m32628J0(Iterable iterable, Collection collection) {
        C19383o.m32797g(collection, "<this>");
        C19383o.m32797g(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    /* renamed from: K0 */
    public static final void m32629K0(List list, Object[] objArr) {
        C19383o.m32797g(list, "<this>");
        C19383o.m32797g(objArr, "elements");
        list.addAll(C19318k.m32599Q0(objArr));
    }

    /* renamed from: L0 */
    public static final boolean m32630L0(Iterable iterable, C19857l lVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: M0 */
    public static final void m32631M0(C19857l lVar, List list) {
        int Y;
        C19383o.m32797g(list, "<this>");
        C19383o.m32797g(lVar, "predicate");
        if (list instanceof RandomAccess) {
            int i = 0;
            C20056h l = new C20057i(0, C17782b.m29859Y(list)).iterator();
            while (l.f44419d) {
                int nextInt = l.nextInt();
                Object obj = list.get(nextInt);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i != nextInt) {
                        list.set(i, obj);
                    }
                    i++;
                }
            }
            if (i < list.size() && i <= (Y = C17782b.m29859Y(list))) {
                while (true) {
                    list.remove(Y);
                    if (Y != i) {
                        Y--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(list instanceof C19875a) || (list instanceof C19876b)) {
            m32630L0(list, lVar, true);
        } else {
            C19389t.m32911e(list, "kotlin.collections.MutableIterable");
            throw null;
        }
    }

    /* renamed from: N0 */
    public static final Object m32632N0(List list) {
        C19383o.m32797g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C17782b.m29859Y(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
