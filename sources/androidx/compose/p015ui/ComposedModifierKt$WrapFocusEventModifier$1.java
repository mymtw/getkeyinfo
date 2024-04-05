package androidx.compose.p015ui;

import androidx.compose.p015ui.focus.C1466b;
import androidx.compose.p015ui.focus.C1467c;
import androidx.compose.p015ui.focus.FocusStateImpl;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1 */
public final class ComposedModifierKt$WrapFocusEventModifier$1 extends Lambda implements C19862q<C1466b, C1302d, Integer, C1467c> {
    public static final ComposedModifierKt$WrapFocusEventModifier$1 INSTANCE = new ComposedModifierKt$WrapFocusEventModifier$1();

    public ComposedModifierKt$WrapFocusEventModifier$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1466b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1467c invoke(C1466b bVar, C1302d dVar, int i) {
        C19383o.m32797g(bVar, "mod");
        dVar.mo5465u(-1790596922);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(bVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C1467c(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(bVar));
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        final C1467c cVar = (C1467c) v;
        C1415u.m3033g(new C19846a<C19394m>() {
            public final void invoke() {
                C1467c cVar = cVar;
                if (cVar.f3177e.mo20239m()) {
                    cVar.f3174b.invoke(FocusStateImpl.Inactive);
                }
            }
        }, dVar);
        dVar.mo5406H();
        return cVar;
    }
}
