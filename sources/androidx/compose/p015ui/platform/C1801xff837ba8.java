package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1 */
public final class C1801xff837ba8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;

    public C1801xff837ba8(View view, Recomposer recomposer) {
        this.$this_createLifecycleAwareWindowRecomposer = view;
        this.$recomposer = recomposer;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        this.$this_createLifecycleAwareWindowRecomposer.removeOnAttachStateChangeListener(this);
        this.$recomposer.mo5575y();
    }
}
