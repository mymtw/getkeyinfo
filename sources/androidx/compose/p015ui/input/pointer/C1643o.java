package androidx.compose.p015ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.o */
public final class C1643o {

    /* renamed from: a */
    public final long f3655a;

    public /* synthetic */ C1643o(long j) {
        this.f3655a = j;
    }

    /* renamed from: a */
    public static final boolean m3516a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static String m3517b(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1643o) && this.f3655a == ((C1643o) obj).f3655a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3655a);
    }

    public final String toString() {
        return m3517b(this.f3655a);
    }
}
