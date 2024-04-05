package p764pq;

/* renamed from: pq.d */
public final class C20052d implements C20053e<Float> {

    /* renamed from: b */
    public final float f44412b;

    /* renamed from: c */
    public final float f44413c;

    public C20052d(float f, float f2) {
        this.f44412b = f;
        this.f44413c = f2;
    }

    /* renamed from: a */
    public final boolean mo74314a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* renamed from: c */
    public final Comparable mo74309c() {
        return Float.valueOf(this.f44412b);
    }

    /* renamed from: e */
    public final boolean mo74315e(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.f44412b && floatValue <= this.f44413c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20052d) {
            if (isEmpty() && ((C20052d) obj).isEmpty()) {
                return true;
            }
            C20052d dVar = (C20052d) obj;
            if (this.f44412b == dVar.f44412b) {
                if (this.f44413c == dVar.f44413c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final Comparable mo74311g() {
        return Float.valueOf(this.f44413c);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f44412b).hashCode() * 31) + Float.valueOf(this.f44413c).hashCode();
    }

    public final boolean isEmpty() {
        return this.f44412b > this.f44413c;
    }

    public final String toString() {
        return this.f44412b + ".." + this.f44413c;
    }
}
