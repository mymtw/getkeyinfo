package androidx.compose.p015ui.semantics;

/* renamed from: androidx.compose.ui.semantics.e */
public final class C1898e {

    /* renamed from: a */
    public final int f4221a = 0;

    public final boolean equals(Object obj) {
        return (obj instanceof C1898e) && this.f4221a == ((C1898e) obj).f4221a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4221a);
    }

    public final String toString() {
        int i = this.f4221a;
        boolean z = false;
        if (i == 0) {
            return "Polite";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "Assertive" : "Unknown";
    }
}
