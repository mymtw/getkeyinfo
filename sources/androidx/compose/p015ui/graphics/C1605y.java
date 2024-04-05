package androidx.compose.p015ui.graphics;

/* renamed from: androidx.compose.ui.graphics.y */
public final class C1605y {

    /* renamed from: a */
    public final int f3570a;

    public /* synthetic */ C1605y(int i) {
        this.f3570a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1605y) && this.f3570a == ((C1605y) obj).f3570a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3570a);
    }

    public final String toString() {
        int i = this.f3570a;
        boolean z = false;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        if (i == 4) {
            z = true;
        }
        return z ? "Gpu" : "Unknown";
    }
}
