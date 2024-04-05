package androidx.compose.p015ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.ZIndexModifier */
public final class ZIndexModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f3103c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ZIndexModifier(float r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3103c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.ZIndexModifier.<init>(float):void");
    }

    public final boolean equals(Object obj) {
        ZIndexModifier zIndexModifier = obj instanceof ZIndexModifier ? (ZIndexModifier) obj : null;
        return zIndexModifier != null && this.f3103c == zIndexModifier.f3103c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3103c);
    }

    public final String toString() {
        return C0388a.m1048d(C0072d.m201h("ZIndexModifier(zIndex="), this.f3103c, ')');
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new ZIndexModifier$measure$1(J, this));
    }
}
