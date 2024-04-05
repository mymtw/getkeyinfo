package com.google.android.gms.internal.icing;

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

/* renamed from: com.google.android.gms.internal.icing.u1 */
public class C14552u1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: h */
    public static final /* synthetic */ int f32709h = 0;

    /* renamed from: b */
    public final int f32710b;

    /* renamed from: c */
    public List<C14543r1> f32711c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f32712d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f32713e;

    /* renamed from: f */
    public volatile C14549t1 f32714f;

    /* renamed from: g */
    public Map<K, V> f32715g = Collections.emptyMap();

    public /* synthetic */ C14552u1(int i) {
        this.f32710b = i;
    }

    /* renamed from: a */
    public void mo49858a() {
        if (!this.f32713e) {
            this.f32712d = this.f32712d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f32712d);
            this.f32715g = this.f32715g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f32715g);
            this.f32713e = true;
        }
    }

    /* renamed from: b */
    public final V put(K k, V v) {
        mo49936e();
        int d = mo49935d(k);
        if (d >= 0) {
            return this.f32711c.get(d).setValue(v);
        }
        mo49936e();
        if (this.f32711c.isEmpty() && !(this.f32711c instanceof ArrayList)) {
            this.f32711c = new ArrayList(this.f32710b);
        }
        int i = -(d + 1);
        if (i >= this.f32710b) {
            return mo49939f().put(k, v);
        }
        int size = this.f32711c.size();
        int i2 = this.f32710b;
        if (size == i2) {
            C14543r1 remove = this.f32711c.remove(i2 - 1);
            mo49939f().put(remove.f32691b, remove.f32692c);
        }
        this.f32711c.add(i, new C14543r1(this, k, v));
        return null;
    }

    /* renamed from: c */
    public final V mo49932c(int i) {
        mo49936e();
        V v = this.f32711c.remove(i).f32692c;
        if (!this.f32712d.isEmpty()) {
            Iterator it = mo49939f().entrySet().iterator();
            List<C14543r1> list = this.f32711c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C14543r1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final void clear() {
        mo49936e();
        if (!this.f32711c.isEmpty()) {
            this.f32711c.clear();
        }
        if (!this.f32712d.isEmpty()) {
            this.f32712d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo49935d(comparable) >= 0 || this.f32712d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo49935d(K k) {
        int size = this.f32711c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f32711c.get(size).f32691b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f32711c.get(i2).f32691b);
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

    /* renamed from: e */
    public final void mo49936e() {
        if (this.f32713e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f32714f == null) {
            this.f32714f = new C14549t1(this);
        }
        return this.f32714f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14552u1)) {
            return super.equals(obj);
        }
        C14552u1 u1Var = (C14552u1) obj;
        int size = size();
        if (size != u1Var.size()) {
            return false;
        }
        int size2 = this.f32711c.size();
        if (size2 == u1Var.f32711c.size()) {
            for (int i = 0; i < size2; i++) {
                if (!this.f32711c.get(i).equals(u1Var.f32711c.get(i))) {
                    return false;
                }
            }
            if (size2 != size) {
                return this.f32712d.equals(u1Var.f32712d);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(u1Var.entrySet());
    }

    /* renamed from: f */
    public final SortedMap<K, V> mo49939f() {
        mo49936e();
        if (this.f32712d.isEmpty() && !(this.f32712d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32712d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f32715g = treeMap.descendingMap();
        }
        return (SortedMap) this.f32712d;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d = mo49935d(comparable);
        return d >= 0 ? this.f32711c.get(d).f32692c : this.f32712d.get(comparable);
    }

    public final int hashCode() {
        int size = this.f32711c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f32711c.get(i2).hashCode();
        }
        return this.f32712d.size() > 0 ? this.f32712d.hashCode() + i : i;
    }

    public final V remove(Object obj) {
        mo49936e();
        Comparable comparable = (Comparable) obj;
        int d = mo49935d(comparable);
        if (d >= 0) {
            return mo49932c(d);
        }
        if (this.f32712d.isEmpty()) {
            return null;
        }
        return this.f32712d.remove(comparable);
    }

    public final int size() {
        return this.f32712d.size() + this.f32711c.size();
    }
}
