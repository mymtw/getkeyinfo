package com.etsy.android.uikit.view.draggable;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DragEventHandler$dragDiffThreshold$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ DragEventHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragEventHandler$dragDiffThreshold$2(DragEventHandler dragEventHandler) {
        super(0);
        this.this$0 = dragEventHandler;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.this$0.f26504a.getHeight() / 2);
    }
}
