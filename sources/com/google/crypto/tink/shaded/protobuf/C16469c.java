package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c */
public abstract class C16469c<E> extends AbstractList<E> implements C16531v.C16535d<E> {

    /* renamed from: b */
    public boolean f36583b = true;

    /* renamed from: a */
    public final void mo58670a() {
        if (!this.f36583b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo58670a();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo58670a();
        return super.addAll(collection);
    }

    public void clear() {
        mo58670a();
        super.clear();
    }

    /* renamed from: d */
    public final void mo58673d() {
        this.f36583b = false;
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
    public final boolean mo58674h() {
        return this.f36583b;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo58670a();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo58670a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo58670a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo58670a();
        return super.addAll(i, collection);
    }
}
