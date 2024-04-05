package p594jh;

import com.facebook.login.LoginStatusClient;
import p594jh.C17939k1;

/* renamed from: jh.i */
public class C17919i implements C17915h {

    /* renamed from: a */
    public final C17939k1.C17942c f38941a;

    /* renamed from: b */
    public long f38942b;

    /* renamed from: c */
    public long f38943c;

    public C17919i() {
        this(15000, LoginStatusClient.DEFAULT_TOAST_DURATION_MS);
    }

    /* renamed from: m */
    public static void m30150m(C17884a1 a1Var, long j) {
        long currentPosition = a1Var.getCurrentPosition() + j;
        long duration = a1Var.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a1Var.mo69347w(a1Var.mo69327j(), Math.max(currentPosition, 0));
    }

    /* renamed from: a */
    public final void mo69374a(C17884a1 a1Var) {
        if (mo69379f() && a1Var.mo69324h()) {
            m30150m(a1Var, -this.f38942b);
        }
    }

    /* renamed from: b */
    public final void mo69375b(C17884a1 a1Var) {
        a1Var.prepare();
    }

    /* renamed from: c */
    public final void mo69376c(C17884a1 a1Var) {
        C17939k1 r = a1Var.mo69338r();
        if (!r.mo69481p() && !a1Var.mo69317d()) {
            int j = a1Var.mo69327j();
            r.mo69480m(j, this.f38941a);
            int F = a1Var.mo69305F();
            boolean z = this.f38941a.mo69487a() && !this.f38941a.f39114h;
            if (F != -1 && (a1Var.getCurrentPosition() <= 3000 || z)) {
                a1Var.mo69347w(F, -9223372036854775807L);
            } else if (!z) {
                a1Var.mo69347w(j, 0);
            }
        }
    }

    /* renamed from: d */
    public final void mo69377d(C17884a1 a1Var, C17986y0 y0Var) {
        a1Var.mo69315b(y0Var);
    }

    /* renamed from: e */
    public final void mo69378e(C17884a1 a1Var, boolean z) {
        a1Var.mo69349y(z);
    }

    /* renamed from: f */
    public final boolean mo69379f() {
        return this.f38942b > 0;
    }

    /* renamed from: g */
    public final void mo69380g(C17884a1 a1Var) {
        if (mo69383l() && a1Var.mo69324h()) {
            m30150m(a1Var, this.f38943c);
        }
    }

    /* renamed from: h */
    public void mo32478h(C17884a1 a1Var, boolean z) {
        a1Var.mo69329l(z);
    }

    /* renamed from: i */
    public void mo32479i(C17884a1 a1Var, int i, long j) {
        a1Var.mo69347w(i, j);
    }

    /* renamed from: j */
    public final void mo69381j(C17884a1 a1Var, int i) {
        a1Var.setRepeatMode(i);
    }

    /* renamed from: k */
    public final void mo69382k(C17884a1 a1Var) {
        C17939k1 r = a1Var.mo69338r();
        if (!r.mo69481p() && !a1Var.mo69317d()) {
            int j = a1Var.mo69327j();
            r.mo69480m(j, this.f38941a);
            int I = a1Var.mo69308I();
            if (I != -1) {
                a1Var.mo69347w(I, -9223372036854775807L);
            } else if (this.f38941a.mo69487a() && this.f38941a.f39115i) {
                a1Var.mo69347w(j, -9223372036854775807L);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo69383l() {
        return this.f38943c > 0;
    }

    public C17919i(long j, long j2) {
        this.f38943c = j;
        this.f38942b = j2;
        this.f38941a = new C17939k1.C17942c();
    }
}
