package com.etsy.android.stylekit.views;

import android.graphics.RectF;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class LoadingIndicatorDrawable$fBounds$2 extends Lambda implements C19846a<RectF> {
    public final /* synthetic */ LoadingIndicatorDrawable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorDrawable$fBounds$2(LoadingIndicatorDrawable loadingIndicatorDrawable) {
        super(0);
        this.this$0 = loadingIndicatorDrawable;
    }

    public final RectF invoke() {
        RectF rectF = new RectF();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.this$0;
        rectF.left = (loadingIndicatorDrawable.borderWidth / 2.0f) + ((float) loadingIndicatorDrawable.getBounds().left) + 0.5f;
        rectF.right = (((float) loadingIndicatorDrawable.getBounds().right) - (loadingIndicatorDrawable.borderWidth / 2.0f)) - 0.5f;
        rectF.top = (loadingIndicatorDrawable.borderWidth / 2.0f) + ((float) loadingIndicatorDrawable.getBounds().top) + 0.5f;
        rectF.bottom = (((float) loadingIndicatorDrawable.getBounds().bottom) - (loadingIndicatorDrawable.borderWidth / 2.0f)) - 0.5f;
        return rectF;
    }
}
