package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$2 */
final class FocusEventModifierKt$onFocusEvent$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<C1481o, C19394m> $onFocusEvent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusEventModifierKt$onFocusEvent$2(C19857l<? super C1481o, C19394m> lVar) {
        super(3);
        this.$onFocusEvent = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(607036704);
        C19857l<C1481o, C19394m> lVar = this.$onFocusEvent;
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(lVar);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C1467c(lVar);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1467c cVar = (C1467c) v;
        C1415u.m3033g(new C19846a<C19394m>() {
            public final void invoke() {
                C1467c cVar = cVar;
                if (cVar.f3177e.mo20239m()) {
                    cVar.f3174b.invoke(FocusStateImpl.Inactive);
                }
            }
        }, dVar2);
        dVar2.mo5406H();
        return cVar;
    }
}
