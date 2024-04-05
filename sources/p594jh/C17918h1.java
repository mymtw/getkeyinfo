package p594jh;

import p513bj.C14075p;

/* renamed from: jh.h1 */
public final class C17918h1 {

    /* renamed from: c */
    public static final C17918h1 f38937c = new C17918h1(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: d */
    public static final C17918h1 f38938d;

    /* renamed from: a */
    public final long f38939a;

    /* renamed from: b */
    public final long f38940b;

    static {
        C17918h1 h1Var = new C17918h1(0, 0);
        new C17918h1(Long.MAX_VALUE, 0);
        new C17918h1(0, Long.MAX_VALUE);
        f38938d = h1Var;
    }

    public C17918h1(long j, long j2) {
        boolean z = true;
        C14075p.m21691c(j >= 0);
        C14075p.m21691c(j2 < 0 ? false : z);
        this.f38939a = j;
        this.f38940b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17918h1.class != obj.getClass()) {
            return false;
        }
        C17918h1 h1Var = (C17918h1) obj;
        return this.f38939a == h1Var.f38939a && this.f38940b == h1Var.f38940b;
    }

    public final int hashCode() {
        return (((int) this.f38939a) * 31) + ((int) this.f38940b);
    }
}
