package p644ph;

import android.support.p013v4.media.session.C0087d;

/* renamed from: ph.u */
public final class C18367u {

    /* renamed from: c */
    public static final C18367u f40332c = new C18367u(0, 0);

    /* renamed from: a */
    public final long f40333a;

    /* renamed from: b */
    public final long f40334b;

    public C18367u(long j, long j2) {
        this.f40333a = j;
        this.f40334b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18367u.class != obj.getClass()) {
            return false;
        }
        C18367u uVar = (C18367u) obj;
        return this.f40333a == uVar.f40333a && this.f40334b == uVar.f40334b;
    }

    public final int hashCode() {
        return (((int) this.f40333a) * 31) + ((int) this.f40334b);
    }

    public final String toString() {
        long j = this.f40333a;
        long j2 = this.f40334b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        return C0087d.m236f(sb, j2, "]");
    }
}
