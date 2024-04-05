package androidx.databinding;

import java.util.List;

/* renamed from: androidx.databinding.j */
public interface C2453j<T> extends List<T> {

    /* renamed from: androidx.databinding.j$a */
    public static abstract class C2454a<T extends C2453j> {
        /* renamed from: a */
        public abstract void mo9271a(T t);

        /* renamed from: e */
        public abstract void mo9272e(C2453j jVar);

        /* renamed from: f */
        public abstract void mo9273f(C2453j jVar);

        /* renamed from: g */
        public abstract void mo9274g(C2453j jVar);

        /* renamed from: h */
        public abstract void mo9275h(C2453j jVar);
    }

    void addOnListChangedCallback(C2454a<? extends C2453j<T>> aVar);

    void removeOnListChangedCallback(C2454a<? extends C2453j<T>> aVar);
}
