package androidx.constraintlayout.solver;

import android.support.p013v4.media.C0072d;
import java.util.Arrays;

public final class SolverVariable {

    /* renamed from: a */
    public boolean f5050a;

    /* renamed from: b */
    public int f5051b = -1;

    /* renamed from: c */
    public int f5052c = -1;

    /* renamed from: d */
    public int f5053d = 0;

    /* renamed from: e */
    public float f5054e;

    /* renamed from: f */
    public boolean f5055f = false;

    /* renamed from: g */
    public float[] f5056g = new float[9];

    /* renamed from: h */
    public float[] f5057h = new float[9];

    /* renamed from: i */
    public Type f5058i;

    /* renamed from: j */
    public C2188b[] f5059j = new C2188b[16];

    /* renamed from: k */
    public int f5060k = 0;

    /* renamed from: l */
    public int f5061l = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f5058i = type;
    }

    /* renamed from: a */
    public final void mo8194a(C2188b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f5060k;
            if (i >= i2) {
                C2188b[] bVarArr = this.f5059j;
                if (i2 >= bVarArr.length) {
                    this.f5059j = (C2188b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C2188b[] bVarArr2 = this.f5059j;
                int i3 = this.f5060k;
                bVarArr2[i3] = bVar;
                this.f5060k = i3 + 1;
                return;
            } else if (this.f5059j[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo8195b(C2188b bVar) {
        int i = this.f5060k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f5059j[i2] == bVar) {
                while (i2 < i - 1) {
                    C2188b[] bVarArr = this.f5059j;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f5060k--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo8196c() {
        this.f5058i = Type.UNKNOWN;
        this.f5053d = 0;
        this.f5051b = -1;
        this.f5052c = -1;
        this.f5054e = 0.0f;
        this.f5055f = false;
        int i = this.f5060k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5059j[i2] = null;
        }
        this.f5060k = 0;
        this.f5061l = 0;
        this.f5050a = false;
        Arrays.fill(this.f5057h, 0.0f);
    }

    /* renamed from: d */
    public final void mo8197d(C2190c cVar, float f) {
        this.f5054e = f;
        this.f5055f = true;
        int i = this.f5060k;
        this.f5052c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5059j[i2].mo8220h(cVar, this, false);
        }
        this.f5060k = 0;
    }

    /* renamed from: e */
    public final void mo8198e(C2190c cVar, C2188b bVar) {
        int i = this.f5060k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5059j[i2].mo8221i(cVar, bVar, false);
        }
        this.f5060k = 0;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("");
        h.append(this.f5051b);
        return h.toString();
    }
}
