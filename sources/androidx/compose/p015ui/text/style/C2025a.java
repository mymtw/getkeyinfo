package androidx.compose.p015ui.text.style;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.style.a */
public final class C2025a {

    /* renamed from: a */
    public final float f4603a;

    public /* synthetic */ C2025a(float f) {
        this.f4603a = f;
    }

    public final boolean equals(Object obj) {
        float f = this.f4603a;
        if (!(obj instanceof C2025a)) {
            return false;
        }
        return C19383o.m32792b(Float.valueOf(f), Float.valueOf(((C2025a) obj).f4603a));
    }

    public final int hashCode() {
        return Float.hashCode(this.f4603a);
    }

    public final String toString() {
        float f = this.f4603a;
        return "BaselineShift(multiplier=" + f + ')';
    }
}
