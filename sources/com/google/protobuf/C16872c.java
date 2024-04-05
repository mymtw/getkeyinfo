package com.google.protobuf;

import com.google.protobuf.C16935v;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
public abstract class C16872c<E> extends AbstractList<E> implements C16935v.C16942f<E> {

    /* renamed from: b */
    public boolean f37182b = true;

    /* renamed from: a */
    public final void mo59861a() {
        if (!this.f37182b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo59861a();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo59861a();
        return super.addAll(collection);
    }

    public void clear() {
        mo59861a();
        super.clear();
    }

    /* renamed from: d */
    public final void mo59864d() {
        this.f37182b = false;
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

    /* renamed from: h */
    public final boolean mo59865h() {
        return this.f37182b;
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
        mo59861a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo59861a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo59861a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo59861a();
        return super.addAll(i, collection);
    }
}
