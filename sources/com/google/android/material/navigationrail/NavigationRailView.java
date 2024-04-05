package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0340p0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import com.google.android.material.internal.C15370j;
import com.google.android.material.navigation.NavigationBarView;
import java.util.WeakHashMap;
import p610kp.C18161c;

public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    public static final int DEFAULT_MENU_GRAVITY = 49;
    public static final int MAX_ITEM_COUNT = 7;
    public static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private View headerView;
    private final int topMargin;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$a */
    public class C15390a implements C15370j.C15372b {
        /* renamed from: a */
        public final C2348w0 mo53146a(View view, C2348w0 w0Var, C15370j.C15373c cVar) {
            cVar.f34523b = w0Var.mo8948g() + cVar.f34523b;
            cVar.f34525d = w0Var.mo8944d() + cVar.f34525d;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(view) != 1) {
                z = false;
            }
            int e = w0Var.mo8945e();
            int f = w0Var.mo8947f();
            int i = cVar.f34522a;
            if (z) {
                e = f;
            }
            int i2 = i + e;
            cVar.f34522a = i2;
            C2364y.C2369e.m5240k(view, i2, cVar.f34523b, cVar.f34524c, cVar.f34525d);
            return w0Var;
        }
    }

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void applyWindowInsets() {
        C15370j.m24960a(this, new C15390a());
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private boolean isHeaderViewVisible() {
        View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        int paddingLeft = getPaddingLeft();
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + paddingLeft + suggestedMinimumWidth), 1073741824);
    }

    public void addHeaderView(int i) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public View getHeaderView() {
        return this.headerView;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i5 = this.topMargin;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int makeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(makeMinWidthSpec, i2);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), makeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setItemMinimumHeight(int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    public NavigationRailMenuView createNavigationBarMenuView(Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132018630);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.topMargin = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        C0340p0 e = C15367g.m24958e(getContext(), attributeSet, C18161c.f39674Q, i, i2, new int[0]);
        int i3 = e.mo3105i(0, 0);
        if (i3 != 0) {
            addHeaderView(i3);
        }
        setMenuGravity(e.mo3104h(2, 49));
        if (e.mo3108l(1)) {
            setItemMinimumHeight(e.mo3100d(1, -1));
        }
        e.mo3109n();
        applyWindowInsets();
    }
}
