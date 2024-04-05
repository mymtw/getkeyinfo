package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.C1397o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p228s.C7790b;
import p228s.C7792d;
import p239t.C7915c;
import p239t.C7917e;
import p755lq.C19875a;
import p755lq.C19878d;

/* renamed from: androidx.compose.runtime.snapshots.i */
public final class C1391i<K, V> extends C1393k<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1391i(C1397o<K, V> oVar) {
        super(oVar);
        C19383o.m32797g(oVar, "map");
    }

    public final boolean add(Object obj) {
        C19383o.m32797g((Map.Entry) obj, "element");
        C1399p.m3000a();
        throw null;
    }

    public final boolean addAll(Collection collection) {
        C19383o.m32797g(collection, "elements");
        C1399p.m3000a();
        throw null;
    }

    public final boolean contains(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof C19875a) || (obj instanceof C19878d.C19879a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        return C19383o.m32792b(this.f3036b.get(entry.getKey()), entry.getValue());
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        C1397o<K, V> oVar = this.f3036b;
        return new C1402s(oVar, ((C7790b) oVar.mo6035a().f3042c.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof C19875a) || (obj instanceof C19878d.C19879a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        return this.f3036b.remove(entry.getKey()) != null;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.f3036b.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C7792d<K, ? extends V> dVar;
        int i;
        boolean z;
        C1385f i2;
        C19383o.m32797g(collection, "elements");
        int T = C19421p.m32930T(C19322o.m32624F0(collection));
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C1397o<K, V> oVar = this.f3036b;
        boolean z2 = false;
        do {
            synchronized (C1399p.f3044a) {
                C1397o.C1398a aVar = (C1397o.C1398a) SnapshotKt.m2909h(oVar.f3038b, SnapshotKt.m2910i());
                dVar = aVar.f3042c;
                i = aVar.f3043d;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(dVar);
            C7917e builder = dVar.builder();
            Iterator it2 = oVar.f3039c.iterator();
            z = true;
            while (((C1403t) it2).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C1402s) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !C19383o.m32792b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z2 = true;
                }
            }
            C19394m mVar2 = C19394m.f43287a;
            C7915c e = builder.mo20417e();
            if (C19383o.m32792b(e, dVar)) {
                break;
            }
            synchronized (C1399p.f3044a) {
                C1397o.C1398a aVar2 = oVar.f3038b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1397o.C1398a aVar3 = (C1397o.C1398a) SnapshotKt.m2922u(aVar2, oVar, i2);
                    if (aVar3.f3043d == i) {
                        aVar3.mo6048c(e);
                        aVar3.f3043d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i2, oVar);
            }
        } while (!z);
        return z2;
    }
}
