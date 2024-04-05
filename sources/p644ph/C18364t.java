package p644ph;

import androidx.compose.animation.C0391c;

/* renamed from: ph.t */
public interface C18364t {

    /* renamed from: ph.t$a */
    public static final class C18365a {

        /* renamed from: a */
        public final C18367u f40328a;

        /* renamed from: b */
        public final C18367u f40329b;

        public C18365a() {
            throw null;
        }

        public C18365a(C18367u uVar, C18367u uVar2) {
            this.f40328a = uVar;
            this.f40329b = uVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C18365a.class != obj.getClass()) {
                return false;
            }
            C18365a aVar = (C18365a) obj;
            return this.f40328a.equals(aVar.f40328a) && this.f40329b.equals(aVar.f40329b);
        }

        public final int hashCode() {
            return this.f40329b.hashCode() + (this.f40328a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            String valueOf = String.valueOf(this.f40328a);
            if (this.f40328a.equals(this.f40329b)) {
                str = "";
            } else {
                String valueOf2 = String.valueOf(this.f40329b);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
                sb.append(", ");
                sb.append(valueOf2);
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(C0391c.m1055a(str, valueOf.length() + 2));
            sb2.append("[");
            sb2.append(valueOf);
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: ph.t$b */
    public static class C18366b implements C18364t {

        /* renamed from: a */
        public final long f40330a;

        /* renamed from: b */
        public final C18365a f40331b;

        public C18366b(long j) {
            this(j, 0);
        }

        /* renamed from: d */
        public final C18365a mo47833d(long j) {
            return this.f40331b;
        }

        /* renamed from: g */
        public final boolean mo47834g() {
            return false;
        }

        /* renamed from: i */
        public final long mo47835i() {
            return this.f40330a;
        }

        public C18366b(long j, long j2) {
            this.f40330a = j;
            C18367u uVar = j2 == 0 ? C18367u.f40332c : new C18367u(0, j2);
            this.f40331b = new C18365a(uVar, uVar);
        }
    }

    /* renamed from: d */
    C18365a mo47833d(long j);

    /* renamed from: g */
    boolean mo47834g();

    /* renamed from: i */
    long mo47835i();
}
