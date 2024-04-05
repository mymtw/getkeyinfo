package androidx.compose.p015ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.ViewLayerContainer */
public final class ViewLayerContainer extends DrawChildContainer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayerContainer(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void dispatchDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}
