package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
public class C14706k7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: h */
    public static final /* synthetic */ int f32912h = 0;

    /* renamed from: b */
    public final int f32913b;

    /* renamed from: c */
    public List<C14667h7> f32914c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f32915d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f32916e;

    /* renamed from: f */
    public volatile C14693j7 f32917f;

    /* renamed from: g */
    public Map<K, V> f32918g = Collections.emptyMap();

    public /* synthetic */ C14706k7(int i) {
        this.f32913b = i;
    }

    /* renamed from: a */
    public void mo50477a() {
        if (!this.f32916e) {
            this.f32915d = this.f32915d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f32915d);
            this.f32918g = this.f32918g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f32918g);
            this.f32916e = true;
        }
    }

    /* renamed from: b */
    public final V put(K k, V v) {
        mo50639f();
        int c = mo50632c(k);
        if (c >= 0) {
            return this.f32914c.get(c).setValue(v);
        }
        mo50639f();
        if (this.f32914c.isEmpty() && !(this.f32914c instanceof ArrayList)) {
            this.f32914c = new ArrayList(this.f32913b);
        }
        int i = -(c + 1);
        if (i >= this.f32913b) {
            return mo50636e().put(k, v);
        }
        int size = this.f32914c.size();
        int i2 = this.f32913b;
        if (size == i2) {
            C14667h7 remove = this.f32914c.remove(i2 - 1);
            mo50636e().put(remove.f32869b, remove.f32870c);
        }
        this.f32914c.add(i, new C14667h7(this, k, v));
        return null;
    }

    /* renamed from: c */
    public final int mo50632c(K k) {
        int size = this.f32914c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f32914c.get(size).f32869b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f32914c.get(i2).f32869b);
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

    public final void clear() {
        mo50639f();
        if (!this.f32914c.isEmpty()) {
            this.f32914c.clear();
        }
        if (!this.f32915d.isEmpty()) {
            this.f32915d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo50632c(comparable) >= 0 || this.f32915d.containsKey(comparable);
    }

    /* renamed from: d */
    public final V mo50635d(int i) {
        mo50639f();
        V v = this.f32914c.remove(i).f32870c;
        if (!this.f32915d.isEmpty()) {
            Iterator it = mo50636e().entrySet().iterator();
            List<C14667h7> list = this.f32914c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C14667h7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: e */
    public final SortedMap<K, V> mo50636e() {
        mo50639f();
        if (this.f32915d.isEmpty() && !(this.f32915d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32915d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f32918g = treeMap.descendingMap();
        }
        return (SortedMap) this.f32915d;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f32917f == null) {
            this.f32917f = new C14693j7(this);
        }
        return this.f32917f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14706k7)) {
            return super.equals(obj);
        }
        C14706k7 k7Var = (C14706k7) obj;
        int size = size();
        if (size != k7Var.size()) {
            return false;
        }
        int size2 = this.f32914c.size();
        if (size2 == k7Var.f32914c.size()) {
            for (int i = 0; i < size2; i++) {
                if (!this.f32914c.get(i).equals(k7Var.f32914c.get(i))) {
                    return false;
                }
            }
            if (size2 != size) {
                return this.f32915d.equals(k7Var.f32915d);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(k7Var.entrySet());
    }

    /* renamed from: f */
    public final void mo50639f() {
        if (this.f32916e) {
            throw new UnsupportedOperationException();
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c = mo50632c(comparable);
        return c >= 0 ? this.f32914c.get(c).f32870c : this.f32915d.get(comparable);
    }

    public final int hashCode() {
        int size = this.f32914c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f32914c.get(i2).hashCode();
        }
        return this.f32915d.size() > 0 ? this.f32915d.hashCode() + i : i;
    }

    public final V remove(Object obj) {
        mo50639f();
        Comparable comparable = (Comparable) obj;
        int c = mo50632c(comparable);
        if (c >= 0) {
            return mo50635d(c);
        }
        if (this.f32915d.isEmpty()) {
            return null;
        }
        return this.f32915d.remove(comparable);
    }

    public final int size() {
        return this.f32915d.size() + this.f32914c.size();
    }
}
