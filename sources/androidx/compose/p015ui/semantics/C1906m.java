package androidx.compose.p015ui.semantics;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.m */
public final class C1906m implements C1905l {

    /* renamed from: d */
    public static AtomicInteger f4249d = new AtomicInteger(0);

    /* renamed from: b */
    public final int f4250b;

    /* renamed from: c */
    public final C1903j f4251c;

    public C1906m(int i, boolean z, boolean z2, C19857l<? super C1910q, C19394m> lVar) {
        C19383o.m32797g(lVar, "properties");
        this.f4250b = i;
        C1903j jVar = new C1903j();
        jVar.f4247c = z;
        jVar.f4248d = z2;
        lVar.invoke(jVar);
        this.f4251c = jVar;
    }

    /* renamed from: N0 */
    public final C1903j mo7351N0() {
        return this.f4251c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1906m)) {
            return false;
        }
        C1906m mVar = (C1906m) obj;
        return this.f4250b == mVar.f4250b && C19383o.m32792b(this.f4251c, mVar.f4251c);
    }

    public final int getId() {
        return this.f4250b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4250b) + (this.f4251c.hashCode() * 31);
    }
}
