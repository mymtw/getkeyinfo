package androidx.compose.foundation.relocation;

import androidx.activity.C0114h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class BringIntoViewResponderKt$bringIntoViewResponder$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0884f $responder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderKt$bringIntoViewResponder$2(C0884f fVar) {
        super(3);
        this.$responder = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-852052847);
        C0879a w0 = C0114h.m326w0(dVar2);
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(w0);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new BringIntoViewResponderModifier(w0);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) v;
        C0884f fVar = this.$responder;
        bringIntoViewResponderModifier.getClass();
        C19383o.m32797g(fVar, "<set-?>");
        bringIntoViewResponderModifier.f1887e = fVar;
        dVar2.mo5406H();
        return bringIntoViewResponderModifier;
    }
}
