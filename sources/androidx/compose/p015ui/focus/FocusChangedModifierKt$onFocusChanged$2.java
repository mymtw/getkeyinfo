package androidx.compose.p015ui.focus;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p098f0.C6767e;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2 */
public final class FocusChangedModifierKt$onFocusChanged$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<C1481o, C19394m> $onFocusChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusChangedModifierKt$onFocusChanged$2(C19857l<? super C1481o, C19394m> lVar) {
        super(3);
        this.$onFocusChanged = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-1741761824);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0((Object) null, C1351n1.f2948a);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1338j0 j0Var = (C1338j0) v;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        final C19857l<C1481o, C19394m> lVar = this.$onFocusChanged;
        C14521 r0 = new C19857l<C1481o, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1481o) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1481o oVar) {
                C19383o.m32797g(oVar, "it");
                if (!C19383o.m32792b(j0Var.getValue(), oVar)) {
                    j0Var.setValue(oVar);
                    lVar.invoke(oVar);
                }
            }
        };
        C6767e<C1467c> eVar = FocusEventModifierKt.f3145a;
        C1436d a = ComposedModifierKt.m3049a(aVar, InspectableValueKt.f4032a, new FocusEventModifierKt$onFocusEvent$2(r0));
        dVar2.mo5406H();
        return a;
    }
}
