package com.etsy.android.uikit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.appboy.p043ui.C4951f;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@SuppressLint({"ClickableViewAccessibility"})
public final class ClickableViewPager extends ViewPager {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public View.OnClickListener onClickListener;
    /* access modifiers changed from: private */
    public View.OnLongClickListener onLongPressListener;

    /* renamed from: com.etsy.android.uikit.ClickableViewPager$a */
    public final class C11822a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public final View f26301b;

        /* renamed from: c */
        public final /* synthetic */ ClickableViewPager f26302c;

        public C11822a(ClickableViewPager clickableViewPager, View view) {
            C19383o.m32797g(view, "view");
            this.f26302c = clickableViewPager;
            this.f26301b = view;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C19383o.m32797g(motionEvent, "e");
            super.onLongPress(motionEvent);
            this.f26301b.performLongClick();
            this.f26301b.performHapticFeedback(0);
            View.OnLongClickListener access$getOnLongPressListener$p = this.f26302c.onLongPressListener;
            if (access$getOnLongPressListener$p != null) {
                access$getOnLongPressListener$p.onLongClick(this.f26301b);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C19383o.m32797g(motionEvent, "e");
            this.f26301b.performClick();
            View.OnClickListener access$getOnClickListener$p = this.f26302c.onClickListener;
            if (access$getOnClickListener$p == null) {
                return true;
            }
            access$getOnClickListener$p.onClick(this.f26301b);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        setOnTouchListener(new C4951f(new GestureDetector(context, new C11822a(this, this)), 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final boolean m35097_init_$lambda0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        C19383o.m32797g(gestureDetector, "$onSingleTapConfirmedGestureDetector");
        gestureDetector.onTouchEvent(motionEvent);
        return false;
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

    public void setOnClickListener(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongPressListener = onLongClickListener;
    }
}
