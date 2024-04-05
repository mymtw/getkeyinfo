package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import com.etsy.collagecompose.C12142d;
import com.etsy.collagecompose.C12145e;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class DialogKt$Dialog$1$1$1$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19846a<C19394m> $confirmButtonOnClick;
    public final /* synthetic */ String $confirmButtonText;
    public final /* synthetic */ C19846a<C19394m> $dismissButtonOnClick;
    public final /* synthetic */ String $dismissButtonText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$Dialog$1$1$1$3(String str, C19846a<C19394m> aVar, int i, String str2, C19846a<C19394m> aVar2) {
        super(2);
        this.$dismissButtonText = str;
        this.$dismissButtonOnClick = aVar;
        this.$$dirty = i;
        this.$confirmButtonText = str2;
        this.$confirmButtonOnClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C19846a<C19394m> aVar;
        C19846a<C19394m> aVar2;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            dVar.mo5465u(1811418902);
            String str = this.$dismissButtonText;
            if (!(str == null || (aVar2 = this.$dismissButtonOnClick) == null)) {
                C12145e.C12149d dVar2 = C12145e.C12149d.f27086a;
                C12142d.C12144b bVar = C12142d.C12144b.f27082a;
                int i2 = this.$$dirty;
                ButtonKt.m19939a(dVar2, aVar2, (C1436d) null, str, (String) null, bVar, (Integer) null, false, false, dVar, ((i2 >> 18) & 112) | 196614 | ((i2 >> 9) & 7168), 468);
            }
            dVar.mo5406H();
            String str2 = this.$confirmButtonText;
            if (str2 != null && (aVar = this.$confirmButtonOnClick) != null) {
                C12145e.C12146a aVar3 = C12145e.C12146a.f27083a;
                C12142d.C12144b bVar2 = C12142d.C12144b.f27082a;
                int i3 = this.$$dirty;
                ButtonKt.m19939a(aVar3, aVar, (C1436d) null, str2, (String) null, bVar2, (Integer) null, false, false, dVar, 196614 | ((i3 >> 12) & 112) | ((i3 >> 3) & 7168), 468);
                return;
            }
            return;
        }
        dVar.mo5396C();
    }
}
