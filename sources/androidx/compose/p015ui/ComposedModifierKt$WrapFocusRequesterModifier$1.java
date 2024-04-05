package androidx.compose.p015ui;

import androidx.compose.p015ui.focus.C1479m;
import androidx.compose.p015ui.focus.C1480n;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.ComposedModifierKt$WrapFocusRequesterModifier$1 */
public final class ComposedModifierKt$WrapFocusRequesterModifier$1 extends Lambda implements C19862q<C1479m, C1302d, Integer, C1480n> {
    public static final ComposedModifierKt$WrapFocusRequesterModifier$1 INSTANCE = new ComposedModifierKt$WrapFocusRequesterModifier$1();

    public ComposedModifierKt$WrapFocusRequesterModifier$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1479m) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1480n invoke(C1479m mVar, C1302d dVar, int i) {
        C19383o.m32797g(mVar, "mod");
        dVar.mo5465u(945678692);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(mVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C1480n(mVar.mo6219J());
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1480n nVar = (C1480n) v;
        dVar.mo5406H();
        return nVar;
    }
}
