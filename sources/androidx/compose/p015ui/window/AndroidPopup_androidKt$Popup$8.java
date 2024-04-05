package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 */
public final class AndroidPopup_androidKt$Popup$8 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ PopupLayout f4707a;

    /* renamed from: b */
    public final /* synthetic */ LayoutDirection f4708b;

    public AndroidPopup_androidKt$Popup$8(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f4707a = popupLayout;
        this.f4708b = layoutDirection;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "<anonymous parameter 0>");
        this.f4707a.setParentLayoutDirection(this.f4708b);
        return xVar.mo4387Z(0, 0, C19294b0.m32559p0(), AndroidPopup_androidKt$Popup$8$measure$1.INSTANCE);
    }
}
