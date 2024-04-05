package com.etsy.android.stylekit.views;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.etsy.android.stylekit.views.q */
public final /* synthetic */ class C9068q implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ CollageTextInput f19950b;

    public /* synthetic */ C9068q(CollageTextInput collageTextInput) {
        this.f19950b = collageTextInput;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return CollageTextInput.m34900_init_$lambda1(this.f19950b, textView, i, keyEvent);
    }
}
