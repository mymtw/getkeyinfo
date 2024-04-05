package androidx.compose.material.internal;

import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ PopupLayout f2484a;

    /* renamed from: b */
    public final /* synthetic */ LayoutDirection f2485b;

    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f2484a = popupLayout;
        this.f2485b = layoutDirection;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "<anonymous parameter 0>");
        PopupLayout popupLayout = this.f2484a;
        LayoutDirection layoutDirection = this.f2485b;
        popupLayout.getClass();
        C19383o.m32797g(layoutDirection, "<set-?>");
        popupLayout.f2493g = layoutDirection;
        return xVar.mo4387Z(0, 0, C19294b0.m32559p0(), ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1.INSTANCE);
    }
}
