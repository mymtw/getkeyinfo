package androidx.compose.p015ui.platform;

import android.view.RenderNode;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.y0 */
public final class C1890y0 {

    /* renamed from: a */
    public static final C1890y0 f4169a = new C1890y0();

    /* renamed from: a */
    public final int mo7291a(RenderNode renderNode) {
        C19383o.m32797g(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public final int mo7292b(RenderNode renderNode) {
        C19383o.m32797g(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public final void mo7293c(RenderNode renderNode, int i) {
        C19383o.m32797g(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    /* renamed from: d */
    public final void mo7294d(RenderNode renderNode, int i) {
        C19383o.m32797g(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
