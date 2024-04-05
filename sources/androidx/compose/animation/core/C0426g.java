package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;

/* renamed from: androidx.compose.animation.core.g */
public final class C0426g extends C0432j {

    /* renamed from: a */
    public float f1116a;

    /* renamed from: b */
    public final int f1117b = 1;

    public C0426g(float f) {
        this.f1116a = f;
    }

    /* renamed from: a */
    public final float mo3488a(int i) {
        if (i == 0) {
            return this.f1116a;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final int mo3489b() {
        return this.f1117b;
    }

    /* renamed from: c */
    public final C0432j mo3490c() {
        return new C0426g(0.0f);
    }

    /* renamed from: d */
    public final void mo3491d() {
        this.f1116a = 0.0f;
    }

    /* renamed from: e */
    public final void mo3492e(float f, int i) {
        if (i == 0) {
            this.f1116a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0426g) {
            if (((C0426g) obj).f1116a == this.f1116a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1116a);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnimationVector1D: value = ");
        h.append(this.f1116a);
        return h.toString();
    }
}
