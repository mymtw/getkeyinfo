package androidx.databinding;

import androidx.databinding.C2453j;
import java.util.ArrayList;
import java.util.Collection;

public class ObservableArrayList<T> extends ArrayList<T> implements C2453j<T> {

    /* renamed from: b */
    public transient C2448h f5695b = new C2448h();

    /* renamed from: a */
    public final void mo9165a(int i, int i2) {
        C2448h hVar = this.f5695b;
        if (hVar != null) {
            hVar.mo9292k(this, 2, C2448h.m5408j(i, i2));
        }
    }

    public boolean add(T t) {
        super.add(t);
        mo9165a(size() - 1, 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            mo9165a(size, size() - size);
        }
        return addAll;
    }

    public void addOnListChangedCallback(C2453j.C2454a aVar) {
        if (this.f5695b == null) {
            this.f5695b = new C2448h();
        }
        this.f5695b.mo9282a(aVar);
    }

    /* renamed from: c */
    public final void mo9171c(int i, int i2) {
        C2448h hVar = this.f5695b;
        if (hVar != null) {
            hVar.mo9292k(this, 4, C2448h.m5408j(i, i2));
        }
    }

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            mo9171c(0, size);
        }
    }

    public T remove(int i) {
        T remove = super.remove(i);
        mo9171c(i, 1);
        return remove;
    }

    public void removeOnListChangedCallback(C2453j.C2454a aVar) {
        C2448h hVar = this.f5695b;
        if (hVar != null) {
            hVar.mo9288h(aVar);
        }
    }

    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        mo9171c(i, i2 - i);
    }

    public T set(int i, T t) {
        T t2 = super.set(i, t);
        C2448h hVar = this.f5695b;
        if (hVar != null) {
            hVar.mo9292k(this, 1, C2448h.m5408j(i, 1));
        }
        return t2;
    }

    public void add(int i, T t) {
        super.add(i, t);
        mo9165a(i, 1);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            mo9165a(i, collection.size());
        }
        return addAll;
    }
}
