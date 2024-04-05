package androidx.compose.p015ui.graphics;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerModifier */
public final class BlockGraphicsLayerModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final C19857l<C1549v, C19394m> f3201c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BlockGraphicsLayerModifier(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "layerBlock"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3201c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.BlockGraphicsLayerModifier.<init>(kq.l):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BlockGraphicsLayerModifier)) {
            return false;
        }
        return C19383o.m32792b(this.f3201c, ((BlockGraphicsLayerModifier) obj).f3201c);
    }

    public final int hashCode() {
        return this.f3201c.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BlockGraphicsLayerModifier(block=");
        h.append(this.f3201c);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new BlockGraphicsLayerModifier$measure$1(J, this));
    }
}
