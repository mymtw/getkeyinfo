package com.reddit.indicatorfastscroll;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.etsy.android.R;
import com.reddit.indicatorfastscroll.C17346a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FastScrollerView$bindItemIndicatorViews$1 extends Lambda implements C19857l<C17346a.C17347a, ImageView> {
    public final /* synthetic */ FastScrollerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$bindItemIndicatorViews$1(FastScrollerView fastScrollerView) {
        super(1);
        this.this$0 = fastScrollerView;
    }

    public final ImageView invoke(C17346a.C17347a aVar) {
        C19383o.m32798h(aVar, "iconIndicator");
        View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.fast_scroller_indicator_icon, this.this$0, false);
        if (inflate != null) {
            ImageView imageView = (ImageView) inflate;
            ColorStateList iconColor = this.this$0.getIconColor();
            if (iconColor != null) {
                imageView.setImageTintList(iconColor);
            }
            imageView.setImageResource(0);
            imageView.setTag(aVar);
            return imageView;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
