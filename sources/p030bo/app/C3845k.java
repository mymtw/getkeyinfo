package p030bo.app;

import android.support.p013v4.media.C0072d;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.k */
public final class C3845k implements C3637e2 {

    /* renamed from: b */
    private final Set<C4208t1> f8721b;

    /* renamed from: c */
    private final boolean f8722c;

    public C3845k(Set<? extends C4208t1> set) {
        C19383o.m32797g(set, "eventsList");
        this.f8721b = set;
        this.f8722c = set.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo13552a() {
        boolean z;
        Set<C4208t1> set = this.f8721b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (C4208t1 j : set) {
                if (j.mo13451j() == C3600c1.SESSION_START) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Set<C4208t1> mo13553b() {
        return this.f8721b;
    }

    /* renamed from: e */
    public boolean mo13244e() {
        return this.f8722c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3845k) && C19383o.m32792b(this.f8721b, ((C3845k) obj).f8721b);
    }

    public int hashCode() {
        return this.f8721b.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BrazeEventContainer(eventsList=");
        h.append(this.f8721b);
        h.append(')');
        return h.toString();
    }
}
