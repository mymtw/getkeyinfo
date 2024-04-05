package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c */
public abstract class C2563c<E> extends AbstractList<E> implements C2631w.C2635d<E> {

    /* renamed from: b */
    public boolean f5841b = true;

    /* renamed from: a */
    public final void mo9596a() {
        if (!this.f5841b) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo9596a();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo9596a();
        return super.addAll(collection);
    }

    public void clear() {
        mo9596a();
        super.clear();
    }

    /* renamed from: d */
    public final void mo9601d() {
        this.f5841b = false;
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
    public final boolean mo9603h() {
        return this.f5841b;
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
        mo9596a();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo9596a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo9596a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo9596a();
        return super.addAll(i, collection);
    }
}
