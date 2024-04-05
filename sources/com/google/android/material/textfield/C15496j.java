package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: com.google.android.material.textfield.j */
public final class C15496j implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f34783b;

    /* renamed from: c */
    public final /* synthetic */ C15486h f34784c;

    public C15496j(C15486h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f34784c = hVar;
        this.f34783b = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 1) {
            C15486h hVar = this.f34784c;
            hVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - hVar.f34766l;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                z = false;
            }
            if (z) {
                this.f34784c.f34764j = false;
            }
            C15486h.m25079d(this.f34784c, this.f34783b);
        }
        return false;
    }
}
