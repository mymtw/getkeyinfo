package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7280a;
import p174m0.C7287g;
import p174m0.C7290i;

public final class ListItemKt$OffsetToBaselineOrCenter$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ float f2217a;

    public ListItemKt$OffsetToBaselineOrCenter$1(float f) {
        this.f2217a = f;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        int i;
        int i2;
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        C1686i0 J = ((C1710u) list.get(0)).mo6665J(C7280a.m13956a(j, 0, 0, 0, 0, 11));
        int M = J.mo6661M(AlignmentLineKt.f3694a);
        if (M != Integer.MIN_VALUE) {
            i2 = xVar.mo3791V(this.f2217a) - M;
            i = Math.max(C7280a.m13964i(j), J.f3723c + i2);
        } else {
            i = Math.max(C7280a.m13964i(j), J.f3723c);
            long a = C0761x.m1707a(0, i - J.f3723c);
            LayoutDirection layoutDirection = xVar.getLayoutDirection();
            C19383o.m32797g(layoutDirection, "layoutDirection");
            float f = (float) 1;
            i2 = C7287g.m13992b(C19421p.m32949o(C7279a.m13954l(((layoutDirection == LayoutDirection.Ltr ? 0.0f : ((float) -1) * 0.0f) + f) * (((float) (((int) (a >> 32)) - ((int) 0))) / 2.0f)), C7279a.m13954l((f + 0.0f) * (((float) (C7290i.m13995b(a) - C7290i.m13995b(0))) / 2.0f))));
        }
        return xVar.mo4387Z(J.f3722b, i, C19294b0.m32559p0(), new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(J, i2));
    }
}
