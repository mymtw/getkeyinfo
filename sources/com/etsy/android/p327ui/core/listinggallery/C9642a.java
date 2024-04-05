package com.etsy.android.p327ui.core.listinggallery;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.a */
public final /* synthetic */ class C9642a implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f21356b;

    /* renamed from: c */
    public final /* synthetic */ ScaleGestureDetector f21357c;

    public /* synthetic */ C9642a(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        this.f21356b = gestureDetector;
        this.f21357c = scaleGestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f21356b;
        ScaleGestureDetector scaleGestureDetector = this.f21357c;
        C19383o.m32797g(gestureDetector, "$gestureDetector");
        C19383o.m32797g(scaleGestureDetector, "$scaleGestureDetector");
        C19383o.m32797g(view, "v");
        C19383o.m32797g(motionEvent, "event");
        if (gestureDetector.onTouchEvent(motionEvent)) {
            view.performClick();
            return true;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }
}
