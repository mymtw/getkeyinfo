package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class IndicationKt$indication$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0871p $indication;
    public final /* synthetic */ C0639i $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(C0871p pVar, C0639i iVar) {
        super(3);
        this.$indication = pVar;
        this.$interactionSource = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-353972293);
        C0871p pVar = this.$indication;
        if (pVar == null) {
            pVar = C1027u.f2156a;
        }
        C0872q a = pVar.mo3872a(this.$interactionSource, dVar2);
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(a);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0873r(a);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C0873r rVar = (C0873r) v;
        dVar2.mo5406H();
        return rVar;
    }
}
