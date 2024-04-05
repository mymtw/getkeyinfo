package androidx.datastore.core;

/* renamed from: androidx.datastore.core.b */
public final class C2474b<T> extends C2484k<T> {

    /* renamed from: a */
    public final T f5749a;

    /* renamed from: b */
    public final int f5750b;

    public C2474b(T t, int i) {
        this.f5749a = t;
        this.f5750b = i;
    }

    /* renamed from: a */
    public final void mo9326a() {
        T t = this.f5749a;
        boolean z = false;
        if ((t != null ? t.hashCode() : 0) == this.f5750b) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
