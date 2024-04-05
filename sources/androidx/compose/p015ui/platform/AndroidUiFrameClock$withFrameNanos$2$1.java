package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1 */
public final class AndroidUiFrameClock$withFrameNanos$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ AndroidUiDispatcher $uiDispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$uiDispatcher = androidUiDispatcher;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        AndroidUiDispatcher androidUiDispatcher = this.$uiDispatcher;
        Choreographer.FrameCallback frameCallback = this.$callback;
        androidUiDispatcher.getClass();
        C19383o.m32797g(frameCallback, "callback");
        synchronized (androidUiDispatcher.f4003e) {
            androidUiDispatcher.f4005g.remove(frameCallback);
        }
    }
}
