package androidx.compose.p015ui.graphics;

/* renamed from: androidx.compose.ui.graphics.m0 */
public final class C1534m0 {

    /* renamed from: a */
    public final int f3332a;

    public /* synthetic */ C1534m0(int i) {
        this.f3332a = i;
    }

    /* renamed from: a */
    public static String m3312a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1534m0) && this.f3332a == ((C1534m0) obj).f3332a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3332a);
    }

    public final String toString() {
        return m3312a(this.f3332a);
    }
}
