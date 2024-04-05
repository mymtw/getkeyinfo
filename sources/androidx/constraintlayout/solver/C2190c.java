package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.Arrays;
import p194o0.C7508a;
import p194o0.C7510c;

/* renamed from: androidx.constraintlayout.solver.c */
public final class C2190c {

    /* renamed from: p */
    public static boolean f5077p = false;

    /* renamed from: q */
    public static int f5078q = 1000;

    /* renamed from: a */
    public boolean f5079a;

    /* renamed from: b */
    public int f5080b;

    /* renamed from: c */
    public C2192d f5081c;

    /* renamed from: d */
    public int f5082d;

    /* renamed from: e */
    public int f5083e;

    /* renamed from: f */
    public C2188b[] f5084f;

    /* renamed from: g */
    public boolean f5085g;

    /* renamed from: h */
    public boolean[] f5086h;

    /* renamed from: i */
    public int f5087i;

    /* renamed from: j */
    public int f5088j;

    /* renamed from: k */
    public int f5089k;

    /* renamed from: l */
    public final C7508a f5090l;

    /* renamed from: m */
    public SolverVariable[] f5091m;

    /* renamed from: n */
    public int f5092n;

    /* renamed from: o */
    public C2188b f5093o;

    /* renamed from: androidx.constraintlayout.solver.c$a */
    public interface C2191a {
        /* renamed from: a */
        SolverVariable mo8213a(boolean[] zArr);
    }

    public C2190c() {
        this.f5079a = false;
        this.f5080b = 0;
        this.f5082d = 32;
        this.f5083e = 32;
        this.f5084f = null;
        this.f5085g = false;
        this.f5086h = new boolean[32];
        this.f5087i = 1;
        this.f5088j = 0;
        this.f5089k = 32;
        this.f5091m = new SolverVariable[f5078q];
        this.f5092n = 0;
        this.f5084f = new C2188b[32];
        for (int i = 0; i < this.f5088j; i++) {
            C2188b bVar = this.f5084f[i];
            if (bVar != null) {
                this.f5090l.f16751a.mo19998a(bVar);
            }
            this.f5084f[i] = null;
        }
        C7508a aVar = new C7508a();
        this.f5090l = aVar;
        this.f5081c = new C2192d(aVar);
        this.f5093o = new C2188b(aVar);
    }

