package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.base.C15795m;
import com.google.common.base.C15804s;
import com.google.common.base.Predicates;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.C16147b2;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class StandardTable<R, C, V> extends C16180i<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Map<R, Map<C, V>> backingMap;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C16101d f36147d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public transient Map<R, Map<C, V>> f36148e;
    @MonotonicNonNullDecl

    /* renamed from: f */
    public transient StandardTable<R, C, V>.e f36149f;
    public final C15804s<? extends Map<C, V>> factory;

    /* renamed from: com.google.common.collect.StandardTable$a */
    public class C16094a implements Iterator<C16147b2.C16148a<R, C, V>> {

        /* renamed from: b */
        public final Iterator<Map.Entry<R, Map<C, V>>> f36150b;
        @NullableDecl

        /* renamed from: c */
        public Map.Entry<R, Map<C, V>> f36151c;

        /* renamed from: d */
        public Iterator<Map.Entry<C, V>> f36152d = Iterators.EmptyModifiableIterator.INSTANCE;

        public C16094a(StandardTable standardTable) {
            this.f36150b = standardTable.backingMap.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.f36150b.hasNext() || this.f36152d.hasNext();
        }

        public final Object next() {
            if (!this.f36152d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f36150b.next();
                this.f36151c = next;
                this.f36152d = next.getValue().entrySet().iterator();
            }
            Map.Entry next2 = this.f36152d.next();
            return new Tables.ImmutableCell(this.f36151c.getKey(), next2.getKey(), next2.getValue());
        }

        public final void remove() {
            this.f36152d.remove();
            if (this.f36151c.getValue().isEmpty()) {
                this.f36150b.remove();
                this.f36151c = null;
            }
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$b */
    public class C16095b extends Maps.C16052m<R, V> {

        /* renamed from: e */
        public final C f36153e;

        /* renamed from: com.google.common.collect.StandardTable$b$a */
        public class C16096a extends Sets.C16082a<Map.Entry<R, V>> {
            public C16096a() {
            }

            public final void clear() {
                C16095b.this.mo57338d(Predicates.m25583b());
            }

            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.access$300(StandardTable.this, entry.getKey(), C16095b.this.f36153e, entry.getValue());
            }

            public final boolean isEmpty() {
                C16095b bVar = C16095b.this;
                return !StandardTable.this.containsColumn(bVar.f36153e);
            }

            public final Iterator<Map.Entry<R, V>> iterator() {
                return new C16097b();
            }

            public final boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.access$400(StandardTable.this, entry.getKey(), C16095b.this.f36153e, entry.getValue());
            }

            public final boolean retainAll(Collection<?> collection) {
                return C16095b.this.mo57338d(Predicates.m25587f(Predicates.m25586e(collection)));
            }

            public final int size() {
                int i = 0;
                for (Map<C, V> containsKey : StandardTable.this.backingMap.values()) {
                    if (containsKey.containsKey(C16095b.this.f36153e)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$b$b */
        public class C16097b extends AbstractIterator<Map.Entry<R, V>> {

            /* renamed from: d */
            public final Iterator<Map.Entry<R, Map<C, V>>> f36156d;

            public C16097b() {
                this.f36156d = StandardTable.this.backingMap.entrySet().iterator();
            }

            /* renamed from: a */
            public final Object mo56053a() {
                while (this.f36156d.hasNext()) {
                    Map.Entry next = this.f36156d.next();
                    if (((Map) next.getValue()).containsKey(C16095b.this.f36153e)) {
                        return new C16242y1(this, next);
                    }
                }
                this.f35745b = AbstractIterator.State.DONE;
                return null;
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$b$c */
        public class C16098c extends Maps.C16044e<R, V> {
            public C16098c() {
                super(C16095b.this);
            }

            public final boolean contains(Object obj) {
                C16095b bVar = C16095b.this;
                return StandardTable.this.contains(obj, bVar.f36153e);
            }

            public final boolean remove(Object obj) {
                C16095b bVar = C16095b.this;
                return StandardTable.this.remove(obj, bVar.f36153e) != null;
            }

            public final boolean retainAll(Collection<?> collection) {
                return C16095b.this.mo57338d(Predicates.m25584c(Predicates.m25587f(Predicates.m25586e(collection)), Maps.EntryFunction.KEY));
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$b$d */
        public class C16099d extends Maps.C16051l<R, V> {
            public C16099d() {
                super(C16095b.this);
            }

            public final boolean remove(Object obj) {
                return obj != null && C16095b.this.mo57338d(Predicates.m25584c(Predicates.m25585d(obj), Maps.EntryFunction.VALUE));
            }

            public final boolean removeAll(Collection<?> collection) {
                return C16095b.this.mo57338d(Predicates.m25584c(Predicates.m25586e(collection), Maps.EntryFunction.VALUE));
            }

            public final boolean retainAll(Collection<?> collection) {
                return C16095b.this.mo57338d(Predicates.m25584c(Predicates.m25587f(Predicates.m25586e(collection)), Maps.EntryFunction.VALUE));
            }
        }

        public C16095b(C c) {
            c.getClass();
            this.f36153e = c;
        }

        /* renamed from: a */
        public final Set<Map.Entry<R, V>> mo56085a() {
            return new C16096a();
        }

        /* renamed from: b */
        public final Set<R> mo56115b() {
            return new C16098c();
        }

        /* renamed from: c */
        public final Collection<V> mo57167c() {
            return new C16099d();
        }

        public final boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.f36153e);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final boolean mo57338d(C15795m<? super Map.Entry<R, V>> mVar) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Map map = (Map) next.getValue();
                Object obj = map.get(this.f36153e);
                if (obj != null && mVar.apply(new ImmutableEntry(next.getKey(), obj))) {
                    map.remove(this.f36153e);
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final V get(Object obj) {
            return StandardTable.this.get(obj, this.f36153e);
        }

        public final V put(R r, V v) {
            return StandardTable.this.put(r, this.f36153e, v);
        }

        public final V remove(Object obj) {
            return StandardTable.this.remove(obj, this.f36153e);
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$c */
    public class C16100c extends AbstractIterator<C> {

        /* renamed from: d */
        public final Map<C, V> f36160d;

        /* renamed from: e */
        public final Iterator<Map<C, V>> f36161e;

        /* renamed from: f */
        public Iterator<Map.Entry<C, V>> f36162f = Iterators.C15985b.f35974f;

        public C16100c(StandardTable standardTable) {
            this.f36160d = (Map) standardTable.factory.get();
            this.f36161e = standardTable.backingMap.values().iterator();
        }

        /* renamed from: a */
        public final C mo56053a() {
            while (true) {
                if (this.f36162f.hasNext()) {
                    Map.Entry next = this.f36162f.next();
                    if (!this.f36160d.containsKey(next.getKey())) {
                        this.f36160d.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (this.f36161e.hasNext()) {
                    this.f36162f = this.f36161e.next().entrySet().iterator();
                } else {
                    this.f35745b = AbstractIterator.State.DONE;
                    return null;
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$d */
    public class C16101d extends StandardTable<R, C, V>.h<C> {
        public C16101d() {
            super();
        }

        public final boolean contains(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        public final Iterator<C> iterator() {
            return StandardTable.this.createColumnKeyIterator();
        }

        public final boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().remove(obj)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            boolean z = false;
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (Iterators.m25984g(collection, next.keySet().iterator())) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            boolean z = false;
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final int size() {
            return Iterators.m25985h(iterator());
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$e */
    public class C16102e extends Maps.C16052m<C, Map<R, V>> {

        /* renamed from: com.google.common.collect.StandardTable$e$a */
        public class C16103a extends StandardTable<R, C, V>.h<Map.Entry<C, Map<R, V>>> {

            /* renamed from: com.google.common.collect.StandardTable$e$a$a */
            public class C16104a implements C15784e<C, Map<R, V>> {
                public C16104a() {
                }

                public final Object apply(Object obj) {
                    return StandardTable.this.column(obj);
                }
            }

            public C16103a() {
                super();
            }

            public final boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Object key = entry.getKey();
                C16102e eVar = C16102e.this;
                return (StandardTable.this.containsColumn(key) ? StandardTable.this.column(key) : null).equals(entry.getValue());
            }

            public final Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                Set columnKeySet = StandardTable.this.columnKeySet();
                return new C16238x0(columnKeySet.iterator(), new C16104a());
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                StandardTable.access$900(StandardTable.this, ((Map.Entry) obj).getKey());
                return true;
            }

            public final boolean removeAll(Collection<?> collection) {
                collection.getClass();
                return Sets.m26095e(this, collection.iterator());
            }

            public final boolean retainAll(Collection<?> collection) {
                collection.getClass();
                boolean z = false;
                Iterator it = Lists.m25993b(StandardTable.this.columnKeySet().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(new ImmutableEntry(next, StandardTable.this.column(next)))) {
                        StandardTable.access$900(StandardTable.this, next);
                        z = true;
                    }
                }
                return z;
            }

            public final int size() {
                return StandardTable.this.columnKeySet().size();
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$e$b */
        public class C16105b extends Maps.C16051l<C, Map<R, V>> {
            public C16105b() {
                super(C16102e.this);
            }

            public final boolean remove(Object obj) {
                for (Map.Entry entry : C16102e.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        StandardTable.access$900(StandardTable.this, entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public final boolean removeAll(Collection<?> collection) {
                collection.getClass();
                boolean z = false;
                Iterator it = Lists.m25993b(StandardTable.this.columnKeySet().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(StandardTable.this.column(next))) {
                        StandardTable.access$900(StandardTable.this, next);
                        z = true;
                    }
                }
                return z;
            }

            public final boolean retainAll(Collection<?> collection) {
                collection.getClass();
                boolean z = false;
                Iterator it = Lists.m25993b(StandardTable.this.columnKeySet().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(StandardTable.this.column(next))) {
                        StandardTable.access$900(StandardTable.this, next);
                        z = true;
                    }
                }
                return z;
            }
        }

        public C16102e() {
        }

        /* renamed from: a */
        public final Set<Map.Entry<C, Map<R, V>>> mo56085a() {
            return new C16103a();
        }

        /* renamed from: c */
        public final Collection<Map<R, V>> mo57167c() {
            return new C16105b();
        }

        public final boolean containsKey(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        public final Object get(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.column(obj);
            }
            return null;
        }

        public final Set<C> keySet() {
            return StandardTable.this.columnKeySet();
        }

        public final Object remove(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.access$900(StandardTable.this, obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$f */
    public class C16106f extends Maps.C16042d<C, V> {

        /* renamed from: b */
        public final R f36168b;
        @NullableDecl

        /* renamed from: c */
        public Map<C, V> f36169c;

        /* renamed from: com.google.common.collect.StandardTable$f$a */
        public class C16107a implements Iterator<Map.Entry<C, V>> {

            /* renamed from: b */
            public final /* synthetic */ Iterator f36171b;

            public C16107a(Iterator it) {
                this.f36171b = it;
            }

            public final boolean hasNext() {
                return this.f36171b.hasNext();
            }

            public final Object next() {
                C16106f.this.getClass();
                return new C16245z1((Map.Entry) this.f36171b.next());
            }

            public final void remove() {
                this.f36171b.remove();
                C16106f.this.mo57362d();
            }
        }

        public C16106f(R r) {
            r.getClass();
            this.f36168b = r;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<C, V>> mo56287a() {
            Map b = mo57359b();
            return b == null ? Iterators.EmptyModifiableIterator.INSTANCE : new C16107a(b.entrySet().iterator());
        }

        /* renamed from: b */
        public Map<C, V> mo57359b() {
            Map<C, V> map = this.f36169c;
            if (map != null && (!map.isEmpty() || !StandardTable.this.backingMap.containsKey(this.f36168b))) {
                return this.f36169c;
            }
            Map<C, V> c = mo57360c();
            this.f36169c = c;
            return c;
        }

        /* renamed from: c */
        public Map<C, V> mo57360c() {
            return StandardTable.this.backingMap.get(this.f36168b);
        }

        public final void clear() {
            Map b = mo57359b();
            if (b != null) {
                b.clear();
            }
            mo57362d();
        }

        public boolean containsKey(Object obj) {
            boolean z;
            Map b = mo57359b();
            if (obj == null || b == null) {
                return false;
            }
            try {
                z = b.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        /* renamed from: d */
        public void mo57362d() {
            if (mo57359b() != null && this.f36169c.isEmpty()) {
                StandardTable.this.backingMap.remove(this.f36168b);
                this.f36169c = null;
            }
        }

        public final V get(Object obj) {
            Map b = mo57359b();
            if (obj == null || b == null) {
                return null;
            }
            try {
                return b.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        }

        public V put(C c, V v) {
            c.getClass();
            v.getClass();
            Map<C, V> map = this.f36169c;
            return (map == null || map.isEmpty()) ? StandardTable.this.put(this.f36168b, c, v) : this.f36169c.put(c, v);
        }

        public final V remove(Object obj) {
            Map b = mo57359b();
            V v = null;
            if (b == null) {
                return null;
            }
            try {
                v = b.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            mo57362d();
            return v;
        }

        public final int size() {
            Map b = mo57359b();
            if (b == null) {
                return 0;
            }
            return b.size();
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$g */
    public class C16108g extends Maps.C16052m<R, Map<C, V>> {

        /* renamed from: com.google.common.collect.StandardTable$g$a */
        public class C16109a extends StandardTable<R, C, V>.h<Map.Entry<R, Map<C, V>>> {

            /* renamed from: com.google.common.collect.StandardTable$g$a$a */
            public class C16110a implements C15784e<R, Map<C, V>> {
                public C16110a() {
                }

                public final Object apply(Object obj) {
                    return StandardTable.this.row(obj);
                }
            }

            public C16109a() {
                super();
            }

            public final boolean contains(Object obj) {
                boolean z;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
                    return false;
                }
                Set<Map.Entry<R, Map<C, V>>> entrySet = StandardTable.this.backingMap.entrySet();
                entrySet.getClass();
                try {
                    z = entrySet.contains(entry);
                } catch (ClassCastException | NullPointerException unused) {
                    z = false;
                }
                return z;
            }

            public final Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                Set<R> keySet = StandardTable.this.backingMap.keySet();
                return new C16238x0(keySet.iterator(), new C16110a());
            }

            public final boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.backingMap.entrySet().remove(entry);
            }

            public final int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        public C16108g() {
        }

        /* renamed from: a */
        public final Set<Map.Entry<R, Map<C, V>>> mo56085a() {
            return new C16109a();
        }

        public final boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        public final Object get(Object obj) {
            if (StandardTable.this.containsRow(obj)) {
                return StandardTable.this.row(obj);
            }
            return null;
        }

        public final Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }
    }

    /* renamed from: com.google.common.collect.StandardTable$h */
    public abstract class C16111h<T> extends Sets.C16082a<T> {
        public C16111h() {
        }

        public final void clear() {
            StandardTable.this.backingMap.clear();
        }

        public final boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, C15804s<? extends Map<C, V>> sVar) {
        this.backingMap = map;
        this.factory = sVar;
    }

    public static boolean access$300(StandardTable standardTable, Object obj, Object obj2, Object obj3) {
        if (obj3 == null) {
            standardTable.getClass();
        } else if (obj3.equals(standardTable.get(obj, obj2))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean access$400(com.google.common.collect.StandardTable r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0010
            java.lang.Object r2 = r3.get(r4, r5)
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0013
            r6 = r0
            goto L_0x0014
        L_0x0010:
            r3.getClass()
        L_0x0013:
            r6 = r1
        L_0x0014:
            if (r6 == 0) goto L_0x001a
            r3.remove(r4, r5)
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.StandardTable.access$400(com.google.common.collect.StandardTable, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public static Map access$900(StandardTable standardTable, Object obj) {
        standardTable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = standardTable.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object remove = ((Map) next.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (((Map) next.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    public Iterator<C16147b2.C16148a<R, C, V>> cellIterator() {
        return new C16094a(this);
    }

    public Set<C16147b2.C16148a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    public void clear() {
        this.backingMap.clear();
    }

    public Map<R, V> column(C c) {
        return new C16095b(c);
    }

    public Set<C> columnKeySet() {
        C16101d dVar = this.f36147d;
        if (dVar != null) {
            return dVar;
        }
        C16101d dVar2 = new C16101d();
        this.f36147d = dVar2;
        return dVar2;
    }

    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.e eVar = this.f36149f;
        if (eVar != null) {
            return eVar;
        }
        StandardTable<R, C, V>.e eVar2 = new C16102e();
        this.f36149f = eVar2;
        return eVar2;
    }

    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    public boolean containsColumn(@NullableDecl Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        for (Map next : this.backingMap.values()) {
            next.getClass();
            try {
                z = next.containsKey(obj);
                continue;
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean containsRow(@NullableDecl Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        Map<R, Map<C, V>> map = this.backingMap;
        map.getClass();
        try {
            z = map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new C16100c(this);
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new C16108g();
    }

    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.get(obj, obj2);
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
        r.getClass();
        c.getClass();
        v.getClass();
        Map map = this.backingMap.get(r);
        if (map == null) {
            map = (Map) this.factory.get();
            this.backingMap.put(r, map);
        }
        return map.put(c, v);
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m26057e(obj, this.backingMap)) == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return remove;
    }

    public Map<C, V> row(R r) {
        return new C16106f(r);
    }

    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.f36148e;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> createRowMap = createRowMap();
        this.f36148e = createRowMap;
        return createRowMap;
    }

    public int size() {
        int i = 0;
        for (Map<C, V> size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }

    public Collection<V> values() {
        return super.values();
    }
}
