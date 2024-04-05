package com.appboy.p043ui.widget;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.appboy.ui.widget.BaseCardView$setImageViewToUrl$1 */
public final class BaseCardView$setImageViewToUrl$1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ImageView $imageView;
    public final /* synthetic */ float $placeholderAspectRatio;

    public BaseCardView$setImageViewToUrl$1(ImageView imageView, float f) {
        this.$imageView = imageView;
        this.$placeholderAspectRatio = f;
    }

    public boolean onPreDraw() {
        this.$imageView.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = this.$imageView.getWidth();
        this.$imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (((float) width) / this.$placeholderAspectRatio)));
        return true;
    }
}
