package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.focus.FocusRequesterModifierKt$focusRequester$2 */
public final class FocusRequesterModifierKt$focusRequester$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1478l $focusRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusRequesterModifierKt$focusRequester$2(C1478l lVar) {
        super(3);
        this.$focusRequester = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-307396750);
        C1478l lVar = this.$focusRequester;
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(lVar);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C1480n(lVar);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1480n nVar = (C1480n) v;
        dVar2.mo5406H();
        return nVar;
    }
}