    /* renamed from: n */
    public static int m4718n(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f5108i;
        if (solverVariable != null) {
            return (int) (solverVariable.f5054e + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.SolverVariable mo8223a(androidx.constraintlayout.solver.SolverVariable.Type r6) {
        /*
            r5 = this;
            o0.a r0 = r5.f5090l
            o0.c r0 = r0.f16752b
            int r1 = r0.f16754b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object r3 = r0.f16755c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = r3[r1]
            r3[r1] = r2
            r0.f16754b = r1
            r2 = r4
        L_0x0016:
            androidx.constraintlayout.solver.SolverVariable r2 = (androidx.constraintlayout.solver.SolverVariable) r2
            if (r2 != 0) goto L_0x0022
            androidx.constraintlayout.solver.SolverVariable r2 = new androidx.constraintlayout.solver.SolverVariable
            r2.<init>(r6)
            r2.f5058i = r6
            goto L_0x0027
        L_0x0022:
            r2.mo8196c()
            r2.f5058i = r6
        L_0x0027:
            int r6 = r5.f5092n
            int r0 = f5078q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            f5078q = r0
            androidx.constraintlayout.solver.SolverVariable[] r6 = r5.f5091m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            androidx.constraintlayout.solver.SolverVariable[] r6 = (androidx.constraintlayout.solver.SolverVariable[]) r6
            r5.f5091m = r6
        L_0x003b:
            androidx.constraintlayout.solver.SolverVariable[] r6 = r5.f5091m
            int r0 = r5.f5092n
            int r1 = r0 + 1
            r5.f5092n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C2190c.mo8223a(androidx.constraintlayout.solver.SolverVariable$Type):androidx.constraintlayout.solver.SolverVariable");
    }

    /* renamed from: b */
    public final void mo8224b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C2188b l = mo8234l();
        if (solverVariable2 == solverVariable3) {
            l.f5075d.mo8206f(solverVariable, 1.0f);
            l.f5075d.mo8206f(solverVariable4, 1.0f);
            l.f5075d.mo8206f(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            l.f5075d.mo8206f(solverVariable, 1.0f);
            l.f5075d.mo8206f(solverVariable2, -1.0f);
            l.f5075d.mo8206f(solverVariable3, -1.0f);
            l.f5075d.mo8206f(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                l.f5073b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            l.f5075d.mo8206f(solverVariable, -1.0f);
            l.f5075d.mo8206f(solverVariable2, 1.0f);
            l.f5073b = (float) i;
        } else if (f >= 1.0f) {
            l.f5075d.mo8206f(solverVariable4, -1.0f);
            l.f5075d.mo8206f(solverVariable3, 1.0f);
            l.f5073b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            l.f5075d.mo8206f(solverVariable, f2 * 1.0f);
            l.f5075d.mo8206f(solverVariable2, f2 * -1.0f);
            l.f5075d.mo8206f(solverVariable3, -1.0f * f);
            l.f5075d.mo8206f(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.f5073b = (((float) i2) * f) + (((float) (-i)) * f2);
            }
        }
        if (i3 != 8) {
            l.mo8214b(this, i3);
        }
        mo8225c(l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r4.f5061l <= 1) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r4.f5061l <= 1) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e7, code lost:
        if (r4.f5061l <= 1) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f0, code lost:
        if (r4.f5061l <= 1) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01bc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8225c(androidx.constraintlayout.solver.C2188b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f5088j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f5089k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f5087i
            int r2 = r2 + r3
            int r4 = r0.f5083e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.mo8236o()
        L_0x0016:
            boolean r2 = r1.f5076e
            if (r2 != 0) goto L_0x01be
            androidx.constraintlayout.solver.b[] r2 = r0.f5084f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            androidx.constraintlayout.solver.b$a r6 = r1.f5075d
            int r6 = r6.mo8208h()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            androidx.constraintlayout.solver.b$a r8 = r1.f5075d
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mo8200a(r7)
            int r9 = r8.f5052c
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f5055f
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r9 = r1.f5074c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r6 = r1.f5074c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r8 = r1.f5074c
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.solver.SolverVariable r8 = (androidx.constraintlayout.solver.SolverVariable) r8
            boolean r9 = r8.f5055f
            if (r9 == 0) goto L_0x005f
            r1.mo8220h(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            androidx.constraintlayout.solver.b[] r9 = r0.f5084f
            int r8 = r8.f5052c
            r8 = r9[r8]
            r1.mo8221i(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r6 = r1.f5074c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            androidx.constraintlayout.solver.SolverVariable r2 = r1.f5072a
            if (r2 == 0) goto L_0x0083
            androidx.constraintlayout.solver.b$a r2 = r1.f5075d
            int r2 = r2.mo8208h()
            if (r2 != 0) goto L_0x0083
            r1.f5076e = r3
            r0.f5079a = r3
        L_0x0083:
            boolean r2 = r17.mo8217e()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f5073b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f5073b = r2
            androidx.constraintlayout.solver.b$a r2 = r1.f5075d
            r2.mo8201b()
        L_0x009b:
            androidx.constraintlayout.solver.b$a r2 = r1.f5075d
            int r2 = r2.mo8208h()
            r11 = r6
            r13 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x00a8:
            if (r8 >= r2) goto L_0x0107
            androidx.constraintlayout.solver.b$a r15 = r1.f5075d
            float r15 = r15.mo8209i(r8)
            androidx.constraintlayout.solver.b$a r4 = r1.f5075d
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mo8200a(r8)
            androidx.constraintlayout.solver.SolverVariable$Type r5 = r4.f5058i
            androidx.constraintlayout.solver.SolverVariable$Type r7 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r5 != r7) goto L_0x00dd
            if (r9 != 0) goto L_0x00c3
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00cc
            goto L_0x00d9
        L_0x00c3:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ce
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00cc
            goto L_0x00d9
        L_0x00cc:
            r12 = 0
            goto L_0x00da
        L_0x00ce:
            if (r12 != 0) goto L_0x0103
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00d6
            r5 = r3
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            if (r5 == 0) goto L_0x0103
        L_0x00d9:
            r12 = r3
        L_0x00da:
            r9 = r4
            r11 = r15
            goto L_0x0103
        L_0x00dd:
            if (r9 != 0) goto L_0x0103
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0103
            if (r10 != 0) goto L_0x00ea
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00f3
            goto L_0x0100
        L_0x00ea:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f5
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00f3
            goto L_0x0100
        L_0x00f3:
            r14 = 0
            goto L_0x0101
        L_0x00f5:
            if (r14 != 0) goto L_0x0103
            int r5 = r4.f5061l
            if (r5 > r3) goto L_0x00fd
            r5 = r3
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            if (r5 == 0) goto L_0x0103
        L_0x0100:
            r14 = r3
        L_0x0101:
            r10 = r4
            r13 = r15
        L_0x0103:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a8
        L_0x0107:
            if (r9 == 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r9 = r10
        L_0x010b:
            if (r9 != 0) goto L_0x010f
            r2 = r3
            goto L_0x0113
        L_0x010f:
            r1.mo8219g(r9)
            r2 = 0
        L_0x0113:
            androidx.constraintlayout.solver.b$a r4 = r1.f5075d
            int r4 = r4.mo8208h()
            if (r4 != 0) goto L_0x011d
            r1.f5076e = r3
        L_0x011d:
            if (r2 == 0) goto L_0x01a6
            int r2 = r0.f5087i
            int r2 = r2 + r3
            int r4 = r0.f5083e
            if (r2 < r4) goto L_0x0129
            r16.mo8236o()
        L_0x0129:
            androidx.constraintlayout.solver.SolverVariable$Type r2 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mo8223a(r2)
            int r4 = r0.f5080b
            int r4 = r4 + r3
            r0.f5080b = r4
            int r5 = r0.f5087i
            int r5 = r5 + r3
            r0.f5087i = r5
            r2.f5051b = r4
            o0.a r5 = r0.f5090l
            androidx.constraintlayout.solver.SolverVariable[] r5 = r5.f16753c
            r5[r4] = r2
            r1.f5072a = r2
            int r4 = r0.f5088j
            r16.mo8230h(r17)
            int r5 = r0.f5088j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01a6
            androidx.constraintlayout.solver.b r4 = r0.f5093o
            r4.getClass()
            r5 = 0
            r4.f5072a = r5
            androidx.constraintlayout.solver.b$a r5 = r4.f5075d
            r5.clear()
            r5 = 0
        L_0x015b:
            androidx.constraintlayout.solver.b$a r7 = r1.f5075d
            int r7 = r7.mo8208h()
            if (r5 >= r7) goto L_0x0177
            androidx.constraintlayout.solver.b$a r7 = r1.f5075d
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mo8200a(r5)
            androidx.constraintlayout.solver.b$a r8 = r1.f5075d
            float r8 = r8.mo8209i(r5)
            androidx.constraintlayout.solver.b$a r9 = r4.f5075d
            r9.mo8202c(r7, r8, r3)
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0177:
            androidx.constraintlayout.solver.b r4 = r0.f5093o
            r0.mo8239r(r4)
            int r4 = r2.f5052c
            r5 = -1
            if (r4 != r5) goto L_0x01a4
            androidx.constraintlayout.solver.SolverVariable r4 = r1.f5072a
            if (r4 != r2) goto L_0x018f
            r4 = 0
            androidx.constraintlayout.solver.SolverVariable r2 = r1.mo8218f(r4, r2)
            if (r2 == 0) goto L_0x018f
            r1.mo8219g(r2)
        L_0x018f:
            boolean r2 = r1.f5076e
            if (r2 != 0) goto L_0x0198
            androidx.constraintlayout.solver.SolverVariable r2 = r1.f5072a
            r2.mo8198e(r0, r1)
        L_0x0198:
            o0.a r2 = r0.f5090l
            o0.c r2 = r2.f16751a
            r2.mo19998a(r1)
            int r2 = r0.f5088j
            int r2 = r2 - r3
            r0.f5088j = r2
        L_0x01a4:
            r2 = r3
            goto L_0x01a7
        L_0x01a6:
            r2 = 0
        L_0x01a7:
            androidx.constraintlayout.solver.SolverVariable r4 = r1.f5072a
            if (r4 == 0) goto L_0x01b8
            androidx.constraintlayout.solver.SolverVariable$Type r4 = r4.f5058i
            androidx.constraintlayout.solver.SolverVariable$Type r5 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r4 == r5) goto L_0x01b9
            float r4 = r1.f5073b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            if (r3 != 0) goto L_0x01bc
            return
        L_0x01bc:
            r4 = r2
            goto L_0x01bf
        L_0x01be:
            r4 = 0
        L_0x01bf:
            if (r4 != 0) goto L_0x01c4
            r16.mo8230h(r17)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C2190c.mo8225c(androidx.constraintlayout.solver.b):void");
    }

    /* renamed from: d */
    public final void mo8226d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f5052c;
        if (i2 == -1) {
            solverVariable.mo8197d(this, (float) i);
            for (int i3 = 0; i3 < this.f5080b + 1; i3++) {
                SolverVariable solverVariable2 = this.f5090l.f16753c[i3];
            }
        } else if (i2 != -1) {
            C2188b bVar = this.f5084f[i2];
            if (bVar.f5076e) {
                bVar.f5073b = (float) i;
            } else if (bVar.f5075d.mo8208h() == 0) {
                bVar.f5076e = true;
                bVar.f5073b = (float) i;
            } else {
                C2188b l = mo8234l();
                if (i < 0) {
                    l.f5073b = (float) (i * -1);
                    l.f5075d.mo8206f(solverVariable, 1.0f);
                } else {
                    l.f5073b = (float) i;
                    l.f5075d.mo8206f(solverVariable, -1.0f);
                }
                mo8225c(l);
            }
        } else {
            C2188b l2 = mo8234l();
            l2.f5072a = solverVariable;
            float f = (float) i;
            solverVariable.f5054e = f;
            l2.f5073b = f;
            l2.f5076e = true;
            mo8225c(l2);
        }
    }

    /* renamed from: e */
    public final void mo8227e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f5055f && solverVariable.f5052c == -1) {
            solverVariable.mo8197d(this, solverVariable2.f5054e + ((float) i));
            return;
        }
        C2188b l = mo8234l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.f5073b = (float) i;
        }
        if (!z) {
            l.f5075d.mo8206f(solverVariable, -1.0f);
            l.f5075d.mo8206f(solverVariable2, 1.0f);
        } else {
            l.f5075d.mo8206f(solverVariable, 1.0f);
            l.f5075d.mo8206f(solverVariable2, -1.0f);
        }
        if (i2 != 8) {
            l.mo8214b(this, i2);
        }
        mo8225c(l);
    }

    /* renamed from: f */
    public final void mo8228f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C2188b l = mo8234l();
        SolverVariable m = mo8235m();
        m.f5053d = 0;
        l.mo8215c(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.f5075d.mo8206f(mo8232j(i2), (float) ((int) (l.f5075d.mo8204d(m) * -1.0f)));
        }
        mo8225c(l);
    }

    /* renamed from: g */
    public final void mo8229g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C2188b l = mo8234l();
        SolverVariable m = mo8235m();
        m.f5053d = 0;
        l.mo8216d(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.f5075d.mo8206f(mo8232j(i2), (float) ((int) (l.f5075d.mo8204d(m) * -1.0f)));
        }
        mo8225c(l);
    }

