package com.appboy.p043ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.etsy.android.uikit.ClickableViewPager;

/* renamed from: com.appboy.ui.f */
public final /* synthetic */ class C4951f implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f11147b;

    /* renamed from: c */
    public final /* synthetic */ Object f11148c;

    public /* synthetic */ C4951f(Object obj, int i) {
        this.f11147b = i;
        this.f11148c = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f11147b) {
            case 0:
                return ((AppboyXamarinFormsFeedFragment) this.f11148c).lambda$onActivityCreated$0(view, motionEvent);
            default:
                return ClickableViewPager.m35097_init_$lambda0((GestureDetector) this.f11148c, view, motionEvent);
        }
    }
}
