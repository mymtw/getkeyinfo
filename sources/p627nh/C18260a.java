package p627nh;

/* renamed from: nh.a */
public final class C18260a {

    /* renamed from: a */
    public final int f40034a = 0;

    /* renamed from: b */
    public final int f40035b;

    /* renamed from: c */
    public final int f40036c;

    public C18260a(int i, int i2) {
        this.f40035b = i;
        this.f40036c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18260a)) {
            return false;
        }
        C18260a aVar = (C18260a) obj;
        return this.f40034a == aVar.f40034a && this.f40035b == aVar.f40035b && this.f40036c == aVar.f40036c;
    }

    public final int hashCode() {
        return ((((527 + this.f40034a) * 31) + this.f40035b) * 31) + this.f40036c;
    }
}
