package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.tabs.TabItem;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;

public final class CollageTabItem extends TabItem {
    public static final int $stable = 8;
    private int badgeCount;
    private Integer badgeIcon;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTabItem(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTabItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final int getBadgeCount() {
        return this.badgeCount;
    }

    public final Integer getBadgeIcon() {
        return this.badgeIcon;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28654u);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…styleable.CollageTabItem)");
            this.badgeCount = obtainStyledAttributes.getInteger(0, 0);
            this.badgeIcon = Integer.valueOf(obtainStyledAttributes.getResourceId(1, -1));
            obtainStyledAttributes.recycle();
        }
    }
}
