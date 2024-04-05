package com.etsy.android.stylekit.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class CollageTextWithTooltip$tooltipView$2 extends Lambda implements C19846a<View> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTextWithTooltip$tooltipView$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final View invoke() {
        return LayoutInflater.from(this.$context).inflate(R.layout.clg_tooltip_layout, (ViewGroup) null);
    }
}
