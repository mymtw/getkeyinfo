package androidx.compose.p015ui.text.style;

/* renamed from: androidx.compose.ui.text.style.f */
public final class C2031f {

    /* renamed from: a */
    public final int f4616a;

    public /* synthetic */ C2031f(int i) {
        this.f4616a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2031f) && this.f4616a == ((C2031f) obj).f4616a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4616a);
    }

    public final String toString() {
        int i = this.f4616a;
        boolean z = false;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "ContentOrRtl" : "Invalid";
    }
}
