package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Choreographer.FrameCallback $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$callback = frameCallback;
    }

    public final void invoke(Throwable th) {
        DefaultChoreographerFrameClock.f2760c.removeFrameCallback(this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
