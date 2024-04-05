package androidx.compose.p015ui.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.layout.q */
public final class C1703q extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final C19862q<C1713x, C1710u, C7280a, C1712w> f3738c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1703q(p753kq.C19862q r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "measureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3738c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.C1703q.<init>(kq.q):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1703q qVar = obj instanceof C1703q ? (C1703q) obj : null;
        if (qVar == null) {
            return false;
        }
        return C19383o.m32792b(this.f3738c, qVar.f3738c);
    }

    public final int hashCode() {
        return this.f3738c.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LayoutModifierImpl(measureBlock=");
        h.append(this.f3738c);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        return this.f3738c.invoke(xVar, uVar, new C7280a(j));
    }
}
