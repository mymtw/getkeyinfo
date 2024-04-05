package androidx.compose.material;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class BadgeKt$BadgedBox$2 implements C1711v {

    /* renamed from: a */
    public static final BadgeKt$BadgedBox$2 f2175a = new BadgeKt$BadgedBox$2();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        for (C1710u uVar : list) {
            if (C19383o.m32792b(C1993m.m4346G(uVar), "badge")) {
                C1686i0 J = uVar.mo6665J(C7280a.m13956a(j, 0, 0, 0, 0, 11));
                for (C1710u uVar2 : list) {
                    if (C19383o.m32792b(C1993m.m4346G(uVar2), "anchor")) {
                        C1686i0 J2 = uVar2.mo6665J(j);
                        C1679f fVar = AlignmentLineKt.f3694a;
                        int M = J2.mo6661M(fVar);
                        C1679f fVar2 = AlignmentLineKt.f3695b;
                        int M2 = J2.mo6661M(fVar2);
                        return xVar.mo4387Z(J2.f3722b, J2.f3723c, C19294b0.m32562s0(new Pair(fVar, Integer.valueOf(M)), new Pair(fVar2, Integer.valueOf(M2))), new BadgeKt$BadgedBox$2$measure$1(J, xVar, J2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
