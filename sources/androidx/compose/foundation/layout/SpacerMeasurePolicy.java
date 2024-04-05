package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class SpacerMeasurePolicy implements C1711v {

    /* renamed from: a */
    public static final SpacerMeasurePolicy f1439a = new SpacerMeasurePolicy();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        int i = 0;
        int h = C7280a.m13961f(j) ? C7280a.m13963h(j) : 0;
        if (C7280a.m13960e(j)) {
            i = C7280a.m13962g(j);
        }
        return xVar.mo4387Z(h, i, C19294b0.m32559p0(), SpacerMeasurePolicy$measure$1$1.INSTANCE);
    }
}
