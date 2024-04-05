package androidx.compose.runtime;

import java.util.ArrayList;

/* renamed from: androidx.compose.runtime.a */
public abstract class C1293a<T> implements C1299c<T> {

    /* renamed from: a */
    public final T f2794a;

    /* renamed from: b */
    public final ArrayList f2795b = new ArrayList();

    /* renamed from: c */
    public T f2796c;

    public C1293a(T t) {
        this.f2794a = t;
        this.f2796c = t;
    }

    public final void clear() {
        this.f2795b.clear();
        this.f2796c = this.f2794a;
        mo5615i();
    }

    /* renamed from: e */
    public final T mo5612e() {
        return this.f2796c;
    }

    /* renamed from: g */
    public final void mo5613g(T t) {
        this.f2795b.add(this.f2796c);
        this.f2796c = t;
    }

    /* renamed from: h */
    public final void mo5614h() {
        if (!this.f2795b.isEmpty()) {
            ArrayList arrayList = this.f2795b;
            this.f2796c = arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public abstract void mo5615i();
}
