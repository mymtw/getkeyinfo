package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.vector.C1553c;
import androidx.compose.p015ui.graphics.vector.C1556d;
import androidx.compose.p015ui.graphics.vector.C1583j;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ExposedDropdownMenuDefaults$TrailingIcon$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ boolean $expanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$3(boolean z) {
        super(2);
        this.$expanded = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1553c cVar = C19382n.f43258h;
            boolean z = true;
            if (cVar == null) {
                C1553c.C1554a aVar = new C1553c.C1554a("Filled.ArrowDropDown");
                EmptyList emptyList = C1583j.f3538a;
                C1532l0 l0Var = new C1532l0(C1545s.f3357b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1556d.C1562f(7.0f, 10.0f));
                arrayList.add(new C1556d.C1569m(5.0f, 5.0f));
                arrayList.add(new C1556d.C1569m(5.0f, -5.0f));
                arrayList.add(C1556d.C1558b.f3467c);
                aVar.mo6446b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, l0Var, (C1533m) null, "", arrayList);
                cVar = aVar.mo6447d();
                C19382n.f43258h = cVar;
            }
            C1553c cVar2 = cVar;
            C1436d dVar2 = C1436d.C1437a.f3125b;
            float f = this.$expanded ? 180.0f : 360.0f;
            if (f != 0.0f) {
                z = false;
            }
            IconKt.m2186b(cVar2, "Trailing icon for exposed dropdown menu", !z ? C19388s.m32869k0(dVar2, 0.0f, 0.0f, 0.0f, 0.0f, f, (C1530k0) null, false, 65279) : dVar2, 0, dVar, 48, 8);
            return;
        }
        dVar.mo5396C();
    }
}
