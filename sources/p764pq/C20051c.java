package p764pq;

import kotlin.jvm.internal.C19383o;

/* renamed from: pq.c */
public final class C20051c extends C20049a implements C20054f<Character> {
    static {
        new C20051c(1, 0);
    }

    public C20051c(char c, char c2) {
        super(c, c2);
    }

    /* renamed from: c */
    public final Comparable mo74309c() {
        return Character.valueOf(this.f44405b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20051c) {
            if (C19383o.m32799i(this.f44405b, this.f44406c) > 0) {
                C20051c cVar = (C20051c) obj;
                if (C19383o.m32799i(cVar.f44405b, cVar.f44406c) > 0) {
                    return true;
                }
            }
            C20051c cVar2 = (C20051c) obj;
            if (this.f44405b == cVar2.f44405b && this.f44406c == cVar2.f44406c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final Comparable mo74311g() {
        return Character.valueOf(this.f44406c);
    }

    public final int hashCode() {
        if (C19383o.m32799i(this.f44405b, this.f44406c) > 0) {
            return -1;
        }
        return (this.f44405b * 31) + this.f44406c;
    }

    public final String toString() {
        return this.f44405b + ".." + this.f44406c;
    }
}
