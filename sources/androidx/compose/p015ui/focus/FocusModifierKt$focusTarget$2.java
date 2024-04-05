package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2 */
public final class FocusModifierKt$focusTarget$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public static final FocusModifierKt$focusTarget$2 INSTANCE = new FocusModifierKt$focusTarget$2();

    public FocusModifierKt$focusTarget$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-326009031);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new FocusModifier(FocusStateImpl.Inactive);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final FocusModifier focusModifier = (FocusModifier) v;
        C1415u.m3033g(new C19846a<C19394m>() {
            public final void invoke() {
                C1482p.m3151i(focusModifier);
            }
        }, dVar2);
        C1436d b = FocusModifierKt.m3103b(dVar, focusModifier);
        dVar2.mo5406H();
        return b;
    }
}
