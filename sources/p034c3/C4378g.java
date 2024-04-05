package p034c3;

/* renamed from: c3.g */
public final class C4378g {

    /* renamed from: a */
    public final String f9631a;

    /* renamed from: b */
    public final int f9632b;

    public C4378g(String str, int i) {
        this.f9631a = str;
        this.f9632b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4378g)) {
            return false;
        }
        C4378g gVar = (C4378g) obj;
        if (this.f9632b != gVar.f9632b) {
            return false;
        }
        return this.f9631a.equals(gVar.f9631a);
    }

    public final int hashCode() {
        return (this.f9631a.hashCode() * 31) + this.f9632b;
    }
}
