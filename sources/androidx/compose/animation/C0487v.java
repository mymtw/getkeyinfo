package androidx.compose.animation;

import androidx.compose.animation.C0478n;
import androidx.compose.animation.core.C0458v;
import p174m0.C7282b;

/* renamed from: androidx.compose.animation.v */
public final class C0487v implements C0458v {

    /* renamed from: a */
    public final C0478n f1231a;

    public C0487v(C7282b bVar) {
        this.f1231a = new C0478n(C0488w.f1232a, bVar);
    }

    /* renamed from: a */
    public final void mo3535a() {
    }

    /* renamed from: b */
    public final float mo3536b(float f, long j, float f2) {
        long j2 = j / 1000000;
        C0478n.C0479a a = this.f1231a.mo3557a(f2);
        long j3 = a.f1224c;
        return (Math.signum(a.f1222a) * a.f1223b * C0389b.m1054a(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).f1004a) + f;
    }

    /* renamed from: c */
    public final long mo3537c(float f) {
        return ((long) (Math.exp(this.f1231a.mo3558b(f) / (((double) C0480o.f1225a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    /* renamed from: d */
    public final float mo3538d(float f, float f2) {
        C0478n nVar = this.f1231a;
        double b = nVar.mo3558b(f2);
        double d = (double) C0480o.f1225a;
        double exp = Math.exp((d / (d - 1.0d)) * b);
        return (Math.signum(f2) * ((float) (exp * ((double) (nVar.f1219a * nVar.f1221c))))) + f;
    }

    /* renamed from: e */
    public final float mo3539e(long j, float f) {
        long j2 = j / 1000000;
        C0478n.C0479a a = this.f1231a.mo3557a(f);
        long j3 = a.f1224c;
        return (((Math.signum(a.f1222a) * C0389b.m1054a(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).f1005b) * a.f1223b) / ((float) a.f1224c)) * 1000.0f;
    }
}
