package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.internal.C15370j;
import com.google.android.material.tabs.TabLayout;
import p629nk.C18268a;

/* renamed from: com.google.android.material.tabs.a */
public class C15456a {
    /* renamed from: a */
    public static RectF m25053a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int b = (int) C15370j.m24961b(tabView.getContext(), 24);
        if (contentWidth < b) {
            contentWidth = b;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    /* renamed from: b */
    public void mo54884b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m25053a(tabLayout, view);
        RectF a2 = m25053a(tabLayout, view2);
        int i = (int) a.left;
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        int round = Math.round(((float) (((int) a2.left) - i)) * f) + i;
        int i2 = drawable.getBounds().top;
        int i3 = (int) a.right;
        drawable.setBounds(round, i2, Math.round(f * ((float) (((int) a2.right) - i3))) + i3, drawable.getBounds().bottom);
    }
}
