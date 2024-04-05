package androidx.compose.material;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19861p;

public final class TabKt$TabBaselineLayout$2 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> f2320a;

    /* renamed from: b */
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> f2321b;

    public TabKt$TabBaselineLayout$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2) {
        this.f2320a = pVar;
        this.f2321b = pVar2;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C1686i0 i0Var;
        C1686i0 i0Var2;
        C1713x xVar2 = xVar;
        C19383o.m32797g(xVar2, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        if (this.f2320a != null) {
            for (C1710u uVar : list) {
                if (C19383o.m32792b(C1993m.m4346G(uVar), "text")) {
                    i0Var = uVar.mo6665J(C7280a.m13956a(j, 0, 0, 0, 0, 11));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        i0Var = null;
        if (this.f2321b != null) {
            for (C1710u uVar2 : list) {
                if (C19383o.m32792b(C1993m.m4346G(uVar2), ResponseConstants.ICON)) {
                    i0Var2 = uVar2.mo6665J(j);
                } else {
                    long j2 = j;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        i0Var2 = null;
        int i = 0;
        int i2 = i0Var != null ? i0Var.f3722b : 0;
        if (i0Var2 != null) {
            i = i0Var2.f3722b;
        }
        int max = Math.max(i2, i);
        int V = xVar2.mo3791V((i0Var == null || i0Var2 == null) ? TabKt.f2313a : TabKt.f2314b);
        return xVar2.mo4387Z(max, V, C19294b0.m32559p0(), new TabKt$TabBaselineLayout$2$measure$1(i0Var, i0Var2, xVar, max, V, i0Var != null ? Integer.valueOf(i0Var.mo6661M(AlignmentLineKt.f3694a)) : null, i0Var != null ? Integer.valueOf(i0Var.mo6661M(AlignmentLineKt.f3695b)) : null));
    }
}
