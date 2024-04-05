package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p239t.C7915c;
import p239t.C7925m;
import p239t.C7927o;
import p239t.C7929q;
import p755lq.C19875a;

public abstract class AbstractMap<K, V> implements Map<K, V>, C19875a {
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C19383o.m32792b(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new C7925m((C7915c) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = r6
            t.c r1 = (p239t.C7915c) r1
            int r3 = r1.f17373c
            java.util.Map r7 = (java.util.Map) r7
            int r4 = r7.size()
            if (r3 == r4) goto L_0x0018
            return r2
        L_0x0018:
            java.util.Set r7 = r7.entrySet()
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0027
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0027
            goto L_0x005b
        L_0x0027:
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r3 = r2
            goto L_0x0058
        L_0x003b:
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r1.get(r4)
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r5)
            if (r3 != 0) goto L_0x004e
            goto L_0x0039
        L_0x004e:
            if (r5 != 0) goto L_0x0057
            boolean r3 = r1.containsKey(r4)
            if (r3 != 0) goto L_0x0057
            goto L_0x0039
        L_0x0057:
            r3 = r0
        L_0x0058:
            if (r3 != 0) goto L_0x002b
            r0 = r2
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.AbstractMap.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final boolean isEmpty() {
        return ((C7915c) this).f17373c == 0;
    }

    public final Set<K> keySet() {
        return new C7927o((C7915c) this);
    }

    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return ((C7915c) this).f17373c;
    }

    public final String toString() {
        return C19327t.m32644Z0(entrySet(), ", ", "{", "}", new AbstractMap$toString$1(this), 24);
    }

    public final Collection<V> values() {
        return new C7929q((C7915c) this);
    }
}
