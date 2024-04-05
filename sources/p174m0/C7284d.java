package p174m0;

import kotlin.jvm.internal.C19383o;

/* renamed from: m0.d */
public final class C7284d implements Comparable<C7284d> {

    /* renamed from: b */
    public final float f16155b;

    public /* synthetic */ C7284d(float f) {
        this.f16155b = f;
    }

    /* renamed from: a */
    public static final boolean m13983a(float f, float f2) {
        return C19383o.m32792b(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: c */
    public static String m13984c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public final int compareTo(Object obj) {
        return Float.compare(this.f16155b, ((C7284d) obj).f16155b);
    }

    public final boolean equals(Object obj) {
        float f = this.f16155b;
        if (!(obj instanceof C7284d)) {
            return false;
        }
        return C19383o.m32792b(Float.valueOf(f), Float.valueOf(((C7284d) obj).f16155b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f16155b);
    }

    public final String toString() {
        return m13984c(this.f16155b);
    }
}
