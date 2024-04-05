package p595ji;

/* renamed from: ji.f */
public class C17994f {

    /* renamed from: a */
    public final Object f39346a;

    /* renamed from: b */
    public final int f39347b;

    /* renamed from: c */
    public final int f39348c;

    /* renamed from: d */
    public final long f39349d;

    /* renamed from: e */
    public final int f39350e;

    public C17994f(Object obj, long j) {
        this(-1, -1, -1, j, obj);
    }

    /* renamed from: a */
    public final boolean mo69559a() {
        return this.f39347b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17994f)) {
            return false;
        }
        C17994f fVar = (C17994f) obj;
        return this.f39346a.equals(fVar.f39346a) && this.f39347b == fVar.f39347b && this.f39348c == fVar.f39348c && this.f39349d == fVar.f39349d && this.f39350e == fVar.f39350e;
    }

    public final int hashCode() {
        return ((((((((this.f39346a.hashCode() + 527) * 31) + this.f39347b) * 31) + this.f39348c) * 31) + ((int) this.f39349d)) * 31) + this.f39350e;
    }

    public C17994f(C17994f fVar) {
        this.f39346a = fVar.f39346a;
        this.f39347b = fVar.f39347b;
        this.f39348c = fVar.f39348c;
        this.f39349d = fVar.f39349d;
        this.f39350e = fVar.f39350e;
    }

    public C17994f(int i, int i2, int i3, long j, Object obj) {
        this.f39346a = obj;
        this.f39347b = i;
        this.f39348c = i2;
        this.f39349d = j;
        this.f39350e = i3;
    }
}
