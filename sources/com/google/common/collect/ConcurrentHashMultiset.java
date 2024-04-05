package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.C16178h1;
import com.google.common.collect.C16213q1;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ConcurrentHashMultiset<E> extends C16156d<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public final transient ConcurrentMap<E, AtomicInteger> f35834d;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$a */
    public class C15925a extends C16164e0<E> {

        /* renamed from: b */
        public final /* synthetic */ Set f35835b;

        public C15925a(Set set) {
            this.f35835b = set;
        }

        public final boolean contains(@NullableDecl Object obj) {
            boolean z;
            if (obj == null) {
                return false;
            }
            Set set = this.f35835b;
            set.getClass();
            try {
                z = set.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        public final boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public final Object delegate() {
            return this.f35835b;
        }

        public final boolean remove(Object obj) {
            boolean z;
            if (obj == null) {
                return false;
            }
            Set set = this.f35835b;
            set.getClass();
            try {
                z = set.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        public final boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Collection m35103delegate() {
            return this.f35835b;
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Set<E> m35104delegate() {
            return this.f35835b;
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$b */
    public class C15926b extends AbstractIterator<C16178h1.C16179a<E>> {

        /* renamed from: d */
        public final Iterator<Map.Entry<E, AtomicInteger>> f35836d;

        public C15926b(ConcurrentHashMultiset concurrentHashMultiset) {
            this.f35836d = concurrentHashMultiset.f35834d.entrySet().iterator();
        }

        /* renamed from: a */
        public final Object mo56053a() {
            while (this.f35836d.hasNext()) {
                Map.Entry next = this.f35836d.next();
                int i = ((AtomicInteger) next.getValue()).get();
                if (i != 0) {
                    return new Multisets.ImmutableEntry(next.getKey(), i);
                }
            }
            this.f35745b = AbstractIterator.State.DONE;
            return null;
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$c */
    public class C15927c extends C16237x<C16178h1.C16179a<E>> {
        @NullableDecl

        /* renamed from: b */
        public C16178h1.C16179a<E> f35837b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f35838c;

        public C15927c(C15926b bVar) {
            this.f35838c = bVar;
        }

        public final Object delegate() {
            return this.f35838c;
        }

        public final Object next() {
            C16178h1.C16179a<E> aVar = (C16178h1.C16179a) super.next();
            this.f35837b = aVar;
            return aVar;
        }

        public final void remove() {
            C16203o.m26218e(this.f35837b != null);
            ConcurrentHashMultiset.this.setCount(this.f35837b.getElement(), 0);
            this.f35837b = null;
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$e */
    public static class C15929e {

        /* renamed from: a */
        public static final C16213q1.C16214a<ConcurrentHashMultiset> f35841a = C16213q1.m26244a(ConcurrentHashMultiset.class, "countMap");
    }

    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C15794l.m25612f(concurrentMap, "the backing map (%s) must be empty", concurrentMap.isEmpty());
        this.f35834d = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        C15929e.f35841a.mo57719a(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f35834d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r4.f35834d.putIfAbsent(r5, r2) == null) goto L_0x005e;
     */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int add(E r5, int r6) {
        /*
            r4 = this;
            r5.getClass()
            if (r6 != 0) goto L_0x000a
            int r5 = r4.count(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurences"
            com.google.common.collect.C16203o.m26217d(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f35834d
            java.lang.Object r0 = com.google.common.collect.Maps.m26057e(r5, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f35834d
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x0049
            int r3 = com.google.common.math.C16284b.m26353a(r2, r6)     // Catch:{ ArithmeticException -> 0x003b }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003b }
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Overflow adding "
            java.lang.String r1 = " occurrences to a count of "
            java.lang.String r6 = android.support.p013v4.media.session.C0087d.m235e(r0, r6, r1, r2)
            r5.<init>(r6)
            throw r5
        L_0x0049:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f35834d
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x005e
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f35834d
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.add(java.lang.Object, int):int");
    }

    public void clear() {
        this.f35834d.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    public int count(@NullableDecl Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m26057e(obj, this.f35834d);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public Set<E> createElementSet() {
        return new C15925a(this.f35834d.keySet());
    }

    @Deprecated
    public Set<C16178h1.C16179a<E>> createEntrySet() {
        return new C15928d();
    }

    public int distinctElements() {
        return this.f35834d.size();
    }

    /* renamed from: e */
    public final ArrayList mo56389e() {
        int size = size();
        C16203o.m26215b(size, "arraySize");
        ArrayList arrayList = new ArrayList(Ints.m26384b(((long) size) + 5 + ((long) (size / 10))));
        for (C16178h1.C16179a aVar : entrySet()) {
            Object element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayList.add(element);
            }
        }
        return arrayList;
    }

    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public Iterator<C16178h1.C16179a<E>> entryIterator() {
        return new C15927c(new C15926b(this));
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public boolean isEmpty() {
        return this.f35834d.isEmpty();
    }

    public Iterator<E> iterator() {
        return Multisets.m26081d(this);
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return count(obj);
        }
        C16203o.m26217d(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m26057e(obj, this.f35834d);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.f35834d.remove(obj, atomicInteger);
        }
        return i2;
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(@NullableDecl Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        C16203o.m26217d(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m26057e(obj, this.f35834d);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.f35834d.remove(obj, atomicInteger);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.f35834d.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setCount(E r5, int r6) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.String r0 = "count"
            com.google.common.collect.C16203o.m26215b(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f35834d
            java.lang.Object r0 = com.google.common.collect.Maps.m26057e(r5, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.f35834d
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f35834d
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.f35834d
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.f35834d
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.setCount(java.lang.Object, int):int");
    }

    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.f35834d.values()) {
            j += (long) atomicInteger.get();
        }
        return Ints.m26384b(j);
    }

    public Object[] toArray() {
        return mo56389e().toArray();
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> create = create();
        C16201n0.m26210a(iterable, create);
        return create;
    }

    public <T> T[] toArray(T[] tArr) {
        return mo56389e().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$d */
    public class C15928d extends C16156d<E>.b {
        public C15928d() {
            super();
        }

        /* renamed from: a */
        public final C16178h1 mo56398a() {
            return ConcurrentHashMultiset.this;
        }

        public final Object[] toArray() {
            int size = size();
            C16203o.m26215b(size, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.m26384b(((long) size) + 5 + ((long) (size / 10))));
            Iterators.m25978a(arrayList, iterator());
            return arrayList.toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            C16203o.m26215b(size, "arraySize");
            ArrayList arrayList = new ArrayList(Ints.m26384b(((long) size) + 5 + ((long) (size / 10))));
            Iterators.m25978a(arrayList, iterator());
            return arrayList.toArray(tArr);
        }
    }

    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
        e.getClass();
        C16203o.m26215b(i, "oldCount");
        C16203o.m26215b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m26057e(e, this.f35834d);
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.f35834d.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.f35834d.putIfAbsent(e, atomicInteger2) == null || this.f35834d.replace(e, atomicInteger, atomicInteger2)) {
                        return true;
                    }
                    return false;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.f35834d.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0) {
                return true;
            }
            if (this.f35834d.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                return true;
            }
            return false;
        }
    }
}
