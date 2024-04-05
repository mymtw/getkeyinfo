package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: com.google.android.material.timepicker.i */
public final class C15538i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    public final /* synthetic */ TimePickerView f34917b;

    public C15538i(TimePickerView timePickerView) {
        this.f34917b = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView.C15523c cVar = this.f34917b.f34883i;
        if (cVar == null) {
            return false;
        }
        cVar.onDoubleTap();
        return true;
    }
}
