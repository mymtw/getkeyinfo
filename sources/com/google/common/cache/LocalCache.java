package com.google.common.cache;

import com.google.common.base.C15784e;
import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.base.C15801q;
import com.google.common.base.C15806u;
import com.google.common.base.Equivalence;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.C16171g;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.C16381h;
import com.google.common.util.concurrent.C16385k;
import com.google.common.util.concurrent.C16388l;
import com.google.common.util.concurrent.C16392o;
import com.google.common.util.concurrent.C16395r;
import com.google.common.util.concurrent.C16397t;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: x */
    public static final Logger f35616x = Logger.getLogger(LocalCache.class.getName());

    /* renamed from: y */
    public static final C15825a f35617y = new C15825a();

    /* renamed from: z */
    public static final C15827b f35618z = new C15827b();

    /* renamed from: b */
    public final int f35619b;

    /* renamed from: c */
    public final int f35620c;

    /* renamed from: d */
    public final Segment<K, V>[] f35621d;

    /* renamed from: e */
    public final int f35622e;

    /* renamed from: f */
    public final Equivalence<Object> f35623f;

    /* renamed from: g */
    public final Equivalence<Object> f35624g;

    /* renamed from: h */
    public final Strength f35625h;

    /* renamed from: i */
    public final Strength f35626i;

    /* renamed from: j */
    public final long f35627j;

    /* renamed from: k */
    public final C15878j<K, V> f35628k;

    /* renamed from: l */
    public final long f35629l;

    /* renamed from: m */
    public final long f35630m;

    /* renamed from: n */
    public final long f35631n;

    /* renamed from: o */
    public final AbstractQueue f35632o;

    /* renamed from: p */
    public final C15877i<K, V> f35633p;

    /* renamed from: q */
    public final C15806u f35634q;

    /* renamed from: r */
    public final EntryFactory f35635r;

    /* renamed from: s */
    public final C15870b f35636s;
    @NullableDecl

    /* renamed from: t */
    public final CacheLoader<? super K, V> f35637t;
    @MonotonicNonNullDecl

    /* renamed from: u */
    public C15842j f35638u;
    @MonotonicNonNullDecl

    /* renamed from: v */
    public C15853t f35639v;
    @MonotonicNonNullDecl

    /* renamed from: w */
    public C15839g f35640w;

    public enum EntryFactory {
        STRONG {
            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15848o(k, i, hVar);
            }
        },
        STRONG_ACCESS {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyAccessEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15846m(k, i, hVar);
            }
        },
        STRONG_WRITE {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyWriteEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15850q(k, i, hVar);
            }
        },
        STRONG_ACCESS_WRITE {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyAccessEntry(hVar, copyEntry);
                copyWriteEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15847n(k, i, hVar);
            }
        },
        WEAK {
            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15856w(i, hVar, k, segment.keyReferenceQueue);
            }
        },
        WEAK_ACCESS {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyAccessEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15854u(i, hVar, k, segment.keyReferenceQueue);
            }
        },
        WEAK_WRITE {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyWriteEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15858y(i, hVar, k, segment.keyReferenceQueue);
            }
        },
        WEAK_ACCESS_WRITE {
            public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
                C15876h<K, V> copyEntry = super.copyEntry(segment, hVar, hVar2);
                copyAccessEntry(hVar, copyEntry);
                copyWriteEntry(hVar, copyEntry);
                return copyEntry;
            }

            public <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar) {
                return new C15855v(i, hVar, k, segment.keyReferenceQueue);
            }
        };
        
        public static final int ACCESS_MASK = 1;
        public static final int WEAK_MASK = 4;
        public static final int WRITE_MASK = 2;
        public static final EntryFactory[] factories = null;

        /* access modifiers changed from: public */
        static {
            C158121 r0;
            C158132 r1;
            C158143 r3;
            C158154 r5;
            C158165 r7;
            C158176 r9;
            C158187 r11;
            C158198 r13;
            factories = new EntryFactory[]{r0, r1, r3, r5, r7, r9, r11, r13};
        }

        public static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            char c = 0;
            boolean z3 = (strength == Strength.WEAK ? (char) 4 : 0) | z;
            if (z2) {
                c = 2;
            }
            return factories[z3 | c];
        }

        public <K, V> void copyAccessEntry(C15876h<K, V> hVar, C15876h<K, V> hVar2) {
            hVar2.setAccessTime(hVar.getAccessTime());
            C15876h<K, V> previousInAccessQueue = hVar.getPreviousInAccessQueue();
            Logger logger = LocalCache.f35616x;
            previousInAccessQueue.setNextInAccessQueue(hVar2);
            hVar2.setPreviousInAccessQueue(previousInAccessQueue);
            C15876h<K, V> nextInAccessQueue = hVar.getNextInAccessQueue();
            hVar2.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(hVar2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            hVar.setNextInAccessQueue(nullEntry);
            hVar.setPreviousInAccessQueue(nullEntry);
        }

        public <K, V> C15876h<K, V> copyEntry(Segment<K, V> segment, C15876h<K, V> hVar, C15876h<K, V> hVar2) {
            return newEntry(segment, hVar.getKey(), hVar.getHash(), hVar2);
        }

        public <K, V> void copyWriteEntry(C15876h<K, V> hVar, C15876h<K, V> hVar2) {
            hVar2.setWriteTime(hVar.getWriteTime());
            C15876h<K, V> previousInWriteQueue = hVar.getPreviousInWriteQueue();
            Logger logger = LocalCache.f35616x;
            previousInWriteQueue.setNextInWriteQueue(hVar2);
            hVar2.setPreviousInWriteQueue(previousInWriteQueue);
            C15876h<K, V> nextInWriteQueue = hVar.getNextInWriteQueue();
            hVar2.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(hVar2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            hVar.setNextInWriteQueue(nullEntry);
            hVar.setPreviousInWriteQueue(nullEntry);
        }

        public abstract <K, V> C15876h<K, V> newEntry(Segment<K, V> segment, K k, int i, @NullableDecl C15876h<K, V> hVar);
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements C15874f<K, V> {
        private static final long serialVersionUID = 1;
        @MonotonicNonNullDecl
        public transient C15874f<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            CacheBuilder recreateCacheBuilder = recreateCacheBuilder();
            CacheLoader<? super K, V> cacheLoader = this.loader;
            recreateCacheBuilder.mo55788a();
            this.autoDelegate = new LocalLoadingCache(recreateCacheBuilder, cacheLoader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        public final V apply(K k) {
            return this.autoDelegate.apply(k);
        }

        public V get(K k) throws ExecutionException {
            return this.autoDelegate.get(k);
        }

        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        public V getUnchecked(K k) {
            return this.autoDelegate.getUnchecked(k);
        }

        public void refresh(K k) {
            this.autoDelegate.refresh(k);
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements C15874f<K, V> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, cacheLoader), (C15825a) null);
            cacheLoader.getClass();
        }

        public final V apply(K k) {
            return getUnchecked(k);
        }

        public V get(K k) throws ExecutionException {
            LocalCache<K, V> localCache = this.localCache;
            CacheLoader<? super K, V> cacheLoader = localCache.f35637t;
            k.getClass();
            int e = localCache.mo55808e(k);
            return localCache.mo55815i(e).get(k, e, cacheLoader);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|(2:25|23)|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r9 = r2.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
            if (r9.hasNext() != false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
            r2 = r9.next();
            r4 = r4 - 1;
            r5 = r0.f35637t;
            r2.getClass();
            r6 = r0.mo55808e(r2);
            r1.put(r2, r0.mo55815i(r6).get(r2, r6, r5));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0072 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r9) throws java.util.concurrent.ExecutionException {
            /*
                r8 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r8.localCache
                r0.getClass()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                java.util.Iterator r9 = r9.iterator()
                r3 = 0
                r4 = r3
            L_0x0015:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L_0x0037
                java.lang.Object r5 = r9.next()
                java.lang.Object r6 = r0.get(r5)
                boolean r7 = r1.containsKey(r5)
                if (r7 != 0) goto L_0x0015
                r1.put(r5, r6)
                if (r6 != 0) goto L_0x0034
                int r4 = r4 + 1
                r2.add(r5)
                goto L_0x0015
            L_0x0034:
                int r3 = r3 + 1
                goto L_0x0015
            L_0x0037:
                boolean r9 = r2.isEmpty()     // Catch:{ all -> 0x00a6 }
                if (r9 != 0) goto L_0x0097
                com.google.common.cache.CacheLoader<? super K, V> r9 = r0.f35637t     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.util.Map r9 = r0.mo55811g(r2, r9)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.util.Iterator r5 = r2.iterator()     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
            L_0x0047:
                boolean r6 = r5.hasNext()     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                if (r6 == 0) goto L_0x0097
                java.lang.Object r6 = r5.next()     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.lang.Object r7 = r9.get(r6)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                if (r7 == 0) goto L_0x005b
                r1.put(r6, r7)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                goto L_0x0047
            L_0x005b:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r9 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                r5.<init>()     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.lang.String r7 = "loadAll failed to return a value for "
                r5.append(r7)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                r5.append(r6)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                r9.<init>(r5)     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
                throw r9     // Catch:{ UnsupportedLoadingOperationException -> 0x0072 }
            L_0x0072:
                java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x00a6 }
            L_0x0076:
                boolean r2 = r9.hasNext()     // Catch:{ all -> 0x00a6 }
                if (r2 == 0) goto L_0x0097
                java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x00a6 }
                int r4 = r4 + -1
                com.google.common.cache.CacheLoader<? super K, V> r5 = r0.f35637t     // Catch:{ all -> 0x00a6 }
                r2.getClass()     // Catch:{ all -> 0x00a6 }
                int r6 = r0.mo55808e(r2)     // Catch:{ all -> 0x00a6 }
                com.google.common.cache.LocalCache$Segment r7 = r0.mo55815i(r6)     // Catch:{ all -> 0x00a6 }
                java.lang.Object r5 = r7.get(r2, r6, r5)     // Catch:{ all -> 0x00a6 }
                r1.put(r2, r5)     // Catch:{ all -> 0x00a6 }
                goto L_0x0076
            L_0x0097:
                com.google.common.collect.ImmutableMap r9 = com.google.common.collect.ImmutableMap.copyOf(r1)     // Catch:{ all -> 0x00a6 }
                com.google.common.cache.b r1 = r0.f35636s
                r1.mo55792a(r3)
                com.google.common.cache.b r0 = r0.f35636s
                r0.mo55793b(r4)
                return r9
            L_0x00a6:
                r9 = move-exception
                com.google.common.cache.b r1 = r0.f35636s
                r1.mo55792a(r3)
                com.google.common.cache.b r0 = r0.f35636s
                r0.mo55793b(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.LocalLoadingCache.getAll(java.lang.Iterable):com.google.common.collect.ImmutableMap");
        }

        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        public void refresh(K k) {
            LocalCache<K, V> localCache = this.localCache;
            localCache.getClass();
            k.getClass();
            int e = localCache.mo55808e(k);
            localCache.mo55815i(e).refresh(k, e, localCache.f35637t, false);
        }

        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    public static class LocalManualCache<K, V> implements C15871c<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public final LocalCache<K, V> localCache;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$a */
        public class C15820a extends CacheLoader<Object, V> {

            /* renamed from: b */
            public final /* synthetic */ Callable f35641b;

            public C15820a(Callable callable) {
                this.f35641b = callable;
            }

            public final V load(Object obj) throws Exception {
                return this.f35641b.call();
            }
        }

        public /* synthetic */ LocalManualCache(LocalCache localCache2, C15825a aVar) {
            this(localCache2);
        }

        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        public void cleanUp() {
            for (Segment<K, V> cleanUp : this.localCache.f35621d) {
                cleanUp.cleanUp();
            }
        }

        public V get(K k, Callable<? extends V> callable) throws ExecutionException {
            callable.getClass();
            LocalCache<K, V> localCache2 = this.localCache;
            C15820a aVar = new C15820a(callable);
            localCache2.getClass();
            k.getClass();
            int e = localCache2.mo55808e(k);
            return localCache2.mo55815i(e).get(k, e, aVar);
        }

        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            LocalCache<K, V> localCache2 = this.localCache;
            localCache2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            int i2 = 0;
            for (Object next : iterable) {
                V v = localCache2.get(next);
                if (v == null) {
                    i2++;
                } else {
                    linkedHashMap.put(next, v);
                    i++;
                }
            }
            localCache2.f35636s.mo55792a(i);
            localCache2.f35636s.mo55793b(i2);
            return ImmutableMap.copyOf(linkedHashMap);
        }

        @NullableDecl
        public V getIfPresent(Object obj) {
            LocalCache<K, V> localCache2 = this.localCache;
            localCache2.getClass();
            obj.getClass();
            int e = localCache2.mo55808e(obj);
            V v = localCache2.mo55815i(e).get(obj, e);
            if (v == null) {
                localCache2.f35636s.mo55793b(1);
            } else {
                localCache2.f35636s.mo55792a(1);
            }
            return v;
        }

        public void invalidate(Object obj) {
            obj.getClass();
            this.localCache.remove(obj);
        }

        public void invalidateAll(Iterable<?> iterable) {
            LocalCache<K, V> localCache2 = this.localCache;
            localCache2.getClass();
            for (Object remove : iterable) {
                localCache2.remove(remove);
            }
        }

        public void put(K k, V v) {
            this.localCache.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        public long size() {
            Segment<K, V>[] segmentArr = this.localCache.f35621d;
            long j = 0;
            for (Segment<K, V> segment : segmentArr) {
                j += (long) Math.max(0, segment.count);
            }
            return j;
        }

        public C15872d stats() {
            C15869a aVar = new C15869a();
            aVar.mo56016g(this.localCache.f35636s);
            for (Segment<K, V> segment : this.localCache.f35621d) {
                aVar.mo56016g(segment.statsCounter);
            }
            return aVar.mo55797f();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, (CacheLoader) null));
        }

        public LocalManualCache(LocalCache<K, V> localCache2) {
            this.localCache = localCache2;
        }

        public void invalidateAll() {
            this.localCache.clear();
        }
    }

    public static class ManualSerializationProxy<K, V> extends C15873e<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final int concurrencyLevel;
        @MonotonicNonNullDecl
        public transient C15871c<K, V> delegate;
        public final long expireAfterAccessNanos;
        public final long expireAfterWriteNanos;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final CacheLoader<? super K, V> loader;
        public final long maxWeight;
        public final C15877i<? super K, ? super V> removalListener;
        @NullableDecl
        public final C15806u ticker;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;
        public final C15878j<K, V> weigher;

        public ManualSerializationProxy() {
            throw null;
        }

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
            Strength strength = localCache.f35625h;
            Strength strength2 = localCache.f35626i;
            Equivalence<Object> equivalence = localCache.f35623f;
            Equivalence<Object> equivalence2 = localCache.f35624g;
            long j = localCache.f35630m;
            long j2 = localCache.f35629l;
            long j3 = localCache.f35627j;
            C15878j<K, V> jVar = localCache.f35628k;
            int i = localCache.f35622e;
            C15877i<K, V> iVar = localCache.f35633p;
            C15806u uVar = localCache.f35634q;
            CacheLoader<? super K, V> cacheLoader = localCache.f35637t;
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = jVar;
            this.concurrencyLevel = i;
            this.removalListener = iVar;
            this.ticker = (uVar == C15806u.f35590a || uVar == CacheBuilder.f35593s) ? null : uVar;
            this.loader = cacheLoader;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            CacheBuilder recreateCacheBuilder = recreateCacheBuilder();
            recreateCacheBuilder.mo55788a();
            C15794l.m25624r(recreateCacheBuilder.f35605k == -1, "refreshAfterWrite requires a LoadingCache");
            this.delegate = new LocalManualCache(recreateCacheBuilder);
        }

        private Object readResolve() {
            return this.delegate;
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = new CacheBuilder<>();
            Strength strength = this.keyStrength;
            Strength strength2 = cacheBuilder.f35601g;
            C15794l.m25622p(strength2, "Key strength was already set to %s", strength2 == null);
            strength.getClass();
            cacheBuilder.f35601g = strength;
            Strength strength3 = this.valueStrength;
            Strength strength4 = cacheBuilder.f35602h;
            C15794l.m25622p(strength4, "Value strength was already set to %s", strength4 == null);
            strength3.getClass();
            cacheBuilder.f35602h = strength3;
            Equivalence<Object> equivalence = this.keyEquivalence;
            Equivalence<Object> equivalence2 = cacheBuilder.f35606l;
            C15794l.m25622p(equivalence2, "key equivalence was already set to %s", equivalence2 == null);
            equivalence.getClass();
            cacheBuilder.f35606l = equivalence;
            Equivalence<Object> equivalence3 = this.valueEquivalence;
            Equivalence<Object> equivalence4 = cacheBuilder.f35607m;
            C15794l.m25622p(equivalence4, "value equivalence was already set to %s", equivalence4 == null);
            equivalence3.getClass();
            cacheBuilder.f35607m = equivalence3;
            int i = this.concurrencyLevel;
            int i2 = cacheBuilder.f35597c;
            C15794l.m25620n(i2, "concurrency level was already set to %s", i2 == -1);
            C15794l.m25613g(i > 0);
            cacheBuilder.f35597c = i;
            C15877i<? super K, ? super V> iVar = this.removalListener;
            C15794l.m25623q(cacheBuilder.f35608n == null);
            iVar.getClass();
            cacheBuilder.f35608n = iVar;
            cacheBuilder.f35595a = false;
            long j = this.expireAfterWriteNanos;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j2 = cacheBuilder.f35603i;
                C15794l.m25621o(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
                C15794l.m25615i(i3 >= 0, "duration cannot be negative: %s %s", j, timeUnit);
                cacheBuilder.f35603i = timeUnit.toNanos(j);
            }
            long j3 = this.expireAfterAccessNanos;
            int i4 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            if (i4 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j4 = cacheBuilder.f35604j;
                C15794l.m25621o(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
                C15794l.m25615i(i4 >= 0, "duration cannot be negative: %s %s", j3, timeUnit2);
                cacheBuilder.f35604j = timeUnit2.toNanos(j3);
            }
            C15878j<K, V> jVar = this.weigher;
            if (jVar != CacheBuilder.OneWeigher.INSTANCE) {
                C15794l.m25623q(cacheBuilder.f35600f == null);
                if (cacheBuilder.f35595a) {
                    long j5 = cacheBuilder.f35598d;
                    C15794l.m25621o(j5, "weigher can not be combined with maximum size", j5 == -1);
                }
                jVar.getClass();
                cacheBuilder.f35600f = jVar;
                long j6 = this.maxWeight;
                if (j6 != -1) {
                    long j7 = cacheBuilder.f35599e;
                    C15794l.m25621o(j7, "maximum weight was already set to %s", j7 == -1);
                    long j8 = cacheBuilder.f35598d;
                    C15794l.m25621o(j8, "maximum size was already set to %s", j8 == -1);
                    cacheBuilder.f35599e = j6;
                    C15794l.m25614h(j6 >= 0, "maximum weight must not be negative");
                }
            } else {
                long j9 = this.maxWeight;
                if (j9 != -1) {
                    long j10 = cacheBuilder.f35598d;
                    C15794l.m25621o(j10, "maximum size was already set to %s", j10 == -1);
                    long j11 = cacheBuilder.f35599e;
                    C15794l.m25621o(j11, "maximum weight was already set to %s", j11 == -1);
                    C15794l.m25624r(cacheBuilder.f35600f == null, "maximum size can not be combined with weigher");
                    C15794l.m25614h(j9 >= 0, "maximum size must not be negative");
                    cacheBuilder.f35598d = j9;
                }
            }
            C15806u uVar = this.ticker;
            if (uVar != null) {
                C15794l.m25623q(cacheBuilder.f35609o == null);
                cacheBuilder.f35609o = uVar;
            }
            return cacheBuilder;
        }

        public C15871c<K, V> delegate() {
            return this.delegate;
        }
    }

    public enum NullEntry implements C15876h<Object, Object> {
        INSTANCE;

        public long getAccessTime() {
            return 0;
        }

        public int getHash() {
            return 0;
        }

        public Object getKey() {
            return null;
        }

        public C15876h<Object, Object> getNext() {
            return null;
        }

        public C15876h<Object, Object> getNextInAccessQueue() {
            return this;
        }

        public C15876h<Object, Object> getNextInWriteQueue() {
            return this;
        }

        public C15876h<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        public C15876h<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        public C15852s<Object, Object> getValueReference() {
            return null;
        }

        public long getWriteTime() {
            return 0;
        }

        public void setAccessTime(long j) {
        }

        public void setNextInAccessQueue(C15876h<Object, Object> hVar) {
        }

        public void setNextInWriteQueue(C15876h<Object, Object> hVar) {
        }

        public void setPreviousInAccessQueue(C15876h<Object, Object> hVar) {
        }

        public void setPreviousInWriteQueue(C15876h<Object, Object> hVar) {
        }

        public void setValueReference(C15852s<Object, Object> sVar) {
        }

        public void setWriteTime(long j) {
        }
    }

    public enum Strength {
        STRONG {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            public <K, V> C15852s<K, V> referenceValue(Segment<K, V> segment, C15876h<K, V> hVar, V v, int i) {
                return i == 1 ? new C15849p(v) : new C15826a0(v, i);
            }
        },
        SOFT {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            public <K, V> C15852s<K, V> referenceValue(Segment<K, V> segment, C15876h<K, V> hVar, V v, int i) {
                return i == 1 ? new C15845l(segment.valueReferenceQueue, v, hVar) : new C15859z(i, hVar, v, segment.valueReferenceQueue);
            }
        },
        WEAK {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            public <K, V> C15852s<K, V> referenceValue(Segment<K, V> segment, C15876h<K, V> hVar, V v, int i) {
                return i == 1 ? new C15857x(segment.valueReferenceQueue, v, hVar) : new C15828b0(i, hVar, v, segment.valueReferenceQueue);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> C15852s<K, V> referenceValue(Segment<K, V> segment, C15876h<K, V> hVar, V v, int i);
    }

    /* renamed from: com.google.common.cache.LocalCache$a */
    public static class C15825a implements C15852s<Object, Object> {
        /* renamed from: a */
        public final boolean mo55929a() {
            return false;
        }

        /* renamed from: b */
        public final int mo55930b() {
            return 0;
        }

        /* renamed from: c */
        public final C15876h<Object, Object> mo55931c() {
            return null;
        }

        /* renamed from: d */
        public final void mo55932d(Object obj) {
        }

        /* renamed from: e */
        public final C15852s<Object, Object> mo55933e(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, C15876h<Object, Object> hVar) {
            return this;
        }

        /* renamed from: f */
        public final Object mo55934f() {
            return null;
        }

        public final Object get() {
            return null;
        }

        public final boolean isActive() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$a0 */
    public static final class C15826a0<K, V> extends C15849p<K, V> {

        /* renamed from: c */
        public final int f35647c;

        public C15826a0(V v, int i) {
            super(v);
            this.f35647c = i;
        }

        /* renamed from: b */
        public final int mo55930b() {
            return this.f35647c;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$b */
    public static class C15827b extends AbstractQueue<Object> {
        public final Iterator<Object> iterator() {
            return ImmutableSet.m25894of().iterator();
        }

        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$b0 */
    public static final class C15828b0<K, V> extends C15857x<K, V> {

        /* renamed from: c */
        public final int f35648c;

        public C15828b0(int i, C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, hVar);
            this.f35648c = i;
        }

        /* renamed from: b */
        public final int mo55930b() {
            return this.f35648c;
        }

        /* renamed from: e */
        public final C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            return new C15828b0(this.f35648c, hVar, v, referenceQueue);
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$c */
    public abstract class C15829c<T> extends AbstractSet<T> {
        @Weak

        /* renamed from: b */
        public final ConcurrentMap<?, ?> f35649b;

        public C15829c(ConcurrentMap concurrentMap) {
            this.f35649b = concurrentMap;
        }

        public final void clear() {
            this.f35649b.clear();
        }

        public final boolean isEmpty() {
            return this.f35649b.isEmpty();
        }

        public final int size() {
            return this.f35649b.size();
        }

        public final Object[] toArray() {
            return LocalCache.m25640a(this).toArray();
        }

        public final <E> E[] toArray(E[] eArr) {
            return LocalCache.m25640a(this).toArray(eArr);
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$c0 */
    public static final class C15830c0<K, V> extends AbstractQueue<C15876h<K, V>> {

        /* renamed from: b */
        public final C15831a f35650b = new C15831a();

        /* renamed from: com.google.common.cache.LocalCache$c0$a */
        public class C15831a extends C15833d<K, V> {

            /* renamed from: b */
            public C15876h<K, V> f35651b = this;

            /* renamed from: c */
            public C15876h<K, V> f35652c = this;

            public final C15876h<K, V> getNextInWriteQueue() {
                return this.f35651b;
            }

            public final C15876h<K, V> getPreviousInWriteQueue() {
                return this.f35652c;
            }

            public final long getWriteTime() {
                return Long.MAX_VALUE;
            }

            public final void setNextInWriteQueue(C15876h<K, V> hVar) {
                this.f35651b = hVar;
            }

            public final void setPreviousInWriteQueue(C15876h<K, V> hVar) {
                this.f35652c = hVar;
            }

            public final void setWriteTime(long j) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$c0$b */
        public class C15832b extends C16171g<C15876h<K, V>> {
            public C15832b(C15876h hVar) {
                super(hVar);
            }

            /* renamed from: a */
            public final Object mo55956a(Object obj) {
                C15876h nextInWriteQueue = ((C15876h) obj).getNextInWriteQueue();
                if (nextInWriteQueue == C15830c0.this.f35650b) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        public final void clear() {
            C15876h<K, V> hVar = this.f35650b.f35651b;
            while (true) {
                C15831a aVar = this.f35650b;
                if (hVar != aVar) {
                    C15876h<K, V> nextInWriteQueue = hVar.getNextInWriteQueue();
                    Logger logger = LocalCache.f35616x;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    hVar.setNextInWriteQueue(nullEntry);
                    hVar.setPreviousInWriteQueue(nullEntry);
                    hVar = nextInWriteQueue;
                } else {
                    aVar.f35651b = aVar;
                    aVar.f35652c = aVar;
                    return;
                }
            }
        }

        public final boolean contains(Object obj) {
            return ((C15876h) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty() {
            C15831a aVar = this.f35650b;
            return aVar.f35651b == aVar;
        }

        public final Iterator<C15876h<K, V>> iterator() {
            C15831a aVar = this.f35650b;
            C15876h<K, V> hVar = aVar.f35651b;
            if (hVar == aVar) {
                hVar = null;
            }
            return new C15832b(hVar);
        }

        public final boolean offer(Object obj) {
            C15876h<K, V> hVar = (C15876h) obj;
            C15876h<K, V> previousInWriteQueue = hVar.getPreviousInWriteQueue();
            C15876h<K, V> nextInWriteQueue = hVar.getNextInWriteQueue();
            Logger logger = LocalCache.f35616x;
            previousInWriteQueue.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(previousInWriteQueue);
            C15876h<K, V> hVar2 = this.f35650b.f35652c;
            hVar2.setNextInWriteQueue(hVar);
            hVar.setPreviousInWriteQueue(hVar2);
            C15831a aVar = this.f35650b;
            hVar.setNextInWriteQueue(aVar);
            aVar.f35652c = hVar;
            return true;
        }

        public final Object peek() {
            C15831a aVar = this.f35650b;
            C15876h<K, V> hVar = aVar.f35651b;
            if (hVar == aVar) {
                return null;
            }
            return hVar;
        }

        public final Object poll() {
            C15831a aVar = this.f35650b;
            C15876h<K, V> hVar = aVar.f35651b;
            if (hVar == aVar) {
                return null;
            }
            remove(hVar);
            return hVar;
        }

        public final boolean remove(Object obj) {
            C15876h hVar = (C15876h) obj;
            C15876h previousInWriteQueue = hVar.getPreviousInWriteQueue();
            C15876h nextInWriteQueue = hVar.getNextInWriteQueue();
            Logger logger = LocalCache.f35616x;
            previousInWriteQueue.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(previousInWriteQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            hVar.setNextInWriteQueue(nullEntry);
            hVar.setPreviousInWriteQueue(nullEntry);
            return nextInWriteQueue != nullEntry;
        }

        public final int size() {
            int i = 0;
            for (C15876h<K, V> hVar = this.f35650b.f35651b; hVar != this.f35650b; hVar = hVar.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$d */
    public static abstract class C15833d<K, V> implements C15876h<K, V> {
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public int getHash() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public C15852s<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(C15852s<K, V> sVar) {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$d0 */
    public final class C15834d0 implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f35654b;

        /* renamed from: c */
        public V f35655c;

        public C15834d0(K k, V v) {
            this.f35654b = k;
            this.f35655c = v;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f35654b.equals(entry.getKey()) && this.f35655c.equals(entry.getValue());
        }

        public final K getKey() {
            return this.f35654b;
        }

        public final V getValue() {
            return this.f35655c;
        }

        public final int hashCode() {
            return this.f35654b.hashCode() ^ this.f35655c.hashCode();
        }

        public final V setValue(V v) {
            V put = LocalCache.this.put(this.f35654b, v);
            this.f35655c = v;
            return put;
        }

        public final String toString() {
            return this.f35654b + "=" + this.f35655c;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$e */
    public static final class C15835e<K, V> extends AbstractQueue<C15876h<K, V>> {

        /* renamed from: b */
        public final C15836a f35657b = new C15836a();

        /* renamed from: com.google.common.cache.LocalCache$e$a */
        public class C15836a extends C15833d<K, V> {

            /* renamed from: b */
            public C15876h<K, V> f35658b = this;

            /* renamed from: c */
            public C15876h<K, V> f35659c = this;

            public final long getAccessTime() {
                return Long.MAX_VALUE;
            }

            public final C15876h<K, V> getNextInAccessQueue() {
                return this.f35658b;
            }

            public final C15876h<K, V> getPreviousInAccessQueue() {
                return this.f35659c;
            }

            public final void setAccessTime(long j) {
            }

            public final void setNextInAccessQueue(C15876h<K, V> hVar) {
                this.f35658b = hVar;
            }

            public final void setPreviousInAccessQueue(C15876h<K, V> hVar) {
                this.f35659c = hVar;
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$e$b */
        public class C15837b extends C16171g<C15876h<K, V>> {
            public C15837b(C15876h hVar) {
                super(hVar);
            }

            /* renamed from: a */
            public final Object mo55956a(Object obj) {
                C15876h nextInAccessQueue = ((C15876h) obj).getNextInAccessQueue();
                if (nextInAccessQueue == C15835e.this.f35657b) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        public final void clear() {
            C15876h<K, V> hVar = this.f35657b.f35658b;
            while (true) {
                C15836a aVar = this.f35657b;
                if (hVar != aVar) {
                    C15876h<K, V> nextInAccessQueue = hVar.getNextInAccessQueue();
                    Logger logger = LocalCache.f35616x;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    hVar.setNextInAccessQueue(nullEntry);
                    hVar.setPreviousInAccessQueue(nullEntry);
                    hVar = nextInAccessQueue;
                } else {
                    aVar.f35658b = aVar;
                    aVar.f35659c = aVar;
                    return;
                }
            }
        }

        public final boolean contains(Object obj) {
            return ((C15876h) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty() {
            C15836a aVar = this.f35657b;
            return aVar.f35658b == aVar;
        }

        public final Iterator<C15876h<K, V>> iterator() {
            C15836a aVar = this.f35657b;
            C15876h<K, V> hVar = aVar.f35658b;
            if (hVar == aVar) {
                hVar = null;
            }
            return new C15837b(hVar);
        }

        public final boolean offer(Object obj) {
            C15876h<K, V> hVar = (C15876h) obj;
            C15876h<K, V> previousInAccessQueue = hVar.getPreviousInAccessQueue();
            C15876h<K, V> nextInAccessQueue = hVar.getNextInAccessQueue();
            Logger logger = LocalCache.f35616x;
            previousInAccessQueue.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(previousInAccessQueue);
            C15876h<K, V> hVar2 = this.f35657b.f35659c;
            hVar2.setNextInAccessQueue(hVar);
            hVar.setPreviousInAccessQueue(hVar2);
            C15836a aVar = this.f35657b;
            hVar.setNextInAccessQueue(aVar);
            aVar.f35659c = hVar;
            return true;
        }

        public final Object peek() {
            C15836a aVar = this.f35657b;
            C15876h<K, V> hVar = aVar.f35658b;
            if (hVar == aVar) {
                return null;
            }
            return hVar;
        }

        public final Object poll() {
            C15836a aVar = this.f35657b;
            C15876h<K, V> hVar = aVar.f35658b;
            if (hVar == aVar) {
                return null;
            }
            remove(hVar);
            return hVar;
        }

        public final boolean remove(Object obj) {
            C15876h hVar = (C15876h) obj;
            C15876h previousInAccessQueue = hVar.getPreviousInAccessQueue();
            C15876h nextInAccessQueue = hVar.getNextInAccessQueue();
            Logger logger = LocalCache.f35616x;
            previousInAccessQueue.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(previousInAccessQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            hVar.setNextInAccessQueue(nullEntry);
            hVar.setPreviousInAccessQueue(nullEntry);
            return nextInAccessQueue != nullEntry;
        }

        public final int size() {
            int i = 0;
            for (C15876h<K, V> hVar = this.f35657b.f35658b; hVar != this.f35657b; hVar = hVar.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$f */
    public final class C15838f extends LocalCache<K, V>.h<Map.Entry<K, V>> {
        public C15838f(LocalCache localCache) {
            super();
        }

        public final Object next() {
            return mo55978c();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$g */
    public final class C15839g extends LocalCache<K, V>.c<Map.Entry<K, V>> {
        public C15839g(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r0 = r3.f35661c.get((r0 = r4.getKey()));
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0026
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.f35624g
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.C15839g.contains(java.lang.Object):boolean");
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C15838f(LocalCache.this);
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
                com.google.common.cache.LocalCache r2 = com.google.common.cache.LocalCache.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.C15839g.remove(java.lang.Object):boolean");
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$h */
    public abstract class C15840h<T> implements Iterator<T> {

        /* renamed from: b */
        public int f35662b;

        /* renamed from: c */
        public int f35663c = -1;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public Segment<K, V> f35664d;
        @MonotonicNonNullDecl

        /* renamed from: e */
        public AtomicReferenceArray<C15876h<K, V>> f35665e;
        @NullableDecl

        /* renamed from: f */
        public C15876h<K, V> f35666f;
        @NullableDecl

        /* renamed from: g */
        public LocalCache<K, V>.d0 f35667g;
        @NullableDecl

        /* renamed from: h */
        public LocalCache<K, V>.d0 f35668h;

        public C15840h() {
            this.f35662b = LocalCache.this.f35621d.length - 1;
            mo55976a();
        }

        /* renamed from: a */
        public final void mo55976a() {
            boolean z;
            this.f35667g = null;
            C15876h<K, V> hVar = this.f35666f;
            if (hVar != null) {
                while (true) {
                    C15876h<K, V> next = hVar.getNext();
                    this.f35666f = next;
                    if (next == null) {
                        break;
                    } else if (mo55977b(next)) {
                        z = true;
                        break;
                    } else {
                        hVar = this.f35666f;
                    }
                }
            }
            z = false;
            if (!z && !mo55979d()) {
                while (true) {
                    int i = this.f35662b;
                    if (i >= 0) {
                        Segment<K, V>[] segmentArr = LocalCache.this.f35621d;
                        this.f35662b = i - 1;
                        Segment<K, V> segment = segmentArr[i];
                        this.f35664d = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.f35664d.table;
                            this.f35665e = atomicReferenceArray;
                            this.f35663c = atomicReferenceArray.length() - 1;
                            if (mo55979d()) {
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
        public final boolean mo55977b(C15876h<K, V> hVar) {
            boolean z;
            try {
                long a = LocalCache.this.f35634q.mo55787a();
                K key = hVar.getKey();
                LocalCache localCache = LocalCache.this;
                localCache.getClass();
                V v = null;
                if (hVar.getKey() != null) {
                    V v2 = hVar.getValueReference().get();
                    if (v2 != null) {
                        if (!localCache.mo55810f(hVar, a)) {
                            v = v2;
                        }
                    }
                }
                if (v != null) {
                    this.f35667g = new C15834d0(key, v);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f35664d.postReadCleanup();
            }
        }

        /* renamed from: c */
        public final LocalCache<K, V>.d0 mo55978c() {
            LocalCache<K, V>.d0 d0Var = this.f35667g;
            if (d0Var != null) {
                this.f35668h = d0Var;
                mo55976a();
                return this.f35668h;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public final boolean mo55979d() {
            while (true) {
                int i = this.f35663c;
                boolean z = false;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.f35665e;
                this.f35663c = i - 1;
                C15876h<K, V> hVar = atomicReferenceArray.get(i);
                this.f35666f = hVar;
                if (hVar != null) {
                    if (mo55977b(hVar)) {
                        break;
                    }
                    C15876h<K, V> hVar2 = this.f35666f;
                    if (hVar2 != null) {
                        while (true) {
                            C15876h<K, V> next = hVar2.getNext();
                            this.f35666f = next;
                            if (next == null) {
                                break;
                            } else if (mo55977b(next)) {
                                z = true;
                                break;
                            } else {
                                hVar2 = this.f35666f;
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
            return this.f35667g != null;
        }

        public final void remove() {
            C15794l.m25623q(this.f35668h != null);
            LocalCache.this.remove(this.f35668h.f35654b);
            this.f35668h = null;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$i */
    public final class C15841i extends LocalCache<K, V>.h<K> {
        public C15841i(LocalCache localCache) {
            super();
        }

        public final K next() {
            return mo55978c().f35654b;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$j */
    public final class C15842j extends LocalCache<K, V>.c<K> {
        public C15842j(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        public final boolean contains(Object obj) {
            return this.f35649b.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C15841i(LocalCache.this);
        }

        public final boolean remove(Object obj) {
            return this.f35649b.remove(obj) != null;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$l */
    public static class C15845l<K, V> extends SoftReference<V> implements C15852s<K, V> {

        /* renamed from: b */
        public final C15876h<K, V> f35675b;

        public C15845l(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            super(v, referenceQueue);
            this.f35675b = hVar;
        }

        /* renamed from: a */
        public final boolean mo55929a() {
            return false;
        }

        /* renamed from: b */
        public int mo55930b() {
            return 1;
        }

        /* renamed from: c */
        public final C15876h<K, V> mo55931c() {
            return this.f35675b;
        }

        /* renamed from: d */
        public final void mo55932d(V v) {
        }

        /* renamed from: e */
        public C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            return new C15845l(referenceQueue, v, hVar);
        }

        /* renamed from: f */
        public final V mo55934f() {
            return get();
        }

        public final boolean isActive() {
            return true;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$m */
    public static final class C15846m<K, V> extends C15848o<K, V> {

        /* renamed from: f */
        public volatile long f35676f = Long.MAX_VALUE;

        /* renamed from: g */
        public C15876h<K, V> f35677g;

        /* renamed from: h */
        public C15876h<K, V> f35678h;

        public C15846m(K k, int i, @NullableDecl C15876h<K, V> hVar) {
            super(k, i, hVar);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35677g = nullEntry;
            this.f35678h = nullEntry;
        }

        public final long getAccessTime() {
            return this.f35676f;
        }

        public final C15876h<K, V> getNextInAccessQueue() {
            return this.f35677g;
        }

        public final C15876h<K, V> getPreviousInAccessQueue() {
            return this.f35678h;
        }

        public final void setAccessTime(long j) {
            this.f35676f = j;
        }

        public final void setNextInAccessQueue(C15876h<K, V> hVar) {
            this.f35677g = hVar;
        }

        public final void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            this.f35678h = hVar;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$n */
    public static final class C15847n<K, V> extends C15848o<K, V> {

        /* renamed from: f */
        public volatile long f35679f = Long.MAX_VALUE;

        /* renamed from: g */
        public C15876h<K, V> f35680g;

        /* renamed from: h */
        public C15876h<K, V> f35681h;

        /* renamed from: i */
        public volatile long f35682i;

        /* renamed from: j */
        public C15876h<K, V> f35683j;

        /* renamed from: k */
        public C15876h<K, V> f35684k;

        public C15847n(K k, int i, @NullableDecl C15876h<K, V> hVar) {
            super(k, i, hVar);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35680g = nullEntry;
            this.f35681h = nullEntry;
            this.f35682i = Long.MAX_VALUE;
            this.f35683j = nullEntry;
            this.f35684k = nullEntry;
        }

        public final long getAccessTime() {
            return this.f35679f;
        }

        public final C15876h<K, V> getNextInAccessQueue() {
            return this.f35680g;
        }

        public final C15876h<K, V> getNextInWriteQueue() {
            return this.f35683j;
        }

        public final C15876h<K, V> getPreviousInAccessQueue() {
            return this.f35681h;
        }

        public final C15876h<K, V> getPreviousInWriteQueue() {
            return this.f35684k;
        }

        public final long getWriteTime() {
            return this.f35682i;
        }

        public final void setAccessTime(long j) {
            this.f35679f = j;
        }

        public final void setNextInAccessQueue(C15876h<K, V> hVar) {
            this.f35680g = hVar;
        }

        public final void setNextInWriteQueue(C15876h<K, V> hVar) {
            this.f35683j = hVar;
        }

        public final void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            this.f35681h = hVar;
        }

        public final void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            this.f35684k = hVar;
        }

        public final void setWriteTime(long j) {
            this.f35682i = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$o */
    public static class C15848o<K, V> extends C15833d<K, V> {

        /* renamed from: b */
        public final K f35685b;

        /* renamed from: c */
        public final int f35686c;
        @NullableDecl

        /* renamed from: d */
        public final C15876h<K, V> f35687d;

        /* renamed from: e */
        public volatile C15852s<K, V> f35688e = LocalCache.f35617y;

        public C15848o(K k, int i, @NullableDecl C15876h<K, V> hVar) {
            this.f35685b = k;
            this.f35686c = i;
            this.f35687d = hVar;
        }

        public final int getHash() {
            return this.f35686c;
        }

        public final K getKey() {
            return this.f35685b;
        }

        public final C15876h<K, V> getNext() {
            return this.f35687d;
        }

        public final C15852s<K, V> getValueReference() {
            return this.f35688e;
        }

        public final void setValueReference(C15852s<K, V> sVar) {
            this.f35688e = sVar;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$p */
    public static class C15849p<K, V> implements C15852s<K, V> {

        /* renamed from: b */
        public final V f35689b;

        public C15849p(V v) {
            this.f35689b = v;
        }

        /* renamed from: a */
        public final boolean mo55929a() {
            return false;
        }

        /* renamed from: b */
        public int mo55930b() {
            return 1;
        }

        /* renamed from: c */
        public final C15876h<K, V> mo55931c() {
            return null;
        }

        /* renamed from: d */
        public final void mo55932d(V v) {
        }

        /* renamed from: e */
        public final C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            return this;
        }

        /* renamed from: f */
        public final V mo55934f() {
            return this.f35689b;
        }

        public final V get() {
            return this.f35689b;
        }

        public final boolean isActive() {
            return true;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$q */
    public static final class C15850q<K, V> extends C15848o<K, V> {

        /* renamed from: f */
        public volatile long f35690f = Long.MAX_VALUE;

        /* renamed from: g */
        public C15876h<K, V> f35691g;

        /* renamed from: h */
        public C15876h<K, V> f35692h;

        public C15850q(K k, int i, @NullableDecl C15876h<K, V> hVar) {
            super(k, i, hVar);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35691g = nullEntry;
            this.f35692h = nullEntry;
        }

        public final C15876h<K, V> getNextInWriteQueue() {
            return this.f35691g;
        }

        public final C15876h<K, V> getPreviousInWriteQueue() {
            return this.f35692h;
        }

        public final long getWriteTime() {
            return this.f35690f;
        }

        public final void setNextInWriteQueue(C15876h<K, V> hVar) {
            this.f35691g = hVar;
        }

        public final void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            this.f35692h = hVar;
        }

        public final void setWriteTime(long j) {
            this.f35690f = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$r */
    public final class C15851r extends LocalCache<K, V>.h<V> {
        public C15851r(LocalCache localCache) {
            super();
        }

        public final V next() {
            return mo55978c().f35655c;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$s */
    public interface C15852s<K, V> {
        /* renamed from: a */
        boolean mo55929a();

        /* renamed from: b */
        int mo55930b();

        @NullableDecl
        /* renamed from: c */
        C15876h<K, V> mo55931c();

        /* renamed from: d */
        void mo55932d(@NullableDecl V v);

        /* renamed from: e */
        C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, @NullableDecl V v, C15876h<K, V> hVar);

        /* renamed from: f */
        V mo55934f() throws ExecutionException;

        @NullableDecl
        V get();

        boolean isActive();
    }

    /* renamed from: com.google.common.cache.LocalCache$t */
    public final class C15853t extends AbstractCollection<V> {

        /* renamed from: b */
        public final ConcurrentMap<?, ?> f35693b;

        public C15853t(ConcurrentMap<?, ?> concurrentMap) {
            this.f35693b = concurrentMap;
        }

        public final void clear() {
            this.f35693b.clear();
        }

        public final boolean contains(Object obj) {
            return this.f35693b.containsValue(obj);
        }

        public final boolean isEmpty() {
            return this.f35693b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C15851r(LocalCache.this);
        }

        public final int size() {
            return this.f35693b.size();
        }

        public final Object[] toArray() {
            return LocalCache.m25640a(this).toArray();
        }

        public final <E> E[] toArray(E[] eArr) {
            return LocalCache.m25640a(this).toArray(eArr);
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$u */
    public static final class C15854u<K, V> extends C15856w<K, V> {

        /* renamed from: e */
        public volatile long f35695e = Long.MAX_VALUE;

        /* renamed from: f */
        public C15876h<K, V> f35696f;

        /* renamed from: g */
        public C15876h<K, V> f35697g;

        public C15854u(int i, @NullableDecl C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(i, hVar, obj, referenceQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35696f = nullEntry;
            this.f35697g = nullEntry;
        }

        public final long getAccessTime() {
            return this.f35695e;
        }

        public final C15876h<K, V> getNextInAccessQueue() {
            return this.f35696f;
        }

        public final C15876h<K, V> getPreviousInAccessQueue() {
            return this.f35697g;
        }

        public final void setAccessTime(long j) {
            this.f35695e = j;
        }

        public final void setNextInAccessQueue(C15876h<K, V> hVar) {
            this.f35696f = hVar;
        }

        public final void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            this.f35697g = hVar;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$v */
    public static final class C15855v<K, V> extends C15856w<K, V> {

        /* renamed from: e */
        public volatile long f35698e = Long.MAX_VALUE;

        /* renamed from: f */
        public C15876h<K, V> f35699f;

        /* renamed from: g */
        public C15876h<K, V> f35700g;

        /* renamed from: h */
        public volatile long f35701h;

        /* renamed from: i */
        public C15876h<K, V> f35702i;

        /* renamed from: j */
        public C15876h<K, V> f35703j;

        public C15855v(int i, @NullableDecl C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(i, hVar, obj, referenceQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35699f = nullEntry;
            this.f35700g = nullEntry;
            this.f35701h = Long.MAX_VALUE;
            this.f35702i = nullEntry;
            this.f35703j = nullEntry;
        }

        public final long getAccessTime() {
            return this.f35698e;
        }

        public final C15876h<K, V> getNextInAccessQueue() {
            return this.f35699f;
        }

        public final C15876h<K, V> getNextInWriteQueue() {
            return this.f35702i;
        }

        public final C15876h<K, V> getPreviousInAccessQueue() {
            return this.f35700g;
        }

        public final C15876h<K, V> getPreviousInWriteQueue() {
            return this.f35703j;
        }

        public final long getWriteTime() {
            return this.f35701h;
        }

        public final void setAccessTime(long j) {
            this.f35698e = j;
        }

        public final void setNextInAccessQueue(C15876h<K, V> hVar) {
            this.f35699f = hVar;
        }

        public final void setNextInWriteQueue(C15876h<K, V> hVar) {
            this.f35702i = hVar;
        }

        public final void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            this.f35700g = hVar;
        }

        public final void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            this.f35703j = hVar;
        }

        public final void setWriteTime(long j) {
            this.f35701h = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$w */
    public static class C15856w<K, V> extends WeakReference<K> implements C15876h<K, V> {

        /* renamed from: b */
        public final int f35704b;
        @NullableDecl

        /* renamed from: c */
        public final C15876h<K, V> f35705c;

        /* renamed from: d */
        public volatile C15852s<K, V> f35706d = LocalCache.f35617y;

        public C15856w(int i, @NullableDecl C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f35704b = i;
            this.f35705c = hVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public final int getHash() {
            return this.f35704b;
        }

        public final K getKey() {
            return get();
        }

        public final C15876h<K, V> getNext() {
            return this.f35705c;
        }

        public C15876h<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public C15876h<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public final C15852s<K, V> getValueReference() {
            return this.f35706d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            throw new UnsupportedOperationException();
        }

        public final void setValueReference(C15852s<K, V> sVar) {
            this.f35706d = sVar;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$x */
    public static class C15857x<K, V> extends WeakReference<V> implements C15852s<K, V> {

        /* renamed from: b */
        public final C15876h<K, V> f35707b;

        public C15857x(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            super(v, referenceQueue);
            this.f35707b = hVar;
        }

        /* renamed from: a */
        public final boolean mo55929a() {
            return false;
        }

        /* renamed from: b */
        public int mo55930b() {
            return 1;
        }

        /* renamed from: c */
        public final C15876h<K, V> mo55931c() {
            return this.f35707b;
        }

        /* renamed from: d */
        public final void mo55932d(V v) {
        }

        /* renamed from: e */
        public C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            return new C15857x(referenceQueue, v, hVar);
        }

        /* renamed from: f */
        public final V mo55934f() {
            return get();
        }

        public final boolean isActive() {
            return true;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$y */
    public static final class C15858y<K, V> extends C15856w<K, V> {

        /* renamed from: e */
        public volatile long f35708e = Long.MAX_VALUE;

        /* renamed from: f */
        public C15876h<K, V> f35709f;

        /* renamed from: g */
        public C15876h<K, V> f35710g;

        public C15858y(int i, @NullableDecl C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(i, hVar, obj, referenceQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.f35709f = nullEntry;
            this.f35710g = nullEntry;
        }

        public final C15876h<K, V> getNextInWriteQueue() {
            return this.f35709f;
        }

        public final C15876h<K, V> getPreviousInWriteQueue() {
            return this.f35710g;
        }

        public final long getWriteTime() {
            return this.f35708e;
        }

        public final void setNextInWriteQueue(C15876h<K, V> hVar) {
            this.f35709f = hVar;
        }

        public final void setPreviousInWriteQueue(C15876h<K, V> hVar) {
            this.f35710g = hVar;
        }

        public final void setWriteTime(long j) {
            this.f35708e = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$z */
    public static final class C15859z<K, V> extends C15845l<K, V> {

        /* renamed from: c */
        public final int f35711c;

        public C15859z(int i, C15876h hVar, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, hVar);
            this.f35711c = i;
        }

        /* renamed from: b */
        public final int mo55930b() {
            return this.f35711c;
        }

        /* renamed from: e */
        public final C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, V v, C15876h<K, V> hVar) {
            return new C15859z(this.f35711c, hVar, v, referenceQueue);
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @NullableDecl CacheLoader<? super K, V> cacheLoader) {
        CacheBuilder<? super K, ? super V> cacheBuilder2 = cacheBuilder;
        int i = cacheBuilder2.f35597c;
        this.f35622e = Math.min(i == -1 ? 4 : i, 65536);
        Strength strength = cacheBuilder2.f35601g;
        Strength strength2 = Strength.STRONG;
        Strength strength3 = (Strength) C15788i.m25602a(strength, strength2);
        this.f35625h = strength3;
        this.f35626i = (Strength) C15788i.m25602a(cacheBuilder2.f35602h, strength2);
        this.f35623f = (Equivalence) C15788i.m25602a(cacheBuilder2.f35606l, ((Strength) C15788i.m25602a(cacheBuilder2.f35601g, strength2)).defaultEquivalence());
        this.f35624g = (Equivalence) C15788i.m25602a(cacheBuilder2.f35607m, ((Strength) C15788i.m25602a(cacheBuilder2.f35602h, strength2)).defaultEquivalence());
        long j = 0;
        long j2 = (cacheBuilder2.f35603i == 0 || cacheBuilder2.f35604j == 0) ? 0 : cacheBuilder2.f35600f == null ? cacheBuilder2.f35598d : cacheBuilder2.f35599e;
        this.f35627j = j2;
        C15878j<? super K, ? super V> jVar = cacheBuilder2.f35600f;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.INSTANCE;
        C15878j<K, V> jVar2 = (C15878j) C15788i.m25602a(jVar, oneWeigher);
        this.f35628k = jVar2;
        long j3 = cacheBuilder2.f35604j;
        this.f35629l = j3 == -1 ? 0 : j3;
        long j4 = cacheBuilder2.f35603i;
        this.f35630m = j4 == -1 ? 0 : j4;
        long j5 = cacheBuilder2.f35605k;
        this.f35631n = j5 != -1 ? j5 : j;
        C15877i<? super K, ? super V> iVar = cacheBuilder2.f35608n;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.INSTANCE;
        C15877i<K, V> iVar2 = (C15877i) C15788i.m25602a(iVar, nullListener);
        this.f35633p = iVar2;
        this.f35632o = iVar2 == nullListener ? f35618z : new ConcurrentLinkedQueue();
        int i2 = 1;
        boolean z = mo55814h() || mo55803c();
        C15806u uVar = cacheBuilder2.f35609o;
        if (uVar == null) {
            uVar = z ? C15806u.f35590a : CacheBuilder.f35593s;
        }
        this.f35634q = uVar;
        this.f35635r = EntryFactory.getFactory(strength3, mo55817j() || mo55803c(), mo55807d() || mo55814h());
        this.f35636s = (C15870b) cacheBuilder2.f35610p.get();
        this.f35637t = cacheLoader;
        int i3 = cacheBuilder2.f35596b;
        int min = Math.min(i3 == -1 ? 16 : i3, 1073741824);
        if (mo55802b()) {
            if (!(jVar2 != oneWeigher)) {
                min = (int) Math.min((long) min, j2);
            }
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.f35622e && (!mo55802b() || ((long) (i5 * 20)) <= this.f35627j)) {
            i4++;
            i5 <<= 1;
        }
        this.f35620c = 32 - i4;
        this.f35619b = i5 - 1;
        this.f35621d = new Segment[i5];
        int i6 = min / i5;
        while (i2 < (i6 * i5 < min ? i6 + 1 : i6)) {
            i2 <<= 1;
        }
        if (mo55802b()) {
            long j6 = this.f35627j;
            long j7 = (long) i5;
            long j8 = j6 % j7;
            long j9 = (j6 / j7) + 1;
            int i7 = 0;
            while (true) {
                Segment<K, V>[] segmentArr = this.f35621d;
                if (i7 < segmentArr.length) {
                    if (((long) i7) == j8) {
                        j9--;
                    }
                    long j10 = j9;
                    segmentArr[i7] = new Segment<>(this, i2, j10, (C15870b) cacheBuilder2.f35610p.get());
                    i7++;
                    j9 = j10;
                } else {
                    return;
                }
            }
        } else {
            int i8 = 0;
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f35621d;
                if (i8 < segmentArr2.length) {
                    segmentArr2[i8] = new Segment<>(this, i2, -1, (C15870b) cacheBuilder2.f35610p.get());
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ArrayList m25640a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterators.m25978a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo55802b() {
        return this.f35627j >= 0;
    }

    /* renamed from: c */
    public final boolean mo55803c() {
        return this.f35629l > 0;
    }

    public final void clear() {
        for (Segment<K, V> clear : this.f35621d) {
            clear.clear();
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int e = mo55808e(obj);
        return mo55815i(e).containsKey(obj, e);
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Object obj2 = obj;
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        long a = this.f35634q.mo55787a();
        Segment<K, V>[] segmentArr = this.f35621d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = segmentArr.length;
            int i2 = z;
            while (i2 < length) {
                Segment<K, V> segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = segment.table;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    C15876h hVar = atomicReferenceArray.get(i4);
                    while (hVar != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(hVar, a);
                        long j3 = a;
                        if (liveValue != null && this.f35624g.equivalent(obj2, liveValue)) {
                            return true;
                        }
                        hVar = hVar.getNext();
                        segmentArr = segmentArr2;
                        a = j3;
                    }
                    long j4 = a;
                    Segment<K, V>[] segmentArr3 = segmentArr;
                }
                Segment<K, V>[] segmentArr4 = segmentArr;
                j2 += (long) segment.modCount;
                i2++;
                a = a;
                z = false;
            }
            long j5 = a;
            Segment<K, V>[] segmentArr5 = segmentArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            segmentArr = segmentArr5;
            a = j5;
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo55807d() {
        return this.f35630m > 0;
    }

    /* renamed from: e */
    public final int mo55808e(@NullableDecl Object obj) {
        int hash = this.f35623f.hash(obj);
        int i = hash + ((hash << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        C15839g gVar = this.f35640w;
        if (gVar != null) {
            return gVar;
        }
        C15839g gVar2 = new C15839g(this);
        this.f35640w = gVar2;
        return gVar2;
    }

    /* renamed from: f */
    public final boolean mo55810f(C15876h<K, V> hVar, long j) {
        hVar.getClass();
        if (!mo55803c() || j - hVar.getAccessTime() < this.f35629l) {
            return mo55807d() && j - hVar.getWriteTime() >= this.f35630m;
        }
        return true;
    }

    @NullableDecl
    /* renamed from: g */
    public final Map mo55811g(LinkedHashSet linkedHashSet, CacheLoader cacheLoader) throws ExecutionException {
        cacheLoader.getClass();
        C15806u.C15807a aVar = C15806u.f35590a;
        boolean z = true;
        C15794l.m25624r(!false, "This stopwatch is already running.");
        long a = aVar.mo55787a();
        boolean z2 = false;
        try {
            Map loadAll = cacheLoader.loadAll(linkedHashSet);
            if (loadAll != null) {
                long a2 = (aVar.mo55787a() - a) + 0;
                for (Map.Entry entry : loadAll.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key == null || value == null) {
                        z2 = true;
                    } else {
                        put(key, value);
                    }
                }
                if (!z2) {
                    this.f35636s.mo55796e(TimeUnit.NANOSECONDS.convert(a2, TimeUnit.NANOSECONDS));
                    return loadAll;
                }
                this.f35636s.mo55795d(TimeUnit.NANOSECONDS.convert(a2, TimeUnit.NANOSECONDS));
                throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null keys or values from loadAll");
            }
            this.f35636s.mo55795d(TimeUnit.NANOSECONDS.convert((aVar.mo55787a() - a) + 0, TimeUnit.NANOSECONDS));
            throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null map from loadAll");
        } catch (CacheLoader.UnsupportedLoadingOperationException e) {
            throw e;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new ExecutionException(e2);
        } catch (RuntimeException e3) {
            throw new UncheckedExecutionException((Throwable) e3);
        } catch (Exception e4) {
            throw new ExecutionException(e4);
        } catch (Error e5) {
            throw new ExecutionError(e5);
        } catch (Throwable th) {
            th = th;
        }
        if (!z) {
            this.f35636s.mo55795d(TimeUnit.NANOSECONDS.convert((aVar.mo55787a() - a) + 0, TimeUnit.NANOSECONDS));
        }
        throw th;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo55808e(obj);
        return mo55815i(e).get(obj, e);
    }

    @NullableDecl
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public final boolean mo55814h() {
        if (!mo55807d()) {
            if (!(this.f35631n > 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final Segment<K, V> mo55815i(int i) {
        return this.f35621d[(i >>> this.f35620c) & this.f35619b];
    }

    public final boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f35621d;
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

    /* renamed from: j */
    public final boolean mo55817j() {
        return mo55803c() || mo55802b();
    }

    public final Set<K> keySet() {
        C15842j jVar = this.f35638u;
        if (jVar != null) {
            return jVar;
        }
        C15842j jVar2 = new C15842j(this);
        this.f35638u = jVar2;
        return jVar2;
    }

    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int e = mo55808e(k);
        return mo55815i(e).put(k, e, v, false);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int e = mo55808e(k);
        return mo55815i(e).put(k, e, v, true);
    }

    public final V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo55808e(obj);
        return mo55815i(e).remove(obj, e);
    }

    public final V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int e = mo55808e(k);
        return mo55815i(e).replace(k, e, v);
    }

    public final int size() {
        Segment<K, V>[] segmentArr = this.f35621d;
        long j = 0;
        for (Segment<K, V> segment : segmentArr) {
            j += (long) Math.max(0, segment.count);
        }
        return Ints.m26384b(j);
    }

    public final Collection<V> values() {
        C15853t tVar = this.f35639v;
        if (tVar != null) {
            return tVar;
        }
        C15853t tVar2 = new C15853t(this);
        this.f35639v = tVar2;
        return tVar2;
    }

    /* renamed from: com.google.common.cache.LocalCache$k */
    public static class C15843k<K, V> implements C15852s<K, V> {

        /* renamed from: b */
        public volatile C15852s<K, V> f35671b;

        /* renamed from: c */
        public final C16395r<V> f35672c;

        /* renamed from: d */
        public final C15801q f35673d;

        /* renamed from: com.google.common.cache.LocalCache$k$a */
        public class C15844a implements C15784e<V, V> {
            public C15844a() {
            }

            public final V apply(V v) {
                C15843k.this.f35672c.mo58424l(v);
                return v;
            }
        }

        public C15843k() {
            this(LocalCache.f35617y);
        }

        /* renamed from: a */
        public final boolean mo55929a() {
            return true;
        }

        /* renamed from: b */
        public final int mo55930b() {
            return this.f35671b.mo55930b();
        }

        /* renamed from: c */
        public final C15876h<K, V> mo55931c() {
            return null;
        }

        /* renamed from: d */
        public final void mo55932d(@NullableDecl V v) {
            if (v != null) {
                this.f35672c.mo58424l(v);
            } else {
                this.f35671b = LocalCache.f35617y;
            }
        }

        /* renamed from: e */
        public final C15852s<K, V> mo55933e(ReferenceQueue<V> referenceQueue, @NullableDecl V v, C15876h<K, V> hVar) {
            return this;
        }

        /* renamed from: f */
        public final V mo55934f() throws ExecutionException {
            return C16397t.m26516a(this.f35672c);
        }

        /* renamed from: g */
        public final C16388l<V> mo55986g(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                C15801q qVar = this.f35673d;
                C15794l.m25624r(!qVar.f35586b, "This stopwatch is already running.");
                qVar.f35586b = true;
                qVar.f35587c = qVar.f35585a.mo55787a();
                V v = this.f35671b.get();
                if (v == null) {
                    V load = cacheLoader.load(k);
                    return this.f35672c.mo58424l(load) ? this.f35672c : load == null ? C16385k.C16387b.f36497d : new C16385k.C16387b(load);
                }
                C16388l<V> reload = cacheLoader.reload(k, v);
                return reload == null ? C16385k.C16387b.f36497d : C16381h.m26508v0(reload, new C15844a(), C16392o.m26513a());
            } catch (Throwable th) {
                C16388l<V> aVar = this.f35672c.mo58317k(th) ? this.f35672c : new C16385k.C16386a<>(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return aVar;
            }
        }

        public final V get() {
            return this.f35671b.get();
        }

        public final boolean isActive() {
            return this.f35671b.isActive();
        }

        public C15843k(C15852s<K, V> sVar) {
            this.f35672c = new C16395r<>();
            this.f35673d = new C15801q();
            this.f35671b = sVar;
        }
    }

    public final boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e = mo55808e(obj);
        return mo55815i(e).remove(obj, e, obj2);
    }

    public final boolean replace(K k, @NullableDecl V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int e = mo55808e(k);
        return mo55815i(e).replace(k, e, v, v2);
    }

    public static class Segment<K, V> extends ReentrantLock {
        @GuardedBy("this")
        public final Queue<C15876h<K, V>> accessQueue;
        public volatile int count;
        @NullableDecl
        public final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        public final LocalCache<K, V> map;
        public final long maxSegmentWeight;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public final Queue<C15876h<K, V>> recencyQueue;
        public final C15870b statsCounter;
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<C15876h<K, V>> table;
        public int threshold;
        @GuardedBy("this")
        public long totalWeight;
        @NullableDecl
        public final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy("this")
        public final Queue<C15876h<K, V>> writeQueue;

        /* renamed from: com.google.common.cache.LocalCache$Segment$a */
        public class C15821a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Object f35642b;

            /* renamed from: c */
            public final /* synthetic */ int f35643c;

            /* renamed from: d */
            public final /* synthetic */ C15843k f35644d;

            /* renamed from: e */
            public final /* synthetic */ C16388l f35645e;

            public C15821a(Object obj, int i, C15843k kVar, C16388l lVar) {
                this.f35642b = obj;
                this.f35643c = i;
                this.f35644d = kVar;
                this.f35645e = lVar;
            }

            public final void run() {
                try {
                    Segment.this.getAndRecordStats(this.f35642b, this.f35643c, this.f35644d, this.f35645e);
                } catch (Throwable th) {
                    LocalCache.f35616x.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f35644d.f35672c.mo58317k(th);
                }
            }
        }

        public Segment(LocalCache<K, V> localCache, int i, long j, C15870b bVar) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            bVar.getClass();
            this.statsCounter = bVar;
            initTable(newEntryArray(i));
            Strength strength = localCache.f35625h;
            Strength strength2 = Strength.STRONG;
            boolean z = true;
            ReferenceQueue<V> referenceQueue = null;
            this.keyReferenceQueue = strength != strength2 ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.f35626i == strength2 ? false : z ? new ReferenceQueue<>() : referenceQueue;
            this.recencyQueue = localCache.mo55817j() ? new ConcurrentLinkedQueue<>() : LocalCache.f35618z;
            this.writeQueue = localCache.mo55807d() ? new C15830c0<>() : LocalCache.f35618z;
            this.accessQueue = localCache.mo55817j() ? new C15835e<>() : LocalCache.f35618z;
        }

        public void cleanUp() {
            runLockedCleanup(this.map.f35634q.mo55787a());
            runUnlockedCleanup();
        }

        public void clear() {
            RemovalCause removalCause;
            if (this.count != 0) {
                lock();
                try {
                    preWriteCleanup(this.map.f35634q.mo55787a());
                    AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (C15876h hVar = atomicReferenceArray.get(i); hVar != null; hVar = hVar.getNext()) {
                            if (hVar.getValueReference().isActive()) {
                                Object key = hVar.getKey();
                                Object obj = hVar.getValueReference().get();
                                if (key != null) {
                                    if (obj != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        enqueueNotification(key, hVar.getHash(), obj, hVar.getValueReference().mo55930b(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                enqueueNotification(key, hVar.getHash(), obj, hVar.getValueReference().mo55930b(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, (Object) null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                    postWriteCleanup();
                }
            }
        }

        public void clearKeyReferenceQueue() {
            do {
            } while (this.keyReferenceQueue.poll() != null);
        }

        public void clearReferenceQueues() {
            Strength strength = this.map.f35625h;
            Strength strength2 = Strength.STRONG;
            boolean z = true;
            if (strength != strength2) {
                clearKeyReferenceQueue();
            }
            if (this.map.f35626i == strength2) {
                z = false;
            }
            if (z) {
                clearValueReferenceQueue();
            }
        }

        public void clearValueReferenceQueue() {
            do {
            } while (this.valueReferenceQueue.poll() != null);
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    C15876h liveEntry = getLiveEntry(obj, i, this.map.f35634q.mo55787a());
                    if (liveEntry == null) {
                        return false;
                    }
                    if (liveEntry.getValueReference().get() != null) {
                        z = true;
                    }
                    postReadCleanup();
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
                    long a = this.map.f35634q.mo55787a();
                    AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C15876h hVar = atomicReferenceArray.get(i); hVar != null; hVar = hVar.getNext()) {
                            Object liveValue = getLiveValue(hVar, a);
                            if (liveValue != null) {
                                if (this.map.f35624g.equivalent(obj, liveValue)) {
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

        @GuardedBy("this")
        public C15876h<K, V> copyEntry(C15876h<K, V> hVar, C15876h<K, V> hVar2) {
            if (hVar.getKey() == null) {
                return null;
            }
            C15852s<K, V> valueReference = hVar.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            C15876h<K, V> copyEntry = this.map.f35635r.copyEntry(this, hVar, hVar2);
            copyEntry.setValueReference(valueReference.mo55933e(this.valueReferenceQueue, v, copyEntry));
            return copyEntry;
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    C15876h hVar = (C15876h) poll;
                    LocalCache<K, V> localCache = this.map;
                    localCache.getClass();
                    int hash = hVar.getHash();
                    localCache.mo55815i(hash).reclaimKey(hVar, hash);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void drainRecencyQueue() {
            while (true) {
                C15876h poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        @GuardedBy("this")
        public void drainReferenceQueues() {
            Strength strength = this.map.f35625h;
            Strength strength2 = Strength.STRONG;
            boolean z = true;
            if (strength != strength2) {
                drainKeyReferenceQueue();
            }
            if (this.map.f35626i == strength2) {
                z = false;
            }
            if (z) {
                drainValueReferenceQueue();
            }
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    C15852s sVar = (C15852s) poll;
                    LocalCache<K, V> localCache = this.map;
                    localCache.getClass();
                    C15876h c = sVar.mo55931c();
                    int hash = c.getHash();
                    localCache.mo55815i(hash).reclaimValue(c.getKey(), hash, sVar);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void enqueueNotification(@NullableDecl K k, int i, @NullableDecl V v, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.mo55794c();
            }
            if (this.map.f35632o != LocalCache.f35618z) {
                this.map.f35632o.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        @GuardedBy("this")
        public void evictEntries(C15876h<K, V> hVar) {
            if (this.map.mo55802b()) {
                drainRecencyQueue();
                if (((long) hVar.getValueReference().mo55930b()) <= this.maxSegmentWeight || removeEntry(hVar, hVar.getHash(), RemovalCause.SIZE)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        C15876h nextEvictable = getNextEvictable();
                        if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<C15876h<K, V>> newEntryArray = newEntryArray(length << 1);
                this.threshold = (newEntryArray.length() * 3) / 4;
                int length2 = newEntryArray.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C15876h hVar = atomicReferenceArray.get(i2);
                    if (hVar != null) {
                        C15876h next = hVar.getNext();
                        int hash = hVar.getHash() & length2;
                        if (next == null) {
                            newEntryArray.set(hash, hVar);
                        } else {
                            C15876h hVar2 = hVar;
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
                                C15876h copyEntry = copyEntry(hVar, newEntryArray.get(hash3));
                                if (copyEntry != null) {
                                    newEntryArray.set(hash3, copyEntry);
                                } else {
                                    removeCollectedEntry(hVar);
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

        @GuardedBy("this")
        public void expireEntries(long j) {
            C15876h peek;
            C15876h peek2;
            drainRecencyQueue();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.mo55810f(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.mo55810f(peek2, j)) {
                            return;
                        }
                    } while (removeEntry(peek2, peek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (removeEntry(peek, peek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        public V get(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C15876h entry;
            k.getClass();
            cacheLoader.getClass();
            try {
                if (!(this.count == 0 || (entry = getEntry(k, i)) == null)) {
                    long a = this.map.f35634q.mo55787a();
                    Object liveValue = getLiveValue(entry, a);
                    if (liveValue != null) {
                        recordRead(entry, a);
                        this.statsCounter.mo55792a(1);
                        V scheduleRefresh = scheduleRefresh(entry, k, i, liveValue, a, cacheLoader);
                        postReadCleanup();
                        return scheduleRefresh;
                    }
                    C15852s valueReference = entry.getValueReference();
                    if (valueReference.mo55929a()) {
                        V waitForLoadingValue = waitForLoadingValue(entry, k, valueReference);
                        postReadCleanup();
                        return waitForLoadingValue;
                    }
                }
                V lockedGetOrLoad = lockedGetOrLoad(k, i, cacheLoader);
                postReadCleanup();
                return lockedGetOrLoad;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new ExecutionError((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new UncheckedExecutionException(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                postReadCleanup();
                throw th;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V getAndRecordStats(K r4, int r5, com.google.common.cache.LocalCache.C15843k<K, V> r6, com.google.common.util.concurrent.C16388l<V> r7) throws java.util.concurrent.ExecutionException {
            /*
                r3 = this;
                java.lang.Object r7 = com.google.common.util.concurrent.C16397t.m26516a(r7)     // Catch:{ all -> 0x0035 }
                if (r7 == 0) goto L_0x0019
                com.google.common.cache.b r0 = r3.statsCounter     // Catch:{ all -> 0x0017 }
                com.google.common.base.q r1 = r6.f35673d     // Catch:{ all -> 0x0017 }
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0017 }
                long r1 = r1.mo55785a(r2)     // Catch:{ all -> 0x0017 }
                r0.mo55796e(r1)     // Catch:{ all -> 0x0017 }
                r3.storeLoadedValue(r4, r5, r6, r7)     // Catch:{ all -> 0x0017 }
                return r7
            L_0x0017:
                r0 = move-exception
                goto L_0x0037
            L_0x0019:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x0017 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
                r1.<init>()     // Catch:{ all -> 0x0017 }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.append(r2)     // Catch:{ all -> 0x0017 }
                r1.append(r4)     // Catch:{ all -> 0x0017 }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x0017 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0017 }
                r0.<init>(r1)     // Catch:{ all -> 0x0017 }
                throw r0     // Catch:{ all -> 0x0017 }
            L_0x0035:
                r0 = move-exception
                r7 = 0
            L_0x0037:
                if (r7 != 0) goto L_0x0049
                com.google.common.cache.b r7 = r3.statsCounter
                com.google.common.base.q r1 = r6.f35673d
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r1 = r1.mo55785a(r2)
                r7.mo55795d(r1)
                r3.removeLoadingValue(r4, r5, r6)
            L_0x0049:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.getAndRecordStats(java.lang.Object, int, com.google.common.cache.LocalCache$k, com.google.common.util.concurrent.l):java.lang.Object");
        }

        @NullableDecl
        public C15876h<K, V> getEntry(Object obj, int i) {
            for (C15876h<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f35623f.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public C15876h<K, V> getFirst(int i) {
            AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @NullableDecl
        public C15876h<K, V> getLiveEntry(Object obj, int i, long j) {
            C15876h<K, V> entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.mo55810f(entry, j)) {
                return entry;
            }
            tryExpireEntries(j);
            return null;
        }

        public V getLiveValue(C15876h<K, V> hVar, long j) {
            if (hVar.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = hVar.getValueReference().get();
            if (v == null) {
                tryDrainReferenceQueues();
                return null;
            } else if (!this.map.mo55810f(hVar, j)) {
                return v;
            } else {
                tryExpireEntries(j);
                return null;
            }
        }

        @GuardedBy("this")
        public C15876h<K, V> getNextEvictable() {
            for (C15876h<K, V> next : this.accessQueue) {
                if (next.getValueReference().mo55930b() > 0) {
                    return next;
                }
            }
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (!(this.map.f35628k != CacheBuilder.OneWeigher.INSTANCE) && ((long) length) == this.maxSegmentWeight) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        @NullableDecl
        public C15843k<K, V> insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long a = this.map.f35634q.mo55787a();
                preWriteCleanup(a);
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.f35623f.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        C15852s valueReference = hVar2.getValueReference();
                        if (!valueReference.mo55929a()) {
                            if (!z || a - hVar2.getWriteTime() >= this.map.f35631n) {
                                this.modCount++;
                                C15843k<K, V> kVar = new C15843k<>(valueReference);
                                hVar2.setValueReference(kVar);
                                unlock();
                                postWriteCleanup();
                                return kVar;
                            }
                        }
                        return null;
                    }
                }
                this.modCount++;
                C15843k<K, V> kVar2 = new C15843k<>();
                C15876h newEntry = newEntry(k, i, hVar);
                newEntry.setValueReference(kVar2);
                atomicReferenceArray.set(length, newEntry);
                unlock();
                postWriteCleanup();
                return kVar2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public C16388l<V> loadAsync(K k, int i, C15843k<K, V> kVar, CacheLoader<? super K, V> cacheLoader) {
            C16388l<V> g = kVar.mo55986g(k, cacheLoader);
            g.mo7981e(new C15821a(k, i, kVar, g), C16392o.m26513a());
            return g;
        }

        public V loadSync(K k, int i, C15843k<K, V> kVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k, i, kVar, kVar.mo55986g(k, cacheLoader));
        }

        public V lockedGetOrLoad(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C15843k kVar;
            boolean z;
            C15852s sVar;
            V loadSync;
            K k2 = k;
            int i2 = i;
            lock();
            try {
                long a = this.map.f35634q.mo55787a();
                preWriteCleanup(a);
                int i3 = this.count - 1;
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (true) {
                    kVar = null;
                    if (hVar2 == null) {
                        z = true;
                        sVar = null;
                        break;
                    }
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i2 || key == null || !this.map.f35623f.equivalent(k2, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        C15852s valueReference = hVar2.getValueReference();
                        if (valueReference.mo55929a()) {
                            z = false;
                        } else {
                            V v = valueReference.get();
                            if (v == null) {
                                enqueueNotification(key, i, v, valueReference.mo55930b(), RemovalCause.COLLECTED);
                            } else if (this.map.mo55810f(hVar2, a)) {
                                enqueueNotification(key, i, v, valueReference.mo55930b(), RemovalCause.EXPIRED);
                            } else {
                                recordLockedRead(hVar2, a);
                                this.statsCounter.mo55792a(1);
                                unlock();
                                postWriteCleanup();
                                return v;
                            }
                            this.writeQueue.remove(hVar2);
                            this.accessQueue.remove(hVar2);
                            this.count = i3;
                            z = true;
                        }
                        sVar = valueReference;
                    }
                }
                if (z) {
                    kVar = new C15843k();
                    if (hVar2 == null) {
                        hVar2 = newEntry(k2, i2, hVar);
                        hVar2.setValueReference(kVar);
                        atomicReferenceArray.set(length, hVar2);
                    } else {
                        hVar2.setValueReference(kVar);
                    }
                }
                if (!z) {
                    return waitForLoadingValue(hVar2, k2, sVar);
                }
                try {
                    synchronized (hVar2) {
                        loadSync = loadSync(k2, i2, kVar, cacheLoader);
                    }
                    this.statsCounter.mo55793b(1);
                    return loadSync;
                } catch (Throwable th) {
                    this.statsCounter.mo55793b(1);
                    throw th;
                }
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @GuardedBy("this")
        public C15876h<K, V> newEntry(K k, int i, @NullableDecl C15876h<K, V> hVar) {
            EntryFactory entryFactory = this.map.f35635r;
            k.getClass();
            return entryFactory.newEntry(this, k, i, hVar);
        }

        public AtomicReferenceArray<C15876h<K, V>> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        @GuardedBy("this")
        public void preWriteCleanup(long j) {
            runLockedCleanup(j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            r1 = r12.getValueReference();
            r10 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            if (r10 != null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
            r7.modCount++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            if (r1.isActive() == false) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
            enqueueNotification(r15, r16, r10, r1.mo55930b(), com.google.common.cache.RemovalCause.COLLECTED);
            setValue(r12, r15, r17, r8);
            r0 = r7.count;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
            setValue(r12, r15, r17, r8);
            r0 = r7.count + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
            r7.count = r0;
            evictEntries(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
            if (r18 == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            recordLockedRead(r12, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
            return r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r7.modCount++;
            enqueueNotification(r15, r16, r10, r1.mo55930b(), com.google.common.cache.RemovalCause.REPLACED);
            setValue(r12, r15, r17, r8);
            evictEntries(r12);
         */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V put(K r15, int r16, V r17, boolean r18) {
            /*
                r14 = this;
                r7 = r14
                r0 = r15
                r3 = r16
                r14.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r7.map     // Catch:{ all -> 0x00e3 }
                com.google.common.base.u r1 = r1.f35634q     // Catch:{ all -> 0x00e3 }
                long r8 = r1.mo55787a()     // Catch:{ all -> 0x00e3 }
                r14.preWriteCleanup(r8)     // Catch:{ all -> 0x00e3 }
                int r1 = r7.count     // Catch:{ all -> 0x00e3 }
                int r1 = r1 + 1
                int r2 = r7.threshold     // Catch:{ all -> 0x00e3 }
                if (r1 <= r2) goto L_0x001d
                r14.expand()     // Catch:{ all -> 0x00e3 }
            L_0x001d:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.h<K, V>> r10 = r7.table     // Catch:{ all -> 0x00e3 }
                int r1 = r10.length()     // Catch:{ all -> 0x00e3 }
                int r1 = r1 + -1
                r11 = r3 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.h r1 = (com.google.common.cache.C15876h) r1     // Catch:{ all -> 0x00e3 }
                r12 = r1
            L_0x002e:
                r13 = 0
                if (r12 == 0) goto L_0x00c3
                java.lang.Object r2 = r12.getKey()     // Catch:{ all -> 0x00e3 }
                int r4 = r12.getHash()     // Catch:{ all -> 0x00e3 }
                if (r4 != r3) goto L_0x00bd
                if (r2 == 0) goto L_0x00bd
                com.google.common.cache.LocalCache<K, V> r4 = r7.map     // Catch:{ all -> 0x00e3 }
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f35623f     // Catch:{ all -> 0x00e3 }
                boolean r2 = r4.equivalent(r15, r2)     // Catch:{ all -> 0x00e3 }
                if (r2 == 0) goto L_0x00bd
                com.google.common.cache.LocalCache$s r1 = r12.getValueReference()     // Catch:{ all -> 0x00e3 }
                java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x00e3 }
                if (r10 != 0) goto L_0x0090
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                boolean r2 = r1.isActive()     // Catch:{ all -> 0x00e3 }
                if (r2 == 0) goto L_0x0077
                int r5 = r1.mo55930b()     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                goto L_0x0084
            L_0x0077:
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                int r0 = r0 + 1
            L_0x0084:
                r7.count = r0     // Catch:{ all -> 0x00e3 }
                r14.evictEntries(r12)     // Catch:{ all -> 0x00e3 }
            L_0x0089:
                r14.unlock()
                r14.postWriteCleanup()
                return r13
            L_0x0090:
                if (r18 == 0) goto L_0x009c
                r14.recordLockedRead(r12, r8)     // Catch:{ all -> 0x00e3 }
            L_0x0095:
                r14.unlock()
                r14.postWriteCleanup()
                return r10
            L_0x009c:
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                int r5 = r1.mo55930b()     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r10
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                r14.evictEntries(r12)     // Catch:{ all -> 0x00e3 }
                goto L_0x0095
            L_0x00bd:
                com.google.common.cache.h r12 = r12.getNext()     // Catch:{ all -> 0x00e3 }
                goto L_0x002e
            L_0x00c3:
                int r2 = r7.modCount     // Catch:{ all -> 0x00e3 }
                int r2 = r2 + 1
                r7.modCount = r2     // Catch:{ all -> 0x00e3 }
                com.google.common.cache.h r12 = r14.newEntry(r15, r3, r1)     // Catch:{ all -> 0x00e3 }
                r1 = r14
                r2 = r12
                r3 = r15
                r4 = r17
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00e3 }
                r10.set(r11, r12)     // Catch:{ all -> 0x00e3 }
                int r0 = r7.count     // Catch:{ all -> 0x00e3 }
                int r0 = r0 + 1
                r7.count = r0     // Catch:{ all -> 0x00e3 }
                r14.evictEntries(r12)     // Catch:{ all -> 0x00e3 }
                goto L_0x0089
            L_0x00e3:
                r0 = move-exception
                r14.unlock()
                r14.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        public boolean reclaimKey(C15876h<K, V> hVar, int i) {
            lock();
            try {
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h<K, V> hVar2 = atomicReferenceArray.get(length);
                for (C15876h<K, V> hVar3 = hVar2; hVar3 != null; hVar3 = hVar3.getNext()) {
                    if (hVar3 == hVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeValueFromChain(hVar2, hVar3, hVar3.getKey(), i, hVar3.getValueReference().get(), hVar3.getValueReference(), RemovalCause.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public boolean reclaimValue(K k, int i, C15852s<K, V> sVar) {
            lock();
            try {
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.f35623f.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else if (hVar2.getValueReference() == sVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeValueFromChain(hVar, hVar2, key, i, sVar.get(), sVar, RemovalCause.COLLECTED));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            postWriteCleanup();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
            }
        }

        @GuardedBy("this")
        public void recordLockedRead(C15876h<K, V> hVar, long j) {
            if (this.map.mo55803c()) {
                hVar.setAccessTime(j);
            }
            this.accessQueue.add(hVar);
        }

        public void recordRead(C15876h<K, V> hVar, long j) {
            if (this.map.mo55803c()) {
                hVar.setAccessTime(j);
            }
            this.recencyQueue.add(hVar);
        }

        @GuardedBy("this")
        public void recordWrite(C15876h<K, V> hVar, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += (long) i;
            if (this.map.mo55803c()) {
                hVar.setAccessTime(j);
            }
            if (this.map.mo55814h()) {
                hVar.setWriteTime(j);
            }
            this.accessQueue.add(hVar);
            this.writeQueue.add(hVar);
        }

        @NullableDecl
        public V refresh(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C15843k insertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (insertLoadingValueReference == null) {
                return null;
            }
            C16388l<V> loadAsync = loadAsync(k, i, insertLoadingValueReference, cacheLoader);
            if (loadAsync.isDone()) {
                try {
                    return C16397t.m26516a(loadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @NullableDecl
        public V remove(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.f35634q.mo55787a());
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (true) {
                    if (hVar2 == null) {
                        break;
                    }
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.f35623f.equivalent(obj, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        C15852s valueReference = hVar2.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (valueReference.isActive()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        atomicReferenceArray.set(length, removeValueFromChain(hVar, hVar2, key, i, v, valueReference, removalCause2));
                        this.count--;
                        return v;
                    }
                }
                unlock();
                postWriteCleanup();
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @GuardedBy("this")
        public void removeCollectedEntry(C15876h<K, V> hVar) {
            enqueueNotification(hVar.getKey(), hVar.getHash(), hVar.getValueReference().get(), hVar.getValueReference().mo55930b(), RemovalCause.COLLECTED);
            this.writeQueue.remove(hVar);
            this.accessQueue.remove(hVar);
        }

        @GuardedBy("this")
        public boolean removeEntry(C15876h<K, V> hVar, int i, RemovalCause removalCause) {
            AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            C15876h<K, V> hVar2 = atomicReferenceArray.get(length);
            for (C15876h<K, V> hVar3 = hVar2; hVar3 != null; hVar3 = hVar3.getNext()) {
                if (hVar3 == hVar) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeValueFromChain(hVar2, hVar3, hVar3.getKey(), i, hVar3.getValueReference().get(), hVar3.getValueReference(), removalCause));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @NullableDecl
        @GuardedBy("this")
        public C15876h<K, V> removeEntryFromChain(C15876h<K, V> hVar, C15876h<K, V> hVar2) {
            int i = this.count;
            C15876h<K, V> next = hVar2.getNext();
            while (hVar != hVar2) {
                C15876h<K, V> copyEntry = copyEntry(hVar, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(hVar);
                    i--;
                }
                hVar = hVar.getNext();
            }
            this.count = i;
            return next;
        }

        public boolean removeLoadingValue(K k, int i, C15843k<K, V> kVar) {
            lock();
            try {
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (true) {
                    if (hVar2 == null) {
                        break;
                    }
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.f35623f.equivalent(k, key)) {
                        hVar2 = hVar2.getNext();
                    } else if (hVar2.getValueReference() == kVar) {
                        if (kVar.isActive()) {
                            hVar2.setValueReference(kVar.f35671b);
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(hVar, hVar2));
                        }
                        return true;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        @NullableDecl
        @GuardedBy("this")
        public C15876h<K, V> removeValueFromChain(C15876h<K, V> hVar, C15876h<K, V> hVar2, @NullableDecl K k, int i, V v, C15852s<K, V> sVar, RemovalCause removalCause) {
            enqueueNotification(k, i, v, sVar.mo55930b(), removalCause);
            this.writeQueue.remove(hVar2);
            this.accessQueue.remove(hVar2);
            if (!sVar.mo55929a()) {
                return removeEntryFromChain(hVar, hVar2);
            }
            sVar.mo55932d(null);
            return hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r16 = r13.getValueReference();
            r6 = r16.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r6 != null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r16.isActive() == false) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.modCount++;
            r10.set(r12, removeValueFromChain(r2, r13, r4, r19, r6, r16, com.google.common.cache.RemovalCause.COLLECTED));
            r9.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
            if (r9.map.f35624g.equivalent(r20, r6) == false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
            r9.modCount++;
            enqueueNotification(r18, r19, r6, r16.mo55930b(), com.google.common.cache.RemovalCause.REPLACED);
            setValue(r13, r18, r21, r7);
            evictEntries(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            recordLockedRead(r13, r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean replace(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.u r1 = r1.f35634q     // Catch:{ all -> 0x00b5 }
                long r7 = r1.mo55787a()     // Catch:{ all -> 0x00b5 }
                r9.preWriteCleanup(r7)     // Catch:{ all -> 0x00b5 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.h<K, V>> r10 = r9.table     // Catch:{ all -> 0x00b5 }
                int r1 = r10.length()     // Catch:{ all -> 0x00b5 }
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch:{ all -> 0x00b5 }
                r2 = r1
                com.google.common.cache.h r2 = (com.google.common.cache.C15876h) r2     // Catch:{ all -> 0x00b5 }
                r13 = r2
            L_0x0024:
                r14 = 0
                if (r13 == 0) goto L_0x0069
                java.lang.Object r4 = r13.getKey()     // Catch:{ all -> 0x00b5 }
                int r1 = r13.getHash()     // Catch:{ all -> 0x00b5 }
                if (r1 != r0) goto L_0x00ab
                if (r4 == 0) goto L_0x00ab
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f35623f     // Catch:{ all -> 0x00b5 }
                r15 = r18
                boolean r1 = r1.equivalent(r15, r4)     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x00ad
                com.google.common.cache.LocalCache$s r16 = r13.getValueReference()     // Catch:{ all -> 0x00b5 }
                java.lang.Object r6 = r16.get()     // Catch:{ all -> 0x00b5 }
                if (r6 != 0) goto L_0x0070
                boolean r1 = r16.isActive()     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x0069
                int r1 = r9.modCount     // Catch:{ all -> 0x00b5 }
                int r1 = r1 + r11
                r9.modCount = r1     // Catch:{ all -> 0x00b5 }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.h r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b5 }
                int r1 = r9.count     // Catch:{ all -> 0x00b5 }
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch:{ all -> 0x00b5 }
                r9.count = r1     // Catch:{ all -> 0x00b5 }
            L_0x0069:
                r17.unlock()
                r17.postWriteCleanup()
                return r14
            L_0x0070:
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00b5 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f35624g     // Catch:{ all -> 0x00b5 }
                r3 = r20
                boolean r1 = r1.equivalent(r3, r6)     // Catch:{ all -> 0x00b5 }
                if (r1 == 0) goto L_0x00a7
                int r1 = r9.modCount     // Catch:{ all -> 0x00b5 }
                int r1 = r1 + r11
                r9.modCount = r1     // Catch:{ all -> 0x00b5 }
                int r5 = r16.mo55930b()     // Catch:{ all -> 0x00b5 }
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00b5 }
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00b5 }
                r9.evictEntries(r13)     // Catch:{ all -> 0x00b5 }
                r17.unlock()
                r17.postWriteCleanup()
                return r11
            L_0x00a7:
                r9.recordLockedRead(r13, r7)     // Catch:{ all -> 0x00b5 }
                goto L_0x0069
            L_0x00ab:
                r15 = r18
            L_0x00ad:
                r3 = r20
                com.google.common.cache.h r13 = r13.getNext()     // Catch:{ all -> 0x00b5 }
                goto L_0x0024
            L_0x00b5:
                r0 = move-exception
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        public void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                LocalCache<K, V> localCache = this.map;
                while (true) {
                    RemovalNotification removalNotification = (RemovalNotification) localCache.f35632o.poll();
                    if (removalNotification != null) {
                        try {
                            localCache.f35633p.onRemoval(removalNotification);
                        } catch (Throwable th) {
                            LocalCache.f35616x.log(Level.WARNING, "Exception thrown by removal listener", th);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public V scheduleRefresh(C15876h<K, V> hVar, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            V refresh;
            return (!((this.map.f35631n > 0 ? 1 : (this.map.f35631n == 0 ? 0 : -1)) > 0) || j - hVar.getWriteTime() <= this.map.f35631n || hVar.getValueReference().mo55929a() || (refresh = refresh(k, i, cacheLoader, true)) == null) ? v : refresh;
        }

        @GuardedBy("this")
        public void setValue(C15876h<K, V> hVar, K k, V v, long j) {
            C15852s<K, V> valueReference = hVar.getValueReference();
            int weigh = this.map.f35628k.weigh(k, v);
            C15794l.m25624r(weigh >= 0, "Weights must be non-negative");
            hVar.setValueReference(this.map.f35626i.referenceValue(this, hVar, v, weigh));
            recordWrite(hVar, weigh, j);
            valueReference.mo55932d(v);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
            r1 = r14.getValueReference();
            r4 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
            if (r18 == r1) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            if (r4 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
            if (r1 == com.google.common.cache.LocalCache.f35617y) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
            enqueueNotification(r16, r17, r19, 0, com.google.common.cache.RemovalCause.REPLACED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r7.modCount++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            if (r18.isActive() == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
            if (r4 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
            r1 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
            r1 = com.google.common.cache.RemovalCause.REPLACED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            enqueueNotification(r16, r17, r4, r18.mo55930b(), r1);
            r11 = r11 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            setValue(r14, r16, r19, r8);
            r7.count = r11;
            evictEntries(r14);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean storeLoadedValue(K r16, int r17, com.google.common.cache.LocalCache.C15843k<K, V> r18, V r19) {
            /*
                r15 = this;
                r7 = r15
                r0 = r16
                r3 = r17
                r15.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r7.map     // Catch:{ all -> 0x00cc }
                com.google.common.base.u r1 = r1.f35634q     // Catch:{ all -> 0x00cc }
                long r8 = r1.mo55787a()     // Catch:{ all -> 0x00cc }
                r15.preWriteCleanup(r8)     // Catch:{ all -> 0x00cc }
                int r1 = r7.count     // Catch:{ all -> 0x00cc }
                r10 = 1
                int r1 = r1 + r10
                int r2 = r7.threshold     // Catch:{ all -> 0x00cc }
                if (r1 <= r2) goto L_0x0021
                r15.expand()     // Catch:{ all -> 0x00cc }
                int r1 = r7.count     // Catch:{ all -> 0x00cc }
                int r1 = r1 + r10
            L_0x0021:
                r11 = r1
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.h<K, V>> r12 = r7.table     // Catch:{ all -> 0x00cc }
                int r1 = r12.length()     // Catch:{ all -> 0x00cc }
                int r1 = r1 - r10
                r13 = r3 & r1
                java.lang.Object r1 = r12.get(r13)     // Catch:{ all -> 0x00cc }
                com.google.common.cache.h r1 = (com.google.common.cache.C15876h) r1     // Catch:{ all -> 0x00cc }
                r14 = r1
            L_0x0032:
                if (r14 == 0) goto L_0x00aa
                java.lang.Object r2 = r14.getKey()     // Catch:{ all -> 0x00cc }
                int r4 = r14.getHash()     // Catch:{ all -> 0x00cc }
                if (r4 != r3) goto L_0x00a3
                if (r2 == 0) goto L_0x00a3
                com.google.common.cache.LocalCache<K, V> r4 = r7.map     // Catch:{ all -> 0x00cc }
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f35623f     // Catch:{ all -> 0x00cc }
                boolean r2 = r4.equivalent(r0, r2)     // Catch:{ all -> 0x00cc }
                if (r2 == 0) goto L_0x00a3
                com.google.common.cache.LocalCache$s r1 = r14.getValueReference()     // Catch:{ all -> 0x00cc }
                java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x00cc }
                r2 = r18
                if (r2 == r1) goto L_0x0072
                if (r4 != 0) goto L_0x005d
                com.google.common.cache.LocalCache$a r5 = com.google.common.cache.LocalCache.f35617y     // Catch:{ all -> 0x00cc }
                if (r1 == r5) goto L_0x005d
                goto L_0x0072
            L_0x005d:
                r5 = 0
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r16
                r3 = r17
                r4 = r19
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00cc }
                r0 = 0
                r15.unlock()
                r15.postWriteCleanup()
                return r0
            L_0x0072:
                int r1 = r7.modCount     // Catch:{ all -> 0x00cc }
                int r1 = r1 + r10
                r7.modCount = r1     // Catch:{ all -> 0x00cc }
                boolean r1 = r18.isActive()     // Catch:{ all -> 0x00cc }
                if (r1 == 0) goto L_0x0093
                if (r4 != 0) goto L_0x0082
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00cc }
                goto L_0x0084
            L_0x0082:
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00cc }
            L_0x0084:
                r6 = r1
                int r5 = r18.mo55930b()     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r16
                r3 = r17
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00cc }
                int r11 = r11 + -1
            L_0x0093:
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00cc }
                r7.count = r11     // Catch:{ all -> 0x00cc }
                r15.evictEntries(r14)     // Catch:{ all -> 0x00cc }
                goto L_0x00c5
            L_0x00a3:
                r2 = r18
                com.google.common.cache.h r14 = r14.getNext()     // Catch:{ all -> 0x00cc }
                goto L_0x0032
            L_0x00aa:
                int r2 = r7.modCount     // Catch:{ all -> 0x00cc }
                int r2 = r2 + r10
                r7.modCount = r2     // Catch:{ all -> 0x00cc }
                com.google.common.cache.h r14 = r15.newEntry(r0, r3, r1)     // Catch:{ all -> 0x00cc }
                r1 = r15
                r2 = r14
                r3 = r16
                r4 = r19
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00cc }
                r12.set(r13, r14)     // Catch:{ all -> 0x00cc }
                r7.count = r11     // Catch:{ all -> 0x00cc }
                r15.evictEntries(r14)     // Catch:{ all -> 0x00cc }
            L_0x00c5:
                r15.unlock()
                r15.postWriteCleanup()
                return r10
            L_0x00cc:
                r0 = move-exception
                r15.unlock()
                r15.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.storeLoadedValue(java.lang.Object, int, com.google.common.cache.LocalCache$k, java.lang.Object):boolean");
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public void tryExpireEntries(long j) {
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
        }

        public V waitForLoadingValue(C15876h<K, V> hVar, K k, C15852s<K, V> sVar) throws ExecutionException {
            if (sVar.mo55929a()) {
                C15794l.m25622p(k, "Recursive load of: %s", !Thread.holdsLock(hVar));
                try {
                    V f = sVar.mo55934f();
                    if (f != null) {
                        recordRead(hVar, this.map.f35634q.mo55787a());
                        return f;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
                } finally {
                    this.statsCounter.mo55793b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        @NullableDecl
        public V get(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long a = this.map.f35634q.mo55787a();
                    C15876h liveEntry = getLiveEntry(obj, i, a);
                    if (liveEntry == null) {
                        return null;
                    }
                    Object obj2 = liveEntry.getValueReference().get();
                    if (obj2 != null) {
                        recordRead(liveEntry, a);
                        V scheduleRefresh = scheduleRefresh(liveEntry, liveEntry.getKey(), i, obj2, a, this.map.f35637t);
                        postReadCleanup();
                        return scheduleRefresh;
                    }
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return null;
            } finally {
                postReadCleanup();
            }
        }

        public boolean remove(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.f35634q.mo55787a());
                AtomicReferenceArray<C15876h<K, V>> atomicReferenceArray = this.table;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C15876h hVar = atomicReferenceArray.get(length);
                C15876h hVar2 = hVar;
                while (true) {
                    if (hVar2 == null) {
                        break;
                    }
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.f35623f.equivalent(obj, key)) {
                        hVar2 = hVar2.getNext();
                    } else {
                        C15852s valueReference = hVar2.getValueReference();
                        Object obj3 = valueReference.get();
                        if (this.map.f35624g.equivalent(obj2, obj3)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else if (obj3 == null && valueReference.isActive()) {
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, removeValueFromChain(hVar, hVar2, key, i, obj3, valueReference, removalCause));
                        this.count--;
                        if (removalCause != RemovalCause.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
            r15 = r12.getValueReference();
            r16 = r15.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            if (r16 != null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
            if (r15.isActive() == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r9.modCount++;
            r10.set(r11, removeValueFromChain(r2, r12, r4, r19, r16, r15, com.google.common.cache.RemovalCause.COLLECTED));
            r9.count--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r9.modCount++;
            enqueueNotification(r18, r19, r16, r15.mo55930b(), com.google.common.cache.RemovalCause.REPLACED);
            setValue(r12, r18, r20, r7);
            evictEntries(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
            return r16;
         */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V replace(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00a7 }
                com.google.common.base.u r1 = r1.f35634q     // Catch:{ all -> 0x00a7 }
                long r7 = r1.mo55787a()     // Catch:{ all -> 0x00a7 }
                r9.preWriteCleanup(r7)     // Catch:{ all -> 0x00a7 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.h<K, V>> r10 = r9.table     // Catch:{ all -> 0x00a7 }
                int r1 = r10.length()     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + -1
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch:{ all -> 0x00a7 }
                r2 = r1
                com.google.common.cache.h r2 = (com.google.common.cache.C15876h) r2     // Catch:{ all -> 0x00a7 }
                r12 = r2
            L_0x0024:
                r13 = 0
                if (r12 == 0) goto L_0x006c
                java.lang.Object r4 = r12.getKey()     // Catch:{ all -> 0x00a7 }
                int r1 = r12.getHash()     // Catch:{ all -> 0x00a7 }
                if (r1 != r0) goto L_0x009f
                if (r4 == 0) goto L_0x009f
                com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch:{ all -> 0x00a7 }
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f35623f     // Catch:{ all -> 0x00a7 }
                r14 = r18
                boolean r1 = r1.equivalent(r14, r4)     // Catch:{ all -> 0x00a7 }
                if (r1 == 0) goto L_0x00a1
                com.google.common.cache.LocalCache$s r15 = r12.getValueReference()     // Catch:{ all -> 0x00a7 }
                java.lang.Object r16 = r15.get()     // Catch:{ all -> 0x00a7 }
                if (r16 != 0) goto L_0x0073
                boolean r1 = r15.isActive()     // Catch:{ all -> 0x00a7 }
                if (r1 == 0) goto L_0x006c
                int r1 = r9.modCount     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + 1
                r9.modCount = r1     // Catch:{ all -> 0x00a7 }
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.h r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a7 }
                int r1 = r9.count     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + -1
                r10.set(r11, r0)     // Catch:{ all -> 0x00a7 }
                r9.count = r1     // Catch:{ all -> 0x00a7 }
            L_0x006c:
                r17.unlock()
                r17.postWriteCleanup()
                return r13
            L_0x0073:
                int r1 = r9.modCount     // Catch:{ all -> 0x00a7 }
                int r1 = r1 + 1
                r9.modCount = r1     // Catch:{ all -> 0x00a7 }
                int r5 = r15.mo55930b()     // Catch:{ all -> 0x00a7 }
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00a7 }
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch:{ all -> 0x00a7 }
                r9.evictEntries(r12)     // Catch:{ all -> 0x00a7 }
                r17.unlock()
                r17.postWriteCleanup()
                return r16
            L_0x009f:
                r14 = r18
            L_0x00a1:
                com.google.common.cache.h r12 = r12.getNext()     // Catch:{ all -> 0x00a7 }
                goto L_0x0024
            L_0x00a7:
                r0 = move-exception
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }
    }
}
