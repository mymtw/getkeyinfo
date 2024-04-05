package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0743k;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;

public final class ColumnKt {

    /* renamed from: a */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f1396a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        C0718d.C0727i iVar = C0718d.f1476a;
        int i = C0743k.f1528a;
        f1396a = C0761x.m1672I0((float) 0, new C0743k.C0746c(C1428a.C1429a.f3116l), layoutOrientation, SizeMode.Wrap, ColumnKt$DefaultColumnMeasurePolicy$1.INSTANCE);
    }

    /* renamed from: a */
    public static final C1711v m1461a(C0718d.C0729k kVar, C1432b.C1433a aVar, C1302d dVar) {
        RowColumnImplKt$rowColumnMeasurePolicy$1 rowColumnImplKt$rowColumnMeasurePolicy$1;
        C19383o.m32797g(kVar, "verticalArrangement");
        dVar.mo5465u(1089876336);
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(kVar) | dVar.mo5408I(aVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            if (!C19383o.m32792b(kVar, C0718d.f1478c) || !C19383o.m32792b(aVar, C1428a.C1429a.f3116l)) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float a = kVar.mo4094a();
                int i = C0743k.f1528a;
                rowColumnImplKt$rowColumnMeasurePolicy$1 = C0761x.m1672I0(a, new C0743k.C0746c(aVar), layoutOrientation, SizeMode.Wrap, new ColumnKt$columnMeasurePolicy$1$1(kVar));
            } else {
                rowColumnImplKt$rowColumnMeasurePolicy$1 = f1396a;
            }
            v = rowColumnImplKt$rowColumnMeasurePolicy$1;
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1711v vVar = (C1711v) v;
        dVar.mo5406H();
        return vVar;
    }
}
