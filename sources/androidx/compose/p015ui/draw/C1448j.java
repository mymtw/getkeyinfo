package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1603w;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.j */
public final class C1448j {
    /* renamed from: a */
    public static C1436d m3094a(C1436d dVar, float f, C1530k0 k0Var, int i) {
        if ((i & 2) != 0) {
            k0Var = C1517e0.f3292a;
        }
        C1530k0 k0Var2 = k0Var;
        boolean z = (i & 4) != 0 && Float.compare(f, (float) 0) > 0;
        long j = (i & 8) != 0 ? C1603w.f3569a : 0;
        long j2 = (i & 16) != 0 ? C1603w.f3569a : 0;
        C19383o.m32797g(dVar, "$this$shadow");
        C19383o.m32797g(k0Var2, "shape");
        if (Float.compare(f, (float) 0) <= 0 && !z) {
            return dVar;
        }
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return InspectableValueKt.m3945a(dVar, C19388s.m32868j0(C1436d.C1437a.f3125b, new ShadowKt$shadow$2$1(f, k0Var2, z, j, j2)));
    }
}
