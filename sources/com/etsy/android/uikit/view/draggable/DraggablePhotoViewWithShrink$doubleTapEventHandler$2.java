package com.etsy.android.uikit.view.draggable;

import android.content.Context;
import com.etsy.android.uikit.view.DoubleTapEventHandler;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DraggablePhotoViewWithShrink$doubleTapEventHandler$2 extends Lambda implements C19846a<DoubleTapEventHandler> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DraggablePhotoViewWithShrink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggablePhotoViewWithShrink$doubleTapEventHandler$2(Context context, DraggablePhotoViewWithShrink draggablePhotoViewWithShrink) {
        super(0);
        this.$context = context;
        this.this$0 = draggablePhotoViewWithShrink;
    }

    public final DoubleTapEventHandler invoke() {
        return new DoubleTapEventHandler(this.$context, this.this$0.doubleTapListener);
    }
}
