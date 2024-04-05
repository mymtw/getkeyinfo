package com.etsy.android.uikit.zoom;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ZoomTouchListener$gestureListener$2 extends Lambda implements C19846a<ViewZoomDoubleTapGestureListener> {
    public final /* synthetic */ ZoomTouchListener this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZoomTouchListener$gestureListener$2(ZoomTouchListener zoomTouchListener) {
        super(0);
        this.this$0 = zoomTouchListener;
    }

    public final ViewZoomDoubleTapGestureListener invoke() {
        return new ViewZoomDoubleTapGestureListener(this.this$0.target, this.this$0.singleTapListener, this.this$0.doubleTapListener);
    }
}
