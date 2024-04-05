package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2364y;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;

public final class CollageHeadingLayout extends ConstraintLayout {
    public static final int $stable = 8;
    private View accessibilityHeadingView;
    private int accessibilityHeadingViewId;
    private boolean isAddingHeadingView;
    private boolean isFirstConstruct;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageHeadingLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageHeadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageHeadingLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void addHeadingView$default(CollageHeadingLayout collageHeadingLayout, View view, Integer num, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        collageHeadingLayout.addHeadingView(view, num, layoutParams);
    }

    private final void makeChildrenFocusable() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!childAt.isFocusable()) {
                childAt.setFocusable(true);
            }
        }
        invalidate();
        requestLayout();
    }

    public final void addHeadingView(View view, Integer num, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(view, "child");
        this.isAddingHeadingView = true;
        if (num == null && layoutParams == null) {
            addView(view);
        } else if (num == null && layoutParams != null) {
            addView(view, layoutParams);
        } else if (num != null && layoutParams == null) {
            addView(view, num.intValue());
        } else if (num != null && layoutParams == null) {
            addView(view, num.intValue(), layoutParams);
        }
        setAccessibilityHeadingView(view);
        makeChildrenFocusable();
        this.isAddingHeadingView = false;
    }

    public final View getAccessibilityHeadingView() {
        return this.accessibilityHeadingView;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.accessibilityHeadingViewId == getId()) {
            setAccessibilityHeadingView(this);
            return;
        }
        View findViewById = findViewById(this.accessibilityHeadingViewId);
        C19383o.m32796f(findViewById, "findViewById(accessibilityHeadingViewId)");
        setAccessibilityHeadingView(findViewById);
        makeChildrenFocusable();
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null && !this.isAddingHeadingView) {
            if (view.getId() == this.accessibilityHeadingViewId && !this.isFirstConstruct) {
                setAccessibilityHeadingView(view);
                makeChildrenFocusable();
            } else if (!C19383o.m32792b(this.accessibilityHeadingView, this)) {
                makeChildrenFocusable();
            }
        }
    }

    public final void setAccessibilityHeadingView(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == this.accessibilityHeadingViewId) {
            View view2 = this.accessibilityHeadingView;
            C19383o.m32797g(view2, "<this>");
            if (C2364y.m5194i(view2) && !this.isFirstConstruct) {
                return;
            }
        }
        if (view.getId() != getId() && findViewById(view.getId()) == null) {
            StringBuilder h = C0072d.m201h("The reference to ");
            h.append(getResources().getResourceName(view.getId()));
            h.append(" no exists in this layout.");
            throw new NullPointerException(h.toString());
        } else if (ViewsExtensionsKt.m17424c(view, true)) {
            if (this.isFirstConstruct) {
                this.isFirstConstruct = false;
            } else {
                ViewsExtensionsKt.m17424c(this.accessibilityHeadingView, false);
            }
            this.accessibilityHeadingViewId = view.getId();
            this.accessibilityHeadingView = view;
            invalidate();
            requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageHeadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.isFirstConstruct = true;
        this.accessibilityHeadingViewId = getId();
        this.accessibilityHeadingView = this;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28646m);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…ble.CollageHeadingLayout)");
            this.accessibilityHeadingViewId = obtainStyledAttributes.getResourceId(0, getId());
            obtainStyledAttributes.recycle();
        }
    }
}
