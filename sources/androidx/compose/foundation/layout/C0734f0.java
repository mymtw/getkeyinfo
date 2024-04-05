package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0743k;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.f0 */
public final class C0734f0 extends C1862p0 implements C1684h0 {

    /* renamed from: c */
    public final C1428a.C1431c f1498c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0734f0() {
        /*
            r3 = this;
            androidx.compose.ui.b$b r0 = androidx.compose.p015ui.C1428a.C1429a.f3114j
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r1 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r2 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r3.<init>(r1)
            r3.f1498c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0734f0.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0734f0 f0Var = obj instanceof C0734f0 ? (C0734f0) obj : null;
        if (f0Var == null) {
            return false;
        }
        return C19383o.m32792b(this.f1498c, f0Var.f1498c);
    }

    public final int hashCode() {
        return this.f1498c.hashCode();
    }

    /* renamed from: o0 */
    public final Object mo3274o0(C1713x xVar, Object obj) {
        C19383o.m32797g(xVar, "<this>");
        C0762y yVar = obj instanceof C0762y ? (C0762y) obj : null;
        if (yVar == null) {
            yVar = new C0762y(0);
        }
        int i = C0743k.f1528a;
        C1428a.C1431c cVar = this.f1498c;
        C19383o.m32797g(cVar, "vertical");
        yVar.f1571c = new C0743k.C0748e(cVar);
        return yVar;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VerticalAlignModifier(vertical=");
        h.append(this.f1498c);
        h.append(')');
        return h.toString();
    }
}
