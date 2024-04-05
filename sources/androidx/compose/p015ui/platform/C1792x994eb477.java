package androidx.compose.p015ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C2324p0;
import com.etsy.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 */
public final class C1792x994eb477 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractComposeView $view;

    public C1792x994eb477(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        boolean z;
        C19383o.m32797g(view, "v");
        AbstractComposeView abstractComposeView = this.$view;
        C19383o.m32797g(abstractComposeView, "<this>");
        Iterator it = C2324p0.m5057a(abstractComposeView).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ViewParent viewParent = (ViewParent) it.next();
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                C19383o.m32797g(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (z) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            this.$view.disposeComposition();
        }
    }
}
