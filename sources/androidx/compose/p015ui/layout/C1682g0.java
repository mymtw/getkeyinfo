package androidx.compose.p015ui.layout;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7290i;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.g0 */
public final class C1682g0 extends C1862p0 implements C1680f0 {

    /* renamed from: c */
    public final C19857l<C7290i, C19394m> f3718c;

    /* renamed from: d */
    public long f3719d = C0761x.m1707a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1682g0(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "onSizeChanged"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3718c = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            long r0 = androidx.compose.foundation.layout.C0761x.m1707a(r3, r3)
            r2.f3719d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.C1682g0.<init>(kq.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682g0)) {
            return false;
        }
        return C19383o.m32792b(this.f3718c, ((C1682g0) obj).f3718c);
    }

    public final int hashCode() {
        return this.f3718c.hashCode();
    }

    /* renamed from: z */
    public final void mo3730z(long j) {
        if (!C7290i.m13994a(this.f3719d, j)) {
            this.f3718c.invoke(new C7290i(j));
            this.f3719d = j;
        }
    }
}
