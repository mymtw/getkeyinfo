package androidx.navigation;

/* renamed from: androidx.navigation.m */
public final class C2971m {

    /* renamed from: a */
    public boolean f6749a;

    /* renamed from: b */
    public int f6750b;

    /* renamed from: c */
    public boolean f6751c;

    /* renamed from: d */
    public int f6752d;

    /* renamed from: e */
    public int f6753e;

    /* renamed from: f */
    public int f6754f;

    /* renamed from: g */
    public int f6755g;

    public C2971m(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.f6749a = z;
        this.f6750b = i;
        this.f6751c = z2;
        this.f6752d = i2;
        this.f6753e = i3;
        this.f6754f = i4;
        this.f6755g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2971m.class != obj.getClass()) {
            return false;
        }
        C2971m mVar = (C2971m) obj;
        return this.f6749a == mVar.f6749a && this.f6750b == mVar.f6750b && this.f6751c == mVar.f6751c && this.f6752d == mVar.f6752d && this.f6753e == mVar.f6753e && this.f6754f == mVar.f6754f && this.f6755g == mVar.f6755g;
    }

    public final int hashCode() {
        return ((((((((((((this.f6749a ? 1 : 0) * true) + this.f6750b) * 31) + (this.f6751c ? 1 : 0)) * 31) + this.f6752d) * 31) + this.f6753e) * 31) + this.f6754f) * 31) + this.f6755g;
    }
}
