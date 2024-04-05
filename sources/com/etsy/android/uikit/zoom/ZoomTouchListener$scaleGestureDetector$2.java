package com.etsy.android.uikit.zoom;

import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ZoomTouchListener$scaleGestureDetector$2 extends Lambda implements C19846a<ScaleGestureDetector> {
    public final /* synthetic */ ZoomTouchListener this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZoomTouchListener$scaleGestureDetector$2(ZoomTouchListener zoomTouchListener) {
        super(0);
        this.this$0 = zoomTouchListener;
    }

    public final ScaleGestureDetector invoke() {
        return new ScaleGestureDetector(this.this$0.target.getContext(), this.this$0);
    }
}
