package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C2188b;
import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
public final class C2223f extends ConstraintWidget {

    /* renamed from: p0 */
    public float f5323p0 = -1.0f;

    /* renamed from: q0 */
    public int f5324q0 = -1;

    /* renamed from: r0 */
    public int f5325r0 = -1;

    /* renamed from: s0 */
    public ConstraintAnchor f5326s0 = this.f5115F;

    /* renamed from: t0 */
    public int f5327t0;

    /* renamed from: u0 */
    public boolean f5328u0;

    /* renamed from: androidx.constraintlayout.solver.widgets.f$a */
    public static /* synthetic */ class C2224a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5329a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5329a = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5329a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C2223f.C2224a.<clinit>():void");
        }
    }

    public C2223f() {
        this.f5327t0 = 0;
        this.f5123N.clear();
        this.f5123N.add(this.f5326s0);
        int length = this.f5122M.length;
        for (int i = 0; i < length; i++) {
            this.f5122M[i] = this.f5326s0;
        }
    }

    /* renamed from: A */
    public final boolean mo8261A() {
        return this.f5328u0;
    }

    /* renamed from: B */
    public final boolean mo8262B() {
        return this.f5328u0;
    }

    /* renamed from: N */
    public final void mo8274N(C2190c cVar, boolean z) {
        if (this.f5126Q != null) {
            ConstraintAnchor constraintAnchor = this.f5326s0;
            cVar.getClass();
            int n = C2190c.m4718n(constraintAnchor);
            if (this.f5327t0 == 1) {
                this.f5131V = n;
                this.f5132W = 0;
                mo8269I(this.f5126Q.mo8286o());
                mo8272L(0);
                return;
            }
            this.f5131V = 0;
            this.f5132W = n;
            mo8272L(this.f5126Q.mo8289r());
            mo8269I(0);
        }
    }

    /* renamed from: O */
    public final void mo8353O(int i) {
        this.f5326s0.mo8259l(i);
        this.f5328u0 = true;
    }

    /* renamed from: P */
    public final void mo8354P(int i) {
        if (this.f5327t0 != i) {
            this.f5327t0 = i;
            this.f5123N.clear();
            if (this.f5327t0 == 1) {
                this.f5326s0 = this.f5114E;
            } else {
                this.f5326s0 = this.f5115F;
            }
            this.f5123N.add(this.f5326s0);
            int length = this.f5122M.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f5122M[i2] = this.f5326s0;
            }
        }
    }

    /* renamed from: e */
    public final void mo8276e(C2190c cVar, boolean z) {
        C2220d dVar = (C2220d) this.f5126Q;
        if (dVar != null) {
            ConstraintAnchor m = dVar.mo8284m(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor m2 = dVar.mo8284m(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f5126Q;
            boolean z2 = true;
            boolean z3 = constraintWidget != null && constraintWidget.f5125P[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.f5327t0 == 0) {
                m = dVar.mo8284m(ConstraintAnchor.Type.TOP);
                m2 = dVar.mo8284m(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f5126Q;
                if (constraintWidget2 == null || constraintWidget2.f5125P[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f5328u0) {
                ConstraintAnchor constraintAnchor = this.f5326s0;
                if (constraintAnchor.f5102c) {
                    SolverVariable k = cVar.mo8233k(constraintAnchor);
                    cVar.mo8226d(k, this.f5326s0.mo8251d());
                    if (this.f5324q0 != -1) {
                        if (z3) {
                            cVar.mo8228f(cVar.mo8233k(m2), k, 0, 5);
                        }
                    } else if (this.f5325r0 != -1 && z3) {
                        SolverVariable k2 = cVar.mo8233k(m2);
                        cVar.mo8228f(k, cVar.mo8233k(m), 0, 5);
                        cVar.mo8228f(k2, k, 0, 5);
                    }
                    this.f5328u0 = false;
                    return;
                }
            }
            if (this.f5324q0 != -1) {
                SolverVariable k3 = cVar.mo8233k(this.f5326s0);
                cVar.mo8227e(k3, cVar.mo8233k(m), this.f5324q0, 8);
                if (z3) {
                    cVar.mo8228f(cVar.mo8233k(m2), k3, 0, 5);
                }
            } else if (this.f5325r0 != -1) {
                SolverVariable k4 = cVar.mo8233k(this.f5326s0);
                SolverVariable k5 = cVar.mo8233k(m2);
                cVar.mo8227e(k4, k5, -this.f5325r0, 8);
                if (z3) {
                    cVar.mo8228f(k4, cVar.mo8233k(m), 0, 5);
                    cVar.mo8228f(k5, k4, 0, 5);
                }
            } else if (this.f5323p0 != -1.0f) {
                SolverVariable k6 = cVar.mo8233k(this.f5326s0);
                SolverVariable k7 = cVar.mo8233k(m2);
                float f = this.f5323p0;
                C2188b l = cVar.mo8234l();
                l.f5075d.mo8206f(k6, -1.0f);
                l.f5075d.mo8206f(k7, f);
                cVar.mo8225c(l);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo8277f() {
        return true;
    }

    /* renamed from: j */
    public final void mo8281j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo8281j(constraintWidget, hashMap);
        C2223f fVar = (C2223f) constraintWidget;
        this.f5323p0 = fVar.f5323p0;
        this.f5324q0 = fVar.f5324q0;
        this.f5325r0 = fVar.f5325r0;
        mo8354P(fVar.f5327t0);
    }

    /* renamed from: m */
    public final ConstraintAnchor mo8284m(ConstraintAnchor.Type type) {
        switch (C2224a.f5329a[type.ordinal()]) {
            case 1:
            case 2:
                if (this.f5327t0 == 1) {
                    return this.f5326s0;
                }
                break;
            case 3:
            case 4:
                if (this.f5327t0 == 0) {
                    return this.f5326s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(type.name());
    }
}
