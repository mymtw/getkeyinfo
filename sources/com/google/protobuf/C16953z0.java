package com.google.protobuf;

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

/* renamed from: com.google.protobuf.z0 */
public class C16953z0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f37318i = 0;

    /* renamed from: b */
    public final int f37319b;

    /* renamed from: c */
    public List<C16953z0<K, V>.d> f37320c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f37321d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f37322e;

    /* renamed from: f */
    public volatile C16953z0<K, V>.f f37323f;

    /* renamed from: g */
    public Map<K, V> f37324g = Collections.emptyMap();

    /* renamed from: h */
    public volatile C16953z0<K, V>.b f37325h;

    /* renamed from: com.google.protobuf.z0$a */
    public class C16954a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f37326b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f37327c;

        public C16954a() {
            this.f37326b = C16953z0.this.f37320c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo60092a() {
            if (this.f37327c == null) {
                this.f37327c = C16953z0.this.f37324g.entrySet().iterator();
            }
            return this.f37327c;
        }

        public final boolean hasNext() {
            int i = this.f37326b;
            return (i > 0 && i <= C16953z0.this.f37320c.size()) || mo60092a().hasNext();
        }

        public final Object next() {
            if (mo60092a().hasNext()) {
                return (Map.Entry) mo60092a().next();
            }
            List<C16953z0<K, V>.d> list = C16953z0.this.f37320c;
            int i = this.f37326b - 1;
            this.f37326b = i;
            return list.get(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.z0$b */
    public class C16955b extends C16953z0<K, V>.f {
        public C16955b() {
            super();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16954a();
        }
    }

    /* renamed from: com.google.protobuf.z0$c */
    public static class C16956c {

        /* renamed from: a */
        public static final C16957a f37330a = new C16957a();

        /* renamed from: b */
        public static final C16958b f37331b = new C16958b();

        /* renamed from: com.google.protobuf.z0$c$a */
        public static class C16957a implements Iterator<Object> {
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

        /* renamed from: com.google.protobuf.z0$c$b */
        public static class C16958b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return C16956c.f37330a;
            }
        }
    }

    /* renamed from: com.google.protobuf.z0$d */
    public class C16959d implements Map.Entry<K, V>, Comparable<C16953z0<K, V>.d> {

        /* renamed from: b */
        public final K f37332b;

        /* renamed from: c */
        public V f37333c;

        public C16959d() {
            throw null;
        }

        public C16959d(K k, V v) {
            this.f37332b = k;
            this.f37333c = v;
        }

        public final int compareTo(Object obj) {
            return this.f37332b.compareTo(((C16959d) obj).f37332b);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f37332b;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f37333c;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f37332b;
        }

        public final V getValue() {
            return this.f37333c;
        }

        public final int hashCode() {
            K k = this.f37332b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f37333c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            C16953z0 z0Var = C16953z0.this;
            int i = C16953z0.f37318i;
            z0Var.mo60077b();
            V v2 = this.f37333c;
            this.f37333c = v;
            return v2;
        }

        public final String toString() {
            return this.f37332b + "=" + this.f37333c;
        }
    }

    /* renamed from: com.google.protobuf.z0$e */
    public class C16960e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f37335b = -1;

        /* renamed from: c */
        public boolean f37336c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f37337d;

        public C16960e() {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo60108a() {
            if (this.f37337d == null) {
                this.f37337d = C16953z0.this.f37321d.entrySet().iterator();
            }
            return this.f37337d;
        }

        public final boolean hasNext() {
            if (this.f37335b + 1 >= C16953z0.this.f37320c.size()) {
                return !C16953z0.this.f37321d.isEmpty() && mo60108a().hasNext();
            }
            return true;
        }

        public final Object next() {
            this.f37336c = true;
            int i = this.f37335b + 1;
            this.f37335b = i;
            return i < C16953z0.this.f37320c.size() ? C16953z0.this.f37320c.get(this.f37335b) : (Map.Entry) mo60108a().next();
        }

        public final void remove() {
            if (this.f37336c) {
                this.f37336c = false;
                C16953z0 z0Var = C16953z0.this;
                int i = C16953z0.f37318i;
                z0Var.mo60077b();
                if (this.f37335b < C16953z0.this.f37320c.size()) {
                    C16953z0 z0Var2 = C16953z0.this;
                    int i2 = this.f37335b;
                    this.f37335b = i2 - 1;
                    z0Var2.mo60089i(i2);
                    return;
                }
                mo60108a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.google.protobuf.z0$f */
    public class C16961f extends AbstractSet<Map.Entry<K, V>> {
        public C16961f() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C16953z0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            C16953z0.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C16953z0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C16960e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C16953z0.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return C16953z0.this.size();
        }
    }

    public C16953z0(int i) {
        this.f37319b = i;
    }

    /* renamed from: a */
    public final int mo60076a(K k) {
        int size = this.f37320c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f37320c.get(size).f37332b);
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
            int compareTo2 = k.compareTo(this.f37320c.get(i2).f37332b);
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
    public final void mo60077b() {
        if (this.f37322e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo60078c(int i) {
        return this.f37320c.get(i);
    }

    public final void clear() {
        mo60077b();
        if (!this.f37320c.isEmpty()) {
            this.f37320c.clear();
        }
        if (!this.f37321d.isEmpty()) {
            this.f37321d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo60076a(comparable) >= 0 || this.f37321d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo60081d() {
        return this.f37320c.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo60082e() {
        return this.f37321d.isEmpty() ? C16956c.f37331b : this.f37321d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f37323f == null) {
            this.f37323f = new C16961f();
        }
        return this.f37323f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16953z0)) {
            return super.equals(obj);
        }
        C16953z0 z0Var = (C16953z0) obj;
        int size = size();
        if (size != z0Var.size()) {
            return false;
        }
        int d = mo60081d();
        if (d != z0Var.mo60081d()) {
            return entrySet().equals(z0Var.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo60078c(i).equals(z0Var.mo60078c(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f37321d.equals(z0Var.f37321d);
        }
        return true;
    }

    /* renamed from: f */
    public final SortedMap<K, V> mo60085f() {
        mo60077b();
        if (this.f37321d.isEmpty() && !(this.f37321d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37321d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f37324g = treeMap.descendingMap();
        }
        return (SortedMap) this.f37321d;
    }

    /* renamed from: g */
    public void mo60074g() {
        if (!this.f37322e) {
            this.f37321d = this.f37321d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f37321d);
            this.f37324g = this.f37324g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f37324g);
            this.f37322e = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo60076a(comparable);
        return a >= 0 ? this.f37320c.get(a).f37333c : this.f37321d.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k, V v) {
        mo60077b();
        int a = mo60076a(k);
        if (a >= 0) {
            return this.f37320c.get(a).setValue(v);
        }
        mo60077b();
        if (this.f37320c.isEmpty() && !(this.f37320c instanceof ArrayList)) {
            this.f37320c = new ArrayList(this.f37319b);
        }
        int i = -(a + 1);
        if (i >= this.f37319b) {
            return mo60085f().put(k, v);
        }
        int size = this.f37320c.size();
        int i2 = this.f37319b;
        if (size == i2) {
            C16959d remove = this.f37320c.remove(i2 - 1);
            mo60085f().put(remove.f37332b, remove.f37333c);
        }
        this.f37320c.add(i, new C16959d(k, v));
        return null;
    }

    public final int hashCode() {
        int d = mo60081d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f37320c.get(i2).hashCode();
        }
        return this.f37321d.size() > 0 ? i + this.f37321d.hashCode() : i;
    }

    /* renamed from: i */
    public final V mo60089i(int i) {
        mo60077b();
        V v = this.f37320c.remove(i).f37333c;
        if (!this.f37321d.isEmpty()) {
            Iterator it = mo60085f().entrySet().iterator();
            List<C16953z0<K, V>.d> list = this.f37320c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C16959d((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final V remove(Object obj) {
        mo60077b();
        Comparable comparable = (Comparable) obj;
        int a = mo60076a(comparable);
        if (a >= 0) {
            return mo60089i(a);
        }
        if (this.f37321d.isEmpty()) {
            return null;
        }
        return this.f37321d.remove(comparable);
    }

    public final int size() {
        return this.f37321d.size() + this.f37320c.size();
    }
}
