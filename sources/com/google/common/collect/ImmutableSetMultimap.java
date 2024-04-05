package com.google.common.collect;

import com.google.common.base.C15788i;
import com.google.common.collect.C16213q1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0015b;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements C16217r1<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: g */
    public final transient ImmutableSet<V> f35952g;
    @RetainedWith
    @MonotonicNonNullDecl
    @LazyInit

    /* renamed from: h */
    public transient ImmutableSetMultimap<V, K> f35953h;
    @MonotonicNonNullDecl

    /* renamed from: i */
    public transient ImmutableSet<Map.Entry<K, V>> f35954i;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        @Weak

        /* renamed from: d */
        public final transient ImmutableSetMultimap<K, V> f35955d;

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f35955d = immutableSetMultimap;
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f35955d.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return false;
        }

        public int size() {
            return this.f35955d.size();
        }

        public C16170f2<Map.Entry<K, V>> iterator() {
            return this.f35955d.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C15975a<K, V> extends ImmutableMultimap.C15963c<K, V> {
        /* renamed from: a */
        public final Collection<V> mo56712a() {
            return CompactHashSet.create();
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final ImmutableMultimap.C15963c mo56666b(Object obj, Object obj2) {
            super.mo56666b(obj, obj2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final void mo56667c(Map.Entry entry) {
            super.mo56667c(entry);
        }

        /* renamed from: e */
        public final ImmutableSetMultimap<K, V> mo56789e() {
            return ImmutableSetMultimap.fromMapEntries(this.f35925a.entrySet(), (Comparator) null);
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public final void mo56790f(Object obj, Object obj2) {
            super.mo56666b(obj, obj2);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    public static final class C15976b {

        /* renamed from: a */
        public static final C16213q1.C16214a<ImmutableSetMultimap> f35956a = C16213q1.m26244a(ImmutableSetMultimap.class, "emptySet");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Comparator<? super V>, java.util.Comparator] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ImmutableSetMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableSet<V>> r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r3) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 != 0) goto L_0x000a
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.m25894of()
            goto L_0x000e
        L_0x000a:
            com.google.common.collect.RegularImmutableSortedSet r1 = com.google.common.collect.ImmutableSortedSet.emptySet(r3)
        L_0x000e:
            r0.f35952g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSetMultimap.<init>(com.google.common.collect.ImmutableMap, int, java.util.Comparator):void");
    }

    public static <K, V> C15975a<K, V> builder() {
        return new C15975a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C15975a aVar = new C15975a();
        for (Map.Entry c : iterable) {
            aVar.mo56667c(c);
        }
        return aVar.mo56789e();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.Comparator<? super V>, java.util.Comparator] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> r7, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r8) {
        /*
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000b
            com.google.common.collect.ImmutableSetMultimap r7 = m25904of()
            return r7
        L_0x000b:
            int r0 = r7.size()
            int r0 = r0 * 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = r1
        L_0x0019:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            if (r8 != 0) goto L_0x0036
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.copyOf(r3)
            goto L_0x003a
        L_0x0036:
            com.google.common.collect.ImmutableSortedSet r3 = com.google.common.collect.ImmutableSortedSet.copyOf(r8, r3)
        L_0x003a:
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0019
            int r5 = r2 + 1
            int r5 = r5 * 2
            int r6 = r0.length
            if (r5 <= r6) goto L_0x0050
            int r6 = r0.length
            int r5 = com.google.common.collect.ImmutableCollection.C15950b.m25825a(r6, r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
        L_0x0050:
            com.google.common.collect.C16203o.m26214a(r4, r3)
            int r5 = r2 * 2
            r0[r5] = r4
            int r4 = r2 * 2
            int r4 = r4 + 1
            r0[r4] = r3
            int r2 = r2 + 1
            int r3 = r3.size()
            int r3 = r3 + r1
            r1 = r3
            goto L_0x0019
        L_0x0066:
            com.google.common.collect.ImmutableSetMultimap r7 = new com.google.common.collect.ImmutableSetMultimap
            com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            r7.<init>(r0, r1, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSetMultimap.fromMapEntries(java.util.Collection, java.util.Comparator):com.google.common.collect.ImmutableSetMultimap");
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25904of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C15958b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableSet.C15974a aVar = comparator == null ? new ImmutableSet.C15974a() : new ImmutableSortedSet.C15981a(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        aVar.mo56784d(objectInputStream.readObject());
                    }
                    ImmutableSet f = aVar.mo56786f();
                    if (f.size() == readInt2) {
                        builder.mo56613b(readObject, f);
                        i2 += readInt2;
                        i++;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
                    }
                } else {
                    throw new InvalidObjectException(C0015b.m88g("Invalid value count ", readInt2));
                }
            }
            try {
                ImmutableMultimap.C15964d.f35926a.mo57719a(this, builder.mo56612a());
                C16213q1.C16214a<ImmutableMultimap> aVar2 = ImmutableMultimap.C15964d.f35927b;
                aVar2.getClass();
                try {
                    aVar2.f36314a.set(this, Integer.valueOf(i2));
                    C15976b.f35956a.mo57719a(this, comparator == null ? ImmutableSet.m25894of() : ImmutableSortedSet.emptySet(comparator));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            throw new InvalidObjectException(C0015b.m88g("Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C16213q1.m26249f(this, objectOutputStream);
    }

    @NullableDecl
    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.f35952g;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25905of(K k, V v) {
        C15975a builder = builder();
        builder.mo56790f(k, v);
        return builder.mo56789e();
    }

    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.f35953h;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        C15975a builder = builder();
        C16170f2 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo56790f(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> e = builder.mo56789e();
        e.f35953h = this;
        this.f35953h = e;
        return e;
    }

    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f35954i;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f35954i = entrySet;
        return entrySet;
    }

    public ImmutableSet<V> get(@NullableDecl K k) {
        return (ImmutableSet) C15788i.m25602a((ImmutableSet) this.map.get(k), this.f35952g);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(C16154c1<? extends K, ? extends V> c1Var) {
        c1Var.getClass();
        if (c1Var.isEmpty()) {
            return m25904of();
        }
        if (c1Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) c1Var;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(c1Var.asMap().entrySet(), (Comparator) null);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25906of(K k, V v, K k2, V v2) {
        C15975a builder = builder();
        builder.mo56790f(k, v);
        builder.mo56790f(k2, v2);
        return builder.mo56789e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25907of(K k, V v, K k2, V v2, K k3, V v3) {
        C15975a builder = builder();
        builder.mo56790f(k, v);
        builder.mo56790f(k2, v2);
        builder.mo56790f(k3, v3);
        return builder.mo56789e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25908of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C15975a builder = builder();
        builder.mo56790f(k, v);
        builder.mo56790f(k2, v2);
        builder.mo56790f(k3, v3);
        builder.mo56790f(k4, v4);
        return builder.mo56789e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m25909of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C15975a builder = builder();
        builder.mo56790f(k, v);
        builder.mo56790f(k2, v2);
        builder.mo56790f(k3, v3);
        builder.mo56790f(k4, v4);
        builder.mo56790f(k5, v5);
        return builder.mo56789e();
    }
}
