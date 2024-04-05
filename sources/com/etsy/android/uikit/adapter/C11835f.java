package com.etsy.android.uikit.adapter;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter;

/* renamed from: com.etsy.android.uikit.adapter.f */
public final /* synthetic */ class C11835f implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f26313b;

    /* renamed from: c */
    public final /* synthetic */ Object f26314c;

    /* renamed from: d */
    public final /* synthetic */ Object f26315d;

    public /* synthetic */ C11835f(int i, Object obj, Object obj2) {
        this.f26313b = i;
        this.f26314c = obj;
        this.f26315d = obj2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f26313b) {
            case 0:
                ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) this.f26315d;
                if (((GestureDetector) this.f26314c).onTouchEvent(motionEvent)) {
                    view.performClick();
                    return true;
                }
                scaleGestureDetector.onTouchEvent(motionEvent);
                return true;
            default:
                return AddressBookAdapter.m35156onBindViewHolder$lambda0((AddressBookAdapter) this.f26314c, (RecyclerView.C3084b0) this.f26315d, view, motionEvent);
        }
    }
}
