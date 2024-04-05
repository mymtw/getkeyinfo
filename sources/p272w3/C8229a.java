package p272w3;

import androidx.compose.animation.C0391c;

/* renamed from: w3.a */
public final class C8229a<T> implements C8230b<T> {

    /* renamed from: d */
    public static final Object f18061d = new Object();

    /* renamed from: b */
    public volatile C8230b<T> f18062b;

    /* renamed from: c */
    public volatile Object f18063c = f18061d;

    public C8229a(C0391c cVar) {
        this.f18062b = cVar;
    }

    /* renamed from: a */
    public static void m16519a(Object obj, Object obj2) {
        if ((obj != f18061d) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t = this.f18063c;
        T t2 = f18061d;
        if (t == t2) {
            synchronized (this) {
                t = this.f18063c;
                if (t == t2) {
                    t = this.f18062b.get();
                    m16519a(this.f18063c, t);
                    this.f18063c = t;
                    this.f18062b = null;
                }
            }
        }
        return t;
    }
}
