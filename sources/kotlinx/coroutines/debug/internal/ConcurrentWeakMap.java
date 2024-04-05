package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.C19312e;
import kotlin.collections.C19313f;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import p753kq.C19861p;
import p755lq.C19875a;
import p755lq.C19878d;

public final class ConcurrentWeakMap<K, V> extends C19312e<K, V> {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43460c = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");
    private volatile /* synthetic */ int _size;

    /* renamed from: b */
    public final ReferenceQueue<K> f43461b;
    public volatile /* synthetic */ Object core;

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a */
    public final class C19528a {

        /* renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f43462g = AtomicIntegerFieldUpdater.newUpdater(C19528a.class, "load");

        /* renamed from: a */
        public final int f43463a;

        /* renamed from: b */
        public final int f43464b;

        /* renamed from: c */
        public final int f43465c;

        /* renamed from: d */
        public /* synthetic */ AtomicReferenceArray f43466d;

        /* renamed from: e */
        public /* synthetic */ AtomicReferenceArray f43467e;
        private volatile /* synthetic */ int load = 0;

        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a */
        public final class C19529a<E> implements Iterator<E>, C19875a {

            /* renamed from: b */
            public final C19861p<K, V, E> f43469b;

            /* renamed from: c */
            public int f43470c = -1;

            /* renamed from: d */
            public K f43471d;

            /* renamed from: e */
            public V f43472e;

            public C19529a(C19861p<? super K, ? super V, ? extends E> pVar) {
                this.f43469b = pVar;
                mo72229a();
            }

