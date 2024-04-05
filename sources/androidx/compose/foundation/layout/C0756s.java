package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.s */
public final class C0756s extends C1862p0 implements C1684h0 {

    /* renamed from: c */
    public final float f1550c;

    /* renamed from: d */
    public final boolean f1551d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0756s(float r3, boolean r4) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1550c = r3
            r2.f1551d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0756s.<init>(float, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0756s sVar = obj instanceof C0756s ? (C0756s) obj : null;
        if (sVar == null) {
            return false;
        }
        return ((this.f1550c > sVar.f1550c ? 1 : (this.f1550c == sVar.f1550c ? 0 : -1)) == 0) && this.f1551d == sVar.f1551d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1551d) + (Float.hashCode(this.f1550c) * 31);
    }

    /* renamed from: o0 */
    public final Object mo3274o0(C1713x xVar, Object obj) {
        C19383o.m32797g(xVar, "<this>");
        C0762y yVar = obj instanceof C0762y ? (C0762y) obj : null;
        if (yVar == null) {
            yVar = new C0762y(0);
        }
        yVar.f1569a = this.f1550c;
        yVar.f1570b = this.f1551d;
        return yVar;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LayoutWeightImpl(weight=");
        h.append(this.f1550c);
        h.append(", fill=");
        return C0391c.m1058d(h, this.f1551d, ')');
    }
}
