package androidx.compose.p015ui.tooling;

import androidx.compose.p015ui.platform.InspectionModeKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.tooling.C1413a;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.InspectableKt */
public final class InspectableKt {
    /* renamed from: a */
    public static final void m4484a(C2055b bVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(bVar, "compositionDataRecord");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-913922352);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            h.f2730p = true;
            Set<C1413a> set = ((C2056c) bVar).f4648a;
            set.add(h.f2717c);
            CompositionLocalKt.m2530a(new C1412t0[]{InspectionModeKt.f4034a.mo5908b(Boolean.TRUE), InspectionTablesKt.f3073a.mo5908b(set)}, pVar, h, (i2 & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new InspectableKt$Inspectable$1(bVar, pVar, i);
        }
    }
}
