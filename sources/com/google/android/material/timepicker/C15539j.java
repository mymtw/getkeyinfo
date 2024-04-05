package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.j */
public final class C15539j implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f34918b;

    public C15539j(GestureDetector gestureDetector) {
        this.f34918b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f34918b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
