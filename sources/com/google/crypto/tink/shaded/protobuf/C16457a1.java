package com.google.crypto.tink.shaded.protobuf;

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

/* renamed from: com.google.crypto.tink.shaded.protobuf.a1 */
public class C16457a1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f36559i = 0;

    /* renamed from: b */
    public final int f36560b;

    /* renamed from: c */
    public List<C16457a1<K, V>.d> f36561c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f36562d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f36563e;

    /* renamed from: f */
    public volatile C16457a1<K, V>.f f36564f;

    /* renamed from: g */
    public Map<K, V> f36565g = Collections.emptyMap();

    /* renamed from: h */
    public volatile C16457a1<K, V>.b f36566h;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$a */
    public class C16458a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f36567b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f36568c;

        public C16458a() {
            this.f36567b = C16457a1.this.f36561c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo58628a() {
            if (this.f36568c == null) {
                this.f36568c = C16457a1.this.f36565g.entrySet().iterator();
            }
            return this.f36568c;
        }

        public final boolean hasNext() {
            int i = this.f36567b;
            return (i > 0 && i <= C16457a1.this.f36561c.size()) || mo58628a().hasNext();
        }

        public final Object next() {
            if (mo58628a().hasNext()) {
                return (Map.Entry) mo58628a().next();
            }
            List<C16457a1<K, V>.d> list = C16457a1.this.f36561c;
            int i = this.f36567b - 1;
            this.f36567b = i;
            return list.get(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$b */
    public class C16459b extends C16457a1<K, V>.f {
        public C16459b() {
            super();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16458a();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$c */
    public static class C16460c {

        /* renamed from: a */
        public static final C16461a f36571a = new C16461a();

        /* renamed from: b */
        public static final C16462b f36572b = new C16462b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$c$a */
        public class C16461a implements Iterator<Object> {
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

        /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$c$b */
        public class C16462b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return C16460c.f36571a;
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$d */
    public class C16463d implements Map.Entry<K, V>, Comparable<C16457a1<K, V>.d> {

        /* renamed from: b */
        public final K f36573b;

        /* renamed from: c */
        public V f36574c;

        public C16463d() {
            throw null;
        }

        public C16463d(K k, V v) {
            this.f36573b = k;
            this.f36574c = v;
        }

        public final int compareTo(Object obj) {
            return this.f36573b.compareTo(((C16463d) obj).f36573b);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f36573b;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f36574c;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f36573b;
        }

        public final V getValue() {
            return this.f36574c;
        }

        public final int hashCode() {
            K k = this.f36573b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f36574c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            C16457a1 a1Var = C16457a1.this;
            int i = C16457a1.f36559i;
            a1Var.mo58611b();
            V v2 = this.f36574c;
            this.f36574c = v;
            return v2;
        }

        public final String toString() {
            return this.f36573b + "=" + this.f36574c;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$e */
    public class C16464e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f36576b = -1;

        /* renamed from: c */
        public boolean f36577c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f36578d;

        public C16464e() {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo58644a() {
            if (this.f36578d == null) {
                this.f36578d = C16457a1.this.f36562d.entrySet().iterator();
            }
            return this.f36578d;
        }

        public final boolean hasNext() {
            if (this.f36576b + 1 >= C16457a1.this.f36561c.size()) {
                return !C16457a1.this.f36562d.isEmpty() && mo58644a().hasNext();
            }
            return true;
        }

        public final Object next() {
            this.f36577c = true;
            int i = this.f36576b + 1;
            this.f36576b = i;
            return i < C16457a1.this.f36561c.size() ? C16457a1.this.f36561c.get(this.f36576b) : (Map.Entry) mo58644a().next();
        }

        public final void remove() {
            if (this.f36577c) {
                this.f36577c = false;
                C16457a1 a1Var = C16457a1.this;
                int i = C16457a1.f36559i;
                a1Var.mo58611b();
                if (this.f36576b < C16457a1.this.f36561c.size()) {
                    C16457a1 a1Var2 = C16457a1.this;
                    int i2 = this.f36576b;
                    this.f36576b = i2 - 1;
                    a1Var2.mo58624i(i2);
                    return;
                }
                mo58644a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a1$f */
    public class C16465f extends AbstractSet<Map.Entry<K, V>> {
        public C16465f() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C16457a1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            C16457a1.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C16457a1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C16464e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C16457a1.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return C16457a1.this.size();
        }
    }

    public C16457a1(int i) {
        this.f36560b = i;
    }

    /* renamed from: a */
    public final int mo58610a(K k) {
        int size = this.f36561c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f36561c.get(size).f36573b);
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
            int compareTo2 = k.compareTo(this.f36561c.get(i2).f36573b);
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
    public final void mo58611b() {
        if (this.f36563e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo58612c(int i) {
        return this.f36561c.get(i);
    }

    public final void clear() {
        mo58611b();
        if (!this.f36561c.isEmpty()) {
            this.f36561c.clear();
        }
        if (!this.f36562d.isEmpty()) {
            this.f36562d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo58610a(comparable) >= 0 || this.f36562d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo58615d() {
        return this.f36561c.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo58616e() {
        return this.f36562d.isEmpty() ? C16460c.f36572b : this.f36562d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f36564f == null) {
            this.f36564f = new C16465f();
        }
        return this.f36564f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16457a1)) {
            return super.equals(obj);
        }
        C16457a1 a1Var = (C16457a1) obj;
        int size = size();
        if (size != a1Var.size()) {
            return false;
        }
        int d = mo58615d();
        if (d != a1Var.mo58615d()) {
            return entrySet().equals(a1Var.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo58612c(i).equals(a1Var.mo58612c(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f36562d.equals(a1Var.f36562d);
        }
        return true;
    }

    /* renamed from: f */
    public final SortedMap<K, V> mo58619f() {
        mo58611b();
        if (this.f36562d.isEmpty() && !(this.f36562d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36562d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f36565g = treeMap.descendingMap();
        }
        return (SortedMap) this.f36562d;
    }

    /* renamed from: g */
    public void mo58620g() {
        if (!this.f36563e) {
            this.f36562d = this.f36562d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f36562d);
            this.f36565g = this.f36565g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f36565g);
            this.f36563e = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo58610a(comparable);
        return a >= 0 ? this.f36561c.get(a).f36574c : this.f36562d.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k, V v) {
        mo58611b();
        int a = mo58610a(k);
        if (a >= 0) {
            return this.f36561c.get(a).setValue(v);
        }
        mo58611b();
        if (this.f36561c.isEmpty() && !(this.f36561c instanceof ArrayList)) {
            this.f36561c = new ArrayList(this.f36560b);
        }
        int i = -(a + 1);
        if (i >= this.f36560b) {
            return mo58619f().put(k, v);
        }
        int size = this.f36561c.size();
        int i2 = this.f36560b;
        if (size == i2) {
            C16463d remove = this.f36561c.remove(i2 - 1);
            mo58619f().put(remove.f36573b, remove.f36574c);
        }
        this.f36561c.add(i, new C16463d(k, v));
        return null;
    }

    public final int hashCode() {
        int d = mo58615d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f36561c.get(i2).hashCode();
        }
        return this.f36562d.size() > 0 ? i + this.f36562d.hashCode() : i;
    }

    /* renamed from: i */
    public final V mo58624i(int i) {
        mo58611b();
        V v = this.f36561c.remove(i).f36574c;
        if (!this.f36562d.isEmpty()) {
            Iterator it = mo58619f().entrySet().iterator();
            List<C16457a1<K, V>.d> list = this.f36561c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C16463d((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final V remove(Object obj) {
        mo58611b();
        Comparable comparable = (Comparable) obj;
        int a = mo58610a(comparable);
        if (a >= 0) {
            return mo58624i(a);
        }
        if (this.f36562d.isEmpty()) {
            return null;
        }
        return this.f36562d.remove(comparable);
    }

    public final int size() {
        return this.f36562d.size() + this.f36561c.size();
    }
}
