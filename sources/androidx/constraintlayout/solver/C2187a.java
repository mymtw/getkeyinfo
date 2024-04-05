package androidx.constraintlayout.solver;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.solver.C2188b;
import java.util.Arrays;
import p194o0.C7508a;

/* renamed from: androidx.constraintlayout.solver.a */
public final class C2187a implements C2188b.C2189a {

    /* renamed from: a */
    public int f5062a = 0;

    /* renamed from: b */
    public final C2188b f5063b;

    /* renamed from: c */
    public final C7508a f5064c;

    /* renamed from: d */
    public int f5065d = 8;

    /* renamed from: e */
    public int[] f5066e = new int[8];

    /* renamed from: f */
    public int[] f5067f = new int[8];

    /* renamed from: g */
    public float[] f5068g = new float[8];

    /* renamed from: h */
    public int f5069h = -1;

    /* renamed from: i */
    public int f5070i = -1;

    /* renamed from: j */
    public boolean f5071j = false;

    public C2187a(C2188b bVar, C7508a aVar) {
        this.f5063b = bVar;
        this.f5064c = aVar;
    }

    /* renamed from: a */
    public final SolverVariable mo8200a(int i) {
        int i2 = this.f5069h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5062a) {
            if (i3 == i) {
                return this.f5064c.f16753c[this.f5066e[i2]];
            }
            i2 = this.f5067f[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo8201b() {
        int i = this.f5069h;
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            float[] fArr = this.f5068g;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f5067f[i];
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo8202c(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f5069h;
            if (i == -1) {
                this.f5069h = 0;
                this.f5068g[0] = f;
                this.f5066e[0] = solverVariable.f5051b;
                this.f5067f[0] = -1;
                solverVariable.f5061l++;
                solverVariable.mo8194a(this.f5063b);
                this.f5062a++;
                if (!this.f5071j) {
                    int i2 = this.f5070i + 1;
                    this.f5070i = i2;
                    int[] iArr = this.f5066e;
                    if (i2 >= iArr.length) {
                        this.f5071j = true;
                        this.f5070i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f5062a) {
                int i5 = this.f5066e[i];
                int i6 = solverVariable.f5051b;
                if (i5 == i6) {
                    float[] fArr = this.f5068g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f5069h) {
                            this.f5069h = this.f5067f[i];
                        } else {
                            int[] iArr2 = this.f5067f;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.mo8195b(this.f5063b);
                        }
                        if (this.f5071j) {
                            this.f5070i = i;
                        }
                        solverVariable.f5061l--;
                        this.f5062a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f5067f[i];
                i3++;
            }
            int i7 = this.f5070i;
            int i8 = i7 + 1;
            if (this.f5071j) {
                int[] iArr3 = this.f5066e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f5066e;
            if (i7 >= iArr4.length && this.f5062a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f5066e;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f5066e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f5065d * 2;
                this.f5065d = i10;
                this.f5071j = false;
                this.f5070i = i7 - 1;
                this.f5068g = Arrays.copyOf(this.f5068g, i10);
                this.f5066e = Arrays.copyOf(this.f5066e, this.f5065d);
                this.f5067f = Arrays.copyOf(this.f5067f, this.f5065d);
            }
            this.f5066e[i7] = solverVariable.f5051b;
            this.f5068g[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f5067f;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f5067f[i7] = this.f5069h;
                this.f5069h = i7;
            }
            solverVariable.f5061l++;
            solverVariable.mo8194a(this.f5063b);
            this.f5062a++;
            if (!this.f5071j) {
                this.f5070i++;
            }
            int i11 = this.f5070i;
            int[] iArr8 = this.f5066e;
            if (i11 >= iArr8.length) {
                this.f5071j = true;
                this.f5070i = iArr8.length - 1;
            }
        }
    }

    public final void clear() {
        int i = this.f5069h;
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            SolverVariable solverVariable = this.f5064c.f16753c[this.f5066e[i]];
            if (solverVariable != null) {
                solverVariable.mo8195b(this.f5063b);
            }
            i = this.f5067f[i];
            i2++;
        }
        this.f5069h = -1;
        this.f5070i = -1;
        this.f5071j = false;
        this.f5062a = 0;
    }

    /* renamed from: d */
    public final float mo8204d(SolverVariable solverVariable) {
        int i = this.f5069h;
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            if (this.f5066e[i] == solverVariable.f5051b) {
                return this.f5068g[i];
            }
            i = this.f5067f[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final float mo8205e(C2188b bVar, boolean z) {
        float d = mo8204d(bVar.f5072a);
        mo8207g(bVar.f5072a, z);
        C2188b.C2189a aVar = bVar.f5075d;
        int h = aVar.mo8208h();
        for (int i = 0; i < h; i++) {
            SolverVariable a = aVar.mo8200a(i);
            mo8202c(a, aVar.mo8204d(a) * d, z);
        }
        return d;
    }

    /* renamed from: f */
    public final void mo8206f(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            mo8207g(solverVariable, true);
            return;
        }
        int i = this.f5069h;
        if (i == -1) {
            this.f5069h = 0;
            this.f5068g[0] = f;
            this.f5066e[0] = solverVariable.f5051b;
            this.f5067f[0] = -1;
            solverVariable.f5061l++;
            solverVariable.mo8194a(this.f5063b);
            this.f5062a++;
            if (!this.f5071j) {
                int i2 = this.f5070i + 1;
                this.f5070i = i2;
                int[] iArr = this.f5066e;
                if (i2 >= iArr.length) {
                    this.f5071j = true;
                    this.f5070i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f5062a) {
            int i5 = this.f5066e[i];
            int i6 = solverVariable.f5051b;
            if (i5 == i6) {
                this.f5068g[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f5067f[i];
            i3++;
        }
        int i7 = this.f5070i;
        int i8 = i7 + 1;
        if (this.f5071j) {
            int[] iArr2 = this.f5066e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f5066e;
        if (i7 >= iArr3.length && this.f5062a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f5066e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f5066e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f5065d * 2;
            this.f5065d = i10;
            this.f5071j = false;
            this.f5070i = i7 - 1;
            this.f5068g = Arrays.copyOf(this.f5068g, i10);
            this.f5066e = Arrays.copyOf(this.f5066e, this.f5065d);
            this.f5067f = Arrays.copyOf(this.f5067f, this.f5065d);
        }
        this.f5066e[i7] = solverVariable.f5051b;
        this.f5068g[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f5067f;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f5067f[i7] = this.f5069h;
            this.f5069h = i7;
        }
        solverVariable.f5061l++;
        solverVariable.mo8194a(this.f5063b);
        int i11 = this.f5062a + 1;
        this.f5062a = i11;
        if (!this.f5071j) {
            this.f5070i++;
        }
        int[] iArr7 = this.f5066e;
        if (i11 >= iArr7.length) {
            this.f5071j = true;
        }
        if (this.f5070i >= iArr7.length) {
            this.f5071j = true;
            this.f5070i = iArr7.length - 1;
        }
    }

    /* renamed from: g */
    public final float mo8207g(SolverVariable solverVariable, boolean z) {
        int i = this.f5069h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f5062a) {
            if (this.f5066e[i] == solverVariable.f5051b) {
                if (i == this.f5069h) {
                    this.f5069h = this.f5067f[i];
                } else {
                    int[] iArr = this.f5067f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo8195b(this.f5063b);
                }
                solverVariable.f5061l--;
                this.f5062a--;
                this.f5066e[i] = -1;
                if (this.f5071j) {
                    this.f5070i = i;
                }
                return this.f5068g[i];
            }
            i2++;
            i3 = i;
            i = this.f5067f[i];
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final int mo8208h() {
        return this.f5062a;
    }

    /* renamed from: i */
    public final float mo8209i(int i) {
        int i2 = this.f5069h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5062a) {
            if (i3 == i) {
                return this.f5068g[i2];
            }
            i2 = this.f5067f[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final boolean mo8210j(SolverVariable solverVariable) {
        int i = this.f5069h;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            if (this.f5066e[i] == solverVariable.f5051b) {
                return true;
            }
            i = this.f5067f[i];
            i2++;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo8211k(float f) {
        int i = this.f5069h;
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            float[] fArr = this.f5068g;
            fArr[i] = fArr[i] / f;
            i = this.f5067f[i];
            i2++;
        }
    }

    public final String toString() {
        int i = this.f5069h;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f5062a) {
            StringBuilder h = C0072d.m201h(C0326j.m864i(str, " -> "));
            h.append(this.f5068g[i]);
            h.append(" : ");
            StringBuilder h2 = C0072d.m201h(h.toString());
            h2.append(this.f5064c.f16753c[this.f5066e[i]]);
            str = h2.toString();
            i = this.f5067f[i];
            i2++;
        }
        return str;
    }
}
