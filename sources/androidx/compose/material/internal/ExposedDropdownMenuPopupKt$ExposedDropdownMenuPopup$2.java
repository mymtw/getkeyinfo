package androidx.compose.material.internal;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ LayoutDirection $layoutDirection;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ PopupLayout $popupLayout;
    public final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(PopupLayout popupLayout, C19846a<C19394m> aVar, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$popupLayout.mo5276a(this.$onDismissRequest, this.$testTag, this.$layoutDirection);
    }
}
