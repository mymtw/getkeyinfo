package androidx.compose.p015ui.text.style;

/* renamed from: androidx.compose.ui.text.style.d */
public final class C2029d {

    /* renamed from: a */
    public final int f4611a;

    public /* synthetic */ C2029d(int i) {
        this.f4611a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2029d) && this.f4611a == ((C2029d) obj).f4611a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4611a);
    }

    public final String toString() {
        int i = this.f4611a;
        boolean z = false;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            z = true;
        }
        return z ? "End" : "Invalid";
    }
}
