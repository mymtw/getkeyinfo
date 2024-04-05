package androidx.compose.p015ui.text.input;

/* renamed from: androidx.compose.ui.text.input.i */
public final class C1989i {

    /* renamed from: a */
    public final int f4479a;

    public /* synthetic */ C1989i(int i) {
        this.f4479a = i;
    }

    /* renamed from: a */
    public static String m4331a(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            z = true;
        }
        return z ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1989i) && this.f4479a == ((C1989i) obj).f4479a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4479a);
    }

    public final String toString() {
        return m4331a(this.f4479a);
    }
}
