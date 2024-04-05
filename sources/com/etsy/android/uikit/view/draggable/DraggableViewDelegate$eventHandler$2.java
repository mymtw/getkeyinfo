package com.etsy.android.uikit.view.draggable;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DraggableViewDelegate$eventHandler$2 extends Lambda implements C19846a<DragEventHandler> {
    public final /* synthetic */ DraggableViewDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableViewDelegate$eventHandler$2(DraggableViewDelegate draggableViewDelegate) {
        super(0);
        this.this$0 = draggableViewDelegate;
    }

    public final DragEventHandler invoke() {
        Context access$getContext$p = this.this$0.context;
        C19383o.m32795e(access$getContext$p, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) access$getContext$p).getWindow().getDecorView();
        C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return new DragEventHandler((ViewGroup) decorView, this.this$0.target, this.this$0.swipeListener);
    }
}
