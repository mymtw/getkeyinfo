package p036c5;

import android.support.p013v4.media.C0072d;

/* renamed from: c5.k */
public final class C4425k {

    /* renamed from: a */
    public Class<?> f9707a;

    /* renamed from: b */
    public Class<?> f9708b;

    /* renamed from: c */
    public Class<?> f9709c;

    public C4425k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4425k.class != obj.getClass()) {
            return false;
        }
        C4425k kVar = (C4425k) obj;
        return this.f9707a.equals(kVar.f9707a) && this.f9708b.equals(kVar.f9708b) && C4426l.m10128b(this.f9709c, kVar.f9709c);
    }

    public final int hashCode() {
        int hashCode = (this.f9708b.hashCode() + (this.f9707a.hashCode() * 31)) * 31;
        Class<?> cls = this.f9709c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MultiClassKey{first=");
        h.append(this.f9707a);
        h.append(", second=");
        h.append(this.f9708b);
        h.append('}');
        return h.toString();
    }

    public C4425k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f9707a = cls;
        this.f9708b = cls2;
        this.f9709c = cls3;
    }
}
