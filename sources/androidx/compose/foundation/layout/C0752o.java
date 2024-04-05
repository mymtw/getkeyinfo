package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0743k;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.o */
public final class C0752o extends C1862p0 implements C1684h0 {

    /* renamed from: c */
    public final C1428a.C1430b f1541c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0752o(androidx.compose.p015ui.C1432b.C1433a r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1541c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0752o.<init>(androidx.compose.ui.b$a):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0752o oVar = obj instanceof C0752o ? (C0752o) obj : null;
        if (oVar == null) {
            return false;
        }
        return C19383o.m32792b(this.f1541c, oVar.f1541c);
    }

    public final int hashCode() {
        return this.f1541c.hashCode();
    }

    /* renamed from: o0 */
    public final Object mo3274o0(C1713x xVar, Object obj) {
        C19383o.m32797g(xVar, "<this>");
        C0762y yVar = obj instanceof C0762y ? (C0762y) obj : null;
        if (yVar == null) {
            yVar = new C0762y(0);
        }
        int i = C0743k.f1528a;
        C1428a.C1430b bVar = this.f1541c;
        C19383o.m32797g(bVar, ResponseConstants.HORIZONTAL);
        yVar.f1571c = new C0743k.C0746c(bVar);
        return yVar;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HorizontalAlignModifier(horizontal=");
        h.append(this.f1541c);
        h.append(')');
        return h.toString();
    }
}
