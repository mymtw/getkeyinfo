package androidx.compose.p015ui.window;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 */
public final class PopupLayout$canCalculatePosition$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    public final Boolean invoke() {
        return Boolean.valueOf((this.this$0.getParentLayoutCoordinates() == null || this.this$0.m34829getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
