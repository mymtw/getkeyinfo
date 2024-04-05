package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C19394m;
import kotlin.collections.C19332y;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Ref$IntRef;
import p228s.C7791c;
import p628nj.C18263b;
import p755lq.C19875a;
import p755lq.C19877c;

/* renamed from: androidx.compose.runtime.snapshots.y */
public final class C1408y<T> implements List<T>, C19877c {

    /* renamed from: b */
    public final SnapshotStateList<T> f3058b;

    /* renamed from: c */
    public final int f3059c;

    /* renamed from: d */
    public int f3060d;

    /* renamed from: e */
    public int f3061e;

    /* renamed from: androidx.compose.runtime.snapshots.y$a */
    public static final class C1409a implements ListIterator<T>, C19875a {

        /* renamed from: b */
        public final /* synthetic */ Ref$IntRef f3062b;

        /* renamed from: c */
        public final /* synthetic */ C1408y<T> f3063c;

        public C1409a(Ref$IntRef ref$IntRef, C1408y<T> yVar) {
            this.f3062b = ref$IntRef;
            this.f3063c = yVar;
        }

        public final void add(Object obj) {
            Object obj2 = C1396n.f3037a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        public final boolean hasNext() {
            return this.f3062b.element < this.f3063c.f3061e - 1;
        }

        public final boolean hasPrevious() {
            return this.f3062b.element >= 0;
        }

        public final T next() {
            int i = this.f3062b.element + 1;
            C1396n.m2995a(i, this.f3063c.f3061e);
            this.f3062b.element = i;
            return this.f3063c.get(i);
        }

        public final int nextIndex() {
            return this.f3062b.element + 1;
        }

        public final T previous() {
            int i = this.f3062b.element;
            C1396n.m2995a(i, this.f3063c.f3061e);
            this.f3062b.element = i - 1;
            return this.f3063c.get(i);
        }

        public final int previousIndex() {
            return this.f3062b.element;
        }

        public final void remove() {
            Object obj = C1396n.f3037a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        public final void set(Object obj) {
            Object obj2 = C1396n.f3037a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public C1408y(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        C19383o.m32797g(snapshotStateList, "parentList");
        this.f3058b = snapshotStateList;
        this.f3059c = i;
        this.f3060d = snapshotStateList.mo5955a();
        this.f3061e = i2 - i;
    }

    /* renamed from: a */
    public final void mo6068a() {
        if (this.f3058b.mo5955a() != this.f3060d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean add(T t) {
        mo6068a();
        this.f3058b.add(this.f3059c + this.f3061e, t);
        this.f3061e++;
        this.f3060d = this.f3058b.mo5955a();
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        C19383o.m32797g(collection, "elements");
        return addAll(this.f3061e, collection);
    }

    public final void clear() {
        int i;
        C7791c<? extends T> cVar;
        C1385f i2;
        boolean z;
        if (this.f3061e > 0) {
            mo6068a();
            SnapshotStateList<T> snapshotStateList = this.f3058b;
            int i3 = this.f3059c;
            int i4 = this.f3061e + i3;
            snapshotStateList.getClass();
            do {
                Object obj = C1396n.f3037a;
                synchronized (obj) {
                    SnapshotStateList.C1376a aVar = (SnapshotStateList.C1376a) SnapshotKt.m2909h(snapshotStateList.f2996b, SnapshotKt.m2910i());
                    i = aVar.f2998d;
                    cVar = aVar.f2997c;
                    C19394m mVar = C19394m.f43287a;
                }
                C19383o.m32794d(cVar);
                PersistentVectorBuilder builder = cVar.builder();
                builder.subList(i3, i4).clear();
                C7791c e = builder.mo5726e();
                if (C19383o.m32792b(e, cVar)) {
                    break;
                }
                synchronized (obj) {
                    SnapshotStateList.C1376a aVar2 = snapshotStateList.f2996b;
                    synchronized (SnapshotKt.f2989c) {
                        i2 = SnapshotKt.m2910i();
                        SnapshotStateList.C1376a aVar3 = (SnapshotStateList.C1376a) SnapshotKt.m2922u(aVar2, snapshotStateList, i2);
                        z = true;
                        if (aVar3.f2998d == i) {
                            aVar3.mo5981c(e);
                            aVar3.f2998d++;
                        } else {
                            z = false;
                        }
                    }
                    SnapshotKt.m2914m(i2, snapshotStateList);
                }
            } while (!z);
            this.f3061e = 0;
            this.f3060d = this.f3058b.mo5955a();
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    public final T get(int i) {
        mo6068a();
        C1396n.m2995a(i, this.f3061e);
        return this.f3058b.get(this.f3059c + i);
    }

    public final int indexOf(Object obj) {
        mo6068a();
        int i = this.f3059c;
        Iterator it = C19388s.m32816D0(i, this.f3061e + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((C19332y) it).nextInt();
            if (C19383o.m32792b(obj, this.f3058b.get(nextInt))) {
                return nextInt - this.f3059c;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f3061e == 0;
    }

    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        mo6068a();
        int i = this.f3059c + this.f3061e;
        while (true) {
            i--;
            if (i < this.f3059c) {
                return -1;
            }
            if (C19383o.m32792b(obj, this.f3058b.get(i))) {
                return i - this.f3059c;
            }
        }
    }

    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
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
                if (remove((Object) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        int i;
        C7791c<? extends T> cVar;
        C1385f i2;
        boolean z;
        C19383o.m32797g(collection, "elements");
        mo6068a();
        SnapshotStateList<T> snapshotStateList = this.f3058b;
        int i3 = this.f3059c;
        int i4 = this.f3061e + i3;
        snapshotStateList.getClass();
        int size = snapshotStateList.size();
        do {
            Object obj = C1396n.f3037a;
            synchronized (obj) {
                SnapshotStateList.C1376a aVar = (SnapshotStateList.C1376a) SnapshotKt.m2909h(snapshotStateList.f2996b, SnapshotKt.m2910i());
                i = aVar.f2998d;
                cVar = aVar.f2997c;
                C19394m mVar = C19394m.f43287a;
            }
            C19383o.m32794d(cVar);
            PersistentVectorBuilder builder = cVar.builder();
            builder.subList(i3, i4).retainAll(collection);
            C7791c e = builder.mo5726e();
            if (C19383o.m32792b(e, cVar)) {
                break;
            }
            synchronized (obj) {
                SnapshotStateList.C1376a aVar2 = snapshotStateList.f2996b;
                synchronized (SnapshotKt.f2989c) {
                    i2 = SnapshotKt.m2910i();
                    SnapshotStateList.C1376a aVar3 = (SnapshotStateList.C1376a) SnapshotKt.m2922u(aVar2, snapshotStateList, i2);
                    if (aVar3.f2998d == i) {
                        aVar3.mo5981c(e);
                        aVar3.f2998d++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.m2914m(i2, snapshotStateList);
            }
        } while (!z);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f3060d = this.f3058b.mo5955a();
            this.f3061e -= size2;
        }
        return size2 > 0;
    }

    public final T set(int i, T t) {
        C1396n.m2995a(i, this.f3061e);
        mo6068a();
        T t2 = this.f3058b.set(i + this.f3059c, t);
        this.f3060d = this.f3058b.mo5955a();
        return t2;
    }

    public final int size() {
        return this.f3061e;
    }

    public final List<T> subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > this.f3061e) {
            z = false;
        }
        if (z) {
            mo6068a();
            SnapshotStateList<T> snapshotStateList = this.f3058b;
            int i3 = this.f3059c;
            return new C1408y(snapshotStateList, i + i3, i2 + i3);
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

    public final ListIterator<T> listIterator(int i) {
        mo6068a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new C1409a(ref$IntRef, this);
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        C19383o.m32797g(collection, "elements");
        mo6068a();
        boolean addAll = this.f3058b.addAll(i + this.f3059c, collection);
        if (addAll) {
            this.f3061e = collection.size() + this.f3061e;
            this.f3060d = this.f3058b.mo5955a();
        }
        return addAll;
    }

    public final T remove(int i) {
        mo6068a();
        T remove = this.f3058b.remove(this.f3059c + i);
        this.f3061e--;
        this.f3060d = this.f3058b.mo5955a();
        return remove;
    }

    public final void add(int i, T t) {
        mo6068a();
        this.f3058b.add(this.f3059c + i, t);
        this.f3061e++;
        this.f3060d = this.f3058b.mo5955a();
    }
}
