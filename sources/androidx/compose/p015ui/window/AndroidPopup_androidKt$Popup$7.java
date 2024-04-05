package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 */
public final class AndroidPopup_androidKt$Popup$7 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7(PopupLayout popupLayout) {
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
        this.$popupLayout.updateParentLayoutCoordinates(O);
    }
}
