package com.google.common.collect;

import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.C16014h;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class MapMakerInternalMap<K, V, E extends C16014h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    public static final int CONTAINS_VALUE_RETRIES = 3;
    public static final int DRAIN_MAX = 16;
    public static final int DRAIN_THRESHOLD = 63;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MAX_SEGMENTS = 65536;
    public static final C16034v<Object, Object, C16010d> UNSET_WEAK_VALUE_REFERENCE = new C16007a();
    private static final long serialVersionUID = 5;
    public final int concurrencyLevel;
    public final transient C16015i<K, V, E, S> entryHelper;
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> entrySet;
    public final Equivalence<Object> keyEquivalence;
    @MonotonicNonNullDecl
    public transient Set<K> keySet;
    public final transient int segmentMask;
    public final transient int segmentShift;
    public final transient Segment<K, V, E, S>[] segments;
    @MonotonicNonNullDecl
    public transient Collection<V> values;

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).mo56934c();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    public enum Strength {
        STRONG {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C16019m<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C16019m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }

        public C16019m<K> castForTesting(C16014h<K, MapMaker.Dummy, ?> hVar) {
            return (C16019m) hVar;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C16021n<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, C16021n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }

        public C16021n<K, V> castForTesting(C16014h<K, V, ?> hVar) {
            return (C16021n) hVar;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C16023o<K, V>, StrongKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C16023o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        public C16034v<K, V, C16023o<K, V>> getWeakValueReferenceForTesting(C16014h<K, V, ?> hVar) {
            return castForTesting((C16014h) hVar).f36063e;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        public C16034v<K, V, C16023o<K, V>> newWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, V v) {
            return new C16035w(this.queueForValues, v, castForTesting((C16014h) hVar));
        }

        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        public void setWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, C16034v<K, V, ? extends C16014h<K, V, ?>> vVar) {
            C16023o castForTesting = castForTesting((C16014h) hVar);
            C16034v<K, V, C16023o<K, V>> vVar2 = castForTesting.f36063e;
            castForTesting.f36063e = vVar;
            vVar2.clear();
        }

        public C16023o<K, V> castForTesting(C16014h<K, V, ?> hVar) {
            return (C16023o) hVar;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C16027r<K>, WeakKeyDummyValueSegment<K>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C16027r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }

        public C16027r<K> castForTesting(C16014h<K, MapMaker.Dummy, ?> hVar) {
            return (C16027r) hVar;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C16029s<K, V>, WeakKeyStrongValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, C16029s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }

        public C16029s<K, V> castForTesting(C16014h<K, V, ?> hVar) {
            return (C16029s) hVar;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C16031t<K, V>, WeakKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C16031t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        public C16034v<K, V, C16031t<K, V>> getWeakValueReferenceForTesting(C16014h<K, V, ?> hVar) {
            return castForTesting((C16014h) hVar).f36069d;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        public C16034v<K, V, C16031t<K, V>> newWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, V v) {
            return new C16035w(this.queueForValues, v, castForTesting((C16014h) hVar));
        }

        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        public void setWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, C16034v<K, V, ? extends C16014h<K, V, ?>> vVar) {
            C16031t castForTesting = castForTesting((C16014h) hVar);
            C16034v<K, V, C16031t<K, V>> vVar2 = castForTesting.f36069d;
            castForTesting.f36069d = vVar;
            vVar2.clear();
        }

        public C16031t<K, V> castForTesting(C16014h<K, V, ?> hVar) {
            return (C16031t) hVar;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$a */
    public static class C16007a implements C16034v<Object, Object, C16010d> {
        /* renamed from: a */
        public final C16034v mo57019a(ReferenceQueue referenceQueue, C16033u uVar) {
            C16010d dVar = (C16010d) uVar;
            return this;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C16014h mo57020c() {
            return null;
        }

        public final void clear() {
        }

        public final Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$b */
    public static abstract class C16008b<K, V, E extends C16014h<K, V, E>> implements C16014h<K, V, E> {

        /* renamed from: b */
        public final K f36045b;

        /* renamed from: c */
        public final int f36046c;
        @NullableDecl

        /* renamed from: d */
        public final E f36047d;

        public C16008b(K k, int i, @NullableDecl E e) {
            this.f36045b = k;
            this.f36046c = i;
            this.f36047d = e;
        }

        public final int getHash() {
            return this.f36046c;
        }

        public final K getKey() {
            return this.f36045b;
        }

        public final E getNext() {
            return this.f36047d;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$c */
    public static abstract class C16009c<K, V, E extends C16014h<K, V, E>> extends WeakReference<K> implements C16014h<K, V, E> {

        /* renamed from: b */
        public final int f36048b;
        @NullableDecl

        /* renamed from: c */
        public final E f36049c;

        public C16009c(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl E e) {
            super(k, referenceQueue);
            this.f36048b = i;
            this.f36049c = e;
        }

        public final int getHash() {
            return this.f36048b;
        }

        public final K getKey() {
            return get();
        }

        public final E getNext() {
            return this.f36049c;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$d */
    public static final class C16010d implements C16014h<Object, Object, C16010d> {
        public C16010d() {
            throw new AssertionError();
        }

        public final int getHash() {
            throw new AssertionError();
        }

        public final Object getKey() {
            throw new AssertionError();
        }

        public final C16014h getNext() {
            throw new AssertionError();
        }

        public final Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$e */
    public final class C16011e extends MapMakerInternalMap<K, V, E, S>.g<Map.Entry<K, V>> {
        public C16011e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final Object next() {
            return mo57036c();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$f */
    public final class C16012f extends C16018l<Map.Entry<K, V>> {
        public C16012f() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r0 = r3.f36050b.get((r0 = r4.getKey()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                com.google.common.base.Equivalence r2 = r2.valueEquivalence()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.C16012f.contains(java.lang.Object):boolean");
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16011e(MapMakerInternalMap.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
            r0 = r4.getKey();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.C16012f.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$g */
    public abstract class C16013g<T> implements Iterator<T> {

        /* renamed from: b */
        public int f36051b;

        /* renamed from: c */
        public int f36052c = -1;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public Segment<K, V, E, S> f36053d;
        @MonotonicNonNullDecl

        /* renamed from: e */
        public AtomicReferenceArray<E> f36054e;
        @NullableDecl

        /* renamed from: f */
        public E f36055f;
        @NullableDecl

        /* renamed from: g */
        public MapMakerInternalMap<K, V, E, S>.x f36056g;
        @NullableDecl

        /* renamed from: h */
        public MapMakerInternalMap<K, V, E, S>.x f36057h;

        public C16013g() {
            this.f36051b = MapMakerInternalMap.this.segments.length - 1;
            mo57034a();
        }

        /* renamed from: a */
        public final void mo57034a() {
            boolean z;
            this.f36056g = null;
            E e = this.f36055f;
            if (e != null) {
                while (true) {
                    E next = e.getNext();
                    this.f36055f = next;
                    if (next == null) {
                        break;
                    } else if (mo57035b(next)) {
                        z = true;
                        break;
                    } else {
                        e = this.f36055f;
                    }
                }
            }
            z = false;
            if (!z && !mo57037d()) {
                while (true) {
                    int i = this.f36051b;
                    if (i >= 0) {
                        Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                        this.f36051b = i - 1;
                        Segment<K, V, E, S> segment = segmentArr[i];
                        this.f36053d = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f36053d.table;
                            this.f36054e = atomicReferenceArray;
                            this.f36052c = atomicReferenceArray.length() - 1;
                            if (mo57037d()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo57035b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue != null) {
                    this.f36056g = new C16036x(key, liveValue);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f36053d.postReadCleanup();
            }
        }

        /* renamed from: c */
        public final MapMakerInternalMap<K, V, E, S>.x mo57036c() {
            MapMakerInternalMap<K, V, E, S>.x xVar = this.f36056g;
            if (xVar != null) {
                this.f36057h = xVar;
                mo57034a();
                return this.f36057h;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public final boolean mo57037d() {
            while (true) {
                int i = this.f36052c;
                boolean z = false;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f36054e;
                this.f36052c = i - 1;
                E e = (C16014h) atomicReferenceArray.get(i);
                this.f36055f = e;
                if (e != null) {
                    if (mo57035b(e)) {
                        break;
                    }
                    E e2 = this.f36055f;
                    if (e2 != null) {
                        while (true) {
                            E next = e2.getNext();
                            this.f36055f = next;
                            if (next == null) {
                                break;
                            } else if (mo57035b(next)) {
                                z = true;
                                break;
                            } else {
                                e2 = this.f36055f;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
            return true;
        }

        public final boolean hasNext() {
            return this.f36056g != null;
        }

        public final void remove() {
            C16203o.m26218e(this.f36057h != null);
            MapMakerInternalMap.this.remove(this.f36057h.f36072b);
            this.f36057h = null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$h */
    public interface C16014h<K, V, E extends C16014h<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$i */
    public interface C16015i<K, V, E extends C16014h<K, V, E>, S extends Segment<K, V, E, S>> {
        /* renamed from: a */
        E mo57040a(S s, E e, @NullableDecl E e2);

        /* renamed from: b */
        Strength mo57041b();

        /* renamed from: c */
        void mo57042c(S s, E e, V v);

        /* renamed from: d */
        E mo57043d(S s, K k, int i, @NullableDecl E e);

        /* renamed from: e */
        Strength mo57044e();

        /* renamed from: f */
        S mo57045f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$j */
    public final class C16016j extends MapMakerInternalMap<K, V, E, S>.g<K> {
        public C16016j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final K next() {
            return mo57036c().f36072b;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$k */
    public final class C16017k extends C16018l<K> {
        public C16017k() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new C16016j(MapMakerInternalMap.this);
        }

        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$l */
    public static abstract class C16018l<E> extends AbstractSet<E> {
        public final Object[] toArray() {
            return MapMakerInternalMap.access$900(this).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.access$900(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$m */
    public static final class C16019m<K> extends C16008b<K, MapMaker.Dummy, C16019m<K>> {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        public static final class C16020a<K> implements C16015i<K, MapMaker.Dummy, C16019m<K>, StrongKeyDummyValueSegment<K>> {

            /* renamed from: a */
            public static final C16020a<?> f36060a = new C16020a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                StrongKeyDummyValueSegment strongKeyDummyValueSegment = (StrongKeyDummyValueSegment) segment;
                C16019m mVar = (C16019m) hVar;
                return new C16019m(mVar.f36045b, mVar.f36046c, (C16019m) hVar2);
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.STRONG;
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo57042c(Segment segment, C16014h hVar, Object obj) {
                StrongKeyDummyValueSegment strongKeyDummyValueSegment = (StrongKeyDummyValueSegment) segment;
                C16019m mVar = (C16019m) hVar;
                MapMaker.Dummy dummy = (MapMaker.Dummy) obj;
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                StrongKeyDummyValueSegment strongKeyDummyValueSegment = (StrongKeyDummyValueSegment) segment;
                return new C16019m(obj, i, (C16019m) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16019m(K k, int i, @NullableDecl C16019m<K> mVar) {
            super(k, i, mVar);
        }

        public final Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$n */
    public static final class C16021n<K, V> extends C16008b<K, V, C16021n<K, V>> {
        @NullableDecl

        /* renamed from: e */
        public volatile V f36061e = null;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        public static final class C16022a<K, V> implements C16015i<K, V, C16021n<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final C16022a<?, ?> f36062a = new C16022a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                StrongKeyStrongValueSegment strongKeyStrongValueSegment = (StrongKeyStrongValueSegment) segment;
                C16021n nVar = (C16021n) hVar;
                C16021n nVar2 = new C16021n(nVar.f36045b, nVar.f36046c, (C16021n) hVar2);
                nVar2.f36061e = nVar.f36061e;
                return nVar2;
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.STRONG;
            }

            /* renamed from: c */
            public final void mo57042c(Segment segment, C16014h hVar, Object obj) {
                StrongKeyStrongValueSegment strongKeyStrongValueSegment = (StrongKeyStrongValueSegment) segment;
                ((C16021n) hVar).f36061e = obj;
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                StrongKeyStrongValueSegment strongKeyStrongValueSegment = (StrongKeyStrongValueSegment) segment;
                return new C16021n(obj, i, (C16021n) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16021n(K k, int i, @NullableDecl C16021n<K, V> nVar) {
            super(k, i, nVar);
        }

        @NullableDecl
        public final V getValue() {
            return this.f36061e;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$o */
    public static final class C16023o<K, V> extends C16008b<K, V, C16023o<K, V>> implements C16033u<K, V, C16023o<K, V>> {

        /* renamed from: e */
        public volatile C16034v<K, V, C16023o<K, V>> f36063e = MapMakerInternalMap.unsetWeakValueReference();

        /* renamed from: com.google.common.collect.MapMakerInternalMap$o$a */
        public static final class C16024a<K, V> implements C16015i<K, V, C16023o<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final C16024a<?, ?> f36064a = new C16024a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                C16023o oVar = (C16023o) hVar;
                C16023o oVar2 = (C16023o) hVar2;
                if (Segment.isCollected(oVar)) {
                    return null;
                }
                ReferenceQueue access$100 = strongKeyWeakValueSegment.queueForValues;
                C16023o oVar3 = new C16023o(oVar.f36045b, oVar.f36046c, oVar2);
                oVar3.f36063e = oVar.f36063e.mo57019a(access$100, oVar3);
                return oVar3;
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.WEAK;
            }

            /* renamed from: c */
            public final void mo57042c(Segment segment, C16014h hVar, Object obj) {
                C16023o oVar = (C16023o) hVar;
                ReferenceQueue access$100 = ((StrongKeyWeakValueSegment) segment).queueForValues;
                C16034v<K, V, C16023o<K, V>> vVar = oVar.f36063e;
                oVar.f36063e = new C16035w(access$100, obj, oVar);
                vVar.clear();
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                return new C16023o(obj, i, (C16023o) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.STRONG;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16023o(K k, int i, @NullableDecl C16023o<K, V> oVar) {
            super(k, i, oVar);
        }

        public final V getValue() {
            return this.f36063e.get();
        }

        public final C16034v<K, V, C16023o<K, V>> getValueReference() {
            return this.f36063e;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$p */
    public final class C16025p extends MapMakerInternalMap<K, V, E, S>.g<V> {
        public C16025p(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public final V next() {
            return mo57036c().f36073c;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$q */
    public final class C16026q extends AbstractCollection<V> {
        public C16026q() {
        }

        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C16025p(MapMakerInternalMap.this);
        }

        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        public final Object[] toArray() {
            return MapMakerInternalMap.access$900(this).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.access$900(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$r */
    public static final class C16027r<K> extends C16009c<K, MapMaker.Dummy, C16027r<K>> {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        public static final class C16028a<K> implements C16015i<K, MapMaker.Dummy, C16027r<K>, WeakKeyDummyValueSegment<K>> {

            /* renamed from: a */
            public static final C16028a<?> f36066a = new C16028a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                C16027r rVar = (C16027r) hVar;
                C16027r rVar2 = (C16027r) hVar2;
                if (rVar.get() == null) {
                    return null;
                }
                return new C16027r(weakKeyDummyValueSegment.queueForKeys, rVar.get(), rVar.f36048b, rVar2);
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.STRONG;
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo57042c(Segment segment, C16014h hVar, Object obj) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                C16027r rVar = (C16027r) hVar;
                MapMaker.Dummy dummy = (MapMaker.Dummy) obj;
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                return new C16027r(((WeakKeyDummyValueSegment) segment).queueForKeys, obj, i, (C16027r) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.WEAK;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16027r(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C16027r<K> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        public final Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$s */
    public static final class C16029s<K, V> extends C16009c<K, V, C16029s<K, V>> {
        @NullableDecl

        /* renamed from: d */
        public volatile V f36067d = null;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$s$a */
        public static final class C16030a<K, V> implements C16015i<K, V, C16029s<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final C16030a<?, ?> f36068a = new C16030a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                C16029s sVar = (C16029s) hVar;
                C16029s sVar2 = (C16029s) hVar2;
                if (sVar.get() == null) {
                    return null;
                }
                C16029s sVar3 = new C16029s(weakKeyStrongValueSegment.queueForKeys, sVar.get(), sVar.f36048b, sVar2);
                sVar3.f36067d = sVar.f36067d;
                return sVar3;
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.STRONG;
            }

            /* renamed from: c */
            public final void mo57042c(Segment segment, C16014h hVar, Object obj) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                ((C16029s) hVar).f36067d = obj;
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                return new C16029s(((WeakKeyStrongValueSegment) segment).queueForKeys, obj, i, (C16029s) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.WEAK;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16029s(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C16029s<K, V> sVar) {
            super(referenceQueue, k, i, sVar);
        }

        @NullableDecl
        public final V getValue() {
            return this.f36067d;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$t */
    public static final class C16031t<K, V> extends C16009c<K, V, C16031t<K, V>> implements C16033u<K, V, C16031t<K, V>> {

        /* renamed from: d */
        public volatile C16034v<K, V, C16031t<K, V>> f36069d = MapMakerInternalMap.unsetWeakValueReference();

        /* renamed from: com.google.common.collect.MapMakerInternalMap$t$a */
        public static final class C16032a<K, V> implements C16015i<K, V, C16031t<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final C16032a<?, ?> f36070a = new C16032a<>();

            /* renamed from: a */
            public final C16014h mo57040a(Segment segment, C16014h hVar, @NullableDecl C16014h hVar2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                C16031t tVar = (C16031t) hVar;
                C16031t tVar2 = (C16031t) hVar2;
                if (tVar.get() == null || Segment.isCollected(tVar)) {
                    return null;
                }
                ReferenceQueue access$400 = weakKeyWeakValueSegment.queueForKeys;
                ReferenceQueue access$500 = weakKeyWeakValueSegment.queueForValues;
                C16031t tVar3 = new C16031t(access$400, tVar.get(), tVar.f36048b, tVar2);
                tVar3.f36069d = tVar.f36069d.mo57019a(access$500, tVar3);
                return tVar3;
            }

            /* renamed from: b */
            public final Strength mo57041b() {
                return Strength.WEAK;
            }

            /* renamed from: c */
            public final void mo57042c(Segment segment, C16014h hVar, Object obj) {
                C16031t tVar = (C16031t) hVar;
                ReferenceQueue access$500 = ((WeakKeyWeakValueSegment) segment).queueForValues;
                C16034v<K, V, C16031t<K, V>> vVar = tVar.f36069d;
                tVar.f36069d = new C16035w(access$500, obj, tVar);
                vVar.clear();
            }

            /* renamed from: d */
            public final C16014h mo57043d(Segment segment, Object obj, int i, @NullableDecl C16014h hVar) {
                return new C16031t(((WeakKeyWeakValueSegment) segment).queueForKeys, obj, i, (C16031t) hVar);
            }

            /* renamed from: e */
            public final Strength mo57044e() {
                return Strength.WEAK;
            }

            /* renamed from: f */
            public final Segment mo57045f(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i, i2);
            }
        }

        public C16031t(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C16031t<K, V> tVar) {
            super(referenceQueue, k, i, tVar);
        }

        public final V getValue() {
            return this.f36069d.get();
        }

        public final C16034v<K, V, C16031t<K, V>> getValueReference() {
            return this.f36069d;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$u */
    public interface C16033u<K, V, E extends C16014h<K, V, E>> extends C16014h<K, V, E> {
        C16034v<K, V, E> getValueReference();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$v */
    public interface C16034v<K, V, E extends C16014h<K, V, E>> {
        /* renamed from: a */
        C16034v mo57019a(ReferenceQueue referenceQueue, C16033u uVar);

        /* renamed from: c */
        E mo57020c();

        void clear();

        @NullableDecl
        V get();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$w */
    public static final class C16035w<K, V, E extends C16014h<K, V, E>> extends WeakReference<V> implements C16034v<K, V, E> {
        @Weak

        /* renamed from: b */
        public final E f36071b;

        public C16035w(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f36071b = e;
        }

        /* renamed from: a */
        public final C16034v mo57019a(ReferenceQueue referenceQueue, C16033u uVar) {
            return new C16035w(referenceQueue, get(), uVar);
        }

        /* renamed from: c */
        public final E mo57020c() {
            return this.f36071b;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$x */
    public final class C16036x extends C16144b<K, V> {

        /* renamed from: b */
        public final K f36072b;

        /* renamed from: c */
        public V f36073c;

        public C16036x(K k, V v) {
            this.f36072b = k;
            this.f36073c = v;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f36072b.equals(entry.getKey()) && this.f36073c.equals(entry.getValue());
        }

        public final K getKey() {
            return this.f36072b;
        }

        public final V getValue() {
            return this.f36073c;
        }

        public final int hashCode() {
            return this.f36072b.hashCode() ^ this.f36073c.hashCode();
        }

        public final V setValue(V v) {
            V put = MapMakerInternalMap.this.put(this.f36072b, v);
            this.f36073c = v;
            return put;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, C16015i<K, V, E, S> iVar) {
        int i = mapMaker.f36041c;
        this.concurrencyLevel = Math.min(i == -1 ? 4 : i, 65536);
        this.keyEquivalence = (Equivalence) C15788i.m25602a(mapMaker.f36044f, mapMaker.mo56932a().defaultEquivalence());
        this.entryHelper = iVar;
        int i2 = mapMaker.f36040b;
        int min = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.concurrencyLevel) {
            i5++;
            i6 <<= 1;
        }
        this.segmentShift = 32 - i5;
        this.segmentMask = i6 - 1;
        this.segments = newSegmentArray(i6);
        int i7 = min / i6;
        while (i4 < (i6 * i7 < min ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i3 < segmentArr.length) {
                segmentArr[i3] = createSegment(i4, -1);
                i3++;
            } else {
                return;
            }
        }
    }

    public static ArrayList access$900(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.m25978a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends C16014h<K, V, ?>, ?> create(MapMaker mapMaker) {
        Strength a = mapMaker.mo56932a();
        Strength strength = Strength.STRONG;
        if (a == strength && mapMaker.mo56933b() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C16021n.C16022a.f36062a);
        }
        if (mapMaker.mo56932a() == strength && mapMaker.mo56933b() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, C16023o.C16024a.f36064a);
        }
        Strength a2 = mapMaker.mo56932a();
        Strength strength2 = Strength.WEAK;
        if (a2 == strength2 && mapMaker.mo56933b() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C16029s.C16030a.f36068a);
        }
        if (mapMaker.mo56932a() == strength2 && mapMaker.mo56933b() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, C16031t.C16032a.f36070a);
        }
        throw new AssertionError();
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends C16014h<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength a = mapMaker.mo56932a();
        Strength strength = Strength.STRONG;
        if (a == strength && mapMaker.mo56933b() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C16019m.C16020a.f36060a);
        }
        Strength a2 = mapMaker.mo56932a();
        Strength strength2 = Strength.WEAK;
        if (a2 == strength2 && mapMaker.mo56933b() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C16027r.C16028a.f36066a);
        }
        if (mapMaker.mo56933b() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    public static int rehash(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public static <K, V, E extends C16014h<K, V, E>> C16034v<K, V, E> unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    public void clear() {
        for (Segment<K, V, E, S> clear : this.segments) {
            clear.clear();
        }
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        Object obj2 = obj;
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = segmentArr.length;
            int i2 = z;
            while (i2 < length) {
                Segment<K, V, E, S> segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (C16014h hVar = (C16014h) atomicReferenceArray.get(i4); hVar != null; hVar = hVar.getNext()) {
                        V liveValue = segment.getLiveValue(hVar);
                        if (liveValue != null && valueEquivalence().equivalent(obj2, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
                i2++;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    public E copyEntry(E e, E e2) {
        return segmentFor(e.getHash()).copyEntry(e, e2);
    }

    public Segment<K, V, E, S> createSegment(int i, int i2) {
        return this.entryHelper.mo57045f(this, i, i2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C16012f fVar = new C16012f();
        this.entrySet = fVar;
        return fVar;
    }

    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    public E getEntry(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
    }

    public V getLiveValue(E e) {
        V value;
        if (e.getKey() == null || (value = e.getValue()) == null) {
            return null;
        }
        return value;
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        return j == 0;
    }

    public boolean isLiveForTesting(C16014h<K, V, ?> hVar) {
        return segmentFor(hVar.getHash()).getLiveValueForTesting(hVar) != null;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C16017k kVar = new C16017k();
        this.keySet = kVar;
        return kVar;
    }

    public Strength keyStrength() {
        return this.entryHelper.mo57044e();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    public void reclaimValue(C16034v<K, V, E> vVar) {
        E c = vVar.mo57020c();
        int hash = c.getHash();
        segmentFor(hash).reclaimValue(c.getKey(), hash, vVar);
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    public int size() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (Segment<K, V, E, S> segment : segmentArr) {
            j += (long) segment.count;
        }
        return Ints.m26384b(j);
    }

    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.mo57041b().defaultEquivalence();
    }

    public Strength valueStrength() {
        return this.entryHelper.mo57041b();
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        C16026q qVar = new C16026q();
        this.values = qVar;
        return qVar;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.mo57044e(), this.entryHelper.mo57041b(), this.keyEquivalence, this.entryHelper.mo57041b().defaultEquivalence(), this.concurrencyLevel, this);
    }

    public static abstract class AbstractSerializationProxy<K, V> extends C16232w<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final int concurrencyLevel;
        public transient ConcurrentMap<K, V> delegate;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        public void readEntries(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.delegate.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            int readInt = objectInputStream.readInt();
            MapMaker mapMaker = new MapMaker();
            int i = mapMaker.f36040b;
            boolean z = false;
            C15794l.m25620n(i, "initial capacity was already set to %s", i == -1);
            C15794l.m25613g(readInt >= 0);
            mapMaker.f36040b = readInt;
            mapMaker.mo56935d(this.keyStrength);
            Strength strength = this.valueStrength;
            Strength strength2 = mapMaker.f36043e;
            C15794l.m25622p(strength2, "Value strength was already set to %s", strength2 == null);
            strength.getClass();
            mapMaker.f36043e = strength;
            if (strength != Strength.STRONG) {
                mapMaker.f36039a = true;
            }
            Equivalence<Object> equivalence = this.keyEquivalence;
            Equivalence<Object> equivalence2 = mapMaker.f36044f;
            C15794l.m25622p(equivalence2, "key equivalence was already set to %s", equivalence2 == null);
            equivalence.getClass();
            mapMaker.f36044f = equivalence;
            mapMaker.f36039a = true;
            int i2 = this.concurrencyLevel;
            int i3 = mapMaker.f36041c;
            C15794l.m25620n(i3, "concurrency level was already set to %s", i3 == -1);
            if (i2 > 0) {
                z = true;
            }
            C15794l.m25613g(z);
            mapMaker.f36041c = i2;
            return mapMaker;
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry next : this.delegate.entrySet()) {
                objectOutputStream.writeObject(next.getKey());
                objectOutputStream.writeObject(next.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }

        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    @CanIgnoreReturnValue
    public boolean replace(K k, @NullableDecl V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    public static abstract class Segment<K, V, E extends C16014h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public volatile int count;
        @Weak
        public final MapMakerInternalMap<K, V, E, S> map;
        public final int maxSegmentSize;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<E> table;
        public int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            initTable(newEntryArray(i));
        }

        public static <K, V, E extends C16014h<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        public abstract E castForTesting(C16014h<K, V, ?> hVar);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        @CanIgnoreReturnValue
        public boolean clearValueForTesting(K k, int i, C16034v<K, V, ? extends C16014h<K, V, ?>> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else if (((C16033u) hVar2).getValueReference() == vVar) {
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    C16014h liveEntry = getLiveEntry(obj, i);
                    if (!(liveEntry == null || liveEntry.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                postReadCleanup();
                return false;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C16014h hVar = (C16014h) atomicReferenceArray.get(i); hVar != null; hVar = hVar.getNext()) {
                            Object liveValue = getLiveValue(hVar);
                            if (liveValue != null) {
                                if (this.map.valueEquivalence().equivalent(obj, liveValue)) {
                                    postReadCleanup();
                                    return true;
                                }
                            }
                        }
                    }
                }
                postReadCleanup();
                return false;
            } catch (Throwable th) {
                postReadCleanup();
                throw th;
            }
        }

        public E copyEntry(E e, E e2) {
            return this.map.entryHelper.mo57040a(self(), e, e2);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: type inference failed for: r4v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E copyForTesting(com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r4) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r3 = r2.castForTesting(r3)
                com.google.common.collect.MapMakerInternalMap$h r4 = r2.castForTesting(r4)
                com.google.common.collect.MapMakerInternalMap$h r3 = r0.mo57040a(r1, r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.copyForTesting(com.google.common.collect.MapMakerInternalMap$h, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimKey((C16014h) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimValue((C16034v) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<E> newEntryArray = newEntryArray(length << 1);
                this.threshold = (newEntryArray.length() * 3) / 4;
                int length2 = newEntryArray.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C16014h hVar = (C16014h) atomicReferenceArray.get(i2);
                    if (hVar != null) {
                        C16014h next = hVar.getNext();
                        int hash = hVar.getHash() & length2;
                        if (next == null) {
                            newEntryArray.set(hash, hVar);
                        } else {
                            C16014h hVar2 = hVar;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    hVar2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            newEntryArray.set(hash, hVar2);
                            while (hVar != hVar2) {
                                int hash3 = hVar.getHash() & length2;
                                C16014h copyEntry = copyEntry(hVar, (C16014h) newEntryArray.get(hash3));
                                if (copyEntry != null) {
                                    newEntryArray.set(hash3, copyEntry);
                                } else {
                                    i--;
                                }
                                hVar = hVar.getNext();
                            }
                        }
                    }
                }
                this.table = newEntryArray;
                this.count = i;
            }
        }

        public V get(Object obj, int i) {
            try {
                C16014h liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    return null;
                }
                V value = liveEntry.getValue();
                if (value == null) {
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return value;
            } finally {
                postReadCleanup();
            }
        }

        public E getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    Object key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public E getFirst(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return (C16014h) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public E getLiveEntry(Object obj, int i) {
            return getEntry(obj, i);
        }

        @NullableDecl
        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            tryDrainReferenceQueues();
            return null;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r1) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                java.lang.Object r1 = r0.getLiveValue(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap$h):java.lang.Object");
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public C16034v<K, V, E> getWeakValueReferenceForTesting(C16014h<K, V, ?> hVar) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        public void maybeClearReferenceQueues() {
        }

        @GuardedBy("this")
        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E newEntryForTesting(K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r5) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r5 = r2.castForTesting(r5)
                com.google.common.collect.MapMakerInternalMap$h r3 = r0.mo57043d(r1, r3, r4, r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.newEntryForTesting(java.lang.Object, int, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        public C16034v<K, V, E> newWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, V v) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        @GuardedBy("this")
        public void preWriteCleanup() {
            runLockedCleanup();
        }

        public V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            this.modCount++;
                            setValue(hVar2, v);
                            this.count = this.count;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.modCount++;
                            setValue(hVar2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.modCount++;
                E d = this.map.entryHelper.mo57043d(self(), k, i, hVar);
                setValue(d, v);
                atomicReferenceArray.set(length, d);
                this.count = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimKey(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C16014h) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.getNext()) {
                    if (e3 == e) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(e2, e3));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimValue(K k, int i, C16034v<K, V, E> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else if (((C16033u) hVar2).getValueReference() == vVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public V remove(Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            if (!isCollected(hVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        this.count--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        @GuardedBy("this")
        public boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = (C16014h) atomicReferenceArray.get(length);
            for (E e3 = e2; e3 != null; e3 = e3.getNext()) {
                if (e3 == e) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeFromChain(e2, e3));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        public E removeFromChain(E e, E e2) {
            int i = this.count;
            E next = e2.getNext();
            while (e != e2) {
                E copyEntry = copyEntry(e, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    i--;
                }
                e = e.getNext();
            }
            this.count = i;
            return next;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r1, com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r2) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$h r2 = r0.castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.removeFromChain(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap$h, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r1) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                boolean r1 = r0.removeEntryForTesting(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap$h):boolean");
        }

        public boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        Object value = hVar2.getValue();
                        if (value == null) {
                            if (isCollected(hVar2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.valueEquivalence().equivalent(v, value)) {
                            this.modCount++;
                            setValue(hVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        public void setTableEntryForTesting(int i, C16014h<K, V, ?> hVar) {
            this.table.set(i, castForTesting(hVar));
        }

        public void setValue(E e, V v) {
            this.map.entryHelper.mo57042c(self(), e, v);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setValueForTesting(com.google.common.collect.MapMakerInternalMap.C16014h<K, V, ?> r3, V r4) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r3 = r2.castForTesting(r3)
                r0.mo57042c(r1, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.setValueForTesting(com.google.common.collect.MapMakerInternalMap$h, java.lang.Object):void");
        }

        public void setWeakValueReferenceForTesting(C16014h<K, V, ?> hVar, C16034v<K, V, ? extends C16014h<K, V, ?>> vVar) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public boolean remove(Object obj, int i, Object obj2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (true) {
                    boolean z = false;
                    if (hVar2 != null) {
                        Object key = hVar2.getKey();
                        if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                            hVar2 = hVar2.getNext();
                        } else {
                            if (this.map.valueEquivalence().equivalent(obj2, hVar2.getValue())) {
                                z = true;
                            } else if (!isCollected(hVar2)) {
                                unlock();
                                return false;
                            }
                            this.modCount++;
                            atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                            this.count--;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        public V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C16014h hVar = (C16014h) atomicReferenceArray.get(length);
                C16014h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            if (isCollected(hVar2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(hVar2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }
}
