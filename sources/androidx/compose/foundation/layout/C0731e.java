package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.e */
public final class C0731e extends C1862p0 implements C1684h0 {

    /* renamed from: c */
    public C1428a f1494c;

    /* renamed from: d */
    public boolean f1495d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0731e(androidx.compose.p015ui.C1432b r3, boolean r4) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1494c = r3
            r2.f1495d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0731e.<init>(androidx.compose.ui.b, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0731e eVar = obj instanceof C0731e ? (C0731e) obj : null;
        if (eVar == null) {
            return false;
        }
        return C19383o.m32792b(this.f1494c, eVar.f1494c) && this.f1495d == eVar.f1495d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1495d) + (this.f1494c.hashCode() * 31);
    }

    /* renamed from: o0 */
    public final Object mo3274o0(C1713x xVar, Object obj) {
        C19383o.m32797g(xVar, "<this>");
        return this;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BoxChildData(alignment=");
        h.append(this.f1494c);
        h.append(", matchParentSize=");
        return C0391c.m1058d(h, this.f1495d, ')');
    }
}
