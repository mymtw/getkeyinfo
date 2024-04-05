package androidx.compose.material;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class SnackbarKt$TextOnlySnackbar$2 implements C1711v {

    /* renamed from: a */
    public static final SnackbarKt$TextOnlySnackbar$2 f2276a = new SnackbarKt$TextOnlySnackbar$2();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        boolean z = false;
        if (list.size() == 1) {
            C1686i0 J = ((C1710u) C19327t.m32638T0(list)).mo6665J(j);
            int M = J.mo6661M(AlignmentLineKt.f3694a);
            int M2 = J.mo6661M(AlignmentLineKt.f3695b);
            if (M != Integer.MIN_VALUE) {
                if (M2 != Integer.MIN_VALUE) {
                    z = true;
                }
                if (z) {
                    int max = Math.max(xVar.mo3791V(M == M2 ? SnackbarKt.f2274h : SnackbarKt.f2275i), J.f3723c);
                    return xVar.mo4387Z(C7280a.m13963h(j), max, C19294b0.m32559p0(), new SnackbarKt$TextOnlySnackbar$2$measure$4(max, J));
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
    }
}
