package com.etsy.android.uikit.view.draggable;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DraggablePhotoViewWithShrink$eventHandler$2 extends Lambda implements C19846a<DragEventHandlerWithShrink> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DraggablePhotoViewWithShrink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggablePhotoViewWithShrink$eventHandler$2(Context context, DraggablePhotoViewWithShrink draggablePhotoViewWithShrink) {
        super(0);
        this.$context = context;
        this.this$0 = draggablePhotoViewWithShrink;
    }

    public final DragEventHandlerWithShrink invoke() {
        Context context = this.$context;
        C19383o.m32795e(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        DraggablePhotoViewWithShrink draggablePhotoViewWithShrink = this.this$0;
        return new DragEventHandlerWithShrink((ViewGroup) decorView, draggablePhotoViewWithShrink, draggablePhotoViewWithShrink.swipeListener);
    }
}
