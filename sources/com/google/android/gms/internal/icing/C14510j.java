package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.icing.j */
public abstract class C14510j<E> extends AbstractList<E> implements C14511j0<E> {

    /* renamed from: b */
    public boolean f32650b = true;

    /* renamed from: a */
    public final void mo49812a() {
        if (!this.f32650b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo49812a();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo49812a();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo49812a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo49812a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo49812a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo49812a();
        return super.retainAll(collection);
    }

    public final boolean zza() {
        return this.f32650b;
    }

    public final void zzb() {
        this.f32650b = false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo49812a();
        return super.addAll(collection);
    }
}
