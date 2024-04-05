package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p435rb.C13350a;

public final class CollageVideoBadge extends AppCompatImageView {
    public static final int $stable = 0;
    private final int smallIconSize;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageVideoBadge(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageVideoBadge(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.smallIconSize;
        setMeasuredDimension(i3, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageVideoBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.smallIconSize = context.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller);
        Object obj = C8184a.f17966a;
        setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_badge_status_tertiary_bg));
        setImageDrawable(C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_play_v1));
        setImageTintList(ColorStateList.valueOf(C13350a.m21012c(context, R.color.clg_color_black)));
        setPadding(C13350a.m21015f(3, context), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setContentDescription(C13350a.m21016g(context, R.attr.clg_video_available_content_description, new Object[0]));
    }
}
