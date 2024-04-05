package androidx.compose.p015ui.text.font;

/* renamed from: androidx.compose.ui.text.font.l */
public final class C1958l {

    /* renamed from: a */
    public final int f4408a;

    public /* synthetic */ C1958l(int i) {
        this.f4408a = i;
    }

    /* renamed from: a */
    public static String m4285a(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1958l) && this.f4408a == ((C1958l) obj).f4408a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4408a);
    }

    public final String toString() {
        return m4285a(this.f4408a);
    }
}
