package androidx.compose.p015ui.window;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 */
public final class AndroidPopup_androidKt$Popup$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ LayoutDirection $layoutDirection;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ C2093f $properties;
    public final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3(PopupLayout popupLayout, C19846a<C19394m> aVar, C2093f fVar, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = fVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
    }
}
