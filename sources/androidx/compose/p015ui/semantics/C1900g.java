package androidx.compose.p015ui.semantics;

/* renamed from: androidx.compose.ui.semantics.g */
public final class C1900g {

    /* renamed from: a */
    public final int f4226a;

    public /* synthetic */ C1900g(int i) {
        this.f4226a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1900g) && this.f4226a == ((C1900g) obj).f4226a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4226a);
    }

    public final String toString() {
        int i = this.f4226a;
        boolean z = false;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "Image" : "Unknown";
    }
}
