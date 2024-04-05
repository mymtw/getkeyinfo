package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class LinkedListMultimap<K, V> extends C16149c<K, V> implements C16219s0<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl

    /* renamed from: g */
    public transient C16000g<K, V> f36000g;
    @NullableDecl

    /* renamed from: h */
    public transient C16000g<K, V> f36001h;

    /* renamed from: i */
    public transient Map<K, C15999f<K, V>> f36002i;

    /* renamed from: j */
    public transient int f36003j;

    /* renamed from: k */
    public transient int f36004k;

    /* renamed from: com.google.common.collect.LinkedListMultimap$a */
    public class C15993a extends AbstractSequentialList<V> {

        /* renamed from: b */
        public final /* synthetic */ Object f36005b;

        public C15993a(Object obj) {
            this.f36005b = obj;
        }

        public final ListIterator<V> listIterator(int i) {
            return new C16002i(this.f36005b, i);
        }

        public final int size() {
            C15999f fVar = (C15999f) LinkedListMultimap.this.f36002i.get(this.f36005b);
            if (fVar == null) {
                return 0;
            }
            return fVar.f36018c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$b */
    public class C15994b extends AbstractSequentialList<Map.Entry<K, V>> {
        public C15994b() {
        }

        public final ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new C16001h(i);
        }

        public final int size() {
            return LinkedListMultimap.this.f36003j;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$c */
    public class C15995c extends Sets.C16082a<K> {
        public C15995c() {
        }

        public final boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C15998e();
        }

        public final boolean remove(Object obj) {
            return !LinkedListMultimap.this.removeAll(obj).isEmpty();
        }

        public final int size() {
            return LinkedListMultimap.this.f36002i.size();
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$d */
    public class C15996d extends AbstractSequentialList<V> {

        /* renamed from: com.google.common.collect.LinkedListMultimap$d$a */
        public class C15997a extends C16161d2<Map.Entry<K, V>, V> {

            /* renamed from: c */
            public final /* synthetic */ C16001h f36010c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15997a(C16001h hVar, C16001h hVar2) {
                super(hVar);
                this.f36010c = hVar2;
            }

            /* renamed from: a */
            public final Object mo56891a(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            public final void set(V v) {
                C16001h hVar = this.f36010c;
                C15794l.m25623q(hVar.f36027d != null);
                hVar.f36027d.f36020c = v;
            }
        }

        public C15996d() {
        }

        public final ListIterator<V> listIterator(int i) {
            C16001h hVar = new C16001h(i);
            return new C15997a(hVar, hVar);
        }

        public final int size() {
            return LinkedListMultimap.this.f36003j;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$e */
    public class C15998e implements Iterator<K> {

        /* renamed from: b */
        public final HashSet f36011b;

        /* renamed from: c */
        public C16000g<K, V> f36012c;
        @NullableDecl

        /* renamed from: d */
        public C16000g<K, V> f36013d;

        /* renamed from: e */
        public int f36014e;

        public C15998e() {
            this.f36011b = new HashSet(Maps.m26054b(LinkedListMultimap.this.keySet().size()));
            this.f36012c = LinkedListMultimap.this.f36000g;
            this.f36014e = LinkedListMultimap.this.f36004k;
        }

        /* renamed from: a */
        public final void mo56893a() {
            if (LinkedListMultimap.this.f36004k != this.f36014e) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            mo56893a();
            return this.f36012c != null;
        }

        public final K next() {
            C16000g<K, V> gVar;
            mo56893a();
            LinkedListMultimap.access$300(this.f36012c);
            C16000g<K, V> gVar2 = this.f36012c;
            this.f36013d = gVar2;
            this.f36011b.add(gVar2.f36019b);
            do {
                gVar = this.f36012c.f36021d;
                this.f36012c = gVar;
                if (gVar == null || this.f36011b.add(gVar.f36019b)) {
                }
                gVar = this.f36012c.f36021d;
                this.f36012c = gVar;
                break;
            } while (this.f36011b.add(gVar.f36019b));
            return this.f36013d.f36019b;
        }

        public final void remove() {
            mo56893a();
            C16203o.m26218e(this.f36013d != null);
            LinkedListMultimap.access$500(LinkedListMultimap.this, this.f36013d.f36019b);
            this.f36013d = null;
            this.f36014e = LinkedListMultimap.this.f36004k;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$f */
    public static class C15999f<K, V> {

        /* renamed from: a */
        public C16000g<K, V> f36016a;

        /* renamed from: b */
        public C16000g<K, V> f36017b;

        /* renamed from: c */
        public int f36018c = 1;

        public C15999f(C16000g<K, V> gVar) {
            this.f36016a = gVar;
            this.f36017b = gVar;
            gVar.f36024g = null;
            gVar.f36023f = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$g */
    public static final class C16000g<K, V> extends C16144b<K, V> {
        @NullableDecl

        /* renamed from: b */
        public final K f36019b;
        @NullableDecl

        /* renamed from: c */
        public V f36020c;
        @NullableDecl

        /* renamed from: d */
        public C16000g<K, V> f36021d;
        @NullableDecl

        /* renamed from: e */
        public C16000g<K, V> f36022e;
        @NullableDecl

        /* renamed from: f */
        public C16000g<K, V> f36023f;
        @NullableDecl

        /* renamed from: g */
        public C16000g<K, V> f36024g;

        public C16000g(@NullableDecl K k, @NullableDecl V v) {
            this.f36019b = k;
            this.f36020c = v;
        }

        public final K getKey() {
            return this.f36019b;
        }

        public final V getValue() {
            return this.f36020c;
        }

        public final V setValue(@NullableDecl V v) {
            V v2 = this.f36020c;
            this.f36020c = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$h */
    public class C16001h implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f36025b;
        @NullableDecl

        /* renamed from: c */
        public C16000g<K, V> f36026c;
        @NullableDecl

        /* renamed from: d */
        public C16000g<K, V> f36027d;
        @NullableDecl

        /* renamed from: e */
        public C16000g<K, V> f36028e;

        /* renamed from: f */
        public int f36029f;

        public C16001h(int i) {
            this.f36029f = LinkedListMultimap.this.f36004k;
            int size = LinkedListMultimap.this.size();
            C15794l.m25618l(i, size);
            if (i < size / 2) {
                this.f36026c = LinkedListMultimap.this.f36000g;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    mo56897a();
                    LinkedListMultimap.access$300(this.f36026c);
                    C16000g<K, V> gVar = this.f36026c;
                    this.f36027d = gVar;
                    this.f36028e = gVar;
                    this.f36026c = gVar.f36021d;
                    this.f36025b++;
                    i = i2;
                }
            } else {
                this.f36028e = LinkedListMultimap.this.f36001h;
                this.f36025b = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    mo56897a();
                    LinkedListMultimap.access$300(this.f36028e);
                    C16000g<K, V> gVar2 = this.f36028e;
                    this.f36027d = gVar2;
                    this.f36026c = gVar2;
                    this.f36028e = gVar2.f36022e;
                    this.f36025b--;
                    i = i3;
                }
            }
            this.f36027d = null;
        }

        /* renamed from: a */
        public final void mo56897a() {
            if (LinkedListMultimap.this.f36004k != this.f36029f) {
                throw new ConcurrentModificationException();
            }
        }

        public final void add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            mo56897a();
            return this.f36026c != null;
        }

        public final boolean hasPrevious() {
            mo56897a();
            return this.f36028e != null;
        }

        @CanIgnoreReturnValue
        public final Object next() {
            mo56897a();
            LinkedListMultimap.access$300(this.f36026c);
            C16000g<K, V> gVar = this.f36026c;
            this.f36027d = gVar;
            this.f36028e = gVar;
            this.f36026c = gVar.f36021d;
            this.f36025b++;
            return gVar;
        }

        public final int nextIndex() {
            return this.f36025b;
        }

        @CanIgnoreReturnValue
        public final Object previous() {
            mo56897a();
            LinkedListMultimap.access$300(this.f36028e);
            C16000g<K, V> gVar = this.f36028e;
            this.f36027d = gVar;
            this.f36026c = gVar;
            this.f36028e = gVar.f36022e;
            this.f36025b--;
            return gVar;
        }

        public final int previousIndex() {
            return this.f36025b - 1;
        }

        public final void remove() {
            mo56897a();
            C16203o.m26218e(this.f36027d != null);
            C16000g<K, V> gVar = this.f36027d;
            if (gVar != this.f36026c) {
                this.f36028e = gVar.f36022e;
                this.f36025b--;
            } else {
                this.f36026c = gVar.f36021d;
            }
            LinkedListMultimap.access$400(LinkedListMultimap.this, gVar);
            this.f36027d = null;
            this.f36029f = LinkedListMultimap.this.f36004k;
        }

        public final void set(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    public static void access$300(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    public static void access$400(LinkedListMultimap linkedListMultimap, C16000g gVar) {
        linkedListMultimap.getClass();
        C16000g<K, V> gVar2 = gVar.f36022e;
        if (gVar2 != null) {
            gVar2.f36021d = gVar.f36021d;
        } else {
            linkedListMultimap.f36000g = gVar.f36021d;
        }
        C16000g<K, V> gVar3 = gVar.f36021d;
        if (gVar3 != null) {
            gVar3.f36022e = gVar2;
        } else {
            linkedListMultimap.f36001h = gVar2;
        }
        if (gVar.f36024g == null && gVar.f36023f == null) {
            linkedListMultimap.f36002i.remove(gVar.f36019b).f36018c = 0;
            linkedListMultimap.f36004k++;
        } else {
            C15999f fVar = linkedListMultimap.f36002i.get(gVar.f36019b);
            fVar.f36018c--;
            C16000g<K, V> gVar4 = gVar.f36024g;
            if (gVar4 == null) {
                fVar.f36016a = gVar.f36023f;
            } else {
                gVar4.f36023f = gVar.f36023f;
            }
            C16000g<K, V> gVar5 = gVar.f36023f;
            if (gVar5 == null) {
                fVar.f36017b = gVar4;
            } else {
                gVar5.f36024g = gVar4;
            }
        }
        linkedListMultimap.f36003j--;
    }

    public static void access$500(LinkedListMultimap linkedListMultimap, Object obj) {
        linkedListMultimap.getClass();
        Iterators.m25979b(new C16002i(obj));
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f36002i = CompactLinkedHashMap.create();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public final C16000g<K, V> mo56880a(@NullableDecl K k, @NullableDecl V v, @NullableDecl C16000g<K, V> gVar) {
        C16000g<K, V> gVar2 = new C16000g<>(k, v);
        if (this.f36000g == null) {
            this.f36001h = gVar2;
            this.f36000g = gVar2;
            this.f36002i.put(k, new C15999f(gVar2));
            this.f36004k++;
        } else if (gVar == null) {
            C16000g<K, V> gVar3 = this.f36001h;
            gVar3.f36021d = gVar2;
            gVar2.f36022e = gVar3;
            this.f36001h = gVar2;
            C15999f fVar = this.f36002i.get(k);
            if (fVar == null) {
                this.f36002i.put(k, new C15999f(gVar2));
                this.f36004k++;
            } else {
                fVar.f36018c++;
                C16000g<K, V> gVar4 = fVar.f36017b;
                gVar4.f36023f = gVar2;
                gVar2.f36024g = gVar4;
                fVar.f36017b = gVar2;
            }
        } else {
            this.f36002i.get(k).f36018c++;
            gVar2.f36022e = gVar.f36022e;
            gVar2.f36024g = gVar.f36024g;
            gVar2.f36021d = gVar;
            gVar2.f36023f = gVar;
            C16000g<K, V> gVar5 = gVar.f36024g;
            if (gVar5 == null) {
                this.f36002i.get(k).f36016a = gVar2;
            } else {
                gVar5.f36023f = gVar2;
            }
            C16000g<K, V> gVar6 = gVar.f36022e;
            if (gVar6 == null) {
                this.f36000g = gVar2;
            } else {
                gVar6.f36021d = gVar2;
            }
            gVar.f36022e = gVar2;
            gVar.f36024g = gVar2;
        }
        this.f36003j++;
        return gVar2;
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public void clear() {
        this.f36000g = null;
        this.f36001h = null;
        this.f36002i.clear();
        this.f36003j = 0;
        this.f36004k++;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.f36002i.containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return new Multimaps.C16058a(this);
    }

    public Set<K> createKeySet() {
        return new C15995c();
    }

    public C16178h1<K> createKeys() {
        return new Multimaps.C16062c(this);
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.f36000g == null;
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C16178h1 keys() {
        return super.keys();
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        mo56880a(k, v, (C16000g) null);
        return true;
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(C16154c1 c1Var) {
        return super.putAll(c1Var);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    public int size() {
        return this.f36003j;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public LinkedListMultimap(int i) {
        this.f36002i = CompactHashMap.createWithExpectedSize(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    public List<Map.Entry<K, V>> createEntries() {
        return new C15994b();
    }

    public List<V> createValues() {
        return new C15996d();
    }

    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    public List<V> get(@NullableDecl K k) {
        return new C15993a(k);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        List<V> unmodifiableList = Collections.unmodifiableList(Lists.m25993b(new C16002i(obj)));
        Iterators.m25979b(new C16002i(obj));
        return unmodifiableList;
    }

    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        List<V> unmodifiableList = Collections.unmodifiableList(Lists.m25993b(new C16002i(k)));
        C16002i iVar = new C16002i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return unmodifiableList;
    }

    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(C16154c1<? extends K, ? extends V> c1Var) {
        LinkedListMultimap<K, V> linkedListMultimap = new LinkedListMultimap<>(c1Var.keySet().size());
        linkedListMultimap.putAll(c1Var);
        return linkedListMultimap;
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$i */
    public class C16002i implements ListIterator<V> {
        @NullableDecl

        /* renamed from: b */
        public final Object f36031b;

        /* renamed from: c */
        public int f36032c;
        @NullableDecl

        /* renamed from: d */
        public C16000g<K, V> f36033d;
        @NullableDecl

        /* renamed from: e */
        public C16000g<K, V> f36034e;
        @NullableDecl

        /* renamed from: f */
        public C16000g<K, V> f36035f;

        public C16002i(@NullableDecl Object obj) {
            C16000g<K, V> gVar;
            this.f36031b = obj;
            C15999f fVar = (C15999f) LinkedListMultimap.this.f36002i.get(obj);
            if (fVar == null) {
                gVar = null;
            } else {
                gVar = fVar.f36016a;
            }
            this.f36033d = gVar;
        }

        public final void add(V v) {
            this.f36035f = LinkedListMultimap.this.mo56880a(this.f36031b, v, this.f36033d);
            this.f36032c++;
            this.f36034e = null;
        }

        public final boolean hasNext() {
            return this.f36033d != null;
        }

        public final boolean hasPrevious() {
            return this.f36035f != null;
        }

        @CanIgnoreReturnValue
        public final V next() {
            LinkedListMultimap.access$300(this.f36033d);
            C16000g<K, V> gVar = this.f36033d;
            this.f36034e = gVar;
            this.f36035f = gVar;
            this.f36033d = gVar.f36023f;
            this.f36032c++;
            return gVar.f36020c;
        }

        public final int nextIndex() {
            return this.f36032c;
        }

        @CanIgnoreReturnValue
        public final V previous() {
            LinkedListMultimap.access$300(this.f36035f);
            C16000g<K, V> gVar = this.f36035f;
            this.f36034e = gVar;
            this.f36033d = gVar;
            this.f36035f = gVar.f36024g;
            this.f36032c--;
            return gVar.f36020c;
        }

        public final int previousIndex() {
            return this.f36032c - 1;
        }

        public final void remove() {
            C16203o.m26218e(this.f36034e != null);
            C16000g<K, V> gVar = this.f36034e;
            if (gVar != this.f36033d) {
                this.f36035f = gVar.f36024g;
                this.f36032c--;
            } else {
                this.f36033d = gVar.f36023f;
            }
            LinkedListMultimap.access$400(LinkedListMultimap.this, gVar);
            this.f36034e = null;
        }

        public final void set(V v) {
            C15794l.m25623q(this.f36034e != null);
            this.f36034e.f36020c = v;
        }

        public C16002i(@NullableDecl Object obj, int i) {
            int i2;
            C16000g<K, V> gVar;
            C16000g<K, V> gVar2;
            C15999f fVar = (C15999f) LinkedListMultimap.this.f36002i.get(obj);
            if (fVar == null) {
                i2 = 0;
            } else {
                i2 = fVar.f36018c;
            }
            C15794l.m25618l(i, i2);
            if (i < i2 / 2) {
                if (fVar == null) {
                    gVar = null;
                } else {
                    gVar = fVar.f36016a;
                }
                this.f36033d = gVar;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                if (fVar == null) {
                    gVar2 = null;
                } else {
                    gVar2 = fVar.f36017b;
                }
                this.f36035f = gVar2;
                this.f36032c = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f36031b = obj;
            this.f36034e = null;
        }
    }
}
