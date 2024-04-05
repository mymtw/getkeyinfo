package dagger.internal;

import p634np.C18289a;
import p740eq.C19011a;

/* renamed from: dagger.internal.c */
public final class C17554c<T> implements C19011a<T>, C18289a<T> {

    /* renamed from: c */
    public static final Object f38387c = new Object();

    /* renamed from: a */
    public volatile C19011a<T> f38388a;

    /* renamed from: b */
    public volatile Object f38389b = f38387c;

    public C17554c(C19011a<T> aVar) {
        this.f38388a = aVar;
    }

    /* renamed from: a */
    public static <P extends C19011a<T>, T> C18289a<T> m29426a(P p) {
        if (p instanceof C18289a) {
            return (C18289a) p;
        }
        p.getClass();
        return new C17554c(p);
    }

    /* renamed from: b */
    public static <P extends C19011a<T>, T> C19011a<T> m29427b(P p) {
        p.getClass();
        return p instanceof C17554c ? p : new C17554c(p);
    }

    /* renamed from: c */
    public static void m29428c(Object obj, Object obj2) {
        if ((obj != f38387c) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t = this.f38389b;
        T t2 = f38387c;
        if (t == t2) {
            synchronized (this) {
                t = this.f38389b;
                if (t == t2) {
                    t = this.f38388a.get();
                    m29428c(this.f38389b, t);
                    this.f38389b = t;
                    this.f38388a = null;
                }
            }
        }
        return t;
    }
}
