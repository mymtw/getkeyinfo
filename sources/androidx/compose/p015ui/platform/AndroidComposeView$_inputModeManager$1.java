package androidx.compose.p015ui.platform;

import kotlin.jvm.internal.Lambda;
import p031c0.C4350a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1 */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements C19857l<C4350a, Boolean> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34798invokeiuPiT84(((C4350a) obj).f9578a);
    }

    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m34798invokeiuPiT84(int i) {
        boolean z = false;
        if (i == 1) {
            z = this.this$0.isInTouchMode();
        } else {
            if (i == 2) {
                z = this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true;
            }
        }
        return Boolean.valueOf(z);
    }
}
