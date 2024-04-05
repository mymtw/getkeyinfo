package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.PopupWindow;

public final class CollageTextWithTooltip$2$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ PopupWindow $popupWindow;
    public final /* synthetic */ CollageTextWithTooltip this$0;

    public CollageTextWithTooltip$2$1(PopupWindow popupWindow, CollageTextWithTooltip collageTextWithTooltip) {
        this.$popupWindow = popupWindow;
        this.this$0 = collageTextWithTooltip;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[2];
        this.$popupWindow.getContentView().getLocationOnScreen(iArr);
        int i9 = iArr[0];
        float x = this.this$0.getX() + ((float) (this.this$0.getWidth() / 2));
        int width = this.this$0.getTooltipAnchorBottom().getWidth();
        int width2 = this.this$0.getTooltipAnchorTop().getWidth();
        if (width < width2) {
            width = width2;
        }
        float f = (x - ((float) i9)) - ((float) (width / 2));
        this.this$0.getTooltipAnchorBottom().setTranslationX(f);
        this.this$0.getTooltipAnchorTop().setTranslationX(f);
        this.$popupWindow.getContentView().removeOnLayoutChangeListener(this);
    }
}
