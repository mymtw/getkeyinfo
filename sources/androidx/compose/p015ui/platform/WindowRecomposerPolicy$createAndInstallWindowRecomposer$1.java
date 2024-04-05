package androidx.compose.p015ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;

/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1 */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C19699g1 $unsetJob;

    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(C19699g1 g1Var) {
        this.$unsetJob = g1Var;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        view.removeOnAttachStateChangeListener(this);
        this.$unsetJob.mo72134a((CancellationException) null);
    }
}
