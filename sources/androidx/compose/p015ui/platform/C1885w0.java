package androidx.compose.p015ui.platform;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import androidx.compose.p015ui.graphics.C1520f0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.w0 */
public final class C1885w0 {

    /* renamed from: a */
    public static final C1885w0 f4165a = new C1885w0();

    /* renamed from: a */
    public final void mo7288a(RenderNode renderNode, C1520f0 f0Var) {
        RenderEffect renderEffect;
        C19383o.m32797g(renderNode, "renderNode");
        if (f0Var != null) {
            renderEffect = f0Var.f3295a;
            if (renderEffect == null) {
                renderEffect = f0Var.mo6337a();
                f0Var.f3295a = renderEffect;
            }
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }
}
