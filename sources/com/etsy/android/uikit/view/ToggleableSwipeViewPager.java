package com.etsy.android.uikit.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public final class ToggleableSwipeViewPager extends ViewPager {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private boolean isSwipeEnabled;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToggleableSwipeViewPager(Context context) {
        this(context, (AttributeSet) null, false, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToggleableSwipeViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableSwipeViewPager(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.isSwipeEnabled = z;
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        return this.isSwipeEnabled && super.onInterceptTouchEvent(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        return this.isSwipeEnabled && super.onTouchEvent(motionEvent);
    }

    public final void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToggleableSwipeViewPager(Context context, AttributeSet attributeSet, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? true : z);
    }
}
