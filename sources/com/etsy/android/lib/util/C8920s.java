package com.etsy.android.lib.util;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.etsy.android.lib.util.s */
public final class C8920s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f19678b;

    /* renamed from: c */
    public final /* synthetic */ InputMethodManager f19679c;

    public C8920s(EditText editText, InputMethodManager inputMethodManager) {
        this.f19678b = editText;
        this.f19679c = inputMethodManager;
    }

    public final void run() {
        this.f19678b.clearFocus();
        this.f19678b.requestFocus();
        this.f19679c.showSoftInput(this.f19678b, 0);
    }
}
