package androidx.constraintlayout.solver;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.constraintlayout.solver.C2188b;
import java.util.Arrays;
import java.util.Comparator;
import p194o0.C7508a;

/* renamed from: androidx.constraintlayout.solver.d */
public final class C2192d extends C2188b {

    /* renamed from: f */
    public SolverVariable[] f5094f = new SolverVariable[128];

    /* renamed from: g */
    public SolverVariable[] f5095g = new SolverVariable[128];

    /* renamed from: h */
    public int f5096h = 0;

    /* renamed from: i */
    public C2194b f5097i = new C2194b();

    /* renamed from: androidx.constraintlayout.solver.d$a */
    public class C2193a implements Comparator<SolverVariable> {
        public final int compare(Object obj, Object obj2) {
            return ((SolverVariable) obj).f5051b - ((SolverVariable) obj2).f5051b;
        }
    }

    /* renamed from: androidx.constraintlayout.solver.d$b */
    public class C2194b implements Comparable {

        /* renamed from: b */
        public SolverVariable f5098b;

        public C2194b() {
        }

        public final int compareTo(Object obj) {
            return this.f5098b.f5051b - ((SolverVariable) obj).f5051b;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f5098b != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder h = C0072d.m201h(str);
                    h.append(this.f5098b.f5057h[i]);
                    h.append(" ");
                    str = h.toString();
                }
            }
            StringBuilder k = C0073e.m211k(str, "] ");
            k.append(this.f5098b);
            return k.toString();
        }
    }

    public C2192d(C7508a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.SolverVariable mo8213a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f5096h
            if (r2 >= r4) goto L_0x0057
            androidx.constraintlayout.solver.SolverVariable[] r4 = r11.f5094f
            r5 = r4[r2]
            int r6 = r5.f5051b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            androidx.constraintlayout.solver.d$b r6 = r11.f5097i
            r6.f5098b = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r5 < 0) goto L_0x0032
            androidx.constraintlayout.solver.SolverVariable r4 = r6.f5098b
            float[] r4 = r4.f5057h
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0032:
            r7 = r1
        L_0x0033:
            if (r7 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r5 < 0) goto L_0x0050
            float[] r8 = r4.f5057h
            r8 = r8[r5]
            androidx.constraintlayout.solver.SolverVariable r9 = r6.f5098b
            float[] r9 = r9.f5057h
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r5 = r5 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            if (r7 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            androidx.constraintlayout.solver.SolverVariable[] r12 = r11.f5094f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C2192d.mo8213a(boolean[]):androidx.constraintlayout.solver.SolverVariable");
    }

    /* renamed from: e */
    public final boolean mo8217e() {
        return this.f5096h == 0;
    }

    /* renamed from: i */
    public final void mo8221i(C2190c cVar, C2188b bVar, boolean z) {
        C2188b bVar2 = bVar;
        SolverVariable solverVariable = bVar2.f5072a;
        if (solverVariable != null) {
            C2188b.C2189a aVar = bVar2.f5075d;
            int h = aVar.mo8208h();
            for (int i = 0; i < h; i++) {
                SolverVariable a = aVar.mo8200a(i);
                float i2 = aVar.mo8209i(i);
                C2194b bVar3 = this.f5097i;
                bVar3.f5098b = a;
                boolean z2 = true;
                if (a.f5050a) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar3.f5098b.f5057h;
                        float f = (solverVariable.f5057h[i3] * i2) + fArr[i3];
                        fArr[i3] = f;
                        if (Math.abs(f) < 1.0E-4f) {
                            bVar3.f5098b.f5057h[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        C2192d.this.mo8242k(bVar3.f5098b);
                    }
                    z2 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = solverVariable.f5057h[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * i2;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            bVar3.f5098b.f5057h[i4] = f3;
                        } else {
                            bVar3.f5098b.f5057h[i4] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    mo8241j(a);
                }
                this.f5073b = (bVar2.f5073b * i2) + this.f5073b;
            }
            mo8242k(solverVariable);
        }
    }

    /* renamed from: j */
    public final void mo8241j(SolverVariable solverVariable) {
        int i;
        int i2 = this.f5096h + 1;
        SolverVariable[] solverVariableArr = this.f5094f;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f5094f = solverVariableArr2;
            this.f5095g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f5094f;
        int i3 = this.f5096h;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f5096h = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f5051b > solverVariable.f5051b) {
            int i5 = 0;
            while (true) {
                i = this.f5096h;
                if (i5 >= i) {
                    break;
                }
                this.f5095g[i5] = this.f5094f[i5];
                i5++;
            }
            Arrays.sort(this.f5095g, 0, i, new C2193a());
            for (int i6 = 0; i6 < this.f5096h; i6++) {
                this.f5094f[i6] = this.f5095g[i6];
            }
        }
        solverVariable.f5050a = true;
        solverVariable.mo8194a(this);
    }

    /* renamed from: k */
    public final void mo8242k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f5096h) {
            if (this.f5094f[i] == solverVariable) {
                while (true) {
                    int i2 = this.f5096h;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f5094f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f5096h = i2 - 1;
                        solverVariable.f5050a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public final String toString() {
        StringBuilder k = C0073e.m211k("", " goal -> (");
        k.append(this.f5073b);
        k.append(") : ");
        String sb = k.toString();
        for (int i = 0; i < this.f5096h; i++) {
            this.f5097i.f5098b = this.f5094f[i];
            StringBuilder h = C0072d.m201h(sb);
            h.append(this.f5097i);
            h.append(" ");
            sb = h.toString();
        }
        return sb;
    }
}
