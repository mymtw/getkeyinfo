package p174m0;

/* renamed from: m0.k */
public final class C7293k {

    /* renamed from: a */
    public final long f16175a;

    public /* synthetic */ C7293k(long j) {
        this.f16175a = j;
    }

    /* renamed from: a */
    public static final boolean m14001a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static String m14002b(long j) {
        return m14001a(j, 0) ? "Unspecified" : m14001a(j, 4294967296L) ? "Sp" : m14001a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7293k) && this.f16175a == ((C7293k) obj).f16175a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16175a);
    }

    public final String toString() {
        return m14002b(this.f16175a);
    }
}
