package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p388lb.C13006a;
import p435rb.C13350a;

public final class BadgeTextView extends AppCompatTextView {
    public static final int $stable = 8;
    private PillDrawable backgroundDrawable;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BadgeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setBadgeColor(int i) {
        PillDrawable pillDrawable = this.backgroundDrawable;
        Context context = getContext();
        Object obj = C8184a.f17966a;
        pillDrawable.setPaintColor(C8184a.C8188d.m16468a(context, i));
    }

    public final void setBadgeColorAttr(int i) {
        PillDrawable pillDrawable = this.backgroundDrawable;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        pillDrawable.setPaintColor(C13350a.m21013d(context, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28635b, 0, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…able.BadgeTextView, 0, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, R.color.clg_color_white);
        obtainStyledAttributes.recycle();
        Object obj = C8184a.f17966a;
        PillDrawable pillDrawable = new PillDrawable(C8184a.C8188d.m16468a(context, resourceId));
        this.backgroundDrawable = pillDrawable;
        setBackground(pillDrawable);
    }
}
