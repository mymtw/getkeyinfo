package androidx.compose.p015ui.graphics;

/* renamed from: androidx.compose.ui.graphics.n0 */
public final class C1536n0 {

    /* renamed from: a */
    public final int f3334a;

    public /* synthetic */ C1536n0(int i) {
        this.f3334a = i;
    }

    /* renamed from: a */
    public static String m3314a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1536n0) && this.f3334a == ((C1536n0) obj).f3334a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3334a);
    }

    public final String toString() {
        return m3314a(this.f3334a);
    }
}
