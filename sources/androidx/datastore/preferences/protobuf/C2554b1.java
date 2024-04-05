package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: androidx.datastore.preferences.protobuf.b1 */
public class C2554b1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f5819i = 0;

    /* renamed from: b */
    public final int f5820b;

    /* renamed from: c */
    public List<C2554b1<K, V>.d> f5821c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f5822d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f5823e;

    /* renamed from: f */
    public volatile C2554b1<K, V>.f f5824f;

    /* renamed from: g */
    public Map<K, V> f5825g = Collections.emptyMap();

    /* renamed from: h */
    public volatile C2554b1<K, V>.b f5826h;

    /* renamed from: androidx.datastore.preferences.protobuf.b1$a */
    public class C2555a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f5827b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f5828c;

        public C2555a() {
            this.f5827b = C2554b1.this.f5821c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo9571a() {
            if (this.f5828c == null) {
                this.f5828c = C2554b1.this.f5825g.entrySet().iterator();
            }
            return this.f5828c;
        }

        public final boolean hasNext() {
            int i = this.f5827b;
            return (i > 0 && i <= C2554b1.this.f5821c.size()) || mo9571a().hasNext();
        }

        public final Object next() {
            if (mo9571a().hasNext()) {
                return (Map.Entry) mo9571a().next();
            }
            List<C2554b1<K, V>.d> list = C2554b1.this.f5821c;
            int i = this.f5827b - 1;
            this.f5827b = i;
            return list.get(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b1$b */
    public class C2556b extends C2554b1<K, V>.f {
        public C2556b() {
            super();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C2555a();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b1$c */
    public static class C2557c {

        /* renamed from: a */
        public static final C2558a f5831a = new C2558a();

        /* renamed from: b */
        public static final C2559b f5832b = new C2559b();

        /* renamed from: androidx.datastore.preferences.protobuf.b1$c$a */
        public static class C2558a implements Iterator<Object> {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.b1$c$b */
        public static class C2559b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return C2557c.f5831a;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b1$d */
    public class C2560d implements Map.Entry<K, V>, Comparable<C2554b1<K, V>.d> {

        /* renamed from: b */
        public final K f5833b;

        /* renamed from: c */
        public V f5834c;

        public C2560d() {
            throw null;
        }

        public C2560d(K k, V v) {
            this.f5833b = k;
            this.f5834c = v;
        }

        public final int compareTo(Object obj) {
            return this.f5833b.compareTo(((C2560d) obj).f5833b);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f5833b;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f5834c;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f5833b;
        }

        public final V getValue() {
            return this.f5834c;
        }

        public final int hashCode() {
            K k = this.f5833b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f5834c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            C2554b1 b1Var = C2554b1.this;
            int i = C2554b1.f5819i;
            b1Var.mo9556b();
            V v2 = this.f5834c;
            this.f5834c = v;
            return v2;
        }

        public final String toString() {
            return this.f5833b + "=" + this.f5834c;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b1$e */
    public class C2561e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f5836b = -1;

        /* renamed from: c */
        public boolean f5837c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f5838d;

        public C2561e() {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo9587a() {
            if (this.f5838d == null) {
                this.f5838d = C2554b1.this.f5822d.entrySet().iterator();
            }
            return this.f5838d;
        }

        public final boolean hasNext() {
            if (this.f5836b + 1 >= C2554b1.this.f5821c.size()) {
                return !C2554b1.this.f5822d.isEmpty() && mo9587a().hasNext();
            }
            return true;
        }

        public final Object next() {
            this.f5837c = true;
            int i = this.f5836b + 1;
            this.f5836b = i;
            return i < C2554b1.this.f5821c.size() ? C2554b1.this.f5821c.get(this.f5836b) : (Map.Entry) mo9587a().next();
        }

        public final void remove() {
            if (this.f5837c) {
                this.f5837c = false;
                C2554b1 b1Var = C2554b1.this;
                int i = C2554b1.f5819i;
                b1Var.mo9556b();
                if (this.f5836b < C2554b1.this.f5821c.size()) {
                    C2554b1 b1Var2 = C2554b1.this;
                    int i2 = this.f5836b;
                    this.f5836b = i2 - 1;
                    b1Var2.mo9568i(i2);
                    return;
                }
                mo9587a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b1$f */
    public class C2562f extends AbstractSet<Map.Entry<K, V>> {
        public C2562f() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C2554b1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            C2554b1.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C2554b1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2561e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C2554b1.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return C2554b1.this.size();
        }
    }

    public C2554b1(int i) {
        this.f5820b = i;
    }

    /* renamed from: a */
    public final int mo9555a(K k) {
        int size = this.f5821c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f5821c.get(size).f5833b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f5821c.get(i2).f5833b);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public final void mo9556b() {
        if (this.f5823e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo9557c(int i) {
        return this.f5821c.get(i);
    }

    public final void clear() {
        mo9556b();
        if (!this.f5821c.isEmpty()) {
            this.f5821c.clear();
        }
        if (!this.f5822d.isEmpty()) {
            this.f5822d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo9555a(comparable) >= 0 || this.f5822d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo9560d() {
        return this.f5821c.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo9561e() {
        return this.f5822d.isEmpty() ? C2557c.f5832b : this.f5822d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f5824f == null) {
            this.f5824f = new C2562f();
        }
        return this.f5824f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2554b1)) {
            return super.equals(obj);
        }
        C2554b1 b1Var = (C2554b1) obj;
        int size = size();
        if (size != b1Var.size()) {
            return false;
        }
        int d = mo9560d();
        if (d != b1Var.mo9560d()) {
            return entrySet().equals(b1Var.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo9557c(i).equals(b1Var.mo9557c(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f5822d.equals(b1Var.f5822d);
        }
        return true;
    }

    /* renamed from: f */
    public final SortedMap<K, V> mo9564f() {
        mo9556b();
        if (this.f5822d.isEmpty() && !(this.f5822d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5822d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f5825g = treeMap.descendingMap();
        }
        return (SortedMap) this.f5822d;
    }

    /* renamed from: g */
    public void mo9550g() {
        if (!this.f5823e) {
            this.f5822d = this.f5822d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5822d);
            this.f5825g = this.f5825g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5825g);
            this.f5823e = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo9555a(comparable);
        return a >= 0 ? this.f5821c.get(a).f5834c : this.f5822d.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k, V v) {
        mo9556b();
        int a = mo9555a(k);
        if (a >= 0) {
            return this.f5821c.get(a).setValue(v);
        }
        mo9556b();
        if (this.f5821c.isEmpty() && !(this.f5821c instanceof ArrayList)) {
            this.f5821c = new ArrayList(this.f5820b);
        }
        int i = -(a + 1);
        if (i >= this.f5820b) {
            return mo9564f().put(k, v);
        }
        int size = this.f5821c.size();
        int i2 = this.f5820b;
        if (size == i2) {
            C2560d remove = this.f5821c.remove(i2 - 1);
            mo9564f().put(remove.f5833b, remove.f5834c);
        }
        this.f5821c.add(i, new C2560d(k, v));
        return null;
    }

    public final int hashCode() {
        int d = mo9560d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f5821c.get(i2).hashCode();
        }
        return this.f5822d.size() > 0 ? i + this.f5822d.hashCode() : i;
    }

    /* renamed from: i */
    public final V mo9568i(int i) {
        mo9556b();
        V v = this.f5821c.remove(i).f5834c;
        if (!this.f5822d.isEmpty()) {
            Iterator it = mo9564f().entrySet().iterator();
            List<C2554b1<K, V>.d> list = this.f5821c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2560d((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final V remove(Object obj) {
        mo9556b();
        Comparable comparable = (Comparable) obj;
        int a = mo9555a(comparable);
        if (a >= 0) {
            return mo9568i(a);
        }
        if (this.f5822d.isEmpty()) {
            return null;
        }
        return this.f5822d.remove(comparable);
    }

    public final int size() {
        return this.f5822d.size() + this.f5821c.size();
    }
}
