package com.etsy.android.uikit.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"ClickableViewAccessibility"})
public final class FragmentViewPager extends ViewPager {
    public static final int $stable = 8;
    public static final C11916a Companion = new C11916a();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private boolean isSwipeEnabled;

    /* renamed from: com.etsy.android.uikit.view.FragmentViewPager$a */
    public static final class C11916a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewPager(Context context) {
        super(context);
        C19383o.m32794d(context);
        this.isSwipeEnabled = true;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean isSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.isSwipeEnabled && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.isSwipeEnabled && super.onTouchEvent(motionEvent);
    }

    public final void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32794d(context);
        this.isSwipeEnabled = true;
    }
}
