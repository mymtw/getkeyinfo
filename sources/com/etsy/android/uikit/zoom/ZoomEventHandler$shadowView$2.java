package com.etsy.android.uikit.zoom;

import android.view.View;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ZoomEventHandler$shadowView$2 extends Lambda implements C19846a<View> {
    public final /* synthetic */ ZoomEventHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZoomEventHandler$shadowView$2(ZoomEventHandler zoomEventHandler) {
        super(0);
        this.this$0 = zoomEventHandler;
    }

    public final View invoke() {
        return new View(this.this$0.f26811b.getContext());
    }
}
