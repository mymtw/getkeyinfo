package androidx.compose.p015ui.graphics;

/* renamed from: androidx.compose.ui.graphics.c0 */
public final class C1494c0 {

    /* renamed from: a */
    public final int f3223a;

    public /* synthetic */ C1494c0(int i) {
        this.f3223a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1494c0) && this.f3223a == ((C1494c0) obj).f3223a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3223a);
    }

    public final String toString() {
        int i = this.f3223a;
        boolean z = false;
        if (i == 0) {
            return "NonZero";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "EvenOdd" : "Unknown";
    }
}
