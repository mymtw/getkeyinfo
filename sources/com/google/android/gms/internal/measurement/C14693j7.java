package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
public final class C14693j7 extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    public final /* synthetic */ C14706k7 f32896b;

    public /* synthetic */ C14693j7(C14706k7 k7Var) {
        this.f32896b = k7Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f32896b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f32896b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f32896b.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C14680i7(this.f32896b);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f32896b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f32896b.size();
    }
}
