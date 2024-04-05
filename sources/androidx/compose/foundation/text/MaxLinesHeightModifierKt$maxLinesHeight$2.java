package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.C2034t;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p174m0.C7290i;
import p753kq.C19862q;

final class MaxLinesHeightModifierKt$maxLinesHeight$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C2023s $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxLinesHeightModifierKt$maxLinesHeight$2(int i, C2023s sVar) {
        super(3);
        this.$maxLines = i;
        this.$textStyle = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1302d dVar3 = dVar2;
        C19383o.m32797g(dVar, "$this$composed");
        dVar3.mo5465u(-1027014173);
        int i2 = this.$maxLines;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        } else if (i2 == Integer.MAX_VALUE) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            dVar2.mo5406H();
            return aVar;
        } else {
            C7282b bVar = (C7282b) dVar3.mo5410J(CompositionLocalsKt.f4019e);
            C1952g.C1953a aVar2 = (C1952g.C1953a) dVar3.mo5410J(CompositionLocalsKt.f4022h);
            LayoutDirection layoutDirection = (LayoutDirection) dVar3.mo5410J(CompositionLocalsKt.f4025k);
            C2023s sVar = this.$textStyle;
            dVar3.mo5465u(511388516);
            boolean I = dVar3.mo5408I(sVar) | dVar3.mo5408I(layoutDirection);
            Object v = dVar2.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = C2034t.m4482a(sVar, layoutDirection);
                dVar3.mo5454o(v);
            }
            dVar2.mo5406H();
            C2023s sVar2 = (C2023s) v;
            dVar3.mo5465u(511388516);
            boolean I2 = dVar3.mo5408I(aVar2) | dVar3.mo5408I(sVar2);
            Object v2 = dVar2.mo5467v();
            if (I2 || v2 == C1302d.C1303a.f2828a) {
                C2012n nVar = sVar2.f4599a;
                C1952g gVar = nVar.f4541f;
                C1959m mVar = nVar.f4538c;
                if (mVar == null) {
                    mVar = C1959m.f4413g;
                }
                C1957k kVar = nVar.f4539d;
                int i3 = kVar != null ? kVar.f4407a : 0;
                C1958l lVar = nVar.f4540e;
                v2 = aVar2.mo7537a(gVar, mVar, i3, lVar != null ? lVar.f4408a : 1);
                dVar3.mo5454o(v2);
            }
            dVar2.mo5406H();
            C1342k1 k1Var = (C1342k1) v2;
            Object[] objArr = {bVar, aVar2, this.$textStyle, layoutDirection, k1Var.getValue()};
            dVar3.mo5465u(-568225417);
            boolean z = false;
            for (int i4 = 0; i4 < 5; i4++) {
                z |= dVar3.mo5408I(objArr[i4]);
            }
            Object v3 = dVar2.mo5467v();
            if (z || v3 == C1302d.C1303a.f2828a) {
                v3 = Integer.valueOf(C7290i.m13995b(C0960n.m1999a(sVar2, bVar, aVar2, C0960n.f2024a, 1)));
                dVar3.mo5454o(v3);
            }
            dVar2.mo5406H();
            int intValue = ((Number) v3).intValue();
            Object[] objArr2 = {bVar, aVar2, this.$textStyle, layoutDirection, k1Var.getValue()};
            dVar3.mo5465u(-568225417);
            boolean z2 = false;
            for (int i5 = 0; i5 < 5; i5++) {
                z2 |= dVar3.mo5408I(objArr2[i5]);
            }
            Object v4 = dVar2.mo5467v();
            if (z2 || v4 == C1302d.C1303a.f2828a) {
                StringBuilder sb = new StringBuilder();
                String str = C0960n.f2024a;
                sb.append(str);
                sb.append(10);
                sb.append(str);
                v4 = Integer.valueOf(C7290i.m13995b(C0960n.m1999a(sVar2, bVar, aVar2, sb.toString(), 2)));
                dVar3.mo5454o(v4);
            }
            dVar2.mo5406H();
            C1436d i6 = SizeKt.m1489i(C1436d.C1437a.f3125b, 0.0f, bVar.mo3797p(((this.$maxLines - 1) * (((Number) v4).intValue() - intValue)) + intValue), 1);
            dVar2.mo5406H();
            return i6;
        }
    }
}
