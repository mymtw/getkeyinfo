package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import p194o0.C7508a;

/* renamed from: androidx.constraintlayout.solver.b */
public class C2188b implements C2190c.C2191a {

    /* renamed from: a */
    public SolverVariable f5072a = null;

    /* renamed from: b */
    public float f5073b = 0.0f;

    /* renamed from: c */
    public ArrayList<SolverVariable> f5074c = new ArrayList<>();

    /* renamed from: d */
    public C2189a f5075d;

    /* renamed from: e */
    public boolean f5076e = false;

    /* renamed from: androidx.constraintlayout.solver.b$a */
    public interface C2189a {
        /* renamed from: a */
        SolverVariable mo8200a(int i);

        /* renamed from: b */
        void mo8201b();

        /* renamed from: c */
        void mo8202c(SolverVariable solverVariable, float f, boolean z);

        void clear();

        /* renamed from: d */
        float mo8204d(SolverVariable solverVariable);

        /* renamed from: e */
        float mo8205e(C2188b bVar, boolean z);

        /* renamed from: f */
        void mo8206f(SolverVariable solverVariable, float f);

        /* renamed from: g */
        float mo8207g(SolverVariable solverVariable, boolean z);

        /* renamed from: h */
        int mo8208h();

        /* renamed from: i */
        float mo8209i(int i);

        /* renamed from: j */
        boolean mo8210j(SolverVariable solverVariable);

        /* renamed from: k */
        void mo8211k(float f);
    }

    public C2188b() {
    }

    /* renamed from: a */
    public SolverVariable mo8213a(boolean[] zArr) {
        return mo8218f(zArr, (SolverVariable) null);
    }

    /* renamed from: b */
    public final void mo8214b(C2190c cVar, int i) {
        this.f5075d.mo8206f(cVar.mo8232j(i), 1.0f);
        this.f5075d.mo8206f(cVar.mo8232j(i), -1.0f);
    }

    /* renamed from: c */
    public final void mo8215c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f5073b = (float) i;
        }
        if (!z) {
            this.f5075d.mo8206f(solverVariable, -1.0f);
            this.f5075d.mo8206f(solverVariable2, 1.0f);
            this.f5075d.mo8206f(solverVariable3, 1.0f);
            return;
        }
        this.f5075d.mo8206f(solverVariable, 1.0f);
        this.f5075d.mo8206f(solverVariable2, -1.0f);
        this.f5075d.mo8206f(solverVariable3, -1.0f);
    }

    /* renamed from: d */
    public final void mo8216d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f5073b = (float) i;
        }
        if (!z) {
            this.f5075d.mo8206f(solverVariable, -1.0f);
            this.f5075d.mo8206f(solverVariable2, 1.0f);
            this.f5075d.mo8206f(solverVariable3, -1.0f);
            return;
        }
        this.f5075d.mo8206f(solverVariable, 1.0f);
        this.f5075d.mo8206f(solverVariable2, -1.0f);
        this.f5075d.mo8206f(solverVariable3, 1.0f);
    }

    /* renamed from: e */
    public boolean mo8217e() {
        return this.f5072a == null && this.f5073b == 0.0f && this.f5075d.mo8208h() == 0;
    }

    /* renamed from: f */
    public final SolverVariable mo8218f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int h = this.f5075d.mo8208h();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < h; i++) {
            float i2 = this.f5075d.mo8209i(i);
            if (i2 < 0.0f) {
                SolverVariable a = this.f5075d.mo8200a(i);
                if ((zArr == null || !zArr[a.f5051b]) && a != solverVariable && (((type = a.f5058i) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && i2 < f)) {
                    f = i2;
                    solverVariable2 = a;
                }
            }
        }
        return solverVariable2;
    }

    /* renamed from: g */
    public final void mo8219g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f5072a;
        if (solverVariable2 != null) {
            this.f5075d.mo8206f(solverVariable2, -1.0f);
            this.f5072a.f5052c = -1;
            this.f5072a = null;
        }
        float g = this.f5075d.mo8207g(solverVariable, true) * -1.0f;
        this.f5072a = solverVariable;
        if (g != 1.0f) {
            this.f5073b /= g;
            this.f5075d.mo8211k(g);
        }
    }

    /* renamed from: h */
    public final void mo8220h(C2190c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f5055f) {
            float d = this.f5075d.mo8204d(solverVariable);
            this.f5073b = (solverVariable.f5054e * d) + this.f5073b;
            this.f5075d.mo8207g(solverVariable, z);
            if (z) {
                solverVariable.mo8195b(this);
            }
            if (this.f5075d.mo8208h() == 0) {
                this.f5076e = true;
                cVar.f5079a = true;
            }
        }
    }

    /* renamed from: i */
    public void mo8221i(C2190c cVar, C2188b bVar, boolean z) {
        float e = this.f5075d.mo8205e(bVar, z);
        this.f5073b = (bVar.f5073b * e) + this.f5073b;
        if (z) {
            bVar.f5072a.mo8195b(this);
        }
        if (this.f5072a != null && this.f5075d.mo8208h() == 0) {
            this.f5076e = true;
            cVar.f5079a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r10.f5072a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            androidx.constraintlayout.solver.SolverVariable r1 = r10.f5072a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
            float r1 = r10.f5073b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            float r1 = r10.f5073b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            androidx.constraintlayout.solver.b$a r5 = r10.f5075d
            int r5 = r5.mo8208h()
        L_0x003b:
            if (r3 >= r5) goto L_0x009a
            androidx.constraintlayout.solver.b$a r6 = r10.f5075d
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mo8200a(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            androidx.constraintlayout.solver.b$a r7 = r10.f5075d
            float r7 = r7.mo8209i(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
            goto L_0x0073
        L_0x0064:
            if (r8 <= 0) goto L_0x006d
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
        L_0x0073:
            float r7 = r7 * r9
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r6)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = r4
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C2188b.toString():java.lang.String");
    }

    public C2188b(C7508a aVar) {
        this.f5075d = new C2187a(this, aVar);
    }
}
