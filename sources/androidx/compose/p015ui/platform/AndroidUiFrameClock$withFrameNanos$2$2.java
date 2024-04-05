package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2 */
public final class AndroidUiFrameClock$withFrameNanos$2$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ AndroidUiFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.this$0 = androidUiFrameClock;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.this$0.f4011b.removeFrameCallback(this.$callback);
    }
}
