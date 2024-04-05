package androidx.compose.p015ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1 */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public final void invoke() {
        MotionEvent access$getPreviousMotionEvent$p = this.this$0.previousMotionEvent;
        if (access$getPreviousMotionEvent$p != null) {
            int actionMasked = access$getPreviousMotionEvent$p.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.resendMotionEventRunnable);
            }
        }
    }
}
