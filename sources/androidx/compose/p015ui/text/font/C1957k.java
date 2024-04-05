package androidx.compose.p015ui.text.font;

/* renamed from: androidx.compose.ui.text.font.k */
public final class C1957k {

    /* renamed from: a */
    public final int f4407a;

    public /* synthetic */ C1957k(int i) {
        this.f4407a = i;
    }

    /* renamed from: a */
    public static String m4284a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1957k) && this.f4407a == ((C1957k) obj).f4407a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4407a);
    }

    public final String toString() {
        return m4284a(this.f4407a);
    }
}
