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
import p173m.C7279a;
import p174m0.C7280a;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.i */
public final class C1191i implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> f2471a;

    /* renamed from: b */
    public final /* synthetic */ float f2472b;

    public C1191i(C19861p<? super C1302d, ? super Integer, C19394m> pVar, float f) {
        this.f2471a = pVar;
        this.f2472b = f;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C1686i0 i0Var;
        C1713x xVar2 = xVar;
        C19383o.m32797g(xVar2, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        for (C1710u uVar : list) {
            long j2 = j;
            if (C19383o.m32792b(C1993m.m4346G(uVar), ResponseConstants.ICON)) {
                C1686i0 J = uVar.mo6665J(j2);
                if (this.f2471a != null) {
                    for (C1710u uVar2 : list) {
                        if (C19383o.m32792b(C1993m.m4346G(uVar2), ResponseConstants.LABEL)) {
                            i0Var = uVar2.mo6665J(C7280a.m13956a(j, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                i0Var = null;
                C1686i0 i0Var2 = i0Var;
                if (this.f2471a == null) {
                    int g = C7280a.m13962g(j);
                    return xVar2.mo4387Z(J.f3722b, g, C19294b0.m32559p0(), new BottomNavigationKt$placeIcon$1(J, (g - J.f3723c) / 2));
                }
                C19383o.m32794d(i0Var2);
                float f = this.f2472b;
                int g2 = C7280a.m13962g(j);
                int M = i0Var2.mo6661M(AlignmentLineKt.f3695b);
                int V = xVar2.mo3791V(BottomNavigationKt.f2179d);
                int i = (g2 - M) - V;
                int i2 = J.f3723c;
                int i3 = (g2 - (V * 2)) - i2;
                int max = Math.max(i0Var2.f3722b, J.f3722b);
                return xVar2.mo4387Z(max, g2, C19294b0.m32559p0(), new BottomNavigationKt$placeLabelAndIcon$1(f, i0Var2, (max - i0Var2.f3722b) / 2, i, C7279a.m13954l((((float) 1) - f) * ((float) (((g2 - i2) / 2) - i3))), J, (max - J.f3722b) / 2, i3));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
