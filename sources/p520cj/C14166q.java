package p520cj;

/* renamed from: cj.q */
public final class C14166q {

    /* renamed from: a */
    public final int f31268a;

    /* renamed from: b */
    public final int f31269b;

    /* renamed from: c */
    public final int f31270c;

    /* renamed from: d */
    public final float f31271d;

    public C14166q(int i, float f, int i2, int i3) {
        this.f31268a = i;
        this.f31269b = i2;
        this.f31270c = i3;
        this.f31271d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14166q)) {
            return false;
        }
        C14166q qVar = (C14166q) obj;
        return this.f31268a == qVar.f31268a && this.f31269b == qVar.f31269b && this.f31270c == qVar.f31270c && this.f31271d == qVar.f31271d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f31271d) + ((((((217 + this.f31268a) * 31) + this.f31269b) * 31) + this.f31270c) * 31);
    }
}
