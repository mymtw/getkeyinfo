package com.etsy.android.uikit.view.draggable;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DraggablePhotoView$eventHandler$2 extends Lambda implements C19846a<DragEventHandler> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DraggablePhotoView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggablePhotoView$eventHandler$2(Context context, DraggablePhotoView draggablePhotoView) {
        super(0);
        this.$context = context;
        this.this$0 = draggablePhotoView;
    }

    public final DragEventHandler invoke() {
        Context context = this.$context;
        C19383o.m32795e(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        DraggablePhotoView draggablePhotoView = this.this$0;
        return new DragEventHandler((ViewGroup) decorView, draggablePhotoView, draggablePhotoView.swipeListener);
    }
}
