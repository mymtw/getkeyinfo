package androidx.compose.p015ui.layout;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.layout.k */
public final class C1691k extends C1862p0 implements C1684h0, C1693l {

    /* renamed from: c */
    public final Object f3729c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1691k(java.lang.String r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3729c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.C1691k.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public final Object mo6691a() {
        return this.f3729c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1691k kVar = obj instanceof C1691k ? (C1691k) obj : null;
        if (kVar == null) {
            return false;
        }
        return C19383o.m32792b(this.f3729c, kVar.f3729c);
    }

    public final int hashCode() {
        return this.f3729c.hashCode();
    }

    /* renamed from: o0 */
    public final Object mo3274o0(C1713x xVar, Object obj) {
        C19383o.m32797g(xVar, "<this>");
        return this;
    }

    public final String toString() {
        return C0073e.m209i(C0072d.m201h("LayoutId(id="), this.f3729c, ')');
    }
}
