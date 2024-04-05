package p034c3;

/* renamed from: c3.d */
public final class C4374d {

    /* renamed from: a */
    public String f9627a;

    /* renamed from: b */
    public Long f9628b;

    public C4374d(String str, long j) {
        this.f9627a = str;
        this.f9628b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4374d)) {
            return false;
        }
        C4374d dVar = (C4374d) obj;
        if (!this.f9627a.equals(dVar.f9627a)) {
            return false;
        }
        Long l = this.f9628b;
        Long l2 = dVar.f9628b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f9627a.hashCode() * 31;
        Long l = this.f9628b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
