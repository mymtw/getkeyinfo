package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.C1397o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p228s.C7790b;
import p228s.C7792d;
import p239t.C7915c;
import p239t.C7917e;

/* renamed from: androidx.compose.runtime.snapshots.l */
public final class C1394l<K, V> extends C1393k<K, V, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1394l(C1397o<K, V> oVar) {
        super(oVar);
        C19383o.m32797g(oVar, "map");
    }

    public final boolean add(Object obj) {
        C1399p.m3000a();
        throw null;
    }

    public final boolean addAll(Collection collection) {
        C19383o.m32797g(collection, "elements");
        C1399p.m3000a();
        throw null;
    }

    public final boolean contains(Object obj) {
        return this.f3036b.containsValue(obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f3036b.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        C1397o<K, V> oVar = this.f3036b;
        return new C1405v(oVar, ((C7790b) oVar.mo6035a().f3042c.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        Object obj2;
        C1397o<K, V> oVar = this.f3036b;
        Iterator it = oVar.f3039c.iterator();
        while (true) {
            if (!((C1403t) it).hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = ((C1402s) it).next();
            if (C19383o.m32792b(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        oVar.remove(entry.getKey());
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C7792d<K, ? extends V> dVar;
        int i;
        boolean z;
        C1385f i2;
        C19383o.m32797g(collection, "elements");
        Set<T> t1 = C19327t.m32664t1(collection);
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
            Iterator it = oVar.f3039c.iterator();
            z = true;
            while (((C1403t) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C1402s) it).next();
                if (t1.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
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

    public final boolean retainAll(Collection<? extends Object> collection) {
        C7792d<K, ? extends V> dVar;
        int i;
        boolean z;
        C1385f i2;
        C19383o.m32797g(collection, "elements");
        Set<T> t1 = C19327t.m32664t1(collection);
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
            Iterator it = oVar.f3039c.iterator();
            z = true;
            while (((C1403t) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C1402s) it).next();
                if (!t1.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
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
