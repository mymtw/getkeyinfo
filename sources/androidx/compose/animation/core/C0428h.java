package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;

/* renamed from: androidx.compose.animation.core.h */
public final class C0428h extends C0432j {

    /* renamed from: a */
    public float f1125a;

    /* renamed from: b */
    public float f1126b;

    /* renamed from: c */
    public final int f1127c = 2;

    public C0428h(float f, float f2) {
        this.f1125a = f;
        this.f1126b = f2;
    }

    /* renamed from: a */
    public final float mo3488a(int i) {
        if (i == 0) {
            return this.f1125a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f1126b;
    }

    /* renamed from: b */
    public final int mo3489b() {
        return this.f1127c;
    }

    /* renamed from: c */
    public final C0432j mo3490c() {
        return new C0428h(0.0f, 0.0f);
    }

    /* renamed from: d */
    public final void mo3491d() {
        this.f1125a = 0.0f;
        this.f1126b = 0.0f;
    }

    /* renamed from: e */
    public final void mo3492e(float f, int i) {
        if (i == 0) {
            this.f1125a = f;
        } else if (i == 1) {
            this.f1126b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0428h) {
            C0428h hVar = (C0428h) obj;
            if (hVar.f1125a == this.f1125a) {
                if (hVar.f1126b == this.f1126b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1126b) + (Float.hashCode(this.f1125a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnimationVector2D: v1 = ");
        h.append(this.f1125a);
        h.append(", v2 = ");
        h.append(this.f1126b);
        return h.toString();
    }
}
