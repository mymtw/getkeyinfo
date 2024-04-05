package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1318h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p228s.C7791c;
import p628nj.C18263b;
import p753kq.C19857l;
import p755lq.C19877c;

public final class SnapshotStateList<T> implements List<T>, C1406w, C19877c {

    /* renamed from: b */
    public C1376a f2996b = new C1376a(C1318h.f2880c);

    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$a */
    public static final class C1376a<T> extends C1407x {

        /* renamed from: c */
        public C7791c<? extends T> f2997c;

        /* renamed from: d */
        public int f2998d;

        public C1376a(C7791c<? extends T> cVar) {
            C19383o.m32797g(cVar, ResponseConstants.LIST);
            this.f2997c = cVar;
        }

        /* renamed from: a */
        public final void mo5542a(C1407x xVar) {
            C19383o.m32797g(xVar, "value");
            synchronized (C1396n.f3037a) {
                this.f2997c = ((C1376a) xVar).f2997c;
                this.f2998d = ((C1376a) xVar).f2998d;
                C19394m mVar = C19394m.f43287a;
            }
        }

        /* renamed from: b */
        public final C1407x mo5543b() {
            return new C1376a(this.f2997c);
        }

        /* renamed from: c */
        public final void mo5981c(C7791c<? extends T> cVar) {
            C19383o.m32797g(cVar, "<set-?>");
            this.f2997c = cVar;
        }
    }

    /* renamed from: a */
    public final int mo5955a() {
        return ((C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i())).f2998d;
    }

    public final boolean add(T t) {
        int i;
        C7791c<? extends T> cVar;
        boolean z;
        C1385f i2;
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> add = cVar.add(t);
            z = false;
            if (C19383o.m32792b(add, cVar)) {
                return false;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i2);
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(add);
                        aVar3.f2998d++;
                        z = true;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return true;
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        C19383o.m32797g(collection, "elements");
        return mo5964e(new SnapshotStateList$addAll$1(i, collection));
    }

    /* renamed from: c */
    public final C1376a<T> mo5960c() {
        return (C1376a) SnapshotKt.m2918q(this.f2996b, this);
    }

    public final void clear() {
        C1385f i;
        synchronized (C1396n.f3037a) {
            C1376a aVar = this.f2996b;
            synchronized (SnapshotKt.f2989c) {
                i = SnapshotKt.m2910i();
                C1376a aVar2 = (C1376a) SnapshotKt.m2922u(aVar, this, i);
                aVar2.mo5981c(C1318h.f2880c);
                aVar2.f2998d++;
            }
            SnapshotKt.m2914m(i, this);
        }
    }

    public final boolean contains(Object obj) {
        return mo5960c().f2997c.contains(obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return mo5960c().f2997c.containsAll(collection);
    }

    /* renamed from: e */
    public final boolean mo5964e(C19857l<? super List<T>, Boolean> lVar) {
        int i;
        C7791c<? extends T> cVar;
        Boolean invoke;
        C1385f i2;
        boolean z;
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            PersistentVectorBuilder builder = cVar.builder();
            invoke = lVar.invoke(builder);
            C7791c e = builder.mo5726e();
            if (C19383o.m32792b(e, cVar)) {
                break;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(e);
                        aVar3.f2998d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return invoke.booleanValue();
    }

    public final T get(int i) {
        return mo5960c().f2997c.get(i);
    }

    public final C1407x getFirstStateRecord() {
        return this.f2996b;
    }

    public final int indexOf(Object obj) {
        return mo5960c().f2997c.indexOf(obj);
    }

    public final boolean isEmpty() {
        return mo5960c().f2997c.isEmpty();
    }

    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        return mo5960c().f2997c.lastIndexOf(obj);
    }

    public final ListIterator<T> listIterator() {
        return new C1400q(this, 0);
    }

    public final void prependStateRecord(C1407x xVar) {
        xVar.f3057b = this.f2996b;
        this.f2996b = (C1376a) xVar;
    }

    public final T remove(int i) {
        int i2;
        C7791c<? extends T> cVar;
        C1385f i3;
        boolean z;
        T t = get(i);
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i2 = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> B = cVar.mo5762B(i);
            if (C19383o.m32792b(B, cVar)) {
                break;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i3 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i3);
                    z = true;
                    if (aVar3.f2998d == i2) {
                        aVar3.mo5981c(B);
                        aVar3.f2998d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i3, this);
            }
        } while (!z);
        return t;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        C7791c<? extends T> cVar;
        boolean z;
        C1385f i2;
        C19383o.m32797g(collection, "elements");
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> removeAll = cVar.removeAll(collection);
            z = false;
            if (C19383o.m32792b(removeAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i2);
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(removeAll);
                        aVar3.f2998d++;
                        z = true;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return true;
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return mo5964e(new SnapshotStateList$retainAll$1(collection));
    }

    public final T set(int i, T t) {
        int i2;
        C7791c<? extends T> cVar;
        C1385f i3;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i2 = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> cVar2 = cVar.set(i, t);
            if (C19383o.m32792b(cVar2, cVar)) {
                break;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i3 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i3);
                    z = true;
                    if (aVar3.f2998d == i2) {
                        aVar3.mo5981c(cVar2);
                        aVar3.f2998d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i3, this);
            }
        } while (!z);
        return t2;
    }

    public final int size() {
        return mo5960c().f2997c.size();
    }

    public final List<T> subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > size()) {
            z = false;
        }
        if (z) {
            return new C1408y(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        C7791c<? extends T> cVar;
        boolean z;
        C1385f i2;
        C19383o.m32797g(collection, "elements");
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> addAll = cVar.addAll(collection);
            z = false;
            if (C19383o.m32792b(addAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i2);
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(addAll);
                        aVar3.f2998d++;
                        z = true;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return true;
    }

    public final ListIterator<T> listIterator(int i) {
        return new C1400q(this, i);
    }

    public final void add(int i, T t) {
        int i2;
        C7791c<? extends T> cVar;
        C1385f i3;
        boolean z;
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i2 = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> add = cVar.add(i, t);
            if (!C19383o.m32792b(add, cVar)) {
                synchronized (obj) {
                    C1376a aVar2 = this.f2996b;
                    synchronized (SnapshotKt.f2989c) {
                        i3 = SnapshotKt.m2910i();
                        C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i3);
                        z = true;
                        if (aVar3.f2998d == i2) {
                            aVar3.mo5981c(add);
                            aVar3.f2998d++;
                        } else {
                            z = false;
                        }
                    }
                    SnapshotKt.m2914m(i3, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    public final boolean remove(Object obj) {
        int i;
        C7791c<? extends T> cVar;
        boolean z;
        C1385f i2;
        do {
            Object obj2 = C1396n.f3037a;
            synchronized (obj2) {
                C1376a aVar = (C1376a) SnapshotKt.m2909h(this.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            C7791c<? extends T> remove = cVar.remove(obj);
            z = false;
            if (C19383o.m32792b(remove, cVar)) {
                return false;
            }
            synchronized (obj2) {
                C1376a aVar2 = this.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    C1376a aVar3 = (C1376a) SnapshotKt.m2922u(aVar2, this, i2);
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(remove);
                        aVar3.f2998d++;
                        z = true;
                    }
                }
                SnapshotKt.m2914m(i2, this);
            }
        } while (!z);
        return true;
    }
}
