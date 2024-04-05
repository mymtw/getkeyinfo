package androidx.compose.p015ui.focus;

/* renamed from: androidx.compose.ui.focus.a */
public final class C1465a {

    /* renamed from: a */
    public final int f3173a;

    public /* synthetic */ C1465a(int i) {
        this.f3173a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1465a) && this.f3173a == ((C1465a) obj).f3173a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3173a);
    }

    public final String toString() {
        int i = this.f3173a;
        boolean z = false;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "In";
        }
        if (i == 8) {
            z = true;
        }
        return z ? "Out" : "Invalid FocusDirection";
    }
}
