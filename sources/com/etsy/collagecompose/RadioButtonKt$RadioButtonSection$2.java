package com.etsy.collagecompose;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.TestTagKt;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

final class RadioButtonKt$RadioButtonSection$2 extends Lambda implements C19862q<C0739i, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C12165m $direction;
    public final /* synthetic */ String $directionString;
    public final /* synthetic */ C19857l<Integer, C19394m> $onOptionSelected;
    public final /* synthetic */ int $selectedOption;
    public final /* synthetic */ C12168n $size;
    public final /* synthetic */ String $sizeString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButtonSection$2(int i, String str, String str2, C19857l<? super Integer, C19394m> lVar, C12168n nVar, C12165m mVar, int i2) {
        super(3);
        this.$selectedOption = i;
        this.$sizeString = str;
        this.$directionString = str2;
        this.$onOptionSelected = lVar;
        this.$size = nVar;
        this.$direction = mVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0739i) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0739i iVar, C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(iVar, "$this$RadioGroup");
        if ((i & 81) != 16 || !dVar.mo5442i()) {
            boolean z = this.$selectedOption == 0;
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d a = TestTagKt.m3948a(aVar, this.$sizeString + this.$directionString);
            String str = this.$sizeString;
            C19857l<Integer, C19394m> lVar = this.$onOptionSelected;
            dVar2.mo5465u(1157296644);
            boolean I = dVar2.mo5408I(lVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new RadioButtonKt$RadioButtonSection$2$1$1(lVar);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            C12168n nVar = this.$size;
            C12165m mVar = this.$direction;
            int i2 = this.$$dirty << 18;
            C1436d.C1437a aVar2 = aVar;
            RadioButtonKt.m19953b(str, z, (C19846a) v, a, (String) null, (String) null, nVar, mVar, false, dVar, (i2 & 3670016) | (i2 & 29360128), 304);
            boolean z2 = this.$selectedOption == 1;
            C1436d a2 = TestTagKt.m3948a(aVar2, this.$sizeString + this.$directionString + "WithDescription");
            String str2 = this.$sizeString;
            C19857l<Integer, C19394m> lVar2 = this.$onOptionSelected;
            dVar2.mo5465u(1157296644);
            boolean I2 = dVar2.mo5408I(lVar2);
            Object v2 = dVar.mo5467v();
            if (I2 || v2 == C1302d.C1303a.f2828a) {
                v2 = new RadioButtonKt$RadioButtonSection$2$2$1(lVar2);
                dVar2.mo5454o(v2);
            }
            dVar.mo5406H();
            C12168n nVar2 = this.$size;
            C12165m mVar2 = this.$direction;
            int i3 = this.$$dirty << 18;
            RadioButtonKt.m19953b(str2, z2, (C19846a) v2, a2, "With description", (String) null, nVar2, mVar2, false, dVar, (i3 & 3670016) | 24576 | (i3 & 29360128), 288);
            boolean z3 = this.$selectedOption == 2;
            C1436d a3 = TestTagKt.m3948a(aVar2, this.$sizeString + this.$directionString + "WithMeta");
            String str3 = this.$sizeString;
            C19857l<Integer, C19394m> lVar3 = this.$onOptionSelected;
            dVar2.mo5465u(1157296644);
            boolean I3 = dVar2.mo5408I(lVar3);
            Object v3 = dVar.mo5467v();
            if (I3 || v3 == C1302d.C1303a.f2828a) {
                v3 = new RadioButtonKt$RadioButtonSection$2$3$1(lVar3);
                dVar2.mo5454o(v3);
            }
            dVar.mo5406H();
            C12168n nVar3 = this.$size;
            C12165m mVar3 = this.$direction;
            int i4 = this.$$dirty << 18;
            RadioButtonKt.m19953b(str3, z3, (C19846a) v3, a3, (String) null, "Meta", nVar3, mVar3, false, dVar, 196608 | (i4 & 3670016) | (i4 & 29360128), 272);
            return;
        }
        dVar.mo5396C();
    }
}
