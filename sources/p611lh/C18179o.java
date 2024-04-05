package p611lh;

/* renamed from: lh.o */
public final class C18179o {

    /* renamed from: a */
    public final int f39780a = 0;

    /* renamed from: b */
    public final float f39781b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18179o.class != obj.getClass()) {
            return false;
        }
        C18179o oVar = (C18179o) obj;
        return this.f39780a == oVar.f39780a && Float.compare(oVar.f39781b, this.f39781b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f39781b) + ((527 + this.f39780a) * 31);
    }
}
