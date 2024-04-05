package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0743k;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;

public final class RowKt {

    /* renamed from: a */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f1426a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        C0718d.C0727i iVar = C0718d.f1476a;
        int i = C0743k.f1528a;
        f1426a = C0761x.m1672I0((float) 0, new C0743k.C0748e(C1428a.C1429a.f3113i), layoutOrientation, SizeMode.Wrap, RowKt$DefaultRowMeasurePolicy$1.INSTANCE);
    }

    /* renamed from: a */
    public static final C1711v m1480a(C0718d.C0722d dVar, C1432b.C1434b bVar, C1302d dVar2) {
        RowColumnImplKt$rowColumnMeasurePolicy$1 rowColumnImplKt$rowColumnMeasurePolicy$1;
        C19383o.m32797g(dVar, "horizontalArrangement");
        dVar2.mo5465u(-837807694);
        dVar2.mo5465u(511388516);
        boolean I = dVar2.mo5408I(dVar) | dVar2.mo5408I(bVar);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            if (!C19383o.m32792b(dVar, C0718d.f1476a) || !C19383o.m32792b(bVar, C1428a.C1429a.f3113i)) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float a = dVar.mo4094a();
                int i = C0743k.f1528a;
                rowColumnImplKt$rowColumnMeasurePolicy$1 = C0761x.m1672I0(a, new C0743k.C0748e(bVar), layoutOrientation, SizeMode.Wrap, new RowKt$rowMeasurePolicy$1$1(dVar));
            } else {
                rowColumnImplKt$rowColumnMeasurePolicy$1 = f1426a;
            }
            v = rowColumnImplKt$rowColumnMeasurePolicy$1;
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1711v vVar = (C1711v) v;
        dVar2.mo5406H();
        return vVar;
    }
}
