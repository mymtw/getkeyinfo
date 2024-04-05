package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class CollageTextWithTooltip$tooltipAnchorBottom$2 extends Lambda implements C19846a<View> {
    public final /* synthetic */ CollageTextWithTooltip this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTextWithTooltip$tooltipAnchorBottom$2(CollageTextWithTooltip collageTextWithTooltip) {
        super(0);
        this.this$0 = collageTextWithTooltip;
    }

    public final View invoke() {
        return this.this$0.getTooltipView().findViewById(R.id.tooltip_anchor_bottom);
    }
}
