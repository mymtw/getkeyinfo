package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.AutoDismissBottomSheetBehavior */
public final class AutoDismissBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoDismissBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C19383o.m32797g(coordinatorLayout, ResponseConstants.PARENT);
        C19383o.m32797g(v, "bottomSheet");
        C19383o.m32797g(motionEvent, "event");
        if ((v.getVisibility() == 0) && getState() != 5 && motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            v.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                setState(5);
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
    }
}
