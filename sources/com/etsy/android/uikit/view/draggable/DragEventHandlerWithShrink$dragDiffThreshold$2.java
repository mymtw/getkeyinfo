package com.etsy.android.uikit.view.draggable;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DragEventHandlerWithShrink$dragDiffThreshold$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ DragEventHandlerWithShrink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragEventHandlerWithShrink$dragDiffThreshold$2(DragEventHandlerWithShrink dragEventHandlerWithShrink) {
        super(0);
        this.this$0 = dragEventHandlerWithShrink;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.this$0.f26516a.getHeight() / 2);
    }
}
