package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u4 */
public abstract class C14830u4<E> extends AbstractList<E> implements C14891z5<E> {

    /* renamed from: b */
    public boolean f33094b = true;

    /* renamed from: a */
    public final void mo50891a() {
        if (!this.f33094b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo50891a();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo50891a();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo50891a();
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
        mo50891a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo50891a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo50891a();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f33094b = false;
    }

    public final boolean zzc() {
        return this.f33094b;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo50891a();
        return super.addAll(collection);
    }
}
