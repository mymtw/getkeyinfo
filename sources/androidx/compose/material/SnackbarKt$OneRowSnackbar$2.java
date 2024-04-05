package androidx.compose.material;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class SnackbarKt$OneRowSnackbar$2 implements C1711v {
    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        int i;
        int i2;
        int i3;
        C1713x xVar2 = xVar;
        C19383o.m32797g(xVar2, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        for (C1710u uVar : list) {
            long j2 = j;
            if (C19383o.m32792b(C1993m.m4346G(uVar), ResponseConstants.ACTION)) {
                C1686i0 J = uVar.mo6665J(j2);
                int h = (C7280a.m13963h(j) - J.f3722b) - xVar2.mo3791V(SnackbarKt.f2272f);
                int j3 = C7280a.m13965j(j);
                int i4 = h < j3 ? j3 : h;
                for (C1710u uVar2 : list) {
                    if (C19383o.m32792b(C1993m.m4346G(uVar2), "text")) {
                        C1686i0 J2 = uVar2.mo6665J(C7280a.m13956a(j, 0, i4, 0, 0, 9));
                        C1679f fVar = AlignmentLineKt.f3694a;
                        int M = J2.mo6661M(fVar);
                        boolean z = true;
                        int i5 = 0;
                        if (M != Integer.MIN_VALUE) {
                            int M2 = J2.mo6661M(AlignmentLineKt.f3695b);
                            if (M2 != Integer.MIN_VALUE) {
                                if (M != M2) {
                                    z = false;
                                }
                                int h2 = C7280a.m13963h(j) - J.f3722b;
                                if (z) {
                                    i3 = Math.max(xVar2.mo3791V(SnackbarKt.f2274h), J.f3723c);
                                    int i6 = (i3 - J2.f3723c) / 2;
                                    int M3 = J.mo6661M(fVar);
                                    if (M3 != Integer.MIN_VALUE) {
                                        i5 = (M + i6) - M3;
                                    }
                                    i = i5;
                                    i2 = i6;
                                } else {
                                    int V = xVar2.mo3791V(SnackbarKt.f2267a) - M;
                                    i3 = Math.max(xVar2.mo3791V(SnackbarKt.f2275i), J2.f3723c + V);
                                    i2 = V;
                                    i = (i3 - J.f3723c) / 2;
                                }
                                return xVar2.mo4387Z(C7280a.m13963h(j), i3, C19294b0.m32559p0(), new SnackbarKt$OneRowSnackbar$2$measure$4(J2, i2, J, h2, i));
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
