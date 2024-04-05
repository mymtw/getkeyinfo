package androidx.compose.runtime.snapshots;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p228s.C7792d;
import p239t.C7915c;
import p239t.C7917e;
import p755lq.C19878d;

/* renamed from: androidx.compose.runtime.snapshots.o */
public final class C1397o<K, V> implements Map<K, V>, C1406w, C19878d {

    /* renamed from: b */
    public C1398a f3038b = new C1398a(C7915c.f17371d);

    /* renamed from: c */
    public final C1391i f3039c = new C1391i(this);

    /* renamed from: d */
    public final C1392j f3040d = new C1392j(this);

    /* renamed from: e */
    public final C1394l f3041e = new C1394l(this);

    /* renamed from: androidx.compose.runtime.snapshots.o$a */
    public static final class C1398a<K, V> extends C1407x {

        /* renamed from: c */
        public C7792d<K, ? extends V> f3042c;

        /* renamed from: d */
        public int f3043d;

        public C1398a(C7792d<K, ? extends V> dVar) {
            C19383o.m32797g(dVar, "map");
            this.f3042c = dVar;
        }

        /* renamed from: a */
        public final void mo5542a(C1407x xVar) {
            C19383o.m32797g(xVar, "value");
            C1398a aVar = (C1398a) xVar;
            synchronized (C1399p.f3044a) {
                this.f3042c = aVar.f3042c;
                this.f3043d = aVar.f3043d;
                C19394m mVar = C19394m.f43287a;
            }
        }

        /* renamed from: b */
        public final C1407x mo5543b() {
            return new C1398a(this.f3042c);
        }

        /* renamed from: c */
        public final void mo6048c(C7792d<K, ? extends V> dVar) {
            C19383o.m32797g(dVar, "<set-?>");
            this.f3042c = dVar;
        }
    }

    /* renamed from: a */
    public final C1398a<K, V> mo6035a() {
        return (C1398a) SnapshotKt.m2918q(this.f3038b, this);
    }

    public final void clear() {
        C1385f i;
        C7915c cVar = C7915c.f17371d;
        if (cVar != ((C1398a) SnapshotKt.m2909h(this.f3038b, SnapshotKt.m2910i())).f3042c) {
            synchronized (C1399p.f3044a) {
                C1398a aVar = this.f3038b;
                synchronized (SnapshotKt.f2989c) {
                    i = SnapshotKt.m2910i();
                    C1398a aVar2 = (C1398a) SnapshotKt.m2922u(aVar, this, i);
                    aVar2.mo6048c(cVar);
                    aVar2.f3043d++;
                }
                SnapshotKt.m2914m(i, this);
            }
        }
    }

    public final boolean containsKey(Object obj) {
        return mo6035a().f3042c.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return mo6035a().f3042c.containsValue(obj);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f3039c;
    }

    public final V get(Object obj) {
        return mo6035a().f3042c.get(obj);
    }

    public final C1407x getFirstStateRecord() {
        return this.f3038b;
    }

    public final boolean isEmpty() {
        return mo6035a().f3042c.isEmpty();
    }

    public final Set<K> keySet() {
        return this.f3040d;
    }

    public final void prependStateRecord(C1407x xVar) {
        this.f3038b = (C1398a) xVar;
    }

    public final V put(K k, V v) {
        C7792d<K, ? extends V> dVar;
        int i;
        V put;
        C1385f i2;
        boolean z;
        do {
            Object obj = C1399p.f3044a;
            synchronized (obj) {
                C1398a aVar = (C1398a) SnapshotKt.m2909h(this.f3038b, SnapshotKt.m2910i());
                dVar = aVar.f3042c;
                i = aVar.f3043d;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(dVar);
            C7917e builder = dVar.builder();
            put = builder.put(k, v);
            C7915c e = builder.mo20417e();
            if (C19383o.m32792b(e, dVar)) {
                break;
            }
            synchronized (obj) {
                C1398a aVar2 = this.f3038b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1398a aVar3 = (C1398a) SnapshotKt.m2922u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f3043d == i) {
                        aVar3.mo6048c(e);
                        aVar3.f3043d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return put;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        C7792d<K, ? extends V> dVar;
        int i;
        C1385f i2;
        boolean z;
        C19383o.m32797g(map, ResponseConstants.FROM);
        do {
            Object obj = C1399p.f3044a;
            synchronized (obj) {
                C1398a aVar = (C1398a) SnapshotKt.m2909h(this.f3038b, SnapshotKt.m2910i());
                dVar = aVar.f3042c;
                i = aVar.f3043d;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(dVar);
            C7917e builder = dVar.builder();
            builder.putAll(map);
            C7915c e = builder.mo20417e();
            if (!C19383o.m32792b(e, dVar)) {
                synchronized (obj) {
                    C1398a aVar2 = this.f3038b;
                    synchronized (SnapshotKt.f2989c) {
                        i2 = SnapshotKt.m2910i();
                        C1398a aVar3 = (C1398a) SnapshotKt.m2922u(aVar2, this, i2);
                        z = true;
                        if (aVar3.f3043d == i) {
                            aVar3.mo6048c(e);
                            aVar3.f3043d++;
                        } else {
                            z = false;
                        }
                    }
                    SnapshotKt.m2914m(i2, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    public final V remove(Object obj) {
        C7792d<K, ? extends V> dVar;
        int i;
        V remove;
        C1385f i2;
        boolean z;
        do {
            Object obj2 = C1399p.f3044a;
            synchronized (obj2) {
                C1398a aVar = (C1398a) SnapshotKt.m2909h(this.f3038b, SnapshotKt.m2910i());
                dVar = aVar.f3042c;
                i = aVar.f3043d;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(dVar);
            C7917e builder = dVar.builder();
            remove = builder.remove(obj);
            C7915c e = builder.mo20417e();
            if (C19383o.m32792b(e, dVar)) {
                break;
            }
            synchronized (obj2) {
                C1398a aVar2 = this.f3038b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1398a aVar3 = (C1398a) SnapshotKt.m2922u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f3043d == i) {
                        aVar3.mo6048c(e);
                        aVar3.f3043d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return remove;
    }

    public final int size() {
        return mo6035a().f3042c.size();
    }

    public final Collection<V> values() {
        return this.f3041e;
    }
}