            /* renamed from: a */
            public final void mo72229a() {
                while (true) {
                    int i = this.f43470c + 1;
                    this.f43470c = i;
                    ConcurrentWeakMap<K, V>.a aVar = C19528a.this;
                    if (i < aVar.f43463a) {
                        C19539e eVar = (C19539e) aVar.f43466d.get(i);
                        K k = eVar == null ? null : eVar.get();
                        if (k != null) {
                            this.f43471d = k;
                            V v = C19528a.this.f43467e.get(this.f43470c);
                            if (v instanceof C19540f) {
                                v = ((C19540f) v).f43486a;
                            }
                            if (v != null) {
                                this.f43472e = v;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            public final boolean hasNext() {
                return this.f43470c < C19528a.this.f43463a;
            }

            public final E next() {
                if (this.f43470c < C19528a.this.f43463a) {
                    C19861p<K, V, E> pVar = this.f43469b;
                    K k = this.f43471d;
                    if (k != null) {
                        V v = this.f43472e;
                        if (v != null) {
                            E invoke = pVar.invoke(k, v);
                            mo72229a();
                            return invoke;
                        }
                        C19383o.m32805o("value");
                        throw null;
                    }
                    C19383o.m32805o("key");
                    throw null;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                C19736t tVar = C19534a.f43478a;
                throw new UnsupportedOperationException("not implemented");
            }
        }

        public C19528a(int i) {
            this.f43463a = i;
            this.f43464b = Integer.numberOfLeadingZeros(i) + 1;
            this.f43465c = (i * 2) / 3;
            this.f43466d = new AtomicReferenceArray(i);
            this.f43467e = new AtomicReferenceArray(i);
        }

        /* renamed from: a */
        public final Object mo72226a(K k, V v, C19539e<K> eVar) {
            Object obj;
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            int hashCode = (k.hashCode() * -1640531527) >>> this.f43464b;
            boolean z4 = false;
            while (true) {
                C19539e eVar2 = (C19539e) this.f43466d.get(hashCode);
                if (eVar2 != null) {
                    Object obj2 = eVar2.get();
                    if (!C19383o.m32792b(k, obj2)) {
                        if (obj2 == null) {
                            mo72228c(hashCode);
                        }
                        if (hashCode == 0) {
                            hashCode = this.f43463a;
                        }
                        hashCode--;
                    } else if (z4) {
                        f43462g.decrementAndGet(this);
                    }
                } else if (v == null) {
                    return null;
                } else {
                    if (!z4) {
                        do {
                            i = this.load;
                            if (i >= this.f43465c) {
                                return C19534a.f43478a;
                            }
                        } while (!f43462g.compareAndSet(this, i, i + 1));
                        z2 = true;
                    } else {
                        z2 = z4;
                    }
                    if (eVar == null) {
                        eVar = new C19539e<>(k, ConcurrentWeakMap.this.f43461b);
                    }
                    C19539e<K> eVar3 = eVar;
                    AtomicReferenceArray atomicReferenceArray = this.f43466d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(hashCode, (Object) null, eVar3)) {
                            if (atomicReferenceArray.get(hashCode) != null) {
                                z3 = false;
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    z4 = z2;
                    eVar = eVar3;
                }
            }
            do {
                obj = this.f43467e.get(hashCode);
                if (!(obj instanceof C19540f)) {
                    AtomicReferenceArray atomicReferenceArray2 = this.f43467e;
                    while (true) {
                        if (!atomicReferenceArray2.compareAndSet(hashCode, obj, v)) {
                            if (atomicReferenceArray2.get(hashCode) != obj) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return C19534a.f43478a;
                }
            } while (!z);
            return obj;
        }

        /* renamed from: b */
        public final ConcurrentWeakMap<K, V>.a mo72227b() {
            Object obj;
            C19540f fVar;
            boolean z;
            while (true) {
                int c = ConcurrentWeakMap.this.mo20413c();
                if (c < 4) {
                    c = 4;
                }
                ConcurrentWeakMap<K, V>.a aVar = new C19528a(Integer.highestOneBit(c) * 4);
                int i = this.f43463a;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        return aVar;
                    }
                    int i3 = i2 + 1;
                    C19539e eVar = (C19539e) this.f43466d.get(i2);
                    Object obj2 = eVar == null ? null : eVar.get();
                    if (eVar != null && obj2 == null) {
                        mo72228c(i2);
                    }
                    while (true) {
                        obj = this.f43467e.get(i2);
                        if (!(obj instanceof C19540f)) {
                            AtomicReferenceArray atomicReferenceArray = this.f43467e;
                            if (obj == null) {
                                fVar = C19534a.f43479b;
                            } else {
                                C19736t tVar = C19534a.f43478a;
                                fVar = C19383o.m32792b(obj, Boolean.TRUE) ? C19534a.f43480c : new C19540f(obj);
                            }
                            while (true) {
                                if (!atomicReferenceArray.compareAndSet(i2, obj, fVar)) {
                                    if (atomicReferenceArray.get(i2) != obj) {
                                        z = false;
                                        continue;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    continue;
                                    break;
                                }
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            obj = ((C19540f) obj).f43486a;
                            break;
                        }
                    }
                    if (obj2 == null || obj == null || aVar.mo72226a(obj2, obj, eVar) != C19534a.f43478a) {
                        i2 = i3;
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo72228c(int i) {
            boolean z;
            do {
                Object obj = this.f43467e.get(i);
                if (obj != null && !(obj instanceof C19540f)) {
                    AtomicReferenceArray atomicReferenceArray = this.f43467e;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i, obj, (Object) null)) {
                            if (atomicReferenceArray.get(i) != obj) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } while (!z);
            ConcurrentWeakMap<K, V> concurrentWeakMap = ConcurrentWeakMap.this;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f43460c;
            concurrentWeakMap.getClass();
            ConcurrentWeakMap.f43460c.decrementAndGet(concurrentWeakMap);
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$b */
    public static final class C19530b<K, V> implements Map.Entry<K, V>, C19878d.C19879a {

        /* renamed from: b */
        public final K f43474b;

        /* renamed from: c */
        public final V f43475c;

        public C19530b(K k, V v) {
            this.f43474b = k;
            this.f43475c = v;
        }

        public final K getKey() {
            return this.f43474b;
        }

        public final V getValue() {
            return this.f43475c;
        }

        public final V setValue(V v) {
            C19736t tVar = C19534a.f43478a;
            throw new UnsupportedOperationException("not implemented");
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$c */
    public final class C19531c<E> extends C19313f<E> {

        /* renamed from: b */
        public final C19861p<K, V, E> f43476b;

        public C19531c(C19861p<? super K, ? super V, ? extends E> pVar) {
            this.f43476b = pVar;
        }

        public final boolean add(E e) {
            C19736t tVar = C19534a.f43478a;
            throw new UnsupportedOperationException("not implemented");
        }

        public final int getSize() {
            return ConcurrentWeakMap.this.mo20413c();
        }

        public final Iterator<E> iterator() {
            C19528a aVar = (C19528a) ConcurrentWeakMap.this.core;
            C19861p<K, V, E> pVar = this.f43476b;
            aVar.getClass();
            return new C19528a.C19529a(pVar);
        }
    }

    public ConcurrentWeakMap() {
        this(false);
    }

    /* renamed from: a */
    public final Set<Map.Entry<K, V>> mo20411a() {
        return new C19531c(ConcurrentWeakMap$entries$1.INSTANCE);
    }

    /* renamed from: b */
    public final Set<K> mo20412b() {
        return new C19531c(ConcurrentWeakMap$keys$1.INSTANCE);
    }

    /* renamed from: c */
    public final int mo20413c() {
        return this._size;
    }

    public final void clear() {
        Iterator it = ((C19531c) mo20412b()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        C19528a aVar = (C19528a) this.core;
        aVar.getClass();
        int hashCode = (obj.hashCode() * -1640531527) >>> aVar.f43464b;
        while (true) {
            C19539e eVar = (C19539e) aVar.f43466d.get(hashCode);
            if (eVar == null) {
                return null;
            }
            Object obj2 = eVar.get();
            if (C19383o.m32792b(obj, obj2)) {
                V v = aVar.f43467e.get(hashCode);
                if (v instanceof C19540f) {
                    v = ((C19540f) v).f43486a;
                }
                return v;
            }
            if (obj2 == null) {
                aVar.mo72228c(hashCode);
            }
            if (hashCode == 0) {
                hashCode = aVar.f43463a;
            }
            hashCode--;
        }
    }

    public final V put(K k, V v) {
        V a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C19528a.f43462g;
        V a2 = ((C19528a) this.core).mo72226a(k, v, (C19539e) null);
        if (a2 == C19534a.f43478a) {
            synchronized (this) {
                ConcurrentWeakMap<K, V>.a aVar = (C19528a) this.core;
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = C19528a.f43462g;
                    a = aVar.mo72226a(k, v, (C19539e) null);
                    if (a == C19534a.f43478a) {
                        aVar = aVar.mo72227b();
                        this.core = aVar;
                    }
                }
            }
            a2 = a;
            break;
        }
        if (a2 == null) {
            f43460c.incrementAndGet(this);
        }
        return a2;
    }

    public final V remove(Object obj) {
        V a;
        if (obj == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C19528a.f43462g;
        V a2 = ((C19528a) this.core).mo72226a(obj, null, (C19539e) null);
        if (a2 == C19534a.f43478a) {
            synchronized (this) {
                ConcurrentWeakMap<K, V>.a aVar = (C19528a) this.core;
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = C19528a.f43462g;
                    a = aVar.mo72226a(obj, null, (C19539e) null);
                    if (a == C19534a.f43478a) {
                        aVar = aVar.mo72227b();
                        this.core = aVar;
                    }
                }
            }
            a2 = a;
            break;
        }
        if (a2 != null) {
            f43460c.decrementAndGet(this);
        }
        return a2;
    }

    public ConcurrentWeakMap(boolean z) {
        this._size = 0;
        this.core = new C19528a(16);
        this.f43461b = z ? new ReferenceQueue<>() : null;
    }
}
