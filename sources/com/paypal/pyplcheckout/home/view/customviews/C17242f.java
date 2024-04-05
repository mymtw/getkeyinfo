package com.paypal.pyplcheckout.home.view.customviews;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.f */
public final /* synthetic */ class C17242f implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ EditText f37757b;

    /* renamed from: c */
    public final /* synthetic */ View f37758c;

    public /* synthetic */ C17242f(EditText editText, View view) {
        this.f37757b = editText;
        this.f37758c = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return AddCardView.m35285onDeleteAndEmptyRequestFocus$lambda17(this.f37757b, this.f37758c, view, i, keyEvent);
    }
}
