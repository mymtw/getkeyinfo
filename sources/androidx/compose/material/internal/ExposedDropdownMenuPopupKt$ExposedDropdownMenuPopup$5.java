package androidx.compose.material.internal;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7287g;
import p174m0.C7289h;
import p174m0.C7290i;
import p288y.C8343c;
import p753kq.C19857l;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "childCoordinates");
        LayoutNodeWrapper O = jVar.mo6682O();
        C19383o.m32794d(O);
        long j = O.f3724d;
        long u0 = C0114h.m322u0(O);
        long o = C19421p.m32949o(C7279a.m13954l(C8343c.m16642c(u0)), C7279a.m13954l(C8343c.m16643d(u0)));
        PopupLayout popupLayout = this.$popupLayout;
        int i = (int) (o >> 32);
        popupLayout.f2494h.setValue(new C7289h(i, C7287g.m13992b(o), ((int) (j >> 32)) + i, C7290i.m13995b(j) + C7287g.m13992b(o)));
        this.$popupLayout.updatePosition();
    }
}
