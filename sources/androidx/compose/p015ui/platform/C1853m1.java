package androidx.compose.p015ui.platform;

import android.graphics.RenderEffect;
import android.view.View;
import androidx.compose.p015ui.graphics.C1520f0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.m1 */
public final class C1853m1 {

    /* renamed from: a */
    public static final C1853m1 f4108a = new C1853m1();

    /* renamed from: a */
    public final void mo7268a(View view, C1520f0 f0Var) {
        RenderEffect renderEffect;
        C19383o.m32797g(view, "view");
        if (f0Var != null) {
            renderEffect = f0Var.f3295a;
            if (renderEffect == null) {
                renderEffect = f0Var.mo6337a();
                f0Var.f3295a = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }
}
