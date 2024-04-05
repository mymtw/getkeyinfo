package com.google.android.gms.internal.icing;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.t1 */
public final class C14549t1 extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    public final /* synthetic */ C14552u1 f32703b;

    public /* synthetic */ C14549t1(C14552u1 u1Var) {
        this.f32703b = u1Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f32703b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f32703b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f32703b.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C14546s1(this.f32703b);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f32703b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f32703b.size();
    }
}
