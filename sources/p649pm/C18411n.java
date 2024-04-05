package p649pm;

import p722ym.C18895a;

/* renamed from: pm.n */
public final class C18411n<T> implements C18895a<T> {

    /* renamed from: c */
    public static final Object f40493c = new Object();

    /* renamed from: a */
    public volatile Object f40494a = f40493c;

    /* renamed from: b */
    public volatile C18895a<T> f40495b;

    public C18411n(C18895a<T> aVar) {
        this.f40495b = aVar;
    }

    public final T get() {
        T t = this.f40494a;
        T t2 = f40493c;
        if (t == t2) {
            synchronized (this) {
                t = this.f40494a;
                if (t == t2) {
                    t = this.f40495b.get();
                    this.f40494a = t;
                    this.f40495b = null;
                }
            }
        }
        return t;
    }
}
