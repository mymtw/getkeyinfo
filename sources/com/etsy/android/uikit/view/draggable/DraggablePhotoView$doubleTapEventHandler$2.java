package com.etsy.android.uikit.view.draggable;

import android.content.Context;
import com.etsy.android.uikit.view.DoubleTapEventHandler;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DraggablePhotoView$doubleTapEventHandler$2 extends Lambda implements C19846a<DoubleTapEventHandler> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DraggablePhotoView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggablePhotoView$doubleTapEventHandler$2(Context context, DraggablePhotoView draggablePhotoView) {
        super(0);
        this.$context = context;
        this.this$0 = draggablePhotoView;
    }

    public final DoubleTapEventHandler invoke() {
        return new DoubleTapEventHandler(this.$context, this.this$0.doubleTapListener);
    }
}
