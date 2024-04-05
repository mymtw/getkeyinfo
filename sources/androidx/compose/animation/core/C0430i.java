package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;

/* renamed from: androidx.compose.animation.core.i */
public final class C0430i extends C0432j {

    /* renamed from: a */
    public float f1131a;

    /* renamed from: b */
    public float f1132b;

    /* renamed from: c */
    public float f1133c;

    /* renamed from: d */
    public float f1134d;

    /* renamed from: e */
    public final int f1135e = 4;

    public C0430i(float f, float f2, float f3, float f4) {
        this.f1131a = f;
        this.f1132b = f2;
        this.f1133c = f3;
        this.f1134d = f4;
    }

    /* renamed from: a */
    public final float mo3488a(int i) {
        if (i == 0) {
            return this.f1131a;
        }
        if (i == 1) {
            return this.f1132b;
        }
        if (i == 2) {
            return this.f1133c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f1134d;
    }

    /* renamed from: b */
    public final int mo3489b() {
        return this.f1135e;
    }

    /* renamed from: c */
    public final C0432j mo3490c() {
        return new C0430i(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: d */
    public final void mo3491d() {
        this.f1131a = 0.0f;
        this.f1132b = 0.0f;
        this.f1133c = 0.0f;
        this.f1134d = 0.0f;
    }

    /* renamed from: e */
    public final void mo3492e(float f, int i) {
        if (i == 0) {
            this.f1131a = f;
        } else if (i == 1) {
            this.f1132b = f;
        } else if (i == 2) {
            this.f1133c = f;
        } else if (i == 3) {
            this.f1134d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0430i) {
            C0430i iVar = (C0430i) obj;
            if (iVar.f1131a == this.f1131a) {
                if (iVar.f1132b == this.f1132b) {
                    if (iVar.f1133c == this.f1133c) {
                        if (iVar.f1134d == this.f1134d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1134d) + C0023f.m104c(this.f1133c, C0023f.m104c(this.f1132b, Float.hashCode(this.f1131a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnimationVector4D: v1 = ");
        h.append(this.f1131a);
        h.append(", v2 = ");
        h.append(this.f1132b);
        h.append(", v3 = ");
        h.append(this.f1133c);
        h.append(", v4 = ");
        h.append(this.f1134d);
        return h.toString();
    }
}
