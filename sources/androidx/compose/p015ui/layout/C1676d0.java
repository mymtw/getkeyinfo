package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.d0 */
public final class C1676d0 extends C1862p0 implements C1674c0 {

    /* renamed from: c */
    public final C19857l<C1689j, C19394m> f3717c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1676d0(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3717c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.C1676d0.<init>(kq.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676d0)) {
            return false;
        }
        return C19383o.m32792b(this.f3717c, ((C1676d0) obj).f3717c);
    }

    public final int hashCode() {
        return this.f3717c.hashCode();
    }

    /* renamed from: x0 */
    public final void mo3878x0(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        this.f3717c.invoke(jVar);
    }
}