    /* renamed from: h */
    public final void mo8230h(C2188b bVar) {
        int i;
        if (bVar.f5076e) {
            bVar.f5072a.mo8197d(this, bVar.f5073b);
        } else {
            C2188b[] bVarArr = this.f5084f;
            int i2 = this.f5088j;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.f5072a;
            solverVariable.f5052c = i2;
            this.f5088j = i2 + 1;
            solverVariable.mo8198e(this, bVar);
        }
        if (this.f5079a) {
            int i3 = 0;
            while (i3 < this.f5088j) {
                if (this.f5084f[i3] == null) {
                    System.out.println("WTF");
                }
                C2188b bVar2 = this.f5084f[i3];
                if (bVar2 != null && bVar2.f5076e) {
                    bVar2.f5072a.mo8197d(this, bVar2.f5073b);
                    this.f5090l.f16751a.mo19998a(bVar2);
                    this.f5084f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f5088j;
                        if (i4 >= i) {
                            break;
                        }
                        C2188b[] bVarArr2 = this.f5084f;
                        int i6 = i4 - 1;
                        C2188b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f5072a;
                        if (solverVariable2.f5052c == i4) {
                            solverVariable2.f5052c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f5084f[i5] = null;
                    }
                    this.f5088j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f5079a = false;
        }
    }

    /* renamed from: i */
    public final void mo8231i() {
        for (int i = 0; i < this.f5088j; i++) {
            C2188b bVar = this.f5084f[i];
            bVar.f5072a.f5054e = bVar.f5073b;
        }
    }

    /* renamed from: j */
    public final SolverVariable mo8232j(int i) {
        if (this.f5087i + 1 >= this.f5083e) {
            mo8236o();
        }
        SolverVariable a = mo8223a(SolverVariable.Type.ERROR);
        int i2 = this.f5080b + 1;
        this.f5080b = i2;
        this.f5087i++;
        a.f5051b = i2;
        a.f5053d = i;
        this.f5090l.f16753c[i2] = a;
        C2192d dVar = this.f5081c;
        dVar.f5097i.f5098b = a;
        Arrays.fill(a.f5057h, 0.0f);
        a.f5057h[a.f5053d] = 1.0f;
        dVar.mo8241j(a);
        return a;
    }

    /* renamed from: k */
    public final SolverVariable mo8233k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f5087i + 1 >= this.f5083e) {
            mo8236o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f5108i;
            if (solverVariable == null) {
                constraintAnchor.mo8258k();
                solverVariable = constraintAnchor.f5108i;
            }
            int i = solverVariable.f5051b;
            if (i == -1 || i > this.f5080b || this.f5090l.f16753c[i] == null) {
                if (i != -1) {
                    solverVariable.mo8196c();
                }
                int i2 = this.f5080b + 1;
                this.f5080b = i2;
                this.f5087i++;
                solverVariable.f5051b = i2;
                solverVariable.f5058i = SolverVariable.Type.UNRESTRICTED;
                this.f5090l.f16753c[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.solver.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.C2188b mo8234l() {
        /*
            r6 = this;
            o0.a r0 = r6.f5090l
            o0.c r1 = r0.f16751a
            int r2 = r1.f16754b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object r4 = r1.f16755c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = r4[r2]
            r4[r2] = r3
            r1.f16754b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            androidx.constraintlayout.solver.b r5 = (androidx.constraintlayout.solver.C2188b) r5
            if (r5 != 0) goto L_0x0021
            androidx.constraintlayout.solver.b r5 = new androidx.constraintlayout.solver.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f5072a = r3
            androidx.constraintlayout.solver.b$a r0 = r5.f5075d
            r0.clear()
            r0 = 0
            r5.f5073b = r0
            r0 = 0
            r5.f5076e = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C2190c.mo8234l():androidx.constraintlayout.solver.b");
    }

    /* renamed from: m */
    public final SolverVariable mo8235m() {
        if (this.f5087i + 1 >= this.f5083e) {
            mo8236o();
        }
        SolverVariable a = mo8223a(SolverVariable.Type.SLACK);
        int i = this.f5080b + 1;
        this.f5080b = i;
        this.f5087i++;
        a.f5051b = i;
        this.f5090l.f16753c[i] = a;
        return a;
    }

    /* renamed from: o */
    public final void mo8236o() {
        int i = this.f5082d * 2;
        this.f5082d = i;
        this.f5084f = (C2188b[]) Arrays.copyOf(this.f5084f, i);
        C7508a aVar = this.f5090l;
        aVar.f16753c = (SolverVariable[]) Arrays.copyOf(aVar.f16753c, this.f5082d);
        int i2 = this.f5082d;
        this.f5086h = new boolean[i2];
        this.f5083e = i2;
        this.f5089k = i2;
    }

    /* renamed from: p */
    public final void mo8237p() throws Exception {
        if (this.f5081c.mo8217e()) {
            mo8231i();
        } else if (this.f5085g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f5088j) {
                    z = true;
                    break;
                } else if (!this.f5084f[i].f5076e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo8238q(this.f5081c);
            } else {
                mo8231i();
            }
        } else {
            mo8238q(this.f5081c);
        }
    }

    /* renamed from: q */
    public final void mo8238q(C2192d dVar) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f5088j) {
                z = false;
                break;
            }
            C2188b bVar = this.f5084f[i2];
            if (bVar.f5072a.f5058i != SolverVariable.Type.UNRESTRICTED && bVar.f5073b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f5088j) {
                    C2188b bVar2 = this.f5084f[i6];
                    if (bVar2.f5072a.f5058i != SolverVariable.Type.UNRESTRICTED && !bVar2.f5076e && bVar2.f5073b < f) {
                        int h = bVar2.f5075d.mo8208h();
                        int i8 = 0;
                        while (i8 < h) {
                            SolverVariable a = bVar2.f5075d.mo8200a(i8);
                            float d = bVar2.f5075d.mo8204d(a);
                            if (d > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = a.f5056g[i9] / d;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = a.f5051b;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C2188b bVar3 = this.f5084f[i4];
                    bVar3.f5072a.f5052c = -1;
                    bVar3.mo8219g(this.f5090l.f16753c[i5]);
                    SolverVariable solverVariable = bVar3.f5072a;
                    solverVariable.f5052c = i4;
                    solverVariable.mo8198e(this, bVar3);
                } else {
                    z2 = true;
                }
                if (i3 > this.f5087i / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        mo8239r(dVar);
        mo8231i();
    }

    /* renamed from: r */
    public final void mo8239r(C2188b bVar) {
        for (int i = 0; i < this.f5087i; i++) {
            this.f5086h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 < this.f5087i * 2) {
                SolverVariable solverVariable = bVar.f5072a;
                if (solverVariable != null) {
                    this.f5086h[solverVariable.f5051b] = true;
                }
                SolverVariable a = bVar.mo8213a(this.f5086h);
                if (a != null) {
                    boolean[] zArr = this.f5086h;
                    int i3 = a.f5051b;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    } else {
                        return;
                    }
                }
                if (a != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.f5088j; i5++) {
                        C2188b bVar2 = this.f5084f[i5];
                        if (bVar2.f5072a.f5058i != SolverVariable.Type.UNRESTRICTED && !bVar2.f5076e && bVar2.f5075d.mo8210j(a)) {
                            float d = bVar2.f5075d.mo8204d(a);
                            if (d < 0.0f) {
                                float f2 = (-bVar2.f5073b) / d;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C2188b bVar3 = this.f5084f[i4];
                        bVar3.f5072a.f5052c = -1;
                        bVar3.mo8219g(a);
                        SolverVariable solverVariable2 = bVar3.f5072a;
                        solverVariable2.f5052c = i4;
                        solverVariable2.mo8198e(this, bVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo8240s() {
        C7508a aVar;
        int i = 0;
        while (true) {
            aVar = this.f5090l;
            SolverVariable[] solverVariableArr = aVar.f16753c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.mo8196c();
            }
            i++;
        }
        C7510c cVar = aVar.f16752b;
        SolverVariable[] solverVariableArr2 = this.f5091m;
        int i2 = this.f5092n;
        cVar.getClass();
        if (i2 > solverVariableArr2.length) {
            i2 = solverVariableArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariable2 = solverVariableArr2[i3];
            int i4 = cVar.f16754b;
            Object[] objArr = (Object[]) cVar.f16755c;
            if (i4 < objArr.length) {
                objArr[i4] = solverVariable2;
                cVar.f16754b = i4 + 1;
            }
        }
        this.f5092n = 0;
        Arrays.fill(this.f5090l.f16753c, (Object) null);
        this.f5080b = 0;
        C2192d dVar = this.f5081c;
        dVar.f5096h = 0;
        dVar.f5073b = 0.0f;
        this.f5087i = 1;
        for (int i5 = 0; i5 < this.f5088j; i5++) {
            C2188b bVar = this.f5084f[i5];
        }
        for (int i6 = 0; i6 < this.f5088j; i6++) {
            C2188b bVar2 = this.f5084f[i6];
            if (bVar2 != null) {
                this.f5090l.f16751a.mo19998a(bVar2);
            }
            this.f5084f[i6] = null;
        }
        this.f5088j = 0;
        this.f5093o = new C2188b(this.f5090l);
    }
}
